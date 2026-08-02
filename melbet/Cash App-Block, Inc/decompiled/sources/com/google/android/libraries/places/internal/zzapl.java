package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzapl extends zzbjr {
    private static final zzapl zzk;
    private static volatile zzblh zzl;
    private int zzb;
    private int zze;
    private zzapi zzf;
    private zzapi zzg;
    private int zzh;
    private zzapn zzi;
    private zzaof zzj;

    static {
        zzapl zzaplVar = new zzapl();
        zzk = zzaplVar;
        zzbjr.zzbF(zzapl.class, zzaplVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzk, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004᠌\u0003\u0005ဉ\u0004\u0006ဉ\u0005", new Object[]{"zzb", "zze", zzanz.zza$10, "zzf", "zzg", "zzh", zzanz.zza$11, "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new zzapl();
        }
        if (i2 == 4) {
            return new zzaq(zzk);
        }
        if (i2 == 5) {
            return zzk;
        }
        if (i2 != 6) {
            throw null;
        }
        zzblh zzblhVar2 = zzl;
        if (zzblhVar2 != null) {
            return zzblhVar2;
        }
        synchronized (zzapl.class) {
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
