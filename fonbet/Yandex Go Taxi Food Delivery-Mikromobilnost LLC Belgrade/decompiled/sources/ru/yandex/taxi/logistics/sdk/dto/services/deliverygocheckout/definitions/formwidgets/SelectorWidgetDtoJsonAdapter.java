package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.taxi.logistics.sdk.dto.libraries.extendedtemplate.definitions.AttributedTextDto;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\u001e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SelectorWidgetDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SelectorWidgetDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SelectorOptionDto;", "listOfSelectorOptionDtoAdapter", "nullableStringAdapter", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "nullableAttributedTextDtoAdapter", "", "booleanAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SelectorWidgetDtoJsonAdapter extends JsonAdapter<SelectorWidgetDto> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<SelectorWidgetDto> constructorRef;
    private final JsonAdapter<List<SelectorOptionDto>> listOfSelectorOptionDtoAdapter;
    private final JsonAdapter<AttributedTextDto> nullableAttributedTextDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("widget_id", "form_state_key", "options", "metrica_label", "bottom_text", "disabled_unselect");
    private final JsonAdapter<String> stringAdapter;

    public SelectorWidgetDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "widgetId");
        this.listOfSelectorOptionDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, SelectorOptionDto.class), emptySet, "options");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "metricaLabel");
        this.nullableAttributedTextDtoAdapter = moshi.adapter(AttributedTextDto.class, emptySet, "bottomText");
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, emptySet, "disabledUnselect");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final SelectorWidgetDto fromJson(JsonReader jsonReader) {
        String str;
        Boolean bool = Boolean.FALSE;
        jsonReader.beginObject();
        List<SelectorOptionDto> list = null;
        Boolean bool2 = bool;
        String str2 = null;
        String str3 = null;
        AttributedTextDto attributedTextDto = null;
        int i = -1;
        String str4 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    str3 = this.stringAdapter.fromJson(jsonReader);
                    if (str3 == null) {
                        throw Util.unexpectedNull("widgetId", "widget_id", jsonReader);
                    }
                    break;
                case 1:
                    str2 = this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        throw Util.unexpectedNull("formStateKey", "form_state_key", jsonReader);
                    }
                    break;
                case 2:
                    list = this.listOfSelectorOptionDtoAdapter.fromJson(jsonReader);
                    if (list == null) {
                        throw Util.unexpectedNull("options_", "options", jsonReader);
                    }
                    break;
                case 3:
                    str4 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    attributedTextDto = this.nullableAttributedTextDtoAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    bool2 = this.booleanAdapter.fromJson(jsonReader);
                    if (bool2 == null) {
                        throw Util.unexpectedNull("disabledUnselect", "disabled_unselect", jsonReader);
                    }
                    i = -33;
                    break;
            }
        }
        jsonReader.endObject();
        if (i == -33) {
            if (str3 == null) {
                throw Util.missingProperty("widgetId", "widget_id", jsonReader);
            }
            if (str2 == null) {
                throw Util.missingProperty("formStateKey", "form_state_key", jsonReader);
            }
            if (list == null) {
                throw Util.missingProperty("options_", "options", jsonReader);
            }
            return new SelectorWidgetDto(str3, str2, list, str4, attributedTextDto, bool2.booleanValue());
        }
        Constructor<SelectorWidgetDto> constructor = this.constructorRef;
        if (constructor == null) {
            str = str2;
            constructor = SelectorWidgetDto.class.getDeclaredConstructor(String.class, String.class, List.class, String.class, AttributedTextDto.class, Boolean.TYPE, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        } else {
            str = str2;
        }
        Constructor<SelectorWidgetDto> constructor2 = constructor;
        if (str3 == null) {
            throw Util.missingProperty("widgetId", "widget_id", jsonReader);
        }
        if (str == null) {
            throw Util.missingProperty("formStateKey", "form_state_key", jsonReader);
        }
        if (list == null) {
            throw Util.missingProperty("options_", "options", jsonReader);
        }
        return constructor2.newInstance(str3, str, list, str4, attributedTextDto, bool2, Integer.valueOf(i), null);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, SelectorWidgetDto selectorWidgetDto) {
        SelectorWidgetDto selectorWidgetDto2 = selectorWidgetDto;
        if (selectorWidgetDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("widget_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) selectorWidgetDto2.getWidgetId());
        jsonWriter.name("form_state_key");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) selectorWidgetDto2.getFormStateKey());
        jsonWriter.name("options");
        this.listOfSelectorOptionDtoAdapter.toJson(jsonWriter, (JsonWriter) selectorWidgetDto2.getOptions());
        jsonWriter.name("metrica_label");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) selectorWidgetDto2.getMetricaLabel());
        jsonWriter.name("bottom_text");
        this.nullableAttributedTextDtoAdapter.toJson(jsonWriter, (JsonWriter) selectorWidgetDto2.getBottomText());
        jsonWriter.name("disabled_unselect");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(selectorWidgetDto2.getDisabledUnselect()));
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(39, "GeneratedJsonAdapter(SelectorWidgetDto)");
    }
}
