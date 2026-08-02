package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.handler40cargoc2cv1deliverydraft;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverydraftrequest.AdditionalDeliveryDescriptionForCreationDto;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliverydraft/DeliveryDraftRequestDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliverydraft/DeliveryDraftRequestDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverydraftrequest/AdditionalDeliveryDescriptionForCreationDto;", "additionalDeliveryDescriptionForCreationDtoAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DeliveryDraftRequestDtoJsonAdapter extends JsonAdapter<DeliveryDraftRequestDto> {
    private final JsonAdapter<AdditionalDeliveryDescriptionForCreationDto> additionalDeliveryDescriptionForCreationDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("offer_id", "additional_delivery_description");
    private final JsonAdapter<String> stringAdapter;

    public DeliveryDraftRequestDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "offerId");
        this.additionalDeliveryDescriptionForCreationDtoAdapter = moshi.adapter(AdditionalDeliveryDescriptionForCreationDto.class, emptySet, "additionalDeliveryDescription");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final DeliveryDraftRequestDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        AdditionalDeliveryDescriptionForCreationDto additionalDeliveryDescriptionForCreationDto = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("offerId", "offer_id", jsonReader);
                }
            } else if (selectName == 1 && (additionalDeliveryDescriptionForCreationDto = this.additionalDeliveryDescriptionForCreationDtoAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("additionalDeliveryDescription", "additional_delivery_description", jsonReader);
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("offerId", "offer_id", jsonReader);
        }
        if (additionalDeliveryDescriptionForCreationDto != null) {
            return new DeliveryDraftRequestDto(str, additionalDeliveryDescriptionForCreationDto);
        }
        throw Util.missingProperty("additionalDeliveryDescription", "additional_delivery_description", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, DeliveryDraftRequestDto deliveryDraftRequestDto) {
        DeliveryDraftRequestDto deliveryDraftRequestDto2 = deliveryDraftRequestDto;
        if (deliveryDraftRequestDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("offer_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) deliveryDraftRequestDto2.getOfferId());
        jsonWriter.name("additional_delivery_description");
        this.additionalDeliveryDescriptionForCreationDtoAdapter.toJson(jsonWriter, (JsonWriter) deliveryDraftRequestDto2.getAdditionalDeliveryDescription());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(45, "GeneratedJsonAdapter(DeliveryDraftRequestDto)");
    }
}
