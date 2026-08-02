package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.details;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/DetailsSectionItemSmallTitleDto;", "", "title", "", "subtitle", "imageTag", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getImageTag", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class DetailsSectionItemSmallTitleDto {
    private final String imageTag;
    private final String subtitle;
    private final String title;

    public DetailsSectionItemSmallTitleDto(@Json(name = "title") String str, @Json(name = "subtitle") String str2, @Json(name = "image_tag") String str3) {
        this.title = str;
        this.subtitle = str2;
        this.imageTag = str3;
    }

    public static /* synthetic */ DetailsSectionItemSmallTitleDto copy$default(DetailsSectionItemSmallTitleDto detailsSectionItemSmallTitleDto, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = detailsSectionItemSmallTitleDto.title;
        }
        if ((i & 2) != 0) {
            str2 = detailsSectionItemSmallTitleDto.subtitle;
        }
        if ((i & 4) != 0) {
            str3 = detailsSectionItemSmallTitleDto.imageTag;
        }
        return detailsSectionItemSmallTitleDto.copy(str, str2, str3);
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

    public final DetailsSectionItemSmallTitleDto copy(@Json(name = "title") String title, @Json(name = "subtitle") String subtitle, @Json(name = "image_tag") String imageTag) {
        return new DetailsSectionItemSmallTitleDto(title, subtitle, imageTag);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DetailsSectionItemSmallTitleDto)) {
            return false;
        }
        DetailsSectionItemSmallTitleDto detailsSectionItemSmallTitleDto = (DetailsSectionItemSmallTitleDto) other;
        return jl40.l(this.title, detailsSectionItemSmallTitleDto.title) && jl40.l(this.subtitle, detailsSectionItemSmallTitleDto.subtitle) && jl40.l(this.imageTag, detailsSectionItemSmallTitleDto.imageTag);
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

    public int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.subtitle;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.imageTag;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        return oyr.t(b64.v("DetailsSectionItemSmallTitleDto(title=", str, ", subtitle=", str2, ", imageTag="), this.imageTag, Extension.C_BRAKE);
    }
}
