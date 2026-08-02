package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class q540 implements s540 {
    public final vt30 a;

    public q540(vt30 vt30Var) {
        this.a = vt30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q540) && jl40.l(this.a, ((q540) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Purchase(event=" + this.a + Extension.C_BRAKE;
    }
}
