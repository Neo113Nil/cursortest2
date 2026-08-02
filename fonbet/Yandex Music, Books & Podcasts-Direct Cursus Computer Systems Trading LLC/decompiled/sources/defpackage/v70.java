package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class v70 {
    public final x70 a;
    public final String b;
    public final w70 c;

    public v70(x70 x70Var, String str, w70 w70Var) {
        str.getClass();
        w70Var.getClass();
        this.a = x70Var;
        this.b = str;
        this.c = w70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v70)) {
            return false;
        }
        v70 v70Var = (v70) obj;
        return this.a == v70Var.a && Intrinsics.d(this.b, v70Var.b) && Intrinsics.d(this.c, v70Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "AnalyticsEntityData(entityType=" + this.a + ", entityId=" + this.b + ", entityPosition=" + this.c + ")";
    }
}
