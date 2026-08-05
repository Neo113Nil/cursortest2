package com.google.android.gms.internal.wearable;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
public final class zzac extends zzdg implements zzem {
    private static final zzac zzh;
    private static volatile zzes zzi;
    private int zzb;
    private zzab zzf;
    private byte zzg = 2;
    private String zze = "";

    static {
        zzac zzacVar = new zzac();
        zzh = zzacVar;
        zzdg.zzV(zzac.class, zzacVar);
    }

    private zzac() {
    }

    public static zzv zzc() {
        return (zzv) zzh.zzR();
    }

    public final String zza() {
        return this.zze;
    }

    public final zzab zzb() {
        zzab zzabVar = this.zzf;
        return zzabVar == null ? zzab.zzc() : zzabVar;
    }

    final /* synthetic */ void zzd(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    final /* synthetic */ void zze(zzab zzabVar) {
        zzabVar.getClass();
        this.zzf = zzabVar;
        this.zzb |= 2;
    }

    @Override // com.google.android.gms.internal.wearable.zzdg
    protected final Object zzG(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzg);
        }
        if (i2 == 2) {
            return zzW(zzh, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔈ\u0000\u0002ᔉ\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzac();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzv(bArr);
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
            synchronized (zzac.class) {
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
