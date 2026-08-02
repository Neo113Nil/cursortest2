package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class nb6 {
    public final String a;
    public final int b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public nb6(String str, boolean z, boolean z2, boolean z3, int i) {
        str.getClass();
        this.a = str;
        this.b = i;
        this.c = z;
        this.d = z2;
        this.e = z3;
    }

    public static nb6 a(nb6 nb6Var, int i) {
        String str = nb6Var.a;
        int i2 = nb6Var.b;
        boolean z = (i & 4) != 0 ? nb6Var.c : true;
        boolean z2 = (i & 8) != 0 ? nb6Var.d : true;
        boolean z3 = (i & 16) != 0 ? nb6Var.e : true;
        nb6Var.getClass();
        str.getClass();
        return new nb6(str, z, z2, z3, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nb6)) {
            return false;
        }
        nb6 nb6Var = (nb6) obj;
        return Intrinsics.d(this.a, nb6Var.a) && this.b == nb6Var.b && this.c == nb6Var.c && this.d == nb6Var.d && this.e == nb6Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + k5r.e(k5r.e(f1d.a(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder l = f1d.l(this.b, "ContentAnimationState(slideId=", this.a, ", index=", ", isShown=");
        dfi.t(l, this.c, ", isAnimationRunning=", this.d, ", isEnableForScreenshot=");
        return ouj.r(l, this.e, ")");
    }
}
