package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import bo.app.a$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public final class zzu extends zzeh implements zzfn {
    private static final zzu zzb;
    private int zzd;
    private long zze;
    private long zzf;
    private zzjv zzg;
    private byte zzh = 2;

    static {
        zzu zzuVar = new zzu();
        zzb = zzuVar;
        zzeh.zzV(zzu.class, zzuVar);
        zzjv zzf = zzjv.zzf();
        zzhf zzhfVar = zzhf.zzj;
        if (zzf != null) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$3("Null containingTypeDefaultInstance");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh
    public final Object zzg(int i, zzeh zzehVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzh);
        }
        if (i2 == 2) {
            return new zzfw(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᔅ\u0000\u0002ᔅ\u0001\u0003ᐉ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzu();
        }
        if (i2 == 4) {
            return new zzl(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        this.zzh = zzehVar == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
