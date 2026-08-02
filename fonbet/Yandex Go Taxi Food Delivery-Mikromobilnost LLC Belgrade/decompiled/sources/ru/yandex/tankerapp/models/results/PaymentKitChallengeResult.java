package ru.yandex.tankerapp.models.results;

import com.yandex.payment.sdk.core.data.PaymentKitError;
import defpackage.jl40;
import defpackage.ysq0;
import java.io.Serializable;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/yandex/tankerapp/models/results/PaymentKitChallengeResult;", "Ljava/io/Serializable;", "Lru/yandex/tankerapp/models/results/PaymentKitStatusResult;", ACSPConstants.STATUS, "Lcom/yandex/payment/sdk/core/data/PaymentKitError;", "error", "<init>", "(Lru/yandex/tankerapp/models/results/PaymentKitStatusResult;Lcom/yandex/payment/sdk/core/data/PaymentKitError;)V", "Lru/yandex/tankerapp/models/results/PaymentKitStatusResult;", "getStatus", "()Lru/yandex/tankerapp/models/results/PaymentKitStatusResult;", "Lcom/yandex/payment/sdk/core/data/PaymentKitError;", "getError", "()Lcom/yandex/payment/sdk/core/data/PaymentKitError;", "car_tech_payment_sdk_android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class PaymentKitChallengeResult implements Serializable {

    @ysq0("error")
    private final PaymentKitError error;

    @ysq0(ACSPConstants.STATUS)
    private final PaymentKitStatusResult status;

    public PaymentKitChallengeResult(PaymentKitStatusResult paymentKitStatusResult, PaymentKitError paymentKitError) {
        this.status = paymentKitStatusResult;
        this.error = paymentKitError;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentKitChallengeResult)) {
            return false;
        }
        PaymentKitChallengeResult paymentKitChallengeResult = (PaymentKitChallengeResult) obj;
        return this.status == paymentKitChallengeResult.status && jl40.l(this.error, paymentKitChallengeResult.error);
    }

    public final int hashCode() {
        int hashCode = this.status.hashCode() * 31;
        PaymentKitError paymentKitError = this.error;
        return hashCode + (paymentKitError == null ? 0 : paymentKitError.hashCode());
    }

    public final String toString() {
        return "PaymentKitChallengeResult(status=" + this.status + ", error=" + this.error + Extension.C_BRAKE;
    }
}
