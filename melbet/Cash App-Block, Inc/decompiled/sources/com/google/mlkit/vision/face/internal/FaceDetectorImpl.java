package com.google.mlkit.vision.face.internal;

import com.datadog.trace.core.util.JsonObjectUtils;
import com.fillr.e0;
import com.fillr.profile.adapter.ProfileAdapter;
import com.google.android.gms.common.Feature;
import com.google.android.gms.internal.mlkit_vision_face.zzkr;
import com.google.android.gms.internal.mlkit_vision_face.zzkt;
import com.google.android.gms.internal.mlkit_vision_face.zzll;
import com.google.android.gms.internal.mlkit_vision_face.zzoc;
import com.google.mlkit.common.sdkinternal.ExecutorSelector;
import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import com.google.mlkit.vision.common.internal.MobileVisionBase;
import com.google.mlkit.vision.face.FaceDetector;
import com.google.mlkit.vision.face.FaceDetectorOptions;
import com.nimbusds.jose.JWECryptoParts;
import java.util.concurrent.Executor;
import org.brotli.dec.HuffmanTreeGroup;

/* loaded from: classes4.dex */
public final class FaceDetectorImpl extends MobileVisionBase implements FaceDetector {
    public final boolean zzc;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FaceDetectorImpl(zzh zzhVar, ExecutorSelector executorSelector, FaceDetectorOptions faceDetectorOptions) {
        super(zzhVar, r9);
        Executor executor = (Executor) executorSelector.zza.get();
        zzoc zzb = JsonObjectUtils.zzb(zzj.zzb());
        boolean zzd = zzj.zzd();
        this.zzc = zzd;
        e0 e0Var = new e0(19);
        e0Var.c = zzd ? zzkr.TYPE_THICK : zzkr.TYPE_THIN;
        JWECryptoParts jWECryptoParts = new JWECryptoParts();
        jWECryptoParts.iv = zzj.zza(faceDetectorOptions);
        e0Var.i = new zzll(jWECryptoParts);
        com.google.mlkit.common.sdkinternal.zzh.zza.execute(new ProfileAdapter.AnonymousClass8((Object) zzb, (Object) new HuffmanTreeGroup(e0Var, 1), (Enum) zzkt.ON_DEVICE_FACE_CREATE, zzb.zzj(), 7));
    }

    @Override // com.google.android.gms.common.api.OptionalModuleApi
    public final Feature[] getOptionalFeatures() {
        return this.zzc ? OptionalModuleUtils.EMPTY_FEATURES : new Feature[]{OptionalModuleUtils.FEATURE_FACE};
    }
}
