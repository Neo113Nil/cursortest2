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
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.HorizontalPaddingsDto;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR \u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\fR\u001c\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\fR\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\f¨\u0006\u0018"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/CarouselItemsWidgetDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/CarouselItemsWidgetDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/HorizontalPaddingsDto;", "nullableHorizontalPaddingsDtoAdapter", "", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/CarouselItemDto;", "listOfCarouselItemDtoAdapter", "", "intAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/CarouselIndicatorsStyleDto;", "nullableCarouselIndicatorsStyleDtoAdapter", "nullableIntAdapter", "nullableStringAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CarouselItemsWidgetDtoJsonAdapter extends JsonAdapter<CarouselItemsWidgetDto> {
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<List<CarouselItemDto>> listOfCarouselItemDtoAdapter;
    private final JsonAdapter<CarouselIndicatorsStyleDto> nullableCarouselIndicatorsStyleDtoAdapter;
    private final JsonAdapter<HorizontalPaddingsDto> nullableHorizontalPaddingsDtoAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("widget_id", "horizontal_paddings", "items", "item_height", "indicators_style", "autoscroll_interval_seconds", "metrica_label");
    private final JsonAdapter<String> stringAdapter;

    public CarouselItemsWidgetDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "widgetId");
        this.nullableHorizontalPaddingsDtoAdapter = moshi.adapter(HorizontalPaddingsDto.class, emptySet, "horizontalPaddings");
        this.listOfCarouselItemDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, CarouselItemDto.class), emptySet, "items");
        this.intAdapter = moshi.adapter(Integer.TYPE, emptySet, "itemHeight");
        this.nullableCarouselIndicatorsStyleDtoAdapter = moshi.adapter(CarouselIndicatorsStyleDto.class, emptySet, "indicatorsStyle");
        this.nullableIntAdapter = moshi.adapter(Integer.class, emptySet, "autoscrollIntervalSeconds");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "metricaLabel");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final CarouselItemsWidgetDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Integer num = null;
        String str = null;
        HorizontalPaddingsDto horizontalPaddingsDto = null;
        List<CarouselItemDto> list = null;
        CarouselIndicatorsStyleDto carouselIndicatorsStyleDto = null;
        Integer num2 = null;
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
                    horizontalPaddingsDto = this.nullableHorizontalPaddingsDtoAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    list = this.listOfCarouselItemDtoAdapter.fromJson(jsonReader);
                    if (list == null) {
                        throw Util.unexpectedNull("items", "items", jsonReader);
                    }
                    break;
                case 3:
                    num = this.intAdapter.fromJson(jsonReader);
                    if (num == null) {
                        throw Util.unexpectedNull("itemHeight", "item_height", jsonReader);
                    }
                    break;
                case 4:
                    carouselIndicatorsStyleDto = this.nullableCarouselIndicatorsStyleDtoAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    num2 = this.nullableIntAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("widgetId", "widget_id", jsonReader);
        }
        if (list == null) {
            throw Util.missingProperty("items", "items", jsonReader);
        }
        if (num != null) {
            return new CarouselItemsWidgetDto(str, horizontalPaddingsDto, list, num.intValue(), carouselIndicatorsStyleDto, num2, str2);
        }
        throw Util.missingProperty("itemHeight", "item_height", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, CarouselItemsWidgetDto carouselItemsWidgetDto) {
        CarouselItemsWidgetDto carouselItemsWidgetDto2 = carouselItemsWidgetDto;
        if (carouselItemsWidgetDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("widget_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) carouselItemsWidgetDto2.getWidgetId());
        jsonWriter.name("horizontal_paddings");
        this.nullableHorizontalPaddingsDtoAdapter.toJson(jsonWriter, (JsonWriter) carouselItemsWidgetDto2.getHorizontalPaddings());
        jsonWriter.name("items");
        this.listOfCarouselItemDtoAdapter.toJson(jsonWriter, (JsonWriter) carouselItemsWidgetDto2.getItems());
        jsonWriter.name("item_height");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(carouselItemsWidgetDto2.getItemHeight()));
        jsonWriter.name("indicators_style");
        this.nullableCarouselIndicatorsStyleDtoAdapter.toJson(jsonWriter, (JsonWriter) carouselItemsWidgetDto2.getIndicatorsStyle());
        jsonWriter.name("autoscroll_interval_seconds");
        this.nullableIntAdapter.toJson(jsonWriter, (JsonWriter) carouselItemsWidgetDto2.getAutoscrollIntervalSeconds());
        jsonWriter.name("metrica_label");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) carouselItemsWidgetDto2.getMetricaLabel());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(44, "GeneratedJsonAdapter(CarouselItemsWidgetDto)");
    }
}
