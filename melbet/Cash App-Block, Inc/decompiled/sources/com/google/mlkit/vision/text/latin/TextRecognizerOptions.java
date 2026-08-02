package com.google.mlkit.vision.text.latin;

import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public final class TextRecognizerOptions {
    public static final TextRecognizerOptions DEFAULT_OPTIONS = new TextRecognizerOptions();
    public final AtomicReference zza = new AtomicReference();
    public final String zzc = "taser_tflite_gocrlatin_mbv2_scriptid_aksara_layout_gcn_mobile";

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof TextRecognizerOptions) {
            return zzae.equal(null, null);
        }
        return false;
    }

    public final boolean getIsThickClient() {
        AtomicReference atomicReference = this.zza;
        if (atomicReference.get() != null) {
            return ((Boolean) atomicReference.get()).booleanValue();
        }
        boolean z = DynamiteModule.getLocalVersion(MlKitContext.getInstance().getApplicationContext(), "com.google.mlkit.dynamite.text.latin") > 0;
        atomicReference.set(Boolean.valueOf(z));
        return z;
    }

    public final String getLoggingLibraryName() {
        return true != getIsThickClient() ? "play-services-mlkit-text-recognition" : "text-recognition";
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null});
    }
}
