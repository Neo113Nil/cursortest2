package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzavw extends zzbjr {
    private static final zzavw zzn;
    private static volatile zzblh zzo;
    private int zzb;
    private int zze;
    private zzbkb zzf;
    private zzbkb zzg;
    private zzbkb zzh;
    private zzbkb zzi;
    private int zzj;
    private zzavc zzk;
    private zzawh zzl;
    private boolean zzm;

    static {
        zzavw zzavwVar = new zzavw();
        zzn = zzavwVar;
        zzbjr.zzbF(zzavw.class, zzavwVar);
    }

    public zzavw() {
        zzblk zzblkVar = zzblk.zzb;
        this.zzf = zzblkVar;
        this.zzg = zzblkVar;
        this.zzh = zzblkVar;
        this.zzi = zzblkVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzn, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0004\u0000\u0001᠌\u0000\u0002\u001a\u0003\u001a\u0004\u001a\u0005\u001a\u0006င\u0001\u0007ဉ\u0002\bဉ\u0003\tဇ\u0004", new Object[]{"zzb", "zze", zzc.zza$8, "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        if (i2 == 3) {
            return new zzavw();
        }
        if (i2 == 4) {
            return new zzaw(zzn);
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
        synchronized (zzavw.class) {
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
}
