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
import ru.yandex.taxi.logistics.sdk.dto.libraries.extendedtemplate.definitions.AttributedTextDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.InputCircleWidgetDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions.TapActionDto;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR \u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\u001c\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\fR\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\fR\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\f¨\u0006\u001a"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/InputCircleWidgetDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/InputCircleWidgetDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/InputCircleInputValueDto;", "inputCircleInputValueDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/FormattableTextDto;", "formattableTextDtoAdapter", "", "listOfStringAdapter", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "nullableAttributedTextDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/InputCircleWidgetDto$IconDto;", "nullableIconDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/TapActionDto;", "nullableTapActionDtoAdapter", "nullableStringAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class InputCircleWidgetDtoJsonAdapter extends JsonAdapter<InputCircleWidgetDto> {
    private final JsonAdapter<FormattableTextDto> formattableTextDtoAdapter;
    private final JsonAdapter<InputCircleInputValueDto> inputCircleInputValueDtoAdapter;
    private final JsonAdapter<List<String>> listOfStringAdapter;
    private final JsonAdapter<AttributedTextDto> nullableAttributedTextDtoAdapter;
    private final JsonAdapter<InputCircleWidgetDto.IconDto> nullableIconDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonAdapter<TapActionDto> nullableTapActionDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("widget_id", "input_value", "min_value_title", "value_text", "gradient_colors", "form_state_key", "subtitle", "icon", "action", "metrica_label");
    private final JsonAdapter<String> stringAdapter;

    public InputCircleWidgetDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "widgetId");
        this.inputCircleInputValueDtoAdapter = moshi.adapter(InputCircleInputValueDto.class, emptySet, "inputValue");
        this.formattableTextDtoAdapter = moshi.adapter(FormattableTextDto.class, emptySet, "valueText");
        this.listOfStringAdapter = moshi.adapter(Types.newParameterizedType(List.class, String.class), emptySet, "gradientColors");
        this.nullableAttributedTextDtoAdapter = moshi.adapter(AttributedTextDto.class, emptySet, "subtitle");
        this.nullableIconDtoAdapter = moshi.adapter(InputCircleWidgetDto.IconDto.class, emptySet, "icon");
        this.nullableTapActionDtoAdapter = moshi.adapter(TapActionDto.class, emptySet, "action");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "metricaLabel");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final InputCircleWidgetDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        InputCircleInputValueDto inputCircleInputValueDto = null;
        String str2 = null;
        FormattableTextDto formattableTextDto = null;
        List<String> list = null;
        String str3 = null;
        AttributedTextDto attributedTextDto = null;
        InputCircleWidgetDto.IconDto iconDto = null;
        TapActionDto tapActionDto = null;
        String str4 = null;
        while (true) {
            String str5 = str;
            InputCircleInputValueDto inputCircleInputValueDto2 = inputCircleInputValueDto;
            String str6 = str2;
            FormattableTextDto formattableTextDto2 = formattableTextDto;
            List<String> list2 = list;
            String str7 = str3;
            AttributedTextDto attributedTextDto2 = attributedTextDto;
            InputCircleWidgetDto.IconDto iconDto2 = iconDto;
            if (!jsonReader.hasNext()) {
                TapActionDto tapActionDto2 = tapActionDto;
                jsonReader.endObject();
                if (str5 == null) {
                    throw Util.missingProperty("widgetId", "widget_id", jsonReader);
                }
                if (inputCircleInputValueDto2 == null) {
                    throw Util.missingProperty("inputValue", "input_value", jsonReader);
                }
                if (str6 == null) {
                    throw Util.missingProperty("minValueTitle", "min_value_title", jsonReader);
                }
                if (formattableTextDto2 == null) {
                    throw Util.missingProperty("valueText", "value_text", jsonReader);
                }
                if (list2 == null) {
                    throw Util.missingProperty("gradientColors", "gradient_colors", jsonReader);
                }
                if (str7 != null) {
                    return new InputCircleWidgetDto(str5, inputCircleInputValueDto2, str6, formattableTextDto2, list2, str7, attributedTextDto2, iconDto2, tapActionDto2, str4);
                }
                throw Util.missingProperty("formStateKey", "form_state_key", jsonReader);
            }
            TapActionDto tapActionDto3 = tapActionDto;
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    tapActionDto = tapActionDto3;
                    str = str5;
                    inputCircleInputValueDto = inputCircleInputValueDto2;
                    str2 = str6;
                    formattableTextDto = formattableTextDto2;
                    list = list2;
                    str3 = str7;
                    attributedTextDto = attributedTextDto2;
                    iconDto = iconDto2;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("widgetId", "widget_id", jsonReader);
                    }
                    tapActionDto = tapActionDto3;
                    inputCircleInputValueDto = inputCircleInputValueDto2;
                    str2 = str6;
                    formattableTextDto = formattableTextDto2;
                    list = list2;
                    str3 = str7;
                    attributedTextDto = attributedTextDto2;
                    iconDto = iconDto2;
                case 1:
                    inputCircleInputValueDto = this.inputCircleInputValueDtoAdapter.fromJson(jsonReader);
                    if (inputCircleInputValueDto == null) {
                        throw Util.unexpectedNull("inputValue", "input_value", jsonReader);
                    }
                    tapActionDto = tapActionDto3;
                    str = str5;
                    str2 = str6;
                    formattableTextDto = formattableTextDto2;
                    list = list2;
                    str3 = str7;
                    attributedTextDto = attributedTextDto2;
                    iconDto = iconDto2;
                case 2:
                    str2 = this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        throw Util.unexpectedNull("minValueTitle", "min_value_title", jsonReader);
                    }
                    tapActionDto = tapActionDto3;
                    str = str5;
                    inputCircleInputValueDto = inputCircleInputValueDto2;
                    formattableTextDto = formattableTextDto2;
                    list = list2;
                    str3 = str7;
                    attributedTextDto = attributedTextDto2;
                    iconDto = iconDto2;
                case 3:
                    FormattableTextDto fromJson = this.formattableTextDtoAdapter.fromJson(jsonReader);
                    if (fromJson == null) {
                        throw Util.unexpectedNull("valueText", "value_text", jsonReader);
                    }
                    formattableTextDto = fromJson;
                    tapActionDto = tapActionDto3;
                    str = str5;
                    inputCircleInputValueDto = inputCircleInputValueDto2;
                    str2 = str6;
                    list = list2;
                    str3 = str7;
                    attributedTextDto = attributedTextDto2;
                    iconDto = iconDto2;
                case 4:
                    List<String> fromJson2 = this.listOfStringAdapter.fromJson(jsonReader);
                    if (fromJson2 == null) {
                        throw Util.unexpectedNull("gradientColors", "gradient_colors", jsonReader);
                    }
                    list = fromJson2;
                    tapActionDto = tapActionDto3;
                    str = str5;
                    inputCircleInputValueDto = inputCircleInputValueDto2;
                    str2 = str6;
                    formattableTextDto = formattableTextDto2;
                    str3 = str7;
                    attributedTextDto = attributedTextDto2;
                    iconDto = iconDto2;
                case 5:
                    str3 = this.stringAdapter.fromJson(jsonReader);
                    if (str3 == null) {
                        throw Util.unexpectedNull("formStateKey", "form_state_key", jsonReader);
                    }
                    tapActionDto = tapActionDto3;
                    str = str5;
                    inputCircleInputValueDto = inputCircleInputValueDto2;
                    str2 = str6;
                    formattableTextDto = formattableTextDto2;
                    list = list2;
                    attributedTextDto = attributedTextDto2;
                    iconDto = iconDto2;
                case 6:
                    attributedTextDto = this.nullableAttributedTextDtoAdapter.fromJson(jsonReader);
                    tapActionDto = tapActionDto3;
                    str = str5;
                    inputCircleInputValueDto = inputCircleInputValueDto2;
                    str2 = str6;
                    formattableTextDto = formattableTextDto2;
                    list = list2;
                    str3 = str7;
                    iconDto = iconDto2;
                case 7:
                    iconDto = this.nullableIconDtoAdapter.fromJson(jsonReader);
                    tapActionDto = tapActionDto3;
                    str = str5;
                    inputCircleInputValueDto = inputCircleInputValueDto2;
                    str2 = str6;
                    formattableTextDto = formattableTextDto2;
                    list = list2;
                    str3 = str7;
                    attributedTextDto = attributedTextDto2;
                case 8:
                    tapActionDto = this.nullableTapActionDtoAdapter.fromJson(jsonReader);
                    str = str5;
                    inputCircleInputValueDto = inputCircleInputValueDto2;
                    str2 = str6;
                    formattableTextDto = formattableTextDto2;
                    list = list2;
                    str3 = str7;
                    attributedTextDto = attributedTextDto2;
                    iconDto = iconDto2;
                case 9:
                    str4 = this.nullableStringAdapter.fromJson(jsonReader);
                    tapActionDto = tapActionDto3;
                    str = str5;
                    inputCircleInputValueDto = inputCircleInputValueDto2;
                    str2 = str6;
                    formattableTextDto = formattableTextDto2;
                    list = list2;
                    str3 = str7;
                    attributedTextDto = attributedTextDto2;
                    iconDto = iconDto2;
                default:
                    tapActionDto = tapActionDto3;
                    str = str5;
                    inputCircleInputValueDto = inputCircleInputValueDto2;
                    str2 = str6;
                    formattableTextDto = formattableTextDto2;
                    list = list2;
                    str3 = str7;
                    attributedTextDto = attributedTextDto2;
                    iconDto = iconDto2;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, InputCircleWidgetDto inputCircleWidgetDto) {
        InputCircleWidgetDto inputCircleWidgetDto2 = inputCircleWidgetDto;
        if (inputCircleWidgetDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("widget_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) inputCircleWidgetDto2.getWidgetId());
        jsonWriter.name("input_value");
        this.inputCircleInputValueDtoAdapter.toJson(jsonWriter, (JsonWriter) inputCircleWidgetDto2.getInputValue());
        jsonWriter.name("min_value_title");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) inputCircleWidgetDto2.getMinValueTitle());
        jsonWriter.name("value_text");
        this.formattableTextDtoAdapter.toJson(jsonWriter, (JsonWriter) inputCircleWidgetDto2.getValueText());
        jsonWriter.name("gradient_colors");
        this.listOfStringAdapter.toJson(jsonWriter, (JsonWriter) inputCircleWidgetDto2.getGradientColors());
        jsonWriter.name("form_state_key");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) inputCircleWidgetDto2.getFormStateKey());
        jsonWriter.name("subtitle");
        this.nullableAttributedTextDtoAdapter.toJson(jsonWriter, (JsonWriter) inputCircleWidgetDto2.getSubtitle());
        jsonWriter.name("icon");
        this.nullableIconDtoAdapter.toJson(jsonWriter, (JsonWriter) inputCircleWidgetDto2.getIcon());
        jsonWriter.name("action");
        this.nullableTapActionDtoAdapter.toJson(jsonWriter, (JsonWriter) inputCircleWidgetDto2.getAction());
        jsonWriter.name("metrica_label");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) inputCircleWidgetDto2.getMetricaLabel());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(42, "GeneratedJsonAdapter(InputCircleWidgetDto)");
    }
}
