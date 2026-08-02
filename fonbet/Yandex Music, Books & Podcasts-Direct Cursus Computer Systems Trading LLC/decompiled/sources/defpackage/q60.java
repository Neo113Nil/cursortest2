package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q60 {
    public final z77 a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public q60(z77 z77Var, String str, String str2, String str3, String str4) {
        z77Var.getClass();
        str2.getClass();
        this.a = z77Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q60)) {
            return false;
        }
        q60 q60Var = (q60) obj;
        return Intrinsics.d(this.a, q60Var.a) && Intrinsics.d(this.b, q60Var.b) && Intrinsics.d(this.c, q60Var.c) && this.d.equals(q60Var.d) && this.e.equals(q60Var.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.e.hashCode() + k5r.c(k5r.c((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnalyticEventImpl(environment=");
        sb.append(this.a);
        sb.append(", userId=");
        sb.append(this.b);
        sb.append(", name=");
        sb.append(this.c);
        sb.append(", slot=");
        sb.append(this.d);
        sb.append(", json=");
        return dfi.i(sb, this.e, ')');
    }
}
