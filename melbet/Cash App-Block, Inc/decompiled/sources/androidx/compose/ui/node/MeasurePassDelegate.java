package androidx.compose.ui.node;

import androidx.compose.animation.BoundsAnimation$animate$1;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.OuterPlacementScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.PlaceableKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LookaheadPassDelegate;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.ImageLoader$Builder;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class MeasurePassDelegate extends Placeable implements Measurable, AlignmentLinesOwner, MotionReferencePlacementDelegate {
    public boolean duringAlignmentLinesQuery;
    public boolean isPlaced;
    public boolean isPlacedByParent;
    public GraphicsLayer lastExplicitLayer;
    public Function1 lastLayerBlock;
    public float lastZIndex;
    public boolean layingOutChildren;
    public final MeasurePassDelegate$layoutChildrenBlock$1 layoutChildrenBlock;
    public final LayoutNodeLayoutDelegate layoutNodeLayoutDelegate;
    public boolean layoutPending;
    public boolean layoutPendingForAlignment;
    public boolean measurePending;
    public boolean measuredOnce;
    public boolean needsCoordinatesUpdate;
    public boolean onNodePlacedCalled;
    public Object parentData;
    public final MeasurePassDelegate$layoutChildrenBlock$1 performMeasureBlock;
    public final MeasurePassDelegate$layoutChildrenBlock$1 placeOuterCoordinatorBlock;
    public GraphicsLayer placeOuterCoordinatorLayer;
    public Function1 placeOuterCoordinatorLayerBlock;
    public float placeOuterCoordinatorZIndex;
    public boolean placedOnce;
    public boolean relayoutWithoutParentInProgress;
    public float zIndex;
    public int previousPlaceOrder = Integer.MAX_VALUE;
    public int placeOrder = Integer.MAX_VALUE;
    public LayoutNode.UsageByParent measuredByParent = LayoutNode.UsageByParent.NotUsed;
    public long lastPosition = 0;
    public boolean parentDataDirty = true;
    public final LookaheadAlignmentLines alignmentLines = new LookaheadAlignmentLines(this, 1);
    public final MutableVector _childDelegates = new MutableVector(0, new MeasurePassDelegate[16]);
    public boolean childDelegatesDirty = true;
    public long performMeasureConstraints = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15);
    public long placeOuterCoordinatorPosition = 0;

    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.compose.ui.node.MeasurePassDelegate$layoutChildrenBlock$1] */
    /* JADX WARN: Type inference failed for: r6v4, types: [androidx.compose.ui.node.MeasurePassDelegate$layoutChildrenBlock$1] */
    /* JADX WARN: Type inference failed for: r6v5, types: [androidx.compose.ui.node.MeasurePassDelegate$layoutChildrenBlock$1] */
    public MeasurePassDelegate(LayoutNodeLayoutDelegate layoutNodeLayoutDelegate) {
        this.layoutNodeLayoutDelegate = layoutNodeLayoutDelegate;
        final int i = 1;
        final int i2 = 0;
        this.performMeasureBlock = new Function0(this) { // from class: androidx.compose.ui.node.MeasurePassDelegate$layoutChildrenBlock$1
            public final /* synthetic */ MeasurePassDelegate this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OuterPlacementScope outerPlacementScope;
                int i3 = i;
                MeasurePassDelegate measurePassDelegate = this.this$0;
                switch (i3) {
                    case 0:
                        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate2 = measurePassDelegate.layoutNodeLayoutDelegate;
                        layoutNodeLayoutDelegate2.nextChildPlaceOrder = 0;
                        MutableVector mutableVector = layoutNodeLayoutDelegate2.layoutNode.get_children$ui();
                        Object[] objArr = mutableVector.content;
                        int i4 = mutableVector.size;
                        for (int i5 = 0; i5 < i4; i5++) {
                            MeasurePassDelegate measurePassDelegate2 = ((LayoutNode) objArr[i5]).layoutDelegate.measurePassDelegate;
                            measurePassDelegate2.previousPlaceOrder = measurePassDelegate2.placeOrder;
                            measurePassDelegate2.placeOrder = Integer.MAX_VALUE;
                            measurePassDelegate2.isPlacedByParent = false;
                            if (measurePassDelegate2.measuredByParent == LayoutNode.UsageByParent.InLayoutBlock) {
                                measurePassDelegate2.measuredByParent = LayoutNode.UsageByParent.NotUsed;
                            }
                        }
                        LayoutNode layoutNode = layoutNodeLayoutDelegate2.layoutNode;
                        LayoutNode layoutNode2 = layoutNodeLayoutDelegate2.layoutNode;
                        MutableVector mutableVector2 = layoutNode.get_children$ui();
                        Object[] objArr2 = mutableVector2.content;
                        int i6 = mutableVector2.size;
                        for (int i7 = 0; i7 < i6; i7++) {
                            ((LayoutNode) objArr2[i7]).layoutDelegate.measurePassDelegate.alignmentLines.usedDuringParentLayout = false;
                        }
                        if (measurePassDelegate.getInnerCoordinator().isPlacingForAlignment) {
                            List children$ui = layoutNode2.getChildren$ui();
                            int size = children$ui.size();
                            for (int i8 = 0; i8 < size; i8++) {
                                ((NodeCoordinator) ((LayoutNode) ((MutableVector.MutableVectorList) children$ui).get(i8)).nodes.outerCoordinator).isPlacingForAlignment = true;
                            }
                        }
                        measurePassDelegate.getInnerCoordinator().getMeasureResult$ui().placeChildren();
                        if (measurePassDelegate.getInnerCoordinator().isPlacingForAlignment) {
                            List children$ui2 = layoutNode2.getChildren$ui();
                            int size2 = children$ui2.size();
                            for (int i9 = 0; i9 < size2; i9++) {
                                ((NodeCoordinator) ((LayoutNode) ((MutableVector.MutableVectorList) children$ui2).get(i9)).nodes.outerCoordinator).isPlacingForAlignment = false;
                            }
                        }
                        MutableVector mutableVector3 = layoutNode2.get_children$ui();
                        Object[] objArr3 = mutableVector3.content;
                        int i10 = mutableVector3.size;
                        for (int i11 = 0; i11 < i10; i11++) {
                            LayoutNode layoutNode3 = (LayoutNode) objArr3[i11];
                            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate3 = layoutNode3.layoutDelegate;
                            if (layoutNodeLayoutDelegate3.measurePassDelegate.previousPlaceOrder != layoutNode3.getPlaceOrder$ui()) {
                                layoutNode2.onZSortedChildrenInvalidated$ui();
                                layoutNode2.invalidateLayer$ui();
                                if (layoutNode3.getPlaceOrder$ui() == Integer.MAX_VALUE) {
                                    if (layoutNodeLayoutDelegate3.detachedFromParentLookaheadPlacement || DepthSortedSetKt.isOutMostLookaheadRoot(layoutNode3)) {
                                        LookaheadPassDelegate lookaheadPassDelegate = layoutNodeLayoutDelegate3.lookaheadPassDelegate;
                                        lookaheadPassDelegate.getClass();
                                        lookaheadPassDelegate.markNodeAndSubtreeAsNotPlaced$ui(false);
                                    }
                                    layoutNodeLayoutDelegate3.measurePassDelegate.markSubtreeAsNotPlaced();
                                }
                            }
                        }
                        MutableVector mutableVector4 = layoutNode2.get_children$ui();
                        Object[] objArr4 = mutableVector4.content;
                        int i12 = mutableVector4.size;
                        for (int i13 = 0; i13 < i12; i13++) {
                            LookaheadAlignmentLines lookaheadAlignmentLines = ((LayoutNode) objArr4[i13]).layoutDelegate.measurePassDelegate.alignmentLines;
                            lookaheadAlignmentLines.previousUsedDuringParentLayout = lookaheadAlignmentLines.usedDuringParentLayout;
                        }
                        break;
                    case 1:
                        measurePassDelegate.layoutNodeLayoutDelegate.getOuterCoordinator().mo833measureBRTryo0(measurePassDelegate.performMeasureConstraints);
                        break;
                    default:
                        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate4 = measurePassDelegate.layoutNodeLayoutDelegate;
                        NodeCoordinator nodeCoordinator = layoutNodeLayoutDelegate4.getOuterCoordinator().wrappedBy;
                        if (nodeCoordinator == null || (outerPlacementScope = nodeCoordinator.placementScope) == null) {
                            AndroidComposeView androidComposeView = (AndroidComposeView) LayoutNodeKt.requireOwner(layoutNodeLayoutDelegate4.layoutNode);
                            int i14 = PlaceableKt.$r8$clinit;
                            outerPlacementScope = new OuterPlacementScope(androidComposeView, 0);
                        }
                        Function1 function1 = measurePassDelegate.placeOuterCoordinatorLayerBlock;
                        GraphicsLayer graphicsLayer = measurePassDelegate.placeOuterCoordinatorLayer;
                        if (graphicsLayer != null) {
                            NodeCoordinator outerCoordinator = layoutNodeLayoutDelegate4.getOuterCoordinator();
                            long j = measurePassDelegate.placeOuterCoordinatorPosition;
                            float f = measurePassDelegate.placeOuterCoordinatorZIndex;
                            Placeable.PlacementScope.access$handleMotionFrameOfReferencePlacement(outerPlacementScope, outerCoordinator);
                            outerCoordinator.mo851placeAtf8xVGno(IntOffset.m1049plusqkQi6aY(j, outerCoordinator.apparentToRealOffset), f, graphicsLayer);
                        } else if (function1 == null) {
                            NodeCoordinator outerCoordinator2 = layoutNodeLayoutDelegate4.getOuterCoordinator();
                            long j2 = measurePassDelegate.placeOuterCoordinatorPosition;
                            float f2 = measurePassDelegate.placeOuterCoordinatorZIndex;
                            Placeable.PlacementScope.access$handleMotionFrameOfReferencePlacement(outerPlacementScope, outerCoordinator2);
                            outerCoordinator2.mo836placeAtf8xVGno(IntOffset.m1049plusqkQi6aY(j2, outerCoordinator2.apparentToRealOffset), f2, (Function1) null);
                        } else {
                            NodeCoordinator outerCoordinator3 = layoutNodeLayoutDelegate4.getOuterCoordinator();
                            long j3 = measurePassDelegate.placeOuterCoordinatorPosition;
                            float f3 = measurePassDelegate.placeOuterCoordinatorZIndex;
                            Placeable.PlacementScope.access$handleMotionFrameOfReferencePlacement(outerPlacementScope, outerCoordinator3);
                            outerCoordinator3.mo836placeAtf8xVGno(IntOffset.m1049plusqkQi6aY(j3, outerCoordinator3.apparentToRealOffset), f3, function1);
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        };
        this.layoutChildrenBlock = new Function0(this) { // from class: androidx.compose.ui.node.MeasurePassDelegate$layoutChildrenBlock$1
            public final /* synthetic */ MeasurePassDelegate this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OuterPlacementScope outerPlacementScope;
                int i3 = i2;
                MeasurePassDelegate measurePassDelegate = this.this$0;
                switch (i3) {
                    case 0:
                        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate2 = measurePassDelegate.layoutNodeLayoutDelegate;
                        layoutNodeLayoutDelegate2.nextChildPlaceOrder = 0;
                        MutableVector mutableVector = layoutNodeLayoutDelegate2.layoutNode.get_children$ui();
                        Object[] objArr = mutableVector.content;
                        int i4 = mutableVector.size;
                        for (int i5 = 0; i5 < i4; i5++) {
                            MeasurePassDelegate measurePassDelegate2 = ((LayoutNode) objArr[i5]).layoutDelegate.measurePassDelegate;
                            measurePassDelegate2.previousPlaceOrder = measurePassDelegate2.placeOrder;
                            measurePassDelegate2.placeOrder = Integer.MAX_VALUE;
                            measurePassDelegate2.isPlacedByParent = false;
                            if (measurePassDelegate2.measuredByParent == LayoutNode.UsageByParent.InLayoutBlock) {
                                measurePassDelegate2.measuredByParent = LayoutNode.UsageByParent.NotUsed;
                            }
                        }
                        LayoutNode layoutNode = layoutNodeLayoutDelegate2.layoutNode;
                        LayoutNode layoutNode2 = layoutNodeLayoutDelegate2.layoutNode;
                        MutableVector mutableVector2 = layoutNode.get_children$ui();
                        Object[] objArr2 = mutableVector2.content;
                        int i6 = mutableVector2.size;
                        for (int i7 = 0; i7 < i6; i7++) {
                            ((LayoutNode) objArr2[i7]).layoutDelegate.measurePassDelegate.alignmentLines.usedDuringParentLayout = false;
                        }
                        if (measurePassDelegate.getInnerCoordinator().isPlacingForAlignment) {
                            List children$ui = layoutNode2.getChildren$ui();
                            int size = children$ui.size();
                            for (int i8 = 0; i8 < size; i8++) {
                                ((NodeCoordinator) ((LayoutNode) ((MutableVector.MutableVectorList) children$ui).get(i8)).nodes.outerCoordinator).isPlacingForAlignment = true;
                            }
                        }
                        measurePassDelegate.getInnerCoordinator().getMeasureResult$ui().placeChildren();
                        if (measurePassDelegate.getInnerCoordinator().isPlacingForAlignment) {
                            List children$ui2 = layoutNode2.getChildren$ui();
                            int size2 = children$ui2.size();
                            for (int i9 = 0; i9 < size2; i9++) {
                                ((NodeCoordinator) ((LayoutNode) ((MutableVector.MutableVectorList) children$ui2).get(i9)).nodes.outerCoordinator).isPlacingForAlignment = false;
                            }
                        }
                        MutableVector mutableVector3 = layoutNode2.get_children$ui();
                        Object[] objArr3 = mutableVector3.content;
                        int i10 = mutableVector3.size;
                        for (int i11 = 0; i11 < i10; i11++) {
                            LayoutNode layoutNode3 = (LayoutNode) objArr3[i11];
                            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate3 = layoutNode3.layoutDelegate;
                            if (layoutNodeLayoutDelegate3.measurePassDelegate.previousPlaceOrder != layoutNode3.getPlaceOrder$ui()) {
                                layoutNode2.onZSortedChildrenInvalidated$ui();
                                layoutNode2.invalidateLayer$ui();
                                if (layoutNode3.getPlaceOrder$ui() == Integer.MAX_VALUE) {
                                    if (layoutNodeLayoutDelegate3.detachedFromParentLookaheadPlacement || DepthSortedSetKt.isOutMostLookaheadRoot(layoutNode3)) {
                                        LookaheadPassDelegate lookaheadPassDelegate = layoutNodeLayoutDelegate3.lookaheadPassDelegate;
                                        lookaheadPassDelegate.getClass();
                                        lookaheadPassDelegate.markNodeAndSubtreeAsNotPlaced$ui(false);
                                    }
                                    layoutNodeLayoutDelegate3.measurePassDelegate.markSubtreeAsNotPlaced();
                                }
                            }
                        }
                        MutableVector mutableVector4 = layoutNode2.get_children$ui();
                        Object[] objArr4 = mutableVector4.content;
                        int i12 = mutableVector4.size;
                        for (int i13 = 0; i13 < i12; i13++) {
                            LookaheadAlignmentLines lookaheadAlignmentLines = ((LayoutNode) objArr4[i13]).layoutDelegate.measurePassDelegate.alignmentLines;
                            lookaheadAlignmentLines.previousUsedDuringParentLayout = lookaheadAlignmentLines.usedDuringParentLayout;
                        }
                        break;
                    case 1:
                        measurePassDelegate.layoutNodeLayoutDelegate.getOuterCoordinator().mo833measureBRTryo0(measurePassDelegate.performMeasureConstraints);
                        break;
                    default:
                        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate4 = measurePassDelegate.layoutNodeLayoutDelegate;
                        NodeCoordinator nodeCoordinator = layoutNodeLayoutDelegate4.getOuterCoordinator().wrappedBy;
                        if (nodeCoordinator == null || (outerPlacementScope = nodeCoordinator.placementScope) == null) {
                            AndroidComposeView androidComposeView = (AndroidComposeView) LayoutNodeKt.requireOwner(layoutNodeLayoutDelegate4.layoutNode);
                            int i14 = PlaceableKt.$r8$clinit;
                            outerPlacementScope = new OuterPlacementScope(androidComposeView, 0);
                        }
                        Function1 function1 = measurePassDelegate.placeOuterCoordinatorLayerBlock;
                        GraphicsLayer graphicsLayer = measurePassDelegate.placeOuterCoordinatorLayer;
                        if (graphicsLayer != null) {
                            NodeCoordinator outerCoordinator = layoutNodeLayoutDelegate4.getOuterCoordinator();
                            long j = measurePassDelegate.placeOuterCoordinatorPosition;
                            float f = measurePassDelegate.placeOuterCoordinatorZIndex;
                            Placeable.PlacementScope.access$handleMotionFrameOfReferencePlacement(outerPlacementScope, outerCoordinator);
                            outerCoordinator.mo851placeAtf8xVGno(IntOffset.m1049plusqkQi6aY(j, outerCoordinator.apparentToRealOffset), f, graphicsLayer);
                        } else if (function1 == null) {
                            NodeCoordinator outerCoordinator2 = layoutNodeLayoutDelegate4.getOuterCoordinator();
                            long j2 = measurePassDelegate.placeOuterCoordinatorPosition;
                            float f2 = measurePassDelegate.placeOuterCoordinatorZIndex;
                            Placeable.PlacementScope.access$handleMotionFrameOfReferencePlacement(outerPlacementScope, outerCoordinator2);
                            outerCoordinator2.mo836placeAtf8xVGno(IntOffset.m1049plusqkQi6aY(j2, outerCoordinator2.apparentToRealOffset), f2, (Function1) null);
                        } else {
                            NodeCoordinator outerCoordinator3 = layoutNodeLayoutDelegate4.getOuterCoordinator();
                            long j3 = measurePassDelegate.placeOuterCoordinatorPosition;
                            float f3 = measurePassDelegate.placeOuterCoordinatorZIndex;
                            Placeable.PlacementScope.access$handleMotionFrameOfReferencePlacement(outerPlacementScope, outerCoordinator3);
                            outerCoordinator3.mo836placeAtf8xVGno(IntOffset.m1049plusqkQi6aY(j3, outerCoordinator3.apparentToRealOffset), f3, function1);
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        };
        final int i3 = 2;
        this.placeOuterCoordinatorBlock = new Function0(this) { // from class: androidx.compose.ui.node.MeasurePassDelegate$layoutChildrenBlock$1
            public final /* synthetic */ MeasurePassDelegate this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OuterPlacementScope outerPlacementScope;
                int i32 = i3;
                MeasurePassDelegate measurePassDelegate = this.this$0;
                switch (i32) {
                    case 0:
                        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate2 = measurePassDelegate.layoutNodeLayoutDelegate;
                        layoutNodeLayoutDelegate2.nextChildPlaceOrder = 0;
                        MutableVector mutableVector = layoutNodeLayoutDelegate2.layoutNode.get_children$ui();
                        Object[] objArr = mutableVector.content;
                        int i4 = mutableVector.size;
                        for (int i5 = 0; i5 < i4; i5++) {
                            MeasurePassDelegate measurePassDelegate2 = ((LayoutNode) objArr[i5]).layoutDelegate.measurePassDelegate;
                            measurePassDelegate2.previousPlaceOrder = measurePassDelegate2.placeOrder;
                            measurePassDelegate2.placeOrder = Integer.MAX_VALUE;
                            measurePassDelegate2.isPlacedByParent = false;
                            if (measurePassDelegate2.measuredByParent == LayoutNode.UsageByParent.InLayoutBlock) {
                                measurePassDelegate2.measuredByParent = LayoutNode.UsageByParent.NotUsed;
                            }
                        }
                        LayoutNode layoutNode = layoutNodeLayoutDelegate2.layoutNode;
                        LayoutNode layoutNode2 = layoutNodeLayoutDelegate2.layoutNode;
                        MutableVector mutableVector2 = layoutNode.get_children$ui();
                        Object[] objArr2 = mutableVector2.content;
                        int i6 = mutableVector2.size;
                        for (int i7 = 0; i7 < i6; i7++) {
                            ((LayoutNode) objArr2[i7]).layoutDelegate.measurePassDelegate.alignmentLines.usedDuringParentLayout = false;
                        }
                        if (measurePassDelegate.getInnerCoordinator().isPlacingForAlignment) {
                            List children$ui = layoutNode2.getChildren$ui();
                            int size = children$ui.size();
                            for (int i8 = 0; i8 < size; i8++) {
                                ((NodeCoordinator) ((LayoutNode) ((MutableVector.MutableVectorList) children$ui).get(i8)).nodes.outerCoordinator).isPlacingForAlignment = true;
                            }
                        }
                        measurePassDelegate.getInnerCoordinator().getMeasureResult$ui().placeChildren();
                        if (measurePassDelegate.getInnerCoordinator().isPlacingForAlignment) {
                            List children$ui2 = layoutNode2.getChildren$ui();
                            int size2 = children$ui2.size();
                            for (int i9 = 0; i9 < size2; i9++) {
                                ((NodeCoordinator) ((LayoutNode) ((MutableVector.MutableVectorList) children$ui2).get(i9)).nodes.outerCoordinator).isPlacingForAlignment = false;
                            }
                        }
                        MutableVector mutableVector3 = layoutNode2.get_children$ui();
                        Object[] objArr3 = mutableVector3.content;
                        int i10 = mutableVector3.size;
                        for (int i11 = 0; i11 < i10; i11++) {
                            LayoutNode layoutNode3 = (LayoutNode) objArr3[i11];
                            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate3 = layoutNode3.layoutDelegate;
                            if (layoutNodeLayoutDelegate3.measurePassDelegate.previousPlaceOrder != layoutNode3.getPlaceOrder$ui()) {
                                layoutNode2.onZSortedChildrenInvalidated$ui();
                                layoutNode2.invalidateLayer$ui();
                                if (layoutNode3.getPlaceOrder$ui() == Integer.MAX_VALUE) {
                                    if (layoutNodeLayoutDelegate3.detachedFromParentLookaheadPlacement || DepthSortedSetKt.isOutMostLookaheadRoot(layoutNode3)) {
                                        LookaheadPassDelegate lookaheadPassDelegate = layoutNodeLayoutDelegate3.lookaheadPassDelegate;
                                        lookaheadPassDelegate.getClass();
                                        lookaheadPassDelegate.markNodeAndSubtreeAsNotPlaced$ui(false);
                                    }
                                    layoutNodeLayoutDelegate3.measurePassDelegate.markSubtreeAsNotPlaced();
                                }
                            }
                        }
                        MutableVector mutableVector4 = layoutNode2.get_children$ui();
                        Object[] objArr4 = mutableVector4.content;
                        int i12 = mutableVector4.size;
                        for (int i13 = 0; i13 < i12; i13++) {
                            LookaheadAlignmentLines lookaheadAlignmentLines = ((LayoutNode) objArr4[i13]).layoutDelegate.measurePassDelegate.alignmentLines;
                            lookaheadAlignmentLines.previousUsedDuringParentLayout = lookaheadAlignmentLines.usedDuringParentLayout;
                        }
                        break;
                    case 1:
                        measurePassDelegate.layoutNodeLayoutDelegate.getOuterCoordinator().mo833measureBRTryo0(measurePassDelegate.performMeasureConstraints);
                        break;
                    default:
                        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate4 = measurePassDelegate.layoutNodeLayoutDelegate;
                        NodeCoordinator nodeCoordinator = layoutNodeLayoutDelegate4.getOuterCoordinator().wrappedBy;
                        if (nodeCoordinator == null || (outerPlacementScope = nodeCoordinator.placementScope) == null) {
                            AndroidComposeView androidComposeView = (AndroidComposeView) LayoutNodeKt.requireOwner(layoutNodeLayoutDelegate4.layoutNode);
                            int i14 = PlaceableKt.$r8$clinit;
                            outerPlacementScope = new OuterPlacementScope(androidComposeView, 0);
                        }
                        Function1 function1 = measurePassDelegate.placeOuterCoordinatorLayerBlock;
                        GraphicsLayer graphicsLayer = measurePassDelegate.placeOuterCoordinatorLayer;
                        if (graphicsLayer != null) {
                            NodeCoordinator outerCoordinator = layoutNodeLayoutDelegate4.getOuterCoordinator();
                            long j = measurePassDelegate.placeOuterCoordinatorPosition;
                            float f = measurePassDelegate.placeOuterCoordinatorZIndex;
                            Placeable.PlacementScope.access$handleMotionFrameOfReferencePlacement(outerPlacementScope, outerCoordinator);
                            outerCoordinator.mo851placeAtf8xVGno(IntOffset.m1049plusqkQi6aY(j, outerCoordinator.apparentToRealOffset), f, graphicsLayer);
                        } else if (function1 == null) {
                            NodeCoordinator outerCoordinator2 = layoutNodeLayoutDelegate4.getOuterCoordinator();
                            long j2 = measurePassDelegate.placeOuterCoordinatorPosition;
                            float f2 = measurePassDelegate.placeOuterCoordinatorZIndex;
                            Placeable.PlacementScope.access$handleMotionFrameOfReferencePlacement(outerPlacementScope, outerCoordinator2);
                            outerCoordinator2.mo836placeAtf8xVGno(IntOffset.m1049plusqkQi6aY(j2, outerCoordinator2.apparentToRealOffset), f2, (Function1) null);
                        } else {
                            NodeCoordinator outerCoordinator3 = layoutNodeLayoutDelegate4.getOuterCoordinator();
                            long j3 = measurePassDelegate.placeOuterCoordinatorPosition;
                            float f3 = measurePassDelegate.placeOuterCoordinatorZIndex;
                            Placeable.PlacementScope.access$handleMotionFrameOfReferencePlacement(outerPlacementScope, outerCoordinator3);
                            outerCoordinator3.mo836placeAtf8xVGno(IntOffset.m1049plusqkQi6aY(j3, outerCoordinator3.apparentToRealOffset), f3, function1);
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        };
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    public final void forEachChildAlignmentLinesOwner(BoundsAnimation$animate$1 boundsAnimation$animate$1) {
        MutableVector mutableVector = this.layoutNodeLayoutDelegate.layoutNode.get_children$ui();
        Object[] objArr = mutableVector.content;
        int i = mutableVector.size;
        for (int i2 = 0; i2 < i; i2++) {
            boundsAnimation$animate$1.invoke(((LayoutNode) objArr[i2]).layoutDelegate.measurePassDelegate);
        }
    }

    @Override // androidx.compose.ui.layout.Placeable
    public final int get(AlignmentLine alignmentLine) {
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.layoutNodeLayoutDelegate;
        LayoutNode parent$ui = layoutNodeLayoutDelegate.layoutNode.getParent$ui();
        LayoutNode.LayoutState layoutState = parent$ui != null ? parent$ui.layoutDelegate.layoutState : null;
        LayoutNode.LayoutState layoutState2 = LayoutNode.LayoutState.Measuring;
        LookaheadAlignmentLines lookaheadAlignmentLines = this.alignmentLines;
        if (layoutState == layoutState2) {
            lookaheadAlignmentLines.usedDuringParentMeasurement = true;
        } else {
            LayoutNode parent$ui2 = layoutNodeLayoutDelegate.layoutNode.getParent$ui();
            if ((parent$ui2 != null ? parent$ui2.layoutDelegate.layoutState : null) == LayoutNode.LayoutState.LayingOut) {
                lookaheadAlignmentLines.usedDuringParentLayout = true;
            }
        }
        this.duringAlignmentLinesQuery = true;
        int i = layoutNodeLayoutDelegate.getOuterCoordinator().get(alignmentLine);
        this.duringAlignmentLinesQuery = false;
        return i;
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    public final LookaheadAlignmentLines getAlignmentLines() {
        return this.alignmentLines;
    }

    public final List getChildDelegates$ui() {
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.layoutNodeLayoutDelegate;
        layoutNodeLayoutDelegate.layoutNode.updateChildrenIfDirty$ui();
        boolean z = this.childDelegatesDirty;
        MutableVector mutableVector = this._childDelegates;
        if (!z) {
            return mutableVector.asMutableList();
        }
        LayoutNode layoutNode = layoutNodeLayoutDelegate.layoutNode;
        MutableVector mutableVector2 = layoutNode.get_children$ui();
        Object[] objArr = mutableVector2.content;
        int i = mutableVector2.size;
        for (int i2 = 0; i2 < i; i2++) {
            LayoutNode layoutNode2 = (LayoutNode) objArr[i2];
            if (mutableVector.size <= i2) {
                mutableVector.add(layoutNode2.layoutDelegate.measurePassDelegate);
            } else {
                MeasurePassDelegate measurePassDelegate = layoutNode2.layoutDelegate.measurePassDelegate;
                Object[] objArr2 = mutableVector.content;
                Object obj = objArr2[i2];
                objArr2[i2] = measurePassDelegate;
            }
        }
        mutableVector.removeRange(((MutableVector.MutableVectorList) layoutNode.getChildren$ui()).vector.size, mutableVector.size);
        this.childDelegatesDirty = false;
        return mutableVector.asMutableList();
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    public final InnerNodeCoordinator getInnerCoordinator() {
        return (InnerNodeCoordinator) this.layoutNodeLayoutDelegate.layoutNode.nodes.innerCoordinator;
    }

    @Override // androidx.compose.ui.layout.Placeable
    public final int getMeasuredHeight() {
        return this.layoutNodeLayoutDelegate.getOuterCoordinator().getMeasuredHeight();
    }

    @Override // androidx.compose.ui.layout.Placeable
    public final int getMeasuredWidth() {
        return this.layoutNodeLayoutDelegate.getOuterCoordinator().getMeasuredWidth();
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    public final AlignmentLinesOwner getParentAlignmentLinesOwner() {
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate;
        LayoutNode parent$ui = this.layoutNodeLayoutDelegate.layoutNode.getParent$ui();
        if (parent$ui == null || (layoutNodeLayoutDelegate = parent$ui.layoutDelegate) == null) {
            return null;
        }
        return layoutNodeLayoutDelegate.measurePassDelegate;
    }

    @Override // androidx.compose.ui.layout.Placeable, androidx.compose.ui.layout.IntrinsicMeasurable
    public final Object getParentData() {
        return this.parentData;
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    public final int getPlaceOrder() {
        return this.placeOrder;
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    public final void layoutChildren() {
        boolean z;
        this.layingOutChildren = true;
        LookaheadAlignmentLines lookaheadAlignmentLines = this.alignmentLines;
        lookaheadAlignmentLines.recalculateQueryOwner();
        boolean z2 = this.layoutPending;
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.layoutNodeLayoutDelegate;
        if (z2) {
            MutableVector mutableVector = layoutNodeLayoutDelegate.layoutNode.get_children$ui();
            Object[] objArr = mutableVector.content;
            int i = mutableVector.size;
            for (int i2 = 0; i2 < i; i2++) {
                LayoutNode layoutNode = (LayoutNode) objArr[i2];
                boolean measurePending$ui = layoutNode.getMeasurePending$ui();
                LayoutNodeLayoutDelegate layoutNodeLayoutDelegate2 = layoutNode.layoutDelegate;
                if (measurePending$ui && layoutNode.getMeasuredByParent$ui() == LayoutNode.UsageByParent.InMeasureBlock) {
                    MeasurePassDelegate measurePassDelegate = layoutNodeLayoutDelegate2.measurePassDelegate;
                    Constraints constraints = measurePassDelegate.measuredOnce ? new Constraints(measurePassDelegate.measurementConstraints) : null;
                    if (constraints != null) {
                        if (layoutNode.intrinsicsUsageByParent == LayoutNode.UsageByParent.NotUsed) {
                            layoutNode.clearSubtreeIntrinsicsUsage$ui();
                        }
                        z = layoutNodeLayoutDelegate2.measurePassDelegate.m887remeasureBRTryo0(constraints.value);
                    } else {
                        z = false;
                    }
                    if (z) {
                        LayoutNode.requestRemeasure$ui$default(layoutNodeLayoutDelegate.layoutNode, false, 7);
                    }
                }
            }
        }
        if (this.layoutPendingForAlignment || (!this.duringAlignmentLinesQuery && !getInnerCoordinator().isPlacingForAlignment && this.layoutPending)) {
            this.layoutPending = false;
            LayoutNode.LayoutState layoutState = layoutNodeLayoutDelegate.layoutState;
            layoutNodeLayoutDelegate.layoutState = LayoutNode.LayoutState.LayingOut;
            layoutNodeLayoutDelegate.setCoordinatesAccessedDuringPlacement(false);
            LayoutNode layoutNode2 = layoutNodeLayoutDelegate.layoutNode;
            ImageLoader$Builder imageLoader$Builder = ((AndroidComposeView) LayoutNodeKt.requireOwner(layoutNode2)).snapshotObserver;
            ((SnapshotStateObserver) imageLoader$Builder.application).observeReads(layoutNode2, (OwnerSnapshotObserver$onCommitAffectingLayout$1) imageLoader$Builder.diskCacheLazy, this.layoutChildrenBlock);
            layoutNodeLayoutDelegate.layoutState = layoutState;
            this.layoutPendingForAlignment = false;
        }
        if (lookaheadAlignmentLines.usedDuringParentLayout) {
            lookaheadAlignmentLines.previousUsedDuringParentLayout = true;
        }
        if (lookaheadAlignmentLines.dirty && lookaheadAlignmentLines.getRequired$ui()) {
            lookaheadAlignmentLines.recalculate();
        }
        this.layingOutChildren = false;
    }

    public final void markNodeAndSubtreeAsPlaced$1() {
        boolean z = this.isPlaced;
        this.isPlaced = true;
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.layoutNodeLayoutDelegate;
        LayoutNode layoutNode = layoutNodeLayoutDelegate.layoutNode;
        NodeChain nodeChain = layoutNode.nodes;
        if (!z) {
            ((InnerNodeCoordinator) nodeChain.innerCoordinator).onPlaced();
            ((AndroidComposeView) LayoutNodeKt.requireOwner(layoutNode)).rectManager.recalculateRectIfDirty(layoutNodeLayoutDelegate.layoutNode);
            if (layoutNode.getMeasurePending$ui()) {
                LayoutNode.requestRemeasure$ui$default(layoutNode, true, 6);
            } else if (layoutNode.layoutDelegate.lookaheadMeasurePending) {
                LayoutNode.requestLookaheadRemeasure$ui$default(layoutNode, true, 6);
            }
        }
        NodeCoordinator nodeCoordinator = ((InnerNodeCoordinator) nodeChain.innerCoordinator).wrapped;
        for (NodeCoordinator nodeCoordinator2 = (NodeCoordinator) nodeChain.outerCoordinator; !Intrinsics.areEqual(nodeCoordinator2, nodeCoordinator) && nodeCoordinator2 != null; nodeCoordinator2 = nodeCoordinator2.wrapped) {
            if (nodeCoordinator2.lastLayerDrawingWasSkipped) {
                nodeCoordinator2.invalidateLayer();
            }
        }
        MutableVector mutableVector = layoutNode.get_children$ui();
        Object[] objArr = mutableVector.content;
        int i = mutableVector.size;
        for (int i2 = 0; i2 < i; i2++) {
            LayoutNode layoutNode2 = (LayoutNode) objArr[i2];
            if (layoutNode2.getPlaceOrder$ui() != Integer.MAX_VALUE) {
                layoutNode2.layoutDelegate.measurePassDelegate.markNodeAndSubtreeAsPlaced$1();
                LayoutNode.rescheduleRemeasureOrRelayout$ui(layoutNode2);
            }
        }
    }

    public final void markSubtreeAsNotPlaced() {
        if (this.isPlaced) {
            this.isPlaced = false;
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.layoutNodeLayoutDelegate;
            LayoutNode layoutNode = layoutNodeLayoutDelegate.layoutNode;
            LayoutNode layoutNode2 = layoutNodeLayoutDelegate.layoutNode;
            ((AndroidComposeView) LayoutNodeKt.requireOwner(layoutNode)).rectManager.remove(layoutNode2);
            NodeChain nodeChain = layoutNode2.nodes;
            NodeCoordinator nodeCoordinator = ((InnerNodeCoordinator) nodeChain.innerCoordinator).wrapped;
            for (NodeCoordinator nodeCoordinator2 = (NodeCoordinator) nodeChain.outerCoordinator; !Intrinsics.areEqual(nodeCoordinator2, nodeCoordinator) && nodeCoordinator2 != null; nodeCoordinator2 = nodeCoordinator2.wrapped) {
                nodeCoordinator2.onUnplaced();
                nodeCoordinator2.releaseLayer();
            }
            MutableVector mutableVector = layoutNode2.get_children$ui();
            Object[] objArr = mutableVector.content;
            int i = mutableVector.size;
            for (int i2 = 0; i2 < i; i2++) {
                ((LayoutNode) objArr[i2]).layoutDelegate.measurePassDelegate.markSubtreeAsNotPlaced();
            }
        }
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public final int maxIntrinsicHeight(int i) {
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.layoutNodeLayoutDelegate;
        if (!DepthSortedSetKt.isOutMostLookaheadRoot(layoutNodeLayoutDelegate.layoutNode)) {
            onIntrinsicsQueried$1();
            return layoutNodeLayoutDelegate.getOuterCoordinator().maxIntrinsicHeight(i);
        }
        LookaheadPassDelegate lookaheadPassDelegate = layoutNodeLayoutDelegate.lookaheadPassDelegate;
        lookaheadPassDelegate.getClass();
        return lookaheadPassDelegate.maxIntrinsicHeight(i);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public final int maxIntrinsicWidth(int i) {
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.layoutNodeLayoutDelegate;
        if (!DepthSortedSetKt.isOutMostLookaheadRoot(layoutNodeLayoutDelegate.layoutNode)) {
            onIntrinsicsQueried$1();
            return layoutNodeLayoutDelegate.getOuterCoordinator().maxIntrinsicWidth(i);
        }
        LookaheadPassDelegate lookaheadPassDelegate = layoutNodeLayoutDelegate.lookaheadPassDelegate;
        lookaheadPassDelegate.getClass();
        return lookaheadPassDelegate.maxIntrinsicWidth(i);
    }

    @Override // androidx.compose.ui.layout.Measurable
    /* renamed from: measure-BRTryo0 */
    public final Placeable mo833measureBRTryo0(long j) {
        LayoutNode.UsageByParent usageByParent;
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.layoutNodeLayoutDelegate;
        LayoutNode layoutNode = layoutNodeLayoutDelegate.layoutNode;
        LayoutNode layoutNode2 = layoutNodeLayoutDelegate.layoutNode;
        LayoutNode.UsageByParent usageByParent2 = layoutNode.intrinsicsUsageByParent;
        LayoutNode.UsageByParent usageByParent3 = LayoutNode.UsageByParent.NotUsed;
        if (usageByParent2 == usageByParent3) {
            layoutNode.clearSubtreeIntrinsicsUsage$ui();
        }
        if (DepthSortedSetKt.isOutMostLookaheadRoot(layoutNode2)) {
            LookaheadPassDelegate lookaheadPassDelegate = layoutNodeLayoutDelegate.lookaheadPassDelegate;
            lookaheadPassDelegate.getClass();
            lookaheadPassDelegate.measuredByParent = usageByParent3;
            lookaheadPassDelegate.mo833measureBRTryo0(j);
        }
        LayoutNode parent$ui = layoutNode2.getParent$ui();
        if (parent$ui != null) {
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate2 = parent$ui.layoutDelegate;
            if (this.measuredByParent != usageByParent3 && !layoutNode2.canMultiMeasure) {
                InlineClassHelperKt.throwIllegalStateException("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int ordinal = layoutNodeLayoutDelegate2.layoutState.ordinal();
            if (ordinal == 0) {
                usageByParent = LayoutNode.UsageByParent.InMeasureBlock;
            } else {
                if (ordinal != 2) {
                    a$$ExternalSyntheticBUOutline0.m$2(layoutNodeLayoutDelegate2.layoutState, "Measurable could be only measured from the parent's measure or layout block. Parents state is ");
                    return null;
                }
                usageByParent = LayoutNode.UsageByParent.InLayoutBlock;
            }
            this.measuredByParent = usageByParent;
        } else {
            this.measuredByParent = usageByParent3;
        }
        m887remeasureBRTryo0(j);
        return this;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public final int minIntrinsicHeight(int i) {
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.layoutNodeLayoutDelegate;
        if (!DepthSortedSetKt.isOutMostLookaheadRoot(layoutNodeLayoutDelegate.layoutNode)) {
            onIntrinsicsQueried$1();
            return layoutNodeLayoutDelegate.getOuterCoordinator().minIntrinsicHeight(i);
        }
        LookaheadPassDelegate lookaheadPassDelegate = layoutNodeLayoutDelegate.lookaheadPassDelegate;
        lookaheadPassDelegate.getClass();
        return lookaheadPassDelegate.minIntrinsicHeight(i);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public final int minIntrinsicWidth(int i) {
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.layoutNodeLayoutDelegate;
        if (!DepthSortedSetKt.isOutMostLookaheadRoot(layoutNodeLayoutDelegate.layoutNode)) {
            onIntrinsicsQueried$1();
            return layoutNodeLayoutDelegate.getOuterCoordinator().minIntrinsicWidth(i);
        }
        LookaheadPassDelegate lookaheadPassDelegate = layoutNodeLayoutDelegate.lookaheadPassDelegate;
        lookaheadPassDelegate.getClass();
        return lookaheadPassDelegate.minIntrinsicWidth(i);
    }

    public final void onIntrinsicsQueried$1() {
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.layoutNodeLayoutDelegate;
        LayoutNode.requestRemeasure$ui$default(layoutNodeLayoutDelegate.layoutNode, false, 7);
        LayoutNode layoutNode = layoutNodeLayoutDelegate.layoutNode;
        LayoutNode parent$ui = layoutNode.getParent$ui();
        if (parent$ui == null || layoutNode.intrinsicsUsageByParent != LayoutNode.UsageByParent.NotUsed) {
            return;
        }
        int ordinal = parent$ui.layoutDelegate.layoutState.ordinal();
        layoutNode.intrinsicsUsageByParent = ordinal != 0 ? ordinal != 2 ? parent$ui.intrinsicsUsageByParent : LayoutNode.UsageByParent.InLayoutBlock : LayoutNode.UsageByParent.InMeasureBlock;
    }

    public final void onNodePlaced$ui() {
        this.onNodePlacedCalled = true;
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.layoutNodeLayoutDelegate;
        LayoutNode parent$ui = layoutNodeLayoutDelegate.layoutNode.getParent$ui();
        float f = getInnerCoordinator().zIndex;
        LayoutNode layoutNode = layoutNodeLayoutDelegate.layoutNode;
        NodeChain nodeChain = layoutNode.nodes;
        NodeCoordinator nodeCoordinator = (NodeCoordinator) nodeChain.outerCoordinator;
        InnerNodeCoordinator innerNodeCoordinator = (InnerNodeCoordinator) nodeChain.innerCoordinator;
        while (nodeCoordinator != innerNodeCoordinator) {
            nodeCoordinator.getClass();
            LayoutModifierNodeCoordinator layoutModifierNodeCoordinator = (LayoutModifierNodeCoordinator) nodeCoordinator;
            f += layoutModifierNodeCoordinator.zIndex;
            nodeCoordinator = layoutModifierNodeCoordinator.wrapped;
        }
        if (f != this.zIndex) {
            this.zIndex = f;
            if (parent$ui != null) {
                parent$ui.onZSortedChildrenInvalidated$ui();
            }
            if (parent$ui != null) {
                parent$ui.invalidateLayer$ui();
            }
        }
        if (!getInnerCoordinator().isPlacingForAlignment) {
            boolean z = this.isPlaced;
            if (!z || this.alignmentLines.getQueried$ui()) {
                markNodeAndSubtreeAsPlaced$1();
            }
            if (z) {
                ((InnerNodeCoordinator) layoutNode.nodes.innerCoordinator).onPlaced();
            } else {
                if (parent$ui != null) {
                    parent$ui.invalidateLayer$ui();
                }
                if (this.relayoutWithoutParentInProgress && parent$ui != null) {
                    parent$ui.requestRelayout$ui(false);
                }
            }
        }
        if (parent$ui != null) {
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate2 = parent$ui.layoutDelegate;
            if (!this.relayoutWithoutParentInProgress && layoutNodeLayoutDelegate2.layoutState == LayoutNode.LayoutState.LayingOut) {
                if (this.placeOrder != Integer.MAX_VALUE) {
                    InlineClassHelperKt.throwIllegalStateException("Place was called on a node which was placed already");
                }
                int i = layoutNodeLayoutDelegate2.nextChildPlaceOrder;
                this.placeOrder = i;
                layoutNodeLayoutDelegate2.nextChildPlaceOrder = i + 1;
            }
        } else {
            this.placeOrder = 0;
        }
        layoutChildren();
    }

    @Override // androidx.compose.ui.layout.Placeable
    /* renamed from: placeAt-f8xVGno */
    public final void mo836placeAtf8xVGno(long j, float f, Function1 function1) {
        m886placeSelfMLgxB_4$2(j, f, function1, null);
    }

    /* renamed from: placeOuterCoordinator-MLgxB_4, reason: not valid java name */
    public final void m885placeOuterCoordinatorMLgxB_4(long j, float f, Function1 function1, GraphicsLayer graphicsLayer) {
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.layoutNodeLayoutDelegate;
        LayoutNode layoutNode = layoutNodeLayoutDelegate.layoutNode;
        LayoutNode layoutNode2 = layoutNodeLayoutDelegate.layoutNode;
        if (layoutNode.isDeactivated) {
            InlineClassHelperKt.throwIllegalArgumentException("place is called on a deactivated node");
        }
        layoutNodeLayoutDelegate.layoutState = LayoutNode.LayoutState.LayingOut;
        this.lastPosition = j;
        this.lastZIndex = f;
        this.lastLayerBlock = function1;
        this.lastExplicitLayer = graphicsLayer;
        this.onNodePlacedCalled = false;
        Owner requireOwner = LayoutNodeKt.requireOwner(layoutNode2);
        if (this.layoutPending || !this.isPlaced) {
            this.alignmentLines.usedByModifierLayout = false;
            layoutNodeLayoutDelegate.setCoordinatesAccessedDuringModifierPlacement(false);
            this.placeOuterCoordinatorLayerBlock = function1;
            this.placeOuterCoordinatorPosition = j;
            this.placeOuterCoordinatorZIndex = f;
            this.placeOuterCoordinatorLayer = graphicsLayer;
            ImageLoader$Builder imageLoader$Builder = ((AndroidComposeView) requireOwner).snapshotObserver;
            ((SnapshotStateObserver) imageLoader$Builder.application).observeReads(layoutNode2, (OwnerSnapshotObserver$onCommitAffectingLayout$1) imageLoader$Builder.eventListenerFactory, this.placeOuterCoordinatorBlock);
        } else {
            NodeCoordinator outerCoordinator = layoutNodeLayoutDelegate.getOuterCoordinator();
            outerCoordinator.m900placeSelfMLgxB_4(IntOffset.m1049plusqkQi6aY(j, outerCoordinator.apparentToRealOffset), f, function1, graphicsLayer);
            onNodePlaced$ui();
        }
        layoutNodeLayoutDelegate.layoutState = LayoutNode.LayoutState.Idle;
        if (layoutNodeLayoutDelegate.getOuterCoordinator().isPlacingForAlignment && (layoutNodeLayoutDelegate.coordinatesAccessedDuringModifierPlacement || layoutNodeLayoutDelegate.coordinatesAccessedDuringPlacement)) {
            requestLayout();
        }
        this.placedOnce = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0033 A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:3:0x0007, B:5:0x0012, B:7:0x0016, B:10:0x002f, B:12:0x0033, B:14:0x003b, B:17:0x0044, B:18:0x0046, B:20:0x004a, B:22:0x0050, B:24:0x0058, B:26:0x006a, B:28:0x0075, B:29:0x0079, B:30:0x005c, B:31:0x008e, B:33:0x0092, B:35:0x0096, B:36:0x009b, B:40:0x001f, B:42:0x0023, B:44:0x0027, B:46:0x002b), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0075 A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:3:0x0007, B:5:0x0012, B:7:0x0016, B:10:0x002f, B:12:0x0033, B:14:0x003b, B:17:0x0044, B:18:0x0046, B:20:0x004a, B:22:0x0050, B:24:0x0058, B:26:0x006a, B:28:0x0075, B:29:0x0079, B:30:0x005c, B:31:0x008e, B:33:0x0092, B:35:0x0096, B:36:0x009b, B:40:0x001f, B:42:0x0023, B:44:0x0027, B:46:0x002b), top: B:2:0x0007 }] */
    /* renamed from: placeSelf-MLgxB_4$2, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m886placeSelfMLgxB_4$2(long j, float f, Function1 function1, GraphicsLayer graphicsLayer) {
        LookaheadPassDelegate lookaheadPassDelegate;
        LookaheadPassDelegate lookaheadPassDelegate2;
        LookaheadPassDelegate lookaheadPassDelegate3;
        NodeCoordinator nodeCoordinator;
        LayoutNode parent$ui;
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.layoutNodeLayoutDelegate;
        LayoutNode layoutNode = layoutNodeLayoutDelegate.layoutNode;
        LayoutNode layoutNode2 = layoutNodeLayoutDelegate.layoutNode;
        try {
            this.isPlacedByParent = true;
            int i = 0;
            if (IntOffset.m1047equalsimpl0(j, this.lastPosition)) {
                if (function1 == this.lastLayerBlock) {
                    if (this.needsCoordinatesUpdate) {
                    }
                    lookaheadPassDelegate = layoutNodeLayoutDelegate.lookaheadPassDelegate;
                    if (lookaheadPassDelegate != null) {
                        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate2 = lookaheadPassDelegate.layoutNodeLayoutDelegate;
                        if (lookaheadPassDelegate._placedState == LookaheadPassDelegate.PlacedState.IsNotPlaced && !DepthSortedSetKt.isOutMostLookaheadRoot(layoutNodeLayoutDelegate2.layoutNode)) {
                            layoutNodeLayoutDelegate2.detachedFromParentLookaheadPlacement = true;
                        }
                    }
                    lookaheadPassDelegate2 = layoutNodeLayoutDelegate.lookaheadPassDelegate;
                    if (lookaheadPassDelegate2 != null && lookaheadPassDelegate2.getNeedsToBePlacedInApproach()) {
                        nodeCoordinator = layoutNodeLayoutDelegate.getOuterCoordinator().wrappedBy;
                        if (nodeCoordinator != null || (r3 = nodeCoordinator.placementScope) == null) {
                            AndroidComposeView androidComposeView = (AndroidComposeView) LayoutNodeKt.requireOwner(layoutNode2);
                            int i2 = PlaceableKt.$r8$clinit;
                            OuterPlacementScope outerPlacementScope = new OuterPlacementScope(androidComposeView, i);
                        }
                        LookaheadPassDelegate lookaheadPassDelegate4 = layoutNodeLayoutDelegate.lookaheadPassDelegate;
                        lookaheadPassDelegate4.getClass();
                        parent$ui = layoutNode2.getParent$ui();
                        if (parent$ui != null) {
                            parent$ui.layoutDelegate.nextChildLookaheadPlaceOrder = 0;
                        }
                        lookaheadPassDelegate4.placeOrder = Integer.MAX_VALUE;
                        outerPlacementScope.place(lookaheadPassDelegate4, (int) (j >> 32), (int) (BodyPartID.bodyIdMax & j), RecyclerView.DECELERATION_RATE);
                    }
                    lookaheadPassDelegate3 = layoutNodeLayoutDelegate.lookaheadPassDelegate;
                    if (lookaheadPassDelegate3 != null && !lookaheadPassDelegate3.placedOnce) {
                        InlineClassHelperKt.throwIllegalStateException("Error: Placement happened before lookahead.");
                    }
                    m885placeOuterCoordinatorMLgxB_4(j, f, function1, graphicsLayer);
                }
            }
            if (layoutNodeLayoutDelegate.coordinatesAccessedDuringModifierPlacement || layoutNodeLayoutDelegate.coordinatesAccessedDuringPlacement || this.needsCoordinatesUpdate) {
                this.layoutPending = true;
                this.needsCoordinatesUpdate = false;
            }
            lookaheadPassDelegate = layoutNodeLayoutDelegate.lookaheadPassDelegate;
            if (lookaheadPassDelegate != null) {
            }
            lookaheadPassDelegate2 = layoutNodeLayoutDelegate.lookaheadPassDelegate;
            if (lookaheadPassDelegate2 != null) {
                nodeCoordinator = layoutNodeLayoutDelegate.getOuterCoordinator().wrappedBy;
                if (nodeCoordinator != null) {
                }
                AndroidComposeView androidComposeView2 = (AndroidComposeView) LayoutNodeKt.requireOwner(layoutNode2);
                int i22 = PlaceableKt.$r8$clinit;
                OuterPlacementScope outerPlacementScope2 = new OuterPlacementScope(androidComposeView2, i);
                LookaheadPassDelegate lookaheadPassDelegate42 = layoutNodeLayoutDelegate.lookaheadPassDelegate;
                lookaheadPassDelegate42.getClass();
                parent$ui = layoutNode2.getParent$ui();
                if (parent$ui != null) {
                }
                lookaheadPassDelegate42.placeOrder = Integer.MAX_VALUE;
                outerPlacementScope2.place(lookaheadPassDelegate42, (int) (j >> 32), (int) (BodyPartID.bodyIdMax & j), RecyclerView.DECELERATION_RATE);
            }
            lookaheadPassDelegate3 = layoutNodeLayoutDelegate.lookaheadPassDelegate;
            if (lookaheadPassDelegate3 != null) {
                InlineClassHelperKt.throwIllegalStateException("Error: Placement happened before lookahead.");
            }
            m885placeOuterCoordinatorMLgxB_4(j, f, function1, graphicsLayer);
        } catch (Throwable th) {
            layoutNode.rethrowWithComposeStackTrace(th);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0054 A[Catch: all -> 0x0010, LOOP:0: B:22:0x0052->B:23:0x0054, LOOP_END, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x0023, B:13:0x002b, B:15:0x0033, B:18:0x003c, B:21:0x0045, B:23:0x0054, B:25:0x0063, B:28:0x007a, B:30:0x009b, B:31:0x00a1, B:33:0x00ad, B:35:0x00b7, B:39:0x00c3, B:41:0x0075), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009b A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x0023, B:13:0x002b, B:15:0x0033, B:18:0x003c, B:21:0x0045, B:23:0x0054, B:25:0x0063, B:28:0x007a, B:30:0x009b, B:31:0x00a1, B:33:0x00ad, B:35:0x00b7, B:39:0x00c3, B:41:0x0075), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0075 A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x0023, B:13:0x002b, B:15:0x0033, B:18:0x003c, B:21:0x0045, B:23:0x0054, B:25:0x0063, B:28:0x007a, B:30:0x009b, B:31:0x00a1, B:33:0x00ad, B:35:0x00b7, B:39:0x00c3, B:41:0x0075), top: B:2:0x0006 }] */
    /* renamed from: remeasure-BRTryo0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m887remeasureBRTryo0(long j) {
        boolean z;
        int i;
        int i2;
        long j2;
        LayoutNode.LayoutState layoutState;
        LayoutNode.LayoutState layoutState2;
        LayoutNode.LayoutState layoutState3;
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.layoutNodeLayoutDelegate;
        LayoutNode layoutNode = layoutNodeLayoutDelegate.layoutNode;
        LayoutNode layoutNode2 = layoutNodeLayoutDelegate.layoutNode;
        try {
            if (layoutNode.isDeactivated) {
                InlineClassHelperKt.throwIllegalArgumentException("measure is called on a deactivated node");
            }
            Owner requireOwner = LayoutNodeKt.requireOwner(layoutNode2);
            LayoutNode parent$ui = layoutNode2.getParent$ui();
            boolean z2 = true;
            if (!layoutNode2.canMultiMeasure && (parent$ui == null || !parent$ui.canMultiMeasure)) {
                z = false;
                layoutNode2.canMultiMeasure = z;
                if (!layoutNode2.getMeasurePending$ui() && Constraints.m1019equalsimpl0(this.measurementConstraints, j)) {
                    ((AndroidComposeView) requireOwner).forceMeasureTheSubtree(layoutNode2, false);
                    layoutNode2.resetSubtreeIntrinsicsUsage$ui();
                    return false;
                }
                this.alignmentLines.usedByModifierMeasurement = false;
                MutableVector mutableVector = layoutNode2.get_children$ui();
                Object[] objArr = mutableVector.content;
                i = mutableVector.size;
                for (i2 = 0; i2 < i; i2++) {
                    ((LayoutNode) objArr[i2]).layoutDelegate.measurePassDelegate.alignmentLines.usedDuringParentMeasurement = false;
                }
                this.measuredOnce = true;
                j2 = layoutNodeLayoutDelegate.getOuterCoordinator().measuredSize;
                m853setMeasurementConstraintsBRTryo0(j);
                layoutState = layoutNodeLayoutDelegate.layoutState;
                layoutState2 = LayoutNode.LayoutState.Idle;
                if (layoutState == layoutState2) {
                    InlineClassHelperKt.throwIllegalStateException("layout state is not idle before measure starts");
                }
                this.performMeasureConstraints = j;
                layoutState3 = LayoutNode.LayoutState.Measuring;
                layoutNodeLayoutDelegate.layoutState = layoutState3;
                this.measurePending = false;
                ImageLoader$Builder imageLoader$Builder = ((AndroidComposeView) LayoutNodeKt.requireOwner(layoutNode2)).snapshotObserver;
                ((SnapshotStateObserver) imageLoader$Builder.application).observeReads(layoutNode2, (OwnerSnapshotObserver$onCommitAffectingLayout$1) imageLoader$Builder.mainCoroutineContextLazy, this.performMeasureBlock);
                if (layoutNodeLayoutDelegate.layoutState == layoutState3) {
                    this.layoutPending = true;
                    this.layoutPendingForAlignment = true;
                    layoutNodeLayoutDelegate.layoutState = layoutState2;
                }
                if (IntSize.m1055equalsimpl0(layoutNodeLayoutDelegate.getOuterCoordinator().measuredSize, j2) && layoutNodeLayoutDelegate.getOuterCoordinator().width == this.width && layoutNodeLayoutDelegate.getOuterCoordinator().height == this.height) {
                    z2 = false;
                }
                m852setMeasuredSizeozmzZPI((layoutNodeLayoutDelegate.getOuterCoordinator().height & BodyPartID.bodyIdMax) | (layoutNodeLayoutDelegate.getOuterCoordinator().width << 32));
                return z2;
            }
            z = true;
            layoutNode2.canMultiMeasure = z;
            if (!layoutNode2.getMeasurePending$ui()) {
                ((AndroidComposeView) requireOwner).forceMeasureTheSubtree(layoutNode2, false);
                layoutNode2.resetSubtreeIntrinsicsUsage$ui();
                return false;
            }
            this.alignmentLines.usedByModifierMeasurement = false;
            MutableVector mutableVector2 = layoutNode2.get_children$ui();
            Object[] objArr2 = mutableVector2.content;
            i = mutableVector2.size;
            while (i2 < i) {
            }
            this.measuredOnce = true;
            j2 = layoutNodeLayoutDelegate.getOuterCoordinator().measuredSize;
            m853setMeasurementConstraintsBRTryo0(j);
            layoutState = layoutNodeLayoutDelegate.layoutState;
            layoutState2 = LayoutNode.LayoutState.Idle;
            if (layoutState == layoutState2) {
            }
            this.performMeasureConstraints = j;
            layoutState3 = LayoutNode.LayoutState.Measuring;
            layoutNodeLayoutDelegate.layoutState = layoutState3;
            this.measurePending = false;
            ImageLoader$Builder imageLoader$Builder2 = ((AndroidComposeView) LayoutNodeKt.requireOwner(layoutNode2)).snapshotObserver;
            ((SnapshotStateObserver) imageLoader$Builder2.application).observeReads(layoutNode2, (OwnerSnapshotObserver$onCommitAffectingLayout$1) imageLoader$Builder2.mainCoroutineContextLazy, this.performMeasureBlock);
            if (layoutNodeLayoutDelegate.layoutState == layoutState3) {
            }
            if (IntSize.m1055equalsimpl0(layoutNodeLayoutDelegate.getOuterCoordinator().measuredSize, j2)) {
                z2 = false;
            }
            m852setMeasuredSizeozmzZPI((layoutNodeLayoutDelegate.getOuterCoordinator().height & BodyPartID.bodyIdMax) | (layoutNodeLayoutDelegate.getOuterCoordinator().width << 32));
            return z2;
        } catch (Throwable th) {
            layoutNode.rethrowWithComposeStackTrace(th);
            throw null;
        }
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    public final void requestLayout() {
        this.layoutNodeLayoutDelegate.layoutNode.requestRelayout$ui(false);
    }

    public final void requestLayoutIfCoordinatesAreUsedAndNotifyChildren() {
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.layoutNodeLayoutDelegate;
        LayoutNode layoutNode = layoutNodeLayoutDelegate.layoutNode;
        LayoutNode layoutNode2 = layoutNodeLayoutDelegate.layoutNode;
        if (!layoutNode.isPlaced() || layoutNodeLayoutDelegate.childrenAccessingCoordinatesDuringPlacement <= 0) {
            return;
        }
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate2 = layoutNode2.layoutDelegate;
        if ((layoutNodeLayoutDelegate2.coordinatesAccessedDuringPlacement || layoutNodeLayoutDelegate2.coordinatesAccessedDuringModifierPlacement) && !layoutNodeLayoutDelegate2.measurePassDelegate.layoutPending) {
            layoutNode2.requestRelayout$ui(false);
        }
        MutableVector mutableVector = layoutNode2.get_children$ui();
        Object[] objArr = mutableVector.content;
        int i = mutableVector.size;
        for (int i2 = 0; i2 < i; i2++) {
            ((LayoutNode) objArr[i2]).layoutDelegate.measurePassDelegate.requestLayoutIfCoordinatesAreUsedAndNotifyChildren();
        }
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    public final void requestMeasure() {
        LayoutNode.requestRemeasure$ui$default(this.layoutNodeLayoutDelegate.layoutNode, false, 7);
    }

    @Override // androidx.compose.ui.node.MotionReferencePlacementDelegate
    public final void updatePlacedUnderMotionFrameOfReference(boolean z) {
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.layoutNodeLayoutDelegate;
        if (z != layoutNodeLayoutDelegate.getOuterCoordinator().isPlacedUnderMotionFrameOfReference) {
            layoutNodeLayoutDelegate.getOuterCoordinator().isPlacedUnderMotionFrameOfReference = z;
            this.needsCoordinatesUpdate = true;
        }
    }

    @Override // androidx.compose.ui.layout.Placeable
    /* renamed from: placeAt-f8xVGno */
    public final void mo851placeAtf8xVGno(long j, float f, GraphicsLayer graphicsLayer) {
        m886placeSelfMLgxB_4$2(j, f, null, graphicsLayer);
    }
}
