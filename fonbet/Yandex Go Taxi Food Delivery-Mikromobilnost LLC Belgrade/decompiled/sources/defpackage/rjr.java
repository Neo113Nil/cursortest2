package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class rjr {
    public static final rjr b = new rjr(new s7s0(23));
    public final s7s0 a;

    public rjr(s7s0 s7s0Var) {
        this.a = s7s0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return rjr.class.equals(obj != null ? obj.getClass() : null) && this.a == ((rjr) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FlexLogConfiguration(isSourceCodeInfoRequired=" + this.a + Extension.C_BRAKE;
    }
}
