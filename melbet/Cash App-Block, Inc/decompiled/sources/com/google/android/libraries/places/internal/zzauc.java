package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzauc extends zzbjr {
    private static final zzauc zzi;
    private static volatile zzblh zzj;
    private int zzb;
    private zzbkb zze = zzblk.zzb;
    private int zzf;
    private int zzg;
    private zzavc zzh;

    static {
        zzauc zzaucVar = new zzauc();
        zzi = zzaucVar;
        zzbjr.zzbF(zzauc.class, zzaucVar);
    }

    public static zzaub zza() {
        return (zzaub) zzi.zzbB();
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001a\u0002᠌\u0000\u0003ဋ\u0001\u0004ဉ\u0002", new Object[]{"zzb", "zze", "zzf", zzanz.zza$18, "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzauc();
        }
        if (i2 == 4) {
            return new zzaub(zzi);
        }
        if (i2 == 5) {
            return zzi;
        }
        if (i2 != 6) {
            throw null;
        }
        zzblh zzblhVar2 = zzj;
        if (zzblhVar2 != null) {
            return zzblhVar2;
        }
        synchronized (zzauc.class) {
            try {
                zzblhVar = zzj;
                if (zzblhVar == null) {
                    zzblhVar = new zzbjm(zzi);
                    zzj = zzblhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzblhVar;
    }

    public final /* synthetic */ void zzc(int i) {
        this.zzb |= 2;
        this.zzg = 1;
    }

    public final /* synthetic */ void zzd(zzavc zzavcVar) {
        this.zzh = zzavcVar;
        this.zzb |= 4;
    }
}
