package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/PickerWidgetStateDependencyItemDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/PickerWidgetStateDependencyItemDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "anyAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PickerWidgetStateDependencyItemDtoJsonAdapter extends JsonAdapter<PickerWidgetStateDependencyItemDto> {
    private final JsonAdapter<Object> anyAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("form_state_key", "form_state_value");
    private final JsonAdapter<String> stringAdapter;

    public PickerWidgetStateDependencyItemDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "formStateKey");
        this.anyAdapter = moshi.adapter(Object.class, emptySet, "formStateValue");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final PickerWidgetStateDependencyItemDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        Object obj = null;
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
            } else if (selectName == 1 && (obj = this.anyAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("formStateValue", "form_state_value", jsonReader);
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("formStateKey", "form_state_key", jsonReader);
        }
        if (obj != null) {
            return new PickerWidgetStateDependencyItemDto(str, obj);
        }
        throw Util.missingProperty("formStateValue", "form_state_value", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, PickerWidgetStateDependencyItemDto pickerWidgetStateDependencyItemDto) {
        PickerWidgetStateDependencyItemDto pickerWidgetStateDependencyItemDto2 = pickerWidgetStateDependencyItemDto;
        if (pickerWidgetStateDependencyItemDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("form_state_key");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) pickerWidgetStateDependencyItemDto2.getFormStateKey());
        jsonWriter.name("form_state_value");
        this.anyAdapter.toJson(jsonWriter, (JsonWriter) pickerWidgetStateDependencyItemDto2.getFormStateValue());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(56, "GeneratedJsonAdapter(PickerWidgetStateDependencyItemDto)");
    }
}
