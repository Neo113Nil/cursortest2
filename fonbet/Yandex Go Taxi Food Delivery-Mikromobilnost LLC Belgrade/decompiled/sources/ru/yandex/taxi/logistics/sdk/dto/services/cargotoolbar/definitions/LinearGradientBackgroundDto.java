package ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/LinearGradientBackgroundDto;", "", "gradientDay", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/LinearGradientDto;", "gradientNight", "rippleColor", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ColorDto;", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/LinearGradientDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/LinearGradientDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ColorDto;)V", "getGradientDay", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/LinearGradientDto;", "getGradientNight", "getRippleColor", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ColorDto;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class LinearGradientBackgroundDto {
    private final LinearGradientDto gradientDay;
    private final LinearGradientDto gradientNight;
    private final ColorDto rippleColor;

    public LinearGradientBackgroundDto(@Json(name = "gradient_day") LinearGradientDto linearGradientDto, @Json(name = "gradient_night") LinearGradientDto linearGradientDto2, @Json(name = "ripple_color") ColorDto colorDto) {
        this.gradientDay = linearGradientDto;
        this.gradientNight = linearGradientDto2;
        this.rippleColor = colorDto;
    }

    public static /* synthetic */ LinearGradientBackgroundDto copy$default(LinearGradientBackgroundDto linearGradientBackgroundDto, LinearGradientDto linearGradientDto, LinearGradientDto linearGradientDto2, ColorDto colorDto, int i, Object obj) {
        if ((i & 1) != 0) {
            linearGradientDto = linearGradientBackgroundDto.gradientDay;
        }
        if ((i & 2) != 0) {
            linearGradientDto2 = linearGradientBackgroundDto.gradientNight;
        }
        if ((i & 4) != 0) {
            colorDto = linearGradientBackgroundDto.rippleColor;
        }
        return linearGradientBackgroundDto.copy(linearGradientDto, linearGradientDto2, colorDto);
    }

    /* renamed from: component1, reason: from getter */
    public final LinearGradientDto getGradientDay() {
        return this.gradientDay;
    }

    /* renamed from: component2, reason: from getter */
    public final LinearGradientDto getGradientNight() {
        return this.gradientNight;
    }

    /* renamed from: component3, reason: from getter */
    public final ColorDto getRippleColor() {
        return this.rippleColor;
    }

    public final LinearGradientBackgroundDto copy(@Json(name = "gradient_day") LinearGradientDto gradientDay, @Json(name = "gradient_night") LinearGradientDto gradientNight, @Json(name = "ripple_color") ColorDto rippleColor) {
        return new LinearGradientBackgroundDto(gradientDay, gradientNight, rippleColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LinearGradientBackgroundDto)) {
            return false;
        }
        LinearGradientBackgroundDto linearGradientBackgroundDto = (LinearGradientBackgroundDto) other;
        return jl40.l(this.gradientDay, linearGradientBackgroundDto.gradientDay) && jl40.l(this.gradientNight, linearGradientBackgroundDto.gradientNight) && jl40.l(this.rippleColor, linearGradientBackgroundDto.rippleColor);
    }

    public final LinearGradientDto getGradientDay() {
        return this.gradientDay;
    }

    public final LinearGradientDto getGradientNight() {
        return this.gradientNight;
    }

    public final ColorDto getRippleColor() {
        return this.rippleColor;
    }

    public int hashCode() {
        int hashCode = (this.gradientNight.hashCode() + (this.gradientDay.hashCode() * 31)) * 31;
        ColorDto colorDto = this.rippleColor;
        return hashCode + (colorDto == null ? 0 : colorDto.hashCode());
    }

    public String toString() {
        return "LinearGradientBackgroundDto(gradientDay=" + this.gradientDay + ", gradientNight=" + this.gradientNight + ", rippleColor=" + this.rippleColor + Extension.C_BRAKE;
    }
}
