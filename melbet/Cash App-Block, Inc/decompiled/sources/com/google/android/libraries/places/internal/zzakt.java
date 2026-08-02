package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzakt extends zzbjr {
    private static final zzakt zzo;
    private static volatile zzblh zzp;
    private int zzb;
    private long zze;
    private long zzf;
    private zzbkb zzg;
    private zzbkb zzh;
    private zzbkb zzi;
    private zzbkb zzj;
    private zzalc zzk;
    private zzalc zzl;
    private zzalc zzm;
    private zzalc zzn;

    static {
        zzakt zzaktVar = new zzakt();
        zzo = zzaktVar;
        zzbjr.zzbF(zzakt.class, zzaktVar);
    }

    public zzakt() {
        zzblk zzblkVar = zzblk.zzb;
        this.zzg = zzblkVar;
        this.zzh = zzblkVar;
        this.zzi = zzblkVar;
        this.zzj = zzblkVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzo, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0004\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003\u001b\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဉ\u0002\bဉ\u0003\tဉ\u0004\nဉ\u0005", new Object[]{"zzb", "zze", "zzf", "zzg", zzakv.class, "zzh", zzakv.class, "zzi", zzakv.class, "zzj", zzakv.class, "zzk", "zzl", "zzm", "zzn"});
        }
        if (i2 == 3) {
            return new zzakt();
        }
        if (i2 == 4) {
            return new zzal(zzo);
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
        synchronized (zzakt.class) {
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
