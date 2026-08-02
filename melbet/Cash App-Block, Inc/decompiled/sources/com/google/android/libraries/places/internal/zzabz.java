package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzabz extends zzbjr {
    private static final zzabz zzn;
    private static volatile zzblh zzo;
    private int zzb;
    private int zzf;
    private int zzg;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private String zze = "";
    private String zzh = "";

    static {
        zzabz zzabzVar = new zzabz();
        zzn = zzabzVar;
        zzbjr.zzbF(zzabz.class, zzabzVar);
    }

    public static zzabu zza$1() {
        return (zzabu) zzn.zzbB();
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzn, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0002\u0004ဈ\u0003\u0005င\u0004\u0006᠌\u0005\u0007᠌\u0006\b᠌\u0007\t᠌\b", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", zzaa.zza$3, "zzk", zzaa.zza$5, "zzl", zzaa.zza$4, "zzm", zzaa.zza$6});
        }
        if (i2 == 3) {
            return new zzabz();
        }
        if (i2 == 4) {
            return new zzabu(zzn);
        }
        if (i2 == 5) {
            return zzn;
        }
        if (i2 != 6) {
            throw null;
        }
        zzblh zzblhVar2 = zzo;
        if (zzblhVar2 != null) {
            return zzblhVar2;
        }
        synchronized (zzabz.class) {
            try {
                zzblhVar = zzo;
                if (zzblhVar == null) {
                    zzblhVar = new zzbjm(zzn);
                    zzo = zzblhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzblhVar;
    }

    public final /* synthetic */ void zzc(String str) {
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void zzd(int i) {
        this.zzb |= 2;
        this.zzf = i;
    }
}
