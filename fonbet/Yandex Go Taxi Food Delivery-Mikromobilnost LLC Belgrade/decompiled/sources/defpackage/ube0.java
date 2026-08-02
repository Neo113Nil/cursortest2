package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class ube0 implements peo {
    public final u1m a;
    public final wbe0 b;
    public final xzl c;

    public ube0(u1m u1mVar, wbe0 wbe0Var, xzl xzlVar) {
        this.a = u1mVar;
        this.b = wbe0Var;
        this.c = xzlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ube0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        ube0 ube0Var = (ube0) obj;
        return jl40.l(this.a, ube0Var.a) && jl40.l(this.b, ube0Var.b) && this.c.equals(ube0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Finished(query=" + this.a + ", portionParams=" + this.b + ", documentFetchResult=" + this.c + Extension.C_BRAKE;
    }
}
