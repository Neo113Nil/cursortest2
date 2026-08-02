package androidx.compose.ui.node;

import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableIntSet;
import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.compose.runtime.tooling.CompositionErrorContext;
import androidx.compose.runtime.tooling.CompositionErrorContextImpl;
import androidx.compose.runtime.tooling.CompositionErrorContextKt;
import androidx.compose.runtime.tooling.SourceInformationKt;
import androidx.compose.ui.CombinedModifier;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.autofill.AndroidAutofillManager;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutNodeSubcompositionsState;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.LookaheadPassDelegate;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.GraphicsLayerOwnerLayer;
import androidx.compose.ui.platform.JvmActuals_jvmKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.spatial.RectManager;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$3;
import androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$4;
import androidx.compose.ui.viewinterop.ViewFactoryHolder;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.compose.DialogHostKt$$ExternalSyntheticLambda0;
import androidx.work.impl.WorkLauncherImpl;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.ImageLoader$Builder;
import coil3.memory.MemoryCacheService;
import com.bugsnag.android.EventStore$$ExternalSyntheticLambda0;
import com.datadog.android.Datadog$getInstance$1$1;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.contour.ContourLayout$geometry$1;
import com.squareup.wire.GrpcMethod;
import curtains.WindowsKt$onNextDraw$1;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import okhttp3.internal.http.StatusLine;
import okio.FileMetadata;

/* loaded from: classes.dex */
public final class LayoutNode implements ComposeNodeLifecycleCallback, OwnerScope, ComposeUiNode {
    public final WorkLauncherImpl _foldedChildren;
    public LayoutNode _foldedParent;
    public NodeCoordinator _innerLayerCoordinator;
    public Modifier _modifier;
    public SemanticsConfiguration _semanticsConfiguration;
    public MutableVector _unfoldedChildren;
    public final MutableVector _zSortedChildren;
    public boolean addedToRectList;
    public boolean canMultiMeasure;
    public CompositionLocalMap compositionLocalMap;
    public Density density;
    public int depth;
    public int globallyPositionedObservers;
    public boolean hasPositionalLayerTransformationsInOffsetFromRoot;
    public boolean ignoreRemeasureRequests;
    public boolean innerLayerCoordinatorIsDirty;
    public ViewFactoryHolder interopViewFactoryHolder;
    public WorkLauncherImpl intrinsicsPolicy;
    public UsageByParent intrinsicsUsageByParent;
    public boolean isCurrentlyCalculatingSemanticsConfiguration;
    public boolean isDeactivated;
    public boolean isSemanticsInvalidated;
    public final boolean isVirtual;
    public boolean isVirtualLookaheadRoot;
    public final LayoutNodeLayoutDelegate layoutDelegate;
    public LayoutDirection layoutDirection;
    public LayoutNode lookaheadRoot;
    public MeasurePolicy measurePolicy;
    public boolean needsOnGloballyPositionedDispatch;
    public final NodeChain nodes;
    public AndroidViewHolder$layoutNode$1$3 onAttach;
    public AndroidViewHolder$layoutNode$1$4 onDetach;
    public long outerToInnerOffset;
    public boolean outerToInnerOffsetDirty;
    public Owner owner;
    public Modifier pendingModifier;
    public UsageByParent previousIntrinsicsUsageByParent;
    public boolean rectInParentDirty;
    public int semanticsId;
    public LayoutNodeSubcompositionsState subcompositionsState;
    public boolean unfoldedVirtualChildrenListDirty;
    public ViewConfiguration viewConfiguration;
    public int virtualChildrenCount;
    public boolean zSortedChildrenInvalidated;
    public static final LayoutNode$Companion$ErrorMeasurePolicy$1 ErrorMeasurePolicy = new LayoutNode$Companion$ErrorMeasurePolicy$1("Undefined intrinsics block and it is required");
    public static final LayoutNode$Companion$DummyViewConfiguration$1 DummyViewConfiguration = new LayoutNode$Companion$DummyViewConfiguration$1();
    public static final EventStore$$ExternalSyntheticLambda0 ZComparator = new EventStore$$ExternalSyntheticLambda0(2);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class LayoutState {
        public static final /* synthetic */ LayoutState[] $VALUES;
        public static final LayoutState Idle;
        public static final LayoutState LayingOut;
        public static final LayoutState LookaheadLayingOut;
        public static final LayoutState LookaheadMeasuring;
        public static final LayoutState Measuring;

        static {
            LayoutState layoutState = new LayoutState("Measuring", 0);
            Measuring = layoutState;
            LayoutState layoutState2 = new LayoutState("LookaheadMeasuring", 1);
            LookaheadMeasuring = layoutState2;
            LayoutState layoutState3 = new LayoutState("LayingOut", 2);
            LayingOut = layoutState3;
            LayoutState layoutState4 = new LayoutState("LookaheadLayingOut", 3);
            LookaheadLayingOut = layoutState4;
            LayoutState layoutState5 = new LayoutState("Idle", 4);
            Idle = layoutState5;
            $VALUES = new LayoutState[]{layoutState, layoutState2, layoutState3, layoutState4, layoutState5};
        }

        public static LayoutState valueOf(String str) {
            return (LayoutState) Enum.valueOf(LayoutState.class, str);
        }

        public static LayoutState[] values() {
            return (LayoutState[]) $VALUES.clone();
        }
    }

    public abstract class NoIntrinsicsMeasurePolicy implements MeasurePolicy {
        public final String error;

        public NoIntrinsicsMeasurePolicy(String str) {
            this.error = str;
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public final int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
            throw new IllegalStateException(this.error.toString());
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public final int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
            throw new IllegalStateException(this.error.toString());
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public final int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
            throw new IllegalStateException(this.error.toString());
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public final int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
            throw new IllegalStateException(this.error.toString());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class UsageByParent {
        public static final /* synthetic */ UsageByParent[] $VALUES;
        public static final UsageByParent InLayoutBlock;
        public static final UsageByParent InMeasureBlock;
        public static final UsageByParent NotUsed;

        static {
            UsageByParent usageByParent = new UsageByParent("InMeasureBlock", 0);
            InMeasureBlock = usageByParent;
            UsageByParent usageByParent2 = new UsageByParent("InLayoutBlock", 1);
            InLayoutBlock = usageByParent2;
            UsageByParent usageByParent3 = new UsageByParent("NotUsed", 2);
            NotUsed = usageByParent3;
            $VALUES = new UsageByParent[]{usageByParent, usageByParent2, usageByParent3};
        }

        public static UsageByParent valueOf(String str) {
            return (UsageByParent) Enum.valueOf(UsageByParent.class, str);
        }

        public static UsageByParent[] values() {
            return (UsageByParent[]) $VALUES.clone();
        }
    }

    /* loaded from: classes3.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutState.values().length];
            try {
                LayoutState layoutState = LayoutState.Measuring;
                iArr[4] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public LayoutNode(boolean z, int i) {
        this.isVirtual = z;
        this.semanticsId = i;
        this.outerToInnerOffset = 9223372034707292159L;
        this.outerToInnerOffsetDirty = true;
        this.rectInParentDirty = true;
        this._foldedChildren = new WorkLauncherImpl(11, new MutableVector(0, new LayoutNode[16]), new ContourLayout$geometry$1(this, 5));
        this._zSortedChildren = new MutableVector(0, new LayoutNode[16]);
        this.zSortedChildrenInvalidated = true;
        this.measurePolicy = ErrorMeasurePolicy;
        this.density = LayoutNodeKt.DefaultDensity;
        this.layoutDirection = LayoutDirection.Ltr;
        this.viewConfiguration = DummyViewConfiguration;
        CompositionLocalMap.Companion.getClass();
        this.compositionLocalMap = CompositionLocalMap.Companion.Empty;
        UsageByParent usageByParent = UsageByParent.NotUsed;
        this.intrinsicsUsageByParent = usageByParent;
        this.previousIntrinsicsUsageByParent = usageByParent;
        this.nodes = new NodeChain(this);
        this.layoutDelegate = new LayoutNodeLayoutDelegate(this);
        this.innerLayerCoordinatorIsDirty = true;
        this._modifier = Modifier.Companion.$$INSTANCE;
    }

    private final String exceptionMessageForParentingOrOwnership(LayoutNode layoutNode) {
        StringBuilder sb = new StringBuilder("Cannot insert ");
        sb.append(layoutNode);
        sb.append(" because it already has a parent or an owner. This tree: ");
        sb.append(debugTreeToString(0));
        sb.append(" Other tree: ");
        LayoutNode layoutNode2 = layoutNode._foldedParent;
        sb.append(layoutNode2 != null ? layoutNode2.debugTreeToString(0) : null);
        return sb.toString();
    }

    public static void requestLookaheadRemeasure$ui$default(LayoutNode layoutNode, boolean z, int i) {
        LayoutNode parent$ui;
        if ((i & 1) != 0) {
            z = false;
        }
        boolean z2 = (i & 2) != 0;
        boolean z3 = (i & 4) != 0;
        if (layoutNode.lookaheadRoot == null) {
            InlineClassHelperKt.throwIllegalStateException("Lookahead measure cannot be requested on a node that is not a part of the LookaheadScope");
        }
        Owner owner = layoutNode.owner;
        if (owner == null || layoutNode.ignoreRemeasureRequests || layoutNode.isVirtual) {
            return;
        }
        ((AndroidComposeView) owner).onRequestMeasure(layoutNode, true, z, z2);
        if (z3) {
            LookaheadPassDelegate lookaheadPassDelegate = layoutNode.layoutDelegate.lookaheadPassDelegate;
            lookaheadPassDelegate.getClass();
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = lookaheadPassDelegate.layoutNodeLayoutDelegate;
            LayoutNode parent$ui2 = layoutNodeLayoutDelegate.layoutNode.getParent$ui();
            UsageByParent usageByParent = layoutNodeLayoutDelegate.layoutNode.intrinsicsUsageByParent;
            if (parent$ui2 == null || usageByParent == UsageByParent.NotUsed) {
                return;
            }
            while (parent$ui2.intrinsicsUsageByParent == usageByParent && (parent$ui = parent$ui2.getParent$ui()) != null) {
                parent$ui2 = parent$ui;
            }
            int ordinal = usageByParent.ordinal();
            if (ordinal == 0) {
                if (parent$ui2.lookaheadRoot != null) {
                    requestLookaheadRemeasure$ui$default(parent$ui2, z, 6);
                    return;
                } else {
                    requestRemeasure$ui$default(parent$ui2, z, 6);
                    return;
                }
            }
            if (ordinal != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("Intrinsics isn't used by the parent");
            } else if (parent$ui2.lookaheadRoot != null) {
                parent$ui2.requestLookaheadRelayout$ui(z);
            } else {
                parent$ui2.requestRelayout$ui(z);
            }
        }
    }

    public static void requestRemeasure$ui$default(LayoutNode layoutNode, boolean z, int i) {
        Owner owner;
        LayoutNode parent$ui;
        if ((i & 1) != 0) {
            z = false;
        }
        boolean z2 = (i & 2) != 0;
        boolean z3 = (i & 4) != 0;
        if (layoutNode.ignoreRemeasureRequests || layoutNode.isVirtual || (owner = layoutNode.owner) == null) {
            return;
        }
        ((AndroidComposeView) owner).onRequestMeasure(layoutNode, false, z, z2);
        if (z3) {
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = layoutNode.layoutDelegate.measurePassDelegate.layoutNodeLayoutDelegate;
            LayoutNode parent$ui2 = layoutNodeLayoutDelegate.layoutNode.getParent$ui();
            UsageByParent usageByParent = layoutNodeLayoutDelegate.layoutNode.intrinsicsUsageByParent;
            if (parent$ui2 == null || usageByParent == UsageByParent.NotUsed) {
                return;
            }
            while (parent$ui2.intrinsicsUsageByParent == usageByParent && (parent$ui = parent$ui2.getParent$ui()) != null) {
                parent$ui2 = parent$ui;
            }
            int ordinal = usageByParent.ordinal();
            if (ordinal == 0) {
                requestRemeasure$ui$default(parent$ui2, z, 6);
            } else if (ordinal == 1) {
                parent$ui2.requestRelayout$ui(z);
            } else {
                a$$ExternalSyntheticBUOutline0.m$1("Intrinsics isn't used by the parent");
            }
        }
    }

    public static void rescheduleRemeasureOrRelayout$ui(LayoutNode layoutNode) {
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = layoutNode.layoutDelegate;
        if (WhenMappings.$EnumSwitchMapping$0[layoutNodeLayoutDelegate.layoutState.ordinal()] != 1) {
            a$$ExternalSyntheticBUOutline0.m$2(layoutNodeLayoutDelegate.layoutState, "Unexpected state ");
            return;
        }
        if (layoutNodeLayoutDelegate.lookaheadMeasurePending) {
            requestLookaheadRemeasure$ui$default(layoutNode, true, 6);
            return;
        }
        if (layoutNodeLayoutDelegate.lookaheadLayoutPending) {
            layoutNode.requestLookaheadRelayout$ui(true);
        }
        if (layoutNode.getMeasurePending$ui()) {
            requestRemeasure$ui$default(layoutNode, true, 6);
        } else if (layoutNode.getLayoutPending$ui()) {
            layoutNode.requestRelayout$ui(true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3, types: [int] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v3, types: [androidx.compose.ui.Modifier$Node, androidx.compose.ui.node.NodeCoordinator] */
    /* JADX WARN: Type inference failed for: r9v2, types: [androidx.compose.ui.Modifier$Node, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    public final void applyModifier(Modifier modifier) {
        ?? r7;
        boolean z;
        MutableVector mutableVector;
        MutableVector mutableVector2;
        boolean z2;
        NodeChain nodeChain;
        NodeChain$sentinelHead$1 nodeChain$sentinelHead$1;
        boolean z3;
        NodeChain nodeChain2;
        ?? r5;
        boolean z4;
        NodeChain nodeChain3;
        boolean z5;
        WindowsKt$onNextDraw$1 windowsKt$onNextDraw$1;
        NodeChain nodeChain4 = this.nodes;
        boolean m889hasH91voCI$ui = nodeChain4.m889hasH91voCI$ui(16);
        TailModifierNode tailModifierNode = (TailModifierNode) nodeChain4.tail;
        boolean m889hasH91voCI$ui2 = nodeChain4.m889hasH91voCI$ui(1024);
        this._modifier = modifier;
        InnerNodeCoordinator innerNodeCoordinator = (InnerNodeCoordinator) nodeChain4.innerCoordinator;
        LayoutNode layoutNode = (LayoutNode) nodeChain4.layoutNode;
        Modifier.Node node = (Modifier.Node) nodeChain4.head;
        NodeChain$sentinelHead$1 nodeChain$sentinelHead$12 = (NodeChain$sentinelHead$1) nodeChain4.sentinelHead;
        if (node == nodeChain$sentinelHead$12) {
            InlineClassHelperKt.throwIllegalStateException("padChain called on already padded chain");
        }
        Modifier.Node node2 = (Modifier.Node) nodeChain4.head;
        node2.setParent$ui(nodeChain$sentinelHead$12);
        nodeChain$sentinelHead$12.setChild$ui(node2);
        MutableVector mutableVector3 = (MutableVector) nodeChain4.current;
        int i = mutableVector3 != null ? mutableVector3.size : 0;
        MutableVector mutableVector4 = (MutableVector) nodeChain4.buffer;
        if (mutableVector4 == null) {
            mutableVector4 = new MutableVector(0, new Modifier.Element[16]);
        }
        MutableVector mutableVector5 = (MutableVector) nodeChain4.stack;
        mutableVector5.add(modifier);
        WindowsKt$onNextDraw$1 windowsKt$onNextDraw$12 = null;
        while (true) {
            int i2 = mutableVector5.size;
            if (i2 == 0) {
                break;
            }
            Modifier modifier2 = (Modifier) mutableVector5.removeAt(i2 - 1);
            if (modifier2 instanceof CombinedModifier) {
                CombinedModifier combinedModifier = (CombinedModifier) modifier2;
                mutableVector5.add(combinedModifier.inner);
                mutableVector5.add(combinedModifier.outer);
            } else if (modifier2 instanceof Modifier.Element) {
                mutableVector4.add(modifier2);
            } else {
                if (windowsKt$onNextDraw$12 == null) {
                    windowsKt$onNextDraw$1 = new WindowsKt$onNextDraw$1(mutableVector4, 6);
                    windowsKt$onNextDraw$12 = windowsKt$onNextDraw$1;
                } else {
                    windowsKt$onNextDraw$1 = windowsKt$onNextDraw$12;
                }
                modifier2.all(windowsKt$onNextDraw$1);
            }
        }
        int i3 = mutableVector4.size;
        if (i3 == i) {
            Modifier.Node child$ui = nodeChain$sentinelHead$12.getChild$ui();
            NodeChain nodeChain5 = nodeChain4;
            int i4 = 0;
            while (child$ui != null && i4 < i) {
                if (mutableVector3 == null) {
                    throw Boxes$$ExternalSyntheticOutline1.m1150m("expected prior modifier list to be non-empty");
                }
                Modifier.Element element = (Modifier.Element) mutableVector3.content[i4];
                Modifier.Element element2 = (Modifier.Element) mutableVector4.content[i4];
                if (Intrinsics.areEqual(element, element2)) {
                    nodeChain3 = nodeChain5;
                    z5 = 2;
                } else {
                    nodeChain3 = nodeChain5;
                    z5 = element.getClass() == element2.getClass();
                }
                if (!z5) {
                    child$ui = child$ui.getParent$ui();
                    break;
                }
                if (z5) {
                    NodeChain.updateNode(element, element2, child$ui);
                }
                child$ui = child$ui.getChild$ui();
                i4++;
                nodeChain5 = nodeChain3;
            }
            nodeChain3 = nodeChain5;
            if (i4 >= i) {
                nodeChain4 = nodeChain3;
                z3 = false;
                nodeChain2 = nodeChain4;
                mutableVector = mutableVector3;
                r5 = nodeChain$sentinelHead$12;
                mutableVector2 = mutableVector4;
                z = false;
                z2 = false;
                r7 = z3;
            } else {
                if (mutableVector3 == null) {
                    throw Boxes$$ExternalSyntheticOutline1.m1150m("expected prior modifier list to be non-empty");
                }
                if (child$ui == null) {
                    throw Boxes$$ExternalSyntheticOutline1.m1150m("structuralUpdate requires a non-null tail");
                }
                boolean z6 = layoutNode.pendingModifier != null;
                mutableVector = mutableVector3;
                mutableVector2 = mutableVector4;
                z4 = false;
                Modifier.Node node3 = child$ui;
                NodeChain nodeChain6 = nodeChain3;
                nodeChain6.structuralUpdate(i4, mutableVector, mutableVector2, node3, !z6);
                nodeChain$sentinelHead$1 = nodeChain$sentinelHead$12;
                nodeChain = nodeChain6;
                z = false;
                z2 = true;
                nodeChain2 = nodeChain;
                r5 = nodeChain$sentinelHead$1;
                r7 = z4;
            }
        } else {
            r7 = 0;
            z4 = false;
            z3 = false;
            Modifier modifier3 = layoutNode.pendingModifier;
            if (modifier3 != null && i == 0) {
                Modifier.Node node4 = nodeChain$sentinelHead$12;
                for (int i5 = 0; i5 < mutableVector4.size; i5++) {
                    node4 = NodeChain.createAndInsertNodeAsChild((Modifier.Element) mutableVector4.content[i5], node4);
                }
                int i6 = 0;
                for (Modifier.Node parent$ui = tailModifierNode.getParent$ui(); parent$ui != null && parent$ui != nodeChain$sentinelHead$12; parent$ui = parent$ui.getParent$ui()) {
                    i6 |= parent$ui.getKindSet$ui();
                    parent$ui.setAggregateChildKindSet$ui(i6);
                }
                nodeChain = nodeChain4;
                mutableVector = mutableVector3;
                nodeChain$sentinelHead$1 = nodeChain$sentinelHead$12;
                mutableVector2 = mutableVector4;
                z = false;
                z2 = true;
                nodeChain2 = nodeChain;
                r5 = nodeChain$sentinelHead$1;
                r7 = z4;
            } else if (i3 != 0) {
                if (mutableVector3 == null) {
                    z = false;
                    mutableVector3 = new MutableVector(0, new Modifier.Element[16]);
                } else {
                    z = false;
                }
                mutableVector = mutableVector3;
                NodeChain nodeChain7 = nodeChain4;
                NodeChain$sentinelHead$1 nodeChain$sentinelHead$13 = nodeChain$sentinelHead$12;
                mutableVector2 = mutableVector4;
                nodeChain7.structuralUpdate(0, mutableVector, mutableVector2, nodeChain$sentinelHead$13, !(modifier3 != null ? true : z));
                z2 = true;
                nodeChain2 = nodeChain7;
                r5 = nodeChain$sentinelHead$13;
            } else {
                if (mutableVector3 == null) {
                    throw Boxes$$ExternalSyntheticOutline1.m1150m("expected prior modifier list to be non-empty");
                }
                Modifier.Node child$ui2 = nodeChain$sentinelHead$12.getChild$ui();
                for (int i7 = 0; child$ui2 != null && i7 < mutableVector3.size; i7++) {
                    child$ui2 = NodeChain.detachAndRemoveNode(child$ui2).getChild$ui();
                }
                LayoutNode parent$ui2 = layoutNode.getParent$ui();
                innerNodeCoordinator.wrappedBy = parent$ui2 != null ? (InnerNodeCoordinator) parent$ui2.nodes.innerCoordinator : null;
                nodeChain4.outerCoordinator = innerNodeCoordinator;
                nodeChain2 = nodeChain4;
                mutableVector = mutableVector3;
                r5 = nodeChain$sentinelHead$12;
                mutableVector2 = mutableVector4;
                z = false;
                z2 = false;
                r7 = z3;
            }
        }
        nodeChain2.current = mutableVector2;
        if (mutableVector != null) {
            mutableVector.clear();
        } else {
            mutableVector = r7;
        }
        nodeChain2.buffer = mutableVector;
        Modifier.Node child$ui3 = r5.getChild$ui();
        ?? r9 = tailModifierNode;
        if (child$ui3 != null) {
            r9 = child$ui3;
        }
        r9.setParent$ui(r7);
        r5.setChild$ui(r7);
        r5.setAggregateChildKindSet$ui(-1);
        r5.updateCoordinator$ui(r7);
        if (r9 == r5) {
            InlineClassHelperKt.throwIllegalStateException("trimChain did not update the head");
        }
        nodeChain2.head = r9;
        if (z2) {
            nodeChain2.syncCoordinators();
        }
        boolean m889hasH91voCI$ui3 = nodeChain2.m889hasH91voCI$ui(16);
        boolean m889hasH91voCI$ui4 = nodeChain2.m889hasH91voCI$ui(1024);
        this.layoutDelegate.updateParentData();
        if (this.lookaheadRoot == null && nodeChain2.m889hasH91voCI$ui(512)) {
            setLookaheadRoot(this);
        }
        if (m889hasH91voCI$ui == m889hasH91voCI$ui3 && m889hasH91voCI$ui2 == m889hasH91voCI$ui4) {
            return;
        }
        RectManager rectManager = ((AndroidComposeView) LayoutNodeKt.requireOwner(this)).rectManager;
        rectManager.getClass();
        if (isAttached()) {
            StatusLine statusLine = rectManager.rects;
            int i8 = this.semanticsId & 33554431;
            long[] jArr = (long[]) statusLine.protocol;
            int i9 = statusLine.code;
            for (?? r13 = z; r13 < jArr.length - 2 && r13 < i9; r13 += 3) {
                int i10 = r13 + 2;
                long j = jArr[i10];
                if ((((int) j) & 33554431) == i8) {
                    jArr[i10] = ((-6917529027641081857L) & j) | ((m889hasH91voCI$ui4 ? 1L : 0L) * 2305843009213693952L) | ((m889hasH91voCI$ui3 ? 1L : 0L) * 4611686018427387904L);
                    return;
                }
            }
        }
    }

    public final void attach$ui(Owner owner) {
        LayoutNode layoutNode;
        SemanticsConfiguration semanticsConfiguration;
        if (this.owner != null) {
            InlineClassHelperKt.throwIllegalStateException("Cannot attach " + this + " as it already is attached.  Tree: " + debugTreeToString(0));
        }
        LayoutNode layoutNode2 = this._foldedParent;
        if (layoutNode2 != null && !Intrinsics.areEqual(layoutNode2.owner, owner)) {
            StringBuilder sb = new StringBuilder("Attaching to a different owner(");
            sb.append(owner);
            sb.append(") than the parent's owner(");
            LayoutNode parent$ui = getParent$ui();
            sb.append(parent$ui != null ? parent$ui.owner : null);
            sb.append("). This tree: ");
            sb.append(debugTreeToString(0));
            sb.append(" Parent tree: ");
            LayoutNode layoutNode3 = this._foldedParent;
            sb.append(layoutNode3 != null ? layoutNode3.debugTreeToString(0) : null);
            InlineClassHelperKt.throwIllegalStateException(sb.toString());
        }
        LayoutNode parent$ui2 = getParent$ui();
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.layoutDelegate;
        if (parent$ui2 == null) {
            layoutNodeLayoutDelegate.measurePassDelegate.isPlaced = true;
            ((AndroidComposeView) owner).rectManager.recalculateRectIfDirty(this);
            LookaheadPassDelegate lookaheadPassDelegate = layoutNodeLayoutDelegate.lookaheadPassDelegate;
            if (lookaheadPassDelegate != null) {
                lookaheadPassDelegate._placedState = LookaheadPassDelegate.PlacedState.IsPlacedInLookahead;
            }
        }
        NodeChain nodeChain = this.nodes;
        ((NodeCoordinator) nodeChain.outerCoordinator).wrappedBy = parent$ui2 != null ? (InnerNodeCoordinator) parent$ui2.nodes.innerCoordinator : null;
        this.owner = owner;
        this.depth = (parent$ui2 != null ? parent$ui2.depth : -1) + 1;
        Modifier modifier = this.pendingModifier;
        if (modifier != null) {
            applyModifier(modifier);
        }
        this.pendingModifier = null;
        ((AndroidComposeView) owner).layoutNodes.set(this.semanticsId, this);
        if (this.isVirtualLookaheadRoot) {
            setLookaheadRoot(this);
        } else {
            LayoutNode layoutNode4 = this._foldedParent;
            if (layoutNode4 == null || (layoutNode = layoutNode4.lookaheadRoot) == null) {
                layoutNode = this.lookaheadRoot;
            }
            setLookaheadRoot(layoutNode);
            if (this.lookaheadRoot == null && nodeChain.m889hasH91voCI$ui(512)) {
                setLookaheadRoot(this);
            }
        }
        if (!this.isDeactivated) {
            for (Modifier.Node node = (Modifier.Node) nodeChain.head; node != null; node = node.getChild$ui()) {
                node.markAsAttached$ui();
            }
        }
        MutableVector mutableVector = (MutableVector) this._foldedChildren.processor;
        Object[] objArr = mutableVector.content;
        int i = mutableVector.size;
        for (int i2 = 0; i2 < i; i2++) {
            ((LayoutNode) objArr[i2]).attach$ui(owner);
        }
        if (!this.isDeactivated) {
            nodeChain.runAttachLifecycle();
        }
        invalidateMeasurements$ui();
        if (parent$ui2 != null) {
            parent$ui2.invalidateMeasurements$ui();
        }
        AndroidViewHolder$layoutNode$1$3 androidViewHolder$layoutNode$1$3 = this.onAttach;
        if (androidViewHolder$layoutNode$1$3 != null) {
            androidViewHolder$layoutNode$1$3.invoke(owner);
        }
        layoutNodeLayoutDelegate.updateParentData();
        if (!this.isDeactivated && nodeChain.m889hasH91voCI$ui(8)) {
            invalidateSemantics$ui();
        }
        AndroidAutofillManager androidAutofillManager = ((AndroidComposeView) owner)._autofillManager;
        if (androidAutofillManager == null || (semanticsConfiguration = getSemanticsConfiguration()) == null || !semanticsConfiguration.props.contains(SemanticsProperties.ContentType)) {
            return;
        }
        androidAutofillManager.currentlyDisplayedIDs.add(this.semanticsId);
        androidAutofillManager.platformAutofillManager.notifyViewVisibilityChanged(androidAutofillManager.view, this.semanticsId, true);
    }

    public final void clearSubtreeIntrinsicsUsage$ui() {
        this.previousIntrinsicsUsageByParent = this.intrinsicsUsageByParent;
        this.intrinsicsUsageByParent = UsageByParent.NotUsed;
        MutableVector mutableVector = get_children$ui();
        Object[] objArr = mutableVector.content;
        int i = mutableVector.size;
        for (int i2 = 0; i2 < i; i2++) {
            LayoutNode layoutNode = (LayoutNode) objArr[i2];
            if (layoutNode.intrinsicsUsageByParent != UsageByParent.NotUsed) {
                layoutNode.clearSubtreeIntrinsicsUsage$ui();
            }
        }
    }

    public final void clearSubtreePlacementIntrinsicsUsage() {
        this.previousIntrinsicsUsageByParent = this.intrinsicsUsageByParent;
        this.intrinsicsUsageByParent = UsageByParent.NotUsed;
        MutableVector mutableVector = get_children$ui();
        Object[] objArr = mutableVector.content;
        int i = mutableVector.size;
        for (int i2 = 0; i2 < i; i2++) {
            LayoutNode layoutNode = (LayoutNode) objArr[i2];
            if (layoutNode.intrinsicsUsageByParent == UsageByParent.InLayoutBlock) {
                layoutNode.clearSubtreePlacementIntrinsicsUsage();
            }
        }
    }

    public final String debugTreeToString(int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
        sb.append("|-");
        sb.append(toString());
        sb.append('\n');
        MutableVector mutableVector = get_children$ui();
        Object[] objArr = mutableVector.content;
        int i3 = mutableVector.size;
        for (int i4 = 0; i4 < i3; i4++) {
            sb.append(((LayoutNode) objArr[i4]).debugTreeToString(i + 1));
        }
        String sb2 = sb.toString();
        return i == 0 ? Boxes$$ExternalSyntheticOutline1.m1148m(1, 0, sb2) : sb2;
    }

    public final void detach$ui() {
        LookaheadAlignmentLines lookaheadAlignmentLines;
        Owner owner = this.owner;
        if (owner == null) {
            StringBuilder sb = new StringBuilder("Cannot detach node that is already detached!  Tree: ");
            LayoutNode parent$ui = getParent$ui();
            sb.append(parent$ui != null ? parent$ui.debugTreeToString(0) : null);
            InlineClassHelperKt.throwIllegalStateExceptionForNullCheck(sb.toString());
            OptionalProvider$$ExternalSyntheticLambda0.m$1();
            return;
        }
        LayoutNode parent$ui2 = getParent$ui();
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.layoutDelegate;
        if (parent$ui2 != null) {
            parent$ui2.invalidateLayer$ui();
            parent$ui2.invalidateMeasurements$ui();
            MeasurePassDelegate measurePassDelegate = layoutNodeLayoutDelegate.measurePassDelegate;
            UsageByParent usageByParent = UsageByParent.NotUsed;
            measurePassDelegate.measuredByParent = usageByParent;
            LookaheadPassDelegate lookaheadPassDelegate = layoutNodeLayoutDelegate.lookaheadPassDelegate;
            if (lookaheadPassDelegate != null) {
                lookaheadPassDelegate.measuredByParent = usageByParent;
            }
        }
        LookaheadAlignmentLines lookaheadAlignmentLines2 = layoutNodeLayoutDelegate.measurePassDelegate.alignmentLines;
        lookaheadAlignmentLines2.dirty = true;
        lookaheadAlignmentLines2.usedDuringParentMeasurement = false;
        lookaheadAlignmentLines2.previousUsedDuringParentLayout = false;
        lookaheadAlignmentLines2.usedDuringParentLayout = false;
        lookaheadAlignmentLines2.usedByModifierMeasurement = false;
        lookaheadAlignmentLines2.usedByModifierLayout = false;
        lookaheadAlignmentLines2.queryOwner = null;
        LookaheadPassDelegate lookaheadPassDelegate2 = layoutNodeLayoutDelegate.lookaheadPassDelegate;
        if (lookaheadPassDelegate2 != null && (lookaheadAlignmentLines = lookaheadPassDelegate2.alignmentLines) != null) {
            lookaheadAlignmentLines.dirty = true;
            lookaheadAlignmentLines.usedDuringParentMeasurement = false;
            lookaheadAlignmentLines.previousUsedDuringParentLayout = false;
            lookaheadAlignmentLines.usedDuringParentLayout = false;
            lookaheadAlignmentLines.usedByModifierMeasurement = false;
            lookaheadAlignmentLines.usedByModifierLayout = false;
            lookaheadAlignmentLines.queryOwner = null;
        }
        NodeChain nodeChain = this.nodes;
        Modifier.Node node = (TailModifierNode) nodeChain.tail;
        NodeCoordinator nodeCoordinator = ((InnerNodeCoordinator) nodeChain.innerCoordinator).wrapped;
        for (NodeCoordinator nodeCoordinator2 = (NodeCoordinator) nodeChain.outerCoordinator; !Intrinsics.areEqual(nodeCoordinator2, nodeCoordinator) && nodeCoordinator2 != null; nodeCoordinator2 = nodeCoordinator2.wrapped) {
            nodeCoordinator2.releaseLayer();
            if (nodeCoordinator2.layoutNode.isPlaced()) {
                nodeCoordinator2.onUnplaced();
            }
        }
        AndroidViewHolder$layoutNode$1$4 androidViewHolder$layoutNode$1$4 = this.onDetach;
        if (androidViewHolder$layoutNode$1$4 != null) {
            androidViewHolder$layoutNode$1$4.invoke(owner);
        }
        for (Modifier.Node node2 = node; node2 != null; node2 = node2.getParent$ui()) {
            if (node2.isAttached()) {
                node2.runDetachLifecycle$ui();
            }
        }
        this.ignoreRemeasureRequests = true;
        MutableVector mutableVector = (MutableVector) this._foldedChildren.processor;
        Object[] objArr = mutableVector.content;
        int i = mutableVector.size;
        for (int i2 = 0; i2 < i; i2++) {
            ((LayoutNode) objArr[i2]).detach$ui();
        }
        this.ignoreRemeasureRequests = false;
        while (node != null) {
            if (node.isAttached()) {
                node.markAsDetached$ui();
            }
            node = node.getParent$ui();
        }
        AndroidComposeView androidComposeView = (AndroidComposeView) owner;
        androidComposeView.layoutNodes.remove(this.semanticsId);
        FileMetadata fileMetadata = androidComposeView.measureAndLayoutDelegate;
        GrpcMethod grpcMethod = (GrpcMethod) fileMetadata.size;
        ((MemoryCacheService) grpcMethod.path).remove(this);
        ((MemoryCacheService) grpcMethod.requestAdapter).remove(this);
        ((MemoryCacheService) grpcMethod.responseAdapter).remove(this);
        ((MutableVector) ((WorkLauncherImpl) fileMetadata.createdAtMillis).processor).remove(this);
        androidComposeView.observationClearRequested = true;
        AndroidAutofillManager androidAutofillManager = androidComposeView._autofillManager;
        if (androidAutofillManager != null && androidAutofillManager.currentlyDisplayedIDs.remove(this.semanticsId)) {
            androidAutofillManager.platformAutofillManager.notifyViewVisibilityChanged(androidAutofillManager.view, this.semanticsId, false);
        }
        androidComposeView.rectManager.remove(this);
        this.owner = null;
        setLookaheadRoot(null);
        this.depth = 0;
        MeasurePassDelegate measurePassDelegate2 = layoutNodeLayoutDelegate.measurePassDelegate;
        measurePassDelegate2.placeOrder = Integer.MAX_VALUE;
        measurePassDelegate2.previousPlaceOrder = Integer.MAX_VALUE;
        measurePassDelegate2.isPlaced = false;
        LookaheadPassDelegate lookaheadPassDelegate3 = layoutNodeLayoutDelegate.lookaheadPassDelegate;
        if (lookaheadPassDelegate3 != null) {
            lookaheadPassDelegate3.placeOrder = Integer.MAX_VALUE;
            lookaheadPassDelegate3.previousPlaceOrder = Integer.MAX_VALUE;
            lookaheadPassDelegate3._placedState = LookaheadPassDelegate.PlacedState.IsNotPlaced;
        }
        if (nodeChain.m889hasH91voCI$ui(8)) {
            SemanticsConfiguration semanticsConfiguration = this._semanticsConfiguration;
            this._semanticsConfiguration = null;
            this.isSemanticsInvalidated = false;
            androidComposeView.semanticsOwner.notifySemanticsChange$ui(this, semanticsConfiguration);
            androidComposeView.onSemanticsChange();
        }
    }

    public final void draw$ui(Canvas canvas, GraphicsLayer graphicsLayer) {
        try {
            ((NodeCoordinator) this.nodes.outerCoordinator).draw(canvas, graphicsLayer);
        } catch (Throwable th) {
            rethrowWithComposeStackTrace(th);
            throw null;
        }
    }

    public final void forceRemeasure() {
        if (this.lookaheadRoot != null) {
            requestLookaheadRemeasure$ui$default(this, false, 5);
        } else {
            requestRemeasure$ui$default(this, false, 5);
        }
        MeasurePassDelegate measurePassDelegate = this.layoutDelegate.measurePassDelegate;
        Constraints constraints = measurePassDelegate.measuredOnce ? new Constraints(measurePassDelegate.measurementConstraints) : null;
        Owner owner = this.owner;
        if (constraints != null) {
            if (owner != null) {
                ((AndroidComposeView) owner).m917measureAndLayout0kLqBqw(this, constraints.value);
            }
        } else if (owner != null) {
            ((AndroidComposeView) owner).measureAndLayout(true);
        }
    }

    public final List getChildLookaheadMeasurables$ui() {
        LookaheadPassDelegate lookaheadPassDelegate = this.layoutDelegate.lookaheadPassDelegate;
        lookaheadPassDelegate.getClass();
        MutableVector mutableVector = lookaheadPassDelegate._childDelegates;
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = lookaheadPassDelegate.layoutNodeLayoutDelegate;
        layoutNodeLayoutDelegate.layoutNode.getChildren$ui();
        if (!lookaheadPassDelegate.childDelegatesDirty) {
            return mutableVector.asMutableList();
        }
        LayoutNode layoutNode = layoutNodeLayoutDelegate.layoutNode;
        MutableVector mutableVector2 = layoutNode.get_children$ui();
        Object[] objArr = mutableVector2.content;
        int i = mutableVector2.size;
        for (int i2 = 0; i2 < i; i2++) {
            LayoutNode layoutNode2 = (LayoutNode) objArr[i2];
            if (mutableVector.size <= i2) {
                LookaheadPassDelegate lookaheadPassDelegate2 = layoutNode2.layoutDelegate.lookaheadPassDelegate;
                lookaheadPassDelegate2.getClass();
                mutableVector.add(lookaheadPassDelegate2);
            } else {
                LookaheadPassDelegate lookaheadPassDelegate3 = layoutNode2.layoutDelegate.lookaheadPassDelegate;
                lookaheadPassDelegate3.getClass();
                Object[] objArr2 = mutableVector.content;
                Object obj = objArr2[i2];
                objArr2[i2] = lookaheadPassDelegate3;
            }
        }
        mutableVector.removeRange(((MutableVector.MutableVectorList) layoutNode.getChildren$ui()).vector.size, mutableVector.size);
        lookaheadPassDelegate.childDelegatesDirty = false;
        return mutableVector.asMutableList();
    }

    public final List getChildMeasurables$ui() {
        return this.layoutDelegate.measurePassDelegate.getChildDelegates$ui();
    }

    public final List getChildren$ui() {
        return get_children$ui().asMutableList();
    }

    public final List getFoldedChildren$ui() {
        return ((MutableVector) this._foldedChildren.processor).asMutableList();
    }

    public final int getHeight() {
        return this.layoutDelegate.measurePassDelegate.height;
    }

    public final boolean getLayoutPending$ui() {
        return this.layoutDelegate.measurePassDelegate.layoutPending;
    }

    public final boolean getMeasurePending$ui() {
        return this.layoutDelegate.measurePassDelegate.measurePending;
    }

    public final UsageByParent getMeasuredByParent$ui() {
        return this.layoutDelegate.measurePassDelegate.measuredByParent;
    }

    public final UsageByParent getMeasuredByParentInLookahead$ui() {
        UsageByParent usageByParent;
        LookaheadPassDelegate lookaheadPassDelegate = this.layoutDelegate.lookaheadPassDelegate;
        return (lookaheadPassDelegate == null || (usageByParent = lookaheadPassDelegate.measuredByParent) == null) ? UsageByParent.NotUsed : usageByParent;
    }

    public final WorkLauncherImpl getOrCreateIntrinsicsPolicy() {
        WorkLauncherImpl workLauncherImpl = this.intrinsicsPolicy;
        if (workLauncherImpl != null) {
            return workLauncherImpl;
        }
        WorkLauncherImpl workLauncherImpl2 = new WorkLauncherImpl(this, this.measurePolicy);
        this.intrinsicsPolicy = workLauncherImpl2;
        return workLauncherImpl2;
    }

    public final LayoutNode getParent$ui() {
        LayoutNode layoutNode = this._foldedParent;
        while (layoutNode != null && layoutNode.isVirtual) {
            layoutNode = layoutNode._foldedParent;
        }
        return layoutNode;
    }

    public final int getPlaceOrder$ui() {
        return this.layoutDelegate.measurePassDelegate.placeOrder;
    }

    public final SemanticsConfiguration getSemanticsConfiguration() {
        if (isAttached() && !this.isDeactivated && this.nodes.m889hasH91voCI$ui(8)) {
            return this._semanticsConfiguration;
        }
        return null;
    }

    public final int getWidth() {
        return this.layoutDelegate.measurePassDelegate.width;
    }

    public final MutableVector getZSortedChildren() {
        boolean z = this.zSortedChildrenInvalidated;
        MutableVector mutableVector = this._zSortedChildren;
        if (z) {
            mutableVector.clear();
            mutableVector.addAll(mutableVector.size, get_children$ui());
            Arrays.sort(mutableVector.content, 0, mutableVector.size, ZComparator);
            this.zSortedChildrenInvalidated = false;
        }
        return mutableVector;
    }

    public final MutableVector get_children$ui() {
        updateChildrenIfDirty$ui();
        if (this.virtualChildrenCount == 0) {
            return (MutableVector) this._foldedChildren.processor;
        }
        MutableVector mutableVector = this._unfoldedChildren;
        mutableVector.getClass();
        return mutableVector;
    }

    /* renamed from: hitTest-6fMxITs$ui, reason: not valid java name */
    public final void m872hitTest6fMxITs$ui(long j, HitTestResult hitTestResult, int i, boolean z) {
        NodeChain nodeChain = this.nodes;
        NodeCoordinator nodeCoordinator = (NodeCoordinator) nodeChain.outerCoordinator;
        ReusableGraphicsLayerScope reusableGraphicsLayerScope = NodeCoordinator.graphicsLayerScope;
        ((NodeCoordinator) nodeChain.outerCoordinator).m898hitTestqzLsGqo(NodeCoordinator.PointerInputSource, nodeCoordinator.m893fromParentPosition8S9VItk(j, true), hitTestResult, i, z);
    }

    public final void insertAt$ui(int i, LayoutNode layoutNode) {
        if (layoutNode._foldedParent != null && layoutNode.owner != null) {
            InlineClassHelperKt.throwIllegalStateException(exceptionMessageForParentingOrOwnership(layoutNode));
        }
        layoutNode._foldedParent = this;
        WorkLauncherImpl workLauncherImpl = this._foldedChildren;
        ((MutableVector) workLauncherImpl.processor).add(i, layoutNode);
        ((ContourLayout$geometry$1) workLauncherImpl.workTaskExecutor).invoke();
        onZSortedChildrenInvalidated$ui();
        if (layoutNode.isVirtual) {
            this.virtualChildrenCount++;
        }
        invalidateUnfoldedVirtualChildren();
        Owner owner = this.owner;
        if (owner != null) {
            layoutNode.attach$ui(owner);
        }
        if (layoutNode.layoutDelegate.childrenAccessingCoordinatesDuringPlacement > 0) {
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.layoutDelegate;
            layoutNodeLayoutDelegate.setChildrenAccessingCoordinatesDuringPlacement(layoutNodeLayoutDelegate.childrenAccessingCoordinatesDuringPlacement + 1);
        }
        if (layoutNode.globallyPositionedObservers > 0) {
            setGloballyPositionedObservers(this.globallyPositionedObservers + 1);
        }
    }

    public final void invalidateLayer$ui() {
        if (this.innerLayerCoordinatorIsDirty) {
            NodeChain nodeChain = this.nodes;
            NodeCoordinator nodeCoordinator = (InnerNodeCoordinator) nodeChain.innerCoordinator;
            NodeCoordinator nodeCoordinator2 = ((NodeCoordinator) nodeChain.outerCoordinator).wrappedBy;
            this._innerLayerCoordinator = null;
            while (true) {
                if (Intrinsics.areEqual(nodeCoordinator, nodeCoordinator2)) {
                    break;
                }
                if ((nodeCoordinator != null ? nodeCoordinator.layer : null) != null) {
                    this._innerLayerCoordinator = nodeCoordinator;
                    break;
                }
                nodeCoordinator = nodeCoordinator != null ? nodeCoordinator.wrappedBy : null;
            }
            this.innerLayerCoordinatorIsDirty = false;
        }
        NodeCoordinator nodeCoordinator3 = this._innerLayerCoordinator;
        if (nodeCoordinator3 != null && nodeCoordinator3.layer == null) {
            throw Boxes$$ExternalSyntheticOutline1.m1150m("layer was not set. This error is usually caused by operating off of the UI thread. Did you call invalidate() instead of postInvalidate()?");
        }
        if (nodeCoordinator3 != null) {
            nodeCoordinator3.invalidateLayer();
            return;
        }
        LayoutNode parent$ui = getParent$ui();
        if (parent$ui != null) {
            parent$ui.invalidateLayer$ui();
            return;
        }
        Owner owner = this.owner;
        if (owner != null) {
            ((AndroidComposeView) owner).invalidate();
        }
    }

    public final void invalidateLayers$ui() {
        NodeChain nodeChain = this.nodes;
        NodeCoordinator nodeCoordinator = (NodeCoordinator) nodeChain.outerCoordinator;
        InnerNodeCoordinator innerNodeCoordinator = (InnerNodeCoordinator) nodeChain.innerCoordinator;
        while (nodeCoordinator != innerNodeCoordinator) {
            nodeCoordinator.getClass();
            LayoutModifierNodeCoordinator layoutModifierNodeCoordinator = (LayoutModifierNodeCoordinator) nodeCoordinator;
            OwnedLayer ownedLayer = layoutModifierNodeCoordinator.layer;
            if (ownedLayer != null) {
                ((GraphicsLayerOwnerLayer) ownedLayer).invalidate();
            }
            nodeCoordinator = layoutModifierNodeCoordinator.wrapped;
        }
        OwnedLayer ownedLayer2 = ((InnerNodeCoordinator) nodeChain.innerCoordinator).layer;
        if (ownedLayer2 != null) {
            ((GraphicsLayerOwnerLayer) ownedLayer2).invalidate();
        }
    }

    public final void invalidateMeasurements$ui() {
        if (this.isVirtual) {
            LayoutNode parent$ui = getParent$ui();
            if (parent$ui != null) {
                parent$ui.invalidateMeasurements$ui();
                return;
            }
            return;
        }
        if (this.lookaheadRoot != null) {
            requestLookaheadRemeasure$ui$default(this, false, 7);
        } else {
            requestRemeasure$ui$default(this, false, 7);
        }
    }

    public final void invalidateSemantics$ui() {
        if (this.isCurrentlyCalculatingSemanticsConfiguration) {
            return;
        }
        if (((NodeChain$sentinelHead$1) this.nodes.sentinelHead).getChild$ui() != null || this.pendingModifier != null) {
            this.isSemanticsInvalidated = true;
            return;
        }
        SemanticsConfiguration semanticsConfiguration = this._semanticsConfiguration;
        this.isCurrentlyCalculatingSemanticsConfiguration = true;
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = new SemanticsConfiguration();
        ImageLoader$Builder imageLoader$Builder = ((AndroidComposeView) LayoutNodeKt.requireOwner(this)).snapshotObserver;
        Datadog$getInstance$1$1 datadog$getInstance$1$1 = new Datadog$getInstance$1$1(2, this, ref$ObjectRef);
        ((SnapshotStateObserver) imageLoader$Builder.application).observeReads(this, (OwnerSnapshotObserver$onCommitAffectingLayout$1) imageLoader$Builder.memoryCacheLazy, datadog$getInstance$1$1);
        this.isCurrentlyCalculatingSemanticsConfiguration = false;
        this._semanticsConfiguration = (SemanticsConfiguration) ref$ObjectRef.element;
        this.isSemanticsInvalidated = false;
        AndroidComposeView androidComposeView = (AndroidComposeView) LayoutNodeKt.requireOwner(this);
        androidComposeView.semanticsOwner.notifySemanticsChange$ui(this, semanticsConfiguration);
        androidComposeView.onSemanticsChange();
    }

    public final void invalidateUnfoldedVirtualChildren() {
        LayoutNode layoutNode;
        if (this.virtualChildrenCount > 0) {
            this.unfoldedVirtualChildrenListDirty = true;
        }
        if (!this.isVirtual || (layoutNode = this._foldedParent) == null) {
            return;
        }
        layoutNode.invalidateUnfoldedVirtualChildren();
    }

    public final boolean isAttached() {
        return this.owner != null;
    }

    public final boolean isPlaced() {
        return this.layoutDelegate.measurePassDelegate.isPlaced;
    }

    public final Boolean isPlacedInLookahead() {
        LookaheadPassDelegate lookaheadPassDelegate = this.layoutDelegate.lookaheadPassDelegate;
        if (lookaheadPassDelegate != null) {
            return Boolean.valueOf(lookaheadPassDelegate._placedState != LookaheadPassDelegate.PlacedState.IsNotPlaced);
        }
        return null;
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public final boolean isValidOwnerScope() {
        return isAttached();
    }

    public final void lookaheadReplace$ui() {
        LayoutNode parent$ui;
        if (this.intrinsicsUsageByParent == UsageByParent.NotUsed) {
            clearSubtreePlacementIntrinsicsUsage();
        }
        LookaheadPassDelegate lookaheadPassDelegate = this.layoutDelegate.lookaheadPassDelegate;
        lookaheadPassDelegate.getClass();
        boolean z = true;
        try {
            lookaheadPassDelegate.relayoutWithoutParentInProgress = true;
            if (!lookaheadPassDelegate.placedOnce) {
                InlineClassHelperKt.throwIllegalStateException("replace() called on item that was not placed");
            }
            lookaheadPassDelegate.onNodePlacedCalled = false;
            if (lookaheadPassDelegate._placedState == LookaheadPassDelegate.PlacedState.IsNotPlaced) {
                z = false;
            }
            lookaheadPassDelegate.m883placeSelfMLgxB_4$1(lookaheadPassDelegate.lastPosition, lookaheadPassDelegate.lastExplicitLayer, lookaheadPassDelegate.lastLayerBlock);
            if (z && !lookaheadPassDelegate.onNodePlacedCalled && (parent$ui = lookaheadPassDelegate.layoutNodeLayoutDelegate.layoutNode.getParent$ui()) != null) {
                parent$ui.requestLookaheadRelayout$ui(false);
            }
            lookaheadPassDelegate.relayoutWithoutParentInProgress = false;
        } catch (Throwable th) {
            lookaheadPassDelegate.relayoutWithoutParentInProgress = false;
            throw th;
        }
    }

    public final void move$ui(int i, int i2, int i3) {
        if (i == i2) {
            return;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = i > i2 ? i + i4 : i;
            int i6 = i > i2 ? i2 + i4 : (i2 + i3) - 2;
            WorkLauncherImpl workLauncherImpl = this._foldedChildren;
            MutableVector mutableVector = (MutableVector) workLauncherImpl.processor;
            ContourLayout$geometry$1 contourLayout$geometry$1 = (ContourLayout$geometry$1) workLauncherImpl.workTaskExecutor;
            Object removeAt = mutableVector.removeAt(i5);
            contourLayout$geometry$1.invoke();
            ((MutableVector) workLauncherImpl.processor).add(i6, (LayoutNode) removeAt);
            contourLayout$geometry$1.invoke();
        }
        onZSortedChildrenInvalidated$ui();
        invalidateUnfoldedVirtualChildren();
        invalidateMeasurements$ui();
    }

    public final void onChildRemoved(LayoutNode layoutNode) {
        if (layoutNode.layoutDelegate.childrenAccessingCoordinatesDuringPlacement > 0) {
            this.layoutDelegate.setChildrenAccessingCoordinatesDuringPlacement(r0.childrenAccessingCoordinatesDuringPlacement - 1);
        }
        if (this.owner != null) {
            layoutNode.detach$ui();
        }
        layoutNode._foldedParent = null;
        if (layoutNode.globallyPositionedObservers > 0) {
            setGloballyPositionedObservers(this.globallyPositionedObservers - 1);
        }
        ((NodeCoordinator) layoutNode.nodes.outerCoordinator).wrappedBy = null;
        if (layoutNode.isVirtual) {
            this.virtualChildrenCount--;
            MutableVector mutableVector = (MutableVector) layoutNode._foldedChildren.processor;
            Object[] objArr = mutableVector.content;
            int i = mutableVector.size;
            for (int i2 = 0; i2 < i; i2++) {
                ((NodeCoordinator) ((LayoutNode) objArr[i2]).nodes.outerCoordinator).wrappedBy = null;
            }
        }
        invalidateUnfoldedVirtualChildren();
        onZSortedChildrenInvalidated$ui();
    }

    public final void onCoordinatorRectChanged$ui(NodeCoordinator nodeCoordinator) {
        Owner owner = this.owner;
        RectManager rectManager = owner != null ? ((AndroidComposeView) owner).rectManager : null;
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.layoutDelegate;
        int i = 0;
        boolean z = layoutNodeLayoutDelegate.layoutState != LayoutState.Idle || getMeasurePending$ui() || getLayoutPending$ui();
        if (this.addedToRectList && rectManager != null) {
            if (nodeCoordinator == ((NodeCoordinator) this.nodes.outerCoordinator)) {
                this.rectInParentDirty = true;
                if (!z) {
                    rectManager.recalculateRectIfDirty(this);
                }
            } else {
                this.outerToInnerOffsetDirty = true;
                MutableVector mutableVector = get_children$ui();
                Object[] objArr = mutableVector.content;
                int i2 = mutableVector.size;
                for (int i3 = 0; i3 < i2; i3++) {
                    LayoutNode layoutNode = (LayoutNode) objArr[i3];
                    layoutNode.rectInParentDirty = true;
                    if (!z) {
                        rectManager.recalculateRectIfDirty(layoutNode);
                    }
                }
                if (this.addedToRectList) {
                    rectManager.isDirty = true;
                    StatusLine statusLine = rectManager.rects;
                    int i4 = this.semanticsId & 33554431;
                    long[] jArr = (long[]) statusLine.protocol;
                    int i5 = statusLine.code;
                    while (true) {
                        if (i >= jArr.length - 2 || i >= i5) {
                            break;
                        }
                        int i6 = i + 2;
                        long j = jArr[i6];
                        if ((((int) j) & 33554431) == i4) {
                            jArr[i6] = (((j >> 63) & 1) << 60) | j;
                            break;
                        }
                        i += 3;
                    }
                }
                rectManager.scheduleDebounceCallback();
            }
        }
        layoutNodeLayoutDelegate.measurePassDelegate.requestLayoutIfCoordinatesAreUsedAndNotifyChildren();
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public final void onDeactivate() {
        AndroidAutofillManager androidAutofillManager;
        ViewFactoryHolder viewFactoryHolder = this.interopViewFactoryHolder;
        if (viewFactoryHolder != null) {
            viewFactoryHolder.onDeactivate();
        }
        LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = this.subcompositionsState;
        if (layoutNodeSubcompositionsState != null) {
            layoutNodeSubcompositionsState.onDeactivate();
        }
        this.isDeactivated = true;
        Modifier.Node node = (TailModifierNode) this.nodes.tail;
        for (Modifier.Node node2 = node; node2 != null; node2 = node2.getParent$ui()) {
            if (node2.isAttached()) {
                node2.reset$ui();
            }
        }
        for (Modifier.Node node3 = node; node3 != null; node3 = node3.getParent$ui()) {
            if (node3.isAttached()) {
                node3.runDetachLifecycle$ui();
            }
        }
        while (node != null) {
            if (node.isAttached()) {
                node.markAsDetached$ui();
            }
            node = node.getParent$ui();
        }
        if (isAttached()) {
            this._semanticsConfiguration = null;
            this.isSemanticsInvalidated = false;
        }
        Owner owner = this.owner;
        if (owner == null || (androidAutofillManager = ((AndroidComposeView) owner)._autofillManager) == null || !androidAutofillManager.currentlyDisplayedIDs.remove(this.semanticsId)) {
            return;
        }
        androidAutofillManager.platformAutofillManager.notifyViewVisibilityChanged(androidAutofillManager.view, this.semanticsId, false);
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public final void onRelease() {
        ViewFactoryHolder viewFactoryHolder = this.interopViewFactoryHolder;
        if (viewFactoryHolder != null) {
            viewFactoryHolder.onRelease();
        }
        LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = this.subcompositionsState;
        if (layoutNodeSubcompositionsState != null) {
            layoutNodeSubcompositionsState.onRelease();
        }
        NodeChain nodeChain = this.nodes;
        NodeCoordinator nodeCoordinator = ((InnerNodeCoordinator) nodeChain.innerCoordinator).wrapped;
        for (NodeCoordinator nodeCoordinator2 = (NodeCoordinator) nodeChain.outerCoordinator; !Intrinsics.areEqual(nodeCoordinator2, nodeCoordinator) && nodeCoordinator2 != null; nodeCoordinator2 = nodeCoordinator2.wrapped) {
            nodeCoordinator2.onRelease();
        }
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public final void onReuse() {
        RectManager rectManager;
        AndroidAutofillManager androidAutofillManager;
        RectManager rectManager2;
        if (!isAttached()) {
            InlineClassHelperKt.throwIllegalArgumentException("onReuse is only expected on attached node");
        }
        ViewFactoryHolder viewFactoryHolder = this.interopViewFactoryHolder;
        if (viewFactoryHolder != null) {
            viewFactoryHolder.onReuse();
        }
        LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = this.subcompositionsState;
        if (layoutNodeSubcompositionsState != null) {
            layoutNodeSubcompositionsState.onReuse();
        }
        this.isCurrentlyCalculatingSemanticsConfiguration = false;
        boolean z = this.isDeactivated;
        NodeChain nodeChain = this.nodes;
        if (z) {
            this.isDeactivated = false;
        } else {
            Modifier.Node node = (TailModifierNode) nodeChain.tail;
            for (Modifier.Node node2 = node; node2 != null; node2 = node2.getParent$ui()) {
                if (node2.isAttached()) {
                    node2.reset$ui();
                }
            }
            for (Modifier.Node node3 = node; node3 != null; node3 = node3.getParent$ui()) {
                if (node3.isAttached()) {
                    node3.runDetachLifecycle$ui();
                }
            }
            while (node != null) {
                if (node.isAttached()) {
                    node.markAsDetached$ui();
                }
                node = node.getParent$ui();
            }
        }
        int i = this.semanticsId;
        Owner owner = this.owner;
        if (owner != null && (rectManager2 = ((AndroidComposeView) owner).rectManager) != null) {
            rectManager2.remove(this);
        }
        this.semanticsId = SemanticsModifierKt.lastIdentifier.addAndGet(1);
        Owner owner2 = this.owner;
        if (owner2 != null) {
            MutableIntObjectMap mutableIntObjectMap = ((AndroidComposeView) owner2).layoutNodes;
            mutableIntObjectMap.remove(i);
            mutableIntObjectMap.set(this.semanticsId, this);
        }
        for (Modifier.Node node4 = (Modifier.Node) nodeChain.head; node4 != null; node4 = node4.getChild$ui()) {
            node4.markAsAttached$ui();
        }
        nodeChain.runAttachLifecycle();
        if (nodeChain.m889hasH91voCI$ui(8)) {
            invalidateSemantics$ui();
        }
        rescheduleRemeasureOrRelayout$ui(this);
        Owner owner3 = this.owner;
        if (owner3 != null && (androidAutofillManager = ((AndroidComposeView) owner3)._autofillManager) != null) {
            AndroidComposeView androidComposeView = androidAutofillManager.view;
            MemoryCacheService memoryCacheService = androidAutofillManager.platformAutofillManager;
            MutableIntSet mutableIntSet = androidAutofillManager.currentlyDisplayedIDs;
            if (mutableIntSet.remove(i)) {
                memoryCacheService.notifyViewVisibilityChanged(androidComposeView, i, false);
            }
            SemanticsConfiguration semanticsConfiguration = getSemanticsConfiguration();
            if (semanticsConfiguration != null && semanticsConfiguration.props.contains(SemanticsProperties.ContentType)) {
                mutableIntSet.add(this.semanticsId);
                memoryCacheService.notifyViewVisibilityChanged(androidComposeView, this.semanticsId, true);
            }
        }
        Owner owner4 = this.owner;
        if (owner4 == null || (rectManager = ((AndroidComposeView) owner4).rectManager) == null) {
            return;
        }
        rectManager.recalculateRectIfDirty(this);
    }

    public final void onZSortedChildrenInvalidated$ui() {
        if (!this.isVirtual) {
            this.zSortedChildrenInvalidated = true;
            return;
        }
        LayoutNode parent$ui = getParent$ui();
        if (parent$ui != null) {
            parent$ui.onZSortedChildrenInvalidated$ui();
        }
    }

    public final void removeAll$ui() {
        WorkLauncherImpl workLauncherImpl = this._foldedChildren;
        int i = ((MutableVector) workLauncherImpl.processor).size;
        while (true) {
            i--;
            MutableVector mutableVector = (MutableVector) workLauncherImpl.processor;
            if (-1 >= i) {
                mutableVector.clear();
                ((ContourLayout$geometry$1) workLauncherImpl.workTaskExecutor).invoke();
                return;
            }
            onChildRemoved((LayoutNode) mutableVector.content[i]);
        }
    }

    public final void removeAt$ui(int i, int i2) {
        if (i2 < 0) {
            InlineClassHelperKt.throwIllegalArgumentException("count (" + i2 + ") must be greater than 0");
        }
        int i3 = (i2 + i) - 1;
        if (i > i3) {
            return;
        }
        while (true) {
            WorkLauncherImpl workLauncherImpl = this._foldedChildren;
            onChildRemoved((LayoutNode) ((MutableVector) workLauncherImpl.processor).content[i3]);
            Object removeAt = ((MutableVector) workLauncherImpl.processor).removeAt(i3);
            ((ContourLayout$geometry$1) workLauncherImpl.workTaskExecutor).invoke();
            if (i3 == i) {
                return;
            } else {
                i3--;
            }
        }
    }

    public final void replace$ui() {
        LayoutNode parent$ui;
        if (this.intrinsicsUsageByParent == UsageByParent.NotUsed) {
            clearSubtreePlacementIntrinsicsUsage();
        }
        MeasurePassDelegate measurePassDelegate = this.layoutDelegate.measurePassDelegate;
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = measurePassDelegate.layoutNodeLayoutDelegate;
        try {
            measurePassDelegate.relayoutWithoutParentInProgress = true;
            if (!measurePassDelegate.placedOnce) {
                InlineClassHelperKt.throwIllegalStateException("replace called on unplaced item");
            }
            boolean z = measurePassDelegate.isPlaced;
            measurePassDelegate.m885placeOuterCoordinatorMLgxB_4(measurePassDelegate.lastPosition, measurePassDelegate.lastZIndex, measurePassDelegate.lastLayerBlock, measurePassDelegate.lastExplicitLayer);
            if (z && !measurePassDelegate.onNodePlacedCalled && (parent$ui = layoutNodeLayoutDelegate.layoutNode.getParent$ui()) != null) {
                parent$ui.requestRelayout$ui(false);
            }
        } finally {
        }
    }

    public final void requestLookaheadRelayout$ui(boolean z) {
        Owner owner;
        if (this.isVirtual || (owner = this.owner) == null) {
            return;
        }
        ((AndroidComposeView) owner).onRequestRelayout(this, true, z);
    }

    public final void requestRelayout$ui(boolean z) {
        Owner owner;
        if (this.isVirtual || (owner = this.owner) == null) {
            return;
        }
        ((AndroidComposeView) owner).onRequestRelayout(this, false, z);
    }

    public final void resetSubtreeIntrinsicsUsage$ui() {
        MutableVector mutableVector = get_children$ui();
        Object[] objArr = mutableVector.content;
        int i = mutableVector.size;
        for (int i2 = 0; i2 < i; i2++) {
            LayoutNode layoutNode = (LayoutNode) objArr[i2];
            UsageByParent usageByParent = layoutNode.previousIntrinsicsUsageByParent;
            layoutNode.intrinsicsUsageByParent = usageByParent;
            if (usageByParent != UsageByParent.NotUsed) {
                layoutNode.resetSubtreeIntrinsicsUsage$ui();
            }
        }
    }

    public final void rethrowWithComposeStackTrace(Throwable th) {
        CompositionLocalMap compositionLocalMap = this.compositionLocalMap;
        StaticProvidableCompositionLocal localCompositionErrorContext = CompositionErrorContextKt.getLocalCompositionErrorContext();
        PersistentCompositionLocalHashMap persistentCompositionLocalHashMap = (PersistentCompositionLocalHashMap) compositionLocalMap;
        persistentCompositionLocalHashMap.getClass();
        CompositionErrorContext compositionErrorContext = (CompositionErrorContext) Updater.read(persistentCompositionLocalHashMap, localCompositionErrorContext);
        if (compositionErrorContext == null) {
            throw th;
        }
        SourceInformationKt.tryAttachComposeStackTrace(th, new DialogHostKt$$ExternalSyntheticLambda0(24, (CompositionErrorContextImpl) compositionErrorContext, this));
        throw th;
    }

    public final void setDensity(Density density) {
        if (Intrinsics.areEqual(this.density, density)) {
            return;
        }
        this.density = density;
        invalidateMeasurements$ui();
        LayoutNode parent$ui = getParent$ui();
        if (parent$ui != null) {
            parent$ui.invalidateLayer$ui();
        } else {
            Owner owner = this.owner;
            if (owner != null) {
                ((AndroidComposeView) owner).invalidate();
            }
        }
        invalidateLayers$ui();
        for (Modifier.Node node = (Modifier.Node) this.nodes.head; node != null; node = node.getChild$ui()) {
            node.onDensityChange();
        }
    }

    public final void setGloballyPositionedObservers(int i) {
        LayoutNode parent$ui;
        LayoutNode parent$ui2;
        int i2 = this.globallyPositionedObservers;
        if (i2 != i) {
            if (i > 0 && i2 == 0 && (parent$ui2 = getParent$ui()) != null) {
                parent$ui2.setGloballyPositionedObservers(parent$ui2.globallyPositionedObservers + 1);
            }
            if (i == 0 && this.globallyPositionedObservers > 0 && (parent$ui = getParent$ui()) != null) {
                parent$ui.setGloballyPositionedObservers(parent$ui.globallyPositionedObservers - 1);
            }
            this.globallyPositionedObservers = i;
        }
    }

    public final void setLookaheadRoot(LayoutNode layoutNode) {
        if (Intrinsics.areEqual(layoutNode, this.lookaheadRoot)) {
            return;
        }
        this.lookaheadRoot = layoutNode;
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.layoutDelegate;
        if (layoutNode != null) {
            if (layoutNodeLayoutDelegate.lookaheadPassDelegate == null) {
                layoutNodeLayoutDelegate.lookaheadPassDelegate = new LookaheadPassDelegate(layoutNodeLayoutDelegate);
            }
            NodeChain nodeChain = this.nodes;
            NodeCoordinator nodeCoordinator = ((InnerNodeCoordinator) nodeChain.innerCoordinator).wrapped;
            for (NodeCoordinator nodeCoordinator2 = (NodeCoordinator) nodeChain.outerCoordinator; !Intrinsics.areEqual(nodeCoordinator2, nodeCoordinator) && nodeCoordinator2 != null; nodeCoordinator2 = nodeCoordinator2.wrapped) {
                nodeCoordinator2.ensureLookaheadDelegateCreated();
            }
        } else {
            layoutNodeLayoutDelegate.lookaheadPassDelegate = null;
            layoutNodeLayoutDelegate.lookaheadLayoutPending = false;
            layoutNodeLayoutDelegate.lookaheadMeasurePending = false;
        }
        invalidateMeasurements$ui();
    }

    public final void setMeasurePolicy(MeasurePolicy measurePolicy) {
        if (Intrinsics.areEqual(this.measurePolicy, measurePolicy)) {
            return;
        }
        this.measurePolicy = measurePolicy;
        WorkLauncherImpl workLauncherImpl = this.intrinsicsPolicy;
        if (workLauncherImpl != null) {
            ((ParcelableSnapshotMutableState) workLauncherImpl.workTaskExecutor).setValue(measurePolicy);
        }
        invalidateMeasurements$ui();
    }

    public final void setModifier(Modifier modifier) {
        if (this.isVirtual && this._modifier != Modifier.Companion.$$INSTANCE) {
            InlineClassHelperKt.throwIllegalArgumentException("Modifiers are not supported on virtual LayoutNodes");
        }
        if (this.isDeactivated) {
            InlineClassHelperKt.throwIllegalArgumentException("modifier is updated when deactivated");
        }
        if (!isAttached()) {
            this.pendingModifier = modifier;
            return;
        }
        applyModifier(modifier);
        if (this.isSemanticsInvalidated) {
            invalidateSemantics$ui();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    public final void setViewConfiguration(ViewConfiguration viewConfiguration) {
        if (Intrinsics.areEqual(this.viewConfiguration, viewConfiguration)) {
            return;
        }
        this.viewConfiguration = viewConfiguration;
        NodeChain nodeChain = this.nodes;
        if ((((Modifier.Node) nodeChain.head).getAggregateChildKindSet$ui() & 16) != 0) {
            for (Modifier.Node node = (Modifier.Node) nodeChain.head; node != null; node = node.getChild$ui()) {
                if ((node.getKindSet$ui() & 16) != 0) {
                    DelegatingNode delegatingNode = node;
                    ?? r2 = 0;
                    while (delegatingNode != 0) {
                        if (delegatingNode instanceof PointerInputModifierNode) {
                            ((PointerInputModifierNode) delegatingNode).onViewConfigurationChange();
                        } else if ((delegatingNode.getKindSet$ui() & 16) != 0 && (delegatingNode instanceof DelegatingNode)) {
                            Modifier.Node node2 = delegatingNode.delegate;
                            int i = 0;
                            delegatingNode = delegatingNode;
                            r2 = r2;
                            while (node2 != null) {
                                if ((node2.getKindSet$ui() & 16) != 0) {
                                    i++;
                                    r2 = r2;
                                    if (i == 1) {
                                        delegatingNode = node2;
                                    } else {
                                        if (r2 == 0) {
                                            r2 = new MutableVector(0, new Modifier.Node[16]);
                                        }
                                        if (delegatingNode != 0) {
                                            r2.add(delegatingNode);
                                            delegatingNode = 0;
                                        }
                                        r2.add(node2);
                                    }
                                }
                                node2 = node2.getChild$ui();
                                delegatingNode = delegatingNode;
                                r2 = r2;
                            }
                            if (i == 1) {
                            }
                        }
                        delegatingNode = DepthSortedSetKt.access$pop(r2);
                    }
                }
                if ((node.getAggregateChildKindSet$ui() & 16) == 0) {
                    return;
                }
            }
        }
    }

    public final String toString() {
        return JvmActuals_jvmKt.simpleIdentityToString(this) + " children: " + ((MutableVector.MutableVectorList) getChildren$ui()).vector.size + " measurePolicy: " + this.measurePolicy + " deactivated: " + this.isDeactivated;
    }

    public final void updateChildrenIfDirty$ui() {
        if (this.virtualChildrenCount <= 0 || !this.unfoldedVirtualChildrenListDirty) {
            return;
        }
        this.unfoldedVirtualChildrenListDirty = false;
        MutableVector mutableVector = this._unfoldedChildren;
        if (mutableVector == null) {
            mutableVector = new MutableVector(0, new LayoutNode[16]);
            this._unfoldedChildren = mutableVector;
        }
        mutableVector.clear();
        MutableVector mutableVector2 = (MutableVector) this._foldedChildren.processor;
        Object[] objArr = mutableVector2.content;
        int i = mutableVector2.size;
        for (int i2 = 0; i2 < i; i2++) {
            LayoutNode layoutNode = (LayoutNode) objArr[i2];
            if (layoutNode.isVirtual) {
                mutableVector.addAll(mutableVector.size, layoutNode.get_children$ui());
            } else {
                mutableVector.add(layoutNode);
            }
        }
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.layoutDelegate;
        layoutNodeLayoutDelegate.measurePassDelegate.childDelegatesDirty = true;
        LookaheadPassDelegate lookaheadPassDelegate = layoutNodeLayoutDelegate.lookaheadPassDelegate;
        if (lookaheadPassDelegate != null) {
            lookaheadPassDelegate.childDelegatesDirty = true;
        }
    }

    public LayoutNode(int i) {
        this((i & 1) == 0, SemanticsModifierKt.lastIdentifier.addAndGet(1));
    }
}
