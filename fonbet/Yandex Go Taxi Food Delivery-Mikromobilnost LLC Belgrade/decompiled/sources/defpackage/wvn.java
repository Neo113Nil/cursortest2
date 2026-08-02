package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class wvn {
    public final Throwable a;

    public wvn(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wvn) && jl40.l(this.a, ((wvn) obj).a);
    }

    public final int hashCode() {
        Throwable th = this.a;
        if (th == null) {
            return 0;
        }
        return th.hashCode();
    }

    public final String toString() {
        return b64.m("EmptyLinkResolverState(error=", Extension.C_BRAKE, this.a);
    }

    public wvn() {
        this(null);
    }
}
