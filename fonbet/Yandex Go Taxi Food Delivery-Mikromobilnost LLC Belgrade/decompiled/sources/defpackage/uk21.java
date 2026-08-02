package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class uk21 implements qas0 {
    public final n0t0 a;

    public uk21(n0t0 n0t0Var) {
        this.a = n0t0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uk21) && this.a.equals(((uk21) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return n.i("Snackbar(content=", this.a, Extension.C_BRAKE);
    }
}
