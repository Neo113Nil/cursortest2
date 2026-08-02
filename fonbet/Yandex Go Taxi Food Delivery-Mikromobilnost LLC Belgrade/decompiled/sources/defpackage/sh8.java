package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class sh8 {
    public final boolean a;
    public final w9a1 b;
    public final boolean c;
    public final String d;

    public /* synthetic */ sh8(String str, int i) {
        this(true, null, false, (i & 8) != 0 ? null : str);
    }

    public static sh8 a(sh8 sh8Var, boolean z, w9a1 w9a1Var, String str, int i) {
        if ((i & 1) != 0) {
            z = sh8Var.a;
        }
        if ((i & 2) != 0) {
            w9a1Var = sh8Var.b;
        }
        boolean z2 = (i & 4) != 0 ? sh8Var.c : true;
        if ((i & 8) != 0) {
            str = sh8Var.d;
        }
        sh8Var.getClass();
        return new sh8(z, w9a1Var, z2, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sh8)) {
            return false;
        }
        sh8 sh8Var = (sh8) obj;
        return this.a == sh8Var.a && jl40.l(this.b, sh8Var.b) && this.c == sh8Var.c && jl40.l(this.d, sh8Var.d);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        w9a1 w9a1Var = this.b;
        int e = unr0.e((hashCode + (w9a1Var == null ? 0 : w9a1Var.hashCode())) * 31, 31, this.c);
        String str = this.d;
        return e + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CardIssueState(inProgress=");
        sb.append(this.a);
        sb.append(", error=");
        sb.append(this.b);
        sb.append(", cardSubmitted=");
        return n.m(", agreementId=", this.d, Extension.C_BRAKE, sb, this.c);
    }

    public sh8() {
        this(null, 15);
    }

    public sh8(boolean z, w9a1 w9a1Var, boolean z2, String str) {
        this.a = z;
        this.b = w9a1Var;
        this.c = z2;
        this.d = str;
    }
}
