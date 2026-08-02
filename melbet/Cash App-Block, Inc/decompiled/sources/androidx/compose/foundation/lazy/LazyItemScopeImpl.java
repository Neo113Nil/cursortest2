package androidx.compose.foundation.lazy;

import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutAnimateItemElement;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.unit.IntOffset;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class LazyItemScopeImpl {
    public ParcelableSnapshotMutableIntState maxHeightState;
    public ParcelableSnapshotMutableIntState maxWidthState;

    public static Modifier animateItem$default(LazyItemScopeImpl lazyItemScopeImpl, Modifier modifier) {
        SpringSpec spring$default = AnimatableKt.spring$default(RecyclerView.DECELERATION_RATE, 400.0f, null, 5);
        Rect rect = VisibilityThresholdsKt.RectVisibilityThreshold;
        SpringSpec spring$default2 = AnimatableKt.spring$default(RecyclerView.DECELERATION_RATE, 400.0f, new IntOffset(4294967297L), 1);
        SpringSpec spring$default3 = AnimatableKt.spring$default(RecyclerView.DECELERATION_RATE, 400.0f, null, 5);
        lazyItemScopeImpl.getClass();
        return modifier.then(new LazyLayoutAnimateItemElement(spring$default, spring$default2, spring$default3));
    }

    public static Modifier fillParentMaxHeight$default(LazyItemScopeImpl lazyItemScopeImpl) {
        return new ParentSizeElement(null, lazyItemScopeImpl.maxHeightState, "fillParentMaxHeight", 2);
    }

    public static Modifier fillParentMaxSize$default(LazyItemScopeImpl lazyItemScopeImpl) {
        return new ParentSizeElement(lazyItemScopeImpl.maxWidthState, lazyItemScopeImpl.maxHeightState, "fillParentMaxSize");
    }

    public static Modifier fillParentMaxWidth$default(LazyItemScopeImpl lazyItemScopeImpl) {
        return new ParentSizeElement(lazyItemScopeImpl.maxWidthState, null, "fillParentMaxWidth", 4);
    }
}
