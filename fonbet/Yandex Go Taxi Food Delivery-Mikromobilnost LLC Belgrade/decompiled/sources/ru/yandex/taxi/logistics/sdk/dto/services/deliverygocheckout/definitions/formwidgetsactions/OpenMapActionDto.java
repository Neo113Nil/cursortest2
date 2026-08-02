package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.AddressFlowDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.AddressRouteTypeDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/OpenMapActionDto;", "", "metricaLabel", "", "routeType", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AddressRouteTypeDto;", "addressFlow", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AddressFlowDto;", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AddressRouteTypeDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AddressFlowDto;)V", "getMetricaLabel", "()Ljava/lang/String;", "getRouteType", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AddressRouteTypeDto;", "getAddressFlow", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AddressFlowDto;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class OpenMapActionDto {
    private final AddressFlowDto addressFlow;
    private final String metricaLabel;
    private final AddressRouteTypeDto routeType;

    public OpenMapActionDto(@Json(name = "metrica_label") String str, @Json(name = "route_type") AddressRouteTypeDto addressRouteTypeDto, @Json(name = "address_flow") AddressFlowDto addressFlowDto) {
        this.metricaLabel = str;
        this.routeType = addressRouteTypeDto;
        this.addressFlow = addressFlowDto;
    }

    public static /* synthetic */ OpenMapActionDto copy$default(OpenMapActionDto openMapActionDto, String str, AddressRouteTypeDto addressRouteTypeDto, AddressFlowDto addressFlowDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = openMapActionDto.metricaLabel;
        }
        if ((i & 2) != 0) {
            addressRouteTypeDto = openMapActionDto.routeType;
        }
        if ((i & 4) != 0) {
            addressFlowDto = openMapActionDto.addressFlow;
        }
        return openMapActionDto.copy(str, addressRouteTypeDto, addressFlowDto);
    }

    /* renamed from: component1, reason: from getter */
    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    /* renamed from: component2, reason: from getter */
    public final AddressRouteTypeDto getRouteType() {
        return this.routeType;
    }

    /* renamed from: component3, reason: from getter */
    public final AddressFlowDto getAddressFlow() {
        return this.addressFlow;
    }

    public final OpenMapActionDto copy(@Json(name = "metrica_label") String metricaLabel, @Json(name = "route_type") AddressRouteTypeDto routeType, @Json(name = "address_flow") AddressFlowDto addressFlow) {
        return new OpenMapActionDto(metricaLabel, routeType, addressFlow);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OpenMapActionDto)) {
            return false;
        }
        OpenMapActionDto openMapActionDto = (OpenMapActionDto) other;
        return jl40.l(this.metricaLabel, openMapActionDto.metricaLabel) && jl40.l(this.routeType, openMapActionDto.routeType) && jl40.l(this.addressFlow, openMapActionDto.addressFlow);
    }

    public final AddressFlowDto getAddressFlow() {
        return this.addressFlow;
    }

    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final AddressRouteTypeDto getRouteType() {
        return this.routeType;
    }

    public int hashCode() {
        String str = this.metricaLabel;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        AddressRouteTypeDto addressRouteTypeDto = this.routeType;
        int hashCode2 = (hashCode + (addressRouteTypeDto == null ? 0 : addressRouteTypeDto.hashCode())) * 31;
        AddressFlowDto addressFlowDto = this.addressFlow;
        return hashCode2 + (addressFlowDto != null ? addressFlowDto.hashCode() : 0);
    }

    public String toString() {
        return "OpenMapActionDto(metricaLabel=" + this.metricaLabel + ", routeType=" + this.routeType + ", addressFlow=" + this.addressFlow + Extension.C_BRAKE;
    }
}
