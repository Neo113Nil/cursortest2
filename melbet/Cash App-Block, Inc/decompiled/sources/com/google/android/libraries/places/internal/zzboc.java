package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzboc extends zzbjr {
    private static final zzboc zzo;
    private static volatile zzblh zzp;
    private int zzb;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";
    private zzbkb zzl;
    private zzbkb zzm;
    private String zzn;

    static {
        zzboc zzbocVar = new zzboc();
        zzo = zzbocVar;
        zzbjr.zzbF(zzboc.class, zzbocVar);
    }

    public zzboc() {
        zzblk zzblkVar = zzblk.zzb;
        this.zzl = zzblkVar;
        this.zzm = zzblkVar;
        this.zzn = "";
    }

    public static zzboc zzn() {
        return zzo;
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzo, "\u0000\u000b\u0000\u0000\u0001\u000b\u000b\u0000\u0002\u0000\u0001\u0004\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ\tȚ\nȚ\u000bȈ", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn"});
        }
        if (i2 == 3) {
            return new zzboc();
        }
        if (i2 == 4) {
            return new zzbk(zzo);
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
        synchronized (zzboc.class) {
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

    public final String zzc() {
        return this.zze;
    }

    public final String zze() {
        return this.zzf;
    }

    public final String zzf() {
        return this.zzg;
    }

    public final String zzg() {
        return this.zzh;
    }

    public final String zzh() {
        return this.zzi;
    }

    public final String zzi() {
        return this.zzj;
    }

    public final String zzj() {
        return this.zzk;
    }

    public final zzbkb zzk() {
        return this.zzl;
    }

    public final zzbkb zzl() {
        return this.zzm;
    }

    public final String zzm() {
        return this.zzn;
    }
}
