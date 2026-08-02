package defpackage;

import com.cloudwebrtc.webrtc.video.camera.CameraRegionUtils;
import java.util.function.IntPredicate;

/* loaded from: classes10.dex */
public final /* synthetic */ class ts7 implements IntPredicate {
    @Override // java.util.function.IntPredicate
    public final boolean test(int i) {
        boolean lambda$supportsDistortionCorrection$0;
        lambda$supportsDistortionCorrection$0 = CameraRegionUtils.lambda$supportsDistortionCorrection$0(i);
        return lambda$supportsDistortionCorrection$0;
    }
}
