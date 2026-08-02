package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.taxi.logistics.sdk.dto.libraries.gpssignal.definitions.GpsPositionDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate.PerformerPositionResponseDto;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/PerformerPositionResponseDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/PerformerPositionResponseDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lru/yandex/taxi/logistics/sdk/dto/libraries/gpssignal/definitions/GpsPositionDto;", "gpsPositionDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/PerformerPositionResponseDto$PinDto;", "nullablePinDtoAdapter", "", "nullableStringAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PerformerPositionResponseDtoJsonAdapter extends JsonAdapter<PerformerPositionResponseDto> {
    private final JsonAdapter<GpsPositionDto> gpsPositionDtoAdapter;
    private final JsonAdapter<PerformerPositionResponseDto.PinDto> nullablePinDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("position", "pin", "bubble_text");

    public PerformerPositionResponseDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.gpsPositionDtoAdapter = moshi.adapter(GpsPositionDto.class, emptySet, "position");
        this.nullablePinDtoAdapter = moshi.adapter(PerformerPositionResponseDto.PinDto.class, emptySet, "pin");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "bubbleText");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final PerformerPositionResponseDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        GpsPositionDto gpsPositionDto = null;
        PerformerPositionResponseDto.PinDto pinDto = null;
        String str = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                gpsPositionDto = this.gpsPositionDtoAdapter.fromJson(jsonReader);
                if (gpsPositionDto == null) {
                    throw Util.unexpectedNull("position", "position", jsonReader);
                }
            } else if (selectName == 1) {
                pinDto = this.nullablePinDtoAdapter.fromJson(jsonReader);
            } else if (selectName == 2) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (gpsPositionDto != null) {
            return new PerformerPositionResponseDto(gpsPositionDto, pinDto, str);
        }
        throw Util.missingProperty("position", "position", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, PerformerPositionResponseDto performerPositionResponseDto) {
        PerformerPositionResponseDto performerPositionResponseDto2 = performerPositionResponseDto;
        if (performerPositionResponseDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("position");
        this.gpsPositionDtoAdapter.toJson(jsonWriter, (JsonWriter) performerPositionResponseDto2.getPosition());
        jsonWriter.name("pin");
        this.nullablePinDtoAdapter.toJson(jsonWriter, (JsonWriter) performerPositionResponseDto2.getPin());
        jsonWriter.name("bubble_text");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) performerPositionResponseDto2.getBubbleText());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(50, "GeneratedJsonAdapter(PerformerPositionResponseDto)");
    }
}
