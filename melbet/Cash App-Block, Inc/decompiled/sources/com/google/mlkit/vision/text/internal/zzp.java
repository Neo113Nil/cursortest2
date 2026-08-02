package com.google.mlkit.vision.text.internal;

import android.content.Context;
import com.android.volley.Response;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.internal.mlkit_vision_text_common.zzuc;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.vision.text.latin.TextRecognizerOptions;
import com.miteksystems.misnap.workflow.util.TextUtil;
import papa.InteractionResult;

/* loaded from: classes.dex */
public final class zzp extends InteractionResult {
    public final MlKitContext zza;

    public zzp(MlKitContext mlKitContext) {
        super((byte) 0, 4);
        this.zza = mlKitContext;
    }

    @Override // papa.InteractionResult
    public final Object create(Object obj) {
        TextRecognizerOptions textRecognizerOptions = (TextRecognizerOptions) obj;
        zzuc zzb = TextUtil.zzb(textRecognizerOptions.getLoggingLibraryName());
        Context applicationContext = this.zza.getApplicationContext();
        GoogleApiAvailabilityLight.zza.getClass();
        return new TextRecognizerTaskWithResource(zzb, (GoogleApiAvailabilityLight.getApkVersion(applicationContext) >= 204700000 || textRecognizerOptions.getIsThickClient()) ? new zzd(applicationContext, textRecognizerOptions, zzb) : new Response(applicationContext), textRecognizerOptions);
    }
}
