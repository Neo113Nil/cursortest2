package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzahm extends zzbjr {
    private static final zzahm zzj;
    private static volatile zzblh zzk;
    private int zzb;
    private zzdq zze;
    private zzahi zzf;
    private zzbkb zzg = zzblk.zzb;
    private int zzh;
    private int zzi;

    static {
        zzahm zzahmVar = new zzahm();
        zzj = zzahmVar;
        zzbjr.zzbF(zzahm.class, zzahmVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzj, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဉ\u0001\u0002\u001b\u0003᠌\u0002\u0004᠌\u0003\u0005ဉ\u0000", new Object[]{"zzb", "zzf", "zzg", zzagt.class, "zzh", zzai.zza$1, "zzi", zzaa.zza$29, "zze"});
        }
        if (i2 == 3) {
            return new zzahm();
        }
        if (i2 == 4) {
            return new zzaj(zzj);
        }
        if (i2 == 5) {
            return zzj;
        }
        if (i2 != 6) {
            throw null;
        }
        zzblh zzblhVar2 = zzk;
        if (zzblhVar2 != null) {
            return zzblhVar2;
        }
        synchronized (zzahm.class) {
            try {
                zzblhVar = zzk;
                if (zzblhVar == null) {
                    zzblhVar = new zzbjm(zzj);
                    zzk = zzblhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzblhVar;
    }
}
