package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class s9y0 implements t9y0 {
    public final o2y0 a;
    public final long b;
    public final hhs0 c;

    public s9y0(o2y0 o2y0Var, long j, hhs0 hhs0Var) {
        this.a = o2y0Var;
        this.b = j;
        this.c = hhs0Var;
    }

    @Override // defpackage.t9y0
    public final o2y0 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s9y0) {
            s9y0 s9y0Var = (s9y0) obj;
            return jl40.l(this.a, s9y0Var.a) && this.b == s9y0Var.b && this.c == s9y0Var.c;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + qv10.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "Sharing(orderHolder=" + this.a + ", renderThreshold=" + this.b + ", uriProviderDelegate=" + this.c + Extension.C_BRAKE;
    }
}
