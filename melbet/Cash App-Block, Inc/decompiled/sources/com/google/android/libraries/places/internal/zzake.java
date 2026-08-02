package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzake extends zzbjr {
    private static final zzake zzA;
    private static volatile zzblh zzB;
    private int zzb;
    private long zze;
    private zzbkb zzf;
    private zzbkb zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private long zzn;
    private int zzo;
    private int zzp;
    private long zzq;
    private zzajf zzr;
    private long zzs;
    private zzbkb zzt;
    private zzbkb zzu;
    private zzalc zzv;
    private zzalc zzw;
    private zzbkb zzx;
    private zzbkb zzy;
    private zzaiw zzz;

    static {
        zzake zzakeVar = new zzake();
        zzA = zzakeVar;
        zzbjr.zzbF(zzake.class, zzakeVar);
    }

    public zzake() {
        zzblk zzblkVar = zzblk.zzb;
        this.zzf = zzblkVar;
        this.zzg = zzblkVar;
        this.zzt = zzblkVar;
        this.zzu = zzblkVar;
        this.zzx = zzblkVar;
        this.zzy = zzblkVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzA, "\u0001\u0016\u0000\u0001\u0001\u0019\u0016\u0000\u0006\u0000\u0001စ\u0000\u0003\u001b\u0004\u001b\u0005ဂ\u0001\u0006ဂ\u0002\u0007ဂ\u0003\bင\u0004\tင\u0005\nဂ\u0006\u000bဂ\u0007\fင\b\rင\t\u000eဂ\n\u000fဉ\u000b\u0010ဂ\f\u0011\u001b\u0012\u001b\u0013ဉ\r\u0014ဉ\u000e\u0015\u001b\u0016\u001b\u0019ဉ\u000f", new Object[]{"zzb", "zze", "zzf", zzakl.class, "zzg", zzakn.class, "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", zzakv.class, "zzu", zzakv.class, "zzv", "zzw", "zzx", zzakc.class, "zzy", zzakc.class, "zzz"});
        }
        if (i2 == 3) {
            return new zzake();
        }
        if (i2 == 4) {
            return new zzal(zzA);
        }
        if (i2 == 5) {
            return zzA;
        }
        if (i2 != 6) {
            throw null;
        }
        zzblh zzblhVar2 = zzB;
        if (zzblhVar2 != null) {
            return zzblhVar2;
        }
        synchronized (zzake.class) {
            try {
                zzblhVar = zzB;
                if (zzblhVar == null) {
                    zzblhVar = new zzbjm(zzA);
                    zzB = zzblhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzblhVar;
    }
}
