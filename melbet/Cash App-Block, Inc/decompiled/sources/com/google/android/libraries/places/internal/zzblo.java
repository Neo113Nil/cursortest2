package com.google.android.libraries.places.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class zzblo {
    public static final zzgc zzb;

    static {
        int i = zzbid.$r8$clinit;
        zzb = new zzgc(4);
    }

    public static boolean zzB(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void zzC(zzgc zzgcVar, Object obj, Object obj2) {
        zzbjh zzbjhVar = ((zzbjo) obj2).zzb;
        if (zzbjhVar.zza.isEmpty()) {
            return;
        }
        zzgcVar.getClass();
        zzbjh zza = zzgc.zza(obj);
        zza.getClass();
        zzblp zzblpVar = zzbjhVar.zza;
        if (zzblpVar.zzb > 0) {
            zza.zzo(zzblpVar.zzd(0));
            throw null;
        }
        Iterator it = zzblpVar.zze().iterator();
        if (it.hasNext()) {
            zza.zzo((Map.Entry) it.next());
            throw null;
        }
    }

    public static void zzD(Object obj, Object obj2) {
        zzbjr zzbjrVar = (zzbjr) obj;
        zzbma zzbmaVar = zzbjrVar.zzc;
        zzbma zzbmaVar2 = ((zzbjr) obj2).zzc;
        zzbma zzbmaVar3 = zzbma.zza;
        if (!zzbmaVar3.equals(zzbmaVar2)) {
            if (zzbmaVar3.equals(zzbmaVar)) {
                int i = zzbmaVar.zzb + zzbmaVar2.zzb;
                int[] copyOf = Arrays.copyOf(zzbmaVar.zzc, i);
                System.arraycopy(zzbmaVar2.zzc, 0, copyOf, zzbmaVar.zzb, zzbmaVar2.zzb);
                Object[] copyOf2 = Arrays.copyOf(zzbmaVar.zzd, i);
                System.arraycopy(zzbmaVar2.zzd, 0, copyOf2, zzbmaVar.zzb, zzbmaVar2.zzb);
                zzbmaVar = new zzbma(i, copyOf, copyOf2, true);
            } else {
                zzbmaVar.getClass();
                if (!zzbmaVar2.equals(zzbmaVar3)) {
                    if (!zzbmaVar.zzf) {
                        OptionalProvider$$ExternalSyntheticLambda0.m();
                        return;
                    }
                    int i2 = zzbmaVar.zzb + zzbmaVar2.zzb;
                    zzbmaVar.zzm(i2);
                    System.arraycopy(zzbmaVar2.zzc, 0, zzbmaVar.zzc, zzbmaVar.zzb, zzbmaVar2.zzb);
                    System.arraycopy(zzbmaVar2.zzd, 0, zzbmaVar.zzd, zzbmaVar.zzb, zzbmaVar2.zzb);
                    zzbmaVar.zzb = i2;
                }
            }
        }
        zzbjrVar.zzc = zzbmaVar;
    }

    public static Object zzE(Object obj, int i, zzbkb zzbkbVar, zzbjx zzbjxVar, Object obj2, zzgc zzgcVar) {
        if (zzbjxVar == null) {
            return obj2;
        }
        int size = zzbkbVar.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Integer num = (Integer) zzbkbVar.get(i3);
            int intValue = num.intValue();
            if (zzbjxVar.zza(intValue)) {
                if (i3 != i2) {
                    zzbkbVar.set(i2, num);
                }
                i2++;
            } else {
                if (obj2 == null) {
                    zzgcVar.getClass();
                    obj2 = zzgc.zzh(obj);
                }
                zzgcVar.getClass();
                ((zzbma) obj2).zzk(i << 3, Long.valueOf(intValue));
            }
        }
        if (i2 != size) {
            zzbkbVar.subList(i2, size).clear();
        }
        return obj2;
    }

    public static void zza(int i, List list, zzfv zzfvVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzbiv zzbivVar = (zzbiv) zzfvVar.zza;
        if (list instanceof zzbix) {
            a$$ExternalSyntheticBUOutline0.m$1();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                zzbivVar.zzh(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        zzbivVar.zzc(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            i3 += 8;
        }
        zzbivVar.zzs(i3);
        while (i2 < list.size()) {
            zzbivVar.zzv(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void zzb(int i, List list, zzfv zzfvVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzbiv zzbivVar = (zzbiv) zzfvVar.zza;
        if (list instanceof zzbjj) {
            a$$ExternalSyntheticBUOutline0.m$1();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                zzbivVar.zzf(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        zzbivVar.zzc(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            i3 += 4;
        }
        zzbivVar.zzs(i3);
        while (i2 < list.size()) {
            zzbivVar.zzt(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public static void zzc(int i, List list, zzfv zzfvVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzbiv zzbivVar = (zzbiv) zzfvVar.zza;
        int i2 = 0;
        if (!(list instanceof zzbkn)) {
            if (!z) {
                while (i2 < list.size()) {
                    zzbivVar.zzg(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            zzbivVar.zzc(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzbiv.zzH(((Long) list.get(i4)).longValue());
            }
            zzbivVar.zzs(i3);
            while (i2 < list.size()) {
                zzbivVar.zzu(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zzbkn zzbknVar = (zzbkn) list;
        if (!z) {
            while (i2 < zzbknVar.zzd) {
                zzbivVar.zzg(i, zzbknVar.zze(i2));
                i2++;
            }
            return;
        }
        zzbivVar.zzc(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzbknVar.zzd; i6++) {
            i5 += zzbiv.zzH(zzbknVar.zze(i6));
        }
        zzbivVar.zzs(i5);
        while (i2 < zzbknVar.zzd) {
            zzbivVar.zzu(zzbknVar.zze(i2));
            i2++;
        }
    }

    public static void zzd(int i, List list, zzfv zzfvVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzbiv zzbivVar = (zzbiv) zzfvVar.zza;
        int i2 = 0;
        if (!(list instanceof zzbkn)) {
            if (!z) {
                while (i2 < list.size()) {
                    zzbivVar.zzg(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            zzbivVar.zzc(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzbiv.zzH(((Long) list.get(i4)).longValue());
            }
            zzbivVar.zzs(i3);
            while (i2 < list.size()) {
                zzbivVar.zzu(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zzbkn zzbknVar = (zzbkn) list;
        if (!z) {
            while (i2 < zzbknVar.zzd) {
                zzbivVar.zzg(i, zzbknVar.zze(i2));
                i2++;
            }
            return;
        }
        zzbivVar.zzc(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzbknVar.zzd; i6++) {
            i5 += zzbiv.zzH(zzbknVar.zze(i6));
        }
        zzbivVar.zzs(i5);
        while (i2 < zzbknVar.zzd) {
            zzbivVar.zzu(zzbknVar.zze(i2));
            i2++;
        }
    }

    public static void zze(int i, List list, zzfv zzfvVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzbiv zzbivVar = (zzbiv) zzfvVar.zza;
        int i2 = 0;
        if (!(list instanceof zzbkn)) {
            if (!z) {
                while (i2 < list.size()) {
                    long longValue = ((Long) list.get(i2)).longValue();
                    zzbivVar.zzg(i, (longValue >> 63) ^ (longValue + longValue));
                    i2++;
                }
                return;
            }
            zzbivVar.zzc(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                long longValue2 = ((Long) list.get(i4)).longValue();
                i3 += zzbiv.zzH((longValue2 >> 63) ^ (longValue2 + longValue2));
            }
            zzbivVar.zzs(i3);
            while (i2 < list.size()) {
                long longValue3 = ((Long) list.get(i2)).longValue();
                zzbivVar.zzu((longValue3 >> 63) ^ (longValue3 + longValue3));
                i2++;
            }
            return;
        }
        zzbkn zzbknVar = (zzbkn) list;
        if (!z) {
            while (i2 < zzbknVar.zzd) {
                long zze = zzbknVar.zze(i2);
                zzbivVar.zzg(i, (zze >> 63) ^ (zze + zze));
                i2++;
            }
            return;
        }
        zzbivVar.zzc(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzbknVar.zzd; i6++) {
            long zze2 = zzbknVar.zze(i6);
            i5 += zzbiv.zzH((zze2 >> 63) ^ (zze2 + zze2));
        }
        zzbivVar.zzs(i5);
        while (i2 < zzbknVar.zzd) {
            long zze3 = zzbknVar.zze(i2);
            zzbivVar.zzu((zze3 >> 63) ^ (zze3 + zze3));
            i2++;
        }
    }

    public static void zzf(int i, List list, zzfv zzfvVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzbiv zzbivVar = (zzbiv) zzfvVar.zza;
        int i2 = 0;
        if (!(list instanceof zzbkn)) {
            if (!z) {
                while (i2 < list.size()) {
                    zzbivVar.zzh(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            zzbivVar.zzc(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                i3 += 8;
            }
            zzbivVar.zzs(i3);
            while (i2 < list.size()) {
                zzbivVar.zzv(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zzbkn zzbknVar = (zzbkn) list;
        if (!z) {
            while (i2 < zzbknVar.zzd) {
                zzbivVar.zzh(i, zzbknVar.zze(i2));
                i2++;
            }
            return;
        }
        zzbivVar.zzc(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzbknVar.zzd; i6++) {
            zzbknVar.zze(i6);
            i5 += 8;
        }
        zzbivVar.zzs(i5);
        while (i2 < zzbknVar.zzd) {
            zzbivVar.zzv(zzbknVar.zze(i2));
            i2++;
        }
    }

    public static void zzg(int i, List list, zzfv zzfvVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzbiv zzbivVar = (zzbiv) zzfvVar.zza;
        int i2 = 0;
        if (!(list instanceof zzbkn)) {
            if (!z) {
                while (i2 < list.size()) {
                    zzbivVar.zzh(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            zzbivVar.zzc(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                i3 += 8;
            }
            zzbivVar.zzs(i3);
            while (i2 < list.size()) {
                zzbivVar.zzv(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zzbkn zzbknVar = (zzbkn) list;
        if (!z) {
            while (i2 < zzbknVar.zzd) {
                zzbivVar.zzh(i, zzbknVar.zze(i2));
                i2++;
            }
            return;
        }
        zzbivVar.zzc(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzbknVar.zzd; i6++) {
            zzbknVar.zze(i6);
            i5 += 8;
        }
        zzbivVar.zzs(i5);
        while (i2 < zzbknVar.zzd) {
            zzbivVar.zzv(zzbknVar.zze(i2));
            i2++;
        }
    }

    public static void zzh(int i, List list, zzfv zzfvVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzbiv zzbivVar = (zzbiv) zzfvVar.zza;
        int i2 = 0;
        if (!(list instanceof zzbjs)) {
            if (!z) {
                while (i2 < list.size()) {
                    zzbivVar.zzd(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            zzbivVar.zzc(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzbiv.zzH(((Integer) list.get(i4)).intValue());
            }
            zzbivVar.zzs(i3);
            while (i2 < list.size()) {
                zzbivVar.zzr(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzbjs zzbjsVar = (zzbjs) list;
        if (!z) {
            while (i2 < zzbjsVar.zzd) {
                zzbivVar.zzd(i, zzbjsVar.zzf(i2));
                i2++;
            }
            return;
        }
        zzbivVar.zzc(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzbjsVar.zzd; i6++) {
            i5 += zzbiv.zzH(zzbjsVar.zzf(i6));
        }
        zzbivVar.zzs(i5);
        while (i2 < zzbjsVar.zzd) {
            zzbivVar.zzr(zzbjsVar.zzf(i2));
            i2++;
        }
    }

    public static void zzi(int i, List list, zzfv zzfvVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzbiv zzbivVar = (zzbiv) zzfvVar.zza;
        int i2 = 0;
        if (!(list instanceof zzbjs)) {
            if (!z) {
                while (i2 < list.size()) {
                    zzbivVar.zze(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            zzbivVar.zzc(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzbiv.zzG(((Integer) list.get(i4)).intValue());
            }
            zzbivVar.zzs(i3);
            while (i2 < list.size()) {
                zzbivVar.zzs(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzbjs zzbjsVar = (zzbjs) list;
        if (!z) {
            while (i2 < zzbjsVar.zzd) {
                zzbivVar.zze(i, zzbjsVar.zzf(i2));
                i2++;
            }
            return;
        }
        zzbivVar.zzc(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzbjsVar.zzd; i6++) {
            i5 += zzbiv.zzG(zzbjsVar.zzf(i6));
        }
        zzbivVar.zzs(i5);
        while (i2 < zzbjsVar.zzd) {
            zzbivVar.zzs(zzbjsVar.zzf(i2));
            i2++;
        }
    }

    public static void zzj(int i, List list, zzfv zzfvVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzbiv zzbivVar = (zzbiv) zzfvVar.zza;
        int i2 = 0;
        if (!(list instanceof zzbjs)) {
            if (!z) {
                while (i2 < list.size()) {
                    int intValue = ((Integer) list.get(i2)).intValue();
                    zzbivVar.zze(i, (intValue >> 31) ^ (intValue + intValue));
                    i2++;
                }
                return;
            }
            zzbivVar.zzc(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                int intValue2 = ((Integer) list.get(i4)).intValue();
                i3 += zzbiv.zzG((intValue2 >> 31) ^ (intValue2 + intValue2));
            }
            zzbivVar.zzs(i3);
            while (i2 < list.size()) {
                int intValue3 = ((Integer) list.get(i2)).intValue();
                zzbivVar.zzs((intValue3 >> 31) ^ (intValue3 + intValue3));
                i2++;
            }
            return;
        }
        zzbjs zzbjsVar = (zzbjs) list;
        if (!z) {
            while (i2 < zzbjsVar.zzd) {
                int zzf = zzbjsVar.zzf(i2);
                zzbivVar.zze(i, (zzf >> 31) ^ (zzf + zzf));
                i2++;
            }
            return;
        }
        zzbivVar.zzc(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzbjsVar.zzd; i6++) {
            int zzf2 = zzbjsVar.zzf(i6);
            i5 += zzbiv.zzG((zzf2 >> 31) ^ (zzf2 + zzf2));
        }
        zzbivVar.zzs(i5);
        while (i2 < zzbjsVar.zzd) {
            int zzf3 = zzbjsVar.zzf(i2);
            zzbivVar.zzs((zzf3 >> 31) ^ (zzf3 + zzf3));
            i2++;
        }
    }

    public static void zzk(int i, List list, zzfv zzfvVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzbiv zzbivVar = (zzbiv) zzfvVar.zza;
        int i2 = 0;
        if (!(list instanceof zzbjs)) {
            if (!z) {
                while (i2 < list.size()) {
                    zzbivVar.zzf(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            zzbivVar.zzc(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            zzbivVar.zzs(i3);
            while (i2 < list.size()) {
                zzbivVar.zzt(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzbjs zzbjsVar = (zzbjs) list;
        if (!z) {
            while (i2 < zzbjsVar.zzd) {
                zzbivVar.zzf(i, zzbjsVar.zzf(i2));
                i2++;
            }
            return;
        }
        zzbivVar.zzc(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzbjsVar.zzd; i6++) {
            zzbjsVar.zzf(i6);
            i5 += 4;
        }
        zzbivVar.zzs(i5);
        while (i2 < zzbjsVar.zzd) {
            zzbivVar.zzt(zzbjsVar.zzf(i2));
            i2++;
        }
    }

    public static void zzl(int i, List list, zzfv zzfvVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzbiv zzbivVar = (zzbiv) zzfvVar.zza;
        int i2 = 0;
        if (!(list instanceof zzbjs)) {
            if (!z) {
                while (i2 < list.size()) {
                    zzbivVar.zzf(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            zzbivVar.zzc(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            zzbivVar.zzs(i3);
            while (i2 < list.size()) {
                zzbivVar.zzt(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzbjs zzbjsVar = (zzbjs) list;
        if (!z) {
            while (i2 < zzbjsVar.zzd) {
                zzbivVar.zzf(i, zzbjsVar.zzf(i2));
                i2++;
            }
            return;
        }
        zzbivVar.zzc(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzbjsVar.zzd; i6++) {
            zzbjsVar.zzf(i6);
            i5 += 4;
        }
        zzbivVar.zzs(i5);
        while (i2 < zzbjsVar.zzd) {
            zzbivVar.zzt(zzbjsVar.zzf(i2));
            i2++;
        }
    }

    public static void zzm(int i, List list, zzfv zzfvVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzbiv zzbivVar = (zzbiv) zzfvVar.zza;
        int i2 = 0;
        if (!(list instanceof zzbjs)) {
            if (!z) {
                while (i2 < list.size()) {
                    zzbivVar.zzd(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            zzbivVar.zzc(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzbiv.zzH(((Integer) list.get(i4)).intValue());
            }
            zzbivVar.zzs(i3);
            while (i2 < list.size()) {
                zzbivVar.zzr(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzbjs zzbjsVar = (zzbjs) list;
        if (!z) {
            while (i2 < zzbjsVar.zzd) {
                zzbivVar.zzd(i, zzbjsVar.zzf(i2));
                i2++;
            }
            return;
        }
        zzbivVar.zzc(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzbjsVar.zzd; i6++) {
            i5 += zzbiv.zzH(zzbjsVar.zzf(i6));
        }
        zzbivVar.zzs(i5);
        while (i2 < zzbjsVar.zzd) {
            zzbivVar.zzr(zzbjsVar.zzf(i2));
            i2++;
        }
    }

    public static void zzn(int i, List list, zzfv zzfvVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzbiv zzbivVar = (zzbiv) zzfvVar.zza;
        if (list instanceof zzbie) {
            a$$ExternalSyntheticBUOutline0.m$1();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                zzbivVar.zzi(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        zzbivVar.zzc(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            i3++;
        }
        zzbivVar.zzs(i3);
        while (i2 < list.size()) {
            zzbivVar.zzq(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static int zzo(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzbkn)) {
            int i2 = 0;
            while (i < size) {
                i2 += zzbiv.zzH(((Long) list.get(i)).longValue());
                i++;
            }
            return i2;
        }
        zzbkn zzbknVar = (zzbkn) list;
        int i3 = 0;
        while (i < size) {
            i3 += zzbiv.zzH(zzbknVar.zze(i));
            i++;
        }
        return i3;
    }

    public static int zzp(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzbkn)) {
            int i2 = 0;
            while (i < size) {
                i2 += zzbiv.zzH(((Long) list.get(i)).longValue());
                i++;
            }
            return i2;
        }
        zzbkn zzbknVar = (zzbkn) list;
        int i3 = 0;
        while (i < size) {
            i3 += zzbiv.zzH(zzbknVar.zze(i));
            i++;
        }
        return i3;
    }

    public static int zzq(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzbkn)) {
            int i2 = 0;
            while (i < size) {
                long longValue = ((Long) list.get(i)).longValue();
                i2 += zzbiv.zzH((longValue >> 63) ^ (longValue + longValue));
                i++;
            }
            return i2;
        }
        zzbkn zzbknVar = (zzbkn) list;
        int i3 = 0;
        while (i < size) {
            long zze = zzbknVar.zze(i);
            i3 += zzbiv.zzH((zze >> 63) ^ (zze + zze));
            i++;
        }
        return i3;
    }

    public static int zzr(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzbjs)) {
            int i2 = 0;
            while (i < size) {
                i2 += zzbiv.zzH(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        zzbjs zzbjsVar = (zzbjs) list;
        int i3 = 0;
        while (i < size) {
            i3 += zzbiv.zzH(zzbjsVar.zzf(i));
            i++;
        }
        return i3;
    }

    public static int zzs(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzbjs)) {
            int i2 = 0;
            while (i < size) {
                i2 += zzbiv.zzH(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        zzbjs zzbjsVar = (zzbjs) list;
        int i3 = 0;
        while (i < size) {
            i3 += zzbiv.zzH(zzbjsVar.zzf(i));
            i++;
        }
        return i3;
    }

    public static int zzt(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzbjs)) {
            int i2 = 0;
            while (i < size) {
                i2 += zzbiv.zzG(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        zzbjs zzbjsVar = (zzbjs) list;
        int i3 = 0;
        while (i < size) {
            i3 += zzbiv.zzG(zzbjsVar.zzf(i));
            i++;
        }
        return i3;
    }

    public static int zzu(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzbjs)) {
            int i2 = 0;
            while (i < size) {
                int intValue = ((Integer) list.get(i)).intValue();
                i2 += zzbiv.zzG((intValue >> 31) ^ (intValue + intValue));
                i++;
            }
            return i2;
        }
        zzbjs zzbjsVar = (zzbjs) list;
        int i3 = 0;
        while (i < size) {
            int zzf = zzbjsVar.zzf(i);
            i3 += zzbiv.zzG((zzf >> 31) ^ (zzf + zzf));
            i++;
        }
        return i3;
    }

    public static int zzw(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzbiv.zzG(i << 3) + 4) * size;
    }

    public static int zzy(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzbiv.zzG(i << 3) + 8) * size;
    }
}
