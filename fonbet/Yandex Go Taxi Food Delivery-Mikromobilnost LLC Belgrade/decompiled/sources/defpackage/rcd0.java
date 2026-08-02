package defpackage;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class rcd0 {
    public final String a;
    public final ArrayList b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final boolean g;

    public rcd0(String str, ArrayList arrayList, String str2, String str3, String str4, boolean z, boolean z2) {
        this.a = str;
        this.b = arrayList;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = z;
        this.g = z2;
    }

    public final String a() {
        return this.e;
    }

    public final boolean b() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rcd0)) {
            return false;
        }
        rcd0 rcd0Var = (rcd0) obj;
        return jl40.l(this.a, rcd0Var.a) && this.b.equals(rcd0Var.b) && this.c.equals(rcd0Var.c) && this.d.equals(rcd0Var.d) && this.e.equals(rcd0Var.e) && this.f == rcd0Var.f && this.g == rcd0Var.g;
    }

    public final int hashCode() {
        String str = this.a;
        return Boolean.hashCode(this.g) + unr0.e(unr0.b(unr0.b(unr0.b(ly3.b((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlusPayInAppPurchase(orderId=");
        sb.append(this.a);
        sb.append(", productIds=");
        sb.append(this.b);
        sb.append(", jsonBase64=");
        sb.append(this.c);
        sb.append(", signature=");
        sb.append(this.d);
        sb.append(", token=");
        sb.append(this.e);
        sb.append(", isComplete=");
        sb.append(this.f);
        sb.append(", isAutoRenewing=");
        return unr0.u(sb, this.g, ')');
    }
}
