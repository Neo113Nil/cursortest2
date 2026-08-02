package com.google.android.gms.internal.mlkit_vision_face;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.common.collect.Maps;
import com.squareup.cash.fidesmo.views.ScanningHeartPulseKt;
import com.squareup.cash.fidesmo.views.ScanningStarPulseKt;
import com.stripe.android.uicore.elements.SectionUIKt;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public final class zzbd extends AbstractMap implements Serializable {
    public static final Object zzd = new Object();
    public transient int[] zza;
    public transient Object[] zzb;
    public transient Object[] zzc;
    public transient Object zze;
    public transient int zzf = Math.min(Math.max(12, 1), 1073741823);
    public transient int zzg;
    public transient zzay zzh;
    public transient zzay zzi;
    public transient Maps.Values zzj;

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (zzq()) {
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
        Object[] objArr = this.zzb;
        objArr.getClass();
        Arrays.fill(objArr, 0, this.zzg, (Object) null);
        Object[] objArr2 = this.zzc;
        objArr2.getClass();
        Arrays.fill(objArr2, 0, this.zzg, (Object) null);
        Object obj = this.zze;
        obj.getClass();
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        int[] iArr = this.zza;
        iArr.getClass();
        Arrays.fill(iArr, 0, this.zzg, 0);
        this.zzg = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map zzl = zzl();
        return zzl != null ? zzl.containsKey(obj) : zzv(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map zzl = zzl();
        if (zzl != null) {
            return zzl.containsValue(obj);
        }
        for (int i = 0; i < this.zzg; i++) {
            Object[] objArr = this.zzc;
            objArr.getClass();
            if (ScanningStarPulseKt.zza(obj, objArr[i])) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        zzay zzayVar = this.zzi;
        if (zzayVar != null) {
            return zzayVar;
        }
        zzay zzayVar2 = new zzay(this, 0);
        this.zzi = zzayVar2;
        return zzayVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map zzl = zzl();
        if (zzl != null) {
            return zzl.get(obj);
        }
        int zzv = zzv(obj);
        if (zzv == -1) {
            return null;
        }
        Object[] objArr = this.zzc;
        objArr.getClass();
        return objArr[zzv];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        zzay zzayVar = this.zzh;
        if (zzayVar != null) {
            return zzayVar;
        }
        zzay zzayVar2 = new zzay(this, 1);
        this.zzh = zzayVar2;
        return zzayVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int i;
        int i2 = 32;
        if (zzq()) {
            if (!zzq()) {
                a$$ExternalSyntheticBUOutline0.m$1("Arrays already allocated");
                return null;
            }
            int i3 = this.zzf;
            int max = Math.max(i3 + 1, 2);
            int highestOneBit = Integer.highestOneBit(max);
            if (max > highestOneBit && (highestOneBit = highestOneBit + highestOneBit) <= 0) {
                highestOneBit = 1073741824;
            }
            int max2 = Math.max(4, highestOneBit);
            this.zze = SectionUIKt.zzd(max2);
            this.zzf = ((32 - Integer.numberOfLeadingZeros(max2 - 1)) & 31) | (this.zzf & (-32));
            this.zza = new int[i3];
            this.zzb = new Object[i3];
            this.zzc = new Object[i3];
        }
        Map zzl = zzl();
        if (zzl != null) {
            return zzl.put(obj, obj2);
        }
        int[] iArr = this.zza;
        iArr.getClass();
        Object[] objArr = this.zzb;
        objArr.getClass();
        Object[] objArr2 = this.zzc;
        objArr2.getClass();
        int i4 = this.zzg;
        int i5 = i4 + 1;
        int zza = ScanningHeartPulseKt.zza(obj);
        int zzu = zzu();
        int i6 = zza & zzu;
        Object obj3 = this.zze;
        obj3.getClass();
        int zzc = SectionUIKt.zzc(i6, obj3);
        if (zzc == 0) {
            if (i5 > zzu) {
                zzu = zzw(zzu, (zzu + 1) * (zzu < 32 ? 4 : 2), zza, i4);
            } else {
                Object obj4 = this.zze;
                obj4.getClass();
                SectionUIKt.zze(i6, i5, obj4);
            }
            i = 1;
        } else {
            int i7 = ~zzu;
            int i8 = zza & i7;
            int i9 = 0;
            while (true) {
                int i10 = zzc - 1;
                int i11 = iArr[i10];
                i = 1;
                int i12 = i11 & i7;
                int i13 = i2;
                if (i12 == i8 && ScanningStarPulseKt.zza(obj, objArr[i10])) {
                    Object obj5 = objArr2[i10];
                    objArr2[i10] = obj2;
                    return obj5;
                }
                int i14 = i11 & zzu;
                int i15 = i9 + 1;
                if (i14 != 0) {
                    zzc = i14;
                    i9 = i15;
                    i2 = i13;
                } else {
                    if (i15 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(zzu() + 1, 1.0f);
                        int i16 = isEmpty() ? -1 : 0;
                        while (i16 >= 0) {
                            Object[] objArr3 = this.zzb;
                            objArr3.getClass();
                            Object obj6 = objArr3[i16];
                            Object[] objArr4 = this.zzc;
                            objArr4.getClass();
                            linkedHashMap.put(obj6, objArr4[i16]);
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
                    if (i5 > zzu) {
                        zzu = zzw(zzu, (zzu + 1) * (zzu < i13 ? 4 : 2), zza, i4);
                    } else {
                        iArr[i10] = i12 | (i5 & zzu);
                    }
                }
            }
        }
        int[] iArr2 = this.zza;
        iArr2.getClass();
        int length = iArr2.length;
        if (i5 > length) {
            int i18 = i;
            int min = Math.min(1073741823, (Math.max(i18, length >>> 1) + length) | i18);
            if (min != length) {
                int[] iArr3 = this.zza;
                iArr3.getClass();
                this.zza = Arrays.copyOf(iArr3, min);
                Object[] objArr5 = this.zzb;
                objArr5.getClass();
                this.zzb = Arrays.copyOf(objArr5, min);
                Object[] objArr6 = this.zzc;
                objArr6.getClass();
                this.zzc = Arrays.copyOf(objArr6, min);
            }
        }
        int[] iArr4 = this.zza;
        iArr4.getClass();
        iArr4[i4] = (~zzu) & zza;
        Object[] objArr7 = this.zzb;
        objArr7.getClass();
        objArr7[i4] = obj;
        Object[] objArr8 = this.zzc;
        objArr8.getClass();
        objArr8[i4] = obj2;
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
        Object zzx = zzx(obj);
        if (zzx == zzd) {
            return null;
        }
        return zzx;
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
        Maps.Values values2 = new Maps.Values((Object) this, 4);
        this.zzj = values2;
        return values2;
    }

    public final Map zzl() {
        Object obj = this.zze;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final void zzp(int i, int i2) {
        Object obj = this.zze;
        obj.getClass();
        int[] iArr = this.zza;
        iArr.getClass();
        Object[] objArr = this.zzb;
        objArr.getClass();
        Object[] objArr2 = this.zzc;
        objArr2.getClass();
        int size = size();
        int i3 = size - 1;
        if (i >= i3) {
            objArr[i] = null;
            objArr2[i] = null;
            iArr[i] = 0;
            return;
        }
        Object obj2 = objArr[i3];
        objArr[i] = obj2;
        objArr2[i] = objArr2[i3];
        objArr[i3] = null;
        objArr2[i3] = null;
        iArr[i] = iArr[i3];
        iArr[i3] = 0;
        int zza = ScanningHeartPulseKt.zza(obj2) & i2;
        int zzc = SectionUIKt.zzc(zza, obj);
        if (zzc == size) {
            SectionUIKt.zze(zza, i + 1, obj);
            return;
        }
        while (true) {
            int i4 = zzc - 1;
            int i5 = iArr[i4];
            int i6 = i5 & i2;
            if (i6 == size) {
                iArr[i4] = ((~i2) & i5) | ((i + 1) & i2);
                return;
            }
            zzc = i6;
        }
    }

    public final boolean zzq() {
        return this.zze == null;
    }

    public final int zzu() {
        return (1 << (this.zzf & 31)) - 1;
    }

    public final int zzv(Object obj) {
        if (zzq()) {
            return -1;
        }
        int zza = ScanningHeartPulseKt.zza(obj);
        int zzu = zzu();
        Object obj2 = this.zze;
        obj2.getClass();
        int zzc = SectionUIKt.zzc(zza & zzu, obj2);
        if (zzc != 0) {
            int i = ~zzu;
            int i2 = zza & i;
            do {
                int i3 = zzc - 1;
                int[] iArr = this.zza;
                iArr.getClass();
                int i4 = iArr[i3];
                if ((i4 & i) == i2) {
                    Object[] objArr = this.zzb;
                    objArr.getClass();
                    if (ScanningStarPulseKt.zza(obj, objArr[i3])) {
                        return i3;
                    }
                }
                zzc = i4 & zzu;
            } while (zzc != 0);
        }
        return -1;
    }

    public final int zzw(int i, int i2, int i3, int i4) {
        Object zzd2 = SectionUIKt.zzd(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            SectionUIKt.zze(i3 & i5, i4 + 1, zzd2);
        }
        Object obj = this.zze;
        obj.getClass();
        int[] iArr = this.zza;
        iArr.getClass();
        for (int i6 = 0; i6 <= i; i6++) {
            int zzc = SectionUIKt.zzc(i6, obj);
            while (zzc != 0) {
                int i7 = zzc - 1;
                int i8 = iArr[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int zzc2 = SectionUIKt.zzc(i10, zzd2);
                SectionUIKt.zze(i10, zzc, zzd2);
                iArr[i7] = ((~i5) & i9) | (zzc2 & i5);
                zzc = i8 & i;
            }
        }
        this.zze = zzd2;
        this.zzf = ((32 - Integer.numberOfLeadingZeros(i5)) & 31) | (this.zzf & (-32));
        return i5;
    }

    public final Object zzx(Object obj) {
        if (!zzq()) {
            int zzu = zzu();
            Object obj2 = this.zze;
            obj2.getClass();
            int[] iArr = this.zza;
            iArr.getClass();
            Object[] objArr = this.zzb;
            objArr.getClass();
            int zzb = SectionUIKt.zzb(obj, null, zzu, obj2, iArr, objArr, null);
            if (zzb != -1) {
                Object[] objArr2 = this.zzc;
                objArr2.getClass();
                Object obj3 = objArr2[zzb];
                zzp(zzb, zzu);
                this.zzg--;
                this.zzf += 32;
                return obj3;
            }
        }
        return zzd;
    }
}
