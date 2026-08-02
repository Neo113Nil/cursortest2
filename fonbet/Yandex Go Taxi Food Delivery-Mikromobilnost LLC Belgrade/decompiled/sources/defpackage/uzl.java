package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class uzl extends wzl {
    public final Throwable a;

    public uzl(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return uzl.class.equals(obj != null ? obj.getClass() : null) && jl40.l(this.a, ((uzl) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.m("DocumentFetchError(cause=", Extension.C_BRAKE, this.a);
    }
}
