package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzaqn extends zzbjr {
    private static final zzaqn zzj;
    private static volatile zzblh zzk;
    private int zzb;
    private zzbjz zze = zzbjs.zzb;
    private zzbkb zzf = zzblk.zzb;
    private String zzg = "";
    private boolean zzh;
    private int zzi;

    static {
        zzaqn zzaqnVar = new zzaqn();
        zzj = zzaqnVar;
        zzbjr.zzbF(zzaqn.class, zzaqnVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzj, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001\u0016\u0002\u001a\u0003ဈ\u0000\u0004ဇ\u0001\u0005ဋ\u0002", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new zzaqn();
        }
        if (i2 == 4) {
            return new zzaq(zzj);
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
        synchronized (zzaqn.class) {
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
}
