package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import java.util.Spliterator;
import java.util.Spliterators;

/* loaded from: classes2.dex */
public final class TC extends AbstractList implements RandomAccess, Serializable {

    /* renamed from: n, reason: collision with root package name */
    public final int[] f28487n;

    /* renamed from: u, reason: collision with root package name */
    public final int f28488u;

    /* renamed from: v, reason: collision with root package name */
    public final int f28489v;

    public TC(int i, int i4, int[] iArr) {
        this.f28487n = iArr;
        this.f28488u = i;
        this.f28489v = i4;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Integer)) {
            return false;
        }
        int intValue = ((Integer) obj).intValue();
        int i = this.f28488u;
        while (true) {
            if (i >= this.f28489v) {
                i = -1;
                break;
            }
            if (this.f28487n[i] == intValue) {
                break;
            }
            i++;
        }
        return i != -1;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TC)) {
            return super.equals(obj);
        }
        TC tc = (TC) obj;
        int i = tc.f28489v;
        int i4 = tc.f28488u;
        int i6 = i - i4;
        int i9 = this.f28489v;
        int i10 = this.f28488u;
        int i11 = i9 - i10;
        if (i6 != i11) {
            return false;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            if (this.f28487n[i10 + i12] != tc.f28487n[i4 + i12]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        int i4 = this.f28489v;
        int i6 = this.f28488u;
        AbstractC2792Sd.K(i, i4 - i6);
        return Integer.valueOf(this.f28487n[i6 + i]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i4 = this.f28488u; i4 < this.f28489v; i4++) {
            i = (i * 31) + Integer.hashCode(this.f28487n[i4]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            int i = this.f28488u;
            int i4 = i;
            while (true) {
                if (i4 >= this.f28489v) {
                    i4 = -1;
                    break;
                }
                if (this.f28487n[i4] == intValue) {
                    break;
                }
                i4++;
            }
            if (i4 >= 0) {
                return i4 - i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int i;
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            int i4 = this.f28489v - 1;
            while (true) {
                i = this.f28488u;
                if (i4 < i) {
                    i4 = -1;
                    break;
                }
                if (this.f28487n[i4] == intValue) {
                    break;
                }
                i4--;
            }
            if (i4 >= 0) {
                return i4 - i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int i4 = this.f28489v;
        int i6 = this.f28488u;
        Integer num = (Integer) obj;
        AbstractC2792Sd.K(i, i4 - i6);
        int i9 = i6 + i;
        int[] iArr = this.f28487n;
        int i10 = iArr[i9];
        num.getClass();
        iArr[i9] = num.intValue();
        return Integer.valueOf(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f28489v - this.f28488u;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        return Spliterators.spliterator(this.f28487n, this.f28488u, this.f28489v, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i4) {
        int i6 = this.f28489v;
        int i9 = this.f28488u;
        AbstractC2792Sd.M(i, i4, i6 - i9);
        return i == i4 ? Collections.EMPTY_LIST : new TC(i + i9, i9 + i4, this.f28487n);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        int i = this.f28489v;
        int i4 = this.f28488u;
        StringBuilder sb = new StringBuilder((i - i4) * 5);
        sb.append('[');
        int[] iArr = this.f28487n;
        sb.append(iArr[i4]);
        while (true) {
            i4++;
            if (i4 >= i) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(", ");
            sb.append(iArr[i4]);
        }
    }
}
