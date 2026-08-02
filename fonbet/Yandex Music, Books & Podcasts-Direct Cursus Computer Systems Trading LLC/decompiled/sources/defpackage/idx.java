package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class idx extends ocx {
    public static final Object[] k;
    public static final idx l;
    public final transient Object[] f;
    public final transient int g;
    public final transient Object[] h;
    public final transient int i;
    public final transient int j;

    static {
        Object[] objArr = new Object[0];
        k = objArr;
        l = new idx(0, 0, 0, objArr, objArr);
    }

    public idx(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        super(1);
        this.f = objArr;
        this.g = i;
        this.h = objArr2;
        this.i = i2;
        this.j = i3;
    }

    @Override // defpackage.r4x
    public final int a(Object[] objArr) {
        Object[] objArr2 = this.f;
        int i = this.j;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.h;
            if (objArr.length != 0) {
                int b0 = ezf.b0(obj.hashCode());
                while (true) {
                    int i = b0 & this.i;
                    Object obj2 = objArr[i];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    b0 = i + 1;
                }
            }
        }
        return false;
    }

    @Override // defpackage.r4x
    public final int g() {
        return this.j;
    }

    @Override // defpackage.ocx, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.g;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        hcx hcxVar = this.d;
        if (hcxVar == null) {
            hcxVar = hcx.t(this.j, this.f);
            this.d = hcxVar;
        }
        return hcxVar.listIterator(0);
    }

    @Override // defpackage.r4x
    public final int n() {
        return 0;
    }

    @Override // defpackage.r4x
    public final Object[] r() {
        return this.f;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.j;
    }
}
