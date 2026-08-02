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
import ru.yandex.taxi.logistics.sdk.dto.libraries.extendedtemplate.definitions.AttributedTextDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.ImageDto;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\u001c\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\fR\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\f¨\u0006\u0018"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/NumericInputWidgetDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/NumericInputWidgetDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableIntAdapter", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "nullableAttributedTextDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ImageDto;", "nullableImageDtoAdapter", "", "nullableBooleanAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/InputTypeDto;", "nullableInputTypeDtoAdapter", "nullableStringAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class NumericInputWidgetDtoJsonAdapter extends JsonAdapter<NumericInputWidgetDto> {
    private final JsonAdapter<AttributedTextDto> nullableAttributedTextDtoAdapter;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<ImageDto> nullableImageDtoAdapter;
    private final JsonAdapter<InputTypeDto> nullableInputTypeDtoAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("widget_id", "placeholder", "form_state_key", "min_value", "max_value", "caption", "invalid_input_message", "lead_icon", "force_open_keyboard", "input_type", "metrica_label");
    private final JsonAdapter<String> stringAdapter;

    public NumericInputWidgetDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "widgetId");
        this.nullableIntAdapter = moshi.adapter(Integer.class, emptySet, "minValue");
        this.nullableAttributedTextDtoAdapter = moshi.adapter(AttributedTextDto.class, emptySet, "invalidInputMessage");
        this.nullableImageDtoAdapter = moshi.adapter(ImageDto.class, emptySet, "leadIcon");
        this.nullableBooleanAdapter = moshi.adapter(Boolean.class, emptySet, "forceOpenKeyboard");
        this.nullableInputTypeDtoAdapter = moshi.adapter(InputTypeDto.class, emptySet, "inputType");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "metricaLabel");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final NumericInputWidgetDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        Integer num = null;
        Integer num2 = null;
        String str4 = null;
        AttributedTextDto attributedTextDto = null;
        ImageDto imageDto = null;
        Boolean bool = null;
        InputTypeDto inputTypeDto = null;
        String str5 = null;
        while (true) {
            String str6 = str;
            String str7 = str2;
            String str8 = str3;
            if (!jsonReader.hasNext()) {
                Integer num3 = num;
                jsonReader.endObject();
                if (str6 == null) {
                    throw Util.missingProperty("widgetId", "widget_id", jsonReader);
                }
                if (str7 == null) {
                    throw Util.missingProperty("placeholder", "placeholder", jsonReader);
                }
                if (str8 == null) {
                    throw Util.missingProperty("formStateKey", "form_state_key", jsonReader);
                }
                if (str4 != null) {
                    return new NumericInputWidgetDto(str6, str7, str8, num3, num2, str4, attributedTextDto, imageDto, bool, inputTypeDto, str5);
                }
                throw Util.missingProperty("caption", "caption", jsonReader);
            }
            Integer num4 = num;
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    num = num4;
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("widgetId", "widget_id", jsonReader);
                    }
                    num = num4;
                    str2 = str7;
                    str3 = str8;
                case 1:
                    String fromJson = this.stringAdapter.fromJson(jsonReader);
                    if (fromJson == null) {
                        throw Util.unexpectedNull("placeholder", "placeholder", jsonReader);
                    }
                    str2 = fromJson;
                    num = num4;
                    str = str6;
                    str3 = str8;
                case 2:
                    str3 = this.stringAdapter.fromJson(jsonReader);
                    if (str3 == null) {
                        throw Util.unexpectedNull("formStateKey", "form_state_key", jsonReader);
                    }
                    num = num4;
                    str = str6;
                    str2 = str7;
                case 3:
                    num = this.nullableIntAdapter.fromJson(jsonReader);
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                case 4:
                    num2 = this.nullableIntAdapter.fromJson(jsonReader);
                    num = num4;
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                case 5:
                    str4 = this.stringAdapter.fromJson(jsonReader);
                    if (str4 == null) {
                        throw Util.unexpectedNull("caption", "caption", jsonReader);
                    }
                    num = num4;
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                case 6:
                    attributedTextDto = this.nullableAttributedTextDtoAdapter.fromJson(jsonReader);
                    num = num4;
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                case 7:
                    imageDto = this.nullableImageDtoAdapter.fromJson(jsonReader);
                    num = num4;
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                case 8:
                    bool = this.nullableBooleanAdapter.fromJson(jsonReader);
                    num = num4;
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                case 9:
                    inputTypeDto = this.nullableInputTypeDtoAdapter.fromJson(jsonReader);
                    num = num4;
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                case 10:
                    str5 = this.nullableStringAdapter.fromJson(jsonReader);
                    num = num4;
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                default:
                    num = num4;
                    str = str6;
                    str2 = str7;
                    str3 = str8;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, NumericInputWidgetDto numericInputWidgetDto) {
        NumericInputWidgetDto numericInputWidgetDto2 = numericInputWidgetDto;
        if (numericInputWidgetDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("widget_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) numericInputWidgetDto2.getWidgetId());
        jsonWriter.name("placeholder");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) numericInputWidgetDto2.getPlaceholder());
        jsonWriter.name("form_state_key");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) numericInputWidgetDto2.getFormStateKey());
        jsonWriter.name("min_value");
        this.nullableIntAdapter.toJson(jsonWriter, (JsonWriter) numericInputWidgetDto2.getMinValue());
        jsonWriter.name("max_value");
        this.nullableIntAdapter.toJson(jsonWriter, (JsonWriter) numericInputWidgetDto2.getMaxValue());
        jsonWriter.name("caption");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) numericInputWidgetDto2.getCaption());
        jsonWriter.name("invalid_input_message");
        this.nullableAttributedTextDtoAdapter.toJson(jsonWriter, (JsonWriter) numericInputWidgetDto2.getInvalidInputMessage());
        jsonWriter.name("lead_icon");
        this.nullableImageDtoAdapter.toJson(jsonWriter, (JsonWriter) numericInputWidgetDto2.getLeadIcon());
        jsonWriter.name("force_open_keyboard");
        this.nullableBooleanAdapter.toJson(jsonWriter, (JsonWriter) numericInputWidgetDto2.getForceOpenKeyboard());
        jsonWriter.name("input_type");
        this.nullableInputTypeDtoAdapter.toJson(jsonWriter, (JsonWriter) numericInputWidgetDto2.getInputType());
        jsonWriter.name("metrica_label");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) numericInputWidgetDto2.getMetricaLabel());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(43, "GeneratedJsonAdapter(NumericInputWidgetDto)");
    }
}
