package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* loaded from: classes3.dex */
public final class lv5 implements mv5 {
    public final int a;
    public final int b;
    public final int c;
    public final IntRange d;
    public final List e;
    public final boolean f;

    public lv5(int i, int i2, int i3, IntRange intRange, List list, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = intRange;
        this.e = list;
        this.f = z;
        if (list.isEmpty()) {
            su4.s(2, null, "ItemList should not be empty", null);
        }
    }

    public static lv5 a(lv5 lv5Var, int i, int i2, IntRange intRange, int i3) {
        int i4 = lv5Var.a;
        if ((i3 & 2) != 0) {
            i = lv5Var.b;
        }
        int i5 = i;
        if ((i3 & 4) != 0) {
            i2 = lv5Var.c;
        }
        int i6 = i2;
        if ((i3 & 8) != 0) {
            intRange = lv5Var.d;
        }
        List list = lv5Var.e;
        boolean z = lv5Var.f;
        lv5Var.getClass();
        return new lv5(i4, i5, i6, intRange, list, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lv5)) {
            return false;
        }
        lv5 lv5Var = (lv5) obj;
        return this.a == lv5Var.a && this.b == lv5Var.b && this.c == lv5Var.c && Intrinsics.d(this.d, lv5Var.d) && this.e.equals(lv5Var.e) && this.f == lv5Var.f;
    }

    public final int hashCode() {
        int a = f1d.a(this.c, f1d.a(this.b, Integer.hashCode(this.a) * 31, 31), 31);
        IntRange intRange = this.d;
        return Boolean.hashCode(this.f) + k5r.d((a + (intRange == null ? 0 : intRange.hashCode())) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder l = dfi.l("Success(initialPage=", this.a, this.b, ", selectedPage=", ", settledPage=");
        l.append(this.c);
        l.append(", pagerIndicatorRange=");
        l.append(this.d);
        l.append(", itemList=");
        l.append(this.e);
        l.append(", isScrollable=");
        l.append(this.f);
        l.append(")");
        return l.toString();
    }
}
