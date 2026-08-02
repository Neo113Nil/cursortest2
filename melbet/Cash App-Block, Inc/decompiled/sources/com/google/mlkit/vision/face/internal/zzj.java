package com.google.mlkit.vision.face.internal;

import com.fillr.e0;
import com.google.android.gms.internal.mlkit_vision_face.zzjy;
import com.google.android.gms.internal.mlkit_vision_face.zzjz;
import com.google.android.gms.internal.mlkit_vision_face.zzka;
import com.google.android.gms.internal.mlkit_vision_face.zzkb;
import com.google.android.gms.internal.mlkit_vision_face.zzkd;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.vision.face.FaceDetectorOptions;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public abstract class zzj {
    public static final AtomicReference zza = new AtomicReference();

    public static zzkd zza(FaceDetectorOptions faceDetectorOptions) {
        e0 e0Var = new e0(18);
        int i = faceDetectorOptions.zza;
        e0Var.a = i != 1 ? i != 2 ? zzka.UNKNOWN_LANDMARKS : zzka.ALL_LANDMARKS : zzka.NO_LANDMARKS;
        e0Var.b = zzjy.NO_CLASSIFICATIONS;
        e0Var.c = zzkb.FAST;
        e0Var.i = zzjz.NO_CONTOURS;
        e0Var.f = Boolean.FALSE;
        e0Var.h = Float.valueOf(faceDetectorOptions.zzf);
        return new zzkd(e0Var);
    }

    public static String zzb() {
        return true != zzd() ? "play-services-mlkit-face-detection" : "face-detection";
    }

    public static boolean zzd() {
        AtomicReference atomicReference = zza;
        if (atomicReference.get() != null) {
            return ((Boolean) atomicReference.get()).booleanValue();
        }
        boolean zzc = zza.zzc(MlKitContext.getInstance().getApplicationContext());
        atomicReference.set(Boolean.valueOf(zzc));
        return zzc;
    }
}
