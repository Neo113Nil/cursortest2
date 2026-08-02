package ru.yandex.tankerapp.models.results;

import com.yandex.payment.sdk.core.data.PaymentKitError;
import defpackage.jl40;
import defpackage.ysq0;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;
import ru.yandex.tankerapp.models.dto.PaymentKitPaymentMethod;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/yandex/tankerapp/models/results/PaymentKitSelectMethodResult;", "Ljava/io/Serializable;", "Lru/yandex/tankerapp/models/results/PaymentKitStatusResult;", ACSPConstants.STATUS, "Lcom/yandex/payment/sdk/core/data/PaymentKitError;", "error", "Lru/yandex/tankerapp/models/dto/PaymentKitPaymentMethod;", "paymentMethod", "<init>", "(Lru/yandex/tankerapp/models/results/PaymentKitStatusResult;Lcom/yandex/payment/sdk/core/data/PaymentKitError;Lru/yandex/tankerapp/models/dto/PaymentKitPaymentMethod;)V", "Lru/yandex/tankerapp/models/results/PaymentKitStatusResult;", "getStatus", "()Lru/yandex/tankerapp/models/results/PaymentKitStatusResult;", "Lcom/yandex/payment/sdk/core/data/PaymentKitError;", "getError", "()Lcom/yandex/payment/sdk/core/data/PaymentKitError;", "Lru/yandex/tankerapp/models/dto/PaymentKitPaymentMethod;", "getPaymentMethod", "()Lru/yandex/tankerapp/models/dto/PaymentKitPaymentMethod;", "car_tech_payment_sdk_android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class PaymentKitSelectMethodResult implements Serializable {

    @ysq0("error")
    private final PaymentKitError error;

    @ysq0("paymentMethod")
    private final PaymentKitPaymentMethod paymentMethod;

    @ysq0(ACSPConstants.STATUS)
    private final PaymentKitStatusResult status;

    public PaymentKitSelectMethodResult(PaymentKitStatusResult paymentKitStatusResult, PaymentKitError paymentKitError, PaymentKitPaymentMethod paymentKitPaymentMethod) {
        this.status = paymentKitStatusResult;
        this.error = paymentKitError;
        this.paymentMethod = paymentKitPaymentMethod;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentKitSelectMethodResult)) {
            return false;
        }
        PaymentKitSelectMethodResult paymentKitSelectMethodResult = (PaymentKitSelectMethodResult) obj;
        return this.status == paymentKitSelectMethodResult.status && jl40.l(this.error, paymentKitSelectMethodResult.error) && jl40.l(this.paymentMethod, paymentKitSelectMethodResult.paymentMethod);
    }

    public final int hashCode() {
        int hashCode = this.status.hashCode() * 31;
        PaymentKitError paymentKitError = this.error;
        int hashCode2 = (hashCode + (paymentKitError == null ? 0 : paymentKitError.hashCode())) * 31;
        PaymentKitPaymentMethod paymentKitPaymentMethod = this.paymentMethod;
        return hashCode2 + (paymentKitPaymentMethod != null ? paymentKitPaymentMethod.hashCode() : 0);
    }

    public final String toString() {
        return "PaymentKitSelectMethodResult(status=" + this.status + ", error=" + this.error + ", paymentMethod=" + this.paymentMethod + Extension.C_BRAKE;
    }

    public /* synthetic */ PaymentKitSelectMethodResult(PaymentKitStatusResult paymentKitStatusResult, PaymentKitError paymentKitError, PaymentKitPaymentMethod paymentKitPaymentMethod, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(paymentKitStatusResult, (i & 2) != 0 ? null : paymentKitError, paymentKitPaymentMethod);
    }
}
