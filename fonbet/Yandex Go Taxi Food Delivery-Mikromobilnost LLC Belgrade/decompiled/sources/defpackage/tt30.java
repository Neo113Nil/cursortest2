package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class tt30 implements vt30 {
    public final ks30 a;

    public tt30(ks30 ks30Var) {
        this.a = ks30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tt30) && this.a.equals(((tt30) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "PurchaseTapped(purchase=" + this.a + Extension.C_BRAKE;
    }
}
