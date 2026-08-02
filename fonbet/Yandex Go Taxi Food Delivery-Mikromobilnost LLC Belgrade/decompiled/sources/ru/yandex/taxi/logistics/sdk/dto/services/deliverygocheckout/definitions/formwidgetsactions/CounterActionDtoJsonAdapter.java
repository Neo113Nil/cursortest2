package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR \u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\f¨\u0006\u0013"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/CounterActionDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/CounterActionDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/TapActionDto;", "nullableTapActionDtoAdapter", "", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/CounterOptionDto;", "listOfCounterOptionDtoAdapter", "nullableStringAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CounterActionDtoJsonAdapter extends JsonAdapter<CounterActionDto> {
    private final JsonAdapter<List<CounterOptionDto>> listOfCounterOptionDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonAdapter<TapActionDto> nullableTapActionDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("form_state_key", "action_on_increase", "action_on_decrease", "options", "metrica_label");
    private final JsonAdapter<String> stringAdapter;

    public CounterActionDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "formStateKey");
        this.nullableTapActionDtoAdapter = moshi.adapter(TapActionDto.class, emptySet, "actionOnIncrease");
        this.listOfCounterOptionDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, CounterOptionDto.class), emptySet, "options");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "metricaLabel");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final CounterActionDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        TapActionDto tapActionDto = null;
        TapActionDto tapActionDto2 = null;
        List<CounterOptionDto> list = null;
        String str2 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("formStateKey", "form_state_key", jsonReader);
                }
            } else if (selectName == 1) {
                tapActionDto = this.nullableTapActionDtoAdapter.fromJson(jsonReader);
            } else if (selectName == 2) {
                tapActionDto2 = this.nullableTapActionDtoAdapter.fromJson(jsonReader);
            } else if (selectName == 3) {
                list = this.listOfCounterOptionDtoAdapter.fromJson(jsonReader);
                if (list == null) {
                    throw Util.unexpectedNull("options_", "options", jsonReader);
                }
            } else if (selectName == 4) {
                str2 = this.nullableStringAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("formStateKey", "form_state_key", jsonReader);
        }
        if (list != null) {
            return new CounterActionDto(str, tapActionDto, tapActionDto2, list, str2);
        }
        throw Util.missingProperty("options_", "options", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, CounterActionDto counterActionDto) {
        CounterActionDto counterActionDto2 = counterActionDto;
        if (counterActionDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("form_state_key");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) counterActionDto2.getFormStateKey());
        jsonWriter.name("action_on_increase");
        this.nullableTapActionDtoAdapter.toJson(jsonWriter, (JsonWriter) counterActionDto2.getActionOnIncrease());
        jsonWriter.name("action_on_decrease");
        this.nullableTapActionDtoAdapter.toJson(jsonWriter, (JsonWriter) counterActionDto2.getActionOnDecrease());
        jsonWriter.name("options");
        this.listOfCounterOptionDtoAdapter.toJson(jsonWriter, (JsonWriter) counterActionDto2.getOptions());
        jsonWriter.name("metrica_label");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) counterActionDto2.getMetricaLabel());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(38, "GeneratedJsonAdapter(CounterActionDto)");
    }
}
