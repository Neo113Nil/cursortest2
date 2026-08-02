package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class q3 implements r3 {
    public final String a;
    public final kbj b;
    public final String c;
    public final String d;
    public final a63 e;

    public q3(String str, kbj kbjVar, String str2, String str3, a63 a63Var) {
        kbjVar.getClass();
        str2.getClass();
        str3.getClass();
        this.a = str;
        this.b = kbjVar;
        this.c = str2;
        this.d = str3;
        this.e = a63Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q3)) {
            return false;
        }
        q3 q3Var = (q3) obj;
        return Intrinsics.d(this.a, q3Var.a) && Intrinsics.d(this.b, q3Var.b) && Intrinsics.d(this.c, q3Var.c) && Intrinsics.d(this.d, q3Var.d) && Intrinsics.d(this.e, q3Var.e);
    }

    public final int hashCode() {
        String str = this.a;
        int c = k5r.c(k5r.c((this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31, 31, this.c), 31, this.d);
        a63 a63Var = this.e;
        return c + (a63Var != null ? a63Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Success(title=");
        sb.append(this.a);
        sb.append(", uiData=");
        sb.append(this.b);
        sb.append(", description=");
        su4.v(sb, this.c, ", albumId=", this.d, ", analyticsPayload=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }
}
