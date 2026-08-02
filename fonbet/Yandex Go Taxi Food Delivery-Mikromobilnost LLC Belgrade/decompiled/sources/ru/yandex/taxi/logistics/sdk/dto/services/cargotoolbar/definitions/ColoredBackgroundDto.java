package ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ColoredBackgroundDto;", "", "color", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ColorDto;", "rippleColor", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ColorDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ColorDto;)V", "getColor", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ColorDto;", "getRippleColor", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ColoredBackgroundDto {
    private final ColorDto color;
    private final ColorDto rippleColor;

    public ColoredBackgroundDto(@Json(name = "color") ColorDto colorDto, @Json(name = "ripple_color") ColorDto colorDto2) {
        this.color = colorDto;
        this.rippleColor = colorDto2;
    }

    public static /* synthetic */ ColoredBackgroundDto copy$default(ColoredBackgroundDto coloredBackgroundDto, ColorDto colorDto, ColorDto colorDto2, int i, Object obj) {
        if ((i & 1) != 0) {
            colorDto = coloredBackgroundDto.color;
        }
        if ((i & 2) != 0) {
            colorDto2 = coloredBackgroundDto.rippleColor;
        }
        return coloredBackgroundDto.copy(colorDto, colorDto2);
    }

    /* renamed from: component1, reason: from getter */
    public final ColorDto getColor() {
        return this.color;
    }

    /* renamed from: component2, reason: from getter */
    public final ColorDto getRippleColor() {
        return this.rippleColor;
    }

    public final ColoredBackgroundDto copy(@Json(name = "color") ColorDto color, @Json(name = "ripple_color") ColorDto rippleColor) {
        return new ColoredBackgroundDto(color, rippleColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ColoredBackgroundDto)) {
            return false;
        }
        ColoredBackgroundDto coloredBackgroundDto = (ColoredBackgroundDto) other;
        return jl40.l(this.color, coloredBackgroundDto.color) && jl40.l(this.rippleColor, coloredBackgroundDto.rippleColor);
    }

    public final ColorDto getColor() {
        return this.color;
    }

    public final ColorDto getRippleColor() {
        return this.rippleColor;
    }

    public int hashCode() {
        int hashCode = this.color.hashCode() * 31;
        ColorDto colorDto = this.rippleColor;
        return hashCode + (colorDto == null ? 0 : colorDto.hashCode());
    }

    public String toString() {
        return "ColoredBackgroundDto(color=" + this.color + ", rippleColor=" + this.rippleColor + Extension.C_BRAKE;
    }
}
