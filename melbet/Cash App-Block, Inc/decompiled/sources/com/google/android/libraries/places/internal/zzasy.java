package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzasy extends zzbjr {
    private static final zzasy zzl;
    private static volatile zzblh zzm;
    private int zzb;
    private zzahz zzf;
    private byte zzk = 2;
    private String zze = "";
    private String zzg = "";
    private zzbkb zzh = zzblk.zzb;
    private String zzi = "";
    private String zzj = "";

    static {
        zzasy zzasyVar = new zzasy();
        zzl = zzasyVar;
        zzbjr.zzbF(zzasy.class, zzasyVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzk);
        }
        if (i2 == 2) {
            return new zzbll(zzl, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ဈ\u0002\u0004\u001a\u0005ဈ\u0003\u0006ဈ\u0004", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new zzasy();
        }
        if (i2 == 4) {
            return new zzaq(zzl);
        }
        if (i2 == 5) {
            return zzl;
        }
        if (i2 != 6) {
            this.zzk = zzbjrVar == null ? (byte) 0 : (byte) 1;
            return null;
        }
        zzblh zzblhVar2 = zzm;
        if (zzblhVar2 != null) {
            return zzblhVar2;
        }
        synchronized (zzasy.class) {
            try {
                zzblhVar = zzm;
                if (zzblhVar == null) {
                    zzblhVar = new zzbjm(zzl);
                    zzm = zzblhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzblhVar;
    }
}
