package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.details;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/DetailsSectionItemTextDto;", "", "imageTag", "", "firstLine", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/DetailsSectionItemStringDto;", "secondLine", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/DetailsSectionItemStringDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/DetailsSectionItemStringDto;)V", "getImageTag", "()Ljava/lang/String;", "getFirstLine", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/DetailsSectionItemStringDto;", "getSecondLine", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class DetailsSectionItemTextDto {
    private final DetailsSectionItemStringDto firstLine;
    private final String imageTag;
    private final DetailsSectionItemStringDto secondLine;

    public DetailsSectionItemTextDto(@Json(name = "image_tag") String str, @Json(name = "first_line") DetailsSectionItemStringDto detailsSectionItemStringDto, @Json(name = "second_line") DetailsSectionItemStringDto detailsSectionItemStringDto2) {
        this.imageTag = str;
        this.firstLine = detailsSectionItemStringDto;
        this.secondLine = detailsSectionItemStringDto2;
    }

    public static /* synthetic */ DetailsSectionItemTextDto copy$default(DetailsSectionItemTextDto detailsSectionItemTextDto, String str, DetailsSectionItemStringDto detailsSectionItemStringDto, DetailsSectionItemStringDto detailsSectionItemStringDto2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = detailsSectionItemTextDto.imageTag;
        }
        if ((i & 2) != 0) {
            detailsSectionItemStringDto = detailsSectionItemTextDto.firstLine;
        }
        if ((i & 4) != 0) {
            detailsSectionItemStringDto2 = detailsSectionItemTextDto.secondLine;
        }
        return detailsSectionItemTextDto.copy(str, detailsSectionItemStringDto, detailsSectionItemStringDto2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getImageTag() {
        return this.imageTag;
    }

    /* renamed from: component2, reason: from getter */
    public final DetailsSectionItemStringDto getFirstLine() {
        return this.firstLine;
    }

    /* renamed from: component3, reason: from getter */
    public final DetailsSectionItemStringDto getSecondLine() {
        return this.secondLine;
    }

    public final DetailsSectionItemTextDto copy(@Json(name = "image_tag") String imageTag, @Json(name = "first_line") DetailsSectionItemStringDto firstLine, @Json(name = "second_line") DetailsSectionItemStringDto secondLine) {
        return new DetailsSectionItemTextDto(imageTag, firstLine, secondLine);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DetailsSectionItemTextDto)) {
            return false;
        }
        DetailsSectionItemTextDto detailsSectionItemTextDto = (DetailsSectionItemTextDto) other;
        return jl40.l(this.imageTag, detailsSectionItemTextDto.imageTag) && jl40.l(this.firstLine, detailsSectionItemTextDto.firstLine) && jl40.l(this.secondLine, detailsSectionItemTextDto.secondLine);
    }

    public final DetailsSectionItemStringDto getFirstLine() {
        return this.firstLine;
    }

    public final String getImageTag() {
        return this.imageTag;
    }

    public final DetailsSectionItemStringDto getSecondLine() {
        return this.secondLine;
    }

    public int hashCode() {
        String str = this.imageTag;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        DetailsSectionItemStringDto detailsSectionItemStringDto = this.firstLine;
        int hashCode2 = (hashCode + (detailsSectionItemStringDto == null ? 0 : detailsSectionItemStringDto.hashCode())) * 31;
        DetailsSectionItemStringDto detailsSectionItemStringDto2 = this.secondLine;
        return hashCode2 + (detailsSectionItemStringDto2 != null ? detailsSectionItemStringDto2.hashCode() : 0);
    }

    public String toString() {
        return "DetailsSectionItemTextDto(imageTag=" + this.imageTag + ", firstLine=" + this.firstLine + ", secondLine=" + this.secondLine + Extension.C_BRAKE;
    }
}
