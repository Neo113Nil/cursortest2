package com.google.android.libraries.places.internal;

import bo.app.re$$ExternalSyntheticOutline0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public final class zzbjs extends zzbic implements RandomAccess, zzbjz, zzbli {
    public static final int[] zza;
    public static final zzbjs zzb;
    public int[] zzc;
    public int zzd;

    static {
        int[] iArr = new int[0];
        zza = iArr;
        zzb = new zzbjs(iArr, 0, false);
    }

    public zzbjs(int[] iArr, int i, boolean z) {
        super(z);
        this.zzc = iArr;
        this.zzd = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        zzbU();
        if (i < 0 || i > (i2 = this.zzd)) {
            Path$$ExternalSyntheticBUOutline0.m(zzib.zzb(this.zzd, i, (byte) 13, "Index:", ", Size:"));
            return;
        }
        int i3 = i + 1;
        int[] iArr = this.zzc;
        int length = iArr.length;
        if (i2 < length) {
            System.arraycopy(iArr, i, iArr, i3, i2 - i);
        } else {
            int[] iArr2 = new int[re$$ExternalSyntheticOutline0.m(length, 3, 2, 1, 10)];
            System.arraycopy(this.zzc, 0, iArr2, 0, i);
            System.arraycopy(this.zzc, i, iArr2, i3, this.zzd - i);
            this.zzc = iArr2;
        }
        this.zzc[i] = intValue;
        this.zzd++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.libraries.places.internal.zzbic, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zzbU();
        collection.getClass();
        if (!(collection instanceof zzbjs)) {
            return super.addAll(collection);
        }
        zzbjs zzbjsVar = (zzbjs) collection;
        int i = zzbjsVar.zzd;
        if (i == 0) {
            return false;
        }
        int i2 = this.zzd;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArr = this.zzc;
        if (i3 > iArr.length) {
            this.zzc = Arrays.copyOf(iArr, i3);
        }
        System.arraycopy(zzbjsVar.zzc, 0, this.zzc, this.zzd, zzbjsVar.zzd);
        this.zzd = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.libraries.places.internal.zzbic, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzbjs)) {
            return super.equals(obj);
        }
        zzbjs zzbjsVar = (zzbjs) obj;
        if (this.zzd != zzbjsVar.zzd) {
            return false;
        }
        int[] iArr = zzbjsVar.zzc;
        for (int i = 0; i < this.zzd; i++) {
            if (this.zzc[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        zzj(i);
        return Integer.valueOf(this.zzc[i]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.zzd; i2++) {
            i = (i * 31) + this.zzc[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i = this.zzd;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.zzc[i2] == intValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.android.libraries.places.internal.zzbic, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        zzbU();
        zzj(i);
        int[] iArr = this.zzc;
        int i2 = iArr[i];
        if (i < this.zzd - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (r2 - i) - 1);
        }
        this.zzd--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        zzbU();
        if (i2 < i) {
            Path$$ExternalSyntheticBUOutline0.m("toIndex < fromIndex");
            return;
        }
        int[] iArr = this.zzc;
        System.arraycopy(iArr, i2, iArr, i, this.zzd - i2);
        this.zzd -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        zzbU();
        zzj(i);
        int[] iArr = this.zzc;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.internal.zzbkb
    /* renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final zzbjs zzg(int i) {
        if (i >= this.zzd) {
            return new zzbjs(i == 0 ? zza : Arrays.copyOf(this.zzc, i), this.zzd, true);
        }
        Path$$ExternalSyntheticBUOutline0.m$3();
        return null;
    }

    public final int zzf(int i) {
        zzj(i);
        return this.zzc[i];
    }

    public final void zzh(int i) {
        zzbU();
        int i2 = this.zzd;
        int length = this.zzc.length;
        if (i2 == length) {
            int[] iArr = new int[re$$ExternalSyntheticOutline0.m(length, 3, 2, 1, 10)];
            System.arraycopy(this.zzc, 0, iArr, 0, this.zzd);
            this.zzc = iArr;
        }
        int[] iArr2 = this.zzc;
        int i3 = this.zzd;
        this.zzd = i3 + 1;
        iArr2[i3] = i;
    }

    public final void zzj(int i) {
        if (i < 0 || i >= this.zzd) {
            Path$$ExternalSyntheticBUOutline0.m(zzib.zzb(this.zzd, i, (byte) 13, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzh(((Integer) obj).intValue());
        return true;
    }
}
