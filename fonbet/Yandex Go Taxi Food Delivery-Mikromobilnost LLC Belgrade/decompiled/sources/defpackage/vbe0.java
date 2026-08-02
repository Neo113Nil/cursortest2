package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class vbe0 implements peo {
    public final u1m a;
    public final wbe0 b;

    public vbe0(u1m u1mVar, wbe0 wbe0Var) {
        this.a = u1mVar;
        this.b = wbe0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!vbe0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        vbe0 vbe0Var = (vbe0) obj;
        return jl40.l(this.a, vbe0Var.a) && jl40.l(this.b, vbe0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Started(query=" + this.a + ", portionParams=" + this.b + Extension.C_BRAKE;
    }
}
