package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.handler40cargoc2cv1deliveryedit;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.orderedit.OrderEditPayloadDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J3\u0010\u0015\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00012\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001c"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliveryedit/DeliveryEditRequestDto;", "", "deliveryId", "", "editOptions", "editPayload", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/orderedit/OrderEditPayloadDto;", "requestId", "<init>", "(Ljava/lang/String;Ljava/lang/Object;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/orderedit/OrderEditPayloadDto;Ljava/lang/String;)V", "getDeliveryId", "()Ljava/lang/String;", "getEditOptions", "()Ljava/lang/Object;", "getEditPayload", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/orderedit/OrderEditPayloadDto;", "getRequestId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class DeliveryEditRequestDto {
    private final String deliveryId;
    private final Object editOptions;
    private final OrderEditPayloadDto editPayload;
    private final String requestId;

    public DeliveryEditRequestDto(@Json(name = "delivery_id") String str, @Json(name = "edit_options") Object obj, @Json(name = "edit_payload") OrderEditPayloadDto orderEditPayloadDto, @Json(name = "request_id") String str2) {
        this.deliveryId = str;
        this.editOptions = obj;
        this.editPayload = orderEditPayloadDto;
        this.requestId = str2;
    }

    public static /* synthetic */ DeliveryEditRequestDto copy$default(DeliveryEditRequestDto deliveryEditRequestDto, String str, Object obj, OrderEditPayloadDto orderEditPayloadDto, String str2, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = deliveryEditRequestDto.deliveryId;
        }
        if ((i & 2) != 0) {
            obj = deliveryEditRequestDto.editOptions;
        }
        if ((i & 4) != 0) {
            orderEditPayloadDto = deliveryEditRequestDto.editPayload;
        }
        if ((i & 8) != 0) {
            str2 = deliveryEditRequestDto.requestId;
        }
        return deliveryEditRequestDto.copy(str, obj, orderEditPayloadDto, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDeliveryId() {
        return this.deliveryId;
    }

    /* renamed from: component2, reason: from getter */
    public final Object getEditOptions() {
        return this.editOptions;
    }

    /* renamed from: component3, reason: from getter */
    public final OrderEditPayloadDto getEditPayload() {
        return this.editPayload;
    }

    /* renamed from: component4, reason: from getter */
    public final String getRequestId() {
        return this.requestId;
    }

    public final DeliveryEditRequestDto copy(@Json(name = "delivery_id") String deliveryId, @Json(name = "edit_options") Object editOptions, @Json(name = "edit_payload") OrderEditPayloadDto editPayload, @Json(name = "request_id") String requestId) {
        return new DeliveryEditRequestDto(deliveryId, editOptions, editPayload, requestId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeliveryEditRequestDto)) {
            return false;
        }
        DeliveryEditRequestDto deliveryEditRequestDto = (DeliveryEditRequestDto) other;
        return jl40.l(this.deliveryId, deliveryEditRequestDto.deliveryId) && jl40.l(this.editOptions, deliveryEditRequestDto.editOptions) && jl40.l(this.editPayload, deliveryEditRequestDto.editPayload) && jl40.l(this.requestId, deliveryEditRequestDto.requestId);
    }

    public final String getDeliveryId() {
        return this.deliveryId;
    }

    public final Object getEditOptions() {
        return this.editOptions;
    }

    public final OrderEditPayloadDto getEditPayload() {
        return this.editPayload;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public int hashCode() {
        int hashCode = this.deliveryId.hashCode() * 31;
        Object obj = this.editOptions;
        return this.requestId.hashCode() + ((this.editPayload.hashCode() + ((hashCode + (obj == null ? 0 : obj.hashCode())) * 31)) * 31);
    }

    public String toString() {
        return "DeliveryEditRequestDto(deliveryId=" + this.deliveryId + ", editOptions=" + this.editOptions + ", editPayload=" + this.editPayload + ", requestId=" + this.requestId + Extension.C_BRAKE;
    }
}
