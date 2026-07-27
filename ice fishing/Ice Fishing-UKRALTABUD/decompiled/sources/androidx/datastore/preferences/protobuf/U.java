package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class U extends AbstractC0072b implements RandomAccess {

    /* renamed from: i, reason: collision with root package name */
    public static final U f1388i = new U(new Object[0], 0, false);

    /* renamed from: g, reason: collision with root package name */
    public Object[] f1389g;

    /* renamed from: h, reason: collision with root package name */
    public int f1390h;

    public U(Object[] objArr, int i2, boolean z2) {
        this.f1411f = z2;
        this.f1389g = objArr;
        this.f1390h = i2;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        a();
        int i2 = this.f1390h;
        Object[] objArr = this.f1389g;
        if (i2 == objArr.length) {
            this.f1389g = Arrays.copyOf(objArr, ((i2 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f1389g;
        int i3 = this.f1390h;
        this.f1390h = i3 + 1;
        objArr2[i3] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void b(int i2) {
        if (i2 < 0 || i2 >= this.f1390h) {
            throw new IndexOutOfBoundsException("Index:" + i2 + ", Size:" + this.f1390h);
        }
    }

    public final U c(int i2) {
        if (i2 >= this.f1390h) {
            return new U(Arrays.copyOf(this.f1389g, i2), this.f1390h, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        b(i2);
        return this.f1389g[i2];
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0072b, java.util.AbstractList, java.util.List
    public final Object remove(int i2) {
        a();
        b(i2);
        Object[] objArr = this.f1389g;
        Object obj = objArr[i2];
        if (i2 < this.f1390h - 1) {
            System.arraycopy(objArr, i2 + 1, objArr, i2, (r2 - i2) - 1);
        }
        this.f1390h--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i2, Object obj) {
        a();
        b(i2);
        Object[] objArr = this.f1389g;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f1390h;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        int i3;
        a();
        if (i2 >= 0 && i2 <= (i3 = this.f1390h)) {
            Object[] objArr = this.f1389g;
            if (i3 < objArr.length) {
                System.arraycopy(objArr, i2, objArr, i2 + 1, i3 - i2);
            } else {
                Object[] objArr2 = new Object[((i3 * 3) / 2) + 1];
                System.arraycopy(objArr, 0, objArr2, 0, i2);
                System.arraycopy(this.f1389g, i2, objArr2, i2 + 1, this.f1390h - i2);
                this.f1389g = objArr2;
            }
            this.f1389g[i2] = obj;
            this.f1390h++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("Index:" + i2 + ", Size:" + this.f1390h);
    }
}
