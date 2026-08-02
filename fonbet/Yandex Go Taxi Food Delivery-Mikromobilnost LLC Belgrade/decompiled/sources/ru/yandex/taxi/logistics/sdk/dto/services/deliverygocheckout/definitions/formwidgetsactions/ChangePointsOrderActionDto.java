package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.AddressFlowDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.AddressRouteTypeDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/ChangePointsOrderActionDto;", "", "routeType", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AddressRouteTypeDto;", "addressFlow", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AddressFlowDto;", "metricaLabel", "", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AddressRouteTypeDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AddressFlowDto;Ljava/lang/String;)V", "getRouteType", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AddressRouteTypeDto;", "getAddressFlow", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AddressFlowDto;", "getMetricaLabel", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ChangePointsOrderActionDto {
    private final AddressFlowDto addressFlow;
    private final String metricaLabel;
    private final AddressRouteTypeDto routeType;

    public ChangePointsOrderActionDto(@Json(name = "route_type") AddressRouteTypeDto addressRouteTypeDto, @Json(name = "address_flow") AddressFlowDto addressFlowDto, @Json(name = "metrica_label") String str) {
        this.routeType = addressRouteTypeDto;
        this.addressFlow = addressFlowDto;
        this.metricaLabel = str;
    }

    public static /* synthetic */ ChangePointsOrderActionDto copy$default(ChangePointsOrderActionDto changePointsOrderActionDto, AddressRouteTypeDto addressRouteTypeDto, AddressFlowDto addressFlowDto, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            addressRouteTypeDto = changePointsOrderActionDto.routeType;
        }
        if ((i & 2) != 0) {
            addressFlowDto = changePointsOrderActionDto.addressFlow;
        }
        if ((i & 4) != 0) {
            str = changePointsOrderActionDto.metricaLabel;
        }
        return changePointsOrderActionDto.copy(addressRouteTypeDto, addressFlowDto, str);
    }

    /* renamed from: component1, reason: from getter */
    public final AddressRouteTypeDto getRouteType() {
        return this.routeType;
    }

    /* renamed from: component2, reason: from getter */
    public final AddressFlowDto getAddressFlow() {
        return this.addressFlow;
    }

    /* renamed from: component3, reason: from getter */
    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final ChangePointsOrderActionDto copy(@Json(name = "route_type") AddressRouteTypeDto routeType, @Json(name = "address_flow") AddressFlowDto addressFlow, @Json(name = "metrica_label") String metricaLabel) {
        return new ChangePointsOrderActionDto(routeType, addressFlow, metricaLabel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChangePointsOrderActionDto)) {
            return false;
        }
        ChangePointsOrderActionDto changePointsOrderActionDto = (ChangePointsOrderActionDto) other;
        return jl40.l(this.routeType, changePointsOrderActionDto.routeType) && jl40.l(this.addressFlow, changePointsOrderActionDto.addressFlow) && jl40.l(this.metricaLabel, changePointsOrderActionDto.metricaLabel);
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
        AddressRouteTypeDto addressRouteTypeDto = this.routeType;
        int hashCode = (addressRouteTypeDto == null ? 0 : addressRouteTypeDto.hashCode()) * 31;
        AddressFlowDto addressFlowDto = this.addressFlow;
        int hashCode2 = (hashCode + (addressFlowDto == null ? 0 : addressFlowDto.hashCode())) * 31;
        String str = this.metricaLabel;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        AddressRouteTypeDto addressRouteTypeDto = this.routeType;
        AddressFlowDto addressFlowDto = this.addressFlow;
        String str = this.metricaLabel;
        StringBuilder sb = new StringBuilder("ChangePointsOrderActionDto(routeType=");
        sb.append(addressRouteTypeDto);
        sb.append(", addressFlow=");
        sb.append(addressFlowDto);
        sb.append(", metricaLabel=");
        return oyr.t(sb, str, Extension.C_BRAKE);
    }
}
