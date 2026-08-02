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
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions.TapActionDto;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\u001e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SliderButtonWidgetDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SliderButtonWidgetDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "booleanAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SliderButtonContentDto;", "sliderButtonContentDtoAdapter", "nullableSliderButtonContentDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/TapActionDto;", "tapActionDtoAdapter", "nullableStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SliderButtonWidgetDtoJsonAdapter extends JsonAdapter<SliderButtonWidgetDto> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<SliderButtonWidgetDto> constructorRef;
    private final JsonAdapter<SliderButtonContentDto> nullableSliderButtonContentDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("widget_id", "is_enabled", "normal_content", "loading_form_content", "action", "metrica_label");
    private final JsonAdapter<SliderButtonContentDto> sliderButtonContentDtoAdapter;
    private final JsonAdapter<String> stringAdapter;
    private final JsonAdapter<TapActionDto> tapActionDtoAdapter;

    public SliderButtonWidgetDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "widgetId");
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, emptySet, "isEnabled");
        this.sliderButtonContentDtoAdapter = moshi.adapter(SliderButtonContentDto.class, emptySet, "normalContent");
        this.nullableSliderButtonContentDtoAdapter = moshi.adapter(SliderButtonContentDto.class, emptySet, "loadingFormContent");
        this.tapActionDtoAdapter = moshi.adapter(TapActionDto.class, emptySet, "action");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "metricaLabel");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final SliderButtonWidgetDto fromJson(JsonReader jsonReader) {
        Boolean bool = Boolean.FALSE;
        jsonReader.beginObject();
        int i = -1;
        Boolean bool2 = bool;
        String str = null;
        SliderButtonContentDto sliderButtonContentDto = null;
        SliderButtonContentDto sliderButtonContentDto2 = null;
        TapActionDto tapActionDto = null;
        String str2 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("widgetId", "widget_id", jsonReader);
                    }
                    break;
                case 1:
                    bool2 = this.booleanAdapter.fromJson(jsonReader);
                    if (bool2 == null) {
                        throw Util.unexpectedNull("isEnabled", "is_enabled", jsonReader);
                    }
                    i = -3;
                    break;
                case 2:
                    sliderButtonContentDto = this.sliderButtonContentDtoAdapter.fromJson(jsonReader);
                    if (sliderButtonContentDto == null) {
                        throw Util.unexpectedNull("normalContent", "normal_content", jsonReader);
                    }
                    break;
                case 3:
                    sliderButtonContentDto2 = this.nullableSliderButtonContentDtoAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    tapActionDto = this.tapActionDtoAdapter.fromJson(jsonReader);
                    if (tapActionDto == null) {
                        throw Util.unexpectedNull("action", "action", jsonReader);
                    }
                    break;
                case 5:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.endObject();
        if (i == -3) {
            String str3 = str2;
            SliderButtonContentDto sliderButtonContentDto3 = sliderButtonContentDto;
            if (str == null) {
                throw Util.missingProperty("widgetId", "widget_id", jsonReader);
            }
            TapActionDto tapActionDto2 = tapActionDto;
            boolean booleanValue = bool2.booleanValue();
            if (sliderButtonContentDto3 == null) {
                throw Util.missingProperty("normalContent", "normal_content", jsonReader);
            }
            if (tapActionDto2 == null) {
                throw Util.missingProperty("action", "action", jsonReader);
            }
            return new SliderButtonWidgetDto(str, booleanValue, sliderButtonContentDto3, sliderButtonContentDto2, tapActionDto2, str3);
        }
        TapActionDto tapActionDto3 = tapActionDto;
        String str4 = str2;
        SliderButtonContentDto sliderButtonContentDto4 = sliderButtonContentDto;
        Constructor<SliderButtonWidgetDto> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = SliderButtonWidgetDto.class.getDeclaredConstructor(String.class, Boolean.TYPE, SliderButtonContentDto.class, SliderButtonContentDto.class, TapActionDto.class, String.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        Constructor<SliderButtonWidgetDto> constructor2 = constructor;
        if (str == null) {
            throw Util.missingProperty("widgetId", "widget_id", jsonReader);
        }
        if (sliderButtonContentDto4 == null) {
            throw Util.missingProperty("normalContent", "normal_content", jsonReader);
        }
        if (tapActionDto3 != null) {
            return constructor2.newInstance(str, bool2, sliderButtonContentDto4, sliderButtonContentDto2, tapActionDto3, str4, Integer.valueOf(i), null);
        }
        throw Util.missingProperty("action", "action", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, SliderButtonWidgetDto sliderButtonWidgetDto) {
        SliderButtonWidgetDto sliderButtonWidgetDto2 = sliderButtonWidgetDto;
        if (sliderButtonWidgetDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("widget_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) sliderButtonWidgetDto2.getWidgetId());
        jsonWriter.name("is_enabled");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(sliderButtonWidgetDto2.isEnabled()));
        jsonWriter.name("normal_content");
        this.sliderButtonContentDtoAdapter.toJson(jsonWriter, (JsonWriter) sliderButtonWidgetDto2.getNormalContent());
        jsonWriter.name("loading_form_content");
        this.nullableSliderButtonContentDtoAdapter.toJson(jsonWriter, (JsonWriter) sliderButtonWidgetDto2.getLoadingFormContent());
        jsonWriter.name("action");
        this.tapActionDtoAdapter.toJson(jsonWriter, (JsonWriter) sliderButtonWidgetDto2.getAction());
        jsonWriter.name("metrica_label");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) sliderButtonWidgetDto2.getMetricaLabel());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(43, "GeneratedJsonAdapter(SliderButtonWidgetDto)");
    }
}
