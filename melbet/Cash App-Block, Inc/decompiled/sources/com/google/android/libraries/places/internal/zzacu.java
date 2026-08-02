package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzacu extends zzbjr {
    private static final zzacu zzy;
    private static volatile zzblh zzz;
    private int zzb;
    private boolean zze;
    private int zzf;
    private boolean zzg;
    private int zzh;
    private boolean zzi;
    private int zzj;
    private boolean zzk;
    private int zzl;
    private boolean zzm;
    private int zzn;
    private boolean zzo;
    private int zzp;
    private boolean zzq;
    private int zzr;
    private boolean zzs;
    private int zzt;
    private int zzu;
    private int zzv;
    private int zzw;
    private int zzx;

    static {
        zzacu zzacuVar = new zzacu();
        zzy = zzacuVar;
        zzbjr.zzbF(zzacu.class, zzacuVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzy, "\u0001\u0014\u0000\u0001\u0001\u0014\u0014\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001\u0003ဇ\u0002\u0004င\u0003\u0005ဇ\u0004\u0006င\u0005\u0007ဇ\u0006\bင\u0007\tဇ\b\nင\t\u000bဇ\n\fင\u000b\rဇ\f\u000eင\r\u000fဇ\u000e\u0010င\u000f\u0011င\u0010\u0012င\u0011\u0013င\u0012\u0014ဋ\u0013", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx"});
        }
        if (i2 == 3) {
            return new zzacu();
        }
        if (i2 == 4) {
            return new zzac(15, zzy);
        }
        if (i2 == 5) {
            return zzy;
        }
        if (i2 != 6) {
            throw null;
        }
        zzblh zzblhVar2 = zzz;
        if (zzblhVar2 != null) {
            return zzblhVar2;
        }
        synchronized (zzacu.class) {
            try {
                zzblhVar = zzz;
                if (zzblhVar == null) {
                    zzblhVar = new zzbjm(zzy);
                    zzz = zzblhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzblhVar;
    }
}
