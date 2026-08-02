package androidx.compose.ui.node;

import androidx.collection.MutableObjectIntMap;
import androidx.collection.ObjectIntMapKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LookaheadLayoutCoordinates;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public abstract class LookaheadDelegate extends LookaheadCapablePlaceable implements Measurable {
    public MeasureResult _measureResult;
    public final MutableObjectIntMap cachedAlignmentLinesMap;
    public final NodeCoordinator coordinator;
    public LinkedHashMap oldAlignmentLines;
    public long position = 0;
    public final LookaheadLayoutCoordinates lookaheadLayoutCoordinates = new LookaheadLayoutCoordinates(this);

    public LookaheadDelegate(NodeCoordinator nodeCoordinator) {
        this.coordinator = nodeCoordinator;
        MutableObjectIntMap mutableObjectIntMap = ObjectIntMapKt.EmptyObjectIntMap;
        this.cachedAlignmentLinesMap = new MutableObjectIntMap();
    }

    public static final void access$set_measureResult(LookaheadDelegate lookaheadDelegate, MeasureResult measureResult) {
        LinkedHashMap linkedHashMap;
        if (measureResult != null) {
            lookaheadDelegate.m852setMeasuredSizeozmzZPI((measureResult.getHeight() & BodyPartID.bodyIdMax) | (measureResult.getWidth() << 32));
        } else {
            lookaheadDelegate.m852setMeasuredSizeozmzZPI(0L);
        }
        if (!Intrinsics.areEqual(lookaheadDelegate._measureResult, measureResult) && measureResult != null && ((((linkedHashMap = lookaheadDelegate.oldAlignmentLines) != null && !linkedHashMap.isEmpty()) || !measureResult.getAlignmentLines().isEmpty()) && !Intrinsics.areEqual(measureResult.getAlignmentLines(), lookaheadDelegate.oldAlignmentLines))) {
            LookaheadPassDelegate lookaheadPassDelegate = lookaheadDelegate.coordinator.layoutNode.layoutDelegate.lookaheadPassDelegate;
            lookaheadPassDelegate.getClass();
            lookaheadPassDelegate.alignmentLines.onAlignmentsChanged();
            LinkedHashMap linkedHashMap2 = lookaheadDelegate.oldAlignmentLines;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                lookaheadDelegate.oldAlignmentLines = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(measureResult.getAlignmentLines());
        }
        lookaheadDelegate._measureResult = measureResult;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public final LookaheadCapablePlaceable getChild() {
        NodeCoordinator nodeCoordinator = this.coordinator.wrapped;
        if (nodeCoordinator != null) {
            return nodeCoordinator.getLookaheadDelegate();
        }
        return null;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public final LayoutCoordinates getCoordinates() {
        return this.lookaheadLayoutCoordinates;
    }

    @Override // androidx.compose.ui.unit.Density
    public final float getDensity() {
        return this.coordinator.getDensity();
    }

    @Override // androidx.compose.ui.unit.Density
    public final float getFontScale() {
        return this.coordinator.getFontScale();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public final boolean getHasMeasureResult() {
        return this._measureResult != null;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    public final LayoutDirection getLayoutDirection() {
        return this.coordinator.layoutNode.layoutDirection;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public final LayoutNode getLayoutNode() {
        return this.coordinator.layoutNode;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public final MeasureResult getMeasureResult$ui() {
        MeasureResult measureResult = this._measureResult;
        if (measureResult != null) {
            return measureResult;
        }
        throw Boxes$$ExternalSyntheticOutline1.m1150m("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public final LookaheadCapablePlaceable getParent() {
        NodeCoordinator nodeCoordinator = this.coordinator.wrappedBy;
        if (nodeCoordinator != null) {
            return nodeCoordinator.getLookaheadDelegate();
        }
        return null;
    }

    @Override // androidx.compose.ui.layout.Placeable, androidx.compose.ui.layout.IntrinsicMeasurable
    public final Object getParentData() {
        return this.coordinator.getParentData();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    /* renamed from: getPosition-nOcc-ac */
    public final long mo879getPositionnOccac() {
        return this.position;
    }

    /* renamed from: getSize-YbymL2g$ui, reason: not valid java name */
    public final long m880getSizeYbymL2g$ui() {
        return (this.width << 32) | (this.height & BodyPartID.bodyIdMax);
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable, androidx.compose.ui.layout.IntrinsicMeasureScope
    public final boolean isLookingAhead() {
        return true;
    }

    @Override // androidx.compose.ui.layout.Placeable
    /* renamed from: placeAt-f8xVGno */
    public final void mo836placeAtf8xVGno(long j, float f, Function1 function1) {
        m881placeSelfgyyYBs(j);
        if (this.isShallowPlacing) {
            return;
        }
        placeChildren();
    }

    public void placeChildren() {
        getMeasureResult$ui().placeChildren();
    }

    /* renamed from: placeSelf--gyyYBs, reason: not valid java name */
    public final void m881placeSelfgyyYBs(long j) {
        if (!IntOffset.m1047equalsimpl0(this.position, j)) {
            this.position = j;
            NodeCoordinator nodeCoordinator = this.coordinator;
            LookaheadPassDelegate lookaheadPassDelegate = nodeCoordinator.layoutNode.layoutDelegate.lookaheadPassDelegate;
            if (lookaheadPassDelegate != null) {
                lookaheadPassDelegate.notifyChildrenUsingLookaheadCoordinatesWhilePlacing();
            }
            LookaheadCapablePlaceable.invalidateAlignmentLinesFromPositionChange(nodeCoordinator);
        }
        if (this.isPlacingForAlignment) {
            return;
        }
        captureRulersIfNeeded$ui(getMeasureResult$ui());
    }

    /* renamed from: positionIn-iSbpLlY$ui, reason: not valid java name */
    public final long m882positionIniSbpLlY$ui(LookaheadDelegate lookaheadDelegate, boolean z) {
        long j = 0;
        while (!this.equals(lookaheadDelegate)) {
            if (!this.isPlacedUnderMotionFrameOfReference || !z) {
                j = IntOffset.m1049plusqkQi6aY(j, this.position);
            }
            NodeCoordinator nodeCoordinator = this.coordinator.wrappedBy;
            nodeCoordinator.getClass();
            this = nodeCoordinator.getLookaheadDelegate();
            this.getClass();
        }
        return j;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public final void replace$ui() {
        mo836placeAtf8xVGno(this.position, RecyclerView.DECELERATION_RATE, (Function1) null);
    }
}
