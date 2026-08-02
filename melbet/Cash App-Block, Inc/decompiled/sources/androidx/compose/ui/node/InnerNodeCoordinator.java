package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.AndroidPaint;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.impl.WorkLauncherImpl;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class InnerNodeCoordinator extends NodeCoordinator {
    public static final AndroidPaint innerBoundsPaint;
    public LookaheadDelegateImpl lookaheadDelegate;
    public final TailModifierNode tail;

    public final class LookaheadDelegateImpl extends LookaheadDelegate {
        @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
        public final int calculateAlignmentLine(AlignmentLine alignmentLine) {
            LookaheadPassDelegate lookaheadPassDelegate = this.coordinator.layoutNode.layoutDelegate.lookaheadPassDelegate;
            lookaheadPassDelegate.getClass();
            LookaheadAlignmentLines lookaheadAlignmentLines = lookaheadPassDelegate.alignmentLines;
            if (!lookaheadPassDelegate.duringAlignmentLinesQuery) {
                LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = lookaheadPassDelegate.layoutNodeLayoutDelegate;
                if (layoutNodeLayoutDelegate.layoutState == LayoutNode.LayoutState.LookaheadMeasuring) {
                    lookaheadAlignmentLines.usedByModifierMeasurement = true;
                    if (lookaheadAlignmentLines.dirty) {
                        layoutNodeLayoutDelegate.lookaheadLayoutPending = true;
                        layoutNodeLayoutDelegate.lookaheadLayoutPendingForAlignment = true;
                    }
                } else {
                    lookaheadAlignmentLines.usedByModifierLayout = true;
                }
            }
            LookaheadDelegateImpl lookaheadDelegateImpl = lookaheadPassDelegate.getInnerCoordinator().lookaheadDelegate;
            if (lookaheadDelegateImpl != null) {
                lookaheadDelegateImpl.isPlacingForAlignment = true;
            }
            lookaheadPassDelegate.layoutChildren();
            LookaheadDelegateImpl lookaheadDelegateImpl2 = lookaheadPassDelegate.getInnerCoordinator().lookaheadDelegate;
            if (lookaheadDelegateImpl2 != null) {
                lookaheadDelegateImpl2.isPlacingForAlignment = false;
            }
            Integer num = (Integer) lookaheadAlignmentLines.alignmentLineMap.get(alignmentLine);
            int intValue = num != null ? num.intValue() : PKIFailureInfo.systemUnavail;
            this.cachedAlignmentLinesMap.set(intValue, alignmentLine);
            return intValue;
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public final int maxIntrinsicHeight(int i) {
            WorkLauncherImpl orCreateIntrinsicsPolicy = this.coordinator.layoutNode.getOrCreateIntrinsicsPolicy();
            MeasurePolicy measurePolicyState = orCreateIntrinsicsPolicy.getMeasurePolicyState();
            LayoutNode layoutNode = (LayoutNode) orCreateIntrinsicsPolicy.processor;
            return measurePolicyState.maxIntrinsicHeight((NodeCoordinator) layoutNode.nodes.outerCoordinator, layoutNode.getChildLookaheadMeasurables$ui(), i);
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public final int maxIntrinsicWidth(int i) {
            WorkLauncherImpl orCreateIntrinsicsPolicy = this.coordinator.layoutNode.getOrCreateIntrinsicsPolicy();
            MeasurePolicy measurePolicyState = orCreateIntrinsicsPolicy.getMeasurePolicyState();
            LayoutNode layoutNode = (LayoutNode) orCreateIntrinsicsPolicy.processor;
            return measurePolicyState.maxIntrinsicWidth((NodeCoordinator) layoutNode.nodes.outerCoordinator, layoutNode.getChildLookaheadMeasurables$ui(), i);
        }

        @Override // androidx.compose.ui.layout.Measurable
        /* renamed from: measure-BRTryo0 */
        public final Placeable mo833measureBRTryo0(long j) {
            m853setMeasurementConstraintsBRTryo0(j);
            NodeCoordinator nodeCoordinator = this.coordinator;
            MutableVector mutableVector = nodeCoordinator.layoutNode.get_children$ui();
            Object[] objArr = mutableVector.content;
            int i = mutableVector.size;
            for (int i2 = 0; i2 < i; i2++) {
                LookaheadPassDelegate lookaheadPassDelegate = ((LayoutNode) objArr[i2]).layoutDelegate.lookaheadPassDelegate;
                lookaheadPassDelegate.getClass();
                lookaheadPassDelegate.measuredByParent = LayoutNode.UsageByParent.NotUsed;
            }
            LayoutNode layoutNode = nodeCoordinator.layoutNode;
            LookaheadDelegate.access$set_measureResult(this, layoutNode.measurePolicy.mo138measure3p2s80s(this, layoutNode.getChildLookaheadMeasurables$ui(), j));
            return this;
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public final int minIntrinsicHeight(int i) {
            WorkLauncherImpl orCreateIntrinsicsPolicy = this.coordinator.layoutNode.getOrCreateIntrinsicsPolicy();
            MeasurePolicy measurePolicyState = orCreateIntrinsicsPolicy.getMeasurePolicyState();
            LayoutNode layoutNode = (LayoutNode) orCreateIntrinsicsPolicy.processor;
            return measurePolicyState.minIntrinsicHeight((NodeCoordinator) layoutNode.nodes.outerCoordinator, layoutNode.getChildLookaheadMeasurables$ui(), i);
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public final int minIntrinsicWidth(int i) {
            WorkLauncherImpl orCreateIntrinsicsPolicy = this.coordinator.layoutNode.getOrCreateIntrinsicsPolicy();
            MeasurePolicy measurePolicyState = orCreateIntrinsicsPolicy.getMeasurePolicyState();
            LayoutNode layoutNode = (LayoutNode) orCreateIntrinsicsPolicy.processor;
            return measurePolicyState.minIntrinsicWidth((NodeCoordinator) layoutNode.nodes.outerCoordinator, layoutNode.getChildLookaheadMeasurables$ui(), i);
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate
        public final void placeChildren() {
            LookaheadPassDelegate lookaheadPassDelegate = this.coordinator.layoutNode.layoutDelegate.lookaheadPassDelegate;
            lookaheadPassDelegate.getClass();
            lookaheadPassDelegate.onNodePlaced$ui();
        }
    }

    static {
        AndroidPaint Paint = ColorKt.Paint();
        Paint.m659setColor8_81llA(Color.Red);
        Paint.setStrokeWidth(1.0f);
        Paint.m663setStylek9PVt8s(1);
        innerBoundsPaint = Paint;
    }

    public InnerNodeCoordinator(LayoutNode layoutNode) {
        super(layoutNode);
        TailModifierNode tailModifierNode = new TailModifierNode();
        tailModifierNode.setAggregateChildKindSet$ui(0);
        this.tail = tailModifierNode;
        tailModifierNode.updateCoordinator$ui(this);
        this.lookaheadDelegate = layoutNode.lookaheadRoot != null ? new LookaheadDelegateImpl(this) : null;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public final int calculateAlignmentLine(AlignmentLine alignmentLine) {
        LookaheadDelegateImpl lookaheadDelegateImpl = this.lookaheadDelegate;
        if (lookaheadDelegateImpl != null) {
            return lookaheadDelegateImpl.calculateAlignmentLine(alignmentLine);
        }
        MeasurePassDelegate measurePassDelegate = this.layoutNode.layoutDelegate.measurePassDelegate;
        LookaheadAlignmentLines lookaheadAlignmentLines = measurePassDelegate.alignmentLines;
        if (!measurePassDelegate.duringAlignmentLinesQuery) {
            if (measurePassDelegate.layoutNodeLayoutDelegate.layoutState == LayoutNode.LayoutState.Measuring) {
                lookaheadAlignmentLines.usedByModifierMeasurement = true;
                if (lookaheadAlignmentLines.dirty) {
                    measurePassDelegate.layoutPending = true;
                    measurePassDelegate.layoutPendingForAlignment = true;
                }
            } else {
                lookaheadAlignmentLines.usedByModifierLayout = true;
            }
        }
        InnerNodeCoordinator innerCoordinator = measurePassDelegate.getInnerCoordinator();
        boolean z = innerCoordinator.isPlacingForAlignment;
        innerCoordinator.isPlacingForAlignment = true;
        measurePassDelegate.layoutChildren();
        innerCoordinator.isPlacingForAlignment = z;
        Integer num = (Integer) lookaheadAlignmentLines.alignmentLineMap.get(alignmentLine);
        return num != null ? num.intValue() : PKIFailureInfo.systemUnavail;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public final void ensureLookaheadDelegateCreated() {
        if (this.lookaheadDelegate == null) {
            this.lookaheadDelegate = new LookaheadDelegateImpl(this);
        }
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public final LookaheadDelegate getLookaheadDelegate() {
        return this.lookaheadDelegate;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public final Modifier.Node getTail() {
        return this.tail;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003a  */
    @Override // androidx.compose.ui.node.NodeCoordinator
    /* renamed from: hitTestChild-qzLsGqo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo871hitTestChildqzLsGqo(NodeCoordinator.HitTestSource hitTestSource, long j, HitTestResult hitTestResult, int i, boolean z) {
        int i2;
        boolean z2;
        LayoutNode layoutNode = this.layoutNode;
        boolean z3 = false;
        if (hitTestSource.shouldHitTestChildren(layoutNode)) {
            if (m904withinLayerBoundsk4lQ0M(j)) {
                i2 = i;
                z2 = z;
            } else {
                i2 = i;
                if (PointerType.m828equalsimpl0(i2, 1) && (Float.floatToRawIntBits(m892distanceInMinimumTouchTargettz77jQw(j, m894getMinimumTouchTargetSizeNHjbRc())) & Integer.MAX_VALUE) < 2139095040) {
                    z2 = false;
                }
            }
            z3 = true;
            if (z3) {
                return;
            }
            int i3 = hitTestResult.hitDepth;
            MutableVector zSortedChildren = layoutNode.getZSortedChildren();
            Object[] objArr = zSortedChildren.content;
            int i4 = zSortedChildren.size - 1;
            while (i4 >= 0) {
                LayoutNode layoutNode2 = (LayoutNode) objArr[i4];
                if (layoutNode2.isPlaced()) {
                    hitTestSource.mo905childHitTestqzLsGqo(layoutNode2, j, hitTestResult, i2, z2);
                    long m870findBestHitDistancefn2tFes = hitTestResult.m870findBestHitDistancefn2tFes();
                    if (DistanceAndFlags.m866getDistanceimpl(m870findBestHitDistancefn2tFes) < RecyclerView.DECELERATION_RATE && DistanceAndFlags.m868isInLayerimpl(m870findBestHitDistancefn2tFes) && !DistanceAndFlags.m867isInExpandedBoundsimpl(m870findBestHitDistancefn2tFes) && !hitTestSource.shareWithSiblings(hitTestResult, layoutNode2)) {
                        break;
                    }
                }
                i4--;
                i2 = i;
            }
            hitTestResult.hitDepth = i3;
            return;
        }
        i2 = i;
        z2 = z;
        if (z3) {
        }
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public final int maxIntrinsicHeight(int i) {
        WorkLauncherImpl orCreateIntrinsicsPolicy = this.layoutNode.getOrCreateIntrinsicsPolicy();
        MeasurePolicy measurePolicyState = orCreateIntrinsicsPolicy.getMeasurePolicyState();
        LayoutNode layoutNode = (LayoutNode) orCreateIntrinsicsPolicy.processor;
        return measurePolicyState.maxIntrinsicHeight((NodeCoordinator) layoutNode.nodes.outerCoordinator, layoutNode.getChildMeasurables$ui(), i);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public final int maxIntrinsicWidth(int i) {
        WorkLauncherImpl orCreateIntrinsicsPolicy = this.layoutNode.getOrCreateIntrinsicsPolicy();
        MeasurePolicy measurePolicyState = orCreateIntrinsicsPolicy.getMeasurePolicyState();
        LayoutNode layoutNode = (LayoutNode) orCreateIntrinsicsPolicy.processor;
        return measurePolicyState.maxIntrinsicWidth((NodeCoordinator) layoutNode.nodes.outerCoordinator, layoutNode.getChildMeasurables$ui(), i);
    }

    @Override // androidx.compose.ui.layout.Measurable
    /* renamed from: measure-BRTryo0 */
    public final Placeable mo833measureBRTryo0(long j) {
        if (this.forceMeasureWithLookaheadConstraints) {
            LookaheadDelegateImpl lookaheadDelegateImpl = this.lookaheadDelegate;
            lookaheadDelegateImpl.getClass();
            j = lookaheadDelegateImpl.measurementConstraints;
        }
        m853setMeasurementConstraintsBRTryo0(j);
        LayoutNode layoutNode = this.layoutNode;
        MutableVector mutableVector = layoutNode.get_children$ui();
        Object[] objArr = mutableVector.content;
        int i = mutableVector.size;
        for (int i2 = 0; i2 < i; i2++) {
            ((LayoutNode) objArr[i2]).layoutDelegate.measurePassDelegate.measuredByParent = LayoutNode.UsageByParent.NotUsed;
        }
        setMeasureResult$ui(layoutNode.measurePolicy.mo138measure3p2s80s(this, layoutNode.getChildMeasurables$ui(), j));
        onMeasured();
        return this;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public final int minIntrinsicHeight(int i) {
        WorkLauncherImpl orCreateIntrinsicsPolicy = this.layoutNode.getOrCreateIntrinsicsPolicy();
        MeasurePolicy measurePolicyState = orCreateIntrinsicsPolicy.getMeasurePolicyState();
        LayoutNode layoutNode = (LayoutNode) orCreateIntrinsicsPolicy.processor;
        return measurePolicyState.minIntrinsicHeight((NodeCoordinator) layoutNode.nodes.outerCoordinator, layoutNode.getChildMeasurables$ui(), i);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public final int minIntrinsicWidth(int i) {
        WorkLauncherImpl orCreateIntrinsicsPolicy = this.layoutNode.getOrCreateIntrinsicsPolicy();
        MeasurePolicy measurePolicyState = orCreateIntrinsicsPolicy.getMeasurePolicyState();
        LayoutNode layoutNode = (LayoutNode) orCreateIntrinsicsPolicy.processor;
        return measurePolicyState.minIntrinsicWidth((NodeCoordinator) layoutNode.nodes.outerCoordinator, layoutNode.getChildMeasurables$ui(), i);
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public final void performDraw(Canvas canvas, GraphicsLayer graphicsLayer) {
        LayoutNode layoutNode = this.layoutNode;
        Owner requireOwner = LayoutNodeKt.requireOwner(layoutNode);
        MutableVector zSortedChildren = layoutNode.getZSortedChildren();
        Object[] objArr = zSortedChildren.content;
        int i = zSortedChildren.size;
        for (int i2 = 0; i2 < i; i2++) {
            LayoutNode layoutNode2 = (LayoutNode) objArr[i2];
            if (layoutNode2.isPlaced()) {
                layoutNode2.draw$ui(canvas, graphicsLayer);
            }
        }
        if (((AndroidComposeView) requireOwner).getShowLayoutBounds()) {
            long j = this.measuredSize;
            canvas.drawRect(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & BodyPartID.bodyIdMax)) - 0.5f, innerBoundsPaint);
        }
    }

    @Override // androidx.compose.ui.node.NodeCoordinator, androidx.compose.ui.layout.Placeable
    /* renamed from: placeAt-f8xVGno */
    public final void mo851placeAtf8xVGno(long j, float f, GraphicsLayer graphicsLayer) {
        InnerNodeCoordinator innerNodeCoordinator;
        if (this.forcePlaceWithLookaheadOffset) {
            LookaheadDelegate lookaheadDelegate = getLookaheadDelegate();
            lookaheadDelegate.getClass();
            innerNodeCoordinator = this;
            innerNodeCoordinator.m900placeSelfMLgxB_4(lookaheadDelegate.position, f, null, graphicsLayer);
        } else {
            innerNodeCoordinator = this;
            innerNodeCoordinator.m900placeSelfMLgxB_4(j, f, null, graphicsLayer);
        }
        if (innerNodeCoordinator.isShallowPlacing) {
            return;
        }
        innerNodeCoordinator.layoutNode.layoutDelegate.measurePassDelegate.onNodePlaced$ui();
    }

    @Override // androidx.compose.ui.layout.Placeable
    /* renamed from: placeAt-f8xVGno */
    public final void mo836placeAtf8xVGno(long j, float f, Function1 function1) {
        if (this.forcePlaceWithLookaheadOffset) {
            LookaheadDelegate lookaheadDelegate = getLookaheadDelegate();
            lookaheadDelegate.getClass();
            m900placeSelfMLgxB_4(lookaheadDelegate.position, f, function1, null);
        } else {
            m900placeSelfMLgxB_4(j, f, function1, null);
        }
        if (this.isShallowPlacing) {
            return;
        }
        this.layoutNode.layoutDelegate.measurePassDelegate.onNodePlaced$ui();
    }
}
