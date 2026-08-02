package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class sg8 {
    public final qk8 a;
    public final mof b;
    public final gso c;
    public final int d;
    public final String e;
    public final z22 f;
    public final b5n g;
    public final int h;
    public final String i;
    public final hau0 j;
    public final String k;
    public final boolean l;
    public final boolean m;

    public sg8(qk8 qk8Var, mof mofVar, gso gsoVar, int i, String str, z22 z22Var, b5n b5nVar, int i2, String str2, hau0 hau0Var, String str3, boolean z, boolean z2) {
        this.a = qk8Var;
        this.b = mofVar;
        this.c = gsoVar;
        this.d = i;
        this.e = str;
        this.f = z22Var;
        this.g = b5nVar;
        this.h = i2;
        this.i = str2;
        this.j = hau0Var;
        this.k = str3;
        this.l = z;
        this.m = z2;
    }

    public static sg8 a(sg8 sg8Var, qk8 qk8Var, mof mofVar, gso gsoVar, int i, String str, z22 z22Var, b5n b5nVar, int i2, String str2, hau0 hau0Var, String str3, boolean z, boolean z2, int i3) {
        if ((i3 & 1) != 0) {
            qk8Var = sg8Var.a;
        }
        qk8 qk8Var2 = qk8Var;
        mof mofVar2 = (i3 & 2) != 0 ? sg8Var.b : mofVar;
        gso gsoVar2 = (i3 & 4) != 0 ? sg8Var.c : gsoVar;
        int i4 = (i3 & 8) != 0 ? sg8Var.d : i;
        String str4 = (i3 & 16) != 0 ? sg8Var.e : str;
        z22 z22Var2 = (i3 & 32) != 0 ? sg8Var.f : z22Var;
        b5n b5nVar2 = (i3 & 64) != 0 ? sg8Var.g : b5nVar;
        int i5 = (i3 & 128) != 0 ? sg8Var.h : i2;
        String str5 = (i3 & 256) != 0 ? sg8Var.i : str2;
        hau0 hau0Var2 = (i3 & 512) != 0 ? sg8Var.j : hau0Var;
        String str6 = (i3 & 1024) != 0 ? sg8Var.k : str3;
        boolean z3 = (i3 & 2048) != 0 ? sg8Var.l : z;
        boolean z4 = (i3 & 4096) != 0 ? sg8Var.m : z2;
        sg8Var.getClass();
        return new sg8(qk8Var2, mofVar2, gsoVar2, i4, str4, z22Var2, b5nVar2, i5, str5, hau0Var2, str6, z3, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sg8)) {
            return false;
        }
        sg8 sg8Var = (sg8) obj;
        return this.a.equals(sg8Var.a) && this.b.equals(sg8Var.b) && this.c.equals(sg8Var.c) && this.d == sg8Var.d && jl40.l(this.e, sg8Var.e) && jl40.l(this.f, sg8Var.f) && jl40.l(this.g, sg8Var.g) && this.h == sg8Var.h && jl40.l(this.i, sg8Var.i) && this.j.equals(sg8Var.j) && jl40.l(this.k, sg8Var.k) && this.l == sg8Var.l && this.m == sg8Var.m;
    }

    public final int hashCode() {
        int b = oyr.b(this.d, (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31);
        String str = this.e;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        z22 z22Var = this.f;
        int hashCode2 = (hashCode + (z22Var == null ? 0 : z22Var.hashCode())) * 31;
        b5n b5nVar = this.g;
        int b2 = oyr.b(this.h, (hashCode2 + (b5nVar == null ? 0 : b5nVar.hashCode())) * 31, 31);
        String str2 = this.i;
        int hashCode3 = (this.j.hashCode() + ((b2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        String str3 = this.k;
        return Boolean.hashCode(this.m) + unr0.e((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.l);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CardInputState(cardNumberField=");
        sb.append(this.a);
        sb.append(", cvvField=");
        sb.append(this.b);
        sb.append(", expiryDateField=");
        sb.append(this.c);
        sb.append(", networkImageRes=");
        sb.append(this.d);
        sb.append(", networkIconUrl=");
        sb.append(this.e);
        sb.append(", iconAnalytics=");
        sb.append(this.f);
        sb.append(", iconBinWrapper=");
        sb.append(this.g);
        sb.append(", securityCodeStringRes=");
        sb.append(this.h);
        sb.append(", securityCodeLabel=");
        sb.append(this.i);
        sb.append(", step=");
        sb.append(this.j);
        sb.append(", trackedIconUrl=");
        tse0.y(this.k, ", isCvvHidden=", ", isBinInfoLoading=", sb, this.l);
        return x4e.i(sb, this.m, Extension.C_BRAKE);
    }
}
