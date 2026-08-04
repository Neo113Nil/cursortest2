package com.gamericefishpro.space.x0;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends a {
    public int i;
    public Object[] v;
    public boolean w;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public i(Object[] objArr, int i, int i2, int i3) {
        super(i, i2);
        this.i = i3;
        Object[] objArr2 = new Object[i3];
        this.v = objArr2;
        ?? r5 = i == i2 ? 1 : 0;
        this.w = r5;
        objArr2[0] = objArr;
        b(i - r5, 1);
    }

    public final Object a() {
        int i = this.d & 31;
        Object obj = this.v[this.i - 1];
        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
        return ((Object[]) obj)[i];
    }

    public final void b(int i, int i2) {
        int i3 = (this.i - i2) * 5;
        while (i2 < this.i) {
            Object[] objArr = this.v;
            Object obj = objArr[i2 - 1];
            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr[i2] = ((Object[]) obj)[com.gamericefishpro.space.i.a.y(i, i3)];
            i3 -= 5;
            i2++;
        }
    }

    public final void c(int i) {
        int i2 = 0;
        while (com.gamericefishpro.space.i.a.y(this.d, i2) == i) {
            i2 += 5;
        }
        if (i2 > 0) {
            b(this.d, ((this.i - 1) - (i2 / 5)) + 1);
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object objA = a();
        int i = this.d + 1;
        this.d = i;
        if (i == this.e) {
            this.w = true;
            return objA;
        }
        c(0);
        return objA;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        this.d--;
        if (this.w) {
            this.w = false;
            return a();
        }
        c(31);
        return a();
    }
}
