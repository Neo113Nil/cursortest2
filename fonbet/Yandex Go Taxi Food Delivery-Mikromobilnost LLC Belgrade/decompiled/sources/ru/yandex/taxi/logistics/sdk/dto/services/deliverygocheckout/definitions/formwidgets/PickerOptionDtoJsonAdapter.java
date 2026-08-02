package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

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

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\"\u0010\u0011\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\f¨\u0006\u0012"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/PickerOptionDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/PickerOptionDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "anyAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "stringAdapter", "", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/PickerWidgetStateDependencyItemDto;", "nullableListOfPickerWidgetStateDependencyItemDtoAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PickerOptionDtoJsonAdapter extends JsonAdapter<PickerOptionDto> {
    private final JsonAdapter<Object> anyAdapter;
    private final JsonAdapter<List<PickerWidgetStateDependencyItemDto>> nullableListOfPickerWidgetStateDependencyItemDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("value", "label", "state_dependent_visibility");
    private final JsonAdapter<String> stringAdapter;

    public PickerOptionDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.anyAdapter = moshi.adapter(Object.class, emptySet, "value");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "label");
        this.nullableListOfPickerWidgetStateDependencyItemDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, PickerWidgetStateDependencyItemDto.class), emptySet, "stateDependentVisibility");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final PickerOptionDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Object obj = null;
        String str = null;
        List<PickerWidgetStateDependencyItemDto> list = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                obj = this.anyAdapter.fromJson(jsonReader);
                if (obj == null) {
                    throw Util.unexpectedNull("value__", "value", jsonReader);
                }
            } else if (selectName == 1) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("label", "label", jsonReader);
                }
            } else if (selectName == 2) {
                list = this.nullableListOfPickerWidgetStateDependencyItemDtoAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (obj == null) {
            throw Util.missingProperty("value__", "value", jsonReader);
        }
        if (str != null) {
            return new PickerOptionDto(obj, str, list);
        }
        throw Util.missingProperty("label", "label", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, PickerOptionDto pickerOptionDto) {
        PickerOptionDto pickerOptionDto2 = pickerOptionDto;
        if (pickerOptionDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("value");
        this.anyAdapter.toJson(jsonWriter, (JsonWriter) pickerOptionDto2.getValue());
        jsonWriter.name("label");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) pickerOptionDto2.getLabel());
        jsonWriter.name("state_dependent_visibility");
        this.nullableListOfPickerWidgetStateDependencyItemDtoAdapter.toJson(jsonWriter, (JsonWriter) pickerOptionDto2.getStateDependentVisibility());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(37, "GeneratedJsonAdapter(PickerOptionDto)");
    }
}
