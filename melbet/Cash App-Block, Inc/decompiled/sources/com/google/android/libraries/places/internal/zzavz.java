package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzavz extends zzbjr {
    private static final zzavz zzk;
    private static volatile zzblh zzl;
    private int zzb;
    private zzaib zze;
    private int zzf;
    private int zzg;
    private int zzi;
    private byte zzj = 2;
    private String zzh = "";

    static {
        zzavz zzavzVar = new zzavz();
        zzk = zzavzVar;
        zzbjr.zzbF(zzavz.class, zzavzVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzj);
        }
        if (i2 == 2) {
            return new zzbll(zzk, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001ᐉ\u0000\u0002င\u0001\u0003င\u0002\u0004ဈ\u0003\u0005᠌\u0004", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", zzc.zza$9});
        }
        if (i2 == 3) {
            return new zzavz();
        }
        if (i2 == 4) {
            return new zzaw(zzk);
        }
        if (i2 == 5) {
            return zzk;
        }
        if (i2 != 6) {
            this.zzj = zzbjrVar == null ? (byte) 0 : (byte) 1;
            return null;
        }
        zzblh zzblhVar2 = zzl;
        if (zzblhVar2 != null) {
            return zzblhVar2;
        }
        synchronized (zzavz.class) {
            try {
                zzblhVar = zzl;
                if (zzblhVar == null) {
                    zzblhVar = new zzbjm(zzk);
                    zzl = zzblhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzblhVar;
    }
}
