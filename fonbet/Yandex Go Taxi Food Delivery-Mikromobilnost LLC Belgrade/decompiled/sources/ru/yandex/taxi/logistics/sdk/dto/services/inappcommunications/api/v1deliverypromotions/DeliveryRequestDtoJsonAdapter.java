package ru.yandex.taxi.logistics.sdk.dto.services.inappcommunications.api.v1deliverypromotions;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.CoordinateDto;
import ru.yandex.taxi.logistics.sdk.dto.services.inappcommunications.api.v1deliverypromotions.DeliveryRequestDto;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/inappcommunications/api/v1deliverypromotions/DeliveryRequestDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/inappcommunications/api/v1deliverypromotions/DeliveryRequestDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lru/yandex/taxi/logistics/sdk/dto/services/inappcommunications/api/v1deliverypromotions/DeliveryRequestDto$ScreenDto;", "screenDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/CoordinateDto;", "nullableCoordinateDtoAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DeliveryRequestDtoJsonAdapter extends JsonAdapter<DeliveryRequestDto> {
    private final JsonAdapter<CoordinateDto> nullableCoordinateDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of(MetaDataField.SCREEN_FIELD, "coordinate");
    private final JsonAdapter<DeliveryRequestDto.ScreenDto> screenDtoAdapter;

    public DeliveryRequestDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.screenDtoAdapter = moshi.adapter(DeliveryRequestDto.ScreenDto.class, emptySet, MetaDataField.SCREEN_FIELD);
        this.nullableCoordinateDtoAdapter = moshi.adapter(CoordinateDto.class, emptySet, "coordinate");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final DeliveryRequestDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        DeliveryRequestDto.ScreenDto screenDto = null;
        CoordinateDto coordinateDto = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                screenDto = this.screenDtoAdapter.fromJson(jsonReader);
                if (screenDto == null) {
                    throw Util.unexpectedNull(MetaDataField.SCREEN_FIELD, MetaDataField.SCREEN_FIELD, jsonReader);
                }
            } else if (selectName == 1) {
                coordinateDto = this.nullableCoordinateDtoAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (screenDto != null) {
            return new DeliveryRequestDto(screenDto, coordinateDto);
        }
        throw Util.missingProperty(MetaDataField.SCREEN_FIELD, MetaDataField.SCREEN_FIELD, jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, DeliveryRequestDto deliveryRequestDto) {
        DeliveryRequestDto deliveryRequestDto2 = deliveryRequestDto;
        if (deliveryRequestDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name(MetaDataField.SCREEN_FIELD);
        this.screenDtoAdapter.toJson(jsonWriter, (JsonWriter) deliveryRequestDto2.getScreen());
        jsonWriter.name("coordinate");
        this.nullableCoordinateDtoAdapter.toJson(jsonWriter, (JsonWriter) deliveryRequestDto2.getCoordinate());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(40, "GeneratedJsonAdapter(DeliveryRequestDto)");
    }
}
