package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzapi extends zzbjr {
    private static final zzapi zzg;
    private static volatile zzblh zzh;
    private int zzb;
    private int zze;
    private long zzf;

    static {
        zzapi zzapiVar = new zzapi();
        zzg = zzapiVar;
        zzbjr.zzbF(zzapi.class, zzapiVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဃ\u0001", new Object[]{"zzb", "zze", zzanz.zza$9, "zzf"});
        }
        if (i2 == 3) {
            return new zzapi();
        }
        if (i2 == 4) {
            return new zzaq(zzg);
        }
        if (i2 == 5) {
            return zzg;
        }
        if (i2 != 6) {
            throw null;
        }
        zzblh zzblhVar2 = zzh;
        if (zzblhVar2 != null) {
            return zzblhVar2;
        }
        synchronized (zzapi.class) {
            try {
                zzblhVar = zzh;
                if (zzblhVar == null) {
                    zzblhVar = new zzbjm(zzg);
                    zzh = zzblhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzblhVar;
    }
}
