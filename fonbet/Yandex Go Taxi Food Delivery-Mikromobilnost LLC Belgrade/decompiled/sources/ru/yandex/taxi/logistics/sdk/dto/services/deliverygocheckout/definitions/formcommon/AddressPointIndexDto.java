package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AddressPointIndexDto;", "", "routePointIndex", "", "routeType", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AddressRouteTypeDto;", "<init>", "(ILru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AddressRouteTypeDto;)V", "getRoutePointIndex", "()I", "getRouteType", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AddressRouteTypeDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class AddressPointIndexDto {
    private final int routePointIndex;
    private final AddressRouteTypeDto routeType;

    public AddressPointIndexDto(@Json(name = "route_point_index") int i, @Json(name = "route_type") AddressRouteTypeDto addressRouteTypeDto) {
        this.routePointIndex = i;
        this.routeType = addressRouteTypeDto;
    }

    public static /* synthetic */ AddressPointIndexDto copy$default(AddressPointIndexDto addressPointIndexDto, int i, AddressRouteTypeDto addressRouteTypeDto, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = addressPointIndexDto.routePointIndex;
        }
        if ((i2 & 2) != 0) {
            addressRouteTypeDto = addressPointIndexDto.routeType;
        }
        return addressPointIndexDto.copy(i, addressRouteTypeDto);
    }

    /* renamed from: component1, reason: from getter */
    public final int getRoutePointIndex() {
        return this.routePointIndex;
    }

    /* renamed from: component2, reason: from getter */
    public final AddressRouteTypeDto getRouteType() {
        return this.routeType;
    }

    public final AddressPointIndexDto copy(@Json(name = "route_point_index") int routePointIndex, @Json(name = "route_type") AddressRouteTypeDto routeType) {
        return new AddressPointIndexDto(routePointIndex, routeType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddressPointIndexDto)) {
            return false;
        }
        AddressPointIndexDto addressPointIndexDto = (AddressPointIndexDto) other;
        return this.routePointIndex == addressPointIndexDto.routePointIndex && jl40.l(this.routeType, addressPointIndexDto.routeType);
    }

    public final int getRoutePointIndex() {
        return this.routePointIndex;
    }

    public final AddressRouteTypeDto getRouteType() {
        return this.routeType;
    }

    public int hashCode() {
        return this.routeType.hashCode() + (Integer.hashCode(this.routePointIndex) * 31);
    }

    public String toString() {
        return "AddressPointIndexDto(routePointIndex=" + this.routePointIndex + ", routeType=" + this.routeType + Extension.C_BRAKE;
    }
}
