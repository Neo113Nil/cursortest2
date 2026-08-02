package androidx.compose.animation;

import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class ContentTransform {
    public final ExitTransitionImpl initialContentExit;
    public SizeTransformImpl sizeTransform;
    public final EnterTransitionImpl targetContentEnter;
    public final ParcelableSnapshotMutableFloatState targetContentZIndex$delegate;

    public /* synthetic */ ContentTransform(EnterTransitionImpl enterTransitionImpl, ExitTransitionImpl exitTransitionImpl, float f, int i) {
        this(enterTransitionImpl, exitTransitionImpl, (i & 4) != 0 ? RecyclerView.DECELERATION_RATE : f, (i & 8) != 0 ? AnimatedContentKt.SizeTransform$default(3, null) : null);
    }

    public ContentTransform(EnterTransitionImpl enterTransitionImpl, ExitTransitionImpl exitTransitionImpl, float f, SizeTransformImpl sizeTransformImpl) {
        this.targetContentEnter = enterTransitionImpl;
        this.initialContentExit = exitTransitionImpl;
        this.targetContentZIndex$delegate = new ParcelableSnapshotMutableFloatState(f);
        this.sizeTransform = sizeTransformImpl;
    }
}
