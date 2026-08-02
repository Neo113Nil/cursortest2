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
import androidx.compose.ui.node.InnerNodeCoordinator;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.ImageLoader$Builder;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class LookaheadPassDelegate extends Placeable implements Measurable, AlignmentLinesOwner, MotionReferencePlacementDelegate {
    public boolean duringAlignmentLinesQuery;
    public GraphicsLayer lastExplicitLayer;
    public Function1 lastLayerBlock;
    public boolean layingOutChildren;
    public final LookaheadPassDelegate$layoutChildrenBlock$1 layoutChildrenBlock;
    public final LookaheadPassDelegate$layoutChildrenBlock$1 layoutModifierBlock;
    public final LayoutNodeLayoutDelegate layoutNodeLayoutDelegate;
    public Constraints lookaheadConstraints;
    public boolean measuredOnce;
    public boolean onNodePlacedCalled;
    public Object parentData;
    public final LookaheadPassDelegate$layoutChildrenBlock$1 performMeasureBlock;
    public boolean placedOnce;
    public boolean relayoutWithoutParentInProgress;
    public int previousPlaceOrder = Integer.MAX_VALUE;
    public int placeOrder = Integer.MAX_VALUE;
    public LayoutNode.UsageByParent measuredByParent = LayoutNode.UsageByParent.NotUsed;
    public long lastPosition = 0;
    public PlacedState _placedState = PlacedState.IsNotPlaced;
    public final LookaheadAlignmentLines alignmentLines = new LookaheadAlignmentLines(this, 0);
    public final MutableVector _childDelegates = new MutableVector(0, new LookaheadPassDelegate[16]);
    public boolean childDelegatesDirty = true;
    public boolean parentDataDirty = true;
    public long performMeasureConstraints = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class PlacedState {
        public static final /* synthetic */ PlacedState[] $VALUES;
        public static final PlacedState IsNotPlaced;
        public static final PlacedState IsPlacedInApproach;
        public static final PlacedState IsPlacedInLookahead;

        static {
            PlacedState placedState = new PlacedState("IsPlacedInLookahead", 0);
            IsPlacedInLookahead = placedState;
            PlacedState placedState2 = new PlacedState("IsPlacedInApproach", 1);
            IsPlacedInApproach = placedState2;
            PlacedState placedState3 = new PlacedState("IsNotPlaced", 2);
            IsNotPlaced = placedState3;
            $VALUES = new PlacedState[]{placedState, placedState2, placedState3};
        }

        public static PlacedState valueOf(String str) {
            return (PlacedState) Enum.valueOf(PlacedState.class, str);
        }

        public static PlacedState[] values() {
            return (PlacedState[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.compose.ui.node.LookaheadPassDelegate$layoutChildrenBlock$1] */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.compose.ui.node.LookaheadPassDelegate$layoutChildrenBlock$1] */
    /* JADX WARN: Type inference failed for: r4v5, types: [androidx.compose.ui.node.LookaheadPassDelegate$layoutChildrenBlock$1] */
    public LookaheadPassDelegate(LayoutNodeLayoutDelegate layoutNodeLayoutDelegate) {
        this.layoutNodeLayoutDelegate = layoutNodeLayoutDelegate;
        final int i = 0;
        final int i2 = 1;
        this.layoutChildrenBlock = new Function0(this) { // from class: androidx.compose.ui.node.LookaheadPassDelegate$layoutChildrenBlock$1
            public final /* synthetic */ LookaheadPassDelegate this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                LookaheadDelegate lookaheadDelegate;
                int i3 = i;
                int i4 = 0;
                LookaheadPassDelegate lookaheadPassDelegate = this.this$0;
                switch (i3) {
                    case 0:
                        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate2 = lookaheadPassDelegate.layoutNodeLayoutDelegate;
                        layoutNodeLayoutDelegate2.nextChildLookaheadPlaceOrder = 0;
                        MutableVector mutableVector = layoutNodeLayoutDelegate2.layoutNode.get_children$ui();
                        Object[] objArr = mutableVector.content;
                        int i5 = mutableVector.size;
                        for (int i6 = 0; i6 < i5; i6++) {
                            LookaheadPassDelegate lookaheadPassDelegate2 = ((LayoutNode) objArr[i6]).layoutDelegate.lookaheadPassDelegate;
                            lookaheadPassDelegate2.getClass();
                            lookaheadPassDelegate2.previousPlaceOrder = lookaheadPassDelegate2.placeOrder;
                            lookaheadPassDelegate2.placeOrder = Integer.MAX_VALUE;
                            if (lookaheadPassDelegate2.measuredByParent == LayoutNode.UsageByParent.InLayoutBlock) {
                                lookaheadPassDelegate2.measuredByParent = LayoutNode.UsageByParent.NotUsed;
                            }
                        }
                        LayoutNode layoutNode = layoutNodeLayoutDelegate2.layoutNode;
                        LayoutNode layoutNode2 = layoutNodeLayoutDelegate2.layoutNode;
                        MutableVector mutableVector2 = layoutNode.get_children$ui();
                        Object[] objArr2 = mutableVector2.content;
                        int i7 = mutableVector2.size;
                        for (int i8 = 0; i8 < i7; i8++) {
                            LookaheadPassDelegate lookaheadPassDelegate3 = ((LayoutNode) objArr2[i8]).layoutDelegate.lookaheadPassDelegate;
                            lookaheadPassDelegate3.getClass();
                            lookaheadPassDelegate3.alignmentLines.usedDuringParentLayout = false;
                        }
                        InnerNodeCoordinator.LookaheadDelegateImpl lookaheadDelegateImpl = lookaheadPassDelegate.getInnerCoordinator().lookaheadDelegate;
                        if (lookaheadDelegateImpl != null) {
                            boolean z = lookaheadDelegateImpl.isPlacingForAlignment;
                            List children$ui = layoutNode2.getChildren$ui();
                            int size = children$ui.size();
                            for (int i9 = 0; i9 < size; i9++) {
                                LookaheadDelegate lookaheadDelegate2 = ((NodeCoordinator) ((LayoutNode) ((MutableVector.MutableVectorList) children$ui).get(i9)).nodes.outerCoordinator).getLookaheadDelegate();
                                if (lookaheadDelegate2 != null) {
                                    lookaheadDelegate2.isPlacingForAlignment = z;
                                }
                            }
                        }
                        InnerNodeCoordinator.LookaheadDelegateImpl lookaheadDelegateImpl2 = lookaheadPassDelegate.getInnerCoordinator().lookaheadDelegate;
                        lookaheadDelegateImpl2.getClass();
                        lookaheadDelegateImpl2.getMeasureResult$ui().placeChildren();
                        if (lookaheadPassDelegate.getInnerCoordinator().lookaheadDelegate != null) {
                            List children$ui2 = layoutNode2.getChildren$ui();
                            int size2 = children$ui2.size();
                            for (int i10 = 0; i10 < size2; i10++) {
                                LookaheadDelegate lookaheadDelegate3 = ((NodeCoordinator) ((LayoutNode) ((MutableVector.MutableVectorList) children$ui2).get(i10)).nodes.outerCoordinator).getLookaheadDelegate();
                                if (lookaheadDelegate3 != null) {
                                    lookaheadDelegate3.isPlacingForAlignment = false;
                                }
                            }
                        }
                        MutableVector mutableVector3 = layoutNode2.get_children$ui();
                        Object[] objArr3 = mutableVector3.content;
                        int i11 = mutableVector3.size;
                        for (int i12 = 0; i12 < i11; i12++) {
                            LookaheadPassDelegate lookaheadPassDelegate4 = ((LayoutNode) objArr3[i12]).layoutDelegate.lookaheadPassDelegate;
                            lookaheadPassDelegate4.getClass();
                            int i13 = lookaheadPassDelegate4.previousPlaceOrder;
                            int i14 = lookaheadPassDelegate4.placeOrder;
                            if (i13 != i14 && i14 == Integer.MAX_VALUE) {
                                lookaheadPassDelegate4.markNodeAndSubtreeAsNotPlaced$ui(true);
                            }
                        }
                        MutableVector mutableVector4 = layoutNode2.get_children$ui();
                        Object[] objArr4 = mutableVector4.content;
                        int i15 = mutableVector4.size;
                        while (i4 < i15) {
                            LookaheadPassDelegate lookaheadPassDelegate5 = ((LayoutNode) objArr4[i4]).layoutDelegate.lookaheadPassDelegate;
                            lookaheadPassDelegate5.getClass();
                            LookaheadAlignmentLines lookaheadAlignmentLines = lookaheadPassDelegate5.alignmentLines;
                            lookaheadAlignmentLines.previousUsedDuringParentLayout = lookaheadAlignmentLines.usedDuringParentLayout;
                            i4++;
                        }
                        break;
                    case 1:
                        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate3 = lookaheadPassDelegate.layoutNodeLayoutDelegate;
                        OuterPlacementScope outerPlacementScope = null;
                        if (DepthSortedSetKt.isOutMostLookaheadRoot(layoutNodeLayoutDelegate3.layoutNode) || layoutNodeLayoutDelegate3.detachedFromParentLookaheadPlacement) {
                            NodeCoordinator nodeCoordinator = layoutNodeLayoutDelegate3.getOuterCoordinator().wrappedBy;
                            if (nodeCoordinator != null) {
                                outerPlacementScope = nodeCoordinator.placementScope;
                            }
                        } else {
                            NodeCoordinator nodeCoordinator2 = layoutNodeLayoutDelegate3.getOuterCoordinator().wrappedBy;
                            if (nodeCoordinator2 != null && (lookaheadDelegate = nodeCoordinator2.getLookaheadDelegate()) != null) {
                                outerPlacementScope = lookaheadDelegate.placementScope;
                            }
                        }
                        if (outerPlacementScope == null) {
                            AndroidComposeView androidComposeView = (AndroidComposeView) LayoutNodeKt.requireOwner(layoutNodeLayoutDelegate3.layoutNode);
                            int i16 = PlaceableKt.$r8$clinit;
                            outerPlacementScope = new OuterPlacementScope(androidComposeView, i4);
                        }
                        LookaheadDelegate lookaheadDelegate4 = layoutNodeLayoutDelegate3.getOuterCoordinator().getLookaheadDelegate();
                        lookaheadDelegate4.getClass();
                        Placeable.PlacementScope.m854place70tqf50$default(outerPlacementScope, lookaheadDelegate4, lookaheadPassDelegate.lastPosition);
                        break;
                    default:
                        LookaheadDelegate lookaheadDelegate5 = lookaheadPassDelegate.layoutNodeLayoutDelegate.getOuterCoordinator().getLookaheadDelegate();
                        lookaheadDelegate5.getClass();
                        lookaheadDelegate5.mo833measureBRTryo0(lookaheadPassDelegate.performMeasureConstraints);
                        break;
                }
                return Unit.INSTANCE;
            }
        };
        this.parentData = layoutNodeLayoutDelegate.measurePassDelegate.parentData;
        final int i3 = 2;
        this.performMeasureBlock = new Function0(this) { // from class: androidx.compose.ui.node.LookaheadPassDelegate$layoutChildrenBlock$1
            public final /* synthetic */ LookaheadPassDelegate this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                LookaheadDelegate lookaheadDelegate;
                int i32 = i3;
                int i4 = 0;
                LookaheadPassDelegate lookaheadPassDelegate = this.this$0;
                switch (i32) {
                    case 0:
                        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate2 = lookaheadPassDelegate.layoutNodeLayoutDelegate;
                        layoutNodeLayoutDelegate2.nextChildLookaheadPlaceOrder = 0;
                        MutableVector mutableVector = layoutNodeLayoutDelegate2.layoutNode.get_children$ui();
                        Object[] objArr = mutableVector.content;
                        int i5 = mutableVector.size;
                        for (int i6 = 0; i6 < i5; i6++) {
                            LookaheadPassDelegate lookaheadPassDelegate2 = ((LayoutNode) objArr[i6]).layoutDelegate.lookaheadPassDelegate;
                            lookaheadPassDelegate2.getClass();
                            lookaheadPassDelegate2.previousPlaceOrder = lookaheadPassDelegate2.placeOrder;
                            lookaheadPassDelegate2.placeOrder = Integer.MAX_VALUE;
                            if (lookaheadPassDelegate2.measuredByParent == LayoutNode.UsageByParent.InLayoutBlock) {
                                lookaheadPassDelegate2.measuredByParent = LayoutNode.UsageByParent.NotUsed;
                            }
                        }
                        LayoutNode layoutNode = layoutNodeLayoutDelegate2.layoutNode;
                        LayoutNode layoutNode2 = layoutNodeLayoutDelegate2.layoutNode;
                        MutableVector mutableVector2 = layoutNode.get_children$ui();
                        Object[] objArr2 = mutableVector2.content;
                        int i7 = mutableVector2.size;
                        for (int i8 = 0; i8 < i7; i8++) {
                            LookaheadPassDelegate lookaheadPassDelegate3 = ((LayoutNode) objArr2[i8]).layoutDelegate.lookaheadPassDelegate;
                            lookaheadPassDelegate3.getClass();
                            lookaheadPassDelegate3.alignmentLines.usedDuringParentLayout = false;
                        }
                        InnerNodeCoordinator.LookaheadDelegateImpl lookaheadDelegateImpl = lookaheadPassDelegate.getInnerCoordinator().lookaheadDelegate;
                        if (lookaheadDelegateImpl != null) {
                            boolean z = lookaheadDelegateImpl.isPlacingForAlignment;
                            List children$ui = layoutNode2.getChildren$ui();
                            int size = children$ui.size();
                            for (int i9 = 0; i9 < size; i9++) {
                                LookaheadDelegate lookaheadDelegate2 = ((NodeCoordinator) ((LayoutNode) ((MutableVector.MutableVectorList) children$ui).get(i9)).nodes.outerCoordinator).getLookaheadDelegate();
                                if (lookaheadDelegate2 != null) {
                                    lookaheadDelegate2.isPlacingForAlignment = z;
                                }
                            }
                        }
                        InnerNodeCoordinator.LookaheadDelegateImpl lookaheadDelegateImpl2 = lookaheadPassDelegate.getInnerCoordinator().lookaheadDelegate;
                        lookaheadDelegateImpl2.getClass();
                        lookaheadDelegateImpl2.getMeasureResult$ui().placeChildren();
                        if (lookaheadPassDelegate.getInnerCoordinator().lookaheadDelegate != null) {
                            List children$ui2 = layoutNode2.getChildren$ui();
                            int size2 = children$ui2.size();
                            for (int i10 = 0; i10 < size2; i10++) {
                                LookaheadDelegate lookaheadDelegate3 = ((NodeCoordinator) ((LayoutNode) ((MutableVector.MutableVectorList) children$ui2).get(i10)).nodes.outerCoordinator).getLookaheadDelegate();
                                if (lookaheadDelegate3 != null) {
                                    lookaheadDelegate3.isPlacingForAlignment = false;
                                }
                            }
                        }
                        MutableVector mutableVector3 = layoutNode2.get_children$ui();
                        Object[] objArr3 = mutableVector3.content;
                        int i11 = mutableVector3.size;
                        for (int i12 = 0; i12 < i11; i12++) {
                            LookaheadPassDelegate lookaheadPassDelegate4 = ((LayoutNode) objArr3[i12]).layoutDelegate.lookaheadPassDelegate;
                            lookaheadPassDelegate4.getClass();
                            int i13 = lookaheadPassDelegate4.previousPlaceOrder;
                            int i14 = lookaheadPassDelegate4.placeOrder;
                            if (i13 != i14 && i14 == Integer.MAX_VALUE) {
                                lookaheadPassDelegate4.markNodeAndSubtreeAsNotPlaced$ui(true);
                            }
                        }
                        MutableVector mutableVector4 = layoutNode2.get_children$ui();
                        Object[] objArr4 = mutableVector4.content;
                        int i15 = mutableVector4.size;
                        while (i4 < i15) {
                            LookaheadPassDelegate lookaheadPassDelegate5 = ((LayoutNode) objArr4[i4]).layoutDelegate.lookaheadPassDelegate;
                            lookaheadPassDelegate5.getClass();
                            LookaheadAlignmentLines lookaheadAlignmentLines = lookaheadPassDelegate5.alignmentLines;
                            lookaheadAlignmentLines.previousUsedDuringParentLayout = lookaheadAlignmentLines.usedDuringParentLayout;
                            i4++;
                        }
                        break;
                    case 1:
                        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate3 = lookaheadPassDelegate.layoutNodeLayoutDelegate;
                        OuterPlacementScope outerPlacementScope = null;
                        if (DepthSortedSetKt.isOutMostLookaheadRoot(layoutNodeLayoutDelegate3.layoutNode) || layoutNodeLayoutDelegate3.detachedFromParentLookaheadPlacement) {
                            NodeCoordinator nodeCoordinator = layoutNodeLayoutDelegate3.getOuterCoordinator().wrappedBy;
                            if (nodeCoordinator != null) {
                                outerPlacementScope = nodeCoordinator.placementScope;
                            }
                        } else {
                            NodeCoordinator nodeCoordinator2 = layoutNodeLayoutDelegate3.getOuterCoordinator().wrappedBy;
                            if (nodeCoordinator2 != null && (lookaheadDelegate = nodeCoordinator2.getLookaheadDelegate()) != null) {
                                outerPlacementScope = lookaheadDelegate.placementScope;
                            }
                        }
                        if (outerPlacementScope == null) {
                            AndroidComposeView androidComposeView = (AndroidComposeView) LayoutNodeKt.requireOwner(layoutNodeLayoutDelegate3.layoutNode);
                            int i16 = PlaceableKt.$r8$clinit;
                            outerPlacementScope = new OuterPlacementScope(androidComposeView, i4);
                        }
                        LookaheadDelegate lookaheadDelegate4 = layoutNodeLayoutDelegate3.getOuterCoordinator().getLookaheadDelegate();
                        lookaheadDelegate4.getClass();
                        Placeable.PlacementScope.m854place70tqf50$default(outerPlacementScope, lookaheadDelegate4, lookaheadPassDelegate.lastPosition);
                        break;
                    default:
                        LookaheadDelegate lookaheadDelegate5 = lookaheadPassDelegate.layoutNodeLayoutDelegate.getOuterCoordinator().getLookaheadDelegate();
                        lookaheadDelegate5.getClass();
                        lookaheadDelegate5.mo833measureBRTryo0(lookaheadPassDelegate.performMeasureConstraints);
                        break;
                }
                return Unit.INSTANCE;
            }
        };
        this.layoutModifierBlock = new Function0(this) { // from class: androidx.compose.ui.node.LookaheadPassDelegate$layoutChildrenBlock$1
            public final /* synthetic */ LookaheadPassDelegate this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                LookaheadDelegate lookaheadDelegate;
                int i32 = i2;
                int i4 = 0;
                LookaheadPassDelegate lookaheadPassDelegate = this.this$0;
                switch (i32) {
                    case 0:
                        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate2 = lookaheadPassDelegate.layoutNodeLayoutDelegate;
                        layoutNodeLayoutDelegate2.nextChildLookaheadPlaceOrder = 0;
                        MutableVector mutableVector = layoutNodeLayoutDelegate2.layoutNode.get_children$ui();
                        Object[] objArr = mutableVector.content;
                        int i5 = mutableVector.size;
                        for (int i6 = 0; i6 < i5; i6++) {
                            LookaheadPassDelegate lookaheadPassDelegate2 = ((LayoutNode) objArr[i6]).layoutDelegate.lookaheadPassDelegate;
                            lookaheadPassDelegate2.getClass();
                            lookaheadPassDelegate2.previousPlaceOrder = lookaheadPassDelegate2.placeOrder;
                            lookaheadPassDelegate2.placeOrder = Integer.MAX_VALUE;
                            if (lookaheadPassDelegate2.measuredByParent == LayoutNode.UsageByParent.InLayoutBlock) {
                                lookaheadPassDelegate2.measuredByParent = LayoutNode.UsageByParent.NotUsed;
                            }
                        }
                        LayoutNode layoutNode = layoutNodeLayoutDelegate2.layoutNode;
                        LayoutNode layoutNode2 = layoutNodeLayoutDelegate2.layoutNode;
                        MutableVector mutableVector2 = layoutNode.get_children$ui();
                        Object[] objArr2 = mutableVector2.content;
                        int i7 = mutableVector2.size;
                        for (int i8 = 0; i8 < i7; i8++) {
                            LookaheadPassDelegate lookaheadPassDelegate3 = ((LayoutNode) objArr2[i8]).layoutDelegate.lookaheadPassDelegate;
                            lookaheadPassDelegate3.getClass();
                            lookaheadPassDelegate3.alignmentLines.usedDuringParentLayout = false;
                        }
                        InnerNodeCoordinator.LookaheadDelegateImpl lookaheadDelegateImpl = lookaheadPassDelegate.getInnerCoordinator().lookaheadDelegate;
                        if (lookaheadDelegateImpl != null) {
                            boolean z = lookaheadDelegateImpl.isPlacingForAlignment;
                            List children$ui = layoutNode2.getChildren$ui();
                            int size = children$ui.size();
                            for (int i9 = 0; i9 < size; i9++) {
                                LookaheadDelegate lookaheadDelegate2 = ((NodeCoordinator) ((LayoutNode) ((MutableVector.MutableVectorList) children$ui).get(i9)).nodes.outerCoordinator).getLookaheadDelegate();
                                if (lookaheadDelegate2 != null) {
                                    lookaheadDelegate2.isPlacingForAlignment = z;
                                }
                            }
                        }
                        InnerNodeCoordinator.LookaheadDelegateImpl lookaheadDelegateImpl2 = lookaheadPassDelegate.getInnerCoordinator().lookaheadDelegate;
                        lookaheadDelegateImpl2.getClass();
                        lookaheadDelegateImpl2.getMeasureResult$ui().placeChildren();
                        if (lookaheadPassDelegate.getInnerCoordinator().lookaheadDelegate != null) {
                            List children$ui2 = layoutNode2.getChildren$ui();
                            int size2 = children$ui2.size();
                            for (int i10 = 0; i10 < size2; i10++) {
                                LookaheadDelegate lookaheadDelegate3 = ((NodeCoordinator) ((LayoutNode) ((MutableVector.MutableVectorList) children$ui2).get(i10)).nodes.outerCoordinator).getLookaheadDelegate();
                                if (lookaheadDelegate3 != null) {
                                    lookaheadDelegate3.isPlacingForAlignment = false;
                                }
                            }
                        }
                        MutableVector mutableVector3 = layoutNode2.get_children$ui();
                        Object[] objArr3 = mutableVector3.content;
                        int i11 = mutableVector3.size;
                        for (int i12 = 0; i12 < i11; i12++) {
                            LookaheadPassDelegate lookaheadPassDelegate4 = ((LayoutNode) objArr3[i12]).layoutDelegate.lookaheadPassDelegate;
                            lookaheadPassDelegate4.getClass();
                            int i13 = lookaheadPassDelegate4.previousPlaceOrder;
                            int i14 = lookaheadPassDelegate4.placeOrder;
                            if (i13 != i14 && i14 == Integer.MAX_VALUE) {
                                lookaheadPassDelegate4.markNodeAndSubtreeAsNotPlaced$ui(true);
                            }
                        }
                        MutableVector mutableVector4 = layoutNode2.get_children$ui();
                        Object[] objArr4 = mutableVector4.content;
                        int i15 = mutableVector4.size;
                        while (i4 < i15) {
                            LookaheadPassDelegate lookaheadPassDelegate5 = ((LayoutNode) objArr4[i4]).layoutDelegate.lookaheadPassDelegate;
                            lookaheadPassDelegate5.getClass();
                            LookaheadAlignmentLines lookaheadAlignmentLines = lookaheadPassDelegate5.alignmentLines;
                            lookaheadAlignmentLines.previousUsedDuringParentLayout = lookaheadAlignmentLines.usedDuringParentLayout;
                            i4++;
                        }
                        break;
                    case 1:
                        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate3 = lookaheadPassDelegate.layoutNodeLayoutDelegate;
                        OuterPlacementScope outerPlacementScope = null;
                        if (DepthSortedSetKt.isOutMostLookaheadRoot(layoutNodeLayoutDelegate3.layoutNode) || layoutNodeLayoutDelegate3.detachedFromParentLookaheadPlacement) {
                            NodeCoordinator nodeCoordinator = layoutNodeLayoutDelegate3.getOuterCoordinator().wrappedBy;
                            if (nodeCoordinator != null) {
                                outerPlacementScope = nodeCoordinator.placementScope;
                            }
                        } else {
                            NodeCoordinator nodeCoordinator2 = layoutNodeLayoutDelegate3.getOuterCoordinator().wrappedBy;
                            if (nodeCoordinator2 != null && (lookaheadDelegate = nodeCoordinator2.getLookaheadDelegate()) != null) {
                                outerPlacementScope = lookaheadDelegate.placementScope;
                            }
                        }
                        if (outerPlacementScope == null) {
                            AndroidComposeView androidComposeView = (AndroidComposeView) LayoutNodeKt.requireOwner(layoutNodeLayoutDelegate3.layoutNode);
                            int i16 = PlaceableKt.$r8$clinit;
                            outerPlacementScope = new OuterPlacementScope(androidComposeView, i4);
                        }
                        LookaheadDelegate lookaheadDelegate4 = layoutNodeLayoutDelegate3.getOuterCoordinator().getLookaheadDelegate();
                        lookaheadDelegate4.getClass();
                        Placeable.PlacementScope.m854place70tqf50$default(outerPlacementScope, lookaheadDelegate4, lookaheadPassDelegate.lastPosition);
                        break;
                    default:
                        LookaheadDelegate lookaheadDelegate5 = lookaheadPassDelegate.layoutNodeLayoutDelegate.getOuterCoordinator().getLookaheadDelegate();
                        lookaheadDelegate5.getClass();
                        lookaheadDelegate5.mo833measureBRTryo0(lookaheadPassDelegate.performMeasureConstraints);
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
            LookaheadPassDelegate lookaheadPassDelegate = ((LayoutNode) objArr[i2]).layoutDelegate.lookaheadPassDelegate;
            lookaheadPassDelegate.getClass();
            boundsAnimation$animate$1.invoke(lookaheadPassDelegate);
        }
    }

    @Override // androidx.compose.ui.layout.Placeable
    public final int get(AlignmentLine alignmentLine) {
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.layoutNodeLayoutDelegate;
        LayoutNode parent$ui = layoutNodeLayoutDelegate.layoutNode.getParent$ui();
        LayoutNode.LayoutState layoutState = parent$ui != null ? parent$ui.layoutDelegate.layoutState : null;
        LayoutNode.LayoutState layoutState2 = LayoutNode.LayoutState.LookaheadMeasuring;
        LookaheadAlignmentLines lookaheadAlignmentLines = this.alignmentLines;
        if (layoutState == layoutState2) {
            lookaheadAlignmentLines.usedDuringParentMeasurement = true;
        } else {
            LayoutNode parent$ui2 = layoutNodeLayoutDelegate.layoutNode.getParent$ui();
            if ((parent$ui2 != null ? parent$ui2.layoutDelegate.layoutState : null) == LayoutNode.LayoutState.LookaheadLayingOut) {
                lookaheadAlignmentLines.usedDuringParentLayout = true;
            }
        }
        this.duringAlignmentLinesQuery = true;
        LookaheadDelegate lookaheadDelegate = layoutNodeLayoutDelegate.getOuterCoordinator().getLookaheadDelegate();
        lookaheadDelegate.getClass();
        int i = lookaheadDelegate.get(alignmentLine);
        this.duringAlignmentLinesQuery = false;
        return i;
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    public final LookaheadAlignmentLines getAlignmentLines() {
        return this.alignmentLines;
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    public final InnerNodeCoordinator getInnerCoordinator() {
        return (InnerNodeCoordinator) this.layoutNodeLayoutDelegate.layoutNode.nodes.innerCoordinator;
    }

    @Override // androidx.compose.ui.layout.Placeable
    public final int getMeasuredHeight() {
        LookaheadDelegate lookaheadDelegate = this.layoutNodeLayoutDelegate.getOuterCoordinator().getLookaheadDelegate();
        lookaheadDelegate.getClass();
        return lookaheadDelegate.getMeasuredHeight();
    }

    @Override // androidx.compose.ui.layout.Placeable
    public final int getMeasuredWidth() {
        LookaheadDelegate lookaheadDelegate = this.layoutNodeLayoutDelegate.getOuterCoordinator().getLookaheadDelegate();
        lookaheadDelegate.getClass();
        return lookaheadDelegate.getMeasuredWidth();
    }

    public final boolean getNeedsToBePlacedInApproach() {
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.layoutNodeLayoutDelegate;
        return DepthSortedSetKt.isOutMostLookaheadRoot(layoutNodeLayoutDelegate.layoutNode) || layoutNodeLayoutDelegate.detachedFromParentLookaheadPlacement;
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    public final AlignmentLinesOwner getParentAlignmentLinesOwner() {
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate;
        LayoutNode parent$ui = this.layoutNodeLayoutDelegate.layoutNode.getParent$ui();
        if (parent$ui == null || (layoutNodeLayoutDelegate = parent$ui.layoutDelegate) == null) {
            return null;
        }
        return layoutNodeLayoutDelegate.lookaheadPassDelegate;
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
        this.layingOutChildren = true;
        LookaheadAlignmentLines lookaheadAlignmentLines = this.alignmentLines;
        lookaheadAlignmentLines.recalculateQueryOwner();
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.layoutNodeLayoutDelegate;
        boolean z = layoutNodeLayoutDelegate.lookaheadLayoutPending;
        LayoutNode layoutNode = layoutNodeLayoutDelegate.layoutNode;
        if (z) {
            MutableVector mutableVector = layoutNode.get_children$ui();
            Object[] objArr = mutableVector.content;
            int i = mutableVector.size;
            for (int i2 = 0; i2 < i; i2++) {
                LayoutNode layoutNode2 = (LayoutNode) objArr[i2];
                LayoutNodeLayoutDelegate layoutNodeLayoutDelegate2 = layoutNode2.layoutDelegate;
                if (layoutNodeLayoutDelegate2.lookaheadMeasurePending && layoutNode2.getMeasuredByParentInLookahead$ui() == LayoutNode.UsageByParent.InMeasureBlock) {
                    LookaheadPassDelegate lookaheadPassDelegate = layoutNodeLayoutDelegate2.lookaheadPassDelegate;
                    lookaheadPassDelegate.getClass();
                    LookaheadPassDelegate lookaheadPassDelegate2 = layoutNodeLayoutDelegate2.lookaheadPassDelegate;
                    Constraints constraints = lookaheadPassDelegate2 != null ? lookaheadPassDelegate2.lookaheadConstraints : null;
                    constraints.getClass();
                    if (lookaheadPassDelegate.m884remeasureBRTryo0(constraints.value)) {
                        LayoutNode.requestLookaheadRemeasure$ui$default(layoutNode, false, 7);
                    }
                }
            }
        }
        InnerNodeCoordinator.LookaheadDelegateImpl lookaheadDelegateImpl = getInnerCoordinator().lookaheadDelegate;
        lookaheadDelegateImpl.getClass();
        if (layoutNodeLayoutDelegate.lookaheadLayoutPendingForAlignment || (!this.duringAlignmentLinesQuery && !lookaheadDelegateImpl.isPlacingForAlignment && layoutNodeLayoutDelegate.lookaheadLayoutPending)) {
            layoutNodeLayoutDelegate.lookaheadLayoutPending = false;
            LayoutNode.LayoutState layoutState = layoutNodeLayoutDelegate.layoutState;
            layoutNodeLayoutDelegate.layoutState = LayoutNode.LayoutState.LookaheadLayingOut;
            layoutNodeLayoutDelegate.setLookaheadCoordinatesAccessedDuringPlacement(false);
            ImageLoader$Builder imageLoader$Builder = ((AndroidComposeView) LayoutNodeKt.requireOwner(layoutNode)).snapshotObserver;
            ((SnapshotStateObserver) imageLoader$Builder.application).observeReads(layoutNode, (OwnerSnapshotObserver$onCommitAffectingLayout$1) imageLoader$Builder.extras, this.layoutChildrenBlock);
            layoutNodeLayoutDelegate.layoutState = layoutState;
            if (layoutNodeLayoutDelegate.lookaheadCoordinatesAccessedDuringPlacement && lookaheadDelegateImpl.isPlacingForAlignment) {
                requestLayout();
            }
            layoutNodeLayoutDelegate.lookaheadLayoutPendingForAlignment = false;
        }
        if (lookaheadAlignmentLines.usedDuringParentLayout) {
            lookaheadAlignmentLines.previousUsedDuringParentLayout = true;
        }
        if (lookaheadAlignmentLines.dirty && lookaheadAlignmentLines.getRequired$ui()) {
            lookaheadAlignmentLines.recalculate();
        }
        this.layingOutChildren = false;
    }

    public final void markNodeAndSubtreeAsNotPlaced$ui(boolean z) {
        if (z && getNeedsToBePlacedInApproach()) {
            return;
        }
        if (z || getNeedsToBePlacedInApproach()) {
            this._placedState = PlacedState.IsNotPlaced;
            MutableVector mutableVector = this.layoutNodeLayoutDelegate.layoutNode.get_children$ui();
            Object[] objArr = mutableVector.content;
            int i = mutableVector.size;
            for (int i2 = 0; i2 < i; i2++) {
                LookaheadPassDelegate lookaheadPassDelegate = ((LayoutNode) objArr[i2]).layoutDelegate.lookaheadPassDelegate;
                lookaheadPassDelegate.getClass();
                lookaheadPassDelegate.markNodeAndSubtreeAsNotPlaced$ui(true);
            }
        }
    }

    public final void markNodeAndSubtreeAsPlaced() {
        PlacedState placedState = this._placedState;
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.layoutNodeLayoutDelegate;
        boolean z = layoutNodeLayoutDelegate.detachedFromParentLookaheadPlacement;
        LayoutNode layoutNode = layoutNodeLayoutDelegate.layoutNode;
        if (z) {
            this._placedState = PlacedState.IsPlacedInApproach;
        } else {
            this._placedState = PlacedState.IsPlacedInLookahead;
        }
        if (placedState != PlacedState.IsPlacedInLookahead && layoutNodeLayoutDelegate.lookaheadMeasurePending) {
            LayoutNode.requestLookaheadRemeasure$ui$default(layoutNode, true, 6);
        }
        MutableVector mutableVector = layoutNode.get_children$ui();
        Object[] objArr = mutableVector.content;
        int i = mutableVector.size;
        for (int i2 = 0; i2 < i; i2++) {
            LayoutNode layoutNode2 = (LayoutNode) objArr[i2];
            LookaheadPassDelegate lookaheadPassDelegate = layoutNode2.layoutDelegate.lookaheadPassDelegate;
            if (lookaheadPassDelegate == null) {
                a$$ExternalSyntheticBUOutline0.m$3("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
                return;
            }
            if (lookaheadPassDelegate.placeOrder != Integer.MAX_VALUE) {
                lookaheadPassDelegate.markNodeAndSubtreeAsPlaced();
                LayoutNode.rescheduleRemeasureOrRelayout$ui(layoutNode2);
            }
        }
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public final int maxIntrinsicHeight(int i) {
        onIntrinsicsQueried();
        LookaheadDelegate lookaheadDelegate = this.layoutNodeLayoutDelegate.getOuterCoordinator().getLookaheadDelegate();
        lookaheadDelegate.getClass();
        return lookaheadDelegate.maxIntrinsicHeight(i);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public final int maxIntrinsicWidth(int i) {
        onIntrinsicsQueried();
        LookaheadDelegate lookaheadDelegate = this.layoutNodeLayoutDelegate.getOuterCoordinator().getLookaheadDelegate();
        lookaheadDelegate.getClass();
        return lookaheadDelegate.maxIntrinsicWidth(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        if ((r1 != null ? r1.layoutDelegate.layoutState : null) == androidx.compose.ui.node.LayoutNode.LayoutState.LookaheadLayingOut) goto L14;
     */
    @Override // androidx.compose.ui.layout.Measurable
    /* renamed from: measure-BRTryo0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Placeable mo833measureBRTryo0(long j) {
        LayoutNode.UsageByParent usageByParent;
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.layoutNodeLayoutDelegate;
        LayoutNode layoutNode = layoutNodeLayoutDelegate.layoutNode;
        LayoutNode layoutNode2 = layoutNodeLayoutDelegate.layoutNode;
        LayoutNode parent$ui = layoutNode.getParent$ui();
        if ((parent$ui != null ? parent$ui.layoutDelegate.layoutState : null) != LayoutNode.LayoutState.LookaheadMeasuring) {
            LayoutNode parent$ui2 = layoutNode2.getParent$ui();
        }
        layoutNodeLayoutDelegate.detachedFromParentLookaheadPass = false;
        LayoutNode parent$ui3 = layoutNode2.getParent$ui();
        if (parent$ui3 != null) {
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate2 = parent$ui3.layoutDelegate;
            if (this.measuredByParent != LayoutNode.UsageByParent.NotUsed && !layoutNode2.canMultiMeasure) {
                InlineClassHelperKt.throwIllegalStateException("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int ordinal = layoutNodeLayoutDelegate2.layoutState.ordinal();
            if (ordinal == 0 || ordinal == 1) {
                usageByParent = LayoutNode.UsageByParent.InMeasureBlock;
            } else {
                if (ordinal != 2 && ordinal != 3) {
                    a$$ExternalSyntheticBUOutline0.m$2(layoutNodeLayoutDelegate2.layoutState, "Measurable could be only measured from the parent's measure or layout block. Parents state is ");
                    return null;
                }
                usageByParent = LayoutNode.UsageByParent.InLayoutBlock;
            }
            this.measuredByParent = usageByParent;
        } else {
            this.measuredByParent = LayoutNode.UsageByParent.NotUsed;
        }
        if (layoutNode2.intrinsicsUsageByParent == LayoutNode.UsageByParent.NotUsed) {
            layoutNode2.clearSubtreeIntrinsicsUsage$ui();
        }
        m884remeasureBRTryo0(j);
        return this;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public final int minIntrinsicHeight(int i) {
        onIntrinsicsQueried();
        LookaheadDelegate lookaheadDelegate = this.layoutNodeLayoutDelegate.getOuterCoordinator().getLookaheadDelegate();
        lookaheadDelegate.getClass();
        return lookaheadDelegate.minIntrinsicHeight(i);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public final int minIntrinsicWidth(int i) {
        onIntrinsicsQueried();
        LookaheadDelegate lookaheadDelegate = this.layoutNodeLayoutDelegate.getOuterCoordinator().getLookaheadDelegate();
        lookaheadDelegate.getClass();
        return lookaheadDelegate.minIntrinsicWidth(i);
    }

    public final void notifyChildrenUsingLookaheadCoordinatesWhilePlacing() {
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.layoutNodeLayoutDelegate;
        if (layoutNodeLayoutDelegate.childrenAccessingLookaheadCoordinatesDuringPlacement > 0) {
            MutableVector mutableVector = layoutNodeLayoutDelegate.layoutNode.get_children$ui();
            Object[] objArr = mutableVector.content;
            int i = mutableVector.size;
            for (int i2 = 0; i2 < i; i2++) {
                LayoutNode layoutNode = (LayoutNode) objArr[i2];
                LayoutNodeLayoutDelegate layoutNodeLayoutDelegate2 = layoutNode.layoutDelegate;
                if ((layoutNodeLayoutDelegate2.lookaheadCoordinatesAccessedDuringPlacement || layoutNodeLayoutDelegate2.lookaheadCoordinatesAccessedDuringModifierPlacement) && !layoutNodeLayoutDelegate2.lookaheadLayoutPending) {
                    layoutNode.requestLookaheadRelayout$ui(false);
                }
                LookaheadPassDelegate lookaheadPassDelegate = layoutNodeLayoutDelegate2.lookaheadPassDelegate;
                if (lookaheadPassDelegate != null) {
                    lookaheadPassDelegate.notifyChildrenUsingLookaheadCoordinatesWhilePlacing();
                }
            }
        }
    }

    public final void onIntrinsicsQueried() {
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.layoutNodeLayoutDelegate;
        LayoutNode.requestLookaheadRemeasure$ui$default(layoutNodeLayoutDelegate.layoutNode, false, 7);
        LayoutNode layoutNode = layoutNodeLayoutDelegate.layoutNode;
        LayoutNode parent$ui = layoutNode.getParent$ui();
        if (parent$ui == null || layoutNode.intrinsicsUsageByParent != LayoutNode.UsageByParent.NotUsed) {
            return;
        }
        int ordinal = parent$ui.layoutDelegate.layoutState.ordinal();
        layoutNode.intrinsicsUsageByParent = ordinal != 0 ? ordinal != 2 ? parent$ui.intrinsicsUsageByParent : LayoutNode.UsageByParent.InLayoutBlock : LayoutNode.UsageByParent.InMeasureBlock;
    }

    public final void onNodePlaced$ui() {
        LayoutNode.LayoutState layoutState;
        this.onNodePlacedCalled = true;
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.layoutNodeLayoutDelegate;
        LayoutNode parent$ui = layoutNodeLayoutDelegate.layoutNode.getParent$ui();
        PlacedState placedState = this._placedState;
        if ((placedState != PlacedState.IsPlacedInLookahead && !layoutNodeLayoutDelegate.detachedFromParentLookaheadPlacement) || (placedState != PlacedState.IsPlacedInApproach && layoutNodeLayoutDelegate.detachedFromParentLookaheadPlacement)) {
            markNodeAndSubtreeAsPlaced();
            if (this.relayoutWithoutParentInProgress && parent$ui != null) {
                parent$ui.requestLookaheadRelayout$ui(false);
            }
        }
        if (parent$ui != null) {
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate2 = parent$ui.layoutDelegate;
            if (!this.relayoutWithoutParentInProgress && ((layoutState = layoutNodeLayoutDelegate2.layoutState) == LayoutNode.LayoutState.LayingOut || layoutState == LayoutNode.LayoutState.LookaheadLayingOut)) {
                if (this.placeOrder != Integer.MAX_VALUE) {
                    InlineClassHelperKt.throwIllegalStateException("Place was called on a node which was placed already");
                }
                int i = layoutNodeLayoutDelegate2.nextChildLookaheadPlaceOrder;
                this.placeOrder = i;
                layoutNodeLayoutDelegate2.nextChildLookaheadPlaceOrder = i + 1;
            }
        } else {
            this.placeOrder = 0;
        }
        layoutChildren();
    }

    @Override // androidx.compose.ui.layout.Placeable
    /* renamed from: placeAt-f8xVGno */
    public final void mo836placeAtf8xVGno(long j, float f, Function1 function1) {
        m883placeSelfMLgxB_4$1(j, null, function1);
    }

    /* renamed from: placeSelf-MLgxB_4$1, reason: not valid java name */
    public final void m883placeSelfMLgxB_4$1(long j, GraphicsLayer graphicsLayer, Function1 function1) {
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.layoutNodeLayoutDelegate;
        LayoutNode layoutNode = layoutNodeLayoutDelegate.layoutNode;
        LayoutNode layoutNode2 = layoutNodeLayoutDelegate.layoutNode;
        try {
            LayoutNode parent$ui = layoutNode.getParent$ui();
            LayoutNode.LayoutState layoutState = parent$ui != null ? parent$ui.layoutDelegate.layoutState : null;
            LayoutNode.LayoutState layoutState2 = LayoutNode.LayoutState.LookaheadLayingOut;
            if (layoutState == layoutState2) {
                layoutNodeLayoutDelegate.detachedFromParentLookaheadPlacement = false;
            }
            if (layoutNode2.isDeactivated) {
                InlineClassHelperKt.throwIllegalArgumentException("place is called on a deactivated node");
            }
            layoutNodeLayoutDelegate.layoutState = layoutState2;
            boolean z = true;
            this.placedOnce = true;
            this.onNodePlacedCalled = false;
            if (!IntOffset.m1047equalsimpl0(j, this.lastPosition)) {
                if (layoutNodeLayoutDelegate.lookaheadCoordinatesAccessedDuringModifierPlacement || layoutNodeLayoutDelegate.lookaheadCoordinatesAccessedDuringPlacement) {
                    layoutNodeLayoutDelegate.lookaheadLayoutPending = true;
                }
                notifyChildrenUsingLookaheadCoordinatesWhilePlacing();
            }
            Owner requireOwner = LayoutNodeKt.requireOwner(layoutNode2);
            this.lastPosition = j;
            if (!layoutNodeLayoutDelegate.lookaheadLayoutPending) {
                if (this._placedState == PlacedState.IsNotPlaced) {
                    z = false;
                }
                if (z) {
                    LookaheadDelegate lookaheadDelegate = layoutNodeLayoutDelegate.getOuterCoordinator().getLookaheadDelegate();
                    lookaheadDelegate.getClass();
                    lookaheadDelegate.m881placeSelfgyyYBs(IntOffset.m1049plusqkQi6aY(j, lookaheadDelegate.apparentToRealOffset));
                    onNodePlaced$ui();
                    this.lastLayerBlock = function1;
                    this.lastExplicitLayer = graphicsLayer;
                    layoutNodeLayoutDelegate.layoutState = LayoutNode.LayoutState.Idle;
                }
            }
            layoutNodeLayoutDelegate.setLookaheadCoordinatesAccessedDuringModifierPlacement(false);
            this.alignmentLines.usedByModifierLayout = false;
            ImageLoader$Builder imageLoader$Builder = ((AndroidComposeView) requireOwner).snapshotObserver;
            ((SnapshotStateObserver) imageLoader$Builder.application).observeReads(layoutNode2, (OwnerSnapshotObserver$onCommitAffectingLayout$1) imageLoader$Builder.componentRegistry, this.layoutModifierBlock);
            this.lastLayerBlock = function1;
            this.lastExplicitLayer = graphicsLayer;
            layoutNodeLayoutDelegate.layoutState = LayoutNode.LayoutState.Idle;
        } catch (Throwable th) {
            layoutNode.rethrowWithComposeStackTrace(th);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x001f, B:13:0x0027, B:15:0x002f, B:20:0x003e, B:22:0x0042, B:23:0x0047, B:26:0x0035, B:27:0x004b, B:29:0x0064, B:31:0x0076, B:33:0x007a, B:34:0x0082, B:37:0x0094, B:39:0x00b1, B:43:0x008f), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0064 A[Catch: all -> 0x0010, LOOP:0: B:28:0x0062->B:29:0x0064, LOOP_END, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x001f, B:13:0x0027, B:15:0x002f, B:20:0x003e, B:22:0x0042, B:23:0x0047, B:26:0x0035, B:27:0x004b, B:29:0x0064, B:31:0x0076, B:33:0x007a, B:34:0x0082, B:37:0x0094, B:39:0x00b1, B:43:0x008f), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007a A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x001f, B:13:0x0027, B:15:0x002f, B:20:0x003e, B:22:0x0042, B:23:0x0047, B:26:0x0035, B:27:0x004b, B:29:0x0064, B:31:0x0076, B:33:0x007a, B:34:0x0082, B:37:0x0094, B:39:0x00b1, B:43:0x008f), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008f A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x001f, B:13:0x0027, B:15:0x002f, B:20:0x003e, B:22:0x0042, B:23:0x0047, B:26:0x0035, B:27:0x004b, B:29:0x0064, B:31:0x0076, B:33:0x007a, B:34:0x0082, B:37:0x0094, B:39:0x00b1, B:43:0x008f), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007d  */
    /* renamed from: remeasure-BRTryo0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m884remeasureBRTryo0(long j) {
        boolean z;
        int i;
        int i2;
        LookaheadDelegate lookaheadDelegate;
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.layoutNodeLayoutDelegate;
        LayoutNode layoutNode = layoutNodeLayoutDelegate.layoutNode;
        LayoutNode layoutNode2 = layoutNodeLayoutDelegate.layoutNode;
        try {
            if (layoutNode.isDeactivated) {
                InlineClassHelperKt.throwIllegalArgumentException("measure is called on a deactivated node");
            }
            LayoutNode parent$ui = layoutNode2.getParent$ui();
            if (!layoutNode2.canMultiMeasure && (parent$ui == null || !parent$ui.canMultiMeasure)) {
                z = false;
                layoutNode2.canMultiMeasure = z;
                if (!layoutNode2.layoutDelegate.lookaheadMeasurePending) {
                    Constraints constraints = this.lookaheadConstraints;
                    if (constraints == null ? false : Constraints.m1019equalsimpl0(constraints.value, j)) {
                        Owner owner = layoutNode2.owner;
                        if (owner != null) {
                            ((AndroidComposeView) owner).forceMeasureTheSubtree(layoutNode2, true);
                        }
                        layoutNode2.resetSubtreeIntrinsicsUsage$ui();
                        return false;
                    }
                }
                this.lookaheadConstraints = new Constraints(j);
                m853setMeasurementConstraintsBRTryo0(j);
                this.alignmentLines.usedByModifierMeasurement = false;
                MutableVector mutableVector = layoutNode2.get_children$ui();
                Object[] objArr = mutableVector.content;
                i = mutableVector.size;
                for (i2 = 0; i2 < i; i2++) {
                    LookaheadPassDelegate lookaheadPassDelegate = ((LayoutNode) objArr[i2]).layoutDelegate.lookaheadPassDelegate;
                    lookaheadPassDelegate.getClass();
                    lookaheadPassDelegate.alignmentLines.usedDuringParentMeasurement = false;
                }
                long j2 = !this.measuredOnce ? this.measuredSize : -9223372034707292160L;
                this.measuredOnce = true;
                lookaheadDelegate = layoutNodeLayoutDelegate.getOuterCoordinator().getLookaheadDelegate();
                if (lookaheadDelegate != null) {
                    InlineClassHelperKt.throwIllegalStateException("Lookahead result from lookaheadRemeasure cannot be null");
                }
                layoutNodeLayoutDelegate.m877performLookaheadMeasureBRTryo0$ui(j);
                m852setMeasuredSizeozmzZPI((lookaheadDelegate.width << 32) | (lookaheadDelegate.height & BodyPartID.bodyIdMax));
                return ((int) (j2 >> 32)) == lookaheadDelegate.width || ((int) (j2 & BodyPartID.bodyIdMax)) != lookaheadDelegate.height;
            }
            z = true;
            layoutNode2.canMultiMeasure = z;
            if (!layoutNode2.layoutDelegate.lookaheadMeasurePending) {
            }
            this.lookaheadConstraints = new Constraints(j);
            m853setMeasurementConstraintsBRTryo0(j);
            this.alignmentLines.usedByModifierMeasurement = false;
            MutableVector mutableVector2 = layoutNode2.get_children$ui();
            Object[] objArr2 = mutableVector2.content;
            i = mutableVector2.size;
            while (i2 < i) {
            }
            if (!this.measuredOnce) {
            }
            this.measuredOnce = true;
            lookaheadDelegate = layoutNodeLayoutDelegate.getOuterCoordinator().getLookaheadDelegate();
            if (lookaheadDelegate != null) {
            }
            layoutNodeLayoutDelegate.m877performLookaheadMeasureBRTryo0$ui(j);
            m852setMeasuredSizeozmzZPI((lookaheadDelegate.width << 32) | (lookaheadDelegate.height & BodyPartID.bodyIdMax));
            if (((int) (j2 >> 32)) == lookaheadDelegate.width) {
            }
        } catch (Throwable th) {
            layoutNode.rethrowWithComposeStackTrace(th);
            throw null;
        }
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    public final void requestLayout() {
        this.layoutNodeLayoutDelegate.layoutNode.requestLookaheadRelayout$ui(false);
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    public final void requestMeasure() {
        LayoutNode.requestLookaheadRemeasure$ui$default(this.layoutNodeLayoutDelegate.layoutNode, false, 7);
    }

    @Override // androidx.compose.ui.node.MotionReferencePlacementDelegate
    public final void updatePlacedUnderMotionFrameOfReference(boolean z) {
        LookaheadDelegate lookaheadDelegate;
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.layoutNodeLayoutDelegate;
        LookaheadDelegate lookaheadDelegate2 = layoutNodeLayoutDelegate.getOuterCoordinator().getLookaheadDelegate();
        if (Boolean.valueOf(z).equals(lookaheadDelegate2 != null ? Boolean.valueOf(lookaheadDelegate2.isPlacedUnderMotionFrameOfReference) : null) || (lookaheadDelegate = layoutNodeLayoutDelegate.getOuterCoordinator().getLookaheadDelegate()) == null) {
            return;
        }
        lookaheadDelegate.isPlacedUnderMotionFrameOfReference = z;
    }

    @Override // androidx.compose.ui.layout.Placeable
    /* renamed from: placeAt-f8xVGno */
    public final void mo851placeAtf8xVGno(long j, float f, GraphicsLayer graphicsLayer) {
        m883placeSelfMLgxB_4$1(j, graphicsLayer, null);
    }
}
