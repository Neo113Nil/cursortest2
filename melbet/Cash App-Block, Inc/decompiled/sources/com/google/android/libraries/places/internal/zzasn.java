package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzasn extends zzbjr {
    private static final zzasn zzb;
    private static volatile zzblh zze;

    static {
        zzasn zzasnVar = new zzasn();
        zzb = zzasnVar;
        zzbjr.zzbF(zzasn.class, zzasnVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzb, "\u0001\u0000", null);
        }
        if (i2 == 3) {
            return new zzasn();
        }
        if (i2 == 4) {
            return new zzaq(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        if (i2 != 6) {
            throw null;
        }
        zzblh zzblhVar2 = zze;
        if (zzblhVar2 != null) {
            return zzblhVar2;
        }
        synchronized (zzasn.class) {
            try {
                zzblhVar = zze;
                if (zzblhVar == null) {
                    zzblhVar = new zzbjm(zzb);
                    zze = zzblhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzblhVar;
    }
}
