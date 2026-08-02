package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class znx implements aox {
    public final Throwable a;

    public znx(Exception exc) {
        this.a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof znx) && jl40.l(this.a, ((znx) obj).a);
    }

    public final int hashCode() {
        Throwable th = this.a;
        if (th == null) {
            return 0;
        }
        return th.hashCode();
    }

    public final String toString() {
        return b64.m("CameraInitialization(error=", Extension.C_BRAKE, this.a);
    }

    public znx() {
        this(null);
    }
}
