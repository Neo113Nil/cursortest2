package defpackage;

import com.ybsdk.widgets.common.YbButtonView;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class wu3 implements zu3 {
    public final pdq0 a;
    public final YbButtonView.a b;

    public wu3(pdq0 pdq0Var, YbButtonView.a aVar) {
        this.a = pdq0Var;
        this.b = aVar;
    }

    public final YbButtonView.a a() {
        return this.b;
    }

    public final pdq0 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wu3)) {
            return false;
        }
        wu3 wu3Var = (wu3) obj;
        return this.a.equals(wu3Var.a) && this.b.equals(wu3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SavingsNotice(selectPaymentMethodViewState=" + this.a + ", primaryButtonState=" + this.b + Extension.C_BRAKE;
    }
}
