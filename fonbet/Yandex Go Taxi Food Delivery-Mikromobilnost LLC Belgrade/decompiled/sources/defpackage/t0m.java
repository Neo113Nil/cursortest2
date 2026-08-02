package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class t0m implements peo {
    public final u1m a;
    public final Throwable b;

    public t0m(u1m u1mVar, Throwable th) {
        this.a = u1mVar;
        this.b = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!t0m.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        t0m t0mVar = (t0m) obj;
        return jl40.l(this.a, t0mVar.a) && jl40.l(this.b, t0mVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Cancelled(query=" + this.a + ", cause=" + this.b + Extension.C_BRAKE;
    }
}
