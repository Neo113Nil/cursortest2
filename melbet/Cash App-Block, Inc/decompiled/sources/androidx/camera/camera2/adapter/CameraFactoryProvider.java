package androidx.camera.camera2.adapter;

import android.content.Context;
import androidx.biometric.BiometricPrompt;
import androidx.camera.camera2.pipe.core.DurationNs;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.CameraXConfig;
import androidx.camera.core.impl.AutoValue_CameraThreadConfig;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.OptionsBundle;
import androidx.camera.video.Recorder;
import androidx.media3.common.util.StuckPlayerDetector;
import bo.app.l2$$ExternalSyntheticLambda7;
import kotlin.Lazy;
import kotlin.LazyKt;

/* loaded from: classes3.dex */
public final class CameraFactoryProvider {
    public final Recorder.AnonymousClass1 sharedInteropCallbacks = new Recorder.AnonymousClass1(5);

    public final StuckPlayerDetector newInstance(Context context, AutoValue_CameraThreadConfig autoValue_CameraThreadConfig, CameraSelector cameraSelector, long j, CameraXConfig cameraXConfig, Recorder.AnonymousClass1 anonymousClass1) {
        context.getClass();
        Lazy lazy = LazyKt.lazy(new l2$$ExternalSyntheticLambda7(this, context, autoValue_CameraThreadConfig, j == -1 ? null : new DurationNs(j), 2));
        if (cameraXConfig == null) {
            cameraXConfig = new CameraXConfig(OptionsBundle.from((MutableOptionsBundle) new BiometricPrompt(9).mClientFragmentManager));
        }
        return new StuckPlayerDetector(lazy, context, autoValue_CameraThreadConfig, this.sharedInteropCallbacks, cameraSelector, anonymousClass1, cameraXConfig);
    }
}
