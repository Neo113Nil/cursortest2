package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzatj extends zzbjr {
    private static final zzatj zzx;
    private static volatile zzblh zzy;
    private int zzb;
    private int zze;
    private int zzf = 1;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private boolean zzq;
    private int zzr;
    private int zzs;
    private int zzt;
    private int zzu;
    private zzate zzv;
    private int zzw;

    static {
        zzatj zzatjVar = new zzatj();
        zzx = zzatjVar;
        zzbjr.zzbF(zzatj.class, zzatjVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzx, "\u0001\u0013\u0000\u0001\u0001\u0014\u0013\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဋ\u0005\u0007ဋ\u0006\bဋ\u0007\nဋ\t\u000bဋ\n\fဋ\u000b\rဇ\f\u000eဋ\r\u000fဋ\b\u0010ဋ\u000e\u0011᠌\u000f\u0012᠌\u0010\u0013ဉ\u0011\u0014င\u0012", new Object[]{"zzb", "zze", zzat.zza$21, "zzf", zzat.zza$17, "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzn", "zzo", "zzp", "zzq", "zzr", "zzm", "zzs", "zzt", zzat.zza$19, "zzu", zzat.zza$20, "zzv", "zzw"});
        }
        if (i2 == 3) {
            return new zzatj();
        }
        if (i2 == 4) {
            return new zzaq(zzx);
        }
        if (i2 == 5) {
            return zzx;
        }
        if (i2 != 6) {
            throw null;
        }
        zzblh zzblhVar2 = zzy;
        if (zzblhVar2 != null) {
            return zzblhVar2;
        }
        synchronized (zzatj.class) {
            try {
                zzblhVar = zzy;
                if (zzblhVar == null) {
                    zzblhVar = new zzbjm(zzx);
                    zzy = zzblhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzblhVar;
    }
}
