package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ImageDto;", "", "imageTag", "", "url", "tintColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getImageTag", "()Ljava/lang/String;", "getUrl", "getTintColor", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ImageDto {
    private final String imageTag;
    private final String tintColor;
    private final String url;

    public ImageDto(@Json(name = "image_tag") String str, @Json(name = "url") String str2, @Json(name = "tint_color") String str3) {
        this.imageTag = str;
        this.url = str2;
        this.tintColor = str3;
    }

    public static /* synthetic */ ImageDto copy$default(ImageDto imageDto, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = imageDto.imageTag;
        }
        if ((i & 2) != 0) {
            str2 = imageDto.url;
        }
        if ((i & 4) != 0) {
            str3 = imageDto.tintColor;
        }
        return imageDto.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getImageTag() {
        return this.imageTag;
    }

    /* renamed from: component2, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTintColor() {
        return this.tintColor;
    }

    public final ImageDto copy(@Json(name = "image_tag") String imageTag, @Json(name = "url") String url, @Json(name = "tint_color") String tintColor) {
        return new ImageDto(imageTag, url, tintColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImageDto)) {
            return false;
        }
        ImageDto imageDto = (ImageDto) other;
        return jl40.l(this.imageTag, imageDto.imageTag) && jl40.l(this.url, imageDto.url) && jl40.l(this.tintColor, imageDto.tintColor);
    }

    public final String getImageTag() {
        return this.imageTag;
    }

    public final String getTintColor() {
        return this.tintColor;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        String str = this.imageTag;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.url;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.tintColor;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.imageTag;
        String str2 = this.url;
        return oyr.t(b64.v("ImageDto(imageTag=", str, ", url=", str2, ", tintColor="), this.tintColor, Extension.C_BRAKE);
    }
}
