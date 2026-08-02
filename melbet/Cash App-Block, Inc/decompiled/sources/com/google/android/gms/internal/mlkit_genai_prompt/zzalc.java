package com.google.android.gms.internal.mlkit_genai_prompt;

/* loaded from: classes4.dex */
public final class zzalc extends zzals {
    private static final zzalc zzb;
    private long zzd;
    private int zze;

    static {
        zzalc zzalcVar = new zzalc();
        zzb = zzalcVar;
        zzals.zzt(zzalc.class, zzalcVar);
    }

    public static zzalc zzd() {
        return zzb;
    }

    public final long zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzals
    public final Object zzb(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzana(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"zzd", "zze"});
        }
        if (i2 == 3) {
            return new zzalc();
        }
        if (i2 == 4) {
            return new zza(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
