package defpackage;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class o54 {
    public final boolean a;
    public final boolean b;
    public final int c;
    public final q14 d;
    public final g24 e;

    public o54(boolean z, boolean z2, int i, q14 q14Var) {
        q14Var.getClass();
        this.a = z;
        this.b = z2;
        this.c = i;
        this.d = q14Var;
        this.e = (g24) CollectionsKt.S(q14Var.b, i);
    }

    public static o54 a(o54 o54Var, boolean z, int i, int i2) {
        boolean z2 = o54Var.a;
        if ((i2 & 2) != 0) {
            z = o54Var.b;
        }
        if ((i2 & 4) != 0) {
            i = o54Var.c;
        }
        q14 q14Var = o54Var.d;
        o54Var.getClass();
        q14Var.getClass();
        return new o54(z2, z, i, q14Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o54)) {
            return false;
        }
        o54 o54Var = (o54) obj;
        return this.a == o54Var.a && this.b == o54Var.b && this.c == o54Var.c && Intrinsics.d(this.d, o54Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + f1d.a(this.c, k5r.e(Boolean.hashCode(this.a) * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder j = eta.j("CarouselUiState(isEnableSelectedMode=", this.a, ", isSelectedOnUi=", this.b, ", selectedPage=");
        j.append(this.c);
        j.append(", uiData=");
        j.append(this.d);
        j.append(")");
        return j.toString();
    }
}
