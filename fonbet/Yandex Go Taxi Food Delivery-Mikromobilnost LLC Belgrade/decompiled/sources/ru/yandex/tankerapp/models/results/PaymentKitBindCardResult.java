package ru.yandex.tankerapp.models.results;

import com.yandex.payment.sdk.core.data.PaymentKitError;
import defpackage.jl40;
import defpackage.ysq0;
import java.io.Serializable;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0080\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/yandex/tankerapp/models/results/PaymentKitBindCardResult;", "Ljava/io/Serializable;", "", "cardId", "Lru/yandex/tankerapp/models/results/PaymentKitStatusResult;", ACSPConstants.STATUS, "Lcom/yandex/payment/sdk/core/data/PaymentKitError;", "error", "<init>", "(Ljava/lang/String;Lru/yandex/tankerapp/models/results/PaymentKitStatusResult;Lcom/yandex/payment/sdk/core/data/PaymentKitError;)V", "Ljava/lang/String;", "getCardId", "()Ljava/lang/String;", "Lru/yandex/tankerapp/models/results/PaymentKitStatusResult;", "getStatus", "()Lru/yandex/tankerapp/models/results/PaymentKitStatusResult;", "Lcom/yandex/payment/sdk/core/data/PaymentKitError;", "getError", "()Lcom/yandex/payment/sdk/core/data/PaymentKitError;", "car_tech_payment_sdk_android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class PaymentKitBindCardResult implements Serializable {

    @ysq0("cardId")
    private final String cardId;

    @ysq0("error")
    private final PaymentKitError error;

    @ysq0(ACSPConstants.STATUS)
    private final PaymentKitStatusResult status;

    public PaymentKitBindCardResult(String str, PaymentKitStatusResult paymentKitStatusResult, PaymentKitError paymentKitError) {
        this.cardId = str;
        this.status = paymentKitStatusResult;
        this.error = paymentKitError;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentKitBindCardResult)) {
            return false;
        }
        PaymentKitBindCardResult paymentKitBindCardResult = (PaymentKitBindCardResult) obj;
        return jl40.l(this.cardId, paymentKitBindCardResult.cardId) && this.status == paymentKitBindCardResult.status && jl40.l(this.error, paymentKitBindCardResult.error);
    }

    public final int hashCode() {
        String str = this.cardId;
        int hashCode = (this.status.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        PaymentKitError paymentKitError = this.error;
        return hashCode + (paymentKitError != null ? paymentKitError.hashCode() : 0);
    }

    public final String toString() {
        return "PaymentKitBindCardResult(cardId=" + this.cardId + ", status=" + this.status + ", error=" + this.error + Extension.C_BRAKE;
    }
}
