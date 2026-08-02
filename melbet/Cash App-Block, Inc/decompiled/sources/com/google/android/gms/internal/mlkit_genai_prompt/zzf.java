package com.google.android.gms.internal.mlkit_genai_prompt;

/* loaded from: classes4.dex */
public final class zzf extends zzals {
    private static final zzf zzb;
    private int zzd = 0;
    private Object zze;

    static {
        zzf zzfVar = new zzf();
        zzb = zzfVar;
        zzals.zzt(zzf.class, zzfVar);
    }

    public static zzf zzc() {
        return zzb;
    }

    public static zzf zzd(byte[] bArr, zzalf zzalfVar) {
        return (zzf) zzals.zzm(zzb, bArr, zzalfVar);
    }

    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzals
    public final Object zzb(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzana(zzb, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"zze", "zzd", zzi.class, zzc.class});
        }
        if (i2 == 3) {
            return new zzf();
        }
        if (i2 == 4) {
            return new zza(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }

    public final zzi zze() {
        return this.zzd == 1 ? (zzi) this.zze : zzi.zzf();
    }

    public final boolean zzf() {
        return this.zzd == 1;
    }
}
