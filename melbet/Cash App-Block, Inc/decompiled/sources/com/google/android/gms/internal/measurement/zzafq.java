package com.google.android.gms.internal.measurement;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class zzafq {
    public static final zztw zzb;

    static {
        int i = zzacf.$r8$clinit;
        zzb = new zztw(2);
    }

    public static boolean zzC(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void zzE(Object obj, Object obj2) {
        zzadu zzaduVar = (zzadu) obj;
        zzaga zzagaVar = zzaduVar.zzc;
        zzaga zzagaVar2 = ((zzadu) obj2).zzc;
        zzaga zzagaVar3 = zzaga.zza;
        if (!zzagaVar3.equals(zzagaVar2)) {
            if (zzagaVar3.equals(zzagaVar)) {
                int i = zzagaVar.zzb + zzagaVar2.zzb;
                int[] copyOf = Arrays.copyOf(zzagaVar.zzc, i);
                System.arraycopy(zzagaVar2.zzc, 0, copyOf, zzagaVar.zzb, zzagaVar2.zzb);
                Object[] copyOf2 = Arrays.copyOf(zzagaVar.zzd, i);
                System.arraycopy(zzagaVar2.zzd, 0, copyOf2, zzagaVar.zzb, zzagaVar2.zzb);
                zzagaVar = new zzaga(i, copyOf, copyOf2, true);
            } else {
                zzagaVar.getClass();
                if (!zzagaVar2.equals(zzagaVar3)) {
                    if (!zzagaVar.zzf) {
                        OptionalProvider$$ExternalSyntheticLambda0.m();
                        return;
                    }
                    int i2 = zzagaVar.zzb + zzagaVar2.zzb;
                    zzagaVar.zzm(i2);
                    System.arraycopy(zzagaVar2.zzc, 0, zzagaVar.zzc, zzagaVar.zzb, zzagaVar2.zzb);
                    System.arraycopy(zzagaVar2.zzd, 0, zzagaVar.zzd, zzagaVar.zzb, zzagaVar2.zzb);
                    zzagaVar.zzb = i2;
                }
            }
        }
        zzaduVar.zzc = zzagaVar;
    }

    public static Object zzF(Object obj, int i, zzaef zzaefVar, zzfj zzfjVar, Object obj2, zztw zztwVar) {
        if (zzfjVar == null) {
            return obj2;
        }
        if (zzaefVar == null) {
            Iterator it = zzaefVar.iterator();
            while (it.hasNext()) {
                int intValue = ((Integer) it.next()).intValue();
                if (!zzfjVar.zza(intValue)) {
                    if (obj2 == null) {
                        zztwVar.getClass();
                        obj2 = zztw.zzh(obj);
                    }
                    zztwVar.getClass();
                    ((zzaga) obj2).zzk(i << 3, Long.valueOf(intValue));
                    it.remove();
                }
            }
            return obj2;
        }
        int size = zzaefVar.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Integer num = (Integer) zzaefVar.get(i3);
            int intValue2 = num.intValue();
            if (zzfjVar.zza(intValue2)) {
                if (i3 != i2) {
                    zzaefVar.set(i2, num);
                }
                i2++;
            } else {
                if (obj2 == null) {
                    zztwVar.getClass();
                    obj2 = zztw.zzh(obj);
                }
                zztwVar.getClass();
                ((zzaga) obj2).zzk(i << 3, Long.valueOf(intValue2));
            }
        }
        if (i2 != size) {
            zzaefVar.subList(i2, size).clear();
        }
        return obj2;
    }

    public static void zza(int i, List list, zzj zzjVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzada zzadaVar = (zzada) zzjVar.f64zza;
        if (list instanceof zzadc) {
            a$$ExternalSyntheticBUOutline0.m$1();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                zzadaVar.zzg(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        zzadaVar.zzb(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            i3 += 8;
        }
        zzadaVar.zzr(i3);
        while (i2 < list.size()) {
            zzadaVar.zzu(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void zzb(int i, List list, zzj zzjVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzada zzadaVar = (zzada) zzjVar.f64zza;
        if (list instanceof zzadm) {
            a$$ExternalSyntheticBUOutline0.m$1();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                zzadaVar.zze(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        zzadaVar.zzb(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            i3 += 4;
        }
        zzadaVar.zzr(i3);
        while (i2 < list.size()) {
            zzadaVar.zzs(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public static void zzc(int i, List list, zzj zzjVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzada zzadaVar = (zzada) zzjVar.f64zza;
        int i2 = 0;
        if (!(list instanceof zzaeq)) {
            if (!z) {
                while (i2 < list.size()) {
                    zzadaVar.zzf(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            zzadaVar.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzada.zzF(((Long) list.get(i4)).longValue());
            }
            zzadaVar.zzr(i3);
            while (i2 < list.size()) {
                zzadaVar.zzt(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zzaeq zzaeqVar = (zzaeq) list;
        if (!z) {
            while (i2 < zzaeqVar.zzd) {
                zzadaVar.zzf(i, zzaeqVar.zzc(i2));
                i2++;
            }
            return;
        }
        zzadaVar.zzb(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzaeqVar.zzd; i6++) {
            i5 += zzada.zzF(zzaeqVar.zzc(i6));
        }
        zzadaVar.zzr(i5);
        while (i2 < zzaeqVar.zzd) {
            zzadaVar.zzt(zzaeqVar.zzc(i2));
            i2++;
        }
    }

    public static void zzd(int i, List list, zzj zzjVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzada zzadaVar = (zzada) zzjVar.f64zza;
        int i2 = 0;
        if (!(list instanceof zzaeq)) {
            if (!z) {
                while (i2 < list.size()) {
                    zzadaVar.zzf(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            zzadaVar.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzada.zzF(((Long) list.get(i4)).longValue());
            }
            zzadaVar.zzr(i3);
            while (i2 < list.size()) {
                zzadaVar.zzt(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zzaeq zzaeqVar = (zzaeq) list;
        if (!z) {
            while (i2 < zzaeqVar.zzd) {
                zzadaVar.zzf(i, zzaeqVar.zzc(i2));
                i2++;
            }
            return;
        }
        zzadaVar.zzb(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzaeqVar.zzd; i6++) {
            i5 += zzada.zzF(zzaeqVar.zzc(i6));
        }
        zzadaVar.zzr(i5);
        while (i2 < zzaeqVar.zzd) {
            zzadaVar.zzt(zzaeqVar.zzc(i2));
            i2++;
        }
    }

    public static void zze(int i, List list, zzj zzjVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzada zzadaVar = (zzada) zzjVar.f64zza;
        int i2 = 0;
        if (!(list instanceof zzaeq)) {
            if (!z) {
                while (i2 < list.size()) {
                    long longValue = ((Long) list.get(i2)).longValue();
                    zzadaVar.zzf(i, (longValue >> 63) ^ (longValue + longValue));
                    i2++;
                }
                return;
            }
            zzadaVar.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                long longValue2 = ((Long) list.get(i4)).longValue();
                i3 += zzada.zzF((longValue2 >> 63) ^ (longValue2 + longValue2));
            }
            zzadaVar.zzr(i3);
            while (i2 < list.size()) {
                long longValue3 = ((Long) list.get(i2)).longValue();
                zzadaVar.zzt((longValue3 >> 63) ^ (longValue3 + longValue3));
                i2++;
            }
            return;
        }
        zzaeq zzaeqVar = (zzaeq) list;
        if (!z) {
            while (i2 < zzaeqVar.zzd) {
                long zzc = zzaeqVar.zzc(i2);
                zzadaVar.zzf(i, (zzc >> 63) ^ (zzc + zzc));
                i2++;
            }
            return;
        }
        zzadaVar.zzb(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzaeqVar.zzd; i6++) {
            long zzc2 = zzaeqVar.zzc(i6);
            i5 += zzada.zzF((zzc2 >> 63) ^ (zzc2 + zzc2));
        }
        zzadaVar.zzr(i5);
        while (i2 < zzaeqVar.zzd) {
            long zzc3 = zzaeqVar.zzc(i2);
            zzadaVar.zzt((zzc3 >> 63) ^ (zzc3 + zzc3));
            i2++;
        }
    }

    public static void zzf(int i, List list, zzj zzjVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzada zzadaVar = (zzada) zzjVar.f64zza;
        int i2 = 0;
        if (!(list instanceof zzaeq)) {
            if (!z) {
                while (i2 < list.size()) {
                    zzadaVar.zzg(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            zzadaVar.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                i3 += 8;
            }
            zzadaVar.zzr(i3);
            while (i2 < list.size()) {
                zzadaVar.zzu(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zzaeq zzaeqVar = (zzaeq) list;
        if (!z) {
            while (i2 < zzaeqVar.zzd) {
                zzadaVar.zzg(i, zzaeqVar.zzc(i2));
                i2++;
            }
            return;
        }
        zzadaVar.zzb(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzaeqVar.zzd; i6++) {
            zzaeqVar.zzc(i6);
            i5 += 8;
        }
        zzadaVar.zzr(i5);
        while (i2 < zzaeqVar.zzd) {
            zzadaVar.zzu(zzaeqVar.zzc(i2));
            i2++;
        }
    }

    public static void zzg(int i, List list, zzj zzjVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzada zzadaVar = (zzada) zzjVar.f64zza;
        int i2 = 0;
        if (!(list instanceof zzaeq)) {
            if (!z) {
                while (i2 < list.size()) {
                    zzadaVar.zzg(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            zzadaVar.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                i3 += 8;
            }
            zzadaVar.zzr(i3);
            while (i2 < list.size()) {
                zzadaVar.zzu(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zzaeq zzaeqVar = (zzaeq) list;
        if (!z) {
            while (i2 < zzaeqVar.zzd) {
                zzadaVar.zzg(i, zzaeqVar.zzc(i2));
                i2++;
            }
            return;
        }
        zzadaVar.zzb(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzaeqVar.zzd; i6++) {
            zzaeqVar.zzc(i6);
            i5 += 8;
        }
        zzadaVar.zzr(i5);
        while (i2 < zzaeqVar.zzd) {
            zzadaVar.zzu(zzaeqVar.zzc(i2));
            i2++;
        }
    }

    public static void zzh(int i, List list, zzj zzjVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzada zzadaVar = (zzada) zzjVar.f64zza;
        int i2 = 0;
        if (!(list instanceof zzadv)) {
            if (!z) {
                while (i2 < list.size()) {
                    zzadaVar.zzc(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            zzadaVar.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzada.zzF(((Integer) list.get(i4)).intValue());
            }
            zzadaVar.zzr(i3);
            while (i2 < list.size()) {
                zzadaVar.zzq(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzadv zzadvVar = (zzadv) list;
        if (!z) {
            while (i2 < zzadvVar.zzd) {
                zzadaVar.zzc(i, zzadvVar.zzf(i2));
                i2++;
            }
            return;
        }
        zzadaVar.zzb(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzadvVar.zzd; i6++) {
            i5 += zzada.zzF(zzadvVar.zzf(i6));
        }
        zzadaVar.zzr(i5);
        while (i2 < zzadvVar.zzd) {
            zzadaVar.zzq(zzadvVar.zzf(i2));
            i2++;
        }
    }

    public static void zzi(int i, List list, zzj zzjVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzada zzadaVar = (zzada) zzjVar.f64zza;
        int i2 = 0;
        if (!(list instanceof zzadv)) {
            if (!z) {
                while (i2 < list.size()) {
                    zzadaVar.zzd(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            zzadaVar.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzada.zzE(((Integer) list.get(i4)).intValue());
            }
            zzadaVar.zzr(i3);
            while (i2 < list.size()) {
                zzadaVar.zzr(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzadv zzadvVar = (zzadv) list;
        if (!z) {
            while (i2 < zzadvVar.zzd) {
                zzadaVar.zzd(i, zzadvVar.zzf(i2));
                i2++;
            }
            return;
        }
        zzadaVar.zzb(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzadvVar.zzd; i6++) {
            i5 += zzada.zzE(zzadvVar.zzf(i6));
        }
        zzadaVar.zzr(i5);
        while (i2 < zzadvVar.zzd) {
            zzadaVar.zzr(zzadvVar.zzf(i2));
            i2++;
        }
    }

    public static void zzj(int i, List list, zzj zzjVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzada zzadaVar = (zzada) zzjVar.f64zza;
        int i2 = 0;
        if (!(list instanceof zzadv)) {
            if (!z) {
                while (i2 < list.size()) {
                    int intValue = ((Integer) list.get(i2)).intValue();
                    zzadaVar.zzd(i, (intValue >> 31) ^ (intValue + intValue));
                    i2++;
                }
                return;
            }
            zzadaVar.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                int intValue2 = ((Integer) list.get(i4)).intValue();
                i3 += zzada.zzE((intValue2 >> 31) ^ (intValue2 + intValue2));
            }
            zzadaVar.zzr(i3);
            while (i2 < list.size()) {
                int intValue3 = ((Integer) list.get(i2)).intValue();
                zzadaVar.zzr((intValue3 >> 31) ^ (intValue3 + intValue3));
                i2++;
            }
            return;
        }
        zzadv zzadvVar = (zzadv) list;
        if (!z) {
            while (i2 < zzadvVar.zzd) {
                int zzf = zzadvVar.zzf(i2);
                zzadaVar.zzd(i, (zzf >> 31) ^ (zzf + zzf));
                i2++;
            }
            return;
        }
        zzadaVar.zzb(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzadvVar.zzd; i6++) {
            int zzf2 = zzadvVar.zzf(i6);
            i5 += zzada.zzE((zzf2 >> 31) ^ (zzf2 + zzf2));
        }
        zzadaVar.zzr(i5);
        while (i2 < zzadvVar.zzd) {
            int zzf3 = zzadvVar.zzf(i2);
            zzadaVar.zzr((zzf3 >> 31) ^ (zzf3 + zzf3));
            i2++;
        }
    }

    public static void zzk(int i, List list, zzj zzjVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzada zzadaVar = (zzada) zzjVar.f64zza;
        int i2 = 0;
        if (!(list instanceof zzadv)) {
            if (!z) {
                while (i2 < list.size()) {
                    zzadaVar.zze(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            zzadaVar.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            zzadaVar.zzr(i3);
            while (i2 < list.size()) {
                zzadaVar.zzs(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzadv zzadvVar = (zzadv) list;
        if (!z) {
            while (i2 < zzadvVar.zzd) {
                zzadaVar.zze(i, zzadvVar.zzf(i2));
                i2++;
            }
            return;
        }
        zzadaVar.zzb(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzadvVar.zzd; i6++) {
            zzadvVar.zzf(i6);
            i5 += 4;
        }
        zzadaVar.zzr(i5);
        while (i2 < zzadvVar.zzd) {
            zzadaVar.zzs(zzadvVar.zzf(i2));
            i2++;
        }
    }

    public static void zzl(int i, List list, zzj zzjVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzada zzadaVar = (zzada) zzjVar.f64zza;
        int i2 = 0;
        if (!(list instanceof zzadv)) {
            if (!z) {
                while (i2 < list.size()) {
                    zzadaVar.zze(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            zzadaVar.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            zzadaVar.zzr(i3);
            while (i2 < list.size()) {
                zzadaVar.zzs(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzadv zzadvVar = (zzadv) list;
        if (!z) {
            while (i2 < zzadvVar.zzd) {
                zzadaVar.zze(i, zzadvVar.zzf(i2));
                i2++;
            }
            return;
        }
        zzadaVar.zzb(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzadvVar.zzd; i6++) {
            zzadvVar.zzf(i6);
            i5 += 4;
        }
        zzadaVar.zzr(i5);
        while (i2 < zzadvVar.zzd) {
            zzadaVar.zzs(zzadvVar.zzf(i2));
            i2++;
        }
    }

    public static void zzm(int i, List list, zzj zzjVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzada zzadaVar = (zzada) zzjVar.f64zza;
        int i2 = 0;
        if (!(list instanceof zzadv)) {
            if (!z) {
                while (i2 < list.size()) {
                    zzadaVar.zzc(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            zzadaVar.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzada.zzF(((Integer) list.get(i4)).intValue());
            }
            zzadaVar.zzr(i3);
            while (i2 < list.size()) {
                zzadaVar.zzq(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzadv zzadvVar = (zzadv) list;
        if (!z) {
            while (i2 < zzadvVar.zzd) {
                zzadaVar.zzc(i, zzadvVar.zzf(i2));
                i2++;
            }
            return;
        }
        zzadaVar.zzb(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzadvVar.zzd; i6++) {
            i5 += zzada.zzF(zzadvVar.zzf(i6));
        }
        zzadaVar.zzr(i5);
        while (i2 < zzadvVar.zzd) {
            zzadaVar.zzq(zzadvVar.zzf(i2));
            i2++;
        }
    }

    public static void zzn(int i, List list, zzj zzjVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzada zzadaVar = (zzada) zzjVar.f64zza;
        if (list instanceof zzaci) {
            a$$ExternalSyntheticBUOutline0.m$1();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                zzadaVar.zzh(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        zzadaVar.zzb(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            i3++;
        }
        zzadaVar.zzr(i3);
        while (i2 < list.size()) {
            zzadaVar.zzp(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static int zzo(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzaeq)) {
            int i2 = 0;
            while (i < size) {
                i2 += zzada.zzF(((Long) list.get(i)).longValue());
                i++;
            }
            return i2;
        }
        zzaeq zzaeqVar = (zzaeq) list;
        int i3 = 0;
        while (i < size) {
            i3 += zzada.zzF(zzaeqVar.zzc(i));
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
        if (!(list instanceof zzaeq)) {
            int i2 = 0;
            while (i < size) {
                i2 += zzada.zzF(((Long) list.get(i)).longValue());
                i++;
            }
            return i2;
        }
        zzaeq zzaeqVar = (zzaeq) list;
        int i3 = 0;
        while (i < size) {
            i3 += zzada.zzF(zzaeqVar.zzc(i));
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
        if (!(list instanceof zzaeq)) {
            int i2 = 0;
            while (i < size) {
                long longValue = ((Long) list.get(i)).longValue();
                i2 += zzada.zzF((longValue >> 63) ^ (longValue + longValue));
                i++;
            }
            return i2;
        }
        zzaeq zzaeqVar = (zzaeq) list;
        int i3 = 0;
        while (i < size) {
            long zzc = zzaeqVar.zzc(i);
            i3 += zzada.zzF((zzc >> 63) ^ (zzc + zzc));
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
        if (!(list instanceof zzadv)) {
            int i2 = 0;
            while (i < size) {
                i2 += zzada.zzF(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        zzadv zzadvVar = (zzadv) list;
        int i3 = 0;
        while (i < size) {
            i3 += zzada.zzF(zzadvVar.zzf(i));
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
        if (!(list instanceof zzadv)) {
            int i2 = 0;
            while (i < size) {
                i2 += zzada.zzF(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        zzadv zzadvVar = (zzadv) list;
        int i3 = 0;
        while (i < size) {
            i3 += zzada.zzF(zzadvVar.zzf(i));
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
        if (!(list instanceof zzadv)) {
            int i2 = 0;
            while (i < size) {
                i2 += zzada.zzE(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        zzadv zzadvVar = (zzadv) list;
        int i3 = 0;
        while (i < size) {
            i3 += zzada.zzE(zzadvVar.zzf(i));
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
        if (!(list instanceof zzadv)) {
            int i2 = 0;
            while (i < size) {
                int intValue = ((Integer) list.get(i)).intValue();
                i2 += zzada.zzE((intValue >> 31) ^ (intValue + intValue));
                i++;
            }
            return i2;
        }
        zzadv zzadvVar = (zzadv) list;
        int i3 = 0;
        while (i < size) {
            int zzf = zzadvVar.zzf(i);
            i3 += zzada.zzE((zzf >> 31) ^ (zzf + zzf));
            i++;
        }
        return i3;
    }

    public static int zzw(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzada.zzE(i << 3) + 4) * size;
    }

    public static int zzy(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzada.zzE(i << 3) + 8) * size;
    }
}
