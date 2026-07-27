package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import java.util.Spliterator;
import java.util.Spliterators;

/* loaded from: classes2.dex */
public final class VC extends AbstractList implements RandomAccess, Serializable {

    /* renamed from: n, reason: collision with root package name */
    public final int[] f28221n;

    /* renamed from: u, reason: collision with root package name */
    public final int f28222u;

    /* renamed from: v, reason: collision with root package name */
    public final int f28223v;

    public VC(int i, int i4, int[] iArr) {
        this.f28221n = iArr;
        this.f28222u = i;
        this.f28223v = i4;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Integer)) {
            return false;
        }
        int intValue = ((Integer) obj).intValue();
        int i = this.f28222u;
        while (true) {
            if (i >= this.f28223v) {
                i = -1;
                break;
            }
            if (this.f28221n[i] == intValue) {
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
        if (!(obj instanceof VC)) {
            return super.equals(obj);
        }
        VC vc = (VC) obj;
        int i = vc.f28223v;
        int i4 = vc.f28222u;
        int i9 = i - i4;
        int i10 = this.f28223v;
        int i11 = this.f28222u;
        int i12 = i10 - i11;
        if (i9 != i12) {
            return false;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            if (this.f28221n[i11 + i13] != vc.f28221n[i4 + i13]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        int i4 = this.f28223v;
        int i9 = this.f28222u;
        PA.a0(i, i4 - i9);
        return Integer.valueOf(this.f28221n[i9 + i]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i4 = this.f28222u; i4 < this.f28223v; i4++) {
            i = (i * 31) + Integer.hashCode(this.f28221n[i4]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            int i = this.f28222u;
            int i4 = i;
            while (true) {
                if (i4 >= this.f28223v) {
                    i4 = -1;
                    break;
                }
                if (this.f28221n[i4] == intValue) {
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
            int i4 = this.f28223v - 1;
            while (true) {
                i = this.f28222u;
                if (i4 < i) {
                    i4 = -1;
                    break;
                }
                if (this.f28221n[i4] == intValue) {
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
        int i4 = this.f28223v;
        int i9 = this.f28222u;
        Integer num = (Integer) obj;
        PA.a0(i, i4 - i9);
        int i10 = i9 + i;
        int[] iArr = this.f28221n;
        int i11 = iArr[i10];
        num.getClass();
        iArr[i10] = num.intValue();
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f28223v - this.f28222u;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        return Spliterators.spliterator(this.f28221n, this.f28222u, this.f28223v, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i4) {
        int i9 = this.f28223v;
        int i10 = this.f28222u;
        PA.c0(i, i4, i9 - i10);
        return i == i4 ? Collections.EMPTY_LIST : new VC(i + i10, i10 + i4, this.f28221n);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        int i = this.f28223v;
        int i4 = this.f28222u;
        StringBuilder sb = new StringBuilder((i - i4) * 5);
        sb.append('[');
        int[] iArr = this.f28221n;
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
