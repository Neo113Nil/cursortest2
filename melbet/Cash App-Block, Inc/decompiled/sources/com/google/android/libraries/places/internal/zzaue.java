package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzaue extends zzbjr {
    private static final zzaue zzg;
    private static volatile zzblh zzh;
    private int zzb;
    private zzahz zze;
    private byte zzf = 2;

    static {
        zzaue zzaueVar = new zzaue();
        zzg = zzaueVar;
        zzbjr.zzbF(zzaue.class, zzaueVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzf);
        }
        if (i2 == 2) {
            return new zzbll(zzg, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"zzb", "zze"});
        }
        if (i2 == 3) {
            return new zzaue();
        }
        if (i2 == 4) {
            return new zzaq(zzg);
        }
        if (i2 == 5) {
            return zzg;
        }
        if (i2 != 6) {
            this.zzf = zzbjrVar == null ? (byte) 0 : (byte) 1;
            return null;
        }
        zzblh zzblhVar2 = zzh;
        if (zzblhVar2 != null) {
            return zzblhVar2;
        }
        synchronized (zzaue.class) {
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
