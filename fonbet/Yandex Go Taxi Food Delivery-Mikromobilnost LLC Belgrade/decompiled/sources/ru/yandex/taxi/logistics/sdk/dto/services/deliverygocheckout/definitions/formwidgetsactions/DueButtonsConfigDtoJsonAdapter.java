package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/DueButtonsConfigDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/DueButtonsConfigDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/DueButtonPropertiesDto;", "dueButtonPropertiesDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableDueButtonPropertiesDtoAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DueButtonsConfigDtoJsonAdapter extends JsonAdapter<DueButtonsConfigDto> {
    private final JsonAdapter<DueButtonPropertiesDto> dueButtonPropertiesDtoAdapter;
    private final JsonAdapter<DueButtonPropertiesDto> nullableDueButtonPropertiesDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("continue", "delete");

    public DueButtonsConfigDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.dueButtonPropertiesDtoAdapter = moshi.adapter(DueButtonPropertiesDto.class, emptySet, "continue");
        this.nullableDueButtonPropertiesDtoAdapter = moshi.adapter(DueButtonPropertiesDto.class, emptySet, "delete");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final DueButtonsConfigDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        DueButtonPropertiesDto dueButtonPropertiesDto = null;
        DueButtonPropertiesDto dueButtonPropertiesDto2 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                dueButtonPropertiesDto = this.dueButtonPropertiesDtoAdapter.fromJson(jsonReader);
                if (dueButtonPropertiesDto == null) {
                    throw Util.unexpectedNull("continue_", "continue", jsonReader);
                }
            } else if (selectName == 1) {
                dueButtonPropertiesDto2 = this.nullableDueButtonPropertiesDtoAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (dueButtonPropertiesDto != null) {
            return new DueButtonsConfigDto(dueButtonPropertiesDto, dueButtonPropertiesDto2);
        }
        throw Util.missingProperty("continue_", "continue", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, DueButtonsConfigDto dueButtonsConfigDto) {
        DueButtonsConfigDto dueButtonsConfigDto2 = dueButtonsConfigDto;
        if (dueButtonsConfigDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("continue");
        this.dueButtonPropertiesDtoAdapter.toJson(jsonWriter, (JsonWriter) dueButtonsConfigDto2.getContinue());
        jsonWriter.name("delete");
        this.nullableDueButtonPropertiesDtoAdapter.toJson(jsonWriter, (JsonWriter) dueButtonsConfigDto2.getDelete());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(41, "GeneratedJsonAdapter(DueButtonsConfigDto)");
    }
}
