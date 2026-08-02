package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzais extends zzbjr {
    private static final zzais zzl;
    private static volatile zzblh zzm;
    private int zzb;
    private int zze;
    private zzbkb zzf;
    private zzbkb zzg;
    private zzbkb zzh;
    private zzbkb zzi;
    private zzbkb zzj;
    private zzbkb zzk;

    static {
        zzais zzaisVar = new zzais();
        zzl = zzaisVar;
        zzbjr.zzbF(zzais.class, zzaisVar);
    }

    public zzais() {
        zzblk zzblkVar = zzblk.zzb;
        this.zzf = zzblkVar;
        this.zzg = zzblkVar;
        this.zzh = zzblkVar;
        this.zzi = zzblkVar;
        this.zzj = zzblkVar;
        this.zzk = zzblkVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzl, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0006\u0000\u0001᠌\u0000\u0002\u001b\u0003\u001b\u0004\u001b\u0005\u001b\u0006\u001b\u0007\u001b", new Object[]{"zzb", "zze", zzai.zza$5, "zzf", zzadt.class, "zzg", zzayb.class, "zzh", zzagr.class, "zzi", zzaxq.class, "zzj", zzaxo.class, "zzk", zzadw.class});
        }
        if (i2 == 3) {
            return new zzais();
        }
        if (i2 == 4) {
            return new zzaj(zzl);
        }
        if (i2 == 5) {
            return zzl;
        }
        if (i2 != 6) {
            throw null;
        }
        zzblh zzblhVar2 = zzm;
        if (zzblhVar2 != null) {
            return zzblhVar2;
        }
        synchronized (zzais.class) {
            try {
                zzblhVar = zzm;
                if (zzblhVar == null) {
                    zzblhVar = new zzbjm(zzl);
                    zzm = zzblhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzblhVar;
    }
}
