package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzdx extends zzbjr {
    private static final zzdx zzm;
    private static volatile zzblh zzn;
    private int zzb;
    private int zze;
    private zzbkb zzf;
    private zzbkb zzg;
    private zzbkb zzh;
    private zzbkb zzi;
    private zzbkb zzj;
    private zzbkb zzk;
    private zzbkb zzl;

    static {
        zzdx zzdxVar = new zzdx();
        zzm = zzdxVar;
        zzbjr.zzbF(zzdx.class, zzdxVar);
    }

    public zzdx() {
        zzblk zzblkVar = zzblk.zzb;
        this.zzf = zzblkVar;
        this.zzg = zzblkVar;
        this.zzh = zzblkVar;
        this.zzi = zzblkVar;
        this.zzj = zzblkVar;
        this.zzk = zzblkVar;
        this.zzl = zzblkVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzm, "\u0001\b\u0000\u0001\u0001✐\b\u0000\u0007\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004\u001b\u0005\u001b\u0006\u001b\u0007\u001b✐᠌\u0000", new Object[]{"zzb", "zzf", zzeb.class, "zzg", zzed.class, "zzh", zzeu.class, "zzi", zzel.class, "zzj", zzew.class, "zzk", zzej.class, "zzl", zzeh.class, "zze", zzf.zza$7});
        }
        if (i2 == 3) {
            return new zzdx();
        }
        if (i2 == 4) {
            return new zze(zzm);
        }
        if (i2 == 5) {
            return zzm;
        }
        if (i2 != 6) {
            throw null;
        }
        zzblh zzblhVar2 = zzn;
        if (zzblhVar2 != null) {
            return zzblhVar2;
        }
        synchronized (zzdx.class) {
            try {
                zzblhVar = zzn;
                if (zzblhVar == null) {
                    zzblhVar = new zzbjm(zzm);
                    zzn = zzblhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzblhVar;
    }
}
