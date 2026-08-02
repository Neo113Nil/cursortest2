package defpackage;

import com.ybsdk.feature.qr.payments.internal.screens.subscription.data.entities.SubscriptionStatus;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class sag0 {
    public final SubscriptionStatus a;
    public final String b;

    public sag0(SubscriptionStatus subscriptionStatus, String str) {
        this.a = subscriptionStatus;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sag0)) {
            return false;
        }
        sag0 sag0Var = (sag0) obj;
        return this.a == sag0Var.a && jl40.l(this.b, sag0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "QrPaymentsStatusEntity(status=" + this.a + ", message=" + this.b + Extension.C_BRAKE;
    }
}
