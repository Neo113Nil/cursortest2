package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class v7x extends u6x {
    public static final Object[] h;
    public static final v7x i;
    public final transient Object[] c;
    public final transient int d;
    public final transient Object[] e;
    public final transient int f;
    public final transient int g;

    static {
        Object[] objArr = new Object[0];
        h = objArr;
        i = new v7x(0, 0, 0, objArr, objArr);
    }

    public v7x(int i2, int i3, int i4, Object[] objArr, Object[] objArr2) {
        this.c = objArr;
        this.d = i2;
        this.e = objArr2;
        this.f = i3;
        this.g = i4;
    }

    @Override // defpackage.a6x
    public final int a(Object[] objArr) {
        Object[] objArr2 = this.c;
        int i2 = this.g;
        System.arraycopy(objArr2, 0, objArr, 0, i2);
        return i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.e;
            if (objArr.length != 0) {
                int L = neg.L(obj.hashCode());
                while (true) {
                    int i2 = L & this.f;
                    Object obj2 = objArr[i2];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    L = i2 + 1;
                }
            }
        }
        return false;
    }

    @Override // defpackage.a6x
    public final int g() {
        return this.g;
    }

    @Override // defpackage.u6x, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return o().listIterator(0);
    }

    @Override // defpackage.a6x
    public final int n() {
        return 0;
    }

    @Override // defpackage.a6x
    public final Object[] r() {
        return this.c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.g;
    }

    @Override // defpackage.u6x
    public final i6x t() {
        return i6x.u(this.g, this.c);
    }
}
