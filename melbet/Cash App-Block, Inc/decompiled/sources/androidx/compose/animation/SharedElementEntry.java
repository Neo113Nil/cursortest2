package androidx.compose.animation;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.SharedTransitionScope;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.snapshots.StateListIterator;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.badging.backend.RealBadger2$clear$2;
import coil3.Extras;
import coil3.size.SizeKt;
import com.squareup.wire.GrpcMethod;
import java.util.Collection;
import java.util.ListIterator;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.JobKt;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public final class SharedElementEntry implements LayerRenderer, RememberObserver {
    public final ParcelableSnapshotMutableState boundsAnimation$delegate;
    public SharedBoundsNode boundsProvider;
    public AndroidPath clipPathInOverlay;
    public final ParcelableSnapshotMutableState overlayClip$delegate;
    public SharedElementEntry parentState;
    public final ParcelableSnapshotMutableState placeholderSize$delegate;
    public final ParcelableSnapshotMutableState renderOnlyWhenVisible$delegate;
    public final ParcelableSnapshotMutableState sharedElement$delegate;
    public final ParcelableSnapshotMutableState userState$delegate;
    public final ParcelableSnapshotMutableState isAttached$delegate = Updater.mutableStateOf$default(Boolean.FALSE);
    public final ParcelableSnapshotMutableFloatState zIndex$delegate = new ParcelableSnapshotMutableFloatState(RecyclerView.DECELERATION_RATE);
    public final ParcelableSnapshotMutableState renderInOverlayDuringTransition$delegate = Updater.mutableStateOf$default(Boolean.TRUE);
    public final ParcelableSnapshotMutableState layer$delegate = Updater.mutableStateOf$default(null);

    public SharedElementEntry(SharedElement sharedElement, BoundsAnimation boundsAnimation, SharedTransitionScope.PlaceholderSize placeholderSize, boolean z, SharedTransitionScope.OverlayClip overlayClip, SharedTransitionScope.SharedContentState sharedContentState) {
        this.sharedElement$delegate = Updater.mutableStateOf$default(sharedElement);
        this.boundsAnimation$delegate = Updater.mutableStateOf$default(boundsAnimation);
        this.placeholderSize$delegate = Updater.mutableStateOf$default(placeholderSize);
        this.renderOnlyWhenVisible$delegate = Updater.mutableStateOf$default(Boolean.valueOf(z));
        this.overlayClip$delegate = Updater.mutableStateOf$default(overlayClip);
        this.userState$delegate = Updater.mutableStateOf$default(sharedContentState);
    }

    @Override // androidx.compose.animation.LayerRenderer
    public final void drawInOverlay(LayoutNodeDrawScope layoutNodeDrawScope) {
        Rect currentBounds;
        CanvasDrawScope canvasDrawScope = layoutNodeDrawScope.canvasDrawScope;
        GraphicsLayer graphicsLayer = (GraphicsLayer) this.layer$delegate.getValue();
        if (graphicsLayer == null || (currentBounds = getSharedElement().stateMachine.getState().getCurrentBounds()) == null || !getShouldRenderInOverlay$animation()) {
            return;
        }
        long m636getTopLeftF1C5BW0 = currentBounds.m636getTopLeftF1C5BW0();
        float intBitsToFloat = Float.intBitsToFloat((int) (m636getTopLeftF1C5BW0 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (m636getTopLeftF1C5BW0 & BodyPartID.bodyIdMax));
        AndroidPath androidPath = this.clipPathInOverlay;
        if (androidPath == null) {
            ((Extras.Key) canvasDrawScope.drawContext.path).translate(intBitsToFloat, intBitsToFloat2);
            try {
                SizeKt.drawLayer(layoutNodeDrawScope, graphicsLayer);
                return;
            } finally {
            }
        }
        GrpcMethod grpcMethod = canvasDrawScope.drawContext;
        long m3999getSizeNHjbRc = grpcMethod.m3999getSizeNHjbRc();
        grpcMethod.getCanvas().save();
        try {
            ((Extras.Key) grpcMethod.path).m1434clipPathmtrdDE(androidPath, 1);
            ((Extras.Key) canvasDrawScope.drawContext.path).translate(intBitsToFloat, intBitsToFloat2);
            try {
                SizeKt.drawLayer(layoutNodeDrawScope, graphicsLayer);
            } finally {
            }
        } finally {
            Recorder$$ExternalSyntheticOutline2.m(grpcMethod, m3999getSizeNHjbRc);
        }
    }

    public final BoundsAnimation getBoundsAnimation() {
        return (BoundsAnimation) this.boundsAnimation$delegate.getValue();
    }

    public final SharedElement getSharedElement() {
        return (SharedElement) this.sharedElement$delegate.getValue();
    }

    public final boolean getShouldRenderAtAll() {
        if (getBoundsAnimation().getTarget()) {
            return true;
        }
        return (getSharedElement().stateMachine.getState().getMatchIsOrHasBeenConfigured() && !getSharedElement().stateMachine.getState().getActiveMatchFound()) || !((Boolean) this.renderOnlyWhenVisible$delegate.getValue()).booleanValue();
    }

    public final boolean getShouldRenderInOverlay$animation() {
        return getShouldRenderAtAll() && getSharedElement().stateMachine.getState().getMatchIsOrHasBeenConfigured() && isEnabled() && ((Boolean) this.renderInOverlayDuringTransition$delegate.getValue()).booleanValue() && getSharedElement().scope.isTransitionActive();
    }

    @Override // androidx.compose.animation.LayerRenderer
    public final float getZIndex() {
        return this.zIndex$delegate.getFloatValue();
    }

    public final boolean isEnabled() {
        SharedTransitionScope.SharedContentState sharedContentState = (SharedTransitionScope.SharedContentState) this.userState$delegate.getValue();
        if (!((Boolean) this.isAttached$delegate.getValue()).booleanValue()) {
            return false;
        }
        ((SharedTransitionDefaults$SharedContentConfig) sharedContentState.config$delegate.getValue()).getClass();
        return true;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onAbandoned() {
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onForgotten() {
        SharedTransitionScopeImpl sharedTransitionScopeImpl = getSharedElement().scope;
        SharedElement sharedElement = getSharedElement();
        sharedElement._allEntries$delegate.setValue(CollectionsKt.minus(sharedElement.get_allEntries(), this));
        sharedElement._enabledEntries$delegate.setValue(CollectionsKt.minus(sharedElement.get_enabledEntries(), this));
        sharedElement.updateMatch$animation();
        sharedTransitionScopeImpl.updateTransitionActiveness$animation();
        sharedTransitionScopeImpl.renderers.remove(this);
        if (sharedElement.get_allEntries().isEmpty()) {
            JobKt.launch$default(sharedElement.scope.coroutineScope, null, null, new RealBadger2$clear$2(sharedElement, this, (Continuation) null, 12), 3);
        }
        getSharedElement().stateMachine.invalidateTargetBoundsProvider();
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onRemembered() {
        SharedTransitionScopeImpl sharedTransitionScopeImpl = getSharedElement().scope;
        SharedElement sharedElement = getSharedElement();
        sharedElement._allEntries$delegate.setValue(CollectionsKt.plus((Collection) sharedElement.get_allEntries(), (Object) this));
        sharedElement.updateMatch$animation();
        sharedTransitionScopeImpl.updateTransitionActiveness$animation();
        SnapshotStateList snapshotStateList = sharedTransitionScopeImpl.renderers;
        ListIterator listIterator = snapshotStateList.listIterator();
        int i = 0;
        while (true) {
            StateListIterator stateListIterator = (StateListIterator) listIterator;
            if (!stateListIterator.hasNext()) {
                i = -1;
                break;
            }
            LayerRenderer layerRenderer = (LayerRenderer) stateListIterator.next();
            SharedElementEntry sharedElementEntry = layerRenderer instanceof SharedElementEntry ? (SharedElementEntry) layerRenderer : null;
            if (Intrinsics.areEqual(sharedElementEntry != null ? sharedElementEntry.getSharedElement() : null, getSharedElement())) {
                break;
            } else {
                i++;
            }
        }
        if (i == snapshotStateList.size() - 1 || i == -1) {
            snapshotStateList.add(this);
        } else {
            snapshotStateList.add(i + 1, this);
        }
        getSharedElement().stateMachine.invalidateTargetBoundsProvider();
    }
}
