package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverypaymentcontext;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.fintechsdk.flows.applink.payment.internal.di.paymentform.features.bdui.action.finish.FinishFlowStatus;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.tse0;
import defpackage.unr0;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.OrderProviderIdDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.RoleDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u008d\u0001\u0012\f\b\u0001\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0001\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010#\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0007HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u008f\u0001\u0010.\u001a\u00020\u00002\f\b\u0003\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00032\u000e\b\u0003\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u000203HÖ\u0001J\t\u00104\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0015¨\u00065"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverypaymentcontext/PayerContextDto;", "", "phonePdId", "", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/OrderBoundPhonePdIdDto;", FinishFlowStatus.ORDER_ID_FIELD_NAME, "orderProviderId", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/OrderProviderIdDto;", "paymentType", "paymentMethodId", "payerPaAuthContext", "webPaymentUrl", "webPaymentPspUrl", "chequeOrderUuid", "roles", "", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/RoleDto;", "cargoRefId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/OrderProviderIdDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getPhonePdId", "()Ljava/lang/String;", "getOrderId", "getOrderProviderId", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/OrderProviderIdDto;", "getPaymentType", "getPaymentMethodId", "getPayerPaAuthContext", "()Ljava/lang/Object;", "getWebPaymentUrl", "getWebPaymentPspUrl", "getChequeOrderUuid", "getRoles", "()Ljava/util/List;", "getCargoRefId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class PayerContextDto {
    private final String cargoRefId;
    private final String chequeOrderUuid;
    private final String orderId;
    private final OrderProviderIdDto orderProviderId;
    private final Object payerPaAuthContext;
    private final String paymentMethodId;
    private final String paymentType;
    private final String phonePdId;
    private final List<RoleDto> roles;
    private final String webPaymentPspUrl;
    private final String webPaymentUrl;

    /* JADX WARN: Multi-variable type inference failed */
    public PayerContextDto(@Json(name = "phone_pd_id") String str, @Json(name = "order_id") String str2, @Json(name = "order_provider_id") OrderProviderIdDto orderProviderIdDto, @Json(name = "payment_type") String str3, @Json(name = "payment_method_id") String str4, @Json(name = "payer_pa_auth_context") Object obj, @Json(name = "web_payment_url") String str5, @Json(name = "web_payment_psp_url") String str6, @Json(name = "cheque_order_uuid") String str7, @Json(name = "roles") List<? extends RoleDto> list, @Json(name = "cargo_ref_id") String str8) {
        this.phonePdId = str;
        this.orderId = str2;
        this.orderProviderId = orderProviderIdDto;
        this.paymentType = str3;
        this.paymentMethodId = str4;
        this.payerPaAuthContext = obj;
        this.webPaymentUrl = str5;
        this.webPaymentPspUrl = str6;
        this.chequeOrderUuid = str7;
        this.roles = list;
        this.cargoRefId = str8;
    }

    public static /* synthetic */ PayerContextDto copy$default(PayerContextDto payerContextDto, String str, String str2, OrderProviderIdDto orderProviderIdDto, String str3, String str4, Object obj, String str5, String str6, String str7, List list, String str8, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = payerContextDto.phonePdId;
        }
        if ((i & 2) != 0) {
            str2 = payerContextDto.orderId;
        }
        if ((i & 4) != 0) {
            orderProviderIdDto = payerContextDto.orderProviderId;
        }
        if ((i & 8) != 0) {
            str3 = payerContextDto.paymentType;
        }
        if ((i & 16) != 0) {
            str4 = payerContextDto.paymentMethodId;
        }
        if ((i & 32) != 0) {
            obj = payerContextDto.payerPaAuthContext;
        }
        if ((i & 64) != 0) {
            str5 = payerContextDto.webPaymentUrl;
        }
        if ((i & 128) != 0) {
            str6 = payerContextDto.webPaymentPspUrl;
        }
        if ((i & 256) != 0) {
            str7 = payerContextDto.chequeOrderUuid;
        }
        if ((i & 512) != 0) {
            list = payerContextDto.roles;
        }
        if ((i & 1024) != 0) {
            str8 = payerContextDto.cargoRefId;
        }
        List list2 = list;
        String str9 = str8;
        String str10 = str6;
        String str11 = str7;
        Object obj3 = obj;
        String str12 = str5;
        String str13 = str4;
        OrderProviderIdDto orderProviderIdDto2 = orderProviderIdDto;
        return payerContextDto.copy(str, str2, orderProviderIdDto2, str3, str13, obj3, str12, str10, str11, list2, str9);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPhonePdId() {
        return this.phonePdId;
    }

    public final List<RoleDto> component10() {
        return this.roles;
    }

    /* renamed from: component11, reason: from getter */
    public final String getCargoRefId() {
        return this.cargoRefId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    /* renamed from: component3, reason: from getter */
    public final OrderProviderIdDto getOrderProviderId() {
        return this.orderProviderId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getPaymentType() {
        return this.paymentType;
    }

    /* renamed from: component5, reason: from getter */
    public final String getPaymentMethodId() {
        return this.paymentMethodId;
    }

    /* renamed from: component6, reason: from getter */
    public final Object getPayerPaAuthContext() {
        return this.payerPaAuthContext;
    }

    /* renamed from: component7, reason: from getter */
    public final String getWebPaymentUrl() {
        return this.webPaymentUrl;
    }

    /* renamed from: component8, reason: from getter */
    public final String getWebPaymentPspUrl() {
        return this.webPaymentPspUrl;
    }

    /* renamed from: component9, reason: from getter */
    public final String getChequeOrderUuid() {
        return this.chequeOrderUuid;
    }

    public final PayerContextDto copy(@Json(name = "phone_pd_id") String phonePdId, @Json(name = "order_id") String orderId, @Json(name = "order_provider_id") OrderProviderIdDto orderProviderId, @Json(name = "payment_type") String paymentType, @Json(name = "payment_method_id") String paymentMethodId, @Json(name = "payer_pa_auth_context") Object payerPaAuthContext, @Json(name = "web_payment_url") String webPaymentUrl, @Json(name = "web_payment_psp_url") String webPaymentPspUrl, @Json(name = "cheque_order_uuid") String chequeOrderUuid, @Json(name = "roles") List<? extends RoleDto> roles, @Json(name = "cargo_ref_id") String cargoRefId) {
        return new PayerContextDto(phonePdId, orderId, orderProviderId, paymentType, paymentMethodId, payerPaAuthContext, webPaymentUrl, webPaymentPspUrl, chequeOrderUuid, roles, cargoRefId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PayerContextDto)) {
            return false;
        }
        PayerContextDto payerContextDto = (PayerContextDto) other;
        return jl40.l(this.phonePdId, payerContextDto.phonePdId) && jl40.l(this.orderId, payerContextDto.orderId) && this.orderProviderId == payerContextDto.orderProviderId && jl40.l(this.paymentType, payerContextDto.paymentType) && jl40.l(this.paymentMethodId, payerContextDto.paymentMethodId) && jl40.l(this.payerPaAuthContext, payerContextDto.payerPaAuthContext) && jl40.l(this.webPaymentUrl, payerContextDto.webPaymentUrl) && jl40.l(this.webPaymentPspUrl, payerContextDto.webPaymentPspUrl) && jl40.l(this.chequeOrderUuid, payerContextDto.chequeOrderUuid) && jl40.l(this.roles, payerContextDto.roles) && jl40.l(this.cargoRefId, payerContextDto.cargoRefId);
    }

    public final String getCargoRefId() {
        return this.cargoRefId;
    }

    public final String getChequeOrderUuid() {
        return this.chequeOrderUuid;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final OrderProviderIdDto getOrderProviderId() {
        return this.orderProviderId;
    }

    public final Object getPayerPaAuthContext() {
        return this.payerPaAuthContext;
    }

    public final String getPaymentMethodId() {
        return this.paymentMethodId;
    }

    public final String getPaymentType() {
        return this.paymentType;
    }

    public final String getPhonePdId() {
        return this.phonePdId;
    }

    public final List<RoleDto> getRoles() {
        return this.roles;
    }

    public final String getWebPaymentPspUrl() {
        return this.webPaymentPspUrl;
    }

    public final String getWebPaymentUrl() {
        return this.webPaymentUrl;
    }

    public int hashCode() {
        int hashCode = (this.orderProviderId.hashCode() + unr0.b(this.phonePdId.hashCode() * 31, 31, this.orderId)) * 31;
        String str = this.paymentType;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.paymentMethodId;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Object obj = this.payerPaAuthContext;
        int hashCode4 = (hashCode3 + (obj == null ? 0 : obj.hashCode())) * 31;
        String str3 = this.webPaymentUrl;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.webPaymentPspUrl;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.chequeOrderUuid;
        int c = unr0.c((hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.roles);
        String str6 = this.cargoRefId;
        return c + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        String str = this.phonePdId;
        String str2 = this.orderId;
        OrderProviderIdDto orderProviderIdDto = this.orderProviderId;
        String str3 = this.paymentType;
        String str4 = this.paymentMethodId;
        Object obj = this.payerPaAuthContext;
        String str5 = this.webPaymentUrl;
        String str6 = this.webPaymentPspUrl;
        String str7 = this.chequeOrderUuid;
        List<RoleDto> list = this.roles;
        String str8 = this.cargoRefId;
        StringBuilder v = b64.v("PayerContextDto(phonePdId=", str, ", orderId=", str2, ", orderProviderId=");
        v.append(orderProviderIdDto);
        v.append(", paymentType=");
        v.append(str3);
        v.append(", paymentMethodId=");
        v.append(str4);
        v.append(", payerPaAuthContext=");
        v.append(obj);
        v.append(", webPaymentUrl=");
        g8e.D(v, str5, ", webPaymentPspUrl=", str6, ", chequeOrderUuid=");
        tse0.x(str7, ", roles=", ", cargoRefId=", v, list);
        return oyr.t(v, str8, Extension.C_BRAKE);
    }
}
