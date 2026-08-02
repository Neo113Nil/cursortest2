package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/GradientBackgroundDto;", "", "lightGradient", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/LinearGradientDto;", "darkGradient", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/LinearGradientDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/LinearGradientDto;)V", "getLightGradient", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/LinearGradientDto;", "getDarkGradient", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class GradientBackgroundDto {
    private final LinearGradientDto darkGradient;
    private final LinearGradientDto lightGradient;

    public GradientBackgroundDto(@Json(name = "light_gradient") LinearGradientDto linearGradientDto, @Json(name = "dark_gradient") LinearGradientDto linearGradientDto2) {
        this.lightGradient = linearGradientDto;
        this.darkGradient = linearGradientDto2;
    }

    public static /* synthetic */ GradientBackgroundDto copy$default(GradientBackgroundDto gradientBackgroundDto, LinearGradientDto linearGradientDto, LinearGradientDto linearGradientDto2, int i, Object obj) {
        if ((i & 1) != 0) {
            linearGradientDto = gradientBackgroundDto.lightGradient;
        }
        if ((i & 2) != 0) {
            linearGradientDto2 = gradientBackgroundDto.darkGradient;
        }
        return gradientBackgroundDto.copy(linearGradientDto, linearGradientDto2);
    }

    /* renamed from: component1, reason: from getter */
    public final LinearGradientDto getLightGradient() {
        return this.lightGradient;
    }

    /* renamed from: component2, reason: from getter */
    public final LinearGradientDto getDarkGradient() {
        return this.darkGradient;
    }

    public final GradientBackgroundDto copy(@Json(name = "light_gradient") LinearGradientDto lightGradient, @Json(name = "dark_gradient") LinearGradientDto darkGradient) {
        return new GradientBackgroundDto(lightGradient, darkGradient);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GradientBackgroundDto)) {
            return false;
        }
        GradientBackgroundDto gradientBackgroundDto = (GradientBackgroundDto) other;
        return jl40.l(this.lightGradient, gradientBackgroundDto.lightGradient) && jl40.l(this.darkGradient, gradientBackgroundDto.darkGradient);
    }

    public final LinearGradientDto getDarkGradient() {
        return this.darkGradient;
    }

    public final LinearGradientDto getLightGradient() {
        return this.lightGradient;
    }

    public int hashCode() {
        int hashCode = this.lightGradient.hashCode() * 31;
        LinearGradientDto linearGradientDto = this.darkGradient;
        return hashCode + (linearGradientDto == null ? 0 : linearGradientDto.hashCode());
    }

    public String toString() {
        return "GradientBackgroundDto(lightGradient=" + this.lightGradient + ", darkGradient=" + this.darkGradient + Extension.C_BRAKE;
    }
}
