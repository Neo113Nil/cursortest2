package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class U extends AbstractC0102b implements RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    public static final U f2348d = new U(new Object[0], 0, false);

    /* renamed from: b, reason: collision with root package name */
    public Object[] f2349b;

    /* renamed from: c, reason: collision with root package name */
    public int f2350c;

    public U(Object[] objArr, int i2, boolean z2) {
        this.f2371a = z2;
        this.f2349b = objArr;
        this.f2350c = i2;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        a();
        int i2 = this.f2350c;
        Object[] objArr = this.f2349b;
        if (i2 == objArr.length) {
            this.f2349b = Arrays.copyOf(objArr, ((i2 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f2349b;
        int i3 = this.f2350c;
        this.f2350c = i3 + 1;
        objArr2[i3] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void b(int i2) {
        if (i2 < 0 || i2 >= this.f2350c) {
            throw new IndexOutOfBoundsException("Index:" + i2 + ", Size:" + this.f2350c);
        }
    }

    public final U c(int i2) {
        if (i2 >= this.f2350c) {
            return new U(Arrays.copyOf(this.f2349b, i2), this.f2350c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        b(i2);
        return this.f2349b[i2];
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0102b, java.util.AbstractList, java.util.List
    public final Object remove(int i2) {
        a();
        b(i2);
        Object[] objArr = this.f2349b;
        Object obj = objArr[i2];
        if (i2 < this.f2350c - 1) {
            System.arraycopy(objArr, i2 + 1, objArr, i2, (r2 - i2) - 1);
        }
        this.f2350c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i2, Object obj) {
        a();
        b(i2);
        Object[] objArr = this.f2349b;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2350c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        int i3;
        a();
        if (i2 >= 0 && i2 <= (i3 = this.f2350c)) {
            Object[] objArr = this.f2349b;
            if (i3 < objArr.length) {
                System.arraycopy(objArr, i2, objArr, i2 + 1, i3 - i2);
            } else {
                Object[] objArr2 = new Object[((i3 * 3) / 2) + 1];
                System.arraycopy(objArr, 0, objArr2, 0, i2);
                System.arraycopy(this.f2349b, i2, objArr2, i2 + 1, this.f2350c - i2);
                this.f2349b = objArr2;
            }
            this.f2349b[i2] = obj;
            this.f2350c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("Index:" + i2 + ", Size:" + this.f2350c);
    }
}
