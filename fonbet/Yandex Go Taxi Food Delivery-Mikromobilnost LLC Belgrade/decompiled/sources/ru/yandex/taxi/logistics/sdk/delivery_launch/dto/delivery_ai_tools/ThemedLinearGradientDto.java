package ru.yandex.taxi.logistics.sdk.delivery_launch.dto.delivery_ai_tools;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_ai_tools/ThemedLinearGradientDto;", "", "default", "Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_ai_tools/LinearGradientDto;", "dark", "<init>", "(Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_ai_tools/LinearGradientDto;Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_ai_tools/LinearGradientDto;)V", "getDefault", "()Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_ai_tools/LinearGradientDto;", "getDark", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "sdk-delivery-launch"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ThemedLinearGradientDto {
    private final LinearGradientDto dark;
    private final LinearGradientDto default;

    public ThemedLinearGradientDto(@Json(name = "default") LinearGradientDto linearGradientDto, @Json(name = "dark") LinearGradientDto linearGradientDto2) {
        this.default = linearGradientDto;
        this.dark = linearGradientDto2;
    }

    public static /* synthetic */ ThemedLinearGradientDto copy$default(ThemedLinearGradientDto themedLinearGradientDto, LinearGradientDto linearGradientDto, LinearGradientDto linearGradientDto2, int i, Object obj) {
        if ((i & 1) != 0) {
            linearGradientDto = themedLinearGradientDto.default;
        }
        if ((i & 2) != 0) {
            linearGradientDto2 = themedLinearGradientDto.dark;
        }
        return themedLinearGradientDto.copy(linearGradientDto, linearGradientDto2);
    }

    /* renamed from: component1, reason: from getter */
    public final LinearGradientDto getDefault() {
        return this.default;
    }

    /* renamed from: component2, reason: from getter */
    public final LinearGradientDto getDark() {
        return this.dark;
    }

    public final ThemedLinearGradientDto copy(@Json(name = "default") LinearGradientDto r1, @Json(name = "dark") LinearGradientDto dark) {
        return new ThemedLinearGradientDto(r1, dark);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ThemedLinearGradientDto)) {
            return false;
        }
        ThemedLinearGradientDto themedLinearGradientDto = (ThemedLinearGradientDto) other;
        return jl40.l(this.default, themedLinearGradientDto.default) && jl40.l(this.dark, themedLinearGradientDto.dark);
    }

    public final LinearGradientDto getDark() {
        return this.dark;
    }

    public final LinearGradientDto getDefault() {
        return this.default;
    }

    public int hashCode() {
        int hashCode = this.default.hashCode() * 31;
        LinearGradientDto linearGradientDto = this.dark;
        return hashCode + (linearGradientDto == null ? 0 : linearGradientDto.hashCode());
    }

    public String toString() {
        return "ThemedLinearGradientDto(default=" + this.default + ", dark=" + this.dark + Extension.C_BRAKE;
    }
}
