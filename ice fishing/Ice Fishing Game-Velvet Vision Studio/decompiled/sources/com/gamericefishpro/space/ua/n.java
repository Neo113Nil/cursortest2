package com.gamericefishpro.space.ua;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends f {
    public static final Object[] B;
    public static final n C;
    public final transient int A;
    public final transient Object[] v;
    public final transient int w;
    public final transient Object[] y;
    public final transient int z;

    static {
        Object[] objArr = new Object[0];
        B = objArr;
        C = new n(0, 0, 0, objArr, objArr);
    }

    public n(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        this.v = objArr;
        this.w = i;
        this.y = objArr2;
        this.z = i2;
        this.A = i3;
    }

    @Override // com.gamericefishpro.space.ua.a
    public final int b(Object[] objArr) {
        Object[] objArr2 = this.v;
        int i = this.A;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // com.gamericefishpro.space.ua.a
    public final Object[] c() {
        return this.v;
    }

    @Override // com.gamericefishpro.space.ua.a, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.y;
            if (objArr.length != 0) {
                int iE = com.gamericefishpro.space.b9.a.E(obj.hashCode());
                while (true) {
                    int i = iE & this.z;
                    Object obj2 = objArr[i];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iE = i + 1;
                }
            }
        }
        return false;
    }

    @Override // com.gamericefishpro.space.ua.a
    public final int d() {
        return this.A;
    }

    @Override // com.gamericefishpro.space.ua.a
    public final int f() {
        return 0;
    }

    @Override // com.gamericefishpro.space.ua.f, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.w;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return h().listIterator(0);
    }

    @Override // com.gamericefishpro.space.ua.f
    public final d m() {
        return d.h(this.A, this.v);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.A;
    }
}
