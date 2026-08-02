package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.ny61;
import defpackage.uw51;
import io.appmetrica.analytics.impl.C0553n3;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.BackgroundDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.PaddingsDto;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\fR\u001c\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\fR\u001e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/VerticalStackWidgetDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/VerticalStackWidgetDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto;", "listOfWidgetDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/BackgroundDto;", "nullableBackgroundDtoAdapter", "", "intAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/PaddingsDto;", "nullablePaddingsDtoAdapter", "nullableStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class VerticalStackWidgetDtoJsonAdapter extends JsonAdapter<VerticalStackWidgetDto> {
    private volatile Constructor<VerticalStackWidgetDto> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<List<WidgetDto>> listOfWidgetDtoAdapter;
    private final JsonAdapter<BackgroundDto> nullableBackgroundDtoAdapter;
    private final JsonAdapter<PaddingsDto> nullablePaddingsDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("widget_id", "widgets", C0553n3.g, "corner_radius", "paddings", "content_paddings", "metrica_label");
    private final JsonAdapter<String> stringAdapter;

    public VerticalStackWidgetDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "widgetId");
        this.listOfWidgetDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, WidgetDto.class), emptySet, "widgets");
        this.nullableBackgroundDtoAdapter = moshi.adapter(BackgroundDto.class, emptySet, C0553n3.g);
        this.intAdapter = moshi.adapter(Integer.TYPE, emptySet, UrbanAdsBottomSheetFragment.CORNER_RADIUS);
        this.nullablePaddingsDtoAdapter = moshi.adapter(PaddingsDto.class, emptySet, "paddings");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "metricaLabel");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final VerticalStackWidgetDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        BackgroundDto backgroundDto = null;
        int i = -1;
        Integer num = 0;
        List<WidgetDto> list = null;
        String str = null;
        PaddingsDto paddingsDto = null;
        String str2 = null;
        PaddingsDto paddingsDto2 = null;
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
                    list = this.listOfWidgetDtoAdapter.fromJson(jsonReader);
                    if (list == null) {
                        throw Util.unexpectedNull("widgets", "widgets", jsonReader);
                    }
                    break;
                case 2:
                    backgroundDto = this.nullableBackgroundDtoAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    num = this.intAdapter.fromJson(jsonReader);
                    if (num == null) {
                        throw Util.unexpectedNull(UrbanAdsBottomSheetFragment.CORNER_RADIUS, "corner_radius", jsonReader);
                    }
                    i = -9;
                    break;
                case 4:
                    paddingsDto2 = this.nullablePaddingsDtoAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    paddingsDto = this.nullablePaddingsDtoAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.endObject();
        if (i == -9) {
            if (str == null) {
                throw Util.missingProperty("widgetId", "widget_id", jsonReader);
            }
            if (list == null) {
                throw Util.missingProperty("widgets", "widgets", jsonReader);
            }
            return new VerticalStackWidgetDto(str, list, backgroundDto, num.intValue(), paddingsDto2, paddingsDto, str2);
        }
        Constructor<VerticalStackWidgetDto> constructor = this.constructorRef;
        if (constructor == null) {
            Class<?> cls = Util.DEFAULT_CONSTRUCTOR_MARKER;
            Class cls2 = Integer.TYPE;
            constructor = VerticalStackWidgetDto.class.getDeclaredConstructor(String.class, List.class, BackgroundDto.class, cls2, PaddingsDto.class, PaddingsDto.class, String.class, cls2, cls);
            this.constructorRef = constructor;
        }
        Constructor<VerticalStackWidgetDto> constructor2 = constructor;
        if (str == null) {
            throw Util.missingProperty("widgetId", "widget_id", jsonReader);
        }
        if (list == null) {
            throw Util.missingProperty("widgets", "widgets", jsonReader);
        }
        return constructor2.newInstance(str, list, backgroundDto, num, paddingsDto2, paddingsDto, str2, Integer.valueOf(i), null);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, VerticalStackWidgetDto verticalStackWidgetDto) {
        VerticalStackWidgetDto verticalStackWidgetDto2 = verticalStackWidgetDto;
        if (verticalStackWidgetDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("widget_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) verticalStackWidgetDto2.getWidgetId());
        jsonWriter.name("widgets");
        this.listOfWidgetDtoAdapter.toJson(jsonWriter, (JsonWriter) verticalStackWidgetDto2.getWidgets());
        jsonWriter.name(C0553n3.g);
        this.nullableBackgroundDtoAdapter.toJson(jsonWriter, (JsonWriter) verticalStackWidgetDto2.getBackground());
        jsonWriter.name("corner_radius");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(verticalStackWidgetDto2.getCornerRadius()));
        jsonWriter.name("paddings");
        this.nullablePaddingsDtoAdapter.toJson(jsonWriter, (JsonWriter) verticalStackWidgetDto2.getPaddings());
        jsonWriter.name("content_paddings");
        this.nullablePaddingsDtoAdapter.toJson(jsonWriter, (JsonWriter) verticalStackWidgetDto2.getContentPaddings());
        jsonWriter.name("metrica_label");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) verticalStackWidgetDto2.getMetricaLabel());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(44, "GeneratedJsonAdapter(VerticalStackWidgetDto)");
    }
}
