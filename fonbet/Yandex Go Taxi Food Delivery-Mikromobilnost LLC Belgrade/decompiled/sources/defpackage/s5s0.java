package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class s5s0 implements xs11 {
    public final Object a;

    public s5s0(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s5s0) && jl40.l(this.a, ((s5s0) obj).a);
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return qv10.p("ShowCancelVerificationDialogEffect(value=", Extension.C_BRAKE, this.a);
    }

    public s5s0() {
        this(null);
    }
}
