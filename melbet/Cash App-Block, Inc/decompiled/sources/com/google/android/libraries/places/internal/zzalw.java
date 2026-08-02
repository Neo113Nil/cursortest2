package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzalw extends zzbjr {
    private static final zzalw zzi;
    private static volatile zzblh zzj;
    private int zzb;
    private zzbkb zze = zzblk.zzb;
    private long zzf;
    private zzbjz zzg;
    private zzbjz zzh;

    static {
        zzalw zzalwVar = new zzalw();
        zzi = zzalwVar;
        zzbjr.zzbF(zzalw.class, zzalwVar);
    }

    public zzalw() {
        zzbjs zzbjsVar = zzbjs.zzb;
        this.zzg = zzbjsVar;
        this.zzh = zzbjsVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            zzaa zzaaVar = zzaa.zza$17;
            return new zzbll(zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0003\u0000\u0001\u001b\u0002ဂ\u0000\u0003ࠬ\u0004ࠬ", new Object[]{"zzb", "zze", zzalv.class, "zzf", "zzg", zzaaVar, "zzh", zzaaVar});
        }
        if (i2 == 3) {
            return new zzalw();
        }
        if (i2 == 4) {
            return new zzal(zzi);
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
        synchronized (zzalw.class) {
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
}
