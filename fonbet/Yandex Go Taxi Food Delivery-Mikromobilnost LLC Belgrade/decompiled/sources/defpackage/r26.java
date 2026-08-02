package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class r26 {
    public final o26 a;
    public final k26 b;

    public r26(o26 o26Var, k26 k26Var) {
        this.a = o26Var;
        this.b = k26Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r26)) {
            return false;
        }
        r26 r26Var = (r26) obj;
        return jl40.l(this.a, r26Var.a) && jl40.l(this.b, r26Var.b);
    }

    public final int hashCode() {
        o26 o26Var = this.a;
        int hashCode = (o26Var == null ? 0 : o26Var.hashCode()) * 31;
        k26 k26Var = this.b;
        return hashCode + (k26Var != null ? k26Var.hashCode() : 0);
    }

    public final String toString() {
        return "BlePaymentSections(headerSection=" + this.a + ", bleSection=" + this.b + Extension.C_BRAKE;
    }

    public r26() {
        this(null, null);
    }
}
