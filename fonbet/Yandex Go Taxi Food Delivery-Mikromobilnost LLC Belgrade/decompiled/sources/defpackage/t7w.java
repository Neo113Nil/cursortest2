package defpackage;

import com.yandex.fintechsdk.flows.payment.kit.api.model.AdditionalSettings;
import com.yandex.fintechsdk.flows.payment.kit.api.model.Merchant;
import com.yandex.fintechsdk.flows.payment.kit.api.model.Payer;
import com.yandex.fintechsdk.flows.payment.kit.api.model.PaymentKitEnvironment;
import com.yandex.fintechsdk.flows.payment.kit.internal.model.Scenario;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class t7w {
    public final AdditionalSettings a;
    public final v2a0 b;
    public final PaymentKitEnvironment c;
    public final Merchant d;
    public final Payer e;
    public final Scenario f;
    public final s3a0 g;
    public final boolean h;

    public t7w(AdditionalSettings additionalSettings, v2a0 v2a0Var, PaymentKitEnvironment paymentKitEnvironment, Merchant merchant, Payer payer, Scenario scenario, s3a0 s3a0Var, boolean z) {
        this.a = additionalSettings;
        this.b = v2a0Var;
        this.c = paymentKitEnvironment;
        this.d = merchant;
        this.e = payer;
        this.f = scenario;
        this.g = s3a0Var;
        this.h = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t7w) {
            t7w t7wVar = (t7w) obj;
            if (this.a == t7wVar.a && this.b.equals(t7wVar.b) && this.c == t7wVar.c && this.d == t7wVar.d && this.e == t7wVar.e && this.f.equals(t7wVar.f) && this.g.equals(t7wVar.g) && this.h == t7wVar.h) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + unr0.b((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b.a)) * 31)) * 31)) * 31)) * 31, 31, this.g.a);
    }

    public final String toString() {
        return "IntentArgs(additionalSettings=" + this.a + ", apiInstanceId=" + this.b + ", environment=" + this.c + ", merchant=" + this.d + ", payer=" + this.e + ", scenario=" + this.f + ", sessionId=" + this.g + ", isBottomSheet=" + this.h + Extension.C_BRAKE;
    }
}
