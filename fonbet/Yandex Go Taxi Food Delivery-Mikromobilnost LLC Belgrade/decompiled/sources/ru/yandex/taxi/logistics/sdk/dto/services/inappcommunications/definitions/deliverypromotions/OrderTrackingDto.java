package ru.yandex.taxi.logistics.sdk.dto.services.inappcommunications.definitions.deliverypromotions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/inappcommunications/definitions/deliverypromotions/OrderTrackingDto;", "", "orderStatus", "", "taxiTariff", "role", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getOrderStatus", "()Ljava/lang/String;", "getTaxiTariff", "getRole", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class OrderTrackingDto {
    private final String orderStatus;
    private final String role;
    private final String taxiTariff;

    public OrderTrackingDto(@Json(name = "order_status") String str, @Json(name = "taxi_tariff") String str2, @Json(name = "role") String str3) {
        this.orderStatus = str;
        this.taxiTariff = str2;
        this.role = str3;
    }

    public static /* synthetic */ OrderTrackingDto copy$default(OrderTrackingDto orderTrackingDto, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = orderTrackingDto.orderStatus;
        }
        if ((i & 2) != 0) {
            str2 = orderTrackingDto.taxiTariff;
        }
        if ((i & 4) != 0) {
            str3 = orderTrackingDto.role;
        }
        return orderTrackingDto.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getOrderStatus() {
        return this.orderStatus;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTaxiTariff() {
        return this.taxiTariff;
    }

    /* renamed from: component3, reason: from getter */
    public final String getRole() {
        return this.role;
    }

    public final OrderTrackingDto copy(@Json(name = "order_status") String orderStatus, @Json(name = "taxi_tariff") String taxiTariff, @Json(name = "role") String role) {
        return new OrderTrackingDto(orderStatus, taxiTariff, role);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderTrackingDto)) {
            return false;
        }
        OrderTrackingDto orderTrackingDto = (OrderTrackingDto) other;
        return jl40.l(this.orderStatus, orderTrackingDto.orderStatus) && jl40.l(this.taxiTariff, orderTrackingDto.taxiTariff) && jl40.l(this.role, orderTrackingDto.role);
    }

    public final String getOrderStatus() {
        return this.orderStatus;
    }

    public final String getRole() {
        return this.role;
    }

    public final String getTaxiTariff() {
        return this.taxiTariff;
    }

    public int hashCode() {
        String str = this.orderStatus;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.taxiTariff;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.role;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.orderStatus;
        String str2 = this.taxiTariff;
        return oyr.t(b64.v("OrderTrackingDto(orderStatus=", str, ", taxiTariff=", str2, ", role="), this.role, Extension.C_BRAKE);
    }
}
