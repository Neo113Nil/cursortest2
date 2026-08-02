package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import defpackage.xvz;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.AddressFlowDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.AddressRouteTypeDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003JG\u0010\u001c\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000f¨\u0006#"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/EditableRouteWidgetsDto;", "", "widgetId", "", "routePointWidgets", "", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/RoutePointWidgetConfigurationDto;", "routeType", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AddressRouteTypeDto;", "addressFlow", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AddressFlowDto;", "metricaLabel", "<init>", "(Ljava/lang/String;Ljava/util/List;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AddressRouteTypeDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AddressFlowDto;Ljava/lang/String;)V", "getWidgetId", "()Ljava/lang/String;", "getRoutePointWidgets", "()Ljava/util/List;", "getRouteType", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AddressRouteTypeDto;", "getAddressFlow", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AddressFlowDto;", "getMetricaLabel", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class EditableRouteWidgetsDto {
    private final AddressFlowDto addressFlow;
    private final String metricaLabel;
    private final List<RoutePointWidgetConfigurationDto> routePointWidgets;
    private final AddressRouteTypeDto routeType;
    private final String widgetId;

    public EditableRouteWidgetsDto(@Json(name = "widget_id") String str, @Json(name = "route_point_widgets") List<RoutePointWidgetConfigurationDto> list, @Json(name = "route_type") AddressRouteTypeDto addressRouteTypeDto, @Json(name = "address_flow") AddressFlowDto addressFlowDto, @Json(name = "metrica_label") String str2) {
        this.widgetId = str;
        this.routePointWidgets = list;
        this.routeType = addressRouteTypeDto;
        this.addressFlow = addressFlowDto;
        this.metricaLabel = str2;
    }

    public static /* synthetic */ EditableRouteWidgetsDto copy$default(EditableRouteWidgetsDto editableRouteWidgetsDto, String str, List list, AddressRouteTypeDto addressRouteTypeDto, AddressFlowDto addressFlowDto, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = editableRouteWidgetsDto.widgetId;
        }
        if ((i & 2) != 0) {
            list = editableRouteWidgetsDto.routePointWidgets;
        }
        if ((i & 4) != 0) {
            addressRouteTypeDto = editableRouteWidgetsDto.routeType;
        }
        if ((i & 8) != 0) {
            addressFlowDto = editableRouteWidgetsDto.addressFlow;
        }
        if ((i & 16) != 0) {
            str2 = editableRouteWidgetsDto.metricaLabel;
        }
        String str3 = str2;
        AddressRouteTypeDto addressRouteTypeDto2 = addressRouteTypeDto;
        return editableRouteWidgetsDto.copy(str, list, addressRouteTypeDto2, addressFlowDto, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getWidgetId() {
        return this.widgetId;
    }

    public final List<RoutePointWidgetConfigurationDto> component2() {
        return this.routePointWidgets;
    }

    /* renamed from: component3, reason: from getter */
    public final AddressRouteTypeDto getRouteType() {
        return this.routeType;
    }

    /* renamed from: component4, reason: from getter */
    public final AddressFlowDto getAddressFlow() {
        return this.addressFlow;
    }

    /* renamed from: component5, reason: from getter */
    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final EditableRouteWidgetsDto copy(@Json(name = "widget_id") String widgetId, @Json(name = "route_point_widgets") List<RoutePointWidgetConfigurationDto> routePointWidgets, @Json(name = "route_type") AddressRouteTypeDto routeType, @Json(name = "address_flow") AddressFlowDto addressFlow, @Json(name = "metrica_label") String metricaLabel) {
        return new EditableRouteWidgetsDto(widgetId, routePointWidgets, routeType, addressFlow, metricaLabel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EditableRouteWidgetsDto)) {
            return false;
        }
        EditableRouteWidgetsDto editableRouteWidgetsDto = (EditableRouteWidgetsDto) other;
        return jl40.l(this.widgetId, editableRouteWidgetsDto.widgetId) && jl40.l(this.routePointWidgets, editableRouteWidgetsDto.routePointWidgets) && jl40.l(this.routeType, editableRouteWidgetsDto.routeType) && jl40.l(this.addressFlow, editableRouteWidgetsDto.addressFlow) && jl40.l(this.metricaLabel, editableRouteWidgetsDto.metricaLabel);
    }

    public final AddressFlowDto getAddressFlow() {
        return this.addressFlow;
    }

    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final List<RoutePointWidgetConfigurationDto> getRoutePointWidgets() {
        return this.routePointWidgets;
    }

    public final AddressRouteTypeDto getRouteType() {
        return this.routeType;
    }

    public final String getWidgetId() {
        return this.widgetId;
    }

    public int hashCode() {
        int c = unr0.c(this.widgetId.hashCode() * 31, 31, this.routePointWidgets);
        AddressRouteTypeDto addressRouteTypeDto = this.routeType;
        int hashCode = (c + (addressRouteTypeDto == null ? 0 : addressRouteTypeDto.hashCode())) * 31;
        AddressFlowDto addressFlowDto = this.addressFlow;
        int hashCode2 = (hashCode + (addressFlowDto == null ? 0 : addressFlowDto.hashCode())) * 31;
        String str = this.metricaLabel;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        String str = this.widgetId;
        List<RoutePointWidgetConfigurationDto> list = this.routePointWidgets;
        AddressRouteTypeDto addressRouteTypeDto = this.routeType;
        AddressFlowDto addressFlowDto = this.addressFlow;
        String str2 = this.metricaLabel;
        StringBuilder r = xvz.r("EditableRouteWidgetsDto(widgetId=", str, ", routePointWidgets=", list, ", routeType=");
        r.append(addressRouteTypeDto);
        r.append(", addressFlow=");
        r.append(addressFlowDto);
        r.append(", metricaLabel=");
        return oyr.t(r, str2, Extension.C_BRAKE);
    }
}
