package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class v80 {
    public final String a;
    public final gxc b;
    public final gj c;

    public v80(String str, gxc gxcVar, gj gjVar) {
        str.getClass();
        gxcVar.getClass();
        this.a = str;
        this.b = gxcVar;
        this.c = gjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v80)) {
            return false;
        }
        v80 v80Var = (v80) obj;
        return Intrinsics.d(this.a, v80Var.a) && Intrinsics.d(this.b, v80Var.b) && Intrinsics.d(this.c, v80Var.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        gj gjVar = this.c;
        return hashCode + (gjVar == null ? 0 : gjVar.hashCode());
    }

    public final String toString() {
        return "AnalyticsValues(from=" + this.a + ", fromData=" + this.b + ", adData=" + this.c + ")";
    }
}
