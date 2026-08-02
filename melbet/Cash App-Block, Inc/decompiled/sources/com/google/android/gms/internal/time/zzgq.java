package com.google.android.gms.internal.time;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public final class zzgq extends AbstractMap {
    public static final zzgl zza = new zzgl(1);
    public final Object[] zzb;
    public final int[] zzc;
    public final zzgp zzd;
    public Integer zze;
    public String zzf;

    /* JADX WARN: Code restructure failed: missing block: B:59:0x016d, code lost:
    
        if (r8 < 0) goto L54;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.time.zzgq, java.util.AbstractMap] */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.time.zzgq] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzgq(zzgq zzgqVar, zzgq zzgqVar2) {
        int i;
        Object obj;
        Object[] objArr;
        ?? abstractMap = new AbstractMap();
        abstractMap.zzd = new zzgp(abstractMap, -1);
        abstractMap.zze = null;
        abstractMap.zzf = null;
        int size = zzgqVar2.size() + zzgqVar.size();
        int i2 = zzgqVar.zzc[zzgqVar.size()] + zzgqVar2.zzc[zzgqVar2.size()];
        int i3 = size + 1;
        Object[] objArr2 = new Object[i2];
        int[] iArr = new int[i3];
        int i4 = 0;
        iArr[0] = size;
        Map.Entry zze = zzgqVar.zze(0);
        Map.Entry zze2 = zzgqVar2.zze(0);
        int i5 = 0;
        int i6 = 0;
        int i7 = size;
        int i8 = 0;
        while (true) {
            if (zze == null && zze2 == null) {
                break;
            }
            int i9 = i8 + 1;
            if (zze != null) {
                if (zze2 != null) {
                    int compareTo = ((String) zze.getKey()).compareTo((String) zze2.getKey());
                    if (compareTo == 0) {
                        int i10 = i5 + 1;
                        int i11 = i6 + 1;
                        objArr2[i8] = new AbstractMap.SimpleImmutableEntry((String) zze.getKey(), new zzgp(abstractMap, i8));
                        zzgp zzgpVar = (zzgp) zze.getValue();
                        zzgp zzgpVar2 = (zzgp) zze2.getValue();
                        int i12 = 0;
                        int i13 = 0;
                        abstractMap = abstractMap;
                        while (true) {
                            int zza2 = zzgpVar.zza();
                            zzgq zzgqVar3 = zzgpVar.zzb;
                            if (i12 >= zza2 - zzgpVar.zzb() && i13 >= zzgpVar2.zza() - zzgpVar2.zzb()) {
                                break;
                            }
                            int i14 = i12 == zzgpVar.zza() - zzgpVar.zzb() ? 1 : i13 == zzgpVar2.zza() - zzgpVar2.zzb() ? -1 : 0;
                            if (i14 == 0) {
                                i = i12;
                                i14 = zzgs.zza.compare(zzgqVar3.zzb[zzgpVar.zzb() + i12], zzgpVar2.zzb.zzb[zzgpVar2.zzb() + i13]);
                            } else {
                                i = i12;
                            }
                            if (i14 < 0) {
                                i12 = i + 1;
                                obj = zzgqVar3.zzb[zzgpVar.zzb() + i];
                            } else {
                                int i15 = i13 + 1;
                                Object obj2 = zzgpVar2.zzb.zzb[zzgpVar2.zzb() + i13];
                                if (i14 == 0) {
                                    i13 = i15;
                                    obj = obj2;
                                    i12 = i + 1;
                                } else {
                                    i13 = i15;
                                    obj = obj2;
                                    i12 = i;
                                }
                            }
                            objArr2[i7] = obj;
                            abstractMap = this;
                            i7++;
                        }
                        iArr[i9] = i7;
                        zze = zzgqVar.zze(i11);
                        zze2 = zzgqVar2.zze(i10);
                        i6 = i11;
                        i5 = i10;
                        i8 = i9;
                        i4 = 0;
                    }
                }
                i6++;
                i7 = zzd(zze, i8, i7, objArr2, iArr);
                zze = zzgqVar.zze(i6);
                i8 = i9;
                i4 = 0;
                abstractMap = this;
            }
            Map.Entry entry = zze;
            i5++;
            int zzd = zzd(zze2, i8, i7, objArr2, iArr);
            zze2 = zzgqVar2.zze(i5);
            i7 = zzd;
            zze = entry;
            i8 = i9;
            i4 = 0;
            abstractMap = this;
        }
        int i16 = iArr[i4];
        int i17 = i16 - i8;
        if (i17 != 0) {
            for (int i18 = i4; i18 <= i8; i18++) {
                iArr[i18] = iArr[i18] - i17;
            }
            int i19 = iArr[i8];
            int i20 = i19 - i8;
            if (zzg(i2, i19)) {
                objArr = new Object[i19];
                System.arraycopy(objArr2, i4, objArr, i4, i8);
            } else {
                objArr = objArr2;
            }
            System.arraycopy(objArr2, i16, objArr, i8, i20);
            objArr2 = objArr;
        }
        abstractMap.zzb = objArr2;
        int i21 = iArr[i4] + 1;
        abstractMap.zzc = zzg(i3, i21) ? Arrays.copyOf(iArr, i21) : iArr;
    }

    public static boolean zzg(int i, int i2) {
        return i > 16 && i * 9 > i2 * 10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return this.zzd;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        if (this.zze == null) {
            this.zze = Integer.valueOf(super.hashCode());
        }
        return this.zze.intValue();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        if (this.zzf == null) {
            this.zzf = super.toString();
        }
        return this.zzf;
    }

    public final int zzd(Map.Entry entry, int i, int i2, Object[] objArr, int[] iArr) {
        zzgp zzgpVar = (zzgp) entry.getValue();
        int zza2 = zzgpVar.zza() - zzgpVar.zzb();
        System.arraycopy(zzgpVar.zzb.zzb, zzgpVar.zzb(), objArr, i2, zza2);
        objArr[i] = new AbstractMap.SimpleImmutableEntry((String) entry.getKey(), new zzgp(this, i));
        int i3 = i2 + zza2;
        iArr[i + 1] = i3;
        return i3;
    }

    public final Map.Entry zze(int i) {
        if (i < this.zzc[0]) {
            return (Map.Entry) this.zzb[i];
        }
        return null;
    }

    public zzgq() {
        List list = Collections.EMPTY_LIST;
        this.zzd = new zzgp(this, -1);
        this.zze = null;
        this.zzf = null;
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            int size = list.size();
            Object[] objArr = new Object[size];
            Iterator it2 = list.iterator();
            if (!it2.hasNext()) {
                int[] iArr = {0};
                this.zzb = zzg(size, 0) ? Arrays.copyOf(objArr, 0) : objArr;
                this.zzc = iArr;
                return;
            }
            throw Recorder$$ExternalSyntheticOutline2.m(it2);
        }
        throw Recorder$$ExternalSyntheticOutline2.m(it);
    }
}
