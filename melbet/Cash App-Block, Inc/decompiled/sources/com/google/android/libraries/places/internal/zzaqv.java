package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzaqv extends zzbjr {
    private static final zzaqv zzt;
    private static volatile zzblh zzu;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private zzaqj zzj;
    private zzaqc zzk;
    private zzapy zzl;
    private zzawk zzm;
    private zzaqe zzn;
    private zzaqh zzo;
    private zzawm zzp;
    private zzawu zzq;
    private zzawq zzr;
    private int zzs;

    static {
        zzaqv zzaqvVar = new zzaqv();
        zzt = zzaqvVar;
        zzbjr.zzbF(zzaqv.class, zzaqvVar);
    }

    public static zzaqq zza() {
        return (zzaqq) zzt.zzbB();
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzt, "\u0001\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003င\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007\tဉ\b\nဉ\t\u000bဉ\n\fဉ\u000b\rဉ\f\u000eဉ\r\u000f᠌\u000e", new Object[]{"zzb", "zze", zzanz.zza$22, "zzf", zzanz.zza$24, "zzg", "zzh", zzanz.zza$21, "zzi", zzanz.zza$20, "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", zzanz.zza$23});
        }
        if (i2 == 3) {
            return new zzaqv();
        }
        if (i2 == 4) {
            return new zzaqq(zzt);
        }
        if (i2 == 5) {
            return zzt;
        }
        if (i2 != 6) {
            throw null;
        }
        zzblh zzblhVar2 = zzu;
        if (zzblhVar2 != null) {
            return zzblhVar2;
        }
        synchronized (zzaqv.class) {
            try {
                zzblhVar = zzu;
                if (zzblhVar == null) {
                    zzblhVar = new zzbjm(zzt);
                    zzu = zzblhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzblhVar;
    }

    public final /* synthetic */ void zzc(int i) {
        this.zzb |= 4;
        this.zzg = i;
    }

    public final /* synthetic */ void zzd(zzaqj zzaqjVar) {
        this.zzj = zzaqjVar;
        this.zzb |= 32;
    }

    public final /* synthetic */ void zze(zzapy zzapyVar) {
        this.zzl = zzapyVar;
        this.zzb |= 128;
    }

    public final /* synthetic */ void zzf(zzaqe zzaqeVar) {
        this.zzn = zzaqeVar;
        this.zzb |= 512;
    }

    public final /* synthetic */ void zzg(zzawu zzawuVar) {
        this.zzq = zzawuVar;
        this.zzb |= 4096;
    }

    public final /* synthetic */ void zzi(int i) {
        this.zze = i - 1;
        this.zzb |= 1;
    }

    public final /* synthetic */ void zzj(int i) {
        this.zzf = i - 1;
        this.zzb |= 2;
    }
}
