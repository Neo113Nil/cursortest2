package com.gamericefishpro.space.x0;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends a {
    public final Object[] i;
    public final i v;

    public f(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        super(i, i2);
        this.i = objArr2;
        int i4 = (i2 - 1) & (-32);
        this.v = new i(objArr, i > i4 ? i4 : i, i4, i3);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        i iVar = this.v;
        if (iVar.hasNext()) {
            this.d++;
            return iVar.next();
        }
        int i = this.d;
        this.d = i + 1;
        return this.i[i - iVar.e];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.d;
        i iVar = this.v;
        int i2 = iVar.e;
        if (i <= i2) {
            this.d = i - 1;
            return iVar.previous();
        }
        int i3 = i - 1;
        this.d = i3;
        return this.i[i3 - i2];
    }
}
