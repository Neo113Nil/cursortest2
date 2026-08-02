package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class ypx0 implements zpx0 {
    public final Throwable a;

    public ypx0(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ypx0) && this.a.equals(((ypx0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.m("ZoneFetchingError(error=", Extension.C_BRAKE, this.a);
    }
}
