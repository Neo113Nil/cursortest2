package androidx.camera.camera2.compat;

import android.hardware.camera2.params.DynamicRangeProfiles;
import androidx.camera.core.DynamicRange;
import androidx.camera.video.Recorder;
import androidx.room.TransactorKt;
import java.util.Set;
import kotlin.collections.SetsKt__SetsJVMKt;

/* loaded from: classes3.dex */
public final class DynamicRangeProfilesCompatBaseImpl implements DynamicRangeProfilesCompat$DynamicRangeProfilesCompatImpl {
    public static final Recorder.AnonymousClass6 COMPAT_INSTANCE = new Recorder.AnonymousClass6(new DynamicRangeProfilesCompatBaseImpl(), 6);
    public static final Set SDR_ONLY = SetsKt__SetsJVMKt.setOf(DynamicRange.SDR);

    @Override // androidx.camera.camera2.compat.DynamicRangeProfilesCompat$DynamicRangeProfilesCompatImpl
    public final Set getDynamicRangeCaptureRequestConstraints(DynamicRange dynamicRange) {
        dynamicRange.getClass();
        TransactorKt.checkArgument("DynamicRange is not supported: " + dynamicRange, DynamicRange.SDR.equals(dynamicRange));
        return SDR_ONLY;
    }

    @Override // androidx.camera.camera2.compat.DynamicRangeProfilesCompat$DynamicRangeProfilesCompatImpl
    public final Set getSupportedDynamicRanges() {
        return SDR_ONLY;
    }

    @Override // androidx.camera.camera2.compat.DynamicRangeProfilesCompat$DynamicRangeProfilesCompatImpl
    public final DynamicRangeProfiles unwrap() {
        return null;
    }
}
