package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class uh5 {
    public final th5 a;
    public final String b;
    public final String c;
    public final String d;
    public final rh5 e;
    public final sh5 f;

    public uh5(th5 th5Var, String str, String str2, String str3, rh5 rh5Var, sh5 sh5Var) {
        str.getClass();
        this.a = th5Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = rh5Var;
        this.f = sh5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uh5)) {
            return false;
        }
        uh5 uh5Var = (uh5) obj;
        return this.a == uh5Var.a && Intrinsics.d(this.b, uh5Var.b) && Intrinsics.d(this.c, uh5Var.c) && Intrinsics.d(this.d, uh5Var.d) && Intrinsics.d(this.e, uh5Var.e) && Intrinsics.d(this.f, uh5Var.f);
    }

    public final int hashCode() {
        int c = k5r.c(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int hashCode = (c + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        rh5 rh5Var = this.e;
        int hashCode3 = (hashCode2 + (rh5Var == null ? 0 : rh5Var.hashCode())) * 31;
        sh5 sh5Var = this.f;
        return hashCode3 + (sh5Var != null ? sh5Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(toastType=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", subtitle=");
        su4.v(sb, this.c, ", imageUrl=", this.d, ", action=");
        sb.append(this.e);
        sb.append(", timers=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}
