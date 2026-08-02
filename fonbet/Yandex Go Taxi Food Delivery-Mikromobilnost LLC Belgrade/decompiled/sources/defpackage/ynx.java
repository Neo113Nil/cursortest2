package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class ynx implements aox {
    public final Throwable a;

    public ynx(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ynx) && jl40.l(this.a, ((ynx) obj).a);
    }

    public final int hashCode() {
        Throwable th = this.a;
        if (th == null) {
            return 0;
        }
        return th.hashCode();
    }

    public final String toString() {
        return b64.m("ApplicationInfo(error=", Extension.C_BRAKE, this.a);
    }

    public ynx() {
        this(null);
    }
}
