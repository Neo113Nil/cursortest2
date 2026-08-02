package com.google.android.libraries.places.internal;

import com.google.android.gms.internal.time.zzfh;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
public final class zzbjh {
    public static final zzbjh zzd = new zzbjh(0);
    public final zzblp zza = new zzblp();
    public boolean zzb;

    public zzbjh(int i) {
        zzb();
        zzb();
    }

    public static void zzi(zzbiv zzbivVar, zzbmm zzbmmVar, int i, Object obj) {
        if (zzbmmVar == zzbmm.zzj) {
            zzbivVar.zzc(i, 3);
            ((zzbjr) ((zzbhz) obj)).zzbR(zzbivVar);
            zzbivVar.zzc(i, 4);
            return;
        }
        zzbivVar.zzc(i, zzbmmVar.zzt);
        zzbmn zzbmnVar = zzbmn.zza;
        switch (zzbmmVar.ordinal()) {
            case 0:
                zzbivVar.zzv(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                zzbivVar.zzt(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                zzbivVar.zzu(((Long) obj).longValue());
                break;
            case 3:
                zzbivVar.zzu(((Long) obj).longValue());
                break;
            case 4:
                zzbivVar.zzr(((Integer) obj).intValue());
                break;
            case 5:
                zzbivVar.zzv(((Long) obj).longValue());
                break;
            case 6:
                zzbivVar.zzt(((Integer) obj).intValue());
                break;
            case 7:
                zzbivVar.zzq(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof zzbim)) {
                    zzbivVar.zzx((String) obj);
                    break;
                } else {
                    zzbivVar.zzl((zzbim) obj);
                    break;
                }
            case 9:
                ((zzbjr) ((zzbhz) obj)).zzbR(zzbivVar);
                break;
            case 10:
                zzbivVar.zzp((zzbhz) obj);
                break;
            case 11:
                if (!(obj instanceof zzbim)) {
                    byte[] bArr = (byte[]) obj;
                    zzbivVar.zzm(bArr.length, bArr);
                    break;
                } else {
                    zzbivVar.zzl((zzbim) obj);
                    break;
                }
            case 12:
                zzbivVar.zzs(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof zzbjv)) {
                    zzbivVar.zzr(((Integer) obj).intValue());
                    break;
                } else {
                    zzbivVar.zzr(((zzbjv) obj).zza());
                    break;
                }
            case 14:
                zzbivVar.zzt(((Integer) obj).intValue());
                break;
            case 15:
                zzbivVar.zzv(((Long) obj).longValue());
                break;
            case 16:
                int intValue = ((Integer) obj).intValue();
                zzbivVar.zzs((intValue >> 31) ^ (intValue + intValue));
                break;
            case 17:
                long longValue = ((Long) obj).longValue();
                zzbivVar.zzu((longValue >> 63) ^ (longValue + longValue));
                break;
        }
    }

    public static int zzk(zzbmm zzbmmVar, int i, Object obj) {
        int zza;
        int zzG;
        int zzG2 = zzbiv.zzG(i << 3);
        if (zzbmmVar == zzbmm.zzj) {
            zzG2 += zzG2;
        }
        zzbmn zzbmnVar = zzbmn.zza;
        int i2 = 4;
        switch (zzbmmVar.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                i2 = 8;
                return zzG2 + i2;
            case 1:
                ((Float) obj).getClass();
                return zzG2 + i2;
            case 2:
                i2 = zzbiv.zzH(((Long) obj).longValue());
                return zzG2 + i2;
            case 3:
                i2 = zzbiv.zzH(((Long) obj).longValue());
                return zzG2 + i2;
            case 4:
                i2 = zzbiv.zzH(((Integer) obj).intValue());
                return zzG2 + i2;
            case 5:
                ((Long) obj).getClass();
                i2 = 8;
                return zzG2 + i2;
            case 6:
                ((Integer) obj).getClass();
                return zzG2 + i2;
            case 7:
                ((Boolean) obj).getClass();
                i2 = 1;
                return zzG2 + i2;
            case 8:
                if (obj instanceof zzbim) {
                    zza = ((zzbim) obj).zzb();
                    zzG = zzbiv.zzG(zza);
                } else {
                    zza = zzbml.zza((String) obj);
                    zzG = zzbiv.zzG(zza);
                }
                i2 = zzG + zza;
                return zzG2 + i2;
            case 9:
                i2 = ((zzbjr) ((zzbhz) obj)).zzbD();
                return zzG2 + i2;
            case 10:
                zza = ((zzbjr) ((zzbhz) obj)).zzbD();
                zzG = zzbiv.zzG(zza);
                i2 = zzG + zza;
                return zzG2 + i2;
            case 11:
                if (obj instanceof zzbim) {
                    zza = ((zzbim) obj).zzb();
                    zzG = zzbiv.zzG(zza);
                } else {
                    zza = ((byte[]) obj).length;
                    zzG = zzbiv.zzG(zza);
                }
                i2 = zzG + zza;
                return zzG2 + i2;
            case 12:
                i2 = zzbiv.zzG(((Integer) obj).intValue());
                return zzG2 + i2;
            case 13:
                i2 = obj instanceof zzbjv ? zzbiv.zzH(((zzbjv) obj).zza()) : zzbiv.zzH(((Integer) obj).intValue());
                return zzG2 + i2;
            case 14:
                ((Integer) obj).getClass();
                return zzG2 + i2;
            case 15:
                ((Long) obj).getClass();
                i2 = 8;
                return zzG2 + i2;
            case 16:
                int intValue = ((Integer) obj).intValue();
                i2 = zzbiv.zzG((intValue >> 31) ^ (intValue + intValue));
                return zzG2 + i2;
            case 17:
                long longValue = ((Long) obj).longValue();
                i2 = zzbiv.zzH((longValue >> 63) ^ (longValue + longValue));
                return zzG2 + i2;
            default:
                OptionalProvider$$ExternalSyntheticLambda0.m$1("There is no way to get here, but the compiler thinks otherwise.");
                return 0;
        }
    }

    public static boolean zzm(Map.Entry entry) {
        throw null;
    }

    public static final int zzp(Map.Entry entry) {
        entry.getValue();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzbjh) {
            return this.zza.equals(((zzbjh) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final void zzb() {
        if (this.zzb) {
            return;
        }
        zzblp zzblpVar = this.zza;
        int i = zzblpVar.zzb;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = zzblpVar.zzd(i2).zzc;
            if (obj instanceof zzbjr) {
                zzbjr zzbjrVar = (zzbjr) obj;
                zzblj.zza.zzb(zzbjrVar.getClass()).zzh(zzbjrVar);
                zzbjrVar.zzbw();
            }
        }
        Iterator it = zzblpVar.zze().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof zzbjr) {
                zzbjr zzbjrVar2 = (zzbjr) value;
                zzblj.zza.zzb(zzbjrVar2.getClass()).zzh(zzbjrVar2);
                zzbjrVar2.zzbw();
            }
        }
        if (!zzblpVar.zzd) {
            for (int i3 = 0; i3 < zzblpVar.zzb; i3++) {
                ((zzbjp) zzblpVar.zzd(i3).zzb).getClass();
            }
            Iterator it2 = zzblpVar.zze().iterator();
            while (it2.hasNext()) {
                ((zzbjp) ((Map.Entry) it2.next()).getKey()).getClass();
            }
        }
        if (!zzblpVar.zzd) {
            zzblpVar.zzc = zzblpVar.zzc.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(zzblpVar.zzc);
            zzblpVar.zzf = zzblpVar.zzf.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(zzblpVar.zzf);
            zzblpVar.zzd = true;
        }
        this.zzb = true;
    }

    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final zzbjh clone() {
        zzbjh zzbjhVar = new zzbjh();
        zzblp zzblpVar = this.zza;
        if (zzblpVar.zzb > 0) {
            ((zzbjp) zzblpVar.zzd(0).zzb).getClass();
            throw null;
        }
        Iterator it = zzblpVar.zze().iterator();
        if (!it.hasNext()) {
            return zzbjhVar;
        }
        Map.Entry entry = (Map.Entry) it.next();
        zzbjp zzbjpVar = (zzbjp) entry.getKey();
        entry.getValue();
        zzbjpVar.getClass();
        throw null;
    }

    public final Iterator zzd() {
        zzblp zzblpVar = this.zza;
        return zzblpVar.isEmpty() ? Collections.emptyIterator() : ((zzfh) zzblpVar.entrySet()).iterator();
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0030, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzg() {
        zzblp zzblpVar = this.zza;
        int i = zzblpVar.zzb;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                Iterator it = zzblpVar.zze().iterator();
                while (it.hasNext()) {
                    if (!zzm((Map.Entry) it.next())) {
                    }
                }
                return true;
            }
            if (!zzm(zzblpVar.zzd(i2))) {
                break;
            }
            i2++;
        }
    }

    public final void zzo(Map.Entry entry) {
        zzbjp zzbjpVar = (zzbjp) entry.getKey();
        entry.getValue();
        zzbjpVar.getClass();
        throw null;
    }

    public zzbjh() {
    }
}
