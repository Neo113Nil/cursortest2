package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/RoutePointPositionDto;", "", "addressPointIndex", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AddressPointIndexDto;", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AddressPointIndexDto;)V", "getAddressPointIndex", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AddressPointIndexDto;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class RoutePointPositionDto {
    private final AddressPointIndexDto addressPointIndex;

    public RoutePointPositionDto(@Json(name = "address_point_index") AddressPointIndexDto addressPointIndexDto) {
        this.addressPointIndex = addressPointIndexDto;
    }

    public static /* synthetic */ RoutePointPositionDto copy$default(RoutePointPositionDto routePointPositionDto, AddressPointIndexDto addressPointIndexDto, int i, Object obj) {
        if ((i & 1) != 0) {
            addressPointIndexDto = routePointPositionDto.addressPointIndex;
        }
        return routePointPositionDto.copy(addressPointIndexDto);
    }

    /* renamed from: component1, reason: from getter */
    public final AddressPointIndexDto getAddressPointIndex() {
        return this.addressPointIndex;
    }

    public final RoutePointPositionDto copy(@Json(name = "address_point_index") AddressPointIndexDto addressPointIndex) {
        return new RoutePointPositionDto(addressPointIndex);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof RoutePointPositionDto) && jl40.l(this.addressPointIndex, ((RoutePointPositionDto) other).addressPointIndex);
    }

    public final AddressPointIndexDto getAddressPointIndex() {
        return this.addressPointIndex;
    }

    public int hashCode() {
        return this.addressPointIndex.hashCode();
    }

    public String toString() {
        return "RoutePointPositionDto(addressPointIndex=" + this.addressPointIndex + Extension.C_BRAKE;
    }
}
