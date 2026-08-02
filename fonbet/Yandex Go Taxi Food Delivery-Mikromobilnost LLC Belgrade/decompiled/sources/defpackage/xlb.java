package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class xlb implements zlb {
    public final r1a0 a;

    public xlb(r1a0 r1a0Var) {
        this.a = r1a0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xlb) && jl40.l(this.a, ((xlb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "PaymentWidgetReload(context=" + this.a + Extension.C_BRAKE;
    }
}
