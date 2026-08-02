package androidx.camera.camera2.compat;

import android.hardware.camera2.params.DynamicRangeProfiles;
import androidx.camera.core.DynamicRange;
import java.util.Set;

/* loaded from: classes3.dex */
public interface DynamicRangeProfilesCompat$DynamicRangeProfilesCompatImpl {
    Set getDynamicRangeCaptureRequestConstraints(DynamicRange dynamicRange);

    Set getSupportedDynamicRanges();

    DynamicRangeProfiles unwrap();
}
