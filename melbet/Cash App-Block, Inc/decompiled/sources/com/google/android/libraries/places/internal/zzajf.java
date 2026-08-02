package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzajf extends zzbjr {
    private static final zzajf zzq;
    private static volatile zzblh zzr;
    private int zzb;
    private zzbka zze;
    private zzbka zzf;
    private zzbka zzg;
    private zzbka zzh;
    private zzbka zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private zzaiu zzo;
    private int zzp;

    static {
        zzajf zzajfVar = new zzajf();
        zzq = zzajfVar;
        zzbjr.zzbF(zzajf.class, zzajfVar);
    }

    public zzajf() {
        zzbkn zzbknVar = zzbkn.zzb;
        this.zze = zzbknVar;
        this.zzf = zzbknVar;
        this.zzg = zzbknVar;
        this.zzh = zzbknVar;
        this.zzi = zzbknVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzq, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0005\u0000\u0001\u0014\u0002\u0014\u0003\u0014\u0004\u0014\u0005\u0014\u0006င\u0000\u0007᠌\u0001\b᠌\u0002\t᠌\u0003\nင\u0004\u000bဉ\u0005\fင\u0006", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", zzai.zza$8, "zzl", zzai.zza$7, "zzm", zzai.zza$6, "zzn", "zzo", "zzp"});
        }
        if (i2 == 3) {
            return new zzajf();
        }
        if (i2 == 4) {
            return new zzaj(zzq);
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
        synchronized (zzajf.class) {
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
}
