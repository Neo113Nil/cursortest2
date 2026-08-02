package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0017"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/LottieAnimationDto;", "", "url", "", "width", "", "height", "<init>", "(Ljava/lang/String;II)V", "getUrl", "()Ljava/lang/String;", "getWidth", "()I", "getHeight", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class LottieAnimationDto {
    private final int height;
    private final String url;
    private final int width;

    public LottieAnimationDto(@Json(name = "url") String str, @Json(name = "width") int i, @Json(name = "height") int i2) {
        this.url = str;
        this.width = i;
        this.height = i2;
    }

    public static /* synthetic */ LottieAnimationDto copy$default(LottieAnimationDto lottieAnimationDto, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = lottieAnimationDto.url;
        }
        if ((i3 & 2) != 0) {
            i = lottieAnimationDto.width;
        }
        if ((i3 & 4) != 0) {
            i2 = lottieAnimationDto.height;
        }
        return lottieAnimationDto.copy(str, i, i2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: component2, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* renamed from: component3, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    public final LottieAnimationDto copy(@Json(name = "url") String url, @Json(name = "width") int width, @Json(name = "height") int height) {
        return new LottieAnimationDto(url, width, height);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LottieAnimationDto)) {
            return false;
        }
        LottieAnimationDto lottieAnimationDto = (LottieAnimationDto) other;
        return jl40.l(this.url, lottieAnimationDto.url) && this.width == lottieAnimationDto.width && this.height == lottieAnimationDto.height;
    }

    public final int getHeight() {
        return this.height;
    }

    public final String getUrl() {
        return this.url;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return Integer.hashCode(this.height) + oyr.b(this.width, this.url.hashCode() * 31, 31);
    }

    public String toString() {
        String str = this.url;
        return oyr.m(this.height, Extension.C_BRAKE, b64.u(this.width, "LottieAnimationDto(url=", str, ", width=", ", height="));
    }
}
