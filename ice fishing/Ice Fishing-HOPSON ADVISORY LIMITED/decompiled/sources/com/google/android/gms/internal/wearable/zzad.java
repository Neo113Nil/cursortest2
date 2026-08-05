package com.google.android.gms.internal.wearable;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
public final class zzad extends zzdg implements zzem {
    private static final zzad zzf;
    private static volatile zzes zzg;
    private byte zze = 2;
    private zzdp zzb = zzaa();

    static {
        zzad zzadVar = new zzad();
        zzf = zzadVar;
        zzdg.zzV(zzad.class, zzadVar);
    }

    private zzad() {
    }

    public static zzad zzb(byte[] bArr) throws zzdv {
        return (zzad) zzdg.zzac(zzf, bArr);
    }

    public static zzad zzc(byte[] bArr, zzcs zzcsVar) throws zzdv {
        return (zzad) zzdg.zzad(zzf, bArr, zzcsVar);
    }

    public static zzu zzd() {
        return (zzu) zzf.zzR();
    }

    public final List zza() {
        return this.zzb;
    }

    final /* synthetic */ void zze(Iterable iterable) {
        zzdp zzdpVar = this.zzb;
        if (!zzdpVar.zza()) {
            this.zzb = zzdg.zzab(zzdpVar);
        }
        zzbr.zzK(iterable, this.zzb);
    }

    @Override // com.google.android.gms.internal.wearable.zzdg
    protected final Object zzG(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zze);
        }
        if (i2 == 2) {
            return zzW(zzf, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"zzb", zzac.class});
        }
        if (i2 == 3) {
            return new zzad();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzu(bArr);
        }
        if (i2 == 5) {
            return zzf;
        }
        if (i2 != 6) {
            this.zze = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        zzes zzesVar = zzg;
        if (zzesVar == null) {
            synchronized (zzad.class) {
                zzesVar = zzg;
                if (zzesVar == null) {
                    zzesVar = new zzdc(zzf);
                    zzg = zzesVar;
                }
            }
        }
        return zzesVar;
    }
}
