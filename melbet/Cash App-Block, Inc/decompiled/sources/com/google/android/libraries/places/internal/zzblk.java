package com.google.android.libraries.places.internal;

import bo.app.re$$ExternalSyntheticOutline0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public final class zzblk extends zzbic implements RandomAccess {
    public static final Object[] zza;
    public static final zzblk zzb;
    public Object[] zzc;
    public int zzd;

    static {
        Object[] objArr = new Object[0];
        zza = objArr;
        zzb = new zzblk(objArr, 0, false);
    }

    public zzblk(Object[] objArr, int i, boolean z) {
        super(z);
        this.zzc = objArr;
        this.zzd = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        zzbU();
        if (i < 0 || i > (i2 = this.zzd)) {
            Path$$ExternalSyntheticBUOutline0.m(zzib.zzb(this.zzd, i, (byte) 13, "Index:", ", Size:"));
            return;
        }
        int i3 = i + 1;
        Object[] objArr = this.zzc;
        int length = objArr.length;
        if (i2 < length) {
            System.arraycopy(objArr, i, objArr, i3, i2 - i);
        } else {
            Object[] objArr2 = new Object[re$$ExternalSyntheticOutline0.m(length, 3, 2, 1, 10)];
            System.arraycopy(this.zzc, 0, objArr2, 0, i);
            System.arraycopy(this.zzc, i, objArr2, i3, this.zzd - i);
            this.zzc = objArr2;
        }
        this.zzc[i] = obj;
        this.zzd++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.libraries.places.internal.zzbic, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int i = this.zzd;
        if (i != list.size()) {
            return false;
        }
        if (!(obj instanceof zzblk)) {
            for (int i2 = 0; i2 < i; i2++) {
                if (!this.zzc[i2].equals(list.get(i2))) {
                    return false;
                }
            }
            return true;
        }
        zzblk zzblkVar = (zzblk) obj;
        for (int i3 = 0; i3 < i; i3++) {
            if (!this.zzc[i3].equals(zzblkVar.zzc[i3])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        zzh$1(i);
        return this.zzc[i];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = this.zzd;
        int i2 = 1;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + this.zzc[i3].hashCode();
        }
        return i2;
    }

    @Override // com.google.android.libraries.places.internal.zzbic, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        zzbU();
        zzh$1(i);
        Object[] objArr = this.zzc;
        Object obj = objArr[i];
        if (i < this.zzd - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
        }
        this.zzd--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        zzbU();
        zzh$1(i);
        Object[] objArr = this.zzc;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.internal.zzbkb
    public final /* bridge */ /* synthetic */ zzbkb zzg(int i) {
        if (i >= this.zzd) {
            return new zzblk(i == 0 ? zza : Arrays.copyOf(this.zzc, i), this.zzd, true);
        }
        Path$$ExternalSyntheticBUOutline0.m$3();
        return null;
    }

    public final void zzh$1(int i) {
        if (i < 0 || i >= this.zzd) {
            Path$$ExternalSyntheticBUOutline0.m(zzib.zzb(this.zzd, i, (byte) 13, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        zzbU();
        int i = this.zzd;
        int length = this.zzc.length;
        if (i == length) {
            this.zzc = Arrays.copyOf(this.zzc, re$$ExternalSyntheticOutline0.m(length, 3, 2, 1, 10));
        }
        Object[] objArr = this.zzc;
        int i2 = this.zzd;
        this.zzd = i2 + 1;
        objArr[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
