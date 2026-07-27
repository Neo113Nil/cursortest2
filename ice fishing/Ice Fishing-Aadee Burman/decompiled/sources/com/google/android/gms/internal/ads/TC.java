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
    public final int[] f27704n;

    /* renamed from: u, reason: collision with root package name */
    public final int f27705u;

    /* renamed from: v, reason: collision with root package name */
    public final int f27706v;

    public TC(int i, int i6, int[] iArr) {
        this.f27704n = iArr;
        this.f27705u = i;
        this.f27706v = i6;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Integer)) {
            return false;
        }
        int intValue = ((Integer) obj).intValue();
        int i = this.f27705u;
        while (true) {
            if (i >= this.f27706v) {
                i = -1;
                break;
            }
            if (this.f27704n[i] == intValue) {
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
        int i = tc.f27706v;
        int i6 = tc.f27705u;
        int i9 = i - i6;
        int i10 = this.f27706v;
        int i11 = this.f27705u;
        int i12 = i10 - i11;
        if (i9 != i12) {
            return false;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            if (this.f27704n[i11 + i13] != tc.f27704n[i6 + i13]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        int i6 = this.f27706v;
        int i9 = this.f27705u;
        AbstractC2772Sd.K(i, i6 - i9);
        return Integer.valueOf(this.f27704n[i9 + i]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i6 = this.f27705u; i6 < this.f27706v; i6++) {
            i = (i * 31) + Integer.hashCode(this.f27704n[i6]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            int i = this.f27705u;
            int i6 = i;
            while (true) {
                if (i6 >= this.f27706v) {
                    i6 = -1;
                    break;
                }
                if (this.f27704n[i6] == intValue) {
                    break;
                }
                i6++;
            }
            if (i6 >= 0) {
                return i6 - i;
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
            int i6 = this.f27706v - 1;
            while (true) {
                i = this.f27705u;
                if (i6 < i) {
                    i6 = -1;
                    break;
                }
                if (this.f27704n[i6] == intValue) {
                    break;
                }
                i6--;
            }
            if (i6 >= 0) {
                return i6 - i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int i6 = this.f27706v;
        int i9 = this.f27705u;
        Integer num = (Integer) obj;
        AbstractC2772Sd.K(i, i6 - i9);
        int i10 = i9 + i;
        int[] iArr = this.f27704n;
        int i11 = iArr[i10];
        num.getClass();
        iArr[i10] = num.intValue();
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f27706v - this.f27705u;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        return Spliterators.spliterator(this.f27704n, this.f27705u, this.f27706v, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i6) {
        int i9 = this.f27706v;
        int i10 = this.f27705u;
        AbstractC2772Sd.M(i, i6, i9 - i10);
        return i == i6 ? Collections.EMPTY_LIST : new TC(i + i10, i10 + i6, this.f27704n);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        int i = this.f27706v;
        int i6 = this.f27705u;
        StringBuilder sb = new StringBuilder((i - i6) * 5);
        sb.append('[');
        int[] iArr = this.f27704n;
        sb.append(iArr[i6]);
        while (true) {
            i6++;
            if (i6 >= i) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(", ");
            sb.append(iArr[i6]);
        }
    }
}
