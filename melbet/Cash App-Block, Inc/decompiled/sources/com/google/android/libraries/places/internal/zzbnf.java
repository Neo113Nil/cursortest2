package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbnf extends zzbjr {
    private static final zzbnf zzg;
    private static volatile zzblh zzh;
    private String zzb = "";
    private String zze = "";
    private String zzf = "";

    static {
        zzbnf zzbnfVar = new zzbnf();
        zzg = zzbnfVar;
        zzbjr.zzbF(zzbnf.class, zzbnfVar);
    }

    public static zzbnf zze() {
        return zzg;
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzg, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzbnf();
        }
        if (i2 == 4) {
            return new zzbk(zzg);
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
        synchronized (zzbnf.class) {
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

    public final String zzc() {
        return this.zzb;
    }
}
