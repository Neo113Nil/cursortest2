package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class ufg0 implements qas0 {
    public final n0t0 a;

    public ufg0(n0t0 n0t0Var) {
        this.a = n0t0Var;
    }

    public final n0t0 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ufg0) && this.a.equals(((ufg0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return n.i("ShowSnackBar(content=", this.a, Extension.C_BRAKE);
    }
}
