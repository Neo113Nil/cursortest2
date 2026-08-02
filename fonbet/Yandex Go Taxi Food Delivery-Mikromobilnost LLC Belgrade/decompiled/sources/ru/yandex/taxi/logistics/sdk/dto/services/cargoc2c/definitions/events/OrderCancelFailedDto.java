package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.events;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.unr0;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.CancelMessageDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/OrderCancelFailedDto;", "", "deliveryId", "", "requestId", Constants.KEY_MESSAGE, "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/CancelMessageDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/CancelMessageDto;)V", "getDeliveryId", "()Ljava/lang/String;", "getRequestId", "getMessage", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/CancelMessageDto;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class OrderCancelFailedDto {
    private final String deliveryId;
    private final CancelMessageDto message;
    private final String requestId;

    public OrderCancelFailedDto(@Json(name = "delivery_id") String str, @Json(name = "request_id") String str2, @Json(name = "message") CancelMessageDto cancelMessageDto) {
        this.deliveryId = str;
        this.requestId = str2;
        this.message = cancelMessageDto;
    }

    public static /* synthetic */ OrderCancelFailedDto copy$default(OrderCancelFailedDto orderCancelFailedDto, String str, String str2, CancelMessageDto cancelMessageDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = orderCancelFailedDto.deliveryId;
        }
        if ((i & 2) != 0) {
            str2 = orderCancelFailedDto.requestId;
        }
        if ((i & 4) != 0) {
            cancelMessageDto = orderCancelFailedDto.message;
        }
        return orderCancelFailedDto.copy(str, str2, cancelMessageDto);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDeliveryId() {
        return this.deliveryId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getRequestId() {
        return this.requestId;
    }

    /* renamed from: component3, reason: from getter */
    public final CancelMessageDto getMessage() {
        return this.message;
    }

    public final OrderCancelFailedDto copy(@Json(name = "delivery_id") String deliveryId, @Json(name = "request_id") String requestId, @Json(name = "message") CancelMessageDto message) {
        return new OrderCancelFailedDto(deliveryId, requestId, message);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderCancelFailedDto)) {
            return false;
        }
        OrderCancelFailedDto orderCancelFailedDto = (OrderCancelFailedDto) other;
        return jl40.l(this.deliveryId, orderCancelFailedDto.deliveryId) && jl40.l(this.requestId, orderCancelFailedDto.requestId) && jl40.l(this.message, orderCancelFailedDto.message);
    }

    public final String getDeliveryId() {
        return this.deliveryId;
    }

    public final CancelMessageDto getMessage() {
        return this.message;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public int hashCode() {
        return this.message.hashCode() + unr0.b(this.deliveryId.hashCode() * 31, 31, this.requestId);
    }

    public String toString() {
        String str = this.deliveryId;
        String str2 = this.requestId;
        CancelMessageDto cancelMessageDto = this.message;
        StringBuilder v = b64.v("OrderCancelFailedDto(deliveryId=", str, ", requestId=", str2, ", message=");
        v.append(cancelMessageDto);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
