package com.google.android.gms.internal.measurement;

import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;

/* loaded from: classes.dex */
public final class zznd {
    public static final zznd zza = new zznd(zzmw.zzb(), zzmq.zzi());
    public final zzmw zzb;
    public final zzmq zzc;

    public zznd(zzmw zzmwVar, zzmq zzmqVar) {
        zzmwVar.getClass();
        this.zzb = zzmwVar;
        this.zzc = zzmqVar;
    }

    public static zznd zzb(zzacv zzacvVar, boolean z) {
        zzmw zzb;
        int zzr = zzacvVar.zzr();
        if (zzr > 1) {
            a$$ExternalSyntheticBUOutline0.m$5(re$$ExternalSyntheticOutline0.m(zzr, "Unsupported version: ", ". Current version is: 1", new StringBuilder(String.valueOf(zzr).length() + 44)));
            return null;
        }
        zzacvVar.zzr();
        int zzD = zzacvVar.zzD(zzacvVar.zzp());
        zzadf zzadfVar = zzadf.zzd;
        int i = zzacf.$r8$clinit;
        zzmq zzh = zzmq.zzh(zzacvVar, zzadf.zza);
        zzacvVar.zzE(zzD);
        zzmu zza2 = zzmu.zza();
        try {
            if (z) {
                int zzD2 = zzacvVar.zzD(zzacvVar.zzp());
                zzb = zza2.zzc(zzacvVar);
                if (zzacvVar.zzF() != 0) {
                    throw new zzaeh("Unexpected bytes remaining after FlagsBlob parsing.");
                }
                zzacvVar.zzE(zzD2);
            } else {
                zzb = zza2.zzb(zzacvVar.zzo());
            }
            zza2.close();
            return new zznd(zzb, zzh);
        } catch (Throwable th) {
            try {
                zza2.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
