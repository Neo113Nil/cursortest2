package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class xb21 extends yb21 {
    public final n0t0 a;

    public xb21(n0t0 n0t0Var) {
        this.a = n0t0Var;
    }

    public final n0t0 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xb21) && this.a.equals(((xb21) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return n.i("Snackbar(content=", this.a, Extension.C_BRAKE);
    }
}
