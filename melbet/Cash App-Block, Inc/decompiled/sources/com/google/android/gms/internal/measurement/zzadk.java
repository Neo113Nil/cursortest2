package com.google.android.gms.internal.measurement;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
public final class zzadk {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final zzafr zza = new zzafr();
    public boolean zzb;

    static {
        new zzadk(0);
    }

    public zzadk(int i) {
        zzb();
        zzb();
    }

    public static void zzf(zzada zzadaVar, zzagm zzagmVar, int i, Object obj) {
        if (zzagmVar == zzagm.zzj) {
            zzadaVar.zzb(i, 3);
            ((zzadu) ((zzacb) obj)).zzcH(zzadaVar);
            zzadaVar.zzb(i, 4);
            return;
        }
        zzadaVar.zzb(i, zzagmVar.zzt);
        zzagn zzagnVar = zzagn.zza;
        switch (zzagmVar.ordinal()) {
            case 0:
                zzadaVar.zzu(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                zzadaVar.zzs(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                zzadaVar.zzt(((Long) obj).longValue());
                break;
            case 3:
                zzadaVar.zzt(((Long) obj).longValue());
                break;
            case 4:
                zzadaVar.zzq(((Integer) obj).intValue());
                break;
            case 5:
                zzadaVar.zzu(((Long) obj).longValue());
                break;
            case 6:
                zzadaVar.zzs(((Integer) obj).intValue());
                break;
            case 7:
                zzadaVar.zzp(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof zzacr)) {
                    zzadaVar.zzw((String) obj);
                    break;
                } else {
                    zzadaVar.zzk((zzacr) obj);
                    break;
                }
            case 9:
                ((zzadu) ((zzacb) obj)).zzcH(zzadaVar);
                break;
            case 10:
                zzadaVar.zzo((zzacb) obj);
                break;
            case 11:
                if (!(obj instanceof zzacr)) {
                    byte[] bArr = (byte[]) obj;
                    zzadaVar.zzl(bArr.length, bArr);
                    break;
                } else {
                    zzadaVar.zzk((zzacr) obj);
                    break;
                }
            case 12:
                zzadaVar.zzr(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof zzady)) {
                    zzadaVar.zzq(((Integer) obj).intValue());
                    break;
                } else {
                    zzadaVar.zzq(((zzady) obj).zza());
                    break;
                }
            case 14:
                zzadaVar.zzs(((Integer) obj).intValue());
                break;
            case 15:
                zzadaVar.zzu(((Long) obj).longValue());
                break;
            case 16:
                int intValue = ((Integer) obj).intValue();
                zzadaVar.zzr((intValue >> 31) ^ (intValue + intValue));
                break;
            case 17:
                long longValue = ((Long) obj).longValue();
                zzadaVar.zzt((longValue >> 63) ^ (longValue + longValue));
                break;
        }
    }

    public final Object clone() {
        zzadk zzadkVar = new zzadk();
        zzafr zzafrVar = this.zza;
        if (zzafrVar.zzb > 0) {
            throw null;
        }
        Iterator it = zzafrVar.zze().iterator();
        if (!it.hasNext()) {
            return zzadkVar;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (entry.getKey() != null) {
            a$$ExternalSyntheticBUOutline0.m$1();
            return null;
        }
        entry.getValue();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzadk) {
            return this.zza.equals(((zzadk) obj).zza);
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
        zzafr zzafrVar = this.zza;
        int i = zzafrVar.zzb;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = zzafrVar.zzd(i2).zzc;
            if (obj instanceof zzadu) {
                zzadu zzaduVar = (zzadu) obj;
                zzafl.zza().zzb(zzaduVar.getClass()).zzk(zzaduVar);
                zzaduVar.zzci();
            }
        }
        Iterator it = zzafrVar.zze().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof zzadu) {
                zzadu zzaduVar2 = (zzadu) value;
                zzafl.zza().zzb(zzaduVar2.getClass()).zzk(zzaduVar2);
                zzaduVar2.zzci();
            }
        }
        if (!zzafrVar.zzd) {
            if (zzafrVar.zzb > 0) {
                throw null;
            }
            Iterator it2 = zzafrVar.zze().iterator();
            if (it2.hasNext()) {
                ((Map.Entry) it2.next()).getKey().getClass();
                a$$ExternalSyntheticBUOutline0.m$1();
                return;
            }
        }
        if (!zzafrVar.zzd) {
            zzafrVar.zzc = zzafrVar.zzc.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(zzafrVar.zzc);
            zzafrVar.zzf = zzafrVar.zzf.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(zzafrVar.zzf);
            zzafrVar.zzd = true;
        }
        this.zzb = true;
    }

    public zzadk() {
    }
}
