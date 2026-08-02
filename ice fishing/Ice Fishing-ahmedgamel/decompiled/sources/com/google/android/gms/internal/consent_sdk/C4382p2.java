package com.google.android.gms.internal.consent_sdk;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import w.AbstractC5128c;

/* renamed from: com.google.android.gms.internal.consent_sdk.p2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4382p2 extends AbstractC4334d2 implements RandomAccess, InterfaceC4386q2 {

    /* renamed from: w, reason: collision with root package name */
    public static final int[] f36501w;

    /* renamed from: x, reason: collision with root package name */
    public static final C4382p2 f36502x;

    /* renamed from: u, reason: collision with root package name */
    public int[] f36503u;

    /* renamed from: v, reason: collision with root package name */
    public int f36504v;

    static {
        int[] iArr = new int[0];
        f36501w = iArr;
        f36502x = new C4382p2(iArr, 0, false);
    }

    public C4382p2(int[] iArr, int i, boolean z6) {
        super(z6);
        this.f36503u = iArr;
        this.f36504v = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i4;
        int intValue = ((Integer) obj).intValue();
        a();
        if (i < 0 || i > (i4 = this.f36504v)) {
            throw new IndexOutOfBoundsException(AbstractC5128c.c(i, this.f36504v, "Index:", ", Size:"));
        }
        int i6 = i + 1;
        int[] iArr = this.f36503u;
        int length = iArr.length;
        if (i4 < length) {
            System.arraycopy(iArr, i, iArr, i6, i4 - i);
        } else {
            int[] iArr2 = new int[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f36503u, 0, iArr2, 0, i);
            System.arraycopy(this.f36503u, i, iArr2, i6, this.f36504v - i);
            this.f36503u = iArr2;
        }
        this.f36503u[i] = intValue;
        this.f36504v++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.consent_sdk.AbstractC4334d2, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        Charset charset = AbstractC4393s2.f36513a;
        collection.getClass();
        if (!(collection instanceof C4382p2)) {
            return super.addAll(collection);
        }
        C4382p2 c4382p2 = (C4382p2) collection;
        int i = c4382p2.f36504v;
        if (i == 0) {
            return false;
        }
        int i4 = this.f36504v;
        if (Integer.MAX_VALUE - i4 < i) {
            throw new OutOfMemoryError();
        }
        int i6 = i4 + i;
        int[] iArr = this.f36503u;
        if (i6 > iArr.length) {
            this.f36503u = Arrays.copyOf(iArr, i6);
        }
        System.arraycopy(c4382p2.f36503u, 0, this.f36503u, this.f36504v, c4382p2.f36504v);
        this.f36504v = i6;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.consent_sdk.InterfaceC4389r2
    public final /* bridge */ /* synthetic */ InterfaceC4389r2 b(int i) {
        if (i >= this.f36504v) {
            return new C4382p2(i == 0 ? f36501w : Arrays.copyOf(this.f36503u, i), this.f36504v, true);
        }
        throw new IllegalArgumentException();
    }

    public final int c(int i) {
        d(i);
        return this.f36503u[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i) {
        if (i < 0 || i >= this.f36504v) {
            throw new IndexOutOfBoundsException(AbstractC5128c.c(i, this.f36504v, "Index:", ", Size:"));
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.AbstractC4334d2, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4382p2)) {
            return super.equals(obj);
        }
        C4382p2 c4382p2 = (C4382p2) obj;
        if (this.f36504v != c4382p2.f36504v) {
            return false;
        }
        int[] iArr = c4382p2.f36503u;
        for (int i = 0; i < this.f36504v; i++) {
            if (this.f36503u[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        d(i);
        return Integer.valueOf(this.f36503u[i]);
    }

    @Override // com.google.android.gms.internal.consent_sdk.AbstractC4334d2, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i4 = 0; i4 < this.f36504v; i4++) {
            i = (i * 31) + this.f36503u[i4];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i = this.f36504v;
        for (int i4 = 0; i4 < i; i4++) {
            if (this.f36503u[i4] == intValue) {
                return i4;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.consent_sdk.AbstractC4334d2, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        a();
        d(i);
        int[] iArr = this.f36503u;
        int i4 = iArr[i];
        if (i < this.f36504v - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (r2 - i) - 1);
        }
        this.f36504v--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i4);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i4) {
        a();
        if (i4 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f36503u;
        System.arraycopy(iArr, i4, iArr, i, this.f36504v - i4);
        this.f36504v -= i4 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        a();
        d(i);
        int[] iArr = this.f36503u;
        int i4 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i4);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f36504v;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        int intValue = ((Integer) obj).intValue();
        a();
        int i = this.f36504v;
        int length = this.f36503u.length;
        if (i == length) {
            int[] iArr = new int[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f36503u, 0, iArr, 0, this.f36504v);
            this.f36503u = iArr;
        }
        int[] iArr2 = this.f36503u;
        int i4 = this.f36504v;
        this.f36504v = i4 + 1;
        iArr2[i4] = intValue;
        return true;
    }
}
