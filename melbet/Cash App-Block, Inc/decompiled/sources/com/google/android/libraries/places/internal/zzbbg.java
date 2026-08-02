package com.google.android.libraries.places.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.List;

/* loaded from: classes4.dex */
public final class zzbbg extends zzbjr {
    private static final zzbbg zzq;
    private static volatile zzblh zzr;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";
    private zzbkb zzl = zzblk.zzb;
    private zzbau zzm;
    private zzbbb zzn;
    private zzbbf zzo;
    private zzbay zzp;

    static {
        zzbbg zzbbgVar = new zzbbg();
        zzq = zzbbgVar;
        zzbjr.zzbF(zzbbg.class, zzbbgVar);
        zzbnq zzc = zzbnq.zzc();
        zzbmm zzbmmVar = zzbmm.zzc;
        if (zzc != null) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$3("Null containingTypeDefaultInstance");
    }

    public static zzbav zzc() {
        return (zzbav) zzq.zzbB();
    }

    public final List zza() {
        return this.zzl;
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzq, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0001\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဈ\u0003\u0004ဈ\u0004\u0005ဈ\u0006\u0006\u001a\u0007ဉ\u0007\bဉ\b\tဉ\t\n᠌\u0002\u000bဉ\n\fဈ\u0005", new Object[]{"zzb", "zze", zzc.zza$22, "zzf", zzc.zza$23, "zzh", "zzi", "zzk", "zzl", "zzm", "zzn", "zzo", "zzg", zzc.zza$24, "zzp", "zzj"});
        }
        if (i2 == 3) {
            return new zzbbg();
        }
        if (i2 == 4) {
            return new zzbav(zzq);
        }
        if (i2 == 5) {
            return zzq;
        }
        if (i2 != 6) {
            throw null;
        }
        zzblh zzblhVar2 = zzr;
        if (zzblhVar2 != null) {
            return zzblhVar2;
        }
        synchronized (zzbbg.class) {
            try {
                zzblhVar = zzr;
                if (zzblhVar == null) {
                    zzblhVar = new zzbjm(zzq);
                    zzr = zzblhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzblhVar;
    }

    public final void zzd(Iterable iterable) {
        zzbkb zzbkbVar = this.zzl;
        if (!((zzbic) zzbkbVar).zza) {
            int size = zzbkbVar.size();
            this.zzl = zzbkbVar.zzg(size + size);
        }
        zzbhz.zzbu(iterable, this.zzl);
    }
}
