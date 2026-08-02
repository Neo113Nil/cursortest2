package com.google.mlkit.vision.text.internal;

import com.fillr.e0;
import com.fillr.n;
import com.fillr.profile.adapter.ProfileAdapter;
import com.google.android.gms.common.Feature;
import com.google.android.gms.internal.mlkit_vision_text_common.zzdb;
import com.google.android.gms.internal.mlkit_vision_text_common.zzot;
import com.google.android.gms.internal.mlkit_vision_text_common.zzov;
import com.google.android.gms.internal.mlkit_vision_text_common.zzrz;
import com.google.android.gms.internal.mlkit_vision_text_common.zzsb;
import com.google.android.gms.internal.mlkit_vision_text_common.zzsd;
import com.google.android.gms.internal.mlkit_vision_text_common.zzuc;
import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import com.google.mlkit.common.sdkinternal.zzh;
import com.google.mlkit.vision.common.internal.MobileVisionBase;
import com.google.mlkit.vision.text.TextRecognizer;
import com.google.mlkit.vision.text.latin.TextRecognizerOptions;
import java.util.concurrent.Executor;
import org.brotli.dec.HuffmanTreeGroup;

/* loaded from: classes4.dex */
public final class zzn extends MobileVisionBase implements TextRecognizer {
    public final TextRecognizerOptions zzb;

    public zzn(TextRecognizerTaskWithResource textRecognizerTaskWithResource, Executor executor, zzuc zzucVar, TextRecognizerOptions textRecognizerOptions) {
        super(textRecognizerTaskWithResource, executor);
        this.zzb = textRecognizerOptions;
        e0 e0Var = new e0(20);
        e0Var.c = textRecognizerOptions.getIsThickClient() ? zzot.TYPE_THICK : zzot.TYPE_THIN;
        zzdb zzdbVar = new zzdb();
        n.b bVar = new n.b(24);
        bVar.b = zzsb.LATIN;
        zzdbVar.zze = new zzsd(bVar);
        e0Var.i = new zzrz(zzdbVar);
        zzh.zza.execute(new ProfileAdapter.AnonymousClass8((Object) zzucVar, (Object) new HuffmanTreeGroup(e0Var, 1, (byte) 0), (Enum) zzov.ON_DEVICE_TEXT_CREATE, zzucVar.zzj(), 8));
    }

    @Override // com.google.android.gms.common.api.OptionalModuleApi
    public final Feature[] getOptionalFeatures() {
        return this.zzb.getIsThickClient() ? OptionalModuleUtils.EMPTY_FEATURES : new Feature[]{OptionalModuleUtils.FEATURE_OCR};
    }
}
