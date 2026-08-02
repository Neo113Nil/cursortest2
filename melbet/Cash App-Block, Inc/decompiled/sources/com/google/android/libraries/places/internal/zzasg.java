package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzasg extends zzbjr {
    private static final zzasg zzs;
    private static volatile zzblh zzt;
    private int zzb;
    private int zze;
    private int zzf;
    private zzbjz zzg = zzbjs.zzb;
    private int zzh;
    private boolean zzi;
    private boolean zzj;
    private int zzk;
    private int zzl;
    private zzaun zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private zzasq zzr;

    static {
        zzasg zzasgVar = new zzasg();
        zzs = zzasgVar;
        zzbjr.zzbF(zzasg.class, zzasgVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzs, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0001\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ࠬ\u0004᠌\u0002\u0005ဇ\u0003\u0006ဇ\u0004\u0007᠌\u0005\b᠌\u0006\tဉ\u0007\n᠌\b\u000b᠌\t\f᠌\n\r᠌\u000b\u000eဉ\f", new Object[]{"zzb", "zze", zzat.zza$9, "zzf", zzat.zza$10, "zzg", zzat.zza$8, "zzh", zzat.zza$11, "zzi", "zzj", "zzk", zzat.zza$7, "zzl", zzat.zza$13, "zzm", "zzn", zzat.zza$12, "zzo", zzat.zza$14, "zzp", zzat.zza$16, "zzq", zzat.zza$15, "zzr"});
        }
        if (i2 == 3) {
            return new zzasg();
        }
        if (i2 == 4) {
            return new zzaq(zzs);
        }
        if (i2 == 5) {
            return zzs;
        }
        if (i2 != 6) {
            throw null;
        }
        zzblh zzblhVar2 = zzt;
        if (zzblhVar2 != null) {
            return zzblhVar2;
        }
        synchronized (zzasg.class) {
            try {
                zzblhVar = zzt;
                if (zzblhVar == null) {
                    zzblhVar = new zzbjm(zzs);
                    zzt = zzblhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzblhVar;
    }
}
