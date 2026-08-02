package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.handler40cargoc2cv1deliveryroveraction;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.tse0;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0001HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u0001HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliveryroveraction/DeliveryRoverActionRequestDto;", "", "deliveryId", "", "requestId", "action", "payload", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "getDeliveryId", "()Ljava/lang/String;", "getRequestId", "getAction", "getPayload", "()Ljava/lang/Object;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class DeliveryRoverActionRequestDto {
    private final String action;
    private final String deliveryId;
    private final Object payload;
    private final String requestId;

    public DeliveryRoverActionRequestDto(@Json(name = "delivery_id") String str, @Json(name = "request_id") String str2, @Json(name = "action") String str3, @Json(name = "payload") Object obj) {
        this.deliveryId = str;
        this.requestId = str2;
        this.action = str3;
        this.payload = obj;
    }

    public static /* synthetic */ DeliveryRoverActionRequestDto copy$default(DeliveryRoverActionRequestDto deliveryRoverActionRequestDto, String str, String str2, String str3, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = deliveryRoverActionRequestDto.deliveryId;
        }
        if ((i & 2) != 0) {
            str2 = deliveryRoverActionRequestDto.requestId;
        }
        if ((i & 4) != 0) {
            str3 = deliveryRoverActionRequestDto.action;
        }
        if ((i & 8) != 0) {
            obj = deliveryRoverActionRequestDto.payload;
        }
        return deliveryRoverActionRequestDto.copy(str, str2, str3, obj);
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
    public final String getAction() {
        return this.action;
    }

    /* renamed from: component4, reason: from getter */
    public final Object getPayload() {
        return this.payload;
    }

    public final DeliveryRoverActionRequestDto copy(@Json(name = "delivery_id") String deliveryId, @Json(name = "request_id") String requestId, @Json(name = "action") String action, @Json(name = "payload") Object payload) {
        return new DeliveryRoverActionRequestDto(deliveryId, requestId, action, payload);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeliveryRoverActionRequestDto)) {
            return false;
        }
        DeliveryRoverActionRequestDto deliveryRoverActionRequestDto = (DeliveryRoverActionRequestDto) other;
        return jl40.l(this.deliveryId, deliveryRoverActionRequestDto.deliveryId) && jl40.l(this.requestId, deliveryRoverActionRequestDto.requestId) && jl40.l(this.action, deliveryRoverActionRequestDto.action) && jl40.l(this.payload, deliveryRoverActionRequestDto.payload);
    }

    public final String getAction() {
        return this.action;
    }

    public final String getDeliveryId() {
        return this.deliveryId;
    }

    public final Object getPayload() {
        return this.payload;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public int hashCode() {
        return this.payload.hashCode() + unr0.b(unr0.b(this.deliveryId.hashCode() * 31, 31, this.requestId), 31, this.action);
    }

    public String toString() {
        String str = this.deliveryId;
        String str2 = this.requestId;
        return tse0.l(b64.v("DeliveryRoverActionRequestDto(deliveryId=", str, ", requestId=", str2, ", action="), this.action, ", payload=", this.payload, Extension.C_BRAKE);
    }
}
