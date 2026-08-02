package androidx.compose.foundation.text.input.internal;

import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class CursorAnimationState {
    public final boolean animate;
    public final AtomicReference animationJob = new AtomicReference(null);
    public final ParcelableSnapshotMutableFloatState cursorAlpha$delegate = new ParcelableSnapshotMutableFloatState(RecyclerView.DECELERATION_RATE);

    public CursorAnimationState(boolean z) {
        this.animate = z;
    }
}
