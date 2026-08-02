package defpackage;

import com.yandex.payment.sdk.core.data.PaymentPollingResult;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class um0 extends ym0 {
    public final PaymentPollingResult a;

    public um0(PaymentPollingResult paymentPollingResult) {
        this.a = paymentPollingResult;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof um0) && this.a == ((um0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "NONE(pollingResult=" + this.a + Extension.C_BRAKE;
    }
}
