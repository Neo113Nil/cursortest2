package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class x0m implements peo {
    public final u1m a;
    public final xzl b;

    public x0m(xzl xzlVar, u1m u1mVar) {
        this.a = u1mVar;
        this.b = xzlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!x0m.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        x0m x0mVar = (x0m) obj;
        return jl40.l(this.a, x0mVar.a) && jl40.l(this.b, x0mVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Finished(query=" + this.a + ", documentFetchResult=" + this.b + Extension.C_BRAKE;
    }
}
