package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class vut0 {
    public final u8j0 a;
    public final boolean b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final String g;
    public final String h;

    public /* synthetic */ vut0(String str, String str2, String str3, int i) {
        this(new t8j0(), true, null, (i & 8) == 0, true, str, str2, str3);
    }

    public static vut0 a(vut0 vut0Var, u8j0 u8j0Var, boolean z, String str, int i) {
        if ((i & 1) != 0) {
            u8j0Var = vut0Var.a;
        }
        u8j0 u8j0Var2 = u8j0Var;
        if ((i & 2) != 0) {
            z = vut0Var.b;
        }
        boolean z2 = z;
        if ((i & 4) != 0) {
            str = vut0Var.c;
        }
        String str2 = str;
        boolean z3 = (i & 8) != 0 ? vut0Var.d : false;
        boolean z4 = (i & 16) != 0 ? vut0Var.e : false;
        String str3 = vut0Var.f;
        String str4 = vut0Var.g;
        String str5 = vut0Var.h;
        vut0Var.getClass();
        return new vut0(u8j0Var2, z2, str2, z3, z4, str3, str4, str5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vut0)) {
            return false;
        }
        vut0 vut0Var = (vut0) obj;
        return jl40.l(this.a, vut0Var.a) && this.b == vut0Var.b && jl40.l(this.c, vut0Var.c) && this.d == vut0Var.d && this.e == vut0Var.e && jl40.l(this.f, vut0Var.f) && jl40.l(this.g, vut0Var.g) && jl40.l(this.h, vut0Var.h);
    }

    public final int hashCode() {
        int e = unr0.e(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int b = unr0.b(unr0.e(unr0.e((e + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f);
        String str2 = this.g;
        int hashCode = (b + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.h;
        return hashCode + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SplitDepositState(pageRequest=");
        sb.append(this.a);
        sb.append(", isHeaderClickable=");
        sb.append(this.b);
        sb.append(", autoTopupPaymentMethodId=");
        tse0.y(this.c, ", shouldResetDivkitVariablesOnNewData=", ", isAutoTopupPaymentWidgetVisible=", sb, this.d);
        unr0.A(", orderId=", this.f, ", scenario=", sb, this.e);
        return g8e.r(sb, this.g, ", previousPaymentIndex=", this.h, Extension.C_BRAKE);
    }

    public vut0(u8j0 u8j0Var, boolean z, String str, boolean z2, boolean z3, String str2, String str3, String str4) {
        this.a = u8j0Var;
        this.b = z;
        this.c = str;
        this.d = z2;
        this.e = z3;
        this.f = str2;
        this.g = str3;
        this.h = str4;
    }
}
