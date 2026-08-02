package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.fintechsdk.flows.applink.payment.internal.di.paymentform.features.bdui.action.finish.FinishFlowStatus;
import defpackage.b64;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\f\b\u0001\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000f\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J+\u0010\u0012\u001a\u00020\u00002\f\b\u0003\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/ClientOrderIdDto;", "", "phonePdId", "", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/OrderBoundPhonePdIdDto;", FinishFlowStatus.ORDER_ID_FIELD_NAME, "orderProviderId", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/OrderProviderIdDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/OrderProviderIdDto;)V", "getPhonePdId", "()Ljava/lang/String;", "getOrderId", "getOrderProviderId", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/OrderProviderIdDto;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ClientOrderIdDto {
    private final String orderId;
    private final OrderProviderIdDto orderProviderId;
    private final String phonePdId;

    public ClientOrderIdDto(@Json(name = "phone_pd_id") String str, @Json(name = "order_id") String str2, @Json(name = "order_provider_id") OrderProviderIdDto orderProviderIdDto) {
        this.phonePdId = str;
        this.orderId = str2;
        this.orderProviderId = orderProviderIdDto;
    }

    public static /* synthetic */ ClientOrderIdDto copy$default(ClientOrderIdDto clientOrderIdDto, String str, String str2, OrderProviderIdDto orderProviderIdDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = clientOrderIdDto.phonePdId;
        }
        if ((i & 2) != 0) {
            str2 = clientOrderIdDto.orderId;
        }
        if ((i & 4) != 0) {
            orderProviderIdDto = clientOrderIdDto.orderProviderId;
        }
        return clientOrderIdDto.copy(str, str2, orderProviderIdDto);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPhonePdId() {
        return this.phonePdId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    /* renamed from: component3, reason: from getter */
    public final OrderProviderIdDto getOrderProviderId() {
        return this.orderProviderId;
    }

    public final ClientOrderIdDto copy(@Json(name = "phone_pd_id") String phonePdId, @Json(name = "order_id") String orderId, @Json(name = "order_provider_id") OrderProviderIdDto orderProviderId) {
        return new ClientOrderIdDto(phonePdId, orderId, orderProviderId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ClientOrderIdDto)) {
            return false;
        }
        ClientOrderIdDto clientOrderIdDto = (ClientOrderIdDto) other;
        return jl40.l(this.phonePdId, clientOrderIdDto.phonePdId) && jl40.l(this.orderId, clientOrderIdDto.orderId) && this.orderProviderId == clientOrderIdDto.orderProviderId;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final OrderProviderIdDto getOrderProviderId() {
        return this.orderProviderId;
    }

    public final String getPhonePdId() {
        return this.phonePdId;
    }

    public int hashCode() {
        return this.orderProviderId.hashCode() + unr0.b(this.phonePdId.hashCode() * 31, 31, this.orderId);
    }

    public String toString() {
        String str = this.phonePdId;
        String str2 = this.orderId;
        OrderProviderIdDto orderProviderIdDto = this.orderProviderId;
        StringBuilder v = b64.v("ClientOrderIdDto(phonePdId=", str, ", orderId=", str2, ", orderProviderId=");
        v.append(orderProviderIdDto);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
