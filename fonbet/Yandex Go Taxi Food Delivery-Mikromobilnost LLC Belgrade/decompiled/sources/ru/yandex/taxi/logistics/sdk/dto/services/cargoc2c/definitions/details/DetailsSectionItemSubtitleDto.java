package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.details;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003J9\u0010\u0014\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/DetailsSectionItemSubtitleDto;", "", "title", "", "subtitle", "imageTag", "trailPayload", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/PayloadDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/PayloadDto;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getImageTag", "getTrailPayload", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/PayloadDto;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class DetailsSectionItemSubtitleDto {
    private final String imageTag;
    private final String subtitle;
    private final String title;
    private final PayloadDto trailPayload;

    public DetailsSectionItemSubtitleDto(@Json(name = "title") String str, @Json(name = "subtitle") String str2, @Json(name = "image_tag") String str3, @Json(name = "trail_payload") PayloadDto payloadDto) {
        this.title = str;
        this.subtitle = str2;
        this.imageTag = str3;
        this.trailPayload = payloadDto;
    }

    public static /* synthetic */ DetailsSectionItemSubtitleDto copy$default(DetailsSectionItemSubtitleDto detailsSectionItemSubtitleDto, String str, String str2, String str3, PayloadDto payloadDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = detailsSectionItemSubtitleDto.title;
        }
        if ((i & 2) != 0) {
            str2 = detailsSectionItemSubtitleDto.subtitle;
        }
        if ((i & 4) != 0) {
            str3 = detailsSectionItemSubtitleDto.imageTag;
        }
        if ((i & 8) != 0) {
            payloadDto = detailsSectionItemSubtitleDto.trailPayload;
        }
        return detailsSectionItemSubtitleDto.copy(str, str2, str3, payloadDto);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component3, reason: from getter */
    public final String getImageTag() {
        return this.imageTag;
    }

    /* renamed from: component4, reason: from getter */
    public final PayloadDto getTrailPayload() {
        return this.trailPayload;
    }

    public final DetailsSectionItemSubtitleDto copy(@Json(name = "title") String title, @Json(name = "subtitle") String subtitle, @Json(name = "image_tag") String imageTag, @Json(name = "trail_payload") PayloadDto trailPayload) {
        return new DetailsSectionItemSubtitleDto(title, subtitle, imageTag, trailPayload);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DetailsSectionItemSubtitleDto)) {
            return false;
        }
        DetailsSectionItemSubtitleDto detailsSectionItemSubtitleDto = (DetailsSectionItemSubtitleDto) other;
        return jl40.l(this.title, detailsSectionItemSubtitleDto.title) && jl40.l(this.subtitle, detailsSectionItemSubtitleDto.subtitle) && jl40.l(this.imageTag, detailsSectionItemSubtitleDto.imageTag) && jl40.l(this.trailPayload, detailsSectionItemSubtitleDto.trailPayload);
    }

    public final String getImageTag() {
        return this.imageTag;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final PayloadDto getTrailPayload() {
        return this.trailPayload;
    }

    public int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.subtitle;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.imageTag;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        PayloadDto payloadDto = this.trailPayload;
        return hashCode3 + (payloadDto != null ? payloadDto.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        String str3 = this.imageTag;
        PayloadDto payloadDto = this.trailPayload;
        StringBuilder v = b64.v("DetailsSectionItemSubtitleDto(title=", str, ", subtitle=", str2, ", imageTag=");
        v.append(str3);
        v.append(", trailPayload=");
        v.append(payloadDto);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
