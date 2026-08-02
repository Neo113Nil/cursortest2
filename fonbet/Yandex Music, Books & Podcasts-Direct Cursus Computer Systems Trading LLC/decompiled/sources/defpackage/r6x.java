package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class r6x extends u5x {
    public static final Object[] k;
    public static final r6x l;
    public final transient Object[] f;
    public final transient int g;
    public final transient Object[] h;
    public final transient int i;
    public final transient int j;

    static {
        Object[] objArr = new Object[0];
        k = objArr;
        l = new r6x(0, 0, 0, objArr, objArr);
    }

    public r6x(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        super(0);
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
        if (obj == null) {
            return false;
        }
        Object[] objArr = this.h;
        if (objArr.length == 0) {
            return false;
        }
        int rotateLeft = (int) (Integer.rotateLeft((int) (obj.hashCode() * (-862048943)), 15) * 461845907);
        while (true) {
            int i = rotateLeft & this.i;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            rotateLeft = i + 1;
        }
    }

    @Override // defpackage.r4x
    public final int g() {
        return this.j;
    }

    @Override // defpackage.u5x, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.g;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return u().listIterator(0);
    }

    @Override // defpackage.r4x
    public final int n() {
        return 0;
    }

    @Override // defpackage.r4x
    public final xkt o() {
        return u().listIterator(0);
    }

    @Override // defpackage.r4x
    public final Object[] q() {
        return this.f;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.j;
    }

    @Override // defpackage.u5x
    public final q5x v() {
        return q5x.u(this.j, this.f);
    }
}
