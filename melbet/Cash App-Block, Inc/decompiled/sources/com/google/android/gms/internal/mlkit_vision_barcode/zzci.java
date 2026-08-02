package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.room.TransactorKt;
import com.google.common.collect.Maps;
import com.stripe.android.stripe3ds2.transaction.Logger;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes4.dex */
public final class zzci extends AbstractMap implements Serializable {
    public static final Object zzd = new Object();
    public transient int[] zza;
    public transient Object[] zzb;
    public transient Object[] zzc;
    public transient Object zze;
    public transient int zzf = Math.min(Math.max(12, 1), 1073741823);
    public transient int zzg;
    public transient zzcc zzh;
    public transient zzcc zzi;
    public transient Maps.Values zzj;

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (zzr()) {
            return;
        }
        this.zzf += 32;
        Map zzl = zzl();
        if (zzl != null) {
            this.zzf = Math.min(Math.max(size(), 3), 1073741823);
            zzl.clear();
            this.zze = null;
            this.zzg = 0;
            return;
        }
        Arrays.fill(zzB(), 0, this.zzg, (Object) null);
        Arrays.fill(zzC(), 0, this.zzg, (Object) null);
        Object obj = this.zze;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(zzA(), 0, this.zzg, 0);
        this.zzg = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map zzl = zzl();
        return zzl != null ? zzl.containsKey(obj) : zzw(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map zzl = zzl();
        if (zzl != null) {
            return zzl.containsValue(obj);
        }
        for (int i = 0; i < this.zzg; i++) {
            if (Logger.zza(obj, zzC()[i])) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        zzcc zzccVar = this.zzi;
        if (zzccVar != null) {
            return zzccVar;
        }
        zzcc zzccVar2 = new zzcc(this, 0);
        this.zzi = zzccVar2;
        return zzccVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map zzl = zzl();
        if (zzl != null) {
            return zzl.get(obj);
        }
        int zzw = zzw(obj);
        if (zzw == -1) {
            return null;
        }
        return zzC()[zzw];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        zzcc zzccVar = this.zzh;
        if (zzccVar != null) {
            return zzccVar;
        }
        zzcc zzccVar2 = new zzcc(this, 1);
        this.zzh = zzccVar2;
        return zzccVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int i;
        int i2 = 32;
        if (zzr()) {
            TransactorKt.zzf("Arrays already allocated", zzr());
            int i3 = this.zzf;
            int max = Math.max(i3 + 1, 2);
            int highestOneBit = Integer.highestOneBit(max);
            if (max > highestOneBit && (highestOneBit = highestOneBit + highestOneBit) <= 0) {
                highestOneBit = 1073741824;
            }
            int max2 = Math.max(4, highestOneBit);
            this.zze = zzcj.zzd(max2);
            this.zzf = ((32 - Integer.numberOfLeadingZeros(max2 - 1)) & 31) | (this.zzf & (-32));
            this.zza = new int[i3];
            this.zzb = new Object[i3];
            this.zzc = new Object[i3];
        }
        Map zzl = zzl();
        if (zzl != null) {
            return zzl.put(obj, obj2);
        }
        int[] zzA = zzA();
        Object[] zzB = zzB();
        Object[] zzC = zzC();
        int i4 = this.zzg;
        int i5 = i4 + 1;
        int zza = zzck.zza(obj);
        int zzv = zzv();
        int i6 = zza & zzv;
        Object obj3 = this.zze;
        Objects.requireNonNull(obj3);
        int zzc = zzcj.zzc(i6, obj3);
        if (zzc == 0) {
            if (i5 > zzv) {
                zzv = zzx(zzv, (zzv + 1) * (zzv < 32 ? 4 : 2), zza, i4);
            } else {
                Object obj4 = this.zze;
                Objects.requireNonNull(obj4);
                zzcj.zze(i6, i5, obj4);
            }
            i = 1;
        } else {
            int i7 = ~zzv;
            int i8 = zza & i7;
            int i9 = 0;
            while (true) {
                int i10 = zzc - 1;
                int i11 = zzA[i10];
                i = 1;
                int i12 = i11 & i7;
                int i13 = i2;
                if (i12 == i8 && Logger.zza(obj, zzB[i10])) {
                    Object obj5 = zzC[i10];
                    zzC[i10] = obj2;
                    return obj5;
                }
                int i14 = i11 & zzv;
                int i15 = i9 + 1;
                if (i14 != 0) {
                    i9 = i15;
                    zzc = i14;
                    i2 = i13;
                } else {
                    if (i15 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(zzv() + 1, 1.0f);
                        int i16 = isEmpty() ? -1 : 0;
                        while (i16 >= 0) {
                            linkedHashMap.put(zzB()[i16], zzC()[i16]);
                            int i17 = i16 + 1;
                            i16 = i17 < this.zzg ? i17 : -1;
                        }
                        this.zze = linkedHashMap;
                        this.zza = null;
                        this.zzb = null;
                        this.zzc = null;
                        this.zzf += 32;
                        return linkedHashMap.put(obj, obj2);
                    }
                    if (i5 > zzv) {
                        zzv = zzx(zzv, (zzv + 1) * (zzv < i13 ? 4 : 2), zza, i4);
                    } else {
                        zzA[i10] = (i5 & zzv) | i12;
                    }
                }
            }
        }
        int length = zzA().length;
        if (i5 > length) {
            int i18 = i;
            int min = Math.min(1073741823, (Math.max(i18, length >>> 1) + length) | i18);
            if (min != length) {
                this.zza = Arrays.copyOf(zzA(), min);
                this.zzb = Arrays.copyOf(zzB(), min);
                this.zzc = Arrays.copyOf(zzC(), min);
            }
        }
        zzA()[i4] = (~zzv) & zza;
        zzB()[i4] = obj;
        zzC()[i4] = obj2;
        this.zzg = i5;
        this.zzf += 32;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map zzl = zzl();
        if (zzl != null) {
            return zzl.remove(obj);
        }
        Object zzy = zzy(obj);
        if (zzy == zzd) {
            return null;
        }
        return zzy;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map zzl = zzl();
        return zzl != null ? zzl.size() : this.zzg;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Maps.Values values = this.zzj;
        if (values != null) {
            return values;
        }
        Maps.Values values2 = new Maps.Values((Object) this, 2);
        this.zzj = values2;
        return values2;
    }

    public final int[] zzA() {
        int[] iArr = this.zza;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final Object[] zzB() {
        Object[] objArr = this.zzb;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final Object[] zzC() {
        Object[] objArr = this.zzc;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final Map zzl() {
        Object obj = this.zze;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final void zzq(int i, int i2) {
        Object obj = this.zze;
        Objects.requireNonNull(obj);
        int[] zzA = zzA();
        Object[] zzB = zzB();
        Object[] zzC = zzC();
        int size = size();
        int i3 = size - 1;
        if (i >= i3) {
            zzB[i] = null;
            zzC[i] = null;
            zzA[i] = 0;
            return;
        }
        int i4 = i + 1;
        Object obj2 = zzB[i3];
        zzB[i] = obj2;
        zzC[i] = zzC[i3];
        zzB[i3] = null;
        zzC[i3] = null;
        zzA[i] = zzA[i3];
        zzA[i3] = 0;
        int zza = zzck.zza(obj2) & i2;
        int zzc = zzcj.zzc(zza, obj);
        if (zzc == size) {
            zzcj.zze(zza, i4, obj);
            return;
        }
        while (true) {
            int i5 = zzc - 1;
            int i6 = zzA[i5];
            int i7 = i6 & i2;
            if (i7 == size) {
                zzA[i5] = ((~i2) & i6) | (i4 & i2);
                return;
            }
            zzc = i7;
        }
    }

    public final boolean zzr() {
        return this.zze == null;
    }

    public final int zzv() {
        return (1 << (this.zzf & 31)) - 1;
    }

    public final int zzw(Object obj) {
        if (zzr()) {
            return -1;
        }
        int zza = zzck.zza(obj);
        int zzv = zzv();
        Object obj2 = this.zze;
        Objects.requireNonNull(obj2);
        int zzc = zzcj.zzc(zza & zzv, obj2);
        if (zzc != 0) {
            int i = ~zzv;
            int i2 = zza & i;
            do {
                int i3 = zzc - 1;
                int i4 = zzA()[i3];
                if ((i4 & i) == i2 && Logger.zza(obj, zzB()[i3])) {
                    return i3;
                }
                zzc = i4 & zzv;
            } while (zzc != 0);
        }
        return -1;
    }

    public final int zzx(int i, int i2, int i3, int i4) {
        int i5 = i2 - 1;
        Object zzd2 = zzcj.zzd(i2);
        if (i4 != 0) {
            zzcj.zze(i3 & i5, i4 + 1, zzd2);
        }
        Object obj = this.zze;
        Objects.requireNonNull(obj);
        int[] zzA = zzA();
        for (int i6 = 0; i6 <= i; i6++) {
            int zzc = zzcj.zzc(i6, obj);
            while (zzc != 0) {
                int i7 = zzc - 1;
                int i8 = zzA[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int zzc2 = zzcj.zzc(i10, zzd2);
                zzcj.zze(i10, zzc, zzd2);
                zzA[i7] = ((~i5) & i9) | (zzc2 & i5);
                zzc = i8 & i;
            }
        }
        this.zze = zzd2;
        this.zzf = ((32 - Integer.numberOfLeadingZeros(i5)) & 31) | (this.zzf & (-32));
        return i5;
    }

    public final Object zzy(Object obj) {
        if (!zzr()) {
            int zzv = zzv();
            Object obj2 = this.zze;
            Objects.requireNonNull(obj2);
            int zzb = zzcj.zzb(obj, null, zzv, obj2, zzA(), zzB(), null);
            if (zzb != -1) {
                Object obj3 = zzC()[zzb];
                zzq(zzb, zzv);
                this.zzg--;
                this.zzf += 32;
                return obj3;
            }
        }
        return zzd;
    }
}
