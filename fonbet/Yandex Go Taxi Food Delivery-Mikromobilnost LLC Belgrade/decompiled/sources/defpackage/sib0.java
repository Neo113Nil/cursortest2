package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class sib0 implements uib0 {
    public final Throwable a;

    public sib0(Exception exc) {
        this.a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sib0) && jl40.l(this.a, ((sib0) obj).a);
    }

    public final int hashCode() {
        Throwable th = this.a;
        if (th == null) {
            return 0;
        }
        return th.hashCode();
    }

    public final String toString() {
        return b64.m("CameraGeneral(error=", Extension.C_BRAKE, this.a);
    }

    public sib0() {
        this(null);
    }
}
