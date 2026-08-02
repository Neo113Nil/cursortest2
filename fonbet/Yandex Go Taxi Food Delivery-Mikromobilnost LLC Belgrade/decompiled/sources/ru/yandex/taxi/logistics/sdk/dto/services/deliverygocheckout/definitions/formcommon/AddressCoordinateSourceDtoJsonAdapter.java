package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AddressCoordinateSourceDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AddressCoordinateSourceDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ResultPositionDto;", "resultPositionDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AddressFlowDto;", "nullableAddressFlowDtoAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AddressCoordinateSourceDtoJsonAdapter extends JsonAdapter<AddressCoordinateSourceDto> {
    private final JsonAdapter<AddressFlowDto> nullableAddressFlowDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("result_position", "address_flow");
    private final JsonAdapter<ResultPositionDto> resultPositionDtoAdapter;

    public AddressCoordinateSourceDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.resultPositionDtoAdapter = moshi.adapter(ResultPositionDto.class, emptySet, "resultPosition");
        this.nullableAddressFlowDtoAdapter = moshi.adapter(AddressFlowDto.class, emptySet, "addressFlow");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final AddressCoordinateSourceDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        ResultPositionDto resultPositionDto = null;
        AddressFlowDto addressFlowDto = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                resultPositionDto = this.resultPositionDtoAdapter.fromJson(jsonReader);
                if (resultPositionDto == null) {
                    throw Util.unexpectedNull("resultPosition", "result_position", jsonReader);
                }
            } else if (selectName == 1) {
                addressFlowDto = this.nullableAddressFlowDtoAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (resultPositionDto != null) {
            return new AddressCoordinateSourceDto(resultPositionDto, addressFlowDto);
        }
        throw Util.missingProperty("resultPosition", "result_position", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, AddressCoordinateSourceDto addressCoordinateSourceDto) {
        AddressCoordinateSourceDto addressCoordinateSourceDto2 = addressCoordinateSourceDto;
        if (addressCoordinateSourceDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("result_position");
        this.resultPositionDtoAdapter.toJson(jsonWriter, (JsonWriter) addressCoordinateSourceDto2.getResultPosition());
        jsonWriter.name("address_flow");
        this.nullableAddressFlowDtoAdapter.toJson(jsonWriter, (JsonWriter) addressCoordinateSourceDto2.getAddressFlow());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(48, "GeneratedJsonAdapter(AddressCoordinateSourceDto)");
    }
}
