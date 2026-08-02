package androidx.compose.ui.node;

import androidx.appcompat.widget.Toolbar;
import androidx.biometric.BiometricPrompt;
import androidx.camera.video.Recorder;
import androidx.camera.view.PreviewView;
import androidx.collection.MutableObjectIntMap;
import androidx.compose.animation.SharedBoundsNode;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.AndroidPaint;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.ApproachIntrinsicsMeasureScope;
import androidx.compose.ui.layout.ApproachLayoutModifierNode;
import androidx.compose.ui.layout.ApproachMeasureScopeImpl;
import androidx.compose.ui.layout.DefaultIntrinsicMeasurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNodeCoordinator;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_genai_prompt.zzaey;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class LayoutModifierNodeCoordinator extends NodeCoordinator {
    public static final AndroidPaint modifierBoundsPaint;
    public ApproachMeasureScopeImpl approachMeasureScope;
    public LayoutModifierNode layoutModifierNode;
    public Constraints lookaheadConstraints;
    public LookaheadDelegateForLayoutModifierNode lookaheadDelegate;

    public final class LookaheadDelegateForLayoutModifierNode extends LookaheadDelegate {
        public LookaheadDelegateForLayoutModifierNode() {
            super(LayoutModifierNodeCoordinator.this);
        }

        @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
        public final int calculateAlignmentLine(AlignmentLine alignmentLine) {
            int access$calculateAlignmentAndPlaceChildAsNeeded = zzaey.access$calculateAlignmentAndPlaceChildAsNeeded(this, alignmentLine);
            this.cachedAlignmentLinesMap.set(access$calculateAlignmentAndPlaceChildAsNeeded, alignmentLine);
            return access$calculateAlignmentAndPlaceChildAsNeeded;
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public final int maxIntrinsicHeight(int i) {
            LayoutModifierNodeCoordinator layoutModifierNodeCoordinator = LayoutModifierNodeCoordinator.this;
            LayoutModifierNode layoutModifierNode = layoutModifierNodeCoordinator.layoutModifierNode;
            NodeCoordinator nodeCoordinator = layoutModifierNodeCoordinator.wrapped;
            nodeCoordinator.getClass();
            LookaheadDelegate lookaheadDelegate = nodeCoordinator.getLookaheadDelegate();
            lookaheadDelegate.getClass();
            return layoutModifierNode.maxIntrinsicHeight(this, lookaheadDelegate, i);
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public final int maxIntrinsicWidth(int i) {
            LayoutModifierNodeCoordinator layoutModifierNodeCoordinator = LayoutModifierNodeCoordinator.this;
            LayoutModifierNode layoutModifierNode = layoutModifierNodeCoordinator.layoutModifierNode;
            NodeCoordinator nodeCoordinator = layoutModifierNodeCoordinator.wrapped;
            nodeCoordinator.getClass();
            LookaheadDelegate lookaheadDelegate = nodeCoordinator.getLookaheadDelegate();
            lookaheadDelegate.getClass();
            return layoutModifierNode.maxIntrinsicWidth(this, lookaheadDelegate, i);
        }

        @Override // androidx.compose.ui.layout.Measurable
        /* renamed from: measure-BRTryo0 */
        public final Placeable mo833measureBRTryo0(long j) {
            m853setMeasurementConstraintsBRTryo0(j);
            Constraints constraints = new Constraints(j);
            LayoutModifierNodeCoordinator layoutModifierNodeCoordinator = LayoutModifierNodeCoordinator.this;
            layoutModifierNodeCoordinator.lookaheadConstraints = constraints;
            LayoutModifierNode layoutModifierNode = layoutModifierNodeCoordinator.layoutModifierNode;
            NodeCoordinator nodeCoordinator = layoutModifierNodeCoordinator.wrapped;
            nodeCoordinator.getClass();
            LookaheadDelegate lookaheadDelegate = nodeCoordinator.getLookaheadDelegate();
            lookaheadDelegate.getClass();
            LookaheadDelegate.access$set_measureResult(this, layoutModifierNode.mo144measure3p2s80s(this, lookaheadDelegate, j));
            return this;
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public final int minIntrinsicHeight(int i) {
            LayoutModifierNodeCoordinator layoutModifierNodeCoordinator = LayoutModifierNodeCoordinator.this;
            LayoutModifierNode layoutModifierNode = layoutModifierNodeCoordinator.layoutModifierNode;
            NodeCoordinator nodeCoordinator = layoutModifierNodeCoordinator.wrapped;
            nodeCoordinator.getClass();
            LookaheadDelegate lookaheadDelegate = nodeCoordinator.getLookaheadDelegate();
            lookaheadDelegate.getClass();
            return layoutModifierNode.minIntrinsicHeight(this, lookaheadDelegate, i);
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public final int minIntrinsicWidth(int i) {
            LayoutModifierNodeCoordinator layoutModifierNodeCoordinator = LayoutModifierNodeCoordinator.this;
            LayoutModifierNode layoutModifierNode = layoutModifierNodeCoordinator.layoutModifierNode;
            NodeCoordinator nodeCoordinator = layoutModifierNodeCoordinator.wrapped;
            nodeCoordinator.getClass();
            LookaheadDelegate lookaheadDelegate = nodeCoordinator.getLookaheadDelegate();
            lookaheadDelegate.getClass();
            return layoutModifierNode.minIntrinsicWidth(this, lookaheadDelegate, i);
        }
    }

    static {
        AndroidPaint Paint = ColorKt.Paint();
        Paint.m659setColor8_81llA(Color.Blue);
        Paint.setStrokeWidth(1.0f);
        Paint.m663setStylek9PVt8s(1);
        modifierBoundsPaint = Paint;
    }

    public LayoutModifierNodeCoordinator(LayoutNode layoutNode, LayoutModifierNode layoutModifierNode) {
        super(layoutNode);
        this.layoutModifierNode = layoutModifierNode;
        this.lookaheadDelegate = layoutNode.lookaheadRoot != null ? new LookaheadDelegateForLayoutModifierNode() : null;
        this.approachMeasureScope = (layoutModifierNode.getNode().getKindSet$ui() & 512) != 0 ? new ApproachMeasureScopeImpl(this, (ApproachLayoutModifierNode) layoutModifierNode) : null;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public final int calculateAlignmentLine(AlignmentLine alignmentLine) {
        LookaheadDelegateForLayoutModifierNode lookaheadDelegateForLayoutModifierNode = this.lookaheadDelegate;
        if (lookaheadDelegateForLayoutModifierNode == null) {
            return zzaey.access$calculateAlignmentAndPlaceChildAsNeeded(this, alignmentLine);
        }
        MutableObjectIntMap mutableObjectIntMap = lookaheadDelegateForLayoutModifierNode.cachedAlignmentLinesMap;
        int findKeyIndex = mutableObjectIntMap.findKeyIndex(alignmentLine);
        return findKeyIndex >= 0 ? mutableObjectIntMap.values[findKeyIndex] : PKIFailureInfo.systemUnavail;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public final void ensureLookaheadDelegateCreated() {
        if (this.lookaheadDelegate == null) {
            this.lookaheadDelegate = new LookaheadDelegateForLayoutModifierNode();
        }
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public final LookaheadDelegate getLookaheadDelegate() {
        return this.lookaheadDelegate;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public final Modifier.Node getTail() {
        return this.layoutModifierNode.getNode();
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public final int maxIntrinsicHeight(int i) {
        ApproachMeasureScopeImpl approachMeasureScopeImpl = this.approachMeasureScope;
        if (approachMeasureScopeImpl == null) {
            LayoutModifierNode layoutModifierNode = this.layoutModifierNode;
            NodeCoordinator nodeCoordinator = this.wrapped;
            nodeCoordinator.getClass();
            return layoutModifierNode.maxIntrinsicHeight(this, nodeCoordinator, i);
        }
        Object obj = approachMeasureScopeImpl.approachNode;
        NodeCoordinator nodeCoordinator2 = this.wrapped;
        nodeCoordinator2.getClass();
        NodeCoordinator coordinator$ui = ((Modifier.Node) obj).getNode().getCoordinator$ui();
        coordinator$ui.getClass();
        LookaheadDelegate lookaheadDelegate = coordinator$ui.getLookaheadDelegate();
        lookaheadDelegate.getClass();
        if (!lookaheadDelegate.getHasMeasureResult()) {
            return nodeCoordinator2.maxIntrinsicHeight(i);
        }
        return new PreviewView.AnonymousClass1(obj, false).m124measure3p2s80s(new ApproachIntrinsicsMeasureScope(approachMeasureScopeImpl, approachMeasureScopeImpl.getLayoutDirection()), new DefaultIntrinsicMeasurable(nodeCoordinator2, NodeMeasuringIntrinsics$IntrinsicMinMax.Max, NodeMeasuringIntrinsics$IntrinsicWidthHeight.Height, 1), ConstraintsKt.Constraints$default(0, i, 0, 0, 13)).getHeight();
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public final int maxIntrinsicWidth(int i) {
        ApproachMeasureScopeImpl approachMeasureScopeImpl = this.approachMeasureScope;
        if (approachMeasureScopeImpl == null) {
            LayoutModifierNode layoutModifierNode = this.layoutModifierNode;
            NodeCoordinator nodeCoordinator = this.wrapped;
            nodeCoordinator.getClass();
            return layoutModifierNode.maxIntrinsicWidth(this, nodeCoordinator, i);
        }
        Object obj = approachMeasureScopeImpl.approachNode;
        NodeCoordinator nodeCoordinator2 = this.wrapped;
        nodeCoordinator2.getClass();
        NodeCoordinator coordinator$ui = ((Modifier.Node) obj).getNode().getCoordinator$ui();
        coordinator$ui.getClass();
        LookaheadDelegate lookaheadDelegate = coordinator$ui.getLookaheadDelegate();
        lookaheadDelegate.getClass();
        if (!lookaheadDelegate.getHasMeasureResult()) {
            return nodeCoordinator2.maxIntrinsicWidth(i);
        }
        return new Toolbar.AnonymousClass1(obj).m8measure3p2s80s(new ApproachIntrinsicsMeasureScope(approachMeasureScopeImpl, approachMeasureScopeImpl.getLayoutDirection()), new DefaultIntrinsicMeasurable(nodeCoordinator2, NodeMeasuringIntrinsics$IntrinsicMinMax.Max, NodeMeasuringIntrinsics$IntrinsicWidthHeight.Width, 1), ConstraintsKt.Constraints$default(0, 0, 0, i, 7)).getWidth();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0078, code lost:
    
        if (r10 == r2.height) goto L30;
     */
    @Override // androidx.compose.ui.layout.Measurable
    /* renamed from: measure-BRTryo0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Placeable mo833measureBRTryo0(long j) {
        final MeasureResult mo144measure3p2s80s;
        Constraints constraints;
        if (this.forceMeasureWithLookaheadConstraints) {
            Constraints constraints2 = this.lookaheadConstraints;
            if (constraints2 == null) {
                a$$ExternalSyntheticBUOutline0.m$3("Lookahead constraints cannot be null in approach pass.");
                return null;
            }
            j = constraints2.value;
        }
        m853setMeasurementConstraintsBRTryo0(j);
        ApproachMeasureScopeImpl approachMeasureScopeImpl = this.approachMeasureScope;
        if (approachMeasureScopeImpl != null) {
            ApproachLayoutModifierNode approachLayoutModifierNode = approachMeasureScopeImpl.approachNode;
            LookaheadDelegateForLayoutModifierNode lookaheadDelegateForLayoutModifierNode = approachMeasureScopeImpl.coordinator.lookaheadDelegate;
            lookaheadDelegateForLayoutModifierNode.getClass();
            MeasureResult measureResult$ui = lookaheadDelegateForLayoutModifierNode.getMeasureResult$ui();
            measureResult$ui.getWidth();
            measureResult$ui.getHeight();
            SharedBoundsNode sharedBoundsNode = (SharedBoundsNode) approachLayoutModifierNode;
            boolean z = true;
            boolean z2 = sharedBoundsNode.m150isMeasurementApproachInProgressozmzZPI() || (constraints = this.lookaheadConstraints) == null || j != constraints.value;
            approachMeasureScopeImpl.approachMeasureRequired = z2;
            if (!z2) {
                NodeCoordinator nodeCoordinator = this.wrapped;
                nodeCoordinator.getClass();
                nodeCoordinator.forceMeasureWithLookaheadConstraints = true;
            }
            NodeCoordinator nodeCoordinator2 = this.wrapped;
            nodeCoordinator2.getClass();
            mo144measure3p2s80s = sharedBoundsNode.m149approachMeasure3p2s80s(approachMeasureScopeImpl, nodeCoordinator2, j);
            NodeCoordinator nodeCoordinator3 = this.wrapped;
            nodeCoordinator3.getClass();
            nodeCoordinator3.forceMeasureWithLookaheadConstraints = false;
            int width = mo144measure3p2s80s.getWidth();
            LookaheadDelegateForLayoutModifierNode lookaheadDelegateForLayoutModifierNode2 = this.lookaheadDelegate;
            lookaheadDelegateForLayoutModifierNode2.getClass();
            if (width == lookaheadDelegateForLayoutModifierNode2.width) {
                int height = mo144measure3p2s80s.getHeight();
                LookaheadDelegateForLayoutModifierNode lookaheadDelegateForLayoutModifierNode3 = this.lookaheadDelegate;
                lookaheadDelegateForLayoutModifierNode3.getClass();
            }
            z = false;
            if (!approachMeasureScopeImpl.approachMeasureRequired) {
                NodeCoordinator nodeCoordinator4 = this.wrapped;
                nodeCoordinator4.getClass();
                long j2 = nodeCoordinator4.measuredSize;
                NodeCoordinator nodeCoordinator5 = this.wrapped;
                nodeCoordinator5.getClass();
                LookaheadDelegate lookaheadDelegate = nodeCoordinator5.getLookaheadDelegate();
                if (IntSize.m1054equalsimpl(lookaheadDelegate != null ? new IntSize(lookaheadDelegate.m880getSizeYbymL2g$ui()) : null, j2) && !z) {
                    mo144measure3p2s80s = new MeasureResult(this) { // from class: androidx.compose.ui.node.LayoutModifierNodeCoordinator$measure$1$1$1$1
                        public final int height;
                        public final int width;

                        {
                            LayoutModifierNodeCoordinator.LookaheadDelegateForLayoutModifierNode lookaheadDelegateForLayoutModifierNode4 = this.lookaheadDelegate;
                            lookaheadDelegateForLayoutModifierNode4.getClass();
                            this.width = lookaheadDelegateForLayoutModifierNode4.width;
                            LayoutModifierNodeCoordinator.LookaheadDelegateForLayoutModifierNode lookaheadDelegateForLayoutModifierNode5 = this.lookaheadDelegate;
                            lookaheadDelegateForLayoutModifierNode5.getClass();
                            this.height = lookaheadDelegateForLayoutModifierNode5.height;
                        }

                        @Override // androidx.compose.ui.layout.MeasureResult
                        public final Map getAlignmentLines() {
                            return MeasureResult.this.getAlignmentLines();
                        }

                        @Override // androidx.compose.ui.layout.MeasureResult
                        public final int getHeight() {
                            return this.height;
                        }

                        @Override // androidx.compose.ui.layout.MeasureResult
                        public final Function1 getRulers() {
                            return MeasureResult.this.getRulers();
                        }

                        @Override // androidx.compose.ui.layout.MeasureResult
                        public final int getWidth() {
                            return this.width;
                        }

                        @Override // androidx.compose.ui.layout.MeasureResult
                        public final void placeChildren() {
                            MeasureResult.this.placeChildren();
                        }
                    };
                }
            }
        } else {
            LayoutModifierNode layoutModifierNode = this.layoutModifierNode;
            NodeCoordinator nodeCoordinator6 = this.wrapped;
            nodeCoordinator6.getClass();
            mo144measure3p2s80s = layoutModifierNode.mo144measure3p2s80s(this, nodeCoordinator6, j);
        }
        setMeasureResult$ui(mo144measure3p2s80s);
        onMeasured();
        return this;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public final int minIntrinsicHeight(int i) {
        ApproachMeasureScopeImpl approachMeasureScopeImpl = this.approachMeasureScope;
        if (approachMeasureScopeImpl == null) {
            LayoutModifierNode layoutModifierNode = this.layoutModifierNode;
            NodeCoordinator nodeCoordinator = this.wrapped;
            nodeCoordinator.getClass();
            return layoutModifierNode.minIntrinsicHeight(this, nodeCoordinator, i);
        }
        Object obj = approachMeasureScopeImpl.approachNode;
        NodeCoordinator nodeCoordinator2 = this.wrapped;
        nodeCoordinator2.getClass();
        NodeCoordinator coordinator$ui = ((Modifier.Node) obj).getNode().getCoordinator$ui();
        coordinator$ui.getClass();
        LookaheadDelegate lookaheadDelegate = coordinator$ui.getLookaheadDelegate();
        lookaheadDelegate.getClass();
        if (!lookaheadDelegate.getHasMeasureResult()) {
            return nodeCoordinator2.minIntrinsicHeight(i);
        }
        return new Recorder.AnonymousClass6(obj, 17).m118measure3p2s80s(new ApproachIntrinsicsMeasureScope(approachMeasureScopeImpl, approachMeasureScopeImpl.getLayoutDirection()), new DefaultIntrinsicMeasurable(nodeCoordinator2, NodeMeasuringIntrinsics$IntrinsicMinMax.Min, NodeMeasuringIntrinsics$IntrinsicWidthHeight.Height, 1), ConstraintsKt.Constraints$default(0, i, 0, 0, 13)).getHeight();
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public final int minIntrinsicWidth(int i) {
        ApproachMeasureScopeImpl approachMeasureScopeImpl = this.approachMeasureScope;
        if (approachMeasureScopeImpl == null) {
            LayoutModifierNode layoutModifierNode = this.layoutModifierNode;
            NodeCoordinator nodeCoordinator = this.wrapped;
            nodeCoordinator.getClass();
            return layoutModifierNode.minIntrinsicWidth(this, nodeCoordinator, i);
        }
        Object obj = approachMeasureScopeImpl.approachNode;
        NodeCoordinator nodeCoordinator2 = this.wrapped;
        nodeCoordinator2.getClass();
        NodeCoordinator coordinator$ui = ((Modifier.Node) obj).getNode().getCoordinator$ui();
        coordinator$ui.getClass();
        LookaheadDelegate lookaheadDelegate = coordinator$ui.getLookaheadDelegate();
        lookaheadDelegate.getClass();
        if (!lookaheadDelegate.getHasMeasureResult()) {
            return nodeCoordinator2.minIntrinsicWidth(i);
        }
        return new BiometricPrompt(obj, 21).m13measure3p2s80s(new ApproachIntrinsicsMeasureScope(approachMeasureScopeImpl, approachMeasureScopeImpl.getLayoutDirection()), new DefaultIntrinsicMeasurable(nodeCoordinator2, NodeMeasuringIntrinsics$IntrinsicMinMax.Min, NodeMeasuringIntrinsics$IntrinsicWidthHeight.Width, 1), ConstraintsKt.Constraints$default(0, 0, 0, i, 7)).getWidth();
    }

    public final void onAfterPlaceAt$1() {
        boolean z;
        if (this.isShallowPlacing) {
            return;
        }
        onPlaced();
        NodeCoordinator nodeCoordinator = this.wrapped;
        nodeCoordinator.getClass();
        ApproachMeasureScopeImpl approachMeasureScopeImpl = this.approachMeasureScope;
        if (approachMeasureScopeImpl != null) {
            this.lookaheadDelegate.getClass();
            if (!approachMeasureScopeImpl.approachMeasureRequired) {
                long j = this.measuredSize;
                LookaheadDelegateForLayoutModifierNode lookaheadDelegateForLayoutModifierNode = this.lookaheadDelegate;
                if (IntSize.m1054equalsimpl(lookaheadDelegateForLayoutModifierNode != null ? new IntSize(lookaheadDelegateForLayoutModifierNode.m880getSizeYbymL2g$ui()) : null, j)) {
                    long j2 = nodeCoordinator.measuredSize;
                    LookaheadDelegate lookaheadDelegate = nodeCoordinator.getLookaheadDelegate();
                    if (IntSize.m1054equalsimpl(lookaheadDelegate != null ? new IntSize(lookaheadDelegate.m880getSizeYbymL2g$ui()) : null, j2)) {
                        z = true;
                        nodeCoordinator.forcePlaceWithLookaheadOffset = z;
                    }
                }
            }
            z = false;
            nodeCoordinator.forcePlaceWithLookaheadOffset = z;
        }
        nodeCoordinator.isPlacingForAlignment = this.isPlacingForAlignment;
        getMeasureResult$ui().placeChildren();
        nodeCoordinator.isPlacingForAlignment = false;
        nodeCoordinator.forcePlaceWithLookaheadOffset = false;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public final void performDraw(Canvas canvas, GraphicsLayer graphicsLayer) {
        NodeCoordinator nodeCoordinator;
        NodeCoordinator nodeCoordinator2 = this.wrapped;
        nodeCoordinator2.getClass();
        nodeCoordinator2.draw(canvas, graphicsLayer);
        if (!((AndroidComposeView) LayoutNodeKt.requireOwner(this.layoutNode)).getShowLayoutBounds() || (nodeCoordinator = this.wrapped) == null) {
            return;
        }
        if (IntSize.m1055equalsimpl0(this.measuredSize, nodeCoordinator.measuredSize) && IntOffset.m1047equalsimpl0(nodeCoordinator.position, 0L)) {
            return;
        }
        long j = this.measuredSize;
        canvas.drawRect(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & BodyPartID.bodyIdMax)) - 0.5f, modifierBoundsPaint);
    }

    @Override // androidx.compose.ui.node.NodeCoordinator, androidx.compose.ui.layout.Placeable
    /* renamed from: placeAt-f8xVGno */
    public final void mo851placeAtf8xVGno(long j, float f, GraphicsLayer graphicsLayer) {
        LayoutModifierNodeCoordinator layoutModifierNodeCoordinator;
        if (this.forcePlaceWithLookaheadOffset) {
            LookaheadDelegate lookaheadDelegate = getLookaheadDelegate();
            lookaheadDelegate.getClass();
            layoutModifierNodeCoordinator = this;
            layoutModifierNodeCoordinator.m900placeSelfMLgxB_4(lookaheadDelegate.position, f, null, graphicsLayer);
        } else {
            layoutModifierNodeCoordinator = this;
            layoutModifierNodeCoordinator.m900placeSelfMLgxB_4(j, f, null, graphicsLayer);
        }
        layoutModifierNodeCoordinator.onAfterPlaceAt$1();
    }

    public final void setLayoutModifierNode$ui(LayoutModifierNode layoutModifierNode) {
        if (!layoutModifierNode.equals(this.layoutModifierNode)) {
            if ((layoutModifierNode.getNode().getKindSet$ui() & 512) != 0) {
                ApproachLayoutModifierNode approachLayoutModifierNode = (ApproachLayoutModifierNode) layoutModifierNode;
                ApproachMeasureScopeImpl approachMeasureScopeImpl = this.approachMeasureScope;
                if (approachMeasureScopeImpl != null) {
                    approachMeasureScopeImpl.approachNode = approachLayoutModifierNode;
                } else {
                    approachMeasureScopeImpl = new ApproachMeasureScopeImpl(this, approachLayoutModifierNode);
                }
                this.approachMeasureScope = approachMeasureScopeImpl;
            } else {
                this.approachMeasureScope = null;
            }
        }
        this.layoutModifierNode = layoutModifierNode;
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
        onAfterPlaceAt$1();
    }
}
