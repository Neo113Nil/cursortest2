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
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.BubbleToggleWidgetDto;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\fR\u001e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/BubbleToggleWidgetDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/BubbleToggleWidgetDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/BubbleToggleDto;", "listOfBubbleToggleDtoAdapter", "", "nullableBooleanAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TooltipDto;", "nullableTooltipDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/BubbleToggleWidgetDto$ViewModeDto;", "viewModeDtoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BubbleToggleWidgetDtoJsonAdapter extends JsonAdapter<BubbleToggleWidgetDto> {
    private volatile Constructor<BubbleToggleWidgetDto> constructorRef;
    private final JsonAdapter<List<BubbleToggleDto>> listOfBubbleToggleDtoAdapter;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<TooltipDto> nullableTooltipDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("widget_id", "toggles", "form_state_key", "is_multichoice", "tooltip", "view_mode");
    private final JsonAdapter<String> stringAdapter;
    private final JsonAdapter<BubbleToggleWidgetDto.ViewModeDto> viewModeDtoAdapter;

    public BubbleToggleWidgetDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "widgetId");
        this.listOfBubbleToggleDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, BubbleToggleDto.class), emptySet, "toggles");
        this.nullableBooleanAdapter = moshi.adapter(Boolean.class, emptySet, "isMultichoice");
        this.nullableTooltipDtoAdapter = moshi.adapter(TooltipDto.class, emptySet, "tooltip");
        this.viewModeDtoAdapter = moshi.adapter(BubbleToggleWidgetDto.ViewModeDto.class, emptySet, "viewMode");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final BubbleToggleWidgetDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        int i = -1;
        String str = null;
        List<BubbleToggleDto> list = null;
        String str2 = null;
        Boolean bool = null;
        TooltipDto tooltipDto = null;
        BubbleToggleWidgetDto.ViewModeDto viewModeDto = null;
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
                    list = this.listOfBubbleToggleDtoAdapter.fromJson(jsonReader);
                    if (list == null) {
                        throw Util.unexpectedNull("toggles", "toggles", jsonReader);
                    }
                    break;
                case 2:
                    str2 = this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        throw Util.unexpectedNull("formStateKey", "form_state_key", jsonReader);
                    }
                    break;
                case 3:
                    bool = this.nullableBooleanAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    tooltipDto = this.nullableTooltipDtoAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    viewModeDto = this.viewModeDtoAdapter.fromJson(jsonReader);
                    if (viewModeDto == null) {
                        throw Util.unexpectedNull("viewMode", "view_mode", jsonReader);
                    }
                    i = -33;
                    break;
            }
        }
        jsonReader.endObject();
        if (i == -33) {
            BubbleToggleWidgetDto.ViewModeDto viewModeDto2 = viewModeDto;
            TooltipDto tooltipDto2 = tooltipDto;
            Boolean bool2 = bool;
            String str3 = str2;
            List<BubbleToggleDto> list2 = list;
            String str4 = str;
            if (str4 == null) {
                throw Util.missingProperty("widgetId", "widget_id", jsonReader);
            }
            if (list2 == null) {
                throw Util.missingProperty("toggles", "toggles", jsonReader);
            }
            if (str3 != null) {
                return new BubbleToggleWidgetDto(str4, list2, str3, bool2, tooltipDto2, viewModeDto2);
            }
            throw Util.missingProperty("formStateKey", "form_state_key", jsonReader);
        }
        BubbleToggleWidgetDto.ViewModeDto viewModeDto3 = viewModeDto;
        TooltipDto tooltipDto3 = tooltipDto;
        Boolean bool3 = bool;
        String str5 = str2;
        List<BubbleToggleDto> list3 = list;
        String str6 = str;
        Constructor<BubbleToggleWidgetDto> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = BubbleToggleWidgetDto.class.getDeclaredConstructor(String.class, List.class, String.class, Boolean.class, TooltipDto.class, BubbleToggleWidgetDto.ViewModeDto.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        if (str6 == null) {
            throw Util.missingProperty("widgetId", "widget_id", jsonReader);
        }
        if (list3 == null) {
            throw Util.missingProperty("toggles", "toggles", jsonReader);
        }
        if (str5 != null) {
            return constructor.newInstance(str6, list3, str5, bool3, tooltipDto3, viewModeDto3, Integer.valueOf(i), null);
        }
        throw Util.missingProperty("formStateKey", "form_state_key", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, BubbleToggleWidgetDto bubbleToggleWidgetDto) {
        BubbleToggleWidgetDto bubbleToggleWidgetDto2 = bubbleToggleWidgetDto;
        if (bubbleToggleWidgetDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("widget_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) bubbleToggleWidgetDto2.getWidgetId());
        jsonWriter.name("toggles");
        this.listOfBubbleToggleDtoAdapter.toJson(jsonWriter, (JsonWriter) bubbleToggleWidgetDto2.getToggles());
        jsonWriter.name("form_state_key");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) bubbleToggleWidgetDto2.getFormStateKey());
        jsonWriter.name("is_multichoice");
        this.nullableBooleanAdapter.toJson(jsonWriter, (JsonWriter) bubbleToggleWidgetDto2.isMultichoice());
        jsonWriter.name("tooltip");
        this.nullableTooltipDtoAdapter.toJson(jsonWriter, (JsonWriter) bubbleToggleWidgetDto2.getTooltip());
        jsonWriter.name("view_mode");
        this.viewModeDtoAdapter.toJson(jsonWriter, (JsonWriter) bubbleToggleWidgetDto2.getViewMode());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(43, "GeneratedJsonAdapter(BubbleToggleWidgetDto)");
    }
}
