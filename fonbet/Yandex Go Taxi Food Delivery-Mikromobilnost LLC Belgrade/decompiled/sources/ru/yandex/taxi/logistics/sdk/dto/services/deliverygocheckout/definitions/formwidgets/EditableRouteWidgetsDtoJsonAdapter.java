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
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.AddressFlowDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.AddressRouteTypeDto;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\f¨\u0006\u0015"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/EditableRouteWidgetsDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/EditableRouteWidgetsDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/RoutePointWidgetConfigurationDto;", "listOfRoutePointWidgetConfigurationDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AddressRouteTypeDto;", "nullableAddressRouteTypeDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AddressFlowDto;", "nullableAddressFlowDtoAdapter", "nullableStringAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class EditableRouteWidgetsDtoJsonAdapter extends JsonAdapter<EditableRouteWidgetsDto> {
    private final JsonAdapter<List<RoutePointWidgetConfigurationDto>> listOfRoutePointWidgetConfigurationDtoAdapter;
    private final JsonAdapter<AddressFlowDto> nullableAddressFlowDtoAdapter;
    private final JsonAdapter<AddressRouteTypeDto> nullableAddressRouteTypeDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("widget_id", "route_point_widgets", "route_type", "address_flow", "metrica_label");
    private final JsonAdapter<String> stringAdapter;

    public EditableRouteWidgetsDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "widgetId");
        this.listOfRoutePointWidgetConfigurationDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, RoutePointWidgetConfigurationDto.class), emptySet, "routePointWidgets");
        this.nullableAddressRouteTypeDtoAdapter = moshi.adapter(AddressRouteTypeDto.class, emptySet, "routeType");
        this.nullableAddressFlowDtoAdapter = moshi.adapter(AddressFlowDto.class, emptySet, "addressFlow");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "metricaLabel");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final EditableRouteWidgetsDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        List<RoutePointWidgetConfigurationDto> list = null;
        AddressRouteTypeDto addressRouteTypeDto = null;
        AddressFlowDto addressFlowDto = null;
        String str2 = null;
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
                list = this.listOfRoutePointWidgetConfigurationDtoAdapter.fromJson(jsonReader);
                if (list == null) {
                    throw Util.unexpectedNull("routePointWidgets", "route_point_widgets", jsonReader);
                }
            } else if (selectName == 2) {
                addressRouteTypeDto = this.nullableAddressRouteTypeDtoAdapter.fromJson(jsonReader);
            } else if (selectName == 3) {
                addressFlowDto = this.nullableAddressFlowDtoAdapter.fromJson(jsonReader);
            } else if (selectName == 4) {
                str2 = this.nullableStringAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("widgetId", "widget_id", jsonReader);
        }
        if (list != null) {
            return new EditableRouteWidgetsDto(str, list, addressRouteTypeDto, addressFlowDto, str2);
        }
        throw Util.missingProperty("routePointWidgets", "route_point_widgets", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, EditableRouteWidgetsDto editableRouteWidgetsDto) {
        EditableRouteWidgetsDto editableRouteWidgetsDto2 = editableRouteWidgetsDto;
        if (editableRouteWidgetsDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("widget_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) editableRouteWidgetsDto2.getWidgetId());
        jsonWriter.name("route_point_widgets");
        this.listOfRoutePointWidgetConfigurationDtoAdapter.toJson(jsonWriter, (JsonWriter) editableRouteWidgetsDto2.getRoutePointWidgets());
        jsonWriter.name("route_type");
        this.nullableAddressRouteTypeDtoAdapter.toJson(jsonWriter, (JsonWriter) editableRouteWidgetsDto2.getRouteType());
        jsonWriter.name("address_flow");
        this.nullableAddressFlowDtoAdapter.toJson(jsonWriter, (JsonWriter) editableRouteWidgetsDto2.getAddressFlow());
        jsonWriter.name("metrica_label");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) editableRouteWidgetsDto2.getMetricaLabel());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(45, "GeneratedJsonAdapter(EditableRouteWidgetsDto)");
    }
}
