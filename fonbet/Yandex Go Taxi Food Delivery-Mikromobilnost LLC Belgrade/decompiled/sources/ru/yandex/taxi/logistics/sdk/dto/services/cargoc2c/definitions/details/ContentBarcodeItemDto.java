package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.details;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u000bHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\rHÆ\u0003JW\u0010#\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\n\u001a\u00020\u000b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006*"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentBarcodeItemDto;", "", "id", "", "barcodeType", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/BarcodeTypeDto;", "barcode", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/BarcodeDataDto;", "subtitle", "trailImageTag", "orientation", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/BarcodeOrientationDto;", "action", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/PayloadDto;", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/BarcodeTypeDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/BarcodeDataDto;Ljava/lang/String;Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/BarcodeOrientationDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/PayloadDto;)V", "getId", "()Ljava/lang/String;", "getBarcodeType", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/BarcodeTypeDto;", "getBarcode", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/BarcodeDataDto;", "getSubtitle", "getTrailImageTag", "getOrientation", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/BarcodeOrientationDto;", "getAction", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/PayloadDto;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ContentBarcodeItemDto {
    private final PayloadDto action;
    private final BarcodeDataDto barcode;
    private final BarcodeTypeDto barcodeType;
    private final String id;
    private final BarcodeOrientationDto orientation;
    private final String subtitle;
    private final String trailImageTag;

    public ContentBarcodeItemDto(@Json(name = "id") String str, @Json(name = "barcode_type") BarcodeTypeDto barcodeTypeDto, @Json(name = "barcode") BarcodeDataDto barcodeDataDto, @Json(name = "subtitle") String str2, @Json(name = "trail_image_tag") String str3, @Json(name = "orientation") BarcodeOrientationDto barcodeOrientationDto, @Json(name = "action") PayloadDto payloadDto) {
        this.id = str;
        this.barcodeType = barcodeTypeDto;
        this.barcode = barcodeDataDto;
        this.subtitle = str2;
        this.trailImageTag = str3;
        this.orientation = barcodeOrientationDto;
        this.action = payloadDto;
    }

    public static /* synthetic */ ContentBarcodeItemDto copy$default(ContentBarcodeItemDto contentBarcodeItemDto, String str, BarcodeTypeDto barcodeTypeDto, BarcodeDataDto barcodeDataDto, String str2, String str3, BarcodeOrientationDto barcodeOrientationDto, PayloadDto payloadDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = contentBarcodeItemDto.id;
        }
        if ((i & 2) != 0) {
            barcodeTypeDto = contentBarcodeItemDto.barcodeType;
        }
        if ((i & 4) != 0) {
            barcodeDataDto = contentBarcodeItemDto.barcode;
        }
        if ((i & 8) != 0) {
            str2 = contentBarcodeItemDto.subtitle;
        }
        if ((i & 16) != 0) {
            str3 = contentBarcodeItemDto.trailImageTag;
        }
        if ((i & 32) != 0) {
            barcodeOrientationDto = contentBarcodeItemDto.orientation;
        }
        if ((i & 64) != 0) {
            payloadDto = contentBarcodeItemDto.action;
        }
        BarcodeOrientationDto barcodeOrientationDto2 = barcodeOrientationDto;
        PayloadDto payloadDto2 = payloadDto;
        String str4 = str3;
        BarcodeDataDto barcodeDataDto2 = barcodeDataDto;
        return contentBarcodeItemDto.copy(str, barcodeTypeDto, barcodeDataDto2, str2, str4, barcodeOrientationDto2, payloadDto2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final BarcodeTypeDto getBarcodeType() {
        return this.barcodeType;
    }

    /* renamed from: component3, reason: from getter */
    public final BarcodeDataDto getBarcode() {
        return this.barcode;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component5, reason: from getter */
    public final String getTrailImageTag() {
        return this.trailImageTag;
    }

    /* renamed from: component6, reason: from getter */
    public final BarcodeOrientationDto getOrientation() {
        return this.orientation;
    }

    /* renamed from: component7, reason: from getter */
    public final PayloadDto getAction() {
        return this.action;
    }

    public final ContentBarcodeItemDto copy(@Json(name = "id") String id, @Json(name = "barcode_type") BarcodeTypeDto barcodeType, @Json(name = "barcode") BarcodeDataDto barcode, @Json(name = "subtitle") String subtitle, @Json(name = "trail_image_tag") String trailImageTag, @Json(name = "orientation") BarcodeOrientationDto orientation, @Json(name = "action") PayloadDto action) {
        return new ContentBarcodeItemDto(id, barcodeType, barcode, subtitle, trailImageTag, orientation, action);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContentBarcodeItemDto)) {
            return false;
        }
        ContentBarcodeItemDto contentBarcodeItemDto = (ContentBarcodeItemDto) other;
        return jl40.l(this.id, contentBarcodeItemDto.id) && this.barcodeType == contentBarcodeItemDto.barcodeType && jl40.l(this.barcode, contentBarcodeItemDto.barcode) && jl40.l(this.subtitle, contentBarcodeItemDto.subtitle) && jl40.l(this.trailImageTag, contentBarcodeItemDto.trailImageTag) && this.orientation == contentBarcodeItemDto.orientation && jl40.l(this.action, contentBarcodeItemDto.action);
    }

    public final PayloadDto getAction() {
        return this.action;
    }

    public final BarcodeDataDto getBarcode() {
        return this.barcode;
    }

    public final BarcodeTypeDto getBarcodeType() {
        return this.barcodeType;
    }

    public final String getId() {
        return this.id;
    }

    public final BarcodeOrientationDto getOrientation() {
        return this.orientation;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTrailImageTag() {
        return this.trailImageTag;
    }

    public int hashCode() {
        int hashCode = this.id.hashCode() * 31;
        BarcodeTypeDto barcodeTypeDto = this.barcodeType;
        int hashCode2 = (this.barcode.hashCode() + ((hashCode + (barcodeTypeDto == null ? 0 : barcodeTypeDto.hashCode())) * 31)) * 31;
        String str = this.subtitle;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.trailImageTag;
        int hashCode4 = (this.orientation.hashCode() + ((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        PayloadDto payloadDto = this.action;
        return hashCode4 + (payloadDto != null ? payloadDto.hashCode() : 0);
    }

    public String toString() {
        return "ContentBarcodeItemDto(id=" + this.id + ", barcodeType=" + this.barcodeType + ", barcode=" + this.barcode + ", subtitle=" + this.subtitle + ", trailImageTag=" + this.trailImageTag + ", orientation=" + this.orientation + ", action=" + this.action + Extension.C_BRAKE;
    }
}
