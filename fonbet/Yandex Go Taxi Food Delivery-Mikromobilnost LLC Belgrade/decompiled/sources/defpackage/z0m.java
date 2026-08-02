package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class z0m extends f1m {
    public final l1o a;
    public final u1m b;
    public final wbe0 c;

    public z0m(l1o l1oVar, u1m u1mVar, wbe0 wbe0Var) {
        this.a = l1oVar;
        this.b = u1mVar;
        this.c = wbe0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!z0m.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        z0m z0mVar = (z0m) obj;
        return jl40.l(this.a, z0mVar.a) && jl40.l(this.b, z0mVar.b) && jl40.l(this.c, z0mVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PortionCancelled(context=" + this.a + ", query=" + this.b + ", portionParams=" + this.c + Extension.C_BRAKE;
    }
}
