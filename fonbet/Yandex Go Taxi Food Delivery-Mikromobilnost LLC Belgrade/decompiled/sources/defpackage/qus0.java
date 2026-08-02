package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class qus0 {
    public static final qus0 e = new qus0(0);
    public final String a;
    public final int b;
    public final int c;
    public final qa6 d;

    public qus0(String str, int i, int i2, qa6 qa6Var) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = qa6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qus0)) {
            return false;
        }
        qus0 qus0Var = (qus0) obj;
        return jl40.l(this.a, qus0Var.a) && this.b == qus0Var.b && this.c == qus0Var.c && jl40.l(this.d, qus0Var.d);
    }

    public final int hashCode() {
        String str = this.a;
        int b = oyr.b(this.c, oyr.b(this.b, (str == null ? 0 : str.hashCode()) * 31, 31), 31);
        qa6 qa6Var = this.d;
        return b + (qa6Var != null ? qa6Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder u = b64.u(this.b, "SlotStyleModel(backgroundColor=", this.a, ", backgroundCornerRadius=", ", horizontalInset=");
        u.append(this.c);
        u.append(", border=");
        u.append(this.d);
        u.append(Extension.C_BRAKE);
        return u.toString();
    }

    public /* synthetic */ qus0(int i) {
        this(null, 0, 8, null);
    }

    public qus0() {
        this(0);
    }
}
