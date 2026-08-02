package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzavt extends zzbjr {
    private static final zzavt zzs;
    private static volatile zzblh zzt;
    private int zzb;
    private int zze;
    private boolean zzg;
    private double zzh;
    private int zzi;
    private boolean zzk;
    private zzavc zzl;
    private zzavr zzm;
    private zzawh zzn;
    private boolean zzo;
    private boolean zzq;
    private boolean zzr;
    private String zzf = "";
    private zzbjz zzj = zzbjs.zzb;
    private String zzp = "";

    static {
        zzavt zzavtVar = new zzavt();
        zzs = zzavtVar;
        zzbjr.zzbF(zzavt.class, zzavtVar);
    }

    public static zzavp zza$1() {
        return (zzavp) zzs.zzbB();
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzs, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004က\u0003\u0005င\u0004\u0006'\u0007ဇ\u0005\bဉ\u0006\tဉ\u0007\nဉ\b\u000bဇ\t\fဈ\n\rဇ\u000b\u000eဇ\f", new Object[]{"zzb", "zze", zzc.zza$7, "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr"});
        }
        if (i2 == 3) {
            return new zzavt();
        }
        if (i2 == 4) {
            return new zzavp(zzs);
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
        synchronized (zzavt.class) {
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

    public final /* synthetic */ void zzd(boolean z) {
        this.zzb |= 4;
        this.zzg = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzg(Iterable iterable) {
        zzbjz zzbjzVar = this.zzj;
        if (!((zzbic) zzbjzVar).zza) {
            this.zzj = zzbjr.zzbK(zzbjzVar);
        }
        zzbhz.zzbu(iterable, this.zzj);
    }

    public final /* synthetic */ void zzh(boolean z) {
        this.zzb |= 32;
        this.zzk = false;
    }

    public final /* synthetic */ void zzi(zzavc zzavcVar) {
        this.zzl = zzavcVar;
        this.zzb |= 64;
    }

    public final /* synthetic */ void zzl(boolean z) {
        this.zzb |= 512;
        this.zzo = false;
    }

    public final /* synthetic */ void zzm(boolean z) {
        this.zzb |= 2048;
        this.zzq = z;
    }

    public final /* synthetic */ void zzn() {
        this.zzb |= 4096;
        this.zzr = false;
    }

    public final /* synthetic */ void zzp$1(int i) {
        this.zze = i - 1;
        this.zzb |= 1;
    }
}
