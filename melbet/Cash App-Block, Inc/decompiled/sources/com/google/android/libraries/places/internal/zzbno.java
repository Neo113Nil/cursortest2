package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbno extends zzbjr {
    private static final zzbno zzj;
    private static volatile zzblh zzk;
    private int zzb;
    private long zze;
    private zzbbg zzh;
    private zzbim zzf = zzbim.zza;
    private String zzg = "";
    private String zzi = "";

    static {
        zzbno zzbnoVar = new zzbno();
        zzj = zzbnoVar;
        zzbjr.zzbF(zzbno.class, zzbnoVar);
    }

    public static zzbnn zzc() {
        return (zzbnn) zzj.zzbB();
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzj, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဃ\u0000\u0002ဈ\u0002\u0003ဉ\u0003\u0004ည\u0001\u0005ဈ\u0004", new Object[]{"zzb", "zze", "zzg", "zzh", "zzf", "zzi"});
        }
        if (i2 == 3) {
            return new zzbno();
        }
        if (i2 == 4) {
            return new zzbnn(zzj);
        }
        if (i2 == 5) {
            return zzj;
        }
        if (i2 != 6) {
            throw null;
        }
        zzblh zzblhVar2 = zzk;
        if (zzblhVar2 != null) {
            return zzblhVar2;
        }
        synchronized (zzbno.class) {
            try {
                zzblhVar = zzk;
                if (zzblhVar == null) {
                    zzblhVar = new zzbjm(zzj);
                    zzk = zzblhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzblhVar;
    }

    public final /* synthetic */ void zze(String str) {
        str.getClass();
        this.zzb |= 4;
        this.zzg = str;
    }
}
