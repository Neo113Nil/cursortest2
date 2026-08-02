package defpackage;

/* loaded from: classes4.dex */
public final class qr6 implements rr6 {
    public final String a;
    public final boolean b;
    public final boolean c;

    public qr6(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public static qr6 a(qr6 qr6Var, String str, boolean z, int i) {
        if ((i & 1) != 0) {
            str = qr6Var.a;
        }
        boolean z2 = (i & 4) != 0 ? qr6Var.c : false;
        str.getClass();
        return new qr6(str, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qr6)) {
            return false;
        }
        qr6 qr6Var = (qr6) obj;
        return this.a.equals(qr6Var.a) && this.b == qr6Var.b && this.c == qr6Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + k5r.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return ouj.r(v3w.h("Input(inputText=", this.a, ", isOkButtonEnabled=", ", isCancelButtonEnabled=", this.b), this.c, ")");
    }
}
