package androidx.compose.foundation.lazy.grid;

import androidx.camera.video.Recorder;
import androidx.compose.material3.TextKt$$ExternalSyntheticLambda0;
import androidx.compose.ui.unit.ConstraintsKt;

/* loaded from: classes3.dex */
public final class GridSlotCache {
    public long cachedConstraints = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15);
    public float cachedDensity;
    public Recorder.AnonymousClass4 cachedSizes;
    public final TextKt$$ExternalSyntheticLambda0 calculation;

    public GridSlotCache(TextKt$$ExternalSyntheticLambda0 textKt$$ExternalSyntheticLambda0) {
        this.calculation = textKt$$ExternalSyntheticLambda0;
    }
}
