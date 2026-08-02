package ru.yandex.tankerapp.models.results;

import com.yandex.payment.sdk.core.data.PaymentKitError;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.ysq0;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/yandex/tankerapp/models/results/PaymentKitPaymentResult;", "Ljava/io/Serializable;", "Lru/yandex/tankerapp/models/results/PaymentKitStatusResult;", ACSPConstants.STATUS, "Lcom/yandex/payment/sdk/core/data/PaymentKitError;", "error", "", "selectedSbpBank", "<init>", "(Lru/yandex/tankerapp/models/results/PaymentKitStatusResult;Lcom/yandex/payment/sdk/core/data/PaymentKitError;Ljava/lang/String;)V", "Lru/yandex/tankerapp/models/results/PaymentKitStatusResult;", "getStatus", "()Lru/yandex/tankerapp/models/results/PaymentKitStatusResult;", "Lcom/yandex/payment/sdk/core/data/PaymentKitError;", "getError", "()Lcom/yandex/payment/sdk/core/data/PaymentKitError;", "Ljava/lang/String;", "getSelectedSbpBank", "()Ljava/lang/String;", "car_tech_payment_sdk_android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class PaymentKitPaymentResult implements Serializable {

    @ysq0("error")
    private final PaymentKitError error;

    @ysq0("selectedSbpBank")
    private final String selectedSbpBank;

    @ysq0(ACSPConstants.STATUS)
    private final PaymentKitStatusResult status;

    public /* synthetic */ PaymentKitPaymentResult(PaymentKitStatusResult paymentKitStatusResult, PaymentKitError paymentKitError, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(paymentKitStatusResult, (i & 2) != 0 ? null : paymentKitError, (i & 4) != 0 ? null : str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentKitPaymentResult)) {
            return false;
        }
        PaymentKitPaymentResult paymentKitPaymentResult = (PaymentKitPaymentResult) obj;
        return this.status == paymentKitPaymentResult.status && jl40.l(this.error, paymentKitPaymentResult.error) && jl40.l(this.selectedSbpBank, paymentKitPaymentResult.selectedSbpBank);
    }

    public final int hashCode() {
        int hashCode = this.status.hashCode() * 31;
        PaymentKitError paymentKitError = this.error;
        int hashCode2 = (hashCode + (paymentKitError == null ? 0 : paymentKitError.hashCode())) * 31;
        String str = this.selectedSbpBank;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        PaymentKitStatusResult paymentKitStatusResult = this.status;
        PaymentKitError paymentKitError = this.error;
        String str = this.selectedSbpBank;
        StringBuilder sb = new StringBuilder("PaymentKitPaymentResult(status=");
        sb.append(paymentKitStatusResult);
        sb.append(", error=");
        sb.append(paymentKitError);
        sb.append(", selectedSbpBank=");
        return oyr.t(sb, str, Extension.C_BRAKE);
    }

    public PaymentKitPaymentResult(PaymentKitStatusResult paymentKitStatusResult, PaymentKitError paymentKitError, String str) {
        this.status = paymentKitStatusResult;
        this.error = paymentKitError;
        this.selectedSbpBank = str;
    }
}
