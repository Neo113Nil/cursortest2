package com.google.android.gms.internal.mlkit_genai_prompt;

/* loaded from: classes4.dex */
public final class zzhd extends zzals {
    private static final zzhd zzb;
    private int zzd;
    private long zze;
    private zzalw zzf = zzamz.zzb;
    private zzalc zzg;
    private float zzh;

    static {
        zzhd zzhdVar = new zzhd();
        zzb = zzhdVar;
        zzals.zzt(zzhd.class, zzhdVar);
    }

    public static zzhd zze() {
        return zzb;
    }

    public static zzhd zzf(byte[] bArr, zzalf zzalfVar) {
        return (zzhd) zzals.zzm(zzb, bArr, zzalfVar);
    }

    public final float zza() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzals
    public final Object zzb(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzana(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဃ\u0000\u0002\u001b\u0003ဉ\u0001\u0004ခ\u0002", new Object[]{"zzd", "zze", "zzf", zzhb.class, "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzhd();
        }
        if (i2 == 4) {
            return new zza(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }

    public final long zzc() {
        return this.zze;
    }

    public final zzalc zzg() {
        zzalc zzalcVar = this.zzg;
        return zzalcVar == null ? zzalc.zzd() : zzalcVar;
    }

    public final zzalw zzh() {
        return this.zzf;
    }
}
