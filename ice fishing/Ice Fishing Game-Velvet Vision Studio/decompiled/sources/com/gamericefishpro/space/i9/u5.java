package com.gamericefishpro.space.i9;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class u5 extends q4 implements RandomAccess, l5, e6 {
    public static final long[] v;
    public static final u5 w;
    public long[] e;
    public int i;

    static {
        long[] jArr = new long[0];
        v = jArr;
        w = new u5(jArr, 0, false);
    }

    public u5(long[] jArr, int i, boolean z) {
        super(z);
        this.e = jArr;
        this.i = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        long jLongValue = ((Long) obj).longValue();
        b();
        if (i < 0 || i > (i2 = this.i)) {
            throw new IndexOutOfBoundsException(s4.a(this.i, i, (byte) 13, "Index:", ", Size:"));
        }
        int i3 = i + 1;
        long[] jArr = this.e;
        int length = jArr.length;
        if (i2 < length) {
            System.arraycopy(jArr, i, jArr, i3, i2 - i);
        } else {
            long[] jArr2 = new long[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.e, 0, jArr2, 0, i);
            System.arraycopy(this.e, i, jArr2, i3, this.i - i);
            this.e = jArr2;
        }
        this.e[i] = jLongValue;
        this.i++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.gamericefishpro.space.i9.q4, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        b();
        Charset charset = n5.a;
        collection.getClass();
        if (!(collection instanceof u5)) {
            return super.addAll(collection);
        }
        u5 u5Var = (u5) collection;
        int i = u5Var.i;
        if (i == 0) {
            return false;
        }
        int i2 = this.i;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        long[] jArr = this.e;
        if (i3 > jArr.length) {
            this.e = Arrays.copyOf(jArr, i3);
        }
        System.arraycopy(u5Var.e, 0, this.e, this.i, u5Var.i);
        this.i = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final long c(int i) {
        h(i);
        return this.e[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.gamericefishpro.space.i9.m5
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final u5 j(int i) {
        if (i >= this.i) {
            return new u5(i == 0 ? v : Arrays.copyOf(this.e, i), this.i, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.gamericefishpro.space.i9.q4, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u5)) {
            return super.equals(obj);
        }
        u5 u5Var = (u5) obj;
        if (this.i != u5Var.i) {
            return false;
        }
        long[] jArr = u5Var.e;
        for (int i = 0; i < this.i; i++) {
            if (this.e[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final void f(long j) {
        b();
        int i = this.i;
        int length = this.e.length;
        if (i == length) {
            long[] jArr = new long[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.e, 0, jArr, 0, this.i);
            this.e = jArr;
        }
        long[] jArr2 = this.e;
        int i2 = this.i;
        this.i = i2 + 1;
        jArr2[i2] = j;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        h(i);
        return Long.valueOf(this.e[i]);
    }

    public final void h(int i) {
        if (i < 0 || i >= this.i) {
            throw new IndexOutOfBoundsException(s4.a(this.i, i, (byte) 13, "Index:", ", Size:"));
        }
    }

    @Override // com.gamericefishpro.space.i9.q4, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.i; i2++) {
            long j = this.e[i2];
            Charset charset = n5.a;
            i = (i * 31) + ((int) (j ^ (j >>> 32)));
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i = this.i;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.e[i2] == jLongValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.gamericefishpro.space.i9.q4, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        b();
        h(i);
        long[] jArr = this.e;
        long j = jArr[i];
        int i2 = this.i;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.i--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        b();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.e;
        System.arraycopy(jArr, i2, jArr, i, this.i - i2);
        this.i -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        b();
        h(i);
        long[] jArr = this.e;
        long j = jArr[i];
        jArr[i] = jLongValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.i;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        f(((Long) obj).longValue());
        return true;
    }
}
