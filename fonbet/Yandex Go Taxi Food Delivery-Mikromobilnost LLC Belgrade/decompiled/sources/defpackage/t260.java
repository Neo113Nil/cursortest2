package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class t260 extends y260 {
    public final u460 a;

    public t260(u460 u460Var) {
        this.a = u460Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t260) && jl40.l(this.a, ((t260) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "AddSignature(screen=" + this.a + Extension.C_BRAKE;
    }
}
