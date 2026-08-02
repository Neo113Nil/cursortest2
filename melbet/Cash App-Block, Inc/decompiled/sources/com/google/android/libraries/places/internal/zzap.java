package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzap extends zzbjr {
    private static final zzap zzw;
    private static volatile zzblh zzx;
    private int zzb;
    private int zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private float zzi;
    private boolean zzj;
    private zzbkb zzk;
    private zzbkb zzl;
    private zzbkb zzm;
    private zzbkb zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private int zzt;
    private int zzu;
    private long zzv;

    static {
        zzap zzapVar = new zzap();
        zzw = zzapVar;
        zzbjr.zzbF(zzap.class, zzapVar);
    }

    public zzap() {
        zzblk zzblkVar = zzblk.zzb;
        this.zzk = zzblkVar;
        this.zzl = zzblkVar;
        this.zzm = zzblkVar;
        this.zzn = zzblkVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzw, "\u0001\u0012\u0000\u0001\u0001\u0012\u0012\u0000\u0004\u0000\u0001᠌\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006ဇ\u0005\u0007\u001a\b\u001b\t\u001b\nင\u0006\u000bဂ\r\fင\u000b\rင\u0007\u000eင\b\u000fင\t\u0010င\n\u0011\u001b\u0012င\f", new Object[]{"zzb", "zze", zzc.zza$17, "zzf", "zzg", "zzh", "zzi", "zzj", "zzl", "zzm", zzay.class, "zzn", zzay.class, "zzo", "zzv", "zzt", "zzp", "zzq", "zzr", "zzs", "zzk", zzdh.class, "zzu"});
        }
        if (i2 == 3) {
            return new zzap();
        }
        if (i2 == 4) {
            return new zzao(zzw);
        }
        if (i2 == 5) {
            return zzw;
        }
        if (i2 != 6) {
            throw null;
        }
        zzblh zzblhVar2 = zzx;
        if (zzblhVar2 != null) {
            return zzblhVar2;
        }
        synchronized (zzap.class) {
            try {
                zzblhVar = zzx;
                if (zzblhVar == null) {
                    zzblhVar = new zzbjm(zzw);
                    zzx = zzblhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzblhVar;
    }
}
