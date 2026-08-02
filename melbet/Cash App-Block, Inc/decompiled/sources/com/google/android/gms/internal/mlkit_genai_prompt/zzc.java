package com.google.android.gms.internal.mlkit_genai_prompt;

/* loaded from: classes4.dex */
public final class zzc extends zzals {
    private static final zzc zzb;
    private int zzd;
    private int zze;

    static {
        zzc zzcVar = new zzc();
        zzb = zzcVar;
        zzals.zzt(zzc.class, zzcVar);
    }

    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzals
    public final Object zzb(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzana(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", zzanz.zza});
        }
        if (i2 == 3) {
            return new zzc();
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
