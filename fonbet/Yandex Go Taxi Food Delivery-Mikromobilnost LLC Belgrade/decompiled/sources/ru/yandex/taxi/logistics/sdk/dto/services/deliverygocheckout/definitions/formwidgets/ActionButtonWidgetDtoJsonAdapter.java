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
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions.TapActionDto;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\f¨\u0006\u0015"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ActionButtonWidgetDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ActionButtonWidgetDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ButtonSizeDto;", "buttonSizeDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ButtonStyleDto;", "buttonStyleDtoAdapter", "nullableButtonStyleDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/TapActionDto;", "tapActionDtoAdapter", "nullableStringAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ActionButtonWidgetDtoJsonAdapter extends JsonAdapter<ActionButtonWidgetDto> {
    private final JsonAdapter<ButtonSizeDto> buttonSizeDtoAdapter;
    private final JsonAdapter<ButtonStyleDto> buttonStyleDtoAdapter;
    private final JsonAdapter<ButtonStyleDto> nullableButtonStyleDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("widget_id", "button_size", "normal_style", "loading_style", "action", "metrica_label");
    private final JsonAdapter<String> stringAdapter;
    private final JsonAdapter<TapActionDto> tapActionDtoAdapter;

    public ActionButtonWidgetDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "widgetId");
        this.buttonSizeDtoAdapter = moshi.adapter(ButtonSizeDto.class, emptySet, "buttonSize");
        this.buttonStyleDtoAdapter = moshi.adapter(ButtonStyleDto.class, emptySet, "normalStyle");
        this.nullableButtonStyleDtoAdapter = moshi.adapter(ButtonStyleDto.class, emptySet, "loadingStyle");
        this.tapActionDtoAdapter = moshi.adapter(TapActionDto.class, emptySet, "action");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "metricaLabel");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final ActionButtonWidgetDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        ButtonSizeDto buttonSizeDto = null;
        ButtonStyleDto buttonStyleDto = null;
        ButtonStyleDto buttonStyleDto2 = null;
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
                    buttonSizeDto = this.buttonSizeDtoAdapter.fromJson(jsonReader);
                    if (buttonSizeDto == null) {
                        throw Util.unexpectedNull("buttonSize", "button_size", jsonReader);
                    }
                    break;
                case 2:
                    buttonStyleDto = this.buttonStyleDtoAdapter.fromJson(jsonReader);
                    if (buttonStyleDto == null) {
                        throw Util.unexpectedNull("normalStyle", "normal_style", jsonReader);
                    }
                    break;
                case 3:
                    buttonStyleDto2 = this.nullableButtonStyleDtoAdapter.fromJson(jsonReader);
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
        if (str == null) {
            throw Util.missingProperty("widgetId", "widget_id", jsonReader);
        }
        if (buttonSizeDto == null) {
            throw Util.missingProperty("buttonSize", "button_size", jsonReader);
        }
        if (buttonStyleDto == null) {
            throw Util.missingProperty("normalStyle", "normal_style", jsonReader);
        }
        if (tapActionDto != null) {
            return new ActionButtonWidgetDto(str, buttonSizeDto, buttonStyleDto, buttonStyleDto2, tapActionDto, str2);
        }
        throw Util.missingProperty("action", "action", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, ActionButtonWidgetDto actionButtonWidgetDto) {
        ActionButtonWidgetDto actionButtonWidgetDto2 = actionButtonWidgetDto;
        if (actionButtonWidgetDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("widget_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) actionButtonWidgetDto2.getWidgetId());
        jsonWriter.name("button_size");
        this.buttonSizeDtoAdapter.toJson(jsonWriter, (JsonWriter) actionButtonWidgetDto2.getButtonSize());
        jsonWriter.name("normal_style");
        this.buttonStyleDtoAdapter.toJson(jsonWriter, (JsonWriter) actionButtonWidgetDto2.getNormalStyle());
        jsonWriter.name("loading_style");
        this.nullableButtonStyleDtoAdapter.toJson(jsonWriter, (JsonWriter) actionButtonWidgetDto2.getLoadingStyle());
        jsonWriter.name("action");
        this.tapActionDtoAdapter.toJson(jsonWriter, (JsonWriter) actionButtonWidgetDto2.getAction());
        jsonWriter.name("metrica_label");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) actionButtonWidgetDto2.getMetricaLabel());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(43, "GeneratedJsonAdapter(ActionButtonWidgetDto)");
    }
}
