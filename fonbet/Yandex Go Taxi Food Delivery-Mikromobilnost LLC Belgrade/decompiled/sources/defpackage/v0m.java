package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class v0m implements peo {
    public final u1m a;
    public final Throwable b;

    public v0m(u1m u1mVar, Throwable th) {
        this.a = u1mVar;
        this.b = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!v0m.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        v0m v0mVar = (v0m) obj;
        return jl40.l(this.a, v0mVar.a) && jl40.l(this.b, v0mVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Failed(query=" + this.a + ", error=" + this.b + Extension.C_BRAKE;
    }
}
