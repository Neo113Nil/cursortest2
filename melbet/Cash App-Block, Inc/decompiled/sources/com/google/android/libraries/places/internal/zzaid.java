package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzaid extends zzbjr {
    private static final zzaid zzr;
    private static volatile zzblh zzs;
    private int zzb;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private int zzq;

    static {
        zzaid zzaidVar = new zzaid();
        zzr = zzaidVar;
        zzbjr.zzbF(zzaid.class, zzaidVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzr, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဋ\u0003\u0005ဋ\u0004\u0006ဋ\u0005\u0007ဋ\u0006\bဋ\u0007\tဋ\b\nဋ\t\u000bဋ\n\fဋ\u000b\rဋ\f", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq"});
        }
        if (i2 == 3) {
            return new zzaid();
        }
        if (i2 == 4) {
            return new zzaj(zzr);
        }
        if (i2 == 5) {
            return zzr;
        }
        if (i2 != 6) {
            throw null;
        }
        zzblh zzblhVar2 = zzs;
        if (zzblhVar2 != null) {
            return zzblhVar2;
        }
        synchronized (zzaid.class) {
            try {
                zzblhVar = zzs;
                if (zzblhVar == null) {
                    zzblhVar = new zzbjm(zzr);
                    zzs = zzblhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzblhVar;
    }
}
