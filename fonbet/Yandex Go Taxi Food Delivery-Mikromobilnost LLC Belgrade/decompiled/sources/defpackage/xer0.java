package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class xer0 extends efr0 {
    public final vi3 a;

    public xer0(vi3 vi3Var) {
        this.a = vi3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xer0) && this.a.equals(((xer0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OpenAuthFullscreen(args=" + this.a + Extension.C_BRAKE;
    }
}
