package com.google.mlkit.vision.barcode.internal;

import android.content.Context;
import app.cash.zipline.loader.LoaderJniKt;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.internal.mlkit_vision_barcode.zzwp;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.vision.barcode.BarcodeScannerOptions;
import net.oneformapp.PopEncryptorV2_;
import papa.InteractionResult;

/* loaded from: classes.dex */
public final class zzi extends InteractionResult {
    public final MlKitContext zza;

    public zzi(MlKitContext mlKitContext) {
        super((byte) 0, 4);
        this.zza = mlKitContext;
    }

    @Override // papa.InteractionResult
    public final Object create(Object obj) {
        zzm zzoVar;
        BarcodeScannerOptions barcodeScannerOptions = (BarcodeScannerOptions) obj;
        MlKitContext mlKitContext = this.zza;
        Context applicationContext = mlKitContext.getApplicationContext();
        zzwp zzb = LoaderJniKt.zzb(zzb.zzd());
        if (!zzo.zzd(applicationContext)) {
            GoogleApiAvailabilityLight.zza.getClass();
            if (GoogleApiAvailabilityLight.getApkVersion(applicationContext) < 204500000) {
                zzoVar = new PopEncryptorV2_(applicationContext, barcodeScannerOptions, zzb);
                return new zzl(mlKitContext, barcodeScannerOptions, zzoVar, zzb);
            }
        }
        zzoVar = new zzo(applicationContext, barcodeScannerOptions, zzb);
        return new zzl(mlKitContext, barcodeScannerOptions, zzoVar, zzb);
    }
}
