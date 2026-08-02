package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* loaded from: classes3.dex */
public final class z0d implements a1d {
    public final int a;
    public final int b;
    public final int c;
    public final IntRange d;
    public final List e;
    public final boolean f;
    public final boolean g;

    public z0d(int i, int i2, int i3, IntRange intRange, List list, boolean z, boolean z2) {
        list.getClass();
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = intRange;
        this.e = list;
        this.f = z;
        this.g = z2;
        if (list.isEmpty()) {
            su4.s(2, null, "ItemList should not be empty", null);
        }
    }

    public static z0d a(z0d z0dVar, int i, int i2, IntRange intRange, boolean z, int i3) {
        int i4 = z0dVar.a;
        if ((i3 & 2) != 0) {
            i = z0dVar.b;
        }
        int i5 = i;
        if ((i3 & 4) != 0) {
            i2 = z0dVar.c;
        }
        int i6 = i2;
        if ((i3 & 8) != 0) {
            intRange = z0dVar.d;
        }
        IntRange intRange2 = intRange;
        List list = z0dVar.e;
        if ((i3 & 32) != 0) {
            z = z0dVar.f;
        }
        boolean z2 = z0dVar.g;
        z0dVar.getClass();
        list.getClass();
        return new z0d(i4, i5, i6, intRange2, list, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0d)) {
            return false;
        }
        z0d z0dVar = (z0d) obj;
        return this.a == z0dVar.a && this.b == z0dVar.b && this.c == z0dVar.c && Intrinsics.d(this.d, z0dVar.d) && Intrinsics.d(this.e, z0dVar.e) && this.f == z0dVar.f && this.g == z0dVar.g;
    }

    public final int hashCode() {
        int a = f1d.a(this.c, f1d.a(this.b, Integer.hashCode(this.a) * 31, 31), 31);
        IntRange intRange = this.d;
        return Boolean.hashCode(this.g) + k5r.e(k5r.d((a + (intRange == null ? 0 : intRange.hashCode())) * 31, 31, this.e), 31, this.f);
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
        l.append(", isFullscreen=");
        return ouj.r(l, this.g, ")");
    }
}
