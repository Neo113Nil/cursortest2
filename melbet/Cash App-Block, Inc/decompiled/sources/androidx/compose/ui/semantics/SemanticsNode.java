package androidx.compose.ui.semantics;

import androidx.collection.MutableScatterMap;
import androidx.compose.animation.BoundsAnimation$animate$1;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.ValueInsets;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.node.InnerNodeCoordinator;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.glance.ImageKt$Image$finalModifier$1$1;
import androidx.tracing.Trace;
import com.airbnb.lottie.utils.Utils;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class SemanticsNode {
    public SemanticsNode fakeNodeParent;
    public final int id;
    public final LayoutNode layoutNode;
    public final boolean mergingEnabled;
    public final Modifier.Node outerSemanticsNode;
    public final SemanticsConfiguration unmergedConfig;

    public SemanticsNode(Modifier.Node node, boolean z, LayoutNode layoutNode, SemanticsConfiguration semanticsConfiguration) {
        this.outerSemanticsNode = node;
        this.mergingEnabled = z;
        this.layoutNode = layoutNode;
        this.unmergedConfig = semanticsConfiguration;
        this.id = layoutNode.semanticsId;
    }

    public static /* synthetic */ List getChildren$ui$default(SemanticsNode semanticsNode, boolean z, int i) {
        boolean z2 = (i & 1) != 0 ? !semanticsNode.mergingEnabled : false;
        boolean z3 = (i & 2) == 0;
        if ((i & 4) != 0) {
            z = false;
        }
        return semanticsNode.getChildren$ui(z2, z3, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final Rect boundsInImportantForBoundsAncestor(NodeCoordinator nodeCoordinator) {
        DelegatingNode delegatingNode;
        SemanticsNode parent = getParent();
        if (parent == null) {
            return Rect.Zero;
        }
        NodeChain nodeChain = parent.layoutNode.nodes;
        if ((((Modifier.Node) nodeChain.head).getAggregateChildKindSet$ui() & 8) != 0) {
            loop0: for (Modifier.Node node = (Modifier.Node) nodeChain.head; node != null; node = node.getChild$ui()) {
                if ((node.getKindSet$ui() & 8) != 0) {
                    delegatingNode = node;
                    ?? r5 = 0;
                    while (delegatingNode != 0) {
                        if (delegatingNode instanceof SemanticsModifierNode) {
                            if (delegatingNode.isImportantForBounds()) {
                                break loop0;
                            }
                        } else if ((delegatingNode.getKindSet$ui() & 8) != 0 && (delegatingNode instanceof DelegatingNode)) {
                            Modifier.Node node2 = delegatingNode.delegate;
                            int i = 0;
                            delegatingNode = delegatingNode;
                            r5 = r5;
                            while (node2 != null) {
                                if ((node2.getKindSet$ui() & 8) != 0) {
                                    i++;
                                    r5 = r5;
                                    if (i == 1) {
                                        delegatingNode = node2;
                                    } else {
                                        if (r5 == 0) {
                                            r5 = new MutableVector(0, new Modifier.Node[16]);
                                        }
                                        if (delegatingNode != 0) {
                                            r5.add(delegatingNode);
                                            delegatingNode = 0;
                                        }
                                        r5.add(node2);
                                    }
                                }
                                node2 = node2.getChild$ui();
                                delegatingNode = delegatingNode;
                                r5 = r5;
                            }
                            if (i == 1) {
                            }
                        }
                        delegatingNode = DepthSortedSetKt.access$pop(r5);
                    }
                }
                if ((node.getAggregateChildKindSet$ui() & 8) == 0) {
                    break;
                }
            }
        }
        delegatingNode = 0;
        SemanticsModifierNode semanticsModifierNode = (SemanticsModifierNode) delegatingNode;
        NodeCoordinator m864requireCoordinator64DMado = semanticsModifierNode != null ? DepthSortedSetKt.m864requireCoordinator64DMado(semanticsModifierNode, 8) : null;
        return m864requireCoordinator64DMado == null ? parent.boundsInImportantForBoundsAncestor(nodeCoordinator) : m864requireCoordinator64DMado.localBoundingBoxOf(nodeCoordinator, true);
    }

    /* renamed from: fakeSemanticsNode-ypyhhiA, reason: not valid java name */
    public final SemanticsNode m947fakeSemanticsNodeypyhhiA(Role role, Function1 function1) {
        SemanticsConfiguration semanticsConfiguration = new SemanticsConfiguration();
        semanticsConfiguration.isMergingSemanticsOfDescendants = false;
        semanticsConfiguration.isClearingSemantics = false;
        function1.invoke(semanticsConfiguration);
        SemanticsNode semanticsNode = new SemanticsNode(new SemanticsNode$fakeSemanticsNode$fakeNode$1(function1), false, new LayoutNode(true, this.id + (role != null ? Utils.SECOND_IN_NANOS : 2000000000)), semanticsConfiguration);
        semanticsNode.fakeNodeParent = this;
        return semanticsNode;
    }

    public final void fillOneLayerOfSemanticsWrappers(LayoutNode layoutNode, ArrayList arrayList, boolean z) {
        MutableVector zSortedChildren = layoutNode.getZSortedChildren();
        Object[] objArr = zSortedChildren.content;
        int i = zSortedChildren.size;
        for (int i2 = 0; i2 < i; i2++) {
            LayoutNode layoutNode2 = (LayoutNode) objArr[i2];
            if (layoutNode2.isAttached() && (z || !layoutNode2.isDeactivated)) {
                if (layoutNode2.nodes.m889hasH91voCI$ui(8)) {
                    arrayList.add(Trace.SemanticsNode(layoutNode2, this.mergingEnabled));
                } else {
                    fillOneLayerOfSemanticsWrappers(layoutNode2, arrayList, z);
                }
            }
        }
    }

    public final NodeCoordinator findCoordinatorToGetBounds$ui() {
        if (!isFake$ui()) {
            SemanticsModifierNode findSemanticsModifierNodeToGetBounds = findSemanticsModifierNodeToGetBounds();
            return findSemanticsModifierNodeToGetBounds != null ? DepthSortedSetKt.m864requireCoordinator64DMado(findSemanticsModifierNodeToGetBounds, 8) : (InnerNodeCoordinator) this.layoutNode.nodes.innerCoordinator;
        }
        SemanticsNode parent = getParent();
        if (parent != null) {
            return parent.findCoordinatorToGetBounds$ui();
        }
        return null;
    }

    public final void findOneLayerOfMergingSemanticsNodes(ArrayList arrayList, ArrayList arrayList2) {
        unmergedChildren$ui(arrayList, false, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            SemanticsNode semanticsNode = (SemanticsNode) arrayList.get(size2);
            if (semanticsNode.isMergingSemanticsOfDescendants()) {
                arrayList2.add(semanticsNode);
            } else if (!semanticsNode.unmergedConfig.isClearingSemantics) {
                semanticsNode.findOneLayerOfMergingSemanticsNodes(arrayList, arrayList2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final SemanticsModifierNode findSemanticsModifierNodeToGetBounds() {
        Modifier.Node node;
        boolean z;
        boolean z2 = this.unmergedConfig.isMergingSemanticsOfDescendants;
        Object obj = null;
        LayoutNode layoutNode = this.layoutNode;
        if (!z2) {
            NodeChain nodeChain = layoutNode.nodes;
            if ((((Modifier.Node) nodeChain.head).getAggregateChildKindSet$ui() & 8) != 0) {
                loop3: for (Modifier.Node node2 = (Modifier.Node) nodeChain.head; node2 != null; node2 = node2.getChild$ui()) {
                    if ((node2.getKindSet$ui() & 8) != 0) {
                        node = node2;
                        MutableVector mutableVector = null;
                        while (node != null) {
                            if (node instanceof SemanticsModifierNode) {
                                if (((SemanticsModifierNode) node).isImportantForBounds()) {
                                    obj = node;
                                }
                            } else if ((node.getKindSet$ui() & 8) != 0 && (node instanceof DelegatingNode)) {
                                int i = 0;
                                for (Modifier.Node node3 = ((DelegatingNode) node).delegate; node3 != null; node3 = node3.getChild$ui()) {
                                    if ((node3.getKindSet$ui() & 8) != 0) {
                                        i++;
                                        if (i == 1) {
                                            node = node3;
                                        } else {
                                            if (mutableVector == null) {
                                                mutableVector = new MutableVector(0, new Modifier.Node[16]);
                                            }
                                            if (node != null) {
                                                mutableVector.add(node);
                                                node = null;
                                            }
                                            mutableVector.add(node3);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            node = DepthSortedSetKt.access$pop(mutableVector);
                        }
                    }
                    if ((node2.getAggregateChildKindSet$ui() & 8) == 0) {
                        break;
                    }
                }
            }
            return (SemanticsModifierNode) obj;
        }
        NodeChain nodeChain2 = layoutNode.nodes;
        if ((((Modifier.Node) nodeChain2.head).getAggregateChildKindSet$ui() & 8) != 0) {
            node = null;
            for (Modifier.Node node4 = (Modifier.Node) nodeChain2.head; node4 != null; node4 = node4.getChild$ui()) {
                if ((node4.getKindSet$ui() & 8) != 0) {
                    Modifier.Node node5 = node4;
                    MutableVector mutableVector2 = null;
                    while (node5 != null) {
                        if (node5 instanceof SemanticsModifierNode) {
                            SemanticsModifierNode semanticsModifierNode = (SemanticsModifierNode) node5;
                            if (semanticsModifierNode.isImportantForBounds()) {
                                if (semanticsModifierNode.getShouldMergeDescendantSemantics()) {
                                    return semanticsModifierNode;
                                }
                                if (node == null) {
                                    node = semanticsModifierNode;
                                }
                            }
                            z = false;
                        } else {
                            z = true;
                        }
                        if (z && (node5.getKindSet$ui() & 8) != 0 && (node5 instanceof DelegatingNode)) {
                            int i2 = 0;
                            for (Modifier.Node node6 = ((DelegatingNode) node5).delegate; node6 != null; node6 = node6.getChild$ui()) {
                                if ((node6.getKindSet$ui() & 8) != 0) {
                                    i2++;
                                    if (i2 == 1) {
                                        node5 = node6;
                                    } else {
                                        if (mutableVector2 == null) {
                                            mutableVector2 = new MutableVector(0, new Modifier.Node[16]);
                                        }
                                        if (node5 != null) {
                                            mutableVector2.add(node5);
                                            node5 = null;
                                        }
                                        mutableVector2.add(node6);
                                    }
                                }
                            }
                            if (i2 == 1) {
                            }
                        }
                        node5 = DepthSortedSetKt.access$pop(mutableVector2);
                    }
                }
                if ((node4.getAggregateChildKindSet$ui() & 8) == 0) {
                    break;
                }
            }
            obj = node;
        }
        return (SemanticsModifierNode) obj;
    }

    public final Rect getBoundsInRoot() {
        NodeCoordinator findCoordinatorToGetBounds$ui = findCoordinatorToGetBounds$ui();
        if (findCoordinatorToGetBounds$ui != null) {
            if (!findCoordinatorToGetBounds$ui.isAttached()) {
                findCoordinatorToGetBounds$ui = null;
            }
            if (findCoordinatorToGetBounds$ui != null) {
                return ValueInsets.findRootCoordinates(findCoordinatorToGetBounds$ui).localBoundingBoxOf(findCoordinatorToGetBounds$ui, true);
            }
        }
        return Rect.Zero;
    }

    public final Rect getBoundsInWindow() {
        NodeCoordinator findCoordinatorToGetBounds$ui = findCoordinatorToGetBounds$ui();
        if (findCoordinatorToGetBounds$ui != null) {
            if (!findCoordinatorToGetBounds$ui.isAttached()) {
                findCoordinatorToGetBounds$ui = null;
            }
            if (findCoordinatorToGetBounds$ui != null) {
                return ValueInsets.boundsInWindow(findCoordinatorToGetBounds$ui, true);
            }
        }
        return Rect.Zero;
    }

    public final List getChildren$ui(boolean z, boolean z2, boolean z3) {
        if (!z && this.unmergedConfig.isClearingSemantics) {
            return EmptyList.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        if (!isMergingSemanticsOfDescendants()) {
            return unmergedChildren$ui(arrayList, z2, z3);
        }
        ArrayList arrayList2 = new ArrayList();
        findOneLayerOfMergingSemanticsNodes(arrayList, arrayList2);
        return arrayList2;
    }

    public final SemanticsConfiguration getConfig() {
        boolean isMergingSemanticsOfDescendants = isMergingSemanticsOfDescendants();
        SemanticsConfiguration semanticsConfiguration = this.unmergedConfig;
        if (!isMergingSemanticsOfDescendants) {
            return semanticsConfiguration;
        }
        SemanticsConfiguration copy = semanticsConfiguration.copy();
        mergeConfig(new ArrayList(), copy);
        return copy;
    }

    public final SemanticsNode getParent() {
        LayoutNode layoutNode;
        SemanticsNode semanticsNode = this.fakeNodeParent;
        if (semanticsNode != null) {
            return semanticsNode;
        }
        LayoutNode layoutNode2 = this.layoutNode;
        boolean z = this.mergingEnabled;
        if (z) {
            layoutNode = layoutNode2.getParent$ui();
            while (layoutNode != null) {
                SemanticsConfiguration semanticsConfiguration = layoutNode.getSemanticsConfiguration();
                if (semanticsConfiguration != null && semanticsConfiguration.isMergingSemanticsOfDescendants) {
                    break;
                }
                layoutNode = layoutNode.getParent$ui();
            }
        }
        layoutNode = null;
        if (layoutNode == null) {
            LayoutNode parent$ui = layoutNode2.getParent$ui();
            while (true) {
                if (parent$ui == null) {
                    layoutNode = null;
                    break;
                }
                if (parent$ui.nodes.m889hasH91voCI$ui(8)) {
                    layoutNode = parent$ui;
                    break;
                }
                parent$ui = parent$ui.getParent$ui();
            }
        }
        if (layoutNode == null) {
            return null;
        }
        return Trace.SemanticsNode(layoutNode, z);
    }

    public final Rect getTouchBoundsInRoot() {
        Object findSemanticsModifierNodeToGetBounds = findSemanticsModifierNodeToGetBounds();
        if (findSemanticsModifierNodeToGetBounds == null) {
            return ((InnerNodeCoordinator) this.layoutNode.nodes.innerCoordinator).touchBoundsInRoot();
        }
        Modifier.Node node = ((Modifier.Node) findSemanticsModifierNodeToGetBounds).getNode();
        Object obj = this.unmergedConfig.props.get(SemanticsActions.OnClick);
        if (obj == null) {
            obj = null;
        }
        return DepthSortedSetKt.effectiveBoundsInRoot(node, obj != null, true);
    }

    public final Rect getUnclippedBoundsInRoot$ui() {
        Object findSemanticsModifierNodeToGetBounds = findSemanticsModifierNodeToGetBounds();
        if (findSemanticsModifierNodeToGetBounds == null) {
            InnerNodeCoordinator innerNodeCoordinator = (InnerNodeCoordinator) this.layoutNode.nodes.innerCoordinator;
            return ValueInsets.findRootCoordinates(innerNodeCoordinator).localBoundingBoxOf(innerNodeCoordinator, false);
        }
        Modifier.Node node = ((Modifier.Node) findSemanticsModifierNodeToGetBounds).getNode();
        Object obj = this.unmergedConfig.props.get(SemanticsActions.OnClick);
        if (obj == null) {
            obj = null;
        }
        return DepthSortedSetKt.effectiveBoundsInRoot(node, obj != null, false);
    }

    public final boolean isFake$ui() {
        return this.fakeNodeParent != null;
    }

    public final boolean isMergingSemanticsOfDescendants() {
        return this.mergingEnabled && this.unmergedConfig.isMergingSemanticsOfDescendants;
    }

    public final boolean isUnmergedLeafNode$ui() {
        if (!isFake$ui() && getChildren$ui$default(this, false, 4).isEmpty()) {
            LayoutNode parent$ui = this.layoutNode.getParent$ui();
            while (true) {
                if (parent$ui == null) {
                    parent$ui = null;
                    break;
                }
                SemanticsConfiguration semanticsConfiguration = parent$ui.getSemanticsConfiguration();
                if (semanticsConfiguration != null && semanticsConfiguration.isMergingSemanticsOfDescendants) {
                    break;
                }
                parent$ui = parent$ui.getParent$ui();
            }
            if (parent$ui == null) {
                return true;
            }
        }
        return false;
    }

    public final void mergeConfig(ArrayList arrayList, SemanticsConfiguration semanticsConfiguration) {
        if (this.unmergedConfig.isClearingSemantics) {
            return;
        }
        unmergedChildren$ui(arrayList, false, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            SemanticsNode semanticsNode = (SemanticsNode) arrayList.get(size2);
            if (!semanticsNode.isMergingSemanticsOfDescendants()) {
                semanticsConfiguration.mergeChild$ui(semanticsNode.unmergedConfig);
                semanticsNode.mergeConfig(arrayList, semanticsConfiguration);
            }
        }
    }

    public final List unmergedChildren$ui(ArrayList arrayList, boolean z, boolean z2) {
        if (isFake$ui()) {
            return EmptyList.INSTANCE;
        }
        fillOneLayerOfSemanticsWrappers(this.layoutNode, arrayList, z2);
        if (z) {
            SemanticsConfiguration semanticsConfiguration = this.unmergedConfig;
            MutableScatterMap mutableScatterMap = semanticsConfiguration.props;
            Object obj = mutableScatterMap.get(SemanticsProperties.Role);
            if (obj == null) {
                obj = null;
            }
            Role role = (Role) obj;
            if (role != null && semanticsConfiguration.isMergingSemanticsOfDescendants && !arrayList.isEmpty()) {
                arrayList.add(m947fakeSemanticsNodeypyhhiA(role, new BoundsAnimation$animate$1(role, 17)));
            }
            SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.ContentDescription;
            if (mutableScatterMap.containsKey(semanticsPropertyKey) && !arrayList.isEmpty() && semanticsConfiguration.isMergingSemanticsOfDescendants) {
                Object obj2 = mutableScatterMap.get(semanticsPropertyKey);
                if (obj2 == null) {
                    obj2 = null;
                }
                List list = (List) obj2;
                String str = list != null ? (String) CollectionsKt.firstOrNull(list) : null;
                if (str != null) {
                    arrayList.add(0, m947fakeSemanticsNodeypyhhiA(null, new ImageKt$Image$finalModifier$1$1(str, 1)));
                }
            }
        }
        return arrayList;
    }
}
