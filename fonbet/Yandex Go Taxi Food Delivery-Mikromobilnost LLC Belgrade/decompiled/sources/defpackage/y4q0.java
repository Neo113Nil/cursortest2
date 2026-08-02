package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class y4q0 extends b5q0 {
    public final hl3 d;

    public y4q0(hl3 hl3Var) {
        super("session", true, true);
        this.d = hl3Var;
    }

    public final hl3 a() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y4q0) && jl40.l(this.d, ((y4q0) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String toString() {
        return "SessionChangedTrigger(authStatus=" + this.d + Extension.C_BRAKE;
    }
}
