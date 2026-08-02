package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class s380 {
    public static final s380 c = new s380(n380.e, k380.c);
    public final n380 a;
    public final m380 b;

    public s380(n380 n380Var, m380 m380Var) {
        this.a = n380Var;
        this.b = m380Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s380)) {
            return false;
        }
        s380 s380Var = (s380) obj;
        return jl40.l(this.a, s380Var.a) && this.b.equals(s380Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OrderPinV2StateWithType(state=" + this.a + ", type=" + this.b + Extension.C_BRAKE;
    }
}
