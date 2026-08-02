package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class zws0 extends b9 {
    public static final zws0 b = new zws0(new Object[0]);
    public final Object[] a;

    public zws0(Object[] objArr) {
        this.a = objArr;
    }

    @Override // defpackage.n2b0
    public final n2b0 O0(a9 a9Var) {
        int size = size();
        int size2 = size();
        Object[] objArr = this.a;
        Object[] objArr2 = objArr;
        boolean z = false;
        for (int i = 0; i < size2; i++) {
            Object obj = objArr[i];
            if (((Boolean) a9Var.invoke(obj)).booleanValue()) {
                if (!z) {
                    objArr2 = Arrays.copyOf(objArr, objArr.length);
                    z = true;
                    size = i;
                }
            } else if (z) {
                objArr2[size] = obj;
                size++;
            }
        }
        return size == size() ? this : size == 0 ? b : new zws0(f73.n(0, size, objArr2));
    }

    @Override // java.util.List, defpackage.n2b0
    public final n2b0 add(int i, Object obj) {
        sb2.g(i, size());
        if (i == size()) {
            return add(obj);
        }
        int size = size();
        Object[] objArr = this.a;
        if (size < 32) {
            Object[] objArr2 = new Object[size() + 1];
            f73.l(objArr, 0, objArr2, i, 6);
            f73.g(objArr, i + 1, objArr2, i, size());
            objArr2[i] = obj;
            return new zws0(objArr2);
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        f73.g(objArr, i + 1, copyOf, i, size() - 1);
        copyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = objArr[31];
        return new b3b0(copyOf, objArr3, size() + 1, 0);
    }

    @Override // defpackage.b9, java.util.Collection, java.util.List, defpackage.n2b0
    public final n2b0 addAll(Collection collection) {
        if (collection.size() + size() > 32) {
            c3b0 builder = builder();
            builder.addAll(collection);
            return builder.a();
        }
        Object[] copyOf = Arrays.copyOf(this.a, collection.size() + size());
        int size = size();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            copyOf[size] = it.next();
            size++;
        }
        return new zws0(copyOf);
    }

    @Override // defpackage.n2b0
    public final c3b0 builder() {
        return new c3b0(this, null, this.a, 0);
    }

    @Override // java.util.List
    public final Object get(int i) {
        sb2.f(i, size());
        return this.a[i];
    }

    @Override // defpackage.z6
    public final int getSize() {
        return this.a.length;
    }

    @Override // defpackage.n2b0
    public final n2b0 h1(int i) {
        sb2.f(i, size());
        if (size() == 1) {
            return b;
        }
        int size = size() - 1;
        Object[] objArr = this.a;
        Object[] copyOf = Arrays.copyOf(objArr, size);
        f73.g(objArr, i, copyOf, i + 1, size());
        return new zws0(copyOf);
    }

    @Override // defpackage.k8, java.util.List
    public final int indexOf(Object obj) {
        return j73.H(this.a, obj);
    }

    @Override // defpackage.k8, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr = this.a;
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

    @Override // defpackage.k8, java.util.List
    public final ListIterator listIterator(int i) {
        sb2.g(i, size());
        return new dq6(i, size(), this.a);
    }

    @Override // defpackage.k8, java.util.List, defpackage.n2b0
    public final n2b0 set(int i, Object obj) {
        sb2.f(i, size());
        Object[] objArr = this.a;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        copyOf[i] = obj;
        return new zws0(copyOf);
    }

    @Override // java.util.Collection, java.util.List, defpackage.n2b0
    public final n2b0 add(Object obj) {
        int size = size();
        Object[] objArr = this.a;
        if (size < 32) {
            Object[] copyOf = Arrays.copyOf(objArr, size() + 1);
            copyOf[size()] = obj;
            return new zws0(copyOf);
        }
        Object[] objArr2 = new Object[32];
        objArr2[0] = obj;
        return new b3b0(objArr, objArr2, size() + 1, 0);
    }
}
