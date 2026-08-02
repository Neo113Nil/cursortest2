package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzan extends zzbjr {
    private static final zzan zzo;
    private static volatile zzblh zzp;
    private int zzb;
    private int zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;
    private int zzn;

    static {
        zzan zzanVar = new zzan();
        zzo = zzanVar;
        zzbjr.zzbF(zzan.class, zzanVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzo, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bဇ\u0007\tဇ\b\nင\t", new Object[]{"zzb", "zze", zzai.zza$15, "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn"});
        }
        if (i2 == 3) {
            return new zzan();
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
        synchronized (zzan.class) {
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
