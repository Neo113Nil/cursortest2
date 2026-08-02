package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.handler40cargoc2cv1deliverycancel;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.CancelTypeDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0018"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliverycancel/DeliveryCancelRequestDto;", "", "deliveryId", "", "cancelType", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/CancelTypeDto;", "requestId", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/CancelTypeDto;Ljava/lang/String;)V", "getDeliveryId", "()Ljava/lang/String;", "getCancelType", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/CancelTypeDto;", "getRequestId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class DeliveryCancelRequestDto {
    private final CancelTypeDto cancelType;
    private final String deliveryId;
    private final String requestId;

    public DeliveryCancelRequestDto(@Json(name = "delivery_id") String str, @Json(name = "cancel_type") CancelTypeDto cancelTypeDto, @Json(name = "request_id") String str2) {
        this.deliveryId = str;
        this.cancelType = cancelTypeDto;
        this.requestId = str2;
    }

    public static /* synthetic */ DeliveryCancelRequestDto copy$default(DeliveryCancelRequestDto deliveryCancelRequestDto, String str, CancelTypeDto cancelTypeDto, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deliveryCancelRequestDto.deliveryId;
        }
        if ((i & 2) != 0) {
            cancelTypeDto = deliveryCancelRequestDto.cancelType;
        }
        if ((i & 4) != 0) {
            str2 = deliveryCancelRequestDto.requestId;
        }
        return deliveryCancelRequestDto.copy(str, cancelTypeDto, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDeliveryId() {
        return this.deliveryId;
    }

    /* renamed from: component2, reason: from getter */
    public final CancelTypeDto getCancelType() {
        return this.cancelType;
    }

    /* renamed from: component3, reason: from getter */
    public final String getRequestId() {
        return this.requestId;
    }

    public final DeliveryCancelRequestDto copy(@Json(name = "delivery_id") String deliveryId, @Json(name = "cancel_type") CancelTypeDto cancelType, @Json(name = "request_id") String requestId) {
        return new DeliveryCancelRequestDto(deliveryId, cancelType, requestId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeliveryCancelRequestDto)) {
            return false;
        }
        DeliveryCancelRequestDto deliveryCancelRequestDto = (DeliveryCancelRequestDto) other;
        return jl40.l(this.deliveryId, deliveryCancelRequestDto.deliveryId) && this.cancelType == deliveryCancelRequestDto.cancelType && jl40.l(this.requestId, deliveryCancelRequestDto.requestId);
    }

    public final CancelTypeDto getCancelType() {
        return this.cancelType;
    }

    public final String getDeliveryId() {
        return this.deliveryId;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public int hashCode() {
        return this.requestId.hashCode() + ((this.cancelType.hashCode() + (this.deliveryId.hashCode() * 31)) * 31);
    }

    public String toString() {
        String str = this.deliveryId;
        CancelTypeDto cancelTypeDto = this.cancelType;
        String str2 = this.requestId;
        StringBuilder sb = new StringBuilder("DeliveryCancelRequestDto(deliveryId=");
        sb.append(str);
        sb.append(", cancelType=");
        sb.append(cancelTypeDto);
        sb.append(", requestId=");
        return oyr.t(sb, str2, Extension.C_BRAKE);
    }
}
