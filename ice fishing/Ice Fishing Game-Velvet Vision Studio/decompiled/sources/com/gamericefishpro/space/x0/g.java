package com.gamericefishpro.space.x0;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends a {
    public final e i;
    public int v;
    public i w;
    public int y;

    public g(e eVar, int i) {
        super(i, eVar.A);
        this.i = eVar;
        this.v = eVar.h();
        this.y = -1;
        b();
    }

    public final void a() {
        if (this.v != this.i.h()) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // com.gamericefishpro.space.x0.a, java.util.ListIterator
    public final void add(Object obj) {
        a();
        int i = this.d;
        e eVar = this.i;
        eVar.add(i, obj);
        this.d++;
        this.e = eVar.b();
        this.v = eVar.h();
        this.y = -1;
        b();
    }

    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final void b() {
        e eVar = this.i;
        Object[] objArr = eVar.y;
        if (objArr == null) {
            this.w = null;
            return;
        }
        int i = (eVar.A - 1) & (-32);
        int i2 = this.d;
        if (i2 > i) {
            i2 = i;
        }
        int i3 = (eVar.v / 5) + 1;
        i iVar = this.w;
        if (iVar == null) {
            this.w = new i(objArr, i2, i, i3);
            return;
        }
        iVar.d = i2;
        iVar.e = i;
        iVar.i = i3;
        if (iVar.v.length < i3) {
            iVar.v = new Object[i3];
        }
        iVar.v[0] = objArr;
        ?? r6 = i2 == i ? 1 : 0;
        iVar.w = r6;
        iVar.b(i2 - r6, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        a();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.d;
        this.y = i;
        i iVar = this.w;
        e eVar = this.i;
        if (iVar == null) {
            Object[] objArr = eVar.z;
            this.d = i + 1;
            return objArr[i];
        }
        if (iVar.hasNext()) {
            this.d++;
            return iVar.next();
        }
        Object[] objArr2 = eVar.z;
        int i2 = this.d;
        this.d = i2 + 1;
        return objArr2[i2 - iVar.e];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.d;
        this.y = i - 1;
        i iVar = this.w;
        e eVar = this.i;
        if (iVar == null) {
            Object[] objArr = eVar.z;
            int i2 = i - 1;
            this.d = i2;
            return objArr[i2];
        }
        int i3 = iVar.e;
        if (i <= i3) {
            this.d = i - 1;
            return iVar.previous();
        }
        Object[] objArr2 = eVar.z;
        int i4 = i - 1;
        this.d = i4;
        return objArr2[i4 - i3];
    }

    @Override // com.gamericefishpro.space.x0.a, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        a();
        int i = this.y;
        if (i == -1) {
            throw new IllegalStateException();
        }
        e eVar = this.i;
        eVar.c(i);
        int i2 = this.y;
        if (i2 < this.d) {
            this.d = i2;
        }
        this.e = eVar.b();
        this.v = eVar.h();
        this.y = -1;
        b();
    }

    @Override // com.gamericefishpro.space.x0.a, java.util.ListIterator
    public final void set(Object obj) {
        a();
        int i = this.y;
        if (i == -1) {
            throw new IllegalStateException();
        }
        e eVar = this.i;
        eVar.set(i, obj);
        this.v = eVar.h();
        b();
    }
}
