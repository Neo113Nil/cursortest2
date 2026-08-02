package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.adjust.sdk.Constants;
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
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.HorizontalPaddingsDto;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\fR\u001c\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\fR\u001e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/HorizontalStackWidgetDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/HorizontalStackWidgetDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/HorizontalStackWidgetItemDto;", "listOfHorizontalStackWidgetItemDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/HorizontalPaddingsDto;", "nullableHorizontalPaddingsDtoAdapter", "", "nullableAnyAdapter", "", "intAdapter", "nullableStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class HorizontalStackWidgetDtoJsonAdapter extends JsonAdapter<HorizontalStackWidgetDto> {
    private volatile Constructor<HorizontalStackWidgetDto> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<List<HorizontalStackWidgetItemDto>> listOfHorizontalStackWidgetItemDtoAdapter;
    private final JsonAdapter<Object> nullableAnyAdapter;
    private final JsonAdapter<HorizontalPaddingsDto> nullableHorizontalPaddingsDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("widget_id", "arranged_items", "horizontal_paddings", Constants.REFERRER_API_META, "spacing_width", "metrica_label");
    private final JsonAdapter<String> stringAdapter;

    public HorizontalStackWidgetDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "widgetId");
        this.listOfHorizontalStackWidgetItemDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, HorizontalStackWidgetItemDto.class), emptySet, "arrangedItems");
        this.nullableHorizontalPaddingsDtoAdapter = moshi.adapter(HorizontalPaddingsDto.class, emptySet, "horizontalPaddings");
        this.nullableAnyAdapter = moshi.adapter(Object.class, emptySet, Constants.REFERRER_API_META);
        this.intAdapter = moshi.adapter(Integer.TYPE, emptySet, "spacingWidth");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "metricaLabel");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final HorizontalStackWidgetDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        HorizontalPaddingsDto horizontalPaddingsDto = null;
        Integer num = 0;
        List<HorizontalStackWidgetItemDto> list = null;
        String str = null;
        String str2 = null;
        int i = -1;
        Object obj = null;
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
                    list = this.listOfHorizontalStackWidgetItemDtoAdapter.fromJson(jsonReader);
                    if (list == null) {
                        throw Util.unexpectedNull("arrangedItems", "arranged_items", jsonReader);
                    }
                    break;
                case 2:
                    horizontalPaddingsDto = this.nullableHorizontalPaddingsDtoAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    obj = this.nullableAnyAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    num = this.intAdapter.fromJson(jsonReader);
                    if (num == null) {
                        throw Util.unexpectedNull("spacingWidth", "spacing_width", jsonReader);
                    }
                    i = -17;
                    break;
                case 5:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.endObject();
        if (i == -17) {
            if (str == null) {
                throw Util.missingProperty("widgetId", "widget_id", jsonReader);
            }
            if (list != null) {
                return new HorizontalStackWidgetDto(str, list, horizontalPaddingsDto, obj, num.intValue(), str2);
            }
            throw Util.missingProperty("arrangedItems", "arranged_items", jsonReader);
        }
        String str3 = str;
        Constructor<HorizontalStackWidgetDto> constructor = this.constructorRef;
        if (constructor == null) {
            Class<?> cls = Util.DEFAULT_CONSTRUCTOR_MARKER;
            Class cls2 = Integer.TYPE;
            constructor = HorizontalStackWidgetDto.class.getDeclaredConstructor(String.class, List.class, HorizontalPaddingsDto.class, Object.class, cls2, String.class, cls2, cls);
            this.constructorRef = constructor;
        }
        Constructor<HorizontalStackWidgetDto> constructor2 = constructor;
        if (str3 == null) {
            throw Util.missingProperty("widgetId", "widget_id", jsonReader);
        }
        if (list == null) {
            throw Util.missingProperty("arrangedItems", "arranged_items", jsonReader);
        }
        return constructor2.newInstance(str3, list, horizontalPaddingsDto, obj, num, str2, Integer.valueOf(i), null);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, HorizontalStackWidgetDto horizontalStackWidgetDto) {
        HorizontalStackWidgetDto horizontalStackWidgetDto2 = horizontalStackWidgetDto;
        if (horizontalStackWidgetDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("widget_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) horizontalStackWidgetDto2.getWidgetId());
        jsonWriter.name("arranged_items");
        this.listOfHorizontalStackWidgetItemDtoAdapter.toJson(jsonWriter, (JsonWriter) horizontalStackWidgetDto2.getArrangedItems());
        jsonWriter.name("horizontal_paddings");
        this.nullableHorizontalPaddingsDtoAdapter.toJson(jsonWriter, (JsonWriter) horizontalStackWidgetDto2.getHorizontalPaddings());
        jsonWriter.name(Constants.REFERRER_API_META);
        this.nullableAnyAdapter.toJson(jsonWriter, (JsonWriter) horizontalStackWidgetDto2.getMeta());
        jsonWriter.name("spacing_width");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(horizontalStackWidgetDto2.getSpacingWidth()));
        jsonWriter.name("metrica_label");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) horizontalStackWidgetDto2.getMetricaLabel());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(46, "GeneratedJsonAdapter(HorizontalStackWidgetDto)");
    }
}
