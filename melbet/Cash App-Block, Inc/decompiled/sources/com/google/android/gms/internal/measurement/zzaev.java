package com.google.android.gms.internal.measurement;

import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;

/* loaded from: classes4.dex */
public final class zzaev {
    public final com.google.android.gms.maps.zzah zza;

    public zzaev(zzagm zzagmVar, zzagm zzagmVar2, Object obj) {
        this.zza = new com.google.android.gms.maps.zzah(3, zzagmVar, zzagmVar2, obj);
    }

    public static void zzb(zzada zzadaVar, com.google.android.gms.maps.zzah zzahVar, Object obj, Object obj2) {
        zzadk.zzf(zzadaVar, (zzagm) zzahVar.f68zza, 1, obj);
        zzadk.zzf(zzadaVar, (zzagm) zzahVar.zzb, 2, obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0208  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int zzc(com.google.android.gms.maps.zzah zzahVar, Object obj, Object obj2) {
        int zzF;
        int zzb;
        int zzE;
        int zzb2;
        int zzE2;
        zzagm zzagmVar = (zzagm) zzahVar.f68zza;
        zzagm zzagmVar2 = (zzagm) zzahVar.zzb;
        int i = zzadk.$r8$clinit;
        int i2 = 8;
        int zzE3 = zzada.zzE(8);
        zzagm zzagmVar3 = zzagm.zzj;
        if (zzagmVar == zzagmVar3) {
            zzE3 += zzE3;
        }
        zzagn zzagnVar = zzagn.zza;
        switch (zzagmVar.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                zzF = 8;
                int i3 = zzF + zzE3;
                int zzE4 = zzada.zzE(16);
                if (zzagmVar2 == zzagmVar3) {
                    zzE4 += zzE4;
                }
                switch (zzagmVar2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        break;
                    case 1:
                        ((Float) obj2).getClass();
                        i2 = 4;
                        break;
                    case 2:
                        i2 = zzada.zzF(((Long) obj2).longValue());
                        break;
                    case 3:
                        i2 = zzada.zzF(((Long) obj2).longValue());
                        break;
                    case 4:
                        i2 = zzada.zzF(((Integer) obj2).intValue());
                        break;
                    case 5:
                        ((Long) obj2).getClass();
                        break;
                    case 6:
                        ((Integer) obj2).getClass();
                        i2 = 4;
                        break;
                    case 7:
                        ((Boolean) obj2).getClass();
                        i2 = 1;
                        break;
                    case 8:
                        if (obj2 instanceof zzacr) {
                            zzb2 = ((zzacr) obj2).zzb();
                            zzE2 = zzada.zzE(zzb2);
                        } else {
                            zzb2 = zzagl.zzb((String) obj2);
                            zzE2 = zzada.zzE(zzb2);
                        }
                        i2 = zzE2 + zzb2;
                        break;
                    case 9:
                        i2 = ((zzadu) ((zzacb) obj2)).zzcq();
                        break;
                    case 10:
                        zzb2 = ((zzadu) ((zzacb) obj2)).zzcq();
                        zzE2 = zzada.zzE(zzb2);
                        i2 = zzE2 + zzb2;
                        break;
                    case 11:
                        if (obj2 instanceof zzacr) {
                            zzb2 = ((zzacr) obj2).zzb();
                            zzE2 = zzada.zzE(zzb2);
                        } else {
                            zzb2 = ((byte[]) obj2).length;
                            zzE2 = zzada.zzE(zzb2);
                        }
                        i2 = zzE2 + zzb2;
                        break;
                    case 12:
                        i2 = zzada.zzE(((Integer) obj2).intValue());
                        break;
                    case 13:
                        i2 = obj2 instanceof zzady ? zzada.zzF(((zzady) obj2).zza()) : zzada.zzF(((Integer) obj2).intValue());
                        break;
                    case 14:
                        ((Integer) obj2).getClass();
                        i2 = 4;
                        break;
                    case 15:
                        ((Long) obj2).getClass();
                        break;
                    case 16:
                        int intValue = ((Integer) obj2).intValue();
                        i2 = zzada.zzE((intValue >> 31) ^ (intValue + intValue));
                        break;
                    case 17:
                        long longValue = ((Long) obj2).longValue();
                        i2 = zzada.zzF((longValue >> 63) ^ (longValue + longValue));
                        break;
                    default:
                        OptionalProvider$$ExternalSyntheticLambda0.m$1("There is no way to get here, but the compiler thinks otherwise.");
                        break;
                }
            case 1:
                ((Float) obj).getClass();
                zzF = 4;
                int i32 = zzF + zzE3;
                int zzE42 = zzada.zzE(16);
                if (zzagmVar2 == zzagmVar3) {
                }
                switch (zzagmVar2.ordinal()) {
                }
            case 2:
                zzF = zzada.zzF(((Long) obj).longValue());
                int i322 = zzF + zzE3;
                int zzE422 = zzada.zzE(16);
                if (zzagmVar2 == zzagmVar3) {
                }
                switch (zzagmVar2.ordinal()) {
                }
            case 3:
                zzF = zzada.zzF(((Long) obj).longValue());
                int i3222 = zzF + zzE3;
                int zzE4222 = zzada.zzE(16);
                if (zzagmVar2 == zzagmVar3) {
                }
                switch (zzagmVar2.ordinal()) {
                }
            case 4:
                zzF = zzada.zzF(((Integer) obj).intValue());
                int i32222 = zzF + zzE3;
                int zzE42222 = zzada.zzE(16);
                if (zzagmVar2 == zzagmVar3) {
                }
                switch (zzagmVar2.ordinal()) {
                }
            case 5:
                ((Long) obj).getClass();
                zzF = 8;
                int i322222 = zzF + zzE3;
                int zzE422222 = zzada.zzE(16);
                if (zzagmVar2 == zzagmVar3) {
                }
                switch (zzagmVar2.ordinal()) {
                }
            case 6:
                ((Integer) obj).getClass();
                zzF = 4;
                int i3222222 = zzF + zzE3;
                int zzE4222222 = zzada.zzE(16);
                if (zzagmVar2 == zzagmVar3) {
                }
                switch (zzagmVar2.ordinal()) {
                }
            case 7:
                ((Boolean) obj).getClass();
                zzF = 1;
                int i32222222 = zzF + zzE3;
                int zzE42222222 = zzada.zzE(16);
                if (zzagmVar2 == zzagmVar3) {
                }
                switch (zzagmVar2.ordinal()) {
                }
            case 8:
                if (obj instanceof zzacr) {
                    zzb = ((zzacr) obj).zzb();
                    zzE = zzada.zzE(zzb);
                } else {
                    zzb = zzagl.zzb((String) obj);
                    zzE = zzada.zzE(zzb);
                }
                zzF = zzb + zzE;
                int i322222222 = zzF + zzE3;
                int zzE422222222 = zzada.zzE(16);
                if (zzagmVar2 == zzagmVar3) {
                }
                switch (zzagmVar2.ordinal()) {
                }
            case 9:
                zzF = ((zzadu) ((zzacb) obj)).zzcq();
                int i3222222222 = zzF + zzE3;
                int zzE4222222222 = zzada.zzE(16);
                if (zzagmVar2 == zzagmVar3) {
                }
                switch (zzagmVar2.ordinal()) {
                }
            case 10:
                zzb = ((zzadu) ((zzacb) obj)).zzcq();
                zzE = zzada.zzE(zzb);
                zzF = zzb + zzE;
                int i32222222222 = zzF + zzE3;
                int zzE42222222222 = zzada.zzE(16);
                if (zzagmVar2 == zzagmVar3) {
                }
                switch (zzagmVar2.ordinal()) {
                }
            case 11:
                if (obj instanceof zzacr) {
                    zzb = ((zzacr) obj).zzb();
                    zzE = zzada.zzE(zzb);
                } else {
                    zzb = ((byte[]) obj).length;
                    zzE = zzada.zzE(zzb);
                }
                zzF = zzb + zzE;
                int i322222222222 = zzF + zzE3;
                int zzE422222222222 = zzada.zzE(16);
                if (zzagmVar2 == zzagmVar3) {
                }
                switch (zzagmVar2.ordinal()) {
                }
            case 12:
                zzF = zzada.zzE(((Integer) obj).intValue());
                int i3222222222222 = zzF + zzE3;
                int zzE4222222222222 = zzada.zzE(16);
                if (zzagmVar2 == zzagmVar3) {
                }
                switch (zzagmVar2.ordinal()) {
                }
            case 13:
                zzF = obj instanceof zzady ? zzada.zzF(((zzady) obj).zza()) : zzada.zzF(((Integer) obj).intValue());
                int i32222222222222 = zzF + zzE3;
                int zzE42222222222222 = zzada.zzE(16);
                if (zzagmVar2 == zzagmVar3) {
                }
                switch (zzagmVar2.ordinal()) {
                }
            case 14:
                ((Integer) obj).getClass();
                zzF = 4;
                int i322222222222222 = zzF + zzE3;
                int zzE422222222222222 = zzada.zzE(16);
                if (zzagmVar2 == zzagmVar3) {
                }
                switch (zzagmVar2.ordinal()) {
                }
            case 15:
                ((Long) obj).getClass();
                zzF = 8;
                int i3222222222222222 = zzF + zzE3;
                int zzE4222222222222222 = zzada.zzE(16);
                if (zzagmVar2 == zzagmVar3) {
                }
                switch (zzagmVar2.ordinal()) {
                }
            case 16:
                int intValue2 = ((Integer) obj).intValue();
                zzF = zzada.zzE((intValue2 >> 31) ^ (intValue2 + intValue2));
                int i32222222222222222 = zzF + zzE3;
                int zzE42222222222222222 = zzada.zzE(16);
                if (zzagmVar2 == zzagmVar3) {
                }
                switch (zzagmVar2.ordinal()) {
                }
            case 17:
                long longValue2 = ((Long) obj).longValue();
                zzF = zzada.zzF((longValue2 >> 63) ^ (longValue2 + longValue2));
                int i322222222222222222 = zzF + zzE3;
                int zzE422222222222222222 = zzada.zzE(16);
                if (zzagmVar2 == zzagmVar3) {
                }
                switch (zzagmVar2.ordinal()) {
                }
            default:
                OptionalProvider$$ExternalSyntheticLambda0.m$1("There is no way to get here, but the compiler thinks otherwise.");
                break;
        }
        return 0;
    }

    public final com.google.android.gms.maps.zzah zze() {
        return this.zza;
    }
}
