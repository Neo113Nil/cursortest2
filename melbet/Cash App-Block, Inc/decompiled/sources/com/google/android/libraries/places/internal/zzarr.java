package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzarr extends zzbjr {
    private static final zzarr zzp;
    private static volatile zzblh zzq;
    private int zzb;
    private zzarj zzg;
    private zzaib zzh;
    private int zzk;
    private int zzl;
    private int zzn;
    private byte zzo = 2;
    private String zze = "";
    private String zzf = "";
    private int zzi = 1;
    private String zzj = "";
    private String zzm = "";

    static {
        zzarr zzarrVar = new zzarr();
        zzp = zzarrVar;
        zzbjr.zzbF(zzarr.class, zzarrVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzo);
        }
        if (i2 == 2) {
            return new zzbll(zzp, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ᐉ\u0003\u0005᠌\u0004\u0006ဈ\u0005\u0007᠌\u0006\bင\u0007\tဈ\b\n᠌\t", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", zzat.zza$3, "zzj", "zzk", zzat.zza$5, "zzl", "zzm", "zzn", zzat.zza$4});
        }
        if (i2 == 3) {
            return new zzarr();
        }
        if (i2 == 4) {
            return new zzaq(zzp);
        }
        if (i2 == 5) {
            return zzp;
        }
        if (i2 != 6) {
            this.zzo = zzbjrVar == null ? (byte) 0 : (byte) 1;
            return null;
        }
        zzblh zzblhVar2 = zzq;
        if (zzblhVar2 != null) {
            return zzblhVar2;
        }
        synchronized (zzarr.class) {
            try {
                zzblhVar = zzq;
                if (zzblhVar == null) {
                    zzblhVar = new zzbjm(zzp);
                    zzq = zzblhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzblhVar;
    }
}
