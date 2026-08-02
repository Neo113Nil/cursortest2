package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.events;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.MultiorderDialogDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/OrderEditDialogEventDto;", "", "deliveryId", "", "requestId", "dialog", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/MultiorderDialogDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/MultiorderDialogDto;)V", "getDeliveryId", "()Ljava/lang/String;", "getRequestId", "getDialog", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/MultiorderDialogDto;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class OrderEditDialogEventDto {
    private final String deliveryId;
    private final MultiorderDialogDto dialog;
    private final String requestId;

    public OrderEditDialogEventDto(@Json(name = "delivery_id") String str, @Json(name = "request_id") String str2, @Json(name = "dialog") MultiorderDialogDto multiorderDialogDto) {
        this.deliveryId = str;
        this.requestId = str2;
        this.dialog = multiorderDialogDto;
    }

    public static /* synthetic */ OrderEditDialogEventDto copy$default(OrderEditDialogEventDto orderEditDialogEventDto, String str, String str2, MultiorderDialogDto multiorderDialogDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = orderEditDialogEventDto.deliveryId;
        }
        if ((i & 2) != 0) {
            str2 = orderEditDialogEventDto.requestId;
        }
        if ((i & 4) != 0) {
            multiorderDialogDto = orderEditDialogEventDto.dialog;
        }
        return orderEditDialogEventDto.copy(str, str2, multiorderDialogDto);
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
    public final MultiorderDialogDto getDialog() {
        return this.dialog;
    }

    public final OrderEditDialogEventDto copy(@Json(name = "delivery_id") String deliveryId, @Json(name = "request_id") String requestId, @Json(name = "dialog") MultiorderDialogDto dialog) {
        return new OrderEditDialogEventDto(deliveryId, requestId, dialog);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderEditDialogEventDto)) {
            return false;
        }
        OrderEditDialogEventDto orderEditDialogEventDto = (OrderEditDialogEventDto) other;
        return jl40.l(this.deliveryId, orderEditDialogEventDto.deliveryId) && jl40.l(this.requestId, orderEditDialogEventDto.requestId) && jl40.l(this.dialog, orderEditDialogEventDto.dialog);
    }

    public final String getDeliveryId() {
        return this.deliveryId;
    }

    public final MultiorderDialogDto getDialog() {
        return this.dialog;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public int hashCode() {
        int b = unr0.b(this.deliveryId.hashCode() * 31, 31, this.requestId);
        MultiorderDialogDto multiorderDialogDto = this.dialog;
        return b + (multiorderDialogDto == null ? 0 : multiorderDialogDto.hashCode());
    }

    public String toString() {
        String str = this.deliveryId;
        String str2 = this.requestId;
        MultiorderDialogDto multiorderDialogDto = this.dialog;
        StringBuilder v = b64.v("OrderEditDialogEventDto(deliveryId=", str, ", requestId=", str2, ", dialog=");
        v.append(multiorderDialogDto);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
