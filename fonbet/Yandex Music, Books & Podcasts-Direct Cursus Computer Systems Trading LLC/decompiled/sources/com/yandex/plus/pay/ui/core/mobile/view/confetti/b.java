package com.yandex.plus.pay.ui.core.mobile.view.confetti;

import defpackage.f1d;
import defpackage.k5r;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* loaded from: classes5.dex */
public final class b {
    public final List a;
    public final IntRange b;
    public final IntRange c;
    public final int d;

    public b(List list, IntRange intRange, IntRange intRange2, int i) {
        list.getClass();
        intRange.getClass();
        intRange2.getClass();
        this.a = list;
        this.b = intRange;
        this.c = intRange2;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.a, bVar.a) && Intrinsics.d(this.b, bVar.b) && Intrinsics.d(this.c, bVar.c) && this.d == bVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + f1d.a(this.d, (this.c.hashCode() + ((this.b.hashCode() + k5r.d(Integer.hashCode(80) * 31, 31, this.a)) * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlusPayConfettiPreferences(count=80, availableColors=");
        sb.append(this.a);
        sb.append(", xSpeedRange=");
        sb.append(this.b);
        sb.append(", ySpeedRange=");
        sb.append(this.c);
        sb.append(", confettiSize=");
        return f1d.i(sb, this.d, ", rethrowAfterFalling=false)");
    }
}
