package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzaxk extends zzbjr {
    private static final zzaxk zzs;
    private static volatile zzblh zzt;
    private int zzb;
    private int zze;
    private int zzf;
    private long zzg;
    private long zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private zzbim zzn;
    private zzbim zzo;
    private float zzp;
    private int zzq;
    private int zzr;

    static {
        zzaxk zzaxkVar = new zzaxk();
        zzs = zzaxkVar;
        zzbjr.zzbF(zzaxk.class, zzaxkVar);
    }

    public zzaxk() {
        zzbil zzbilVar = zzbim.zza;
        this.zzn = zzbilVar;
        this.zzo = zzbilVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzs, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0007\u0004င\b\u0005ဂ\u0002\u0006ည\t\u0007ဂ\u0003\bည\n\tင\u0004\nင\u0005\u000bခ\u000b\fင\f\rင\u0006\u000eင\r", new Object[]{"zzb", "zze", "zzf", "zzl", "zzm", "zzg", "zzn", "zzh", "zzo", "zzi", "zzj", "zzp", "zzq", "zzk", "zzr"});
        }
        if (i2 == 3) {
            return new zzaxk();
        }
        if (i2 == 4) {
            return new zzaw(zzs);
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
        synchronized (zzaxk.class) {
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
