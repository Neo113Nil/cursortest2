package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.topaccentbar;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.slot.SlotDto;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\f¨\u0006\u0010"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/topaccentbar/InfoTopAccentBarDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/topaccentbar/InfoTopAccentBarDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/slot/SlotDto;", "slotDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "stringAdapter", "nullableStringAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class InfoTopAccentBarDtoJsonAdapter extends JsonAdapter<InfoTopAccentBarDto> {
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("slot", "background_color", "metrica_label");
    private final JsonAdapter<SlotDto> slotDtoAdapter;
    private final JsonAdapter<String> stringAdapter;

    public InfoTopAccentBarDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.slotDtoAdapter = moshi.adapter(SlotDto.class, emptySet, "slot");
        this.stringAdapter = moshi.adapter(String.class, emptySet, UrbanAdsBottomSheetFragment.BACKGROUND_COLOR);
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "metricaLabel");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final InfoTopAccentBarDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        SlotDto slotDto = null;
        String str = null;
        String str2 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                slotDto = this.slotDtoAdapter.fromJson(jsonReader);
                if (slotDto == null) {
                    throw Util.unexpectedNull("slot", "slot", jsonReader);
                }
            } else if (selectName == 1) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull(UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "background_color", jsonReader);
                }
            } else if (selectName == 2) {
                str2 = this.nullableStringAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (slotDto == null) {
            throw Util.missingProperty("slot", "slot", jsonReader);
        }
        if (str != null) {
            return new InfoTopAccentBarDto(slotDto, str, str2);
        }
        throw Util.missingProperty(UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "background_color", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, InfoTopAccentBarDto infoTopAccentBarDto) {
        InfoTopAccentBarDto infoTopAccentBarDto2 = infoTopAccentBarDto;
        if (infoTopAccentBarDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("slot");
        this.slotDtoAdapter.toJson(jsonWriter, (JsonWriter) infoTopAccentBarDto2.getSlot());
        jsonWriter.name("background_color");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) infoTopAccentBarDto2.getBackgroundColor());
        jsonWriter.name("metrica_label");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) infoTopAccentBarDto2.getMetricaLabel());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(41, "GeneratedJsonAdapter(InfoTopAccentBarDto)");
    }
}
