package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzahz extends zzbjr {
    private static final zzahz zzh;
    private static volatile zzblh zzi;
    private int zzb;
    private int zze;
    private int zzf;
    private byte zzg = 2;

    static {
        zzahz zzahzVar = new zzahz();
        zzh = zzahzVar;
        zzbjr.zzbF(zzahz.class, zzahzVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzg);
        }
        if (i2 == 2) {
            return new zzbll(zzh, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔆ\u0000\u0002ᔆ\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzahz();
        }
        if (i2 == 4) {
            return new zzaj(zzh);
        }
        if (i2 == 5) {
            return zzh;
        }
        if (i2 != 6) {
            this.zzg = zzbjrVar == null ? (byte) 0 : (byte) 1;
            return null;
        }
        zzblh zzblhVar2 = zzi;
        if (zzblhVar2 != null) {
            return zzblhVar2;
        }
        synchronized (zzahz.class) {
            try {
                zzblhVar = zzi;
                if (zzblhVar == null) {
                    zzblhVar = new zzbjm(zzh);
                    zzi = zzblhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzblhVar;
    }
}
