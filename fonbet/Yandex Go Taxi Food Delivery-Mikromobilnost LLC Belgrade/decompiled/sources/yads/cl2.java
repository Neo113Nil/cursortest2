package yads;

import defpackage.w4a1;
import defpackage.wr71;

/* loaded from: classes7.dex */
public final class cl2 extends y31 {
    public static final Object[] B;
    public static final cl2 C;
    public final transient int A;
    public final transient Object[] w;
    public final transient int x;
    public final transient Object[] y;
    public final transient int z;

    static {
        Object[] objArr = new Object[0];
        B = objArr;
        C = new cl2(objArr, 0, objArr, 0, 0);
    }

    public cl2(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.w = objArr;
        this.x = i;
        this.y = objArr2;
        this.z = i2;
        this.A = i3;
    }

    @Override // yads.n31
    public final int a(int i, Object[] objArr) {
        Object[] objArr2 = this.w;
        int i2 = this.A;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // yads.n31, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.y;
            if (objArr.length != 0) {
                int a = w4a1.a(obj.hashCode());
                while (true) {
                    int i = a & this.z;
                    Object obj2 = objArr[i];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    a = i + 1;
                }
            }
        }
        return false;
    }

    @Override // yads.n31
    public final Object[] f() {
        return this.w;
    }

    @Override // yads.n31
    public final int g() {
        return this.A;
    }

    @Override // yads.n31
    public final int h() {
        return 0;
    }

    @Override // yads.y31, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.x;
    }

    @Override // yads.n31
    public final boolean i() {
        return false;
    }

    @Override // yads.n31
    /* renamed from: j */
    public final wr71 iterator() {
        return b().listIterator(0);
    }

    @Override // yads.y31
    public final t31 m() {
        return t31.p(this.A, this.w);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.A;
    }
}
