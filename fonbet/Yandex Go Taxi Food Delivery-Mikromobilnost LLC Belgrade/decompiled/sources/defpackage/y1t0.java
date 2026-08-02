package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0(with = z1t0.class)
/* loaded from: classes4.dex */
public final class y1t0 {
    public static final x1t0 Companion = new x1t0();
    public final ruw a;
    public final ruw b;

    public y1t0(ruw ruwVar, ruw ruwVar2) {
        this.a = ruwVar;
        this.b = ruwVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!y1t0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        y1t0 y1t0Var = (y1t0) obj;
        return jl40.l(this.a, y1t0Var.a) && jl40.l(this.b, y1t0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SnappingInterval(intervalStart=" + this.a + ", intervalEnd=" + this.b + Extension.C_BRAKE;
    }
}
