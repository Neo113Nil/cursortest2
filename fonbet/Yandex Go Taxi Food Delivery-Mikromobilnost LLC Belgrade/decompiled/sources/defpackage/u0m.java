package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class u0m extends f1m {
    public final l1o a;
    public final u1m b;

    public u0m(l1o l1oVar, u1m u1mVar) {
        this.a = l1oVar;
        this.b = u1mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!u0m.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        u0m u0mVar = (u0m) obj;
        return jl40.l(this.a, u0mVar.a) && jl40.l(this.b, u0mVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Cancelled(context=" + this.a + ", query=" + this.b + Extension.C_BRAKE;
    }
}
