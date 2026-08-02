package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class zzgg {
    public static final zzea zzb;

    static {
        zzfu zzfuVar = zzfu.zzb;
        zzb = new zzea(6);
    }

    public static void zzA(int i, List list, zzfe zzfeVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzdk zzdkVar = (zzdk) zzfeVar.zzb;
        int i2 = 0;
        if (!(list instanceof zzei)) {
            if (!z) {
                while (i2 < list.size()) {
                    int intValue = ((Integer) list.get(i2)).intValue();
                    zzdkVar.zzs(i, (intValue >> 31) ^ (intValue + intValue));
                    i2++;
                }
                return;
            }
            zzdkVar.zzr(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                int intValue2 = ((Integer) list.get(i4)).intValue();
                i3 += zzdk.zzA((intValue2 >> 31) ^ (intValue2 + intValue2));
            }
            zzdkVar.zzt(i3);
            while (i2 < list.size()) {
                int intValue3 = ((Integer) list.get(i2)).intValue();
                zzdkVar.zzt((intValue3 >> 31) ^ (intValue3 + intValue3));
                i2++;
            }
            return;
        }
        zzei zzeiVar = (zzei) list;
        if (!z) {
            while (i2 < zzeiVar.zzc) {
                int zze = zzeiVar.zze(i2);
                zzdkVar.zzs(i, (zze >> 31) ^ (zze + zze));
                i2++;
            }
            return;
        }
        zzdkVar.zzr(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzeiVar.zzc; i6++) {
            int zze2 = zzeiVar.zze(i6);
            i5 += zzdk.zzA((zze2 >> 31) ^ (zze2 + zze2));
        }
        zzdkVar.zzt(i5);
        while (i2 < zzeiVar.zzc) {
            int zze3 = zzeiVar.zze(i2);
            zzdkVar.zzt((zze3 >> 31) ^ (zze3 + zze3));
            i2++;
        }
    }

    public static void zzB(int i, List list, zzfe zzfeVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzdk zzdkVar = (zzdk) zzfeVar.zzb;
        if (list instanceof zzfb) {
            a$$ExternalSyntheticBUOutline0.m$1();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long longValue = ((Long) list.get(i2)).longValue();
                zzdkVar.zzu(i, (longValue >> 63) ^ (longValue + longValue));
                i2++;
            }
            return;
        }
        zzdkVar.zzr(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            long longValue2 = ((Long) list.get(i4)).longValue();
            i3 += zzdk.zzB((longValue2 >> 63) ^ (longValue2 + longValue2));
        }
        zzdkVar.zzt(i3);
        while (i2 < list.size()) {
            long longValue3 = ((Long) list.get(i2)).longValue();
            zzdkVar.zzv((longValue3 >> 63) ^ (longValue3 + longValue3));
            i2++;
        }
    }

    public static void zzC(int i, List list, zzfe zzfeVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzdk zzdkVar = (zzdk) zzfeVar.zzb;
        int i2 = 0;
        if (!(list instanceof zzei)) {
            if (!z) {
                while (i2 < list.size()) {
                    zzdkVar.zzs(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            zzdkVar.zzr(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzdk.zzA(((Integer) list.get(i4)).intValue());
            }
            zzdkVar.zzt(i3);
            while (i2 < list.size()) {
                zzdkVar.zzt(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzei zzeiVar = (zzei) list;
        if (!z) {
            while (i2 < zzeiVar.zzc) {
                zzdkVar.zzs(i, zzeiVar.zze(i2));
                i2++;
            }
            return;
        }
        zzdkVar.zzr(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzeiVar.zzc; i6++) {
            i5 += zzdk.zzA(zzeiVar.zze(i6));
        }
        zzdkVar.zzt(i5);
        while (i2 < zzeiVar.zzc) {
            zzdkVar.zzt(zzeiVar.zze(i2));
            i2++;
        }
    }

    public static void zzD(int i, List list, zzfe zzfeVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzdk zzdkVar = (zzdk) zzfeVar.zzb;
        if (list instanceof zzfb) {
            a$$ExternalSyntheticBUOutline0.m$1();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                zzdkVar.zzu(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zzdkVar.zzr(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += zzdk.zzB(((Long) list.get(i4)).longValue());
        }
        zzdkVar.zzt(i3);
        while (i2 < list.size()) {
            zzdkVar.zzv(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static boolean zzE(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int zza(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzei)) {
            int i2 = 0;
            while (i < size) {
                i2 += zzdk.zzB(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        zzei zzeiVar = (zzei) list;
        int i3 = 0;
        while (i < size) {
            i3 += zzdk.zzB(zzeiVar.zze(i));
            i++;
        }
        return i3;
    }

    public static int zzb(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzdk.zzA(i << 3) + 4) * size;
    }

    public static int zzd(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzdk.zzA(i << 3) + 8) * size;
    }

    public static int zzf(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzei)) {
            int i2 = 0;
            while (i < size) {
                i2 += zzdk.zzB(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        zzei zzeiVar = (zzei) list;
        int i3 = 0;
        while (i < size) {
            i3 += zzdk.zzB(zzeiVar.zze(i));
            i++;
        }
        return i3;
    }

    public static int zzg(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzfb) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += zzdk.zzB(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    public static int zzi(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzei)) {
            int i2 = 0;
            while (i < size) {
                int intValue = ((Integer) list.get(i)).intValue();
                i2 += zzdk.zzA((intValue >> 31) ^ (intValue + intValue));
                i++;
            }
            return i2;
        }
        zzei zzeiVar = (zzei) list;
        int i3 = 0;
        while (i < size) {
            int zze = zzeiVar.zze(i);
            i3 += zzdk.zzA((zze >> 31) ^ (zze + zze));
            i++;
        }
        return i3;
    }

    public static int zzj(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzfb) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            long longValue = ((Long) list.get(i2)).longValue();
            i += zzdk.zzB((longValue >> 63) ^ (longValue + longValue));
        }
        return i;
    }

    public static int zzk(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzei)) {
            int i2 = 0;
            while (i < size) {
                i2 += zzdk.zzA(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        zzei zzeiVar = (zzei) list;
        int i3 = 0;
        while (i < size) {
            i3 += zzdk.zzA(zzeiVar.zze(i));
            i++;
        }
        return i3;
    }

    public static int zzl(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzfb) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += zzdk.zzB(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    public static void zzo(Object obj, Object obj2) {
        zzgh zzghVar = ((zzed) obj2).zzb.zza;
        if (zzghVar.isEmpty()) {
            return;
        }
        zzed zzedVar = (zzed) obj;
        zzdx zzdxVar = zzedVar.zzb;
        if (zzdxVar.zzc) {
            zzedVar.zzb = zzdxVar.clone();
        }
        zzdx zzdxVar2 = zzedVar.zzb;
        zzdxVar2.getClass();
        int i = zzghVar.zzb;
        for (int i2 = 0; i2 < i; i2++) {
            zzdxVar2.zzm(zzghVar.zzg(i2));
        }
        Iterator it = zzghVar.zzd().iterator();
        while (it.hasNext()) {
            zzdxVar2.zzm((Map.Entry) it.next());
        }
    }

    public static void zzp(Object obj, Object obj2) {
        zzeh zzehVar = (zzeh) obj;
        zzgt zzgtVar = zzehVar.zzc;
        zzgt zzgtVar2 = ((zzeh) obj2).zzc;
        zzgt zzgtVar3 = zzgt.zza;
        if (!zzgtVar3.equals(zzgtVar2)) {
            if (zzgtVar3.equals(zzgtVar)) {
                int i = zzgtVar.zzb + zzgtVar2.zzb;
                int[] copyOf = Arrays.copyOf(zzgtVar.zzc, i);
                System.arraycopy(zzgtVar2.zzc, 0, copyOf, zzgtVar.zzb, zzgtVar2.zzb);
                Object[] copyOf2 = Arrays.copyOf(zzgtVar.zzd, i);
                System.arraycopy(zzgtVar2.zzd, 0, copyOf2, zzgtVar.zzb, zzgtVar2.zzb);
                zzgtVar = new zzgt(i, copyOf, copyOf2, true);
            } else {
                zzgtVar.getClass();
                if (!zzgtVar2.equals(zzgtVar3)) {
                    if (!zzgtVar.zzf) {
                        OptionalProvider$$ExternalSyntheticLambda0.m();
                        return;
                    }
                    int i2 = zzgtVar.zzb + zzgtVar2.zzb;
                    zzgtVar.zzm(i2);
                    System.arraycopy(zzgtVar2.zzc, 0, zzgtVar.zzc, zzgtVar.zzb, zzgtVar2.zzb);
                    System.arraycopy(zzgtVar2.zzd, 0, zzgtVar.zzd, zzgtVar.zzb, zzgtVar2.zzb);
                    zzgtVar.zzb = i2;
                }
            }
        }
        zzehVar.zzc = zzgtVar;
    }

    public static void zzq(int i, List list, zzfe zzfeVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzdk zzdkVar = (zzdk) zzfeVar.zzb;
        if (list instanceof zzcw) {
            a$$ExternalSyntheticBUOutline0.m$1();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                boolean booleanValue = ((Boolean) list.get(i2)).booleanValue();
                zzdkVar.zzt(i << 3);
                zzdkVar.zzb(booleanValue ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        zzdkVar.zzr(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            i3++;
        }
        zzdkVar.zzt(i3);
        while (i2 < list.size()) {
            zzdkVar.zzb(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static void zzr(int i, List list, zzfe zzfeVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzdk zzdkVar = (zzdk) zzfeVar.zzb;
        if (list instanceof zzdp) {
            a$$ExternalSyntheticBUOutline0.m$1();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                zzdkVar.zzh(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        zzdkVar.zzr(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            i3 += 8;
        }
        zzdkVar.zzt(i3);
        while (i2 < list.size()) {
            zzdkVar.zzi(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void zzs(int i, List list, zzfe zzfeVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzdk zzdkVar = (zzdk) zzfeVar.zzb;
        int i2 = 0;
        if (!(list instanceof zzei)) {
            if (!z) {
                while (i2 < list.size()) {
                    zzdkVar.zzj(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            zzdkVar.zzr(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzdk.zzB(((Integer) list.get(i4)).intValue());
            }
            zzdkVar.zzt(i3);
            while (i2 < list.size()) {
                zzdkVar.zzk(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzei zzeiVar = (zzei) list;
        if (!z) {
            while (i2 < zzeiVar.zzc) {
                zzdkVar.zzj(i, zzeiVar.zze(i2));
                i2++;
            }
            return;
        }
        zzdkVar.zzr(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzeiVar.zzc; i6++) {
            i5 += zzdk.zzB(zzeiVar.zze(i6));
        }
        zzdkVar.zzt(i5);
        while (i2 < zzeiVar.zzc) {
            zzdkVar.zzk(zzeiVar.zze(i2));
            i2++;
        }
    }

    public static void zzt(int i, List list, zzfe zzfeVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzdk zzdkVar = (zzdk) zzfeVar.zzb;
        int i2 = 0;
        if (!(list instanceof zzei)) {
            if (!z) {
                while (i2 < list.size()) {
                    zzdkVar.zzf(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            zzdkVar.zzr(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            zzdkVar.zzt(i3);
            while (i2 < list.size()) {
                zzdkVar.zzg(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzei zzeiVar = (zzei) list;
        if (!z) {
            while (i2 < zzeiVar.zzc) {
                zzdkVar.zzf(i, zzeiVar.zze(i2));
                i2++;
            }
            return;
        }
        zzdkVar.zzr(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzeiVar.zzc; i6++) {
            zzeiVar.zze(i6);
            i5 += 4;
        }
        zzdkVar.zzt(i5);
        while (i2 < zzeiVar.zzc) {
            zzdkVar.zzg(zzeiVar.zze(i2));
            i2++;
        }
    }

    public static void zzu(int i, List list, zzfe zzfeVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzdk zzdkVar = (zzdk) zzfeVar.zzb;
        if (list instanceof zzfb) {
            a$$ExternalSyntheticBUOutline0.m$1();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                zzdkVar.zzh(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zzdkVar.zzr(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        zzdkVar.zzt(i3);
        while (i2 < list.size()) {
            zzdkVar.zzi(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void zzv(int i, List list, zzfe zzfeVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzdk zzdkVar = (zzdk) zzfeVar.zzb;
        int i2 = 0;
        if (!(list instanceof zzdz)) {
            if (!z) {
                while (i2 < list.size()) {
                    zzdkVar.zzf(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                    i2++;
                }
                return;
            }
            zzdkVar.zzr(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Float) list.get(i4)).getClass();
                i3 += 4;
            }
            zzdkVar.zzt(i3);
            while (i2 < list.size()) {
                zzdkVar.zzg(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        zzdz zzdzVar = (zzdz) list;
        if (!z) {
            while (i2 < zzdzVar.zzc) {
                zzdzVar.zzj(i2);
                zzdkVar.zzf(i, Float.floatToRawIntBits(zzdzVar.zzb[i2]));
                i2++;
            }
            return;
        }
        zzdkVar.zzr(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzdzVar.zzc; i6++) {
            zzdzVar.zzj(i6);
            float f = zzdzVar.zzb[i6];
            i5 += 4;
        }
        zzdkVar.zzt(i5);
        while (i2 < zzdzVar.zzc) {
            zzdzVar.zzj(i2);
            zzdkVar.zzg(Float.floatToRawIntBits(zzdzVar.zzb[i2]));
            i2++;
        }
    }

    public static void zzw(int i, List list, zzfe zzfeVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzdk zzdkVar = (zzdk) zzfeVar.zzb;
        int i2 = 0;
        if (!(list instanceof zzei)) {
            if (!z) {
                while (i2 < list.size()) {
                    zzdkVar.zzj(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            zzdkVar.zzr(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzdk.zzB(((Integer) list.get(i4)).intValue());
            }
            zzdkVar.zzt(i3);
            while (i2 < list.size()) {
                zzdkVar.zzk(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzei zzeiVar = (zzei) list;
        if (!z) {
            while (i2 < zzeiVar.zzc) {
                zzdkVar.zzj(i, zzeiVar.zze(i2));
                i2++;
            }
            return;
        }
        zzdkVar.zzr(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzeiVar.zzc; i6++) {
            i5 += zzdk.zzB(zzeiVar.zze(i6));
        }
        zzdkVar.zzt(i5);
        while (i2 < zzeiVar.zzc) {
            zzdkVar.zzk(zzeiVar.zze(i2));
            i2++;
        }
    }

    public static void zzx(int i, List list, zzfe zzfeVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzdk zzdkVar = (zzdk) zzfeVar.zzb;
        if (list instanceof zzfb) {
            a$$ExternalSyntheticBUOutline0.m$1();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                zzdkVar.zzu(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zzdkVar.zzr(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += zzdk.zzB(((Long) list.get(i4)).longValue());
        }
        zzdkVar.zzt(i3);
        while (i2 < list.size()) {
            zzdkVar.zzv(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void zzy(int i, List list, zzfe zzfeVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzdk zzdkVar = (zzdk) zzfeVar.zzb;
        int i2 = 0;
        if (!(list instanceof zzei)) {
            if (!z) {
                while (i2 < list.size()) {
                    zzdkVar.zzf(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            zzdkVar.zzr(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            zzdkVar.zzt(i3);
            while (i2 < list.size()) {
                zzdkVar.zzg(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzei zzeiVar = (zzei) list;
        if (!z) {
            while (i2 < zzeiVar.zzc) {
                zzdkVar.zzf(i, zzeiVar.zze(i2));
                i2++;
            }
            return;
        }
        zzdkVar.zzr(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzeiVar.zzc; i6++) {
            zzeiVar.zze(i6);
            i5 += 4;
        }
        zzdkVar.zzt(i5);
        while (i2 < zzeiVar.zzc) {
            zzdkVar.zzg(zzeiVar.zze(i2));
            i2++;
        }
    }

    public static void zzz(int i, List list, zzfe zzfeVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzdk zzdkVar = (zzdk) zzfeVar.zzb;
        if (list instanceof zzfb) {
            a$$ExternalSyntheticBUOutline0.m$1();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                zzdkVar.zzh(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zzdkVar.zzr(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        zzdkVar.zzt(i3);
        while (i2 < list.size()) {
            zzdkVar.zzi(((Long) list.get(i2)).longValue());
            i2++;
        }
    }
}
