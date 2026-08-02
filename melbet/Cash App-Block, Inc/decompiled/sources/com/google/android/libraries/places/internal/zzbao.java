package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbao extends zzbjr {
    private static final zzbao zzu;
    private static volatile zzblh zzv;
    private int zzb;
    private int zze;
    private zzazy zzf;
    private zzazy zzg;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private zzazy zzn;
    private zzbaa zzo;
    private zzbae zzp;
    private int zzq;
    private int zzr;
    private zzbac zzs;
    private byte zzt = 2;
    private zzbkb zzh = zzblk.zzb;

    static {
        zzbao zzbaoVar = new zzbao();
        zzu = zzbaoVar;
        zzbjr.zzbF(zzbao.class, zzbaoVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzt);
        }
        if (i2 == 2) {
            return new zzbll(zzu, "\u0001\u000f\u0000\u0001\u0002\u0010\u000f\u0000\u0001\u0001\u0002ᔄ\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0005\u001b\u0006င\u0003\u0007င\u0004\bင\u0005\tင\u0006\nင\u0007\u000bဉ\b\fဉ\t\rဉ\n\u000eင\u000b\u000fင\f\u0010ဉ\r", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", zzbam.class, "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs"});
        }
        if (i2 == 3) {
            return new zzbao();
        }
        if (i2 == 4) {
            return new zzba(zzu);
        }
        if (i2 == 5) {
            return zzu;
        }
        if (i2 != 6) {
            this.zzt = zzbjrVar == null ? (byte) 0 : (byte) 1;
            return null;
        }
        zzblh zzblhVar2 = zzv;
        if (zzblhVar2 != null) {
            return zzblhVar2;
        }
        synchronized (zzbao.class) {
            try {
                zzblhVar = zzv;
                if (zzblhVar == null) {
                    zzblhVar = new zzbjm(zzu);
                    zzv = zzblhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzblhVar;
    }
}
