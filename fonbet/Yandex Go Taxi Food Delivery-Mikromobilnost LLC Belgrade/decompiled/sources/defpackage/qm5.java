package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class qm5 {
    public final String a;
    public final String b;
    public final boolean c;
    public final String d;
    public final String e;
    public final boolean f;

    public /* synthetic */ qm5(String str, String str2, String str3, int i) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, false, false, (i & 8) != 0 ? "" : str3, "");
    }

    public static qm5 a(qm5 qm5Var, String str, boolean z, String str2, String str3, boolean z2, int i) {
        if ((i & 1) != 0) {
            str = qm5Var.a;
        }
        String str4 = str;
        String str5 = qm5Var.b;
        if ((i & 4) != 0) {
            z = qm5Var.c;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            str2 = qm5Var.d;
        }
        String str6 = str2;
        if ((i & 16) != 0) {
            str3 = qm5Var.e;
        }
        String str7 = str3;
        if ((i & 32) != 0) {
            z2 = qm5Var.f;
        }
        qm5Var.getClass();
        return new qm5(str4, str5, z3, z2, str6, str7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qm5)) {
            return false;
        }
        qm5 qm5Var = (qm5) obj;
        return jl40.l(this.a, qm5Var.a) && jl40.l(this.b, qm5Var.b) && this.c == qm5Var.c && jl40.l(this.d, qm5Var.d) && jl40.l(this.e, qm5Var.e) && this.f == qm5Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + unr0.b(unr0.b(unr0.e(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder v = b64.v("BenefitActivationUiState(title=", this.a, ", codeFromDeeplink=", this.b, ", showErrorTitle=");
        unr0.A(", buttonText=", this.d, ", codeWithError=", v, this.c);
        return nnm.i(this.e, ", isScreenLoading=", Extension.C_BRAKE, v, this.f);
    }

    public qm5(String str, String str2, boolean z, boolean z2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
        this.e = str4;
        this.f = z2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public qm5() {
        this(r0, r0, r0, 63);
        String str = null;
    }
}
