package kotlin.text;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements Iterator, com.gamericefishpro.space.fi.a {
    public int d = -1;
    public int e;
    public int i;
    public IntRange v;
    public int w;
    public final /* synthetic */ com.gamericefishpro.space.mi.a y;

    public b(com.gamericefishpro.space.mi.a aVar) {
        this.y = aVar;
        int iC = com.gamericefishpro.space.ji.f.c(0, 0, aVar.a.length());
        this.e = iC;
        this.i = iC;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001c  */
    /* JADX WARN: Code duplicated, block: B:12:0x0022 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:18:0x006f  */
    public final void a() {
        Pair pair;
        com.gamericefishpro.space.mi.a aVar = this.y;
        CharSequence charSequence = aVar.a;
        int i = this.i;
        if (i < 0) {
            this.d = 0;
            this.v = null;
            return;
        }
        int i2 = aVar.b;
        if (i2 > 0) {
            int i3 = this.w + 1;
            this.w = i3;
            if (i3 >= i2) {
                this.v = new IntRange(this.e, StringsKt__StringsKt.k(charSequence), 1);
                this.i = -1;
            } else if (i > charSequence.length() && (pair = (Pair) aVar.c.invoke(charSequence, Integer.valueOf(this.i))) != null) {
                int iIntValue = ((Number) pair.d).intValue();
                int iIntValue2 = ((Number) pair.e).intValue();
                this.v = com.gamericefishpro.space.ji.f.f(this.e, iIntValue);
                int i4 = iIntValue + iIntValue2;
                this.e = i4;
                this.i = i4 + (iIntValue2 == 0 ? 1 : 0);
            } else {
                this.v = new IntRange(this.e, StringsKt__StringsKt.k(charSequence), 1);
                this.i = -1;
            }
        } else if (i > charSequence.length()) {
            this.v = new IntRange(this.e, StringsKt__StringsKt.k(charSequence), 1);
            this.i = -1;
        } else {
            int iIntValue3 = ((Number) pair.d).intValue();
            int iIntValue4 = ((Number) pair.e).intValue();
            this.v = com.gamericefishpro.space.ji.f.f(this.e, iIntValue3);
            int i5 = iIntValue3 + iIntValue4;
            this.e = i5;
            this.i = i5 + (iIntValue4 == 0 ? 1 : 0);
        }
        this.d = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.d == -1) {
            a();
        }
        return this.d == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.d == -1) {
            a();
        }
        if (this.d == 0) {
            throw new NoSuchElementException();
        }
        IntRange intRange = this.v;
        Intrinsics.c(intRange, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        this.v = null;
        this.d = -1;
        return intRange;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
