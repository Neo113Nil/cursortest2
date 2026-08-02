package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class xgl0 extends zgl0 {
    public final jw40 a;

    public xgl0(jw40 jw40Var) {
        this.a = jw40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xgl0) && jl40.l(this.a, ((xgl0) obj).a);
    }

    public final int hashCode() {
        jw40 jw40Var = this.a;
        if (jw40Var == null) {
            return 0;
        }
        return jw40Var.hashCode();
    }

    public final String toString() {
        return "Failure(alert=" + this.a + Extension.C_BRAKE;
    }
}
