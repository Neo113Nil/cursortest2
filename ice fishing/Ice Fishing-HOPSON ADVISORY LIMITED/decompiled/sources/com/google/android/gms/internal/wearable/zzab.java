package com.google.android.gms.internal.wearable;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
public final class zzab extends zzdg implements zzem {
    private static final zzab zzh;
    private static volatile zzes zzi;
    private int zzb;
    private zzaa zzf;
    private byte zzg = 2;
    private int zze = 1;

    static {
        zzab zzabVar = new zzab();
        zzh = zzabVar;
        zzdg.zzV(zzab.class, zzabVar);
    }

    private zzab() {
    }

    public static zzw zzb() {
        return (zzw) zzh.zzR();
    }

    public static zzab zzc() {
        return zzh;
    }

    public final zzaa zza() {
        zzaa zzaaVar = this.zzf;
        return zzaaVar == null ? zzaa.zzq() : zzaaVar;
    }

    final /* synthetic */ void zzd(zzaa zzaaVar) {
        zzaaVar.getClass();
        this.zzf = zzaaVar;
        this.zzb |= 2;
    }

    public final int zzf() {
        int zza = zzy.zza(this.zze);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }

    final /* synthetic */ void zzg(int i) {
        this.zze = i;
        this.zzb |= 1;
    }

    @Override // com.google.android.gms.internal.wearable.zzdg
    protected final Object zzG(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzg);
        }
        if (i2 == 2) {
            return zzW(zzh, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᴌ\u0000\u0002ᐉ\u0001", new Object[]{"zzb", "zze", zzx.zza, "zzf"});
        }
        if (i2 == 3) {
            return new zzab();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzw(bArr);
        }
        if (i2 == 5) {
            return zzh;
        }
        if (i2 != 6) {
            this.zzg = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        zzes zzesVar = zzi;
        if (zzesVar == null) {
            synchronized (zzab.class) {
                zzesVar = zzi;
                if (zzesVar == null) {
                    zzesVar = new zzdc(zzh);
                    zzi = zzesVar;
                }
            }
        }
        return zzesVar;
    }
}
