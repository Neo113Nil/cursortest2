package com.google.android.gms.internal.measurement;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class zzabc extends AbstractMap {
    public static final zzaax zza = new zzaax(1);
    public final Object[] zzb;
    public final int[] zzc;
    public final zzabb zzd;
    public Integer zze;
    public String zzf;

    /* JADX WARN: Code restructure failed: missing block: B:59:0x016d, code lost:
    
        if (r8 < 0) goto L54;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.measurement.zzabc, java.util.AbstractMap] */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.measurement.zzabc] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzabc(zzabc zzabcVar, zzabc zzabcVar2) {
        int i;
        Object obj;
        Object[] objArr;
        ?? abstractMap = new AbstractMap();
        abstractMap.zzd = new zzabb(abstractMap, -1);
        abstractMap.zze = null;
        abstractMap.zzf = null;
        int size = zzabcVar2.size() + zzabcVar.size();
        int i2 = zzabcVar.zzc[zzabcVar.size()] + zzabcVar2.zzc[zzabcVar2.size()];
        int i3 = size + 1;
        Object[] objArr2 = new Object[i2];
        int[] iArr = new int[i3];
        int i4 = 0;
        iArr[0] = size;
        Map.Entry zzg = zzabcVar.zzg(0);
        Map.Entry zzg2 = zzabcVar2.zzg(0);
        int i5 = 0;
        int i6 = 0;
        int i7 = size;
        int i8 = 0;
        while (true) {
            if (zzg == null && zzg2 == null) {
                break;
            }
            int i9 = i8 + 1;
            if (zzg != null) {
                if (zzg2 != null) {
                    int compareTo = ((String) zzg.getKey()).compareTo((String) zzg2.getKey());
                    if (compareTo == 0) {
                        int i10 = i5 + 1;
                        int i11 = i6 + 1;
                        objArr2[i8] = new AbstractMap.SimpleImmutableEntry((String) zzg.getKey(), new zzabb(abstractMap, i8));
                        zzabb zzabbVar = (zzabb) zzg.getValue();
                        zzabb zzabbVar2 = (zzabb) zzg2.getValue();
                        int i12 = 0;
                        int i13 = 0;
                        abstractMap = abstractMap;
                        while (true) {
                            int zzc = zzabbVar.zzc();
                            zzabc zzabcVar3 = zzabbVar.zzb;
                            if (i12 >= zzc - zzabbVar.zzb() && i13 >= zzabbVar2.zzc() - zzabbVar2.zzb()) {
                                break;
                            }
                            int i14 = i12 == zzabbVar.zzc() - zzabbVar.zzb() ? 1 : i13 == zzabbVar2.zzc() - zzabbVar2.zzb() ? -1 : 0;
                            if (i14 == 0) {
                                zzaax zzaaxVar = zzabe.zzb;
                                i = i12;
                                i14 = zzabe.zzb.compare(zzabcVar3.zzb[zzabbVar.zzb() + i12], zzabbVar2.zzb.zzb[zzabbVar2.zzb() + i13]);
                            } else {
                                i = i12;
                            }
                            if (i14 < 0) {
                                i12 = i + 1;
                                obj = zzabcVar3.zzb[zzabbVar.zzb() + i];
                            } else {
                                int i15 = i13 + 1;
                                Object obj2 = zzabbVar2.zzb.zzb[zzabbVar2.zzb() + i13];
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
                        zzg = zzabcVar.zzg(i11);
                        zzg2 = zzabcVar2.zzg(i10);
                        i6 = i11;
                        i5 = i10;
                        i8 = i9;
                        i4 = 0;
                    }
                }
                i6++;
                i7 = zzd(zzg, i8, i7, objArr2, iArr);
                zzg = zzabcVar.zzg(i6);
                i8 = i9;
                i4 = 0;
                abstractMap = this;
            }
            Map.Entry entry = zzg;
            i5++;
            int zzd = zzd(zzg2, i8, i7, objArr2, iArr);
            zzg2 = zzabcVar2.zzg(i5);
            i7 = zzd;
            zzg = entry;
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
            if (zze(i2, i19)) {
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
        abstractMap.zzc = zze(i3, i21) ? Arrays.copyOf(iArr, i21) : iArr;
    }

    public static boolean zze(int i, int i2) {
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
        zzabb zzabbVar = (zzabb) entry.getValue();
        int zzc = zzabbVar.zzc() - zzabbVar.zzb();
        System.arraycopy(zzabbVar.zzb.zzb, zzabbVar.zzb(), objArr, i2, zzc);
        objArr[i] = new AbstractMap.SimpleImmutableEntry((String) entry.getKey(), new zzabb(this, i));
        int i3 = i2 + zzc;
        iArr[i + 1] = i3;
        return i3;
    }

    public final Map.Entry zzg(int i) {
        if (i < this.zzc[0]) {
            return (Map.Entry) this.zzb[i];
        }
        return null;
    }

    public zzabc() {
        List list = Collections.EMPTY_LIST;
        this.zzd = new zzabb(this, -1);
        this.zze = null;
        this.zzf = null;
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            int size = list.size();
            Object[] objArr = new Object[size];
            Iterator it2 = list.iterator();
            if (!it2.hasNext()) {
                int[] iArr = {0};
                this.zzb = zze(size, 0) ? Arrays.copyOf(objArr, 0) : objArr;
                this.zzc = iArr;
                return;
            }
            throw Recorder$$ExternalSyntheticOutline2.m(it2);
        }
        throw Recorder$$ExternalSyntheticOutline2.m(it);
    }
}
