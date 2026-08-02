package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a8r implements c8r {
    public final rv8 a;
    public final boolean b;

    public a8r(rv8 rv8Var, boolean z) {
        rv8Var.getClass();
        this.a = rv8Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a8r)) {
            return false;
        }
        a8r a8rVar = (a8r) obj;
        return Intrinsics.d(this.a, a8rVar.a) && this.b == a8rVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Content(div=" + this.a + ", isVibrationEnabled=" + this.b + ")";
    }
}
