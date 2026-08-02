package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class rib0 implements uib0 {
    public final Throwable a;

    public rib0(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rib0) && jl40.l(this.a, ((rib0) obj).a);
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

    public rib0() {
        this(null);
    }
}
