package androidx.compose.animation;

import androidx.compose.animation.SharedTransitionScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.layout.ApproachLayoutModifierNode;
import androidx.compose.ui.layout.ApproachMeasureScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.modifier.EmptyMap;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.modifier.SingleLocalMap;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.InlineClassHelperKt;
import androidx.core.os.BundleKt;
import androidx.room.util.DBUtil;
import coil3.Extras;
import coil3.size.SizeKt;
import com.squareup.util.cash.Countries;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public final class SharedBoundsNode extends Modifier.Node implements ApproachLayoutModifierNode, DrawModifierNode, ModifierLocalModifierNode, ObserverModifierNode, CompositionLocalConsumerModifierNode {
    public Rect boundsBeforeDetached;
    public boolean isPlaced;
    public GraphicsLayer layer;
    public final SingleLocalMap providedValues;
    public SharedElementEntry sharedElementEntry;

    public SharedBoundsNode(SharedElementEntry sharedElementEntry) {
        this.sharedElementEntry = sharedElementEntry;
        this.layer = (GraphicsLayer) sharedElementEntry.layer$delegate.getValue();
        SingleLocalMap singleLocalMap = new SingleLocalMap(SharedContentNodeKt.ModifierLocalSharedElementInternalState);
        singleLocalMap.value$delegate.setValue(sharedElementEntry);
        this.providedValues = singleLocalMap;
    }

    /* renamed from: approachMeasure-3p2s80s, reason: not valid java name */
    public final MeasureResult m149approachMeasure3p2s80s(ApproachMeasureScope approachMeasureScope, Measurable measurable, long j) {
        long j2;
        Rect value = this.sharedElementEntry.getBoundsAnimation().getValue();
        if (value == null) {
            SharedTransitionStateMachine sharedTransitionStateMachine = this.sharedElementEntry.getSharedElement().stateMachine;
            sharedTransitionStateMachine.processPendingRequest();
            value = sharedTransitionStateMachine.getState().initializeCurrentBounds(sharedTransitionStateMachine.sharedElement);
        }
        if (value != null) {
            long m3989roundToIntSizeuvyYCjk = Countries.m3989roundToIntSizeuvyYCjk(value.m634getSizeNHjbRc());
            int i = (int) (m3989roundToIntSizeuvyYCjk >> 32);
            int i2 = (int) (m3989roundToIntSizeuvyYCjk & BodyPartID.bodyIdMax);
            if (i == Integer.MAX_VALUE || i2 == Integer.MAX_VALUE) {
                StringBuilder sb = new StringBuilder("Error: Infinite width/height is invalid. animated bounds: ");
                sb.append(this.sharedElementEntry.getBoundsAnimation().getValue());
                Drop$$ExternalSyntheticBUOutline0.m(sb, ", current bounds: ", this.sharedElementEntry.getSharedElement().stateMachine.getState().getCurrentBounds());
                return null;
            }
            if (i < 0) {
                i = 0;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            if (!((i2 >= 0) & (i >= 0))) {
                InlineClassHelperKt.throwIllegalArgumentException("width and height must be >= 0");
            }
            j = ConstraintsKt.createConstraints(i, i, i2, i2);
        }
        Placeable mo833measureBRTryo0 = measurable.mo833measureBRTryo0(j);
        if (this.sharedElementEntry.getSharedElement().stateMachine.getState().getMatchIsOrHasBeenConfigured()) {
            j2 = ((SharedTransitionScope.PlaceholderSize) this.sharedElementEntry.placeholderSize$delegate.getValue()).mo151calculateSizeJyjRU_E(this.sharedElementEntry.getSharedElement().scope.$$delegate_0.toLookaheadCoordinates(DepthSortedSetKt.requireLayoutCoordinates(this)).mo838getSizeYbymL2g(), (mo833measureBRTryo0.width << 32) | (mo833measureBRTryo0.height & BodyPartID.bodyIdMax));
        } else {
            j2 = (mo833measureBRTryo0.height & BodyPartID.bodyIdMax) | (mo833measureBRTryo0.width << 32);
        }
        return MeasureScope.layout$default(approachMeasureScope, (int) (j2 >> 32), (int) (j2 & BodyPartID.bodyIdMax), new SharedBoundsNode$measure$1(this, mo833measureBRTryo0));
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public final void draw(LayoutNodeDrawScope layoutNodeDrawScope) {
        SharedElement sharedElement = this.sharedElementEntry.getSharedElement();
        Rect currentBounds = sharedElement.stateMachine.getState().getCurrentBounds();
        SharedElementEntry sharedElementEntry = this.sharedElementEntry;
        sharedElementEntry.clipPathInOverlay = (!sharedElementEntry.getShouldRenderInOverlay$animation() || currentBounds == null) ? null : ((SharedTransitionScope.OverlayClip) this.sharedElementEntry.overlayClip$delegate.getValue()).getClipPath((SharedTransitionScope.SharedContentState) this.sharedElementEntry.userState$delegate.getValue(), currentBounds, layoutNodeDrawScope.getLayoutDirection(), DepthSortedSetKt.requireLayoutNode(this).density);
        GraphicsLayer graphicsLayer = (GraphicsLayer) this.sharedElementEntry.layer$delegate.getValue();
        if (graphicsLayer != null) {
            layoutNodeDrawScope.m876recordJVtK1S4(Countries.m3990toIntSizeuvyYCjk(layoutNodeDrawScope.canvasDrawScope.mo753getSizeNHjbRc()), graphicsLayer, new SharedBoundsNode$draw$2(layoutNodeDrawScope, currentBounds, sharedElement));
            SharedElementEntry sharedElementEntry2 = this.sharedElementEntry;
            if (!sharedElementEntry2.getSharedElement().stateMachine.getState().getMatchIsOrHasBeenConfigured() || (!sharedElementEntry2.getShouldRenderInOverlay$animation() && sharedElementEntry2.getShouldRenderAtAll())) {
                SizeKt.drawLayer(layoutNodeDrawScope, graphicsLayer);
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder("Error: Layer is null when accessed for shared bounds/element : ");
        sb.append(sharedElement.key);
        boolean target = this.sharedElementEntry.getBoundsAnimation().getTarget();
        boolean isAttached = isAttached();
        sb.append(",target: ");
        sb.append(target);
        sb.append(", is attached: ");
        sb.append(isAttached);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalModifierNode
    public final BundleKt getProvidedValues() {
        return this.providedValues;
    }

    /* renamed from: isMeasurementApproachInProgress-ozmzZPI, reason: not valid java name */
    public final boolean m150isMeasurementApproachInProgressozmzZPI() {
        return this.sharedElementEntry.isEnabled() && this.sharedElementEntry.getSharedElement().getFoundMatch() && this.sharedElementEntry.getSharedElement().scope.isTransitionActive();
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo144measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        Placeable mo833measureBRTryo0 = measurable.mo833measureBRTryo0(j);
        return MeasureScope.layout$default(measureScope, mo833measureBRTryo0.width, mo833measureBRTryo0.height, new SharedBoundsNode$measure$1(mo833measureBRTryo0, this));
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onAttach() {
        super.onAttach();
        DepthSortedSetKt.observeReads(this, this.sharedElementEntry.getSharedElement().observingVisibilityChange);
        setup();
        this.sharedElementEntry.isAttached$delegate.setValue(Boolean.TRUE);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onDetach() {
        super.onDetach();
        LayoutCoordinates layoutCoordinates = this.sharedElementEntry.getSharedElement().scope.nullableRoot;
        if (layoutCoordinates != null) {
            this.boundsBeforeDetached = (layoutCoordinates.isAttached() && this.isPlaced) ? DBUtil.m1180Recttz77jQw(Offset.m625minusMKHz9U(DepthSortedSetKt.requireLayoutCoordinates(this).mo841localToRootMKHz9U(0L), layoutCoordinates.mo841localToRootMKHz9U(0L)), Countries.m3991toSizeozmzZPI(DepthSortedSetKt.requireLayoutCoordinates(this).measuredSize)) : null;
        }
        setLayer$1(null);
        SharedElementEntry sharedElementEntry = this.sharedElementEntry;
        sharedElementEntry.parentState = null;
        sharedElementEntry.boundsProvider = null;
        sharedElementEntry.isAttached$delegate.setValue(Boolean.FALSE);
        this.isPlaced = false;
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public final void onObservedReadsChanged() {
        this.sharedElementEntry.getSharedElement().updateMatch$animation();
        DepthSortedSetKt.observeReads(this, this.sharedElementEntry.getSharedElement().observingVisibilityChange);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onReset() {
        super.onReset();
        this.boundsBeforeDetached = null;
        GraphicsLayer graphicsLayer = this.layer;
        if (graphicsLayer != null) {
            ((AndroidComposeView) DepthSortedSetKt.requireOwner(this)).graphicsContext.releaseGraphicsLayer(graphicsLayer);
        }
        setLayer$1(((AndroidComposeView) DepthSortedSetKt.requireOwner(this)).graphicsContext.createGraphicsLayer());
    }

    public final void setLayer$1(GraphicsLayer graphicsLayer) {
        if (graphicsLayer == null) {
            GraphicsLayer graphicsLayer2 = this.layer;
            if (graphicsLayer2 != null) {
                ((AndroidComposeView) DepthSortedSetKt.requireOwner(this)).graphicsContext.releaseGraphicsLayer(graphicsLayer2);
            }
        } else {
            this.sharedElementEntry.layer$delegate.setValue(graphicsLayer);
        }
        this.layer = graphicsLayer;
    }

    public final void setup() {
        Extras.Key key = SharedContentNodeKt.ModifierLocalSharedElementInternalState;
        SharedElementEntry sharedElementEntry = this.sharedElementEntry;
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        SingleLocalMap singleLocalMap = this.providedValues;
        if (singleLocalMap == emptyMap) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalArgumentException("In order to provide locals you must override providedValues: ModifierLocalMap");
        }
        if (!singleLocalMap.contains$ui(key)) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalArgumentException("Any provided key must be initially provided in the overridden providedValues: ModifierLocalMap property. Key " + key + " was not found.");
        }
        if (key != singleLocalMap.key) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("Check failed.");
        }
        singleLocalMap.value$delegate.setValue(sharedElementEntry);
        this.sharedElementEntry.parentState = (SharedElementEntry) getCurrent(key);
        setLayer$1(((AndroidComposeView) DepthSortedSetKt.requireOwner(this)).graphicsContext.createGraphicsLayer());
        this.isPlaced = false;
        this.sharedElementEntry.boundsProvider = this;
    }
}
