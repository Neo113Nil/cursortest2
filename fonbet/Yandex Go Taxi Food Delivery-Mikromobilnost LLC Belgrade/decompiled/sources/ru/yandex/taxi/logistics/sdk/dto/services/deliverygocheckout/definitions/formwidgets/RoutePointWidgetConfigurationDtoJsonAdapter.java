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

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/RoutePointWidgetConfigurationDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/RoutePointWidgetConfigurationDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/RoutePointWidgetDto;", "routePointWidgetDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "booleanAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class RoutePointWidgetConfigurationDtoJsonAdapter extends JsonAdapter<RoutePointWidgetConfigurationDto> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<RoutePointWidgetConfigurationDto> constructorRef;
    private final JsonReader.Options options = JsonReader.Options.of("widget", "position_changing_available", "removal_available");
    private final JsonAdapter<RoutePointWidgetDto> routePointWidgetDtoAdapter;

    public RoutePointWidgetConfigurationDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.routePointWidgetDtoAdapter = moshi.adapter(RoutePointWidgetDto.class, emptySet, "widget");
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, emptySet, "positionChangingAvailable");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final RoutePointWidgetConfigurationDto fromJson(JsonReader jsonReader) {
        Boolean bool = Boolean.FALSE;
        jsonReader.beginObject();
        Boolean bool2 = bool;
        RoutePointWidgetDto routePointWidgetDto = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                routePointWidgetDto = this.routePointWidgetDtoAdapter.fromJson(jsonReader);
                if (routePointWidgetDto == null) {
                    throw Util.unexpectedNull("widget", "widget", jsonReader);
                }
            } else if (selectName == 1) {
                bool = this.booleanAdapter.fromJson(jsonReader);
                if (bool == null) {
                    throw Util.unexpectedNull("positionChangingAvailable", "position_changing_available", jsonReader);
                }
                i &= -3;
            } else if (selectName == 2) {
                bool2 = this.booleanAdapter.fromJson(jsonReader);
                if (bool2 == null) {
                    throw Util.unexpectedNull("removalAvailable", "removal_available", jsonReader);
                }
                i &= -5;
            } else {
                continue;
            }
        }
        jsonReader.endObject();
        if (i == -7) {
            if (routePointWidgetDto != null) {
                return new RoutePointWidgetConfigurationDto(routePointWidgetDto, bool.booleanValue(), bool2.booleanValue());
            }
            throw Util.missingProperty("widget", "widget", jsonReader);
        }
        Constructor<RoutePointWidgetConfigurationDto> constructor = this.constructorRef;
        if (constructor == null) {
            Class cls = Integer.TYPE;
            Class<?> cls2 = Util.DEFAULT_CONSTRUCTOR_MARKER;
            Class cls3 = Boolean.TYPE;
            constructor = RoutePointWidgetConfigurationDto.class.getDeclaredConstructor(RoutePointWidgetDto.class, cls3, cls3, cls, cls2);
            this.constructorRef = constructor;
        }
        if (routePointWidgetDto != null) {
            return constructor.newInstance(routePointWidgetDto, bool, bool2, Integer.valueOf(i), null);
        }
        throw Util.missingProperty("widget", "widget", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, RoutePointWidgetConfigurationDto routePointWidgetConfigurationDto) {
        RoutePointWidgetConfigurationDto routePointWidgetConfigurationDto2 = routePointWidgetConfigurationDto;
        if (routePointWidgetConfigurationDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("widget");
        this.routePointWidgetDtoAdapter.toJson(jsonWriter, (JsonWriter) routePointWidgetConfigurationDto2.getWidget());
        jsonWriter.name("position_changing_available");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(routePointWidgetConfigurationDto2.getPositionChangingAvailable()));
        jsonWriter.name("removal_available");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(routePointWidgetConfigurationDto2.getRemovalAvailable()));
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(54, "GeneratedJsonAdapter(RoutePointWidgetConfigurationDto)");
    }
}
