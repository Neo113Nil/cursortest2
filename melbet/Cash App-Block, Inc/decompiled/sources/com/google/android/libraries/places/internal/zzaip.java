package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzaip extends zzbjr {
    private static final zzaip zzo;
    private static volatile zzblh zzp;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private int zzn;

    static {
        zzaip zzaipVar = new zzaip();
        zzo = zzaipVar;
        zzbjr.zzbF(zzaip.class, zzaipVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzo, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ဋ\u0003\u0005ဋ\u0004\u0006ဋ\u0005\u0007ဋ\u0006\bဋ\u0007\tဋ\b\nဋ\t", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn"});
        }
        if (i2 == 3) {
            return new zzaip();
        }
        if (i2 == 4) {
            return new zzaj(zzo);
        }
        if (i2 == 5) {
            return zzo;
        }
        if (i2 != 6) {
            throw null;
        }
        zzblh zzblhVar2 = zzp;
        if (zzblhVar2 != null) {
            return zzblhVar2;
        }
        synchronized (zzaip.class) {
            try {
                zzblhVar = zzp;
                if (zzblhVar == null) {
                    zzblhVar = new zzbjm(zzo);
                    zzp = zzblhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzblhVar;
    }
}
