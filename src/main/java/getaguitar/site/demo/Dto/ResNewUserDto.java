package getaguitar.site.demo.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ResNewUserDto {
    private String id;
    private int x;
    private int y;
    private String direction;
}