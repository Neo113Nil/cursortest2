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

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u001e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ScalableSelectorWidgetDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ScalableSelectorWidgetDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ScalableSelectorOptionDto;", "listOfScalableSelectorOptionDtoAdapter", "", "booleanAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ScalableSelectorStyleDto;", "nullableScalableSelectorStyleDtoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ScalableSelectorWidgetDtoJsonAdapter extends JsonAdapter<ScalableSelectorWidgetDto> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<ScalableSelectorWidgetDto> constructorRef;
    private final JsonAdapter<List<ScalableSelectorOptionDto>> listOfScalableSelectorOptionDtoAdapter;
    private final JsonAdapter<ScalableSelectorStyleDto> nullableScalableSelectorStyleDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("widget_id", "form_state_key", "options", "scrollable", "style");
    private final JsonAdapter<String> stringAdapter;

    public ScalableSelectorWidgetDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "widgetId");
        this.listOfScalableSelectorOptionDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, ScalableSelectorOptionDto.class), emptySet, "options");
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, emptySet, "scrollable");
        this.nullableScalableSelectorStyleDtoAdapter = moshi.adapter(ScalableSelectorStyleDto.class, emptySet, "style");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final ScalableSelectorWidgetDto fromJson(JsonReader jsonReader) {
        Boolean bool = Boolean.FALSE;
        jsonReader.beginObject();
        Boolean bool2 = bool;
        String str = null;
        String str2 = null;
        List<ScalableSelectorOptionDto> list = null;
        ScalableSelectorStyleDto scalableSelectorStyleDto = null;
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
                list = this.listOfScalableSelectorOptionDtoAdapter.fromJson(jsonReader);
                if (list == null) {
                    throw Util.unexpectedNull("options_", "options", jsonReader);
                }
            } else if (selectName == 3) {
                bool2 = this.booleanAdapter.fromJson(jsonReader);
                if (bool2 == null) {
                    throw Util.unexpectedNull("scrollable", "scrollable", jsonReader);
                }
                i = -9;
            } else if (selectName == 4) {
                scalableSelectorStyleDto = this.nullableScalableSelectorStyleDtoAdapter.fromJson(jsonReader);
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
            if (list == null) {
                throw Util.missingProperty("options_", "options", jsonReader);
            }
            return new ScalableSelectorWidgetDto(str, str2, list, bool2.booleanValue(), scalableSelectorStyleDto);
        }
        Constructor<ScalableSelectorWidgetDto> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = ScalableSelectorWidgetDto.class.getDeclaredConstructor(String.class, String.class, List.class, Boolean.TYPE, ScalableSelectorStyleDto.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        if (str == null) {
            throw Util.missingProperty("widgetId", "widget_id", jsonReader);
        }
        if (str2 == null) {
            throw Util.missingProperty("formStateKey", "form_state_key", jsonReader);
        }
        if (list == null) {
            throw Util.missingProperty("options_", "options", jsonReader);
        }
        return constructor.newInstance(str, str2, list, bool2, scalableSelectorStyleDto, Integer.valueOf(i), null);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, ScalableSelectorWidgetDto scalableSelectorWidgetDto) {
        ScalableSelectorWidgetDto scalableSelectorWidgetDto2 = scalableSelectorWidgetDto;
        if (scalableSelectorWidgetDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("widget_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) scalableSelectorWidgetDto2.getWidgetId());
        jsonWriter.name("form_state_key");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) scalableSelectorWidgetDto2.getFormStateKey());
        jsonWriter.name("options");
        this.listOfScalableSelectorOptionDtoAdapter.toJson(jsonWriter, (JsonWriter) scalableSelectorWidgetDto2.getOptions());
        jsonWriter.name("scrollable");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(scalableSelectorWidgetDto2.getScrollable()));
        jsonWriter.name("style");
        this.nullableScalableSelectorStyleDtoAdapter.toJson(jsonWriter, (JsonWriter) scalableSelectorWidgetDto2.getStyle());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(47, "GeneratedJsonAdapter(ScalableSelectorWidgetDto)");
    }
}
