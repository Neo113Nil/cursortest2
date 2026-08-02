package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateorderingcontrol;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0001\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\"\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u000fHÆ\u0003Jc\u0010&\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0010\b\u0003\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020-HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006."}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateorderingcontrol/DetailFormLayoutDto;", "", "header", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateorderingcontrol/DetailFormHeaderLayoutDto;", "source", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateorderingcontrol/DetailFormRoutePointLayoutDto;", "destination", "extraFields", "", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateorderingcontrol/DetailFormRoutePointFieldLayoutDto;", "button", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateorderingcontrol/DetailFormButtonLayoutDto;", "photocomments", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateorderingcontrol/PhotocommentsConfigDto;", "verticalBar", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateorderingcontrol/VerticalBarDto;", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateorderingcontrol/DetailFormHeaderLayoutDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateorderingcontrol/DetailFormRoutePointLayoutDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateorderingcontrol/DetailFormRoutePointLayoutDto;Ljava/util/List;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateorderingcontrol/DetailFormButtonLayoutDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateorderingcontrol/PhotocommentsConfigDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateorderingcontrol/VerticalBarDto;)V", "getHeader", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateorderingcontrol/DetailFormHeaderLayoutDto;", "getSource", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateorderingcontrol/DetailFormRoutePointLayoutDto;", "getDestination", "getExtraFields", "()Ljava/util/List;", "getButton", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateorderingcontrol/DetailFormButtonLayoutDto;", "getPhotocomments", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateorderingcontrol/PhotocommentsConfigDto;", "getVerticalBar", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateorderingcontrol/VerticalBarDto;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class DetailFormLayoutDto {
    private final DetailFormButtonLayoutDto button;
    private final DetailFormRoutePointLayoutDto destination;
    private final List<DetailFormRoutePointFieldLayoutDto> extraFields;
    private final DetailFormHeaderLayoutDto header;
    private final PhotocommentsConfigDto photocomments;
    private final DetailFormRoutePointLayoutDto source;
    private final VerticalBarDto verticalBar;

    /* JADX WARN: Multi-variable type inference failed */
    public DetailFormLayoutDto(@Json(name = "header") DetailFormHeaderLayoutDto detailFormHeaderLayoutDto, @Json(name = "source") DetailFormRoutePointLayoutDto detailFormRoutePointLayoutDto, @Json(name = "destination") DetailFormRoutePointLayoutDto detailFormRoutePointLayoutDto2, @Json(name = "extra_fields") List<? extends DetailFormRoutePointFieldLayoutDto> list, @Json(name = "button") DetailFormButtonLayoutDto detailFormButtonLayoutDto, @Json(name = "photocomments") PhotocommentsConfigDto photocommentsConfigDto, @Json(name = "vertical_bar") VerticalBarDto verticalBarDto) {
        this.header = detailFormHeaderLayoutDto;
        this.source = detailFormRoutePointLayoutDto;
        this.destination = detailFormRoutePointLayoutDto2;
        this.extraFields = list;
        this.button = detailFormButtonLayoutDto;
        this.photocomments = photocommentsConfigDto;
        this.verticalBar = verticalBarDto;
    }

    public static /* synthetic */ DetailFormLayoutDto copy$default(DetailFormLayoutDto detailFormLayoutDto, DetailFormHeaderLayoutDto detailFormHeaderLayoutDto, DetailFormRoutePointLayoutDto detailFormRoutePointLayoutDto, DetailFormRoutePointLayoutDto detailFormRoutePointLayoutDto2, List list, DetailFormButtonLayoutDto detailFormButtonLayoutDto, PhotocommentsConfigDto photocommentsConfigDto, VerticalBarDto verticalBarDto, int i, Object obj) {
        if ((i & 1) != 0) {
            detailFormHeaderLayoutDto = detailFormLayoutDto.header;
        }
        if ((i & 2) != 0) {
            detailFormRoutePointLayoutDto = detailFormLayoutDto.source;
        }
        if ((i & 4) != 0) {
            detailFormRoutePointLayoutDto2 = detailFormLayoutDto.destination;
        }
        if ((i & 8) != 0) {
            list = detailFormLayoutDto.extraFields;
        }
        if ((i & 16) != 0) {
            detailFormButtonLayoutDto = detailFormLayoutDto.button;
        }
        if ((i & 32) != 0) {
            photocommentsConfigDto = detailFormLayoutDto.photocomments;
        }
        if ((i & 64) != 0) {
            verticalBarDto = detailFormLayoutDto.verticalBar;
        }
        PhotocommentsConfigDto photocommentsConfigDto2 = photocommentsConfigDto;
        VerticalBarDto verticalBarDto2 = verticalBarDto;
        DetailFormButtonLayoutDto detailFormButtonLayoutDto2 = detailFormButtonLayoutDto;
        DetailFormRoutePointLayoutDto detailFormRoutePointLayoutDto3 = detailFormRoutePointLayoutDto2;
        return detailFormLayoutDto.copy(detailFormHeaderLayoutDto, detailFormRoutePointLayoutDto, detailFormRoutePointLayoutDto3, list, detailFormButtonLayoutDto2, photocommentsConfigDto2, verticalBarDto2);
    }

    /* renamed from: component1, reason: from getter */
    public final DetailFormHeaderLayoutDto getHeader() {
        return this.header;
    }

    /* renamed from: component2, reason: from getter */
    public final DetailFormRoutePointLayoutDto getSource() {
        return this.source;
    }

    /* renamed from: component3, reason: from getter */
    public final DetailFormRoutePointLayoutDto getDestination() {
        return this.destination;
    }

    public final List<DetailFormRoutePointFieldLayoutDto> component4() {
        return this.extraFields;
    }

    /* renamed from: component5, reason: from getter */
    public final DetailFormButtonLayoutDto getButton() {
        return this.button;
    }

    /* renamed from: component6, reason: from getter */
    public final PhotocommentsConfigDto getPhotocomments() {
        return this.photocomments;
    }

    /* renamed from: component7, reason: from getter */
    public final VerticalBarDto getVerticalBar() {
        return this.verticalBar;
    }

    public final DetailFormLayoutDto copy(@Json(name = "header") DetailFormHeaderLayoutDto header, @Json(name = "source") DetailFormRoutePointLayoutDto source, @Json(name = "destination") DetailFormRoutePointLayoutDto destination, @Json(name = "extra_fields") List<? extends DetailFormRoutePointFieldLayoutDto> extraFields, @Json(name = "button") DetailFormButtonLayoutDto button, @Json(name = "photocomments") PhotocommentsConfigDto photocomments, @Json(name = "vertical_bar") VerticalBarDto verticalBar) {
        return new DetailFormLayoutDto(header, source, destination, extraFields, button, photocomments, verticalBar);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DetailFormLayoutDto)) {
            return false;
        }
        DetailFormLayoutDto detailFormLayoutDto = (DetailFormLayoutDto) other;
        return jl40.l(this.header, detailFormLayoutDto.header) && jl40.l(this.source, detailFormLayoutDto.source) && jl40.l(this.destination, detailFormLayoutDto.destination) && jl40.l(this.extraFields, detailFormLayoutDto.extraFields) && jl40.l(this.button, detailFormLayoutDto.button) && jl40.l(this.photocomments, detailFormLayoutDto.photocomments) && jl40.l(this.verticalBar, detailFormLayoutDto.verticalBar);
    }

    public final DetailFormButtonLayoutDto getButton() {
        return this.button;
    }

    public final DetailFormRoutePointLayoutDto getDestination() {
        return this.destination;
    }

    public final List<DetailFormRoutePointFieldLayoutDto> getExtraFields() {
        return this.extraFields;
    }

    public final DetailFormHeaderLayoutDto getHeader() {
        return this.header;
    }

    public final PhotocommentsConfigDto getPhotocomments() {
        return this.photocomments;
    }

    public final DetailFormRoutePointLayoutDto getSource() {
        return this.source;
    }

    public final VerticalBarDto getVerticalBar() {
        return this.verticalBar;
    }

    public int hashCode() {
        DetailFormHeaderLayoutDto detailFormHeaderLayoutDto = this.header;
        int hashCode = (detailFormHeaderLayoutDto == null ? 0 : detailFormHeaderLayoutDto.hashCode()) * 31;
        DetailFormRoutePointLayoutDto detailFormRoutePointLayoutDto = this.source;
        int hashCode2 = (hashCode + (detailFormRoutePointLayoutDto == null ? 0 : detailFormRoutePointLayoutDto.hashCode())) * 31;
        DetailFormRoutePointLayoutDto detailFormRoutePointLayoutDto2 = this.destination;
        int hashCode3 = (hashCode2 + (detailFormRoutePointLayoutDto2 == null ? 0 : detailFormRoutePointLayoutDto2.hashCode())) * 31;
        List<DetailFormRoutePointFieldLayoutDto> list = this.extraFields;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        DetailFormButtonLayoutDto detailFormButtonLayoutDto = this.button;
        int hashCode5 = (hashCode4 + (detailFormButtonLayoutDto == null ? 0 : detailFormButtonLayoutDto.hashCode())) * 31;
        PhotocommentsConfigDto photocommentsConfigDto = this.photocomments;
        int hashCode6 = (hashCode5 + (photocommentsConfigDto == null ? 0 : photocommentsConfigDto.hashCode())) * 31;
        VerticalBarDto verticalBarDto = this.verticalBar;
        return hashCode6 + (verticalBarDto != null ? verticalBarDto.hashCode() : 0);
    }

    public String toString() {
        return "DetailFormLayoutDto(header=" + this.header + ", source=" + this.source + ", destination=" + this.destination + ", extraFields=" + this.extraFields + ", button=" + this.button + ", photocomments=" + this.photocomments + ", verticalBar=" + this.verticalBar + Extension.C_BRAKE;
    }
}
