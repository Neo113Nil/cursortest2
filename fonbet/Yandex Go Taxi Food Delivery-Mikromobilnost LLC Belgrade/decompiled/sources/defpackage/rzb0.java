package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class rzb0 {
    public final kn00 a;
    public final qzb0 b;

    public rzb0(kn00 kn00Var, qzb0 qzb0Var) {
        this.a = kn00Var;
        this.b = qzb0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rzb0)) {
            return false;
        }
        rzb0 rzb0Var = (rzb0) obj;
        return jl40.l(this.a, rzb0Var.a) && this.b.equals(rzb0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CachedSeed(item=" + this.a + ", seed=" + this.b + Extension.C_BRAKE;
    }
}
