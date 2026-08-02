package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/DigitsInputWidgetDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/DigitsInputWidgetDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/DigitsInputTypeDto;", "digitsInputTypeDtoAdapter", "", "booleanAdapter", "nullableStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DigitsInputWidgetDtoJsonAdapter extends JsonAdapter<DigitsInputWidgetDto> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<DigitsInputWidgetDto> constructorRef;
    private final JsonAdapter<DigitsInputTypeDto> digitsInputTypeDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("widget_id", "form_state_key", "input_type", "force_open_keyboard", "metrica_label");
    private final JsonAdapter<String> stringAdapter;

    public DigitsInputWidgetDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "widgetId");
        this.digitsInputTypeDtoAdapter = moshi.adapter(DigitsInputTypeDto.class, emptySet, "inputType");
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, emptySet, "forceOpenKeyboard");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "metricaLabel");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final DigitsInputWidgetDto fromJson(JsonReader jsonReader) {
        Boolean bool = Boolean.FALSE;
        jsonReader.beginObject();
        Boolean bool2 = bool;
        String str = null;
        String str2 = null;
        DigitsInputTypeDto digitsInputTypeDto = null;
        String str3 = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("widgetId", "widget_id", jsonReader);
                }
            } else if (selectName == 1) {
                str2 = this.stringAdapter.fromJson(jsonReader);
                if (str2 == null) {
                    throw Util.unexpectedNull("formStateKey", "form_state_key", jsonReader);
                }
            } else if (selectName == 2) {
                digitsInputTypeDto = this.digitsInputTypeDtoAdapter.fromJson(jsonReader);
                if (digitsInputTypeDto == null) {
                    throw Util.unexpectedNull("inputType", "input_type", jsonReader);
                }
            } else if (selectName == 3) {
                bool2 = this.booleanAdapter.fromJson(jsonReader);
                if (bool2 == null) {
                    throw Util.unexpectedNull("forceOpenKeyboard", "force_open_keyboard", jsonReader);
                }
                i = -9;
            } else if (selectName == 4) {
                str3 = this.nullableStringAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (i == -9) {
            if (str == null) {
                throw Util.missingProperty("widgetId", "widget_id", jsonReader);
            }
            if (str2 == null) {
                throw Util.missingProperty("formStateKey", "form_state_key", jsonReader);
            }
            if (digitsInputTypeDto == null) {
                throw Util.missingProperty("inputType", "input_type", jsonReader);
            }
            return new DigitsInputWidgetDto(str, str2, digitsInputTypeDto, bool2.booleanValue(), str3);
        }
        Constructor<DigitsInputWidgetDto> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = DigitsInputWidgetDto.class.getDeclaredConstructor(String.class, String.class, DigitsInputTypeDto.class, Boolean.TYPE, String.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        if (str == null) {
            throw Util.missingProperty("widgetId", "widget_id", jsonReader);
        }
        if (str2 == null) {
            throw Util.missingProperty("formStateKey", "form_state_key", jsonReader);
        }
        if (digitsInputTypeDto == null) {
            throw Util.missingProperty("inputType", "input_type", jsonReader);
        }
        return constructor.newInstance(str, str2, digitsInputTypeDto, bool2, str3, Integer.valueOf(i), null);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, DigitsInputWidgetDto digitsInputWidgetDto) {
        DigitsInputWidgetDto digitsInputWidgetDto2 = digitsInputWidgetDto;
        if (digitsInputWidgetDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("widget_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) digitsInputWidgetDto2.getWidgetId());
        jsonWriter.name("form_state_key");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) digitsInputWidgetDto2.getFormStateKey());
        jsonWriter.name("input_type");
        this.digitsInputTypeDtoAdapter.toJson(jsonWriter, (JsonWriter) digitsInputWidgetDto2.getInputType());
        jsonWriter.name("force_open_keyboard");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(digitsInputWidgetDto2.getForceOpenKeyboard()));
        jsonWriter.name("metrica_label");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) digitsInputWidgetDto2.getMetricaLabel());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(42, "GeneratedJsonAdapter(DigitsInputWidgetDto)");
    }
}
