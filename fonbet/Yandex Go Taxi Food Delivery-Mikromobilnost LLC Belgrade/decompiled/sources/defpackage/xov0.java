package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class xov0 extends yov0 {
    public final qct0 a;

    public xov0(qct0 qct0Var) {
        this.a = qct0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xov0) && jl40.l(this.a, ((xov0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Visible(model=" + this.a + Extension.C_BRAKE;
    }
}
