package com.google.android.gms.internal.tapandpay;

import java.util.Iterator;

/* loaded from: classes4.dex */
public final class zzay extends zzau {
    public static final zzay zza;
    public static final Object[] zzd;
    public final transient Object[] zzb;
    public final transient Object[] zzc;
    public final transient int zze;
    public final transient int zzf;
    public final transient int zzg;

    static {
        Object[] objArr = new Object[0];
        zzd = objArr;
        zza = new zzay(0, 0, 0, objArr, objArr);
    }

    public zzay(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        this.zzb = objArr;
        this.zze = i;
        this.zzc = objArr2;
        this.zzf = i2;
        this.zzg = i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        Object[] objArr = this.zzc;
        if (objArr.length == 0) {
            return false;
        }
        int rotateLeft = (int) (Integer.rotateLeft((int) (obj.hashCode() * (-862048943)), 15) * 461845907);
        while (true) {
            int i = rotateLeft & this.zzf;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            rotateLeft = i + 1;
        }
    }

    @Override // com.google.android.gms.internal.tapandpay.zzau, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zze;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        zzat zzatVar = this.zza;
        if (zzatVar == null) {
            zzar zzarVar = zzat.zza;
            int i = this.zzg;
            zzatVar = i == 0 ? zzax.zza : new zzax(i, this.zzb);
            this.zza = zzatVar;
        }
        return zzatVar.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzaq
    public final int zza(Object[] objArr) {
        Object[] objArr2 = this.zzb;
        int i = this.zzg;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzaq
    public final int zzb() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzaq
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzaq
    public final Object[] zze() {
        return this.zzb;
    }
}
