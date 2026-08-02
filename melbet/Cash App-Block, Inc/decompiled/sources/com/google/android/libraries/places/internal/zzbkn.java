package com.google.android.libraries.places.internal;

import bo.app.re$$ExternalSyntheticOutline0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public final class zzbkn extends zzbic implements RandomAccess, zzbka, zzbli {
    public static final long[] zza;
    public static final zzbkn zzb;
    public long[] zzc;
    public int zzd;

    static {
        long[] jArr = new long[0];
        zza = jArr;
        zzb = new zzbkn(jArr, 0, false);
    }

    public zzbkn(long[] jArr, int i, boolean z) {
        super(z);
        this.zzc = jArr;
        this.zzd = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        long longValue = ((Long) obj).longValue();
        zzbU();
        if (i < 0 || i > (i2 = this.zzd)) {
            Path$$ExternalSyntheticBUOutline0.m(zzib.zzb(this.zzd, i, (byte) 13, "Index:", ", Size:"));
            return;
        }
        int i3 = i + 1;
        long[] jArr = this.zzc;
        int length = jArr.length;
        if (i2 < length) {
            System.arraycopy(jArr, i, jArr, i3, i2 - i);
        } else {
            long[] jArr2 = new long[re$$ExternalSyntheticOutline0.m(length, 3, 2, 1, 10)];
            System.arraycopy(this.zzc, 0, jArr2, 0, i);
            System.arraycopy(this.zzc, i, jArr2, i3, this.zzd - i);
            this.zzc = jArr2;
        }
        this.zzc[i] = longValue;
        this.zzd++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.libraries.places.internal.zzbic, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zzbU();
        collection.getClass();
        if (!(collection instanceof zzbkn)) {
            return super.addAll(collection);
        }
        zzbkn zzbknVar = (zzbkn) collection;
        int i = zzbknVar.zzd;
        if (i == 0) {
            return false;
        }
        int i2 = this.zzd;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        long[] jArr = this.zzc;
        if (i3 > jArr.length) {
            this.zzc = Arrays.copyOf(jArr, i3);
        }
        System.arraycopy(zzbknVar.zzc, 0, this.zzc, this.zzd, zzbknVar.zzd);
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
        if (!(obj instanceof zzbkn)) {
            return super.equals(obj);
        }
        zzbkn zzbknVar = (zzbkn) obj;
        if (this.zzd != zzbknVar.zzd) {
            return false;
        }
        long[] jArr = zzbknVar.zzc;
        for (int i = 0; i < this.zzd; i++) {
            if (this.zzc[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        zzi(i);
        return Long.valueOf(this.zzc[i]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.zzd; i2++) {
            long j = this.zzc[i2];
            byte[] bArr = zzbkc.zza;
            i = (i * 31) + ((int) (j ^ (j >>> 32)));
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i = this.zzd;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.zzc[i2] == longValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.android.libraries.places.internal.zzbic, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        zzbU();
        zzi(i);
        long[] jArr = this.zzc;
        long j = jArr[i];
        if (i < this.zzd - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (r3 - i) - 1);
        }
        this.zzd--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        zzbU();
        if (i2 < i) {
            Path$$ExternalSyntheticBUOutline0.m("toIndex < fromIndex");
            return;
        }
        long[] jArr = this.zzc;
        System.arraycopy(jArr, i2, jArr, i, this.zzd - i2);
        this.zzd -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        zzbU();
        zzi(i);
        long[] jArr = this.zzc;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzd;
    }

    public final long zze(int i) {
        zzi(i);
        return this.zzc[i];
    }

    public final void zzf(long j) {
        zzbU();
        int i = this.zzd;
        int length = this.zzc.length;
        if (i == length) {
            long[] jArr = new long[re$$ExternalSyntheticOutline0.m(length, 3, 2, 1, 10)];
            System.arraycopy(this.zzc, 0, jArr, 0, this.zzd);
            this.zzc = jArr;
        }
        long[] jArr2 = this.zzc;
        int i2 = this.zzd;
        this.zzd = i2 + 1;
        jArr2[i2] = j;
    }

    @Override // com.google.android.libraries.places.internal.zzbkb
    public final zzbkb zzg(int i) {
        if (i >= this.zzd) {
            return new zzbkn(i == 0 ? zza : Arrays.copyOf(this.zzc, i), this.zzd, true);
        }
        Path$$ExternalSyntheticBUOutline0.m$3();
        return null;
    }

    public final void zzi(int i) {
        if (i < 0 || i >= this.zzd) {
            Path$$ExternalSyntheticBUOutline0.m(zzib.zzb(this.zzd, i, (byte) 13, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzf(((Long) obj).longValue());
        return true;
    }
}
