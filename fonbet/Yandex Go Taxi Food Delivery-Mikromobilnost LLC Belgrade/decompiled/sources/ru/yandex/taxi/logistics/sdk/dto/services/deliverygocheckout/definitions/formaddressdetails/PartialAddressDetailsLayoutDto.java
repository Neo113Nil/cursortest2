package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formaddressdetails;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.RoutePointsIntervalDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formaddressdetails/PartialAddressDetailsLayoutDto;", "", "layout", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formaddressdetails/AddressDetailsLayoutDto;", "routePointsInterval", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/RoutePointsIntervalDto;", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formaddressdetails/AddressDetailsLayoutDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/RoutePointsIntervalDto;)V", "getLayout", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formaddressdetails/AddressDetailsLayoutDto;", "getRoutePointsInterval", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/RoutePointsIntervalDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class PartialAddressDetailsLayoutDto {
    private final AddressDetailsLayoutDto layout;
    private final RoutePointsIntervalDto routePointsInterval;

    public PartialAddressDetailsLayoutDto(@Json(name = "layout") AddressDetailsLayoutDto addressDetailsLayoutDto, @Json(name = "route_points_interval") RoutePointsIntervalDto routePointsIntervalDto) {
        this.layout = addressDetailsLayoutDto;
        this.routePointsInterval = routePointsIntervalDto;
    }

    public static /* synthetic */ PartialAddressDetailsLayoutDto copy$default(PartialAddressDetailsLayoutDto partialAddressDetailsLayoutDto, AddressDetailsLayoutDto addressDetailsLayoutDto, RoutePointsIntervalDto routePointsIntervalDto, int i, Object obj) {
        if ((i & 1) != 0) {
            addressDetailsLayoutDto = partialAddressDetailsLayoutDto.layout;
        }
        if ((i & 2) != 0) {
            routePointsIntervalDto = partialAddressDetailsLayoutDto.routePointsInterval;
        }
        return partialAddressDetailsLayoutDto.copy(addressDetailsLayoutDto, routePointsIntervalDto);
    }

    /* renamed from: component1, reason: from getter */
    public final AddressDetailsLayoutDto getLayout() {
        return this.layout;
    }

    /* renamed from: component2, reason: from getter */
    public final RoutePointsIntervalDto getRoutePointsInterval() {
        return this.routePointsInterval;
    }

    public final PartialAddressDetailsLayoutDto copy(@Json(name = "layout") AddressDetailsLayoutDto layout, @Json(name = "route_points_interval") RoutePointsIntervalDto routePointsInterval) {
        return new PartialAddressDetailsLayoutDto(layout, routePointsInterval);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PartialAddressDetailsLayoutDto)) {
            return false;
        }
        PartialAddressDetailsLayoutDto partialAddressDetailsLayoutDto = (PartialAddressDetailsLayoutDto) other;
        return jl40.l(this.layout, partialAddressDetailsLayoutDto.layout) && jl40.l(this.routePointsInterval, partialAddressDetailsLayoutDto.routePointsInterval);
    }

    public final AddressDetailsLayoutDto getLayout() {
        return this.layout;
    }

    public final RoutePointsIntervalDto getRoutePointsInterval() {
        return this.routePointsInterval;
    }

    public int hashCode() {
        return this.routePointsInterval.hashCode() + (this.layout.hashCode() * 31);
    }

    public String toString() {
        return "PartialAddressDetailsLayoutDto(layout=" + this.layout + ", routePointsInterval=" + this.routePointsInterval + Extension.C_BRAKE;
    }
}
