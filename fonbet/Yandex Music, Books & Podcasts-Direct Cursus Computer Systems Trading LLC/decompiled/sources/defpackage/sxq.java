package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class sxq extends m8 {
    public static final sxq c = new sxq(new Object[0]);
    public final Object[] b;

    public sxq(Object[] objArr) {
        this.b = objArr;
        int length = objArr.length;
    }

    @Override // defpackage.m8
    public final m8 a(int i, Object obj) {
        Object[] objArr = this.b;
        asq.w(i, objArr.length);
        Object[] objArr2 = this.b;
        if (i == objArr2.length) {
            return g(obj);
        }
        if (objArr2.length < 32) {
            Object[] objArr3 = new Object[objArr2.length + 1];
            uz0.i(objArr2, objArr3, 0, 0, i, 6);
            uz0.f(i + 1, i, objArr.length, objArr, objArr3);
            objArr3[i] = obj;
            return new sxq(objArr3);
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        uz0.f(i + 1, i, objArr.length - 1, objArr, copyOf);
        copyOf[i] = obj;
        Object[] objArr4 = new Object[32];
        objArr4[0] = objArr[31];
        return new gmk(copyOf, objArr4, objArr.length + 1, 0);
    }

    @Override // defpackage.w5
    public final int f() {
        return this.b.length;
    }

    @Override // defpackage.m8
    public final m8 g(Object obj) {
        Object[] objArr = this.b;
        if (objArr.length < 32) {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length + 1);
            copyOf[objArr.length] = obj;
            return new sxq(copyOf);
        }
        Object[] objArr2 = new Object[32];
        objArr2[0] = obj;
        return new gmk(objArr, objArr2, objArr.length + 1, 0);
    }

    @Override // java.util.List
    public final Object get(int i) {
        asq.v(i, f());
        return this.b[i];
    }

    @Override // kotlin.collections.a, java.util.List
    public final int indexOf(Object obj) {
        return xz0.G(this.b, obj);
    }

    @Override // kotlin.collections.a, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr = this.b;
        objArr.getClass();
        if (obj == null) {
            int length = objArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i = length - 1;
                    if (objArr[length] == null) {
                        return length;
                    }
                    if (i < 0) {
                        break;
                    }
                    length = i;
                }
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i2 = length2 - 1;
                    if (obj.equals(objArr[length2])) {
                        return length2;
                    }
                    if (i2 < 0) {
                        break;
                    }
                    length2 = i2;
                }
            }
        }
        return -1;
    }

    @Override // kotlin.collections.a, java.util.List
    public final ListIterator listIterator(int i) {
        Object[] objArr = this.b;
        asq.w(i, objArr.length);
        return new ni3(i, objArr.length, objArr);
    }

    @Override // defpackage.m8
    public final m8 o(Collection collection) {
        Object[] objArr = this.b;
        if (collection.size() + objArr.length > 32) {
            hmk q = q();
            q.addAll(collection);
            return q.g();
        }
        Object[] copyOf = Arrays.copyOf(objArr, collection.size() + objArr.length);
        int length = objArr.length;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            copyOf[length] = it.next();
            length++;
        }
        return new sxq(copyOf);
    }

    @Override // defpackage.m8
    public final hmk q() {
        return new hmk(this, null, this.b, 0);
    }

    @Override // defpackage.m8
    public final m8 r(l8 l8Var) {
        Object[] objArr = this.b;
        int length = objArr.length;
        int length2 = objArr.length;
        Object[] objArr2 = objArr;
        boolean z = false;
        for (int i = 0; i < length2; i++) {
            Object obj = objArr[i];
            if (((Boolean) l8Var.invoke(obj)).booleanValue()) {
                if (!z) {
                    objArr2 = Arrays.copyOf(objArr, objArr.length);
                    z = true;
                    length = i;
                }
            } else if (z) {
                objArr2[length] = obj;
                length++;
            }
        }
        return length == objArr.length ? this : length == 0 ? c : new sxq(uz0.k(0, length, objArr2));
    }

    @Override // defpackage.m8
    public final m8 s(int i) {
        Object[] objArr = this.b;
        asq.v(i, objArr.length);
        if (objArr.length == 1) {
            return c;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length - 1);
        uz0.f(i, i + 1, objArr.length, objArr, copyOf);
        return new sxq(copyOf);
    }

    @Override // defpackage.m8
    public final m8 t(int i, Object obj) {
        asq.v(i, f());
        Object[] objArr = this.b;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        copyOf[i] = obj;
        return new sxq(copyOf);
    }
}
