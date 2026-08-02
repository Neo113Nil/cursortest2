package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class t5s0 implements ys11 {
    public final Object a;

    public t5s0(Exception exc) {
        this.a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t5s0) && jl40.l(this.a, ((t5s0) obj).a);
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return qv10.p("ShowCancelVerificationDialogEvent(value=", Extension.C_BRAKE, this.a);
    }

    public t5s0() {
        this(null);
    }
}
