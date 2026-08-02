package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.adjust.sdk.Constants;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.CoordinateSourceDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.MapPinDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.PaddingsDto;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\fR\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\fR\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\fR\u001e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/MiniMapWidgetDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/MiniMapWidgetDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableIntAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/CoordinateSourceDto;", "coordinateSourceDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/MapPinDto;", "nullableMapPinDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/PaddingsDto;", "nullablePaddingsDtoAdapter", "", "booleanAdapter", "nullableStringAdapter", "", "nullableAnyAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MiniMapWidgetDtoJsonAdapter extends JsonAdapter<MiniMapWidgetDto> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<MiniMapWidgetDto> constructorRef;
    private final JsonAdapter<CoordinateSourceDto> coordinateSourceDtoAdapter;
    private final JsonAdapter<Object> nullableAnyAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<MapPinDto> nullableMapPinDtoAdapter;
    private final JsonAdapter<PaddingsDto> nullablePaddingsDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("widget_id", "zoom", "coordinate_source", "pin", "paddings", BackendConfig.Restrictions.ENABLED, "metrica_label", Constants.REFERRER_API_META);
    private final JsonAdapter<String> stringAdapter;

    public MiniMapWidgetDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "widgetId");
        this.nullableIntAdapter = moshi.adapter(Integer.class, emptySet, "zoom");
        this.coordinateSourceDtoAdapter = moshi.adapter(CoordinateSourceDto.class, emptySet, "coordinateSource");
        this.nullableMapPinDtoAdapter = moshi.adapter(MapPinDto.class, emptySet, "pin");
        this.nullablePaddingsDtoAdapter = moshi.adapter(PaddingsDto.class, emptySet, "paddings");
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, emptySet, BackendConfig.Restrictions.ENABLED);
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "metricaLabel");
        this.nullableAnyAdapter = moshi.adapter(Object.class, emptySet, Constants.REFERRER_API_META);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final MiniMapWidgetDto fromJson(JsonReader jsonReader) {
        Integer num;
        Boolean bool = Boolean.FALSE;
        jsonReader.beginObject();
        CoordinateSourceDto coordinateSourceDto = null;
        Boolean bool2 = bool;
        Integer num2 = null;
        String str = null;
        String str2 = null;
        Object obj = null;
        PaddingsDto paddingsDto = null;
        int i = -1;
        MapPinDto mapPinDto = null;
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
                    num2 = this.nullableIntAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    coordinateSourceDto = this.coordinateSourceDtoAdapter.fromJson(jsonReader);
                    if (coordinateSourceDto == null) {
                        throw Util.unexpectedNull("coordinateSource", "coordinate_source", jsonReader);
                    }
                    break;
                case 3:
                    mapPinDto = this.nullableMapPinDtoAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    paddingsDto = this.nullablePaddingsDtoAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    bool2 = this.booleanAdapter.fromJson(jsonReader);
                    if (bool2 == null) {
                        throw Util.unexpectedNull(BackendConfig.Restrictions.ENABLED, BackendConfig.Restrictions.ENABLED, jsonReader);
                    }
                    i = -33;
                    break;
                case 6:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 7:
                    obj = this.nullableAnyAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.endObject();
        if (i == -33) {
            if (str == null) {
                throw Util.missingProperty("widgetId", "widget_id", jsonReader);
            }
            if (coordinateSourceDto == null) {
                throw Util.missingProperty("coordinateSource", "coordinate_source", jsonReader);
            }
            return new MiniMapWidgetDto(str, num2, coordinateSourceDto, mapPinDto, paddingsDto, bool2.booleanValue(), str2, obj);
        }
        Constructor<MiniMapWidgetDto> constructor = this.constructorRef;
        if (constructor == null) {
            num = num2;
            constructor = MiniMapWidgetDto.class.getDeclaredConstructor(String.class, Integer.class, CoordinateSourceDto.class, MapPinDto.class, PaddingsDto.class, Boolean.TYPE, String.class, Object.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        } else {
            num = num2;
        }
        Constructor<MiniMapWidgetDto> constructor2 = constructor;
        if (str == null) {
            throw Util.missingProperty("widgetId", "widget_id", jsonReader);
        }
        if (coordinateSourceDto == null) {
            throw Util.missingProperty("coordinateSource", "coordinate_source", jsonReader);
        }
        return constructor2.newInstance(str, num, coordinateSourceDto, mapPinDto, paddingsDto, bool2, str2, obj, Integer.valueOf(i), null);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, MiniMapWidgetDto miniMapWidgetDto) {
        MiniMapWidgetDto miniMapWidgetDto2 = miniMapWidgetDto;
        if (miniMapWidgetDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("widget_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) miniMapWidgetDto2.getWidgetId());
        jsonWriter.name("zoom");
        this.nullableIntAdapter.toJson(jsonWriter, (JsonWriter) miniMapWidgetDto2.getZoom());
        jsonWriter.name("coordinate_source");
        this.coordinateSourceDtoAdapter.toJson(jsonWriter, (JsonWriter) miniMapWidgetDto2.getCoordinateSource());
        jsonWriter.name("pin");
        this.nullableMapPinDtoAdapter.toJson(jsonWriter, (JsonWriter) miniMapWidgetDto2.getPin());
        jsonWriter.name("paddings");
        this.nullablePaddingsDtoAdapter.toJson(jsonWriter, (JsonWriter) miniMapWidgetDto2.getPaddings());
        jsonWriter.name(BackendConfig.Restrictions.ENABLED);
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(miniMapWidgetDto2.getEnabled()));
        jsonWriter.name("metrica_label");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) miniMapWidgetDto2.getMetricaLabel());
        jsonWriter.name(Constants.REFERRER_API_META);
        this.nullableAnyAdapter.toJson(jsonWriter, (JsonWriter) miniMapWidgetDto2.getMeta());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(38, "GeneratedJsonAdapter(MiniMapWidgetDto)");
    }
}
