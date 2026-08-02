package androidx.compose.ui.semantics;

import android.graphics.Region;
import android.os.Trace;
import androidx.camera.view.PreviewView;
import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableScatterMap;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntRectKt;
import androidx.datastore.core.SimpleActor;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.util.DBUtil;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public abstract class SemanticsOwnerKt {
    public static final Rect DefaultFakeNodeBounds = new Rect(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 10.0f, 10.0f);

    public static final void getAllSemanticsNodesToMap$findAllSemanticNodesRecursive(LinkedHashMap linkedHashMap, SemanticsNode semanticsNode) {
        linkedHashMap.put(Integer.valueOf(semanticsNode.id), semanticsNode);
        List children$ui$default = SemanticsNode.getChildren$ui$default(semanticsNode, false, 3);
        int size = children$ui$default.size();
        for (int i = 0; i < size; i++) {
            getAllSemanticsNodesToMap$findAllSemanticNodesRecursive(linkedHashMap, (SemanticsNode) children$ui$default.get(i));
        }
    }

    public static final MutableIntObjectMap getAllUncoveredSemanticsNodesToIntObjectMap(SimpleActor simpleActor, Function1 function1) {
        Trace.beginSection("getAllUncoveredSemanticsNodesToIntObjectMap");
        try {
            SemanticsNode unmergedRootSemanticsNode = simpleActor.getUnmergedRootSemanticsNode();
            LayoutNode layoutNode = unmergedRootSemanticsNode.layoutNode;
            if (layoutNode.isPlaced() && layoutNode.isAttached()) {
                Rect boundsInRoot = unmergedRootSemanticsNode.getBoundsInRoot();
                MutableIntObjectMap mutableIntObjectMap = new MutableIntObjectMap(48);
                PreviewView.AnonymousClass1 anonymousClass1 = new PreviewView.AnonymousClass1(18);
                anonymousClass1.set(IntRectKt.roundToIntRect(boundsInRoot));
                getAllUncoveredSemanticsNodesToIntObjectMap$lambda$0$findAllSemanticNodesRecursive(new PreviewView.AnonymousClass1(18), anonymousClass1, mutableIntObjectMap, unmergedRootSemanticsNode, unmergedRootSemanticsNode, function1);
                return mutableIntObjectMap;
            }
            MutableIntObjectMap mutableIntObjectMap2 = IntObjectMapKt.EmptyIntObjectMap;
            mutableIntObjectMap2.getClass();
            return mutableIntObjectMap2;
        } finally {
            Trace.endSection();
        }
    }

    public static final void getAllUncoveredSemanticsNodesToIntObjectMap$lambda$0$addDescendantsOfMergingNodePartiallyVisibleInScrollParent(PreviewView.AnonymousClass1 anonymousClass1, PreviewView.AnonymousClass1 anonymousClass12, MutableIntObjectMap mutableIntObjectMap, SemanticsNode semanticsNode, SemanticsNode semanticsNode2, Function1 function1) {
        Region region = (Region) anonymousClass1.this$0;
        Region region2 = (Region) anonymousClass12.this$0;
        if (!semanticsNode2.layoutNode.isPlaced() || !semanticsNode2.layoutNode.isAttached() || region2.isEmpty()) {
            if (semanticsNode2.isFake$ui()) {
                getAllUncoveredSemanticsNodesToIntObjectMap$lambda$0$addFakeNode(mutableIntObjectMap, semanticsNode, semanticsNode2);
                return;
            }
            return;
        }
        Rect touchBoundsInRoot = semanticsNode2.getTouchBoundsInRoot();
        if (touchBoundsInRoot.isEmpty()) {
            touchBoundsInRoot = semanticsNode2.getUnclippedBoundsInRoot$ui();
        }
        IntRect roundToIntRect = IntRectKt.roundToIntRect(touchBoundsInRoot);
        anonymousClass1.set(roundToIntRect);
        if (region.op(region2, Region.Op.INTERSECT)) {
            int i = semanticsNode2.id;
            if (i == semanticsNode.id) {
                i = -1;
            }
            android.graphics.Rect bounds = region.getBounds();
            mutableIntObjectMap.set(i, new SemanticsNodeWithAdjustedBounds(semanticsNode2, new IntRect(bounds.left, bounds.top, bounds.right, bounds.bottom)));
            List children$ui$default = SemanticsNode.getChildren$ui$default(semanticsNode2, false, 4);
            for (int size = children$ui$default.size() - 1; -1 < size; size--) {
                if (!((Boolean) function1.invoke(children$ui$default.get(size))).booleanValue()) {
                    getAllUncoveredSemanticsNodesToIntObjectMap$lambda$0$addDescendantsOfMergingNodePartiallyVisibleInScrollParent(anonymousClass1, anonymousClass12, mutableIntObjectMap, semanticsNode, (SemanticsNode) children$ui$default.get(size), function1);
                }
            }
            if (isImportantForAccessibility(semanticsNode2)) {
                region2.op(roundToIntRect.left, roundToIntRect.top, roundToIntRect.right, roundToIntRect.bottom, Region.Op.DIFFERENCE);
            }
        }
    }

    public static final void getAllUncoveredSemanticsNodesToIntObjectMap$lambda$0$addFakeNode(MutableIntObjectMap mutableIntObjectMap, SemanticsNode semanticsNode, SemanticsNode semanticsNode2) {
        LayoutNode layoutNode;
        SemanticsNode parent = semanticsNode2.getParent();
        Rect boundsInRoot = (parent == null || (layoutNode = parent.layoutNode) == null || !layoutNode.isPlaced()) ? DefaultFakeNodeBounds : parent.getBoundsInRoot();
        int i = semanticsNode2.id;
        if (i == semanticsNode.id) {
            i = -1;
        }
        mutableIntObjectMap.set(i, new SemanticsNodeWithAdjustedBounds(semanticsNode2, IntRectKt.roundToIntRect(boundsInRoot)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ad, code lost:
    
        if (r12 != null) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void getAllUncoveredSemanticsNodesToIntObjectMap$lambda$0$findAllSemanticNodesRecursive(PreviewView.AnonymousClass1 anonymousClass1, PreviewView.AnonymousClass1 anonymousClass12, MutableIntObjectMap mutableIntObjectMap, SemanticsNode semanticsNode, SemanticsNode semanticsNode2, Function1 function1) {
        NodeCoordinator nodeCoordinator;
        PreviewView.AnonymousClass1 anonymousClass13 = anonymousClass1;
        MutableIntObjectMap mutableIntObjectMap2 = mutableIntObjectMap;
        SemanticsNode semanticsNode3 = semanticsNode;
        Function1 function12 = function1;
        int i = semanticsNode3.id;
        Region region = (Region) anonymousClass13.this$0;
        PreviewView.AnonymousClass1 anonymousClass14 = anonymousClass12;
        Region region2 = (Region) anonymousClass14.this$0;
        LayoutNode layoutNode = semanticsNode2.layoutNode;
        int i2 = semanticsNode2.id;
        boolean z = false;
        boolean z2 = (layoutNode.isPlaced() && semanticsNode2.layoutNode.isAttached()) ? false : true;
        if (region2.isEmpty() && i2 != i) {
            return;
        }
        if (z2 && !semanticsNode2.isFake$ui()) {
            return;
        }
        IntRect roundToIntRect = IntRectKt.roundToIntRect(semanticsNode2.getTouchBoundsInRoot());
        anonymousClass13.set(roundToIntRect);
        if (i2 == i) {
            i2 = -1;
        }
        if (!region.op(region2, Region.Op.INTERSECT)) {
            if (semanticsNode2.isFake$ui()) {
                getAllUncoveredSemanticsNodesToIntObjectMap$lambda$0$addFakeNode(mutableIntObjectMap, semanticsNode, semanticsNode2);
                return;
            } else {
                if (i2 == -1) {
                    android.graphics.Rect bounds = region.getBounds();
                    mutableIntObjectMap2.set(i2, new SemanticsNodeWithAdjustedBounds(semanticsNode2, new IntRect(bounds.left, bounds.top, bounds.right, bounds.bottom)));
                    return;
                }
                return;
            }
        }
        android.graphics.Rect bounds2 = region.getBounds();
        mutableIntObjectMap2.set(i2, new SemanticsNodeWithAdjustedBounds(semanticsNode2, new IntRect(bounds2.left, bounds2.top, bounds2.right, bounds2.bottom)));
        List children$ui$default = SemanticsNode.getChildren$ui$default(semanticsNode2, false, 4);
        if (semanticsNode2.unmergedConfig.isMergingSemanticsOfDescendants) {
            SemanticsNode parent = semanticsNode2.getParent();
            while (true) {
                nodeCoordinator = null;
                if (parent == null) {
                    parent = null;
                    break;
                }
                MutableScatterMap mutableScatterMap = parent.unmergedConfig.props;
                if (mutableScatterMap.containsKey(SemanticsProperties.VerticalScrollAxisRange) || mutableScatterMap.containsKey(SemanticsProperties.HorizontalScrollAxisRange)) {
                    break;
                } else {
                    parent = parent.getParent();
                }
            }
            if (parent != null) {
                NodeCoordinator findCoordinatorToGetBounds$ui = semanticsNode2.findCoordinatorToGetBounds$ui();
                if (findCoordinatorToGetBounds$ui != null) {
                    if (!findCoordinatorToGetBounds$ui.isAttached()) {
                        findCoordinatorToGetBounds$ui = null;
                    }
                }
                findCoordinatorToGetBounds$ui = null;
                NodeCoordinator findCoordinatorToGetBounds$ui2 = parent.findCoordinatorToGetBounds$ui();
                if (findCoordinatorToGetBounds$ui2 != null) {
                    if (!findCoordinatorToGetBounds$ui2.isAttached()) {
                        findCoordinatorToGetBounds$ui2 = null;
                    }
                    if (findCoordinatorToGetBounds$ui2 != null) {
                        nodeCoordinator = findCoordinatorToGetBounds$ui2;
                    }
                }
                if (findCoordinatorToGetBounds$ui != null && nodeCoordinator != null) {
                    Rect localBoundingBoxOf = nodeCoordinator.localBoundingBoxOf(findCoordinatorToGetBounds$ui, false);
                    z = !localBoundingBoxOf.equals(localBoundingBoxOf.intersect(DBUtil.m1180Recttz77jQw(0L, Countries.m3991toSizeozmzZPI(nodeCoordinator.measuredSize))));
                }
            }
            if (z) {
                PreviewView.AnonymousClass1 anonymousClass15 = new PreviewView.AnonymousClass1(18);
                anonymousClass15.set(IntRectKt.roundToIntRect(semanticsNode2.getUnclippedBoundsInRoot$ui()));
                int size = children$ui$default.size() - 1;
                while (-1 < size) {
                    if (!((Boolean) function12.invoke(children$ui$default.get(size))).booleanValue()) {
                        getAllUncoveredSemanticsNodesToIntObjectMap$lambda$0$addDescendantsOfMergingNodePartiallyVisibleInScrollParent(new PreviewView.AnonymousClass1(18), anonymousClass15, mutableIntObjectMap2, semanticsNode3, (SemanticsNode) children$ui$default.get(size), function12);
                    }
                    size--;
                    mutableIntObjectMap2 = mutableIntObjectMap;
                    semanticsNode3 = semanticsNode;
                }
                if (isImportantForAccessibility(semanticsNode2)) {
                    return;
                }
                region2.op(roundToIntRect.left, roundToIntRect.top, roundToIntRect.right, roundToIntRect.bottom, Region.Op.DIFFERENCE);
                return;
            }
        }
        int size2 = children$ui$default.size() - 1;
        while (-1 < size2) {
            if (!((Boolean) function12.invoke(children$ui$default.get(size2))).booleanValue()) {
                getAllUncoveredSemanticsNodesToIntObjectMap$lambda$0$findAllSemanticNodesRecursive(anonymousClass13, anonymousClass14, mutableIntObjectMap, semanticsNode, (SemanticsNode) children$ui$default.get(size2), function12);
            }
            size2--;
            anonymousClass13 = anonymousClass1;
            anonymousClass14 = anonymousClass12;
            function12 = function1;
        }
        if (isImportantForAccessibility(semanticsNode2)) {
        }
    }

    public static ProgressBarRangeInfo getIndeterminate() {
        return ProgressBarRangeInfo.Indeterminate;
    }

    public static final boolean isAccessibilityIgnoredLink(SemanticsNode semanticsNode) {
        SemanticsConfiguration config = semanticsNode.getConfig();
        return config.props.containsKey(SemanticsProperties.LinkTestMarker);
    }

    public static final boolean isHidden(SemanticsNode semanticsNode) {
        NodeCoordinator findCoordinatorToGetBounds$ui = semanticsNode.findCoordinatorToGetBounds$ui();
        MutableScatterMap mutableScatterMap = semanticsNode.unmergedConfig.props;
        return (findCoordinatorToGetBounds$ui != null ? findCoordinatorToGetBounds$ui.isTransparent() : false) || mutableScatterMap.containsKey(SemanticsProperties.HideFromAccessibility) || mutableScatterMap.containsKey(SemanticsProperties.InvisibleToUser);
    }

    public static final boolean isImportantForAccessibility(SemanticsNode semanticsNode) {
        if (!isHidden(semanticsNode)) {
            SemanticsConfiguration semanticsConfiguration = semanticsNode.unmergedConfig;
            if (semanticsConfiguration.isMergingSemanticsOfDescendants) {
                return true;
            }
            MutableScatterMap mutableScatterMap = semanticsConfiguration.props;
            Object[] objArr = mutableScatterMap.keys;
            Object[] objArr2 = mutableScatterMap.values;
            long[] jArr = mutableScatterMap.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                int i4 = (i << 3) + i3;
                                Object obj = objArr[i4];
                                Object obj2 = objArr2[i4];
                                if (((SemanticsPropertyKey) obj).isImportantForAccessibility) {
                                    return true;
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return false;
    }
}
