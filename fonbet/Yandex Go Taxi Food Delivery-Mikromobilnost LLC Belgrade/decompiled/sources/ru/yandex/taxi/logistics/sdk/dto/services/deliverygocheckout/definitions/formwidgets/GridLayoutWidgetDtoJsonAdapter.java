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
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.PaddingsDto;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR \u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\fR\u001c\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\fR\u001e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/GridLayoutWidgetDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/GridLayoutWidgetDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/GridLayoutSizeDto;", "gridLayoutSizeDtoAdapter", "", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/GridItemDto;", "listOfGridItemDtoAdapter", "", "intAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/PaddingsDto;", "paddingsDtoAdapter", "nullableStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class GridLayoutWidgetDtoJsonAdapter extends JsonAdapter<GridLayoutWidgetDto> {
    private volatile Constructor<GridLayoutWidgetDto> constructorRef;
    private final JsonAdapter<GridLayoutSizeDto> gridLayoutSizeDtoAdapter;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<List<GridItemDto>> listOfGridItemDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("widget_id", "size", "items", "line_spacing", "column_spacing", "paddings", "metrica_label");
    private final JsonAdapter<PaddingsDto> paddingsDtoAdapter;
    private final JsonAdapter<String> stringAdapter;

    public GridLayoutWidgetDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "widgetId");
        this.gridLayoutSizeDtoAdapter = moshi.adapter(GridLayoutSizeDto.class, emptySet, "size");
        this.listOfGridItemDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, GridItemDto.class), emptySet, "items");
        this.intAdapter = moshi.adapter(Integer.TYPE, emptySet, "lineSpacing");
        this.paddingsDtoAdapter = moshi.adapter(PaddingsDto.class, emptySet, "paddings");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "metricaLabel");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final GridLayoutWidgetDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        int i = -1;
        Integer num = 0;
        Integer num2 = null;
        String str = null;
        GridLayoutSizeDto gridLayoutSizeDto = null;
        List<GridItemDto> list = null;
        PaddingsDto paddingsDto = null;
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
                    gridLayoutSizeDto = this.gridLayoutSizeDtoAdapter.fromJson(jsonReader);
                    if (gridLayoutSizeDto == null) {
                        throw Util.unexpectedNull("size", "size", jsonReader);
                    }
                    break;
                case 2:
                    list = this.listOfGridItemDtoAdapter.fromJson(jsonReader);
                    if (list == null) {
                        throw Util.unexpectedNull("items", "items", jsonReader);
                    }
                    break;
                case 3:
                    num = this.intAdapter.fromJson(jsonReader);
                    if (num == null) {
                        throw Util.unexpectedNull("lineSpacing", "line_spacing", jsonReader);
                    }
                    i &= -9;
                    break;
                case 4:
                    num2 = this.intAdapter.fromJson(jsonReader);
                    if (num2 == null) {
                        throw Util.unexpectedNull("columnSpacing", "column_spacing", jsonReader);
                    }
                    i &= -17;
                    break;
                case 5:
                    paddingsDto = this.paddingsDtoAdapter.fromJson(jsonReader);
                    if (paddingsDto == null) {
                        throw Util.unexpectedNull("paddings", "paddings", jsonReader);
                    }
                    break;
                case 6:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.endObject();
        if (i == -25) {
            if (str == null) {
                throw Util.missingProperty("widgetId", "widget_id", jsonReader);
            }
            if (gridLayoutSizeDto == null) {
                throw Util.missingProperty("size", "size", jsonReader);
            }
            if (list == null) {
                throw Util.missingProperty("items", "items", jsonReader);
            }
            int intValue = num.intValue();
            int intValue2 = num2.intValue();
            if (paddingsDto != null) {
                return new GridLayoutWidgetDto(str, gridLayoutSizeDto, list, intValue, intValue2, paddingsDto, str2);
            }
            throw Util.missingProperty("paddings", "paddings", jsonReader);
        }
        Constructor<GridLayoutWidgetDto> constructor = this.constructorRef;
        if (constructor == null) {
            Class<?> cls = Util.DEFAULT_CONSTRUCTOR_MARKER;
            Class cls2 = Integer.TYPE;
            constructor = GridLayoutWidgetDto.class.getDeclaredConstructor(String.class, GridLayoutSizeDto.class, List.class, cls2, cls2, PaddingsDto.class, String.class, cls2, cls);
            this.constructorRef = constructor;
        }
        Constructor<GridLayoutWidgetDto> constructor2 = constructor;
        if (str == null) {
            throw Util.missingProperty("widgetId", "widget_id", jsonReader);
        }
        if (gridLayoutSizeDto == null) {
            throw Util.missingProperty("size", "size", jsonReader);
        }
        if (list == null) {
            throw Util.missingProperty("items", "items", jsonReader);
        }
        if (paddingsDto == null) {
            throw Util.missingProperty("paddings", "paddings", jsonReader);
        }
        return constructor2.newInstance(str, gridLayoutSizeDto, list, num, num2, paddingsDto, str2, Integer.valueOf(i), null);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, GridLayoutWidgetDto gridLayoutWidgetDto) {
        GridLayoutWidgetDto gridLayoutWidgetDto2 = gridLayoutWidgetDto;
        if (gridLayoutWidgetDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("widget_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) gridLayoutWidgetDto2.getWidgetId());
        jsonWriter.name("size");
        this.gridLayoutSizeDtoAdapter.toJson(jsonWriter, (JsonWriter) gridLayoutWidgetDto2.getSize());
        jsonWriter.name("items");
        this.listOfGridItemDtoAdapter.toJson(jsonWriter, (JsonWriter) gridLayoutWidgetDto2.getItems());
        jsonWriter.name("line_spacing");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(gridLayoutWidgetDto2.getLineSpacing()));
        jsonWriter.name("column_spacing");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(gridLayoutWidgetDto2.getColumnSpacing()));
        jsonWriter.name("paddings");
        this.paddingsDtoAdapter.toJson(jsonWriter, (JsonWriter) gridLayoutWidgetDto2.getPaddings());
        jsonWriter.name("metrica_label");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) gridLayoutWidgetDto2.getMetricaLabel());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(41, "GeneratedJsonAdapter(GridLayoutWidgetDto)");
    }
}
