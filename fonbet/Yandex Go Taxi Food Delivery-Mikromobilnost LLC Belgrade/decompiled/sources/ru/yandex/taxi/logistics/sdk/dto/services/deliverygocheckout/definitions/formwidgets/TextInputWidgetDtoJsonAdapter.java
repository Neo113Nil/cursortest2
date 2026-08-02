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

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\"\u0010\u0015\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\fR\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\fR\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\fR\u001e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TextInputWidgetDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TextInputWidgetDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "intAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TextInputStyleDto;", "nullableTextInputStyleDtoAdapter", "", "nullableBooleanAdapter", "", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SlotTrailDto;", "nullableListOfSlotTrailDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TextInputStopWordsConfigDto;", "nullableTextInputStopWordsConfigDtoAdapter", "nullableStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TextInputWidgetDtoJsonAdapter extends JsonAdapter<TextInputWidgetDto> {
    private volatile Constructor<TextInputWidgetDto> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<List<SlotTrailDto>> nullableListOfSlotTrailDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonAdapter<TextInputStopWordsConfigDto> nullableTextInputStopWordsConfigDtoAdapter;
    private final JsonAdapter<TextInputStyleDto> nullableTextInputStyleDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("widget_id", "height", "placeholder", "focused_style", "unfocused_style", "form_state_key", "force_open_keyboard", "trails", "stop_words_config", "max_symbols", "horizontal_inset", "metrica_label");
    private final JsonAdapter<String> stringAdapter;

    public TextInputWidgetDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "widgetId");
        this.intAdapter = moshi.adapter(Integer.TYPE, emptySet, "height");
        this.nullableTextInputStyleDtoAdapter = moshi.adapter(TextInputStyleDto.class, emptySet, "focusedStyle");
        this.nullableBooleanAdapter = moshi.adapter(Boolean.class, emptySet, "forceOpenKeyboard");
        this.nullableListOfSlotTrailDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, SlotTrailDto.class), emptySet, "trails");
        this.nullableTextInputStopWordsConfigDtoAdapter = moshi.adapter(TextInputStopWordsConfigDto.class, emptySet, "stopWordsConfig");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "metricaLabel");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final TextInputWidgetDto fromJson(JsonReader jsonReader) {
        int i;
        jsonReader.beginObject();
        String str = null;
        Integer num = 0;
        Integer num2 = null;
        String str2 = null;
        Integer num3 = null;
        Boolean bool = null;
        List<SlotTrailDto> list = null;
        TextInputStyleDto textInputStyleDto = null;
        String str3 = null;
        TextInputStopWordsConfigDto textInputStopWordsConfigDto = null;
        String str4 = null;
        int i2 = -1;
        TextInputStyleDto textInputStyleDto2 = null;
        while (true) {
            String str5 = str;
            TextInputStyleDto textInputStyleDto3 = textInputStyleDto2;
            String str6 = str2;
            Integer num4 = num3;
            Boolean bool2 = bool;
            if (!jsonReader.hasNext()) {
                jsonReader.endObject();
                if (i2 == -1537) {
                    if (str6 == null) {
                        throw Util.missingProperty("widgetId", "widget_id", jsonReader);
                    }
                    if (num4 == null) {
                        throw Util.missingProperty("height", "height", jsonReader);
                    }
                    int intValue = num4.intValue();
                    if (str5 == null) {
                        throw Util.missingProperty("placeholder", "placeholder", jsonReader);
                    }
                    if (str3 == null) {
                        throw Util.missingProperty("formStateKey", "form_state_key", jsonReader);
                    }
                    return new TextInputWidgetDto(str6, intValue, str5, textInputStyleDto3, textInputStyleDto, str3, bool2, list, textInputStopWordsConfigDto, num.intValue(), num2.intValue(), str4);
                }
                Constructor<TextInputWidgetDto> constructor = this.constructorRef;
                if (constructor == null) {
                    Class<?> cls = Util.DEFAULT_CONSTRUCTOR_MARKER;
                    Class cls2 = Integer.TYPE;
                    i = i2;
                    constructor = TextInputWidgetDto.class.getDeclaredConstructor(String.class, cls2, String.class, TextInputStyleDto.class, TextInputStyleDto.class, String.class, Boolean.class, List.class, TextInputStopWordsConfigDto.class, cls2, cls2, String.class, cls2, cls);
                    this.constructorRef = constructor;
                } else {
                    i = i2;
                }
                Constructor<TextInputWidgetDto> constructor2 = constructor;
                if (str6 == null) {
                    throw Util.missingProperty("widgetId", "widget_id", jsonReader);
                }
                if (num4 == null) {
                    throw Util.missingProperty("height", "height", jsonReader);
                }
                if (str5 == null) {
                    throw Util.missingProperty("placeholder", "placeholder", jsonReader);
                }
                if (str3 == null) {
                    throw Util.missingProperty("formStateKey", "form_state_key", jsonReader);
                }
                return constructor2.newInstance(str6, num4, str5, textInputStyleDto3, textInputStyleDto, str3, bool2, list, textInputStopWordsConfigDto, num, num2, str4, Integer.valueOf(i), null);
            }
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    str = str5;
                    textInputStyleDto2 = textInputStyleDto3;
                    str2 = str6;
                    num3 = num4;
                    bool = bool2;
                case 0:
                    str2 = this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        throw Util.unexpectedNull("widgetId", "widget_id", jsonReader);
                    }
                    str = str5;
                    textInputStyleDto2 = textInputStyleDto3;
                    num3 = num4;
                    bool = bool2;
                case 1:
                    Integer fromJson = this.intAdapter.fromJson(jsonReader);
                    if (fromJson == null) {
                        throw Util.unexpectedNull("height", "height", jsonReader);
                    }
                    num3 = fromJson;
                    str = str5;
                    textInputStyleDto2 = textInputStyleDto3;
                    str2 = str6;
                    bool = bool2;
                case 2:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("placeholder", "placeholder", jsonReader);
                    }
                    textInputStyleDto2 = textInputStyleDto3;
                    str2 = str6;
                    num3 = num4;
                    bool = bool2;
                case 3:
                    textInputStyleDto2 = this.nullableTextInputStyleDtoAdapter.fromJson(jsonReader);
                    str = str5;
                    str2 = str6;
                    num3 = num4;
                    bool = bool2;
                case 4:
                    textInputStyleDto = this.nullableTextInputStyleDtoAdapter.fromJson(jsonReader);
                    str = str5;
                    textInputStyleDto2 = textInputStyleDto3;
                    str2 = str6;
                    num3 = num4;
                    bool = bool2;
                case 5:
                    str3 = this.stringAdapter.fromJson(jsonReader);
                    if (str3 == null) {
                        throw Util.unexpectedNull("formStateKey", "form_state_key", jsonReader);
                    }
                    str = str5;
                    textInputStyleDto2 = textInputStyleDto3;
                    str2 = str6;
                    num3 = num4;
                    bool = bool2;
                case 6:
                    bool = this.nullableBooleanAdapter.fromJson(jsonReader);
                    str = str5;
                    textInputStyleDto2 = textInputStyleDto3;
                    str2 = str6;
                    num3 = num4;
                case 7:
                    list = this.nullableListOfSlotTrailDtoAdapter.fromJson(jsonReader);
                    str = str5;
                    textInputStyleDto2 = textInputStyleDto3;
                    str2 = str6;
                    num3 = num4;
                    bool = bool2;
                case 8:
                    textInputStopWordsConfigDto = this.nullableTextInputStopWordsConfigDtoAdapter.fromJson(jsonReader);
                    str = str5;
                    textInputStyleDto2 = textInputStyleDto3;
                    str2 = str6;
                    num3 = num4;
                    bool = bool2;
                case 9:
                    num = this.intAdapter.fromJson(jsonReader);
                    if (num == null) {
                        throw Util.unexpectedNull("maxSymbols", "max_symbols", jsonReader);
                    }
                    i2 &= -513;
                    str = str5;
                    textInputStyleDto2 = textInputStyleDto3;
                    str2 = str6;
                    num3 = num4;
                    bool = bool2;
                case 10:
                    num2 = this.intAdapter.fromJson(jsonReader);
                    if (num2 == null) {
                        throw Util.unexpectedNull("horizontalInset", "horizontal_inset", jsonReader);
                    }
                    i2 &= -1025;
                    str = str5;
                    textInputStyleDto2 = textInputStyleDto3;
                    str2 = str6;
                    num3 = num4;
                    bool = bool2;
                case 11:
                    str4 = this.nullableStringAdapter.fromJson(jsonReader);
                    str = str5;
                    textInputStyleDto2 = textInputStyleDto3;
                    str2 = str6;
                    num3 = num4;
                    bool = bool2;
                default:
                    str = str5;
                    textInputStyleDto2 = textInputStyleDto3;
                    str2 = str6;
                    num3 = num4;
                    bool = bool2;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, TextInputWidgetDto textInputWidgetDto) {
        TextInputWidgetDto textInputWidgetDto2 = textInputWidgetDto;
        if (textInputWidgetDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("widget_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) textInputWidgetDto2.getWidgetId());
        jsonWriter.name("height");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(textInputWidgetDto2.getHeight()));
        jsonWriter.name("placeholder");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) textInputWidgetDto2.getPlaceholder());
        jsonWriter.name("focused_style");
        this.nullableTextInputStyleDtoAdapter.toJson(jsonWriter, (JsonWriter) textInputWidgetDto2.getFocusedStyle());
        jsonWriter.name("unfocused_style");
        this.nullableTextInputStyleDtoAdapter.toJson(jsonWriter, (JsonWriter) textInputWidgetDto2.getUnfocusedStyle());
        jsonWriter.name("form_state_key");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) textInputWidgetDto2.getFormStateKey());
        jsonWriter.name("force_open_keyboard");
        this.nullableBooleanAdapter.toJson(jsonWriter, (JsonWriter) textInputWidgetDto2.getForceOpenKeyboard());
        jsonWriter.name("trails");
        this.nullableListOfSlotTrailDtoAdapter.toJson(jsonWriter, (JsonWriter) textInputWidgetDto2.getTrails());
        jsonWriter.name("stop_words_config");
        this.nullableTextInputStopWordsConfigDtoAdapter.toJson(jsonWriter, (JsonWriter) textInputWidgetDto2.getStopWordsConfig());
        jsonWriter.name("max_symbols");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(textInputWidgetDto2.getMaxSymbols()));
        jsonWriter.name("horizontal_inset");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(textInputWidgetDto2.getHorizontalInset()));
        jsonWriter.name("metrica_label");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) textInputWidgetDto2.getMetricaLabel());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(40, "GeneratedJsonAdapter(TextInputWidgetDto)");
    }
}
