package com.gamericefishpro.space.ph;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 extends f {
    public final List e;

    public p0(List delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.e = delegate;
    }

    @Override // com.gamericefishpro.space.ph.a
    public final int b() {
        return this.e.size();
    }

    @Override // java.util.List
    public final Object get(int i) {
        if (i >= 0 && i <= x.e(this)) {
            return this.e.get(x.e(this) - i);
        }
        StringBuilder sbK = com.gamericefishpro.space.m5.a.k(i, "Element index ", " must be in range [");
        sbK.append(new IntRange(0, x.e(this), 1));
        sbK.append("].");
        throw new IndexOutOfBoundsException(sbK.toString());
    }

    @Override // com.gamericefishpro.space.ph.f, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new com.gamericefishpro.space.f1.f0(this, 0);
    }

    @Override // com.gamericefishpro.space.ph.f, java.util.List
    public final ListIterator listIterator() {
        return new com.gamericefishpro.space.f1.f0(this, 0);
    }

    @Override // com.gamericefishpro.space.ph.f, java.util.List
    public final ListIterator listIterator(int i) {
        return new com.gamericefishpro.space.f1.f0(this, i);
    }
}
