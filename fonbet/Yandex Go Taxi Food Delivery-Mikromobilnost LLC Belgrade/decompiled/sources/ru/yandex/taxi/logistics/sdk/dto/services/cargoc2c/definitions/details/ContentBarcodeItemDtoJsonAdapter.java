package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.details;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\f¨\u0006\u0016"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentBarcodeItemDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentBarcodeItemDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/BarcodeTypeDto;", "nullableBarcodeTypeDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/BarcodeDataDto;", "barcodeDataDtoAdapter", "nullableStringAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/BarcodeOrientationDto;", "barcodeOrientationDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/PayloadDto;", "nullablePayloadDtoAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ContentBarcodeItemDtoJsonAdapter extends JsonAdapter<ContentBarcodeItemDto> {
    private final JsonAdapter<BarcodeDataDto> barcodeDataDtoAdapter;
    private final JsonAdapter<BarcodeOrientationDto> barcodeOrientationDtoAdapter;
    private final JsonAdapter<BarcodeTypeDto> nullableBarcodeTypeDtoAdapter;
    private final JsonAdapter<PayloadDto> nullablePayloadDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("id", "barcode_type", "barcode", "subtitle", "trail_image_tag", "orientation", "action");
    private final JsonAdapter<String> stringAdapter;

    public ContentBarcodeItemDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "id");
        this.nullableBarcodeTypeDtoAdapter = moshi.adapter(BarcodeTypeDto.class, emptySet, "barcodeType");
        this.barcodeDataDtoAdapter = moshi.adapter(BarcodeDataDto.class, emptySet, "barcode");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "subtitle");
        this.barcodeOrientationDtoAdapter = moshi.adapter(BarcodeOrientationDto.class, emptySet, "orientation");
        this.nullablePayloadDtoAdapter = moshi.adapter(PayloadDto.class, emptySet, "action");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final ContentBarcodeItemDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        BarcodeTypeDto barcodeTypeDto = null;
        BarcodeDataDto barcodeDataDto = null;
        String str2 = null;
        String str3 = null;
        BarcodeOrientationDto barcodeOrientationDto = null;
        PayloadDto payloadDto = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("id", "id", jsonReader);
                    }
                    break;
                case 1:
                    barcodeTypeDto = this.nullableBarcodeTypeDtoAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    barcodeDataDto = this.barcodeDataDtoAdapter.fromJson(jsonReader);
                    if (barcodeDataDto == null) {
                        throw Util.unexpectedNull("barcode", "barcode", jsonReader);
                    }
                    break;
                case 3:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    barcodeOrientationDto = this.barcodeOrientationDtoAdapter.fromJson(jsonReader);
                    if (barcodeOrientationDto == null) {
                        throw Util.unexpectedNull("orientation", "orientation", jsonReader);
                    }
                    break;
                case 6:
                    payloadDto = this.nullablePayloadDtoAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("id", "id", jsonReader);
        }
        if (barcodeDataDto == null) {
            throw Util.missingProperty("barcode", "barcode", jsonReader);
        }
        if (barcodeOrientationDto != null) {
            return new ContentBarcodeItemDto(str, barcodeTypeDto, barcodeDataDto, str2, str3, barcodeOrientationDto, payloadDto);
        }
        throw Util.missingProperty("orientation", "orientation", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, ContentBarcodeItemDto contentBarcodeItemDto) {
        ContentBarcodeItemDto contentBarcodeItemDto2 = contentBarcodeItemDto;
        if (contentBarcodeItemDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) contentBarcodeItemDto2.getId());
        jsonWriter.name("barcode_type");
        this.nullableBarcodeTypeDtoAdapter.toJson(jsonWriter, (JsonWriter) contentBarcodeItemDto2.getBarcodeType());
        jsonWriter.name("barcode");
        this.barcodeDataDtoAdapter.toJson(jsonWriter, (JsonWriter) contentBarcodeItemDto2.getBarcode());
        jsonWriter.name("subtitle");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) contentBarcodeItemDto2.getSubtitle());
        jsonWriter.name("trail_image_tag");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) contentBarcodeItemDto2.getTrailImageTag());
        jsonWriter.name("orientation");
        this.barcodeOrientationDtoAdapter.toJson(jsonWriter, (JsonWriter) contentBarcodeItemDto2.getOrientation());
        jsonWriter.name("action");
        this.nullablePayloadDtoAdapter.toJson(jsonWriter, (JsonWriter) contentBarcodeItemDto2.getAction());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(43, "GeneratedJsonAdapter(ContentBarcodeItemDto)");
    }
}
