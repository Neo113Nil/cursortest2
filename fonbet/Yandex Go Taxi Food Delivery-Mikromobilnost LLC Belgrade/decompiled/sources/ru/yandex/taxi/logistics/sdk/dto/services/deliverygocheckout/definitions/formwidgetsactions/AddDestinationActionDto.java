package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.vfc;
import defpackage.x4e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.AddressFlowDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.AddressRouteTypeDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0003\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0015J\t\u0010\u001d\u001a\u00020\u000bHÆ\u0003JH\u0010\u001e\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0003\u0010\n\u001a\u00020\u000bHÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020\u000b2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\tHÖ\u0001J\t\u0010#\u001a\u00020\u0007HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006$"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/AddDestinationActionDto;", "", "routeType", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AddressRouteTypeDto;", "addressFlow", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AddressFlowDto;", "searchText", "", "pointIndex", "", "skipAddressDetails", "", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AddressRouteTypeDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AddressFlowDto;Ljava/lang/String;Ljava/lang/Integer;Z)V", "getRouteType", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AddressRouteTypeDto;", "getAddressFlow", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AddressFlowDto;", "getSearchText", "()Ljava/lang/String;", "getPointIndex", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSkipAddressDetails", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "(Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AddressRouteTypeDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AddressFlowDto;Ljava/lang/String;Ljava/lang/Integer;Z)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/AddDestinationActionDto;", "equals", "other", "hashCode", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class AddDestinationActionDto {
    private final AddressFlowDto addressFlow;
    private final Integer pointIndex;
    private final AddressRouteTypeDto routeType;
    private final String searchText;
    private final boolean skipAddressDetails;

    public /* synthetic */ AddDestinationActionDto(AddressRouteTypeDto addressRouteTypeDto, AddressFlowDto addressFlowDto, String str, Integer num, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(addressRouteTypeDto, addressFlowDto, str, num, (i & 16) != 0 ? false : z);
    }

    public static /* synthetic */ AddDestinationActionDto copy$default(AddDestinationActionDto addDestinationActionDto, AddressRouteTypeDto addressRouteTypeDto, AddressFlowDto addressFlowDto, String str, Integer num, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            addressRouteTypeDto = addDestinationActionDto.routeType;
        }
        if ((i & 2) != 0) {
            addressFlowDto = addDestinationActionDto.addressFlow;
        }
        if ((i & 4) != 0) {
            str = addDestinationActionDto.searchText;
        }
        if ((i & 8) != 0) {
            num = addDestinationActionDto.pointIndex;
        }
        if ((i & 16) != 0) {
            z = addDestinationActionDto.skipAddressDetails;
        }
        boolean z2 = z;
        String str2 = str;
        return addDestinationActionDto.copy(addressRouteTypeDto, addressFlowDto, str2, num, z2);
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
    public final String getSearchText() {
        return this.searchText;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getPointIndex() {
        return this.pointIndex;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getSkipAddressDetails() {
        return this.skipAddressDetails;
    }

    public final AddDestinationActionDto copy(@Json(name = "route_type") AddressRouteTypeDto routeType, @Json(name = "address_flow") AddressFlowDto addressFlow, @Json(name = "search_text") String searchText, @Json(name = "point_index") Integer pointIndex, @Json(name = "skip_address_details") boolean skipAddressDetails) {
        return new AddDestinationActionDto(routeType, addressFlow, searchText, pointIndex, skipAddressDetails);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddDestinationActionDto)) {
            return false;
        }
        AddDestinationActionDto addDestinationActionDto = (AddDestinationActionDto) other;
        return jl40.l(this.routeType, addDestinationActionDto.routeType) && jl40.l(this.addressFlow, addDestinationActionDto.addressFlow) && jl40.l(this.searchText, addDestinationActionDto.searchText) && jl40.l(this.pointIndex, addDestinationActionDto.pointIndex) && this.skipAddressDetails == addDestinationActionDto.skipAddressDetails;
    }

    public final AddressFlowDto getAddressFlow() {
        return this.addressFlow;
    }

    public final Integer getPointIndex() {
        return this.pointIndex;
    }

    public final AddressRouteTypeDto getRouteType() {
        return this.routeType;
    }

    public final String getSearchText() {
        return this.searchText;
    }

    public final boolean getSkipAddressDetails() {
        return this.skipAddressDetails;
    }

    public int hashCode() {
        AddressRouteTypeDto addressRouteTypeDto = this.routeType;
        int hashCode = (addressRouteTypeDto == null ? 0 : addressRouteTypeDto.hashCode()) * 31;
        AddressFlowDto addressFlowDto = this.addressFlow;
        int hashCode2 = (hashCode + (addressFlowDto == null ? 0 : addressFlowDto.hashCode())) * 31;
        String str = this.searchText;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.pointIndex;
        return Boolean.hashCode(this.skipAddressDetails) + ((hashCode3 + (num != null ? num.hashCode() : 0)) * 31);
    }

    public String toString() {
        AddressRouteTypeDto addressRouteTypeDto = this.routeType;
        AddressFlowDto addressFlowDto = this.addressFlow;
        String str = this.searchText;
        Integer num = this.pointIndex;
        boolean z = this.skipAddressDetails;
        StringBuilder sb = new StringBuilder("AddDestinationActionDto(routeType=");
        sb.append(addressRouteTypeDto);
        sb.append(", addressFlow=");
        sb.append(addressFlowDto);
        sb.append(", searchText=");
        vfc.w(num, str, ", pointIndex=", ", skipAddressDetails=", sb);
        return x4e.i(sb, z, Extension.C_BRAKE);
    }

    public AddDestinationActionDto(@Json(name = "route_type") AddressRouteTypeDto addressRouteTypeDto, @Json(name = "address_flow") AddressFlowDto addressFlowDto, @Json(name = "search_text") String str, @Json(name = "point_index") Integer num, @Json(name = "skip_address_details") boolean z) {
        this.routeType = addressRouteTypeDto;
        this.addressFlow = addressFlowDto;
        this.searchText = str;
        this.pointIndex = num;
        this.skipAddressDetails = z;
    }
}
