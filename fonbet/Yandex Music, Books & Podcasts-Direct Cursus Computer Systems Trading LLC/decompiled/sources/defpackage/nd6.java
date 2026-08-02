package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class nd6 implements rd6 {
    public final bu8 a;
    public final boolean b;

    public nd6(bu8 bu8Var, boolean z) {
        bu8Var.getClass();
        this.a = bu8Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nd6)) {
            return false;
        }
        nd6 nd6Var = (nd6) obj;
        return Intrinsics.d(this.a, nd6Var.a) && this.b == nd6Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(divContent=" + this.a + ", isSkippable=" + this.b + ")";
    }
}
