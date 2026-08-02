package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class tbe0 implements peo {
    public final u1m a;
    public final wbe0 b;
    public final Throwable c;

    public tbe0(u1m u1mVar, wbe0 wbe0Var, Throwable th) {
        this.a = u1mVar;
        this.b = wbe0Var;
        this.c = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!tbe0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        tbe0 tbe0Var = (tbe0) obj;
        return jl40.l(this.a, tbe0Var.a) && jl40.l(this.b, tbe0Var.b) && jl40.l(this.c, tbe0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Failed(query=" + this.a + ", portionParams=" + this.b + ", error=" + this.c + Extension.C_BRAKE;
    }
}
