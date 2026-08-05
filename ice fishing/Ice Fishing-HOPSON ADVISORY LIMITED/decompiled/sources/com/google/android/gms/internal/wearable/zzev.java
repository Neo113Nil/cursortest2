package com.google.android.gms.internal.wearable;

import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
final class zzev extends zzbu implements RandomAccess {
    private static final Object[] zza;
    private static final zzev zzb;
    private Object[] zzc;
    private int zzd;

    static {
        Object[] objArr = new Object[0];
        zza = objArr;
        zzb = new zzev(objArr, 0, false);
    }

    zzev() {
        this(zza, 0, true);
    }

    public static zzev zzd() {
        return zzb;
    }

    private static int zzf(int i) {
        return Math.max(((i * 3) / 2) + 1, 10);
    }

    private final void zzh(int i) {
        if (i < 0 || i >= this.zzd) {
            throw new IndexOutOfBoundsException(zzi(i));
        }
    }

    private final String zzi(int i) {
        return zzbw.zza(this.zzd, i, (byte) 13, "Index:", ", Size:");
    }

    @Override // com.google.android.gms.internal.wearable.zzbu, java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        zzaj();
        if (i < 0 || i > (i2 = this.zzd)) {
            throw new IndexOutOfBoundsException(zzi(i));
        }
        int i3 = i + 1;
        Object[] objArr = this.zzc;
        int length = objArr.length;
        if (i2 < length) {
            System.arraycopy(objArr, i, objArr, i3, i2 - i);
        } else {
            Object[] objArr2 = new Object[zzf(length)];
            System.arraycopy(this.zzc, 0, objArr2, 0, i);
            System.arraycopy(this.zzc, i, objArr2, i3, this.zzd - i);
            this.zzc = objArr2;
        }
        this.zzc[i] = obj;
        this.zzd++;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.wearable.zzbu, java.util.AbstractList, java.util.Collection, java.util.List
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
        if (!(obj instanceof zzev)) {
            for (int i2 = 0; i2 < i; i2++) {
                if (!this.zzc[i2].equals(list.get(i2))) {
                    return false;
                }
            }
            return true;
        }
        zzev zzevVar = (zzev) obj;
        for (int i3 = 0; i3 < i; i3++) {
            if (!this.zzc[i3].equals(zzevVar.zzc[i3])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        zzh(i);
        return this.zzc[i];
    }

    @Override // com.google.android.gms.internal.wearable.zzbu, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = this.zzd;
        int i2 = 1;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + this.zzc[i3].hashCode();
        }
        return i2;
    }

    @Override // com.google.android.gms.internal.wearable.zzbu, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        zzaj();
        zzh(i);
        Object[] objArr = this.zzc;
        Object obj = objArr[i];
        if (i < this.zzd - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
        }
        this.zzd--;
        this.modCount++;
        return obj;
    }

    @Override // com.google.android.gms.internal.wearable.zzbu, java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        zzaj();
        zzh(i);
        Object[] objArr = this.zzc;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        this.modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzd;
    }

    final void zze(int i) {
        int length = this.zzc.length;
        if (i <= length) {
            return;
        }
        if (length == 0) {
            this.zzc = new Object[Math.max(i, 10)];
            return;
        }
        while (length < i) {
            length = zzf(length);
        }
        this.zzc = Arrays.copyOf(this.zzc, length);
    }

    @Override // com.google.android.gms.internal.wearable.zzdp, com.google.android.gms.internal.wearable.zzdi
    public final /* bridge */ /* synthetic */ zzdp zzg(int i) {
        if (i >= this.zzd) {
            return new zzev(i == 0 ? zza : Arrays.copyOf(this.zzc, i), this.zzd, true);
        }
        throw new IllegalArgumentException();
    }

    private zzev(Object[] objArr, int i, boolean z) {
        super(z);
        this.zzc = objArr;
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.wearable.zzbu, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        zzaj();
        int i = this.zzd;
        int length = this.zzc.length;
        if (i == length) {
            this.zzc = Arrays.copyOf(this.zzc, zzf(length));
        }
        Object[] objArr = this.zzc;
        int i2 = this.zzd;
        this.zzd = i2 + 1;
        objArr[i2] = obj;
        this.modCount++;
        return true;
    }
}
