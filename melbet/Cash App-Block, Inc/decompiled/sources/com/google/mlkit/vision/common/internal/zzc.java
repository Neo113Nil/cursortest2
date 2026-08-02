package com.google.mlkit.vision.common.internal;

import android.graphics.Bitmap;
import android.media.Image;
import android.util.Log;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.vision.common.InputImage;
import com.squareup.cash.clientroutes.PatternRedaction;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public final /* synthetic */ class zzc implements OnFailureListener {
    public static final zzc zzb = new zzc();
    public static final /* synthetic */ zzc zza = new zzc();

    public static ObjectWrapper getImageDataWrapper(InputImage inputImage) {
        int i = inputImage.zzg;
        if (i == -1) {
            Bitmap bitmap = inputImage.zza;
            zzae.checkNotNull(bitmap);
            return new ObjectWrapper(bitmap);
        }
        if (i != 17) {
            if (i == 35) {
                return new ObjectWrapper(inputImage.zzc == null ? null : (Image) inputImage.zzc.zza);
            }
            if (i != 842094169) {
                throw new MlKitException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(inputImage.zzg, "Unsupported image format: "), 3);
            }
        }
        ByteBuffer byteBuffer = inputImage.zzb;
        zzae.checkNotNull(byteBuffer);
        return new ObjectWrapper(byteBuffer);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        PatternRedaction patternRedaction = MobileVisionBase.zzb;
        if (Log.isLoggable(patternRedaction.pattern, 6)) {
            Log.e("MobileVisionBase", patternRedaction.zza("Error preloading model resource"), exc);
        }
    }
}
