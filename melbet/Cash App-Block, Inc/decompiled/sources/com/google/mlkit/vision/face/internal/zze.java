package com.google.mlkit.vision.face.internal;

import android.content.Context;
import com.datadog.trace.core.util.JsonObjectUtils;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.internal.mlkit_vision_face.zzoc;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.vision.face.FaceDetectorOptions;
import papa.InteractionResult;

/* loaded from: classes.dex */
public final class zze extends InteractionResult {
    public final MlKitContext zza;

    public zze(MlKitContext mlKitContext) {
        super((byte) 0, 4);
        this.zza = mlKitContext;
    }

    @Override // papa.InteractionResult
    public final Object create(Object obj) {
        zzb zzaVar;
        FaceDetectorOptions faceDetectorOptions = (FaceDetectorOptions) obj;
        Context applicationContext = this.zza.getApplicationContext();
        zzoc zzb = JsonObjectUtils.zzb(zzj.zzb());
        if (!zza.zzc(applicationContext)) {
            GoogleApiAvailabilityLight.zza.getClass();
            if (GoogleApiAvailabilityLight.getApkVersion(applicationContext) < 204500000) {
                zzaVar = new zzm(applicationContext, faceDetectorOptions, zzb);
                return new zzh(JsonObjectUtils.zzb(zzj.zzb()), faceDetectorOptions, zzaVar);
            }
        }
        zzaVar = new zza(applicationContext, faceDetectorOptions, zzb);
        return new zzh(JsonObjectUtils.zzb(zzj.zzb()), faceDetectorOptions, zzaVar);
    }
}
