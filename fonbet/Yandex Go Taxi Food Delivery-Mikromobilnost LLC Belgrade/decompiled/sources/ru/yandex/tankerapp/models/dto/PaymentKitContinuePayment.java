package ru.yandex.tankerapp.models.dto;

import com.yandex.fintechsdk.flows.applink.payment.internal.di.paymentform.features.bdui.action.finish.FinishFlowStatus;
import defpackage.jl40;
import defpackage.unr0;
import defpackage.ysq0;
import java.io.Serializable;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lru/yandex/tankerapp/models/dto/PaymentKitContinuePayment;", "Ljava/io/Serializable;", "", "trustPurchaseToken", FinishFlowStatus.ORDER_ID_FIELD_NAME, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "a", "car_tech_payment_sdk_android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class PaymentKitContinuePayment implements Serializable {

    @ysq0(FinishFlowStatus.ORDER_ID_FIELD_NAME)
    private final String orderId;

    @ysq0("trustPurchaseToken")
    private final String trustPurchaseToken;

    public PaymentKitContinuePayment(String str, String str2) {
        this.trustPurchaseToken = str;
        this.orderId = str2;
    }

    /* renamed from: a, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    /* renamed from: b, reason: from getter */
    public final String getTrustPurchaseToken() {
        return this.trustPurchaseToken;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentKitContinuePayment)) {
            return false;
        }
        PaymentKitContinuePayment paymentKitContinuePayment = (PaymentKitContinuePayment) obj;
        return jl40.l(this.trustPurchaseToken, paymentKitContinuePayment.trustPurchaseToken) && jl40.l(this.orderId, paymentKitContinuePayment.orderId);
    }

    public final int hashCode() {
        return this.orderId.hashCode() + (this.trustPurchaseToken.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("PaymentKitContinuePayment(trustPurchaseToken=", this.trustPurchaseToken, ", orderId=", this.orderId, Extension.C_BRAKE);
    }
}
