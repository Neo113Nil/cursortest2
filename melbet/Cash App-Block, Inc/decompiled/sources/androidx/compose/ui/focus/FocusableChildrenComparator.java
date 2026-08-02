package androidx.compose.ui.focus;

import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.node.LayoutNode;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class FocusableChildrenComparator implements Comparator {
    public static final FocusableChildrenComparator INSTANCE = new FocusableChildrenComparator();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object, java.lang.Object[]] */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        FocusTargetNode focusTargetNode = (FocusTargetNode) obj;
        FocusTargetNode focusTargetNode2 = (FocusTargetNode) obj2;
        if (FocusTraversalKt.isEligibleForFocusSearch(focusTargetNode) && FocusTraversalKt.isEligibleForFocusSearch(focusTargetNode2)) {
            LayoutNode requireLayoutNode = DepthSortedSetKt.requireLayoutNode(focusTargetNode);
            LayoutNode requireLayoutNode2 = DepthSortedSetKt.requireLayoutNode(focusTargetNode2);
            if (!Intrinsics.areEqual(requireLayoutNode, requireLayoutNode2)) {
                LayoutNode[] layoutNodeArr = new LayoutNode[16];
                int i = 0;
                while (requireLayoutNode != null) {
                    int i2 = i + 1;
                    if (layoutNodeArr.length < i2) {
                        int length = layoutNodeArr.length;
                        ?? r4 = new Object[Math.max(i2, length * 2)];
                        System.arraycopy(layoutNodeArr, 0, r4, 0, length);
                        layoutNodeArr = r4;
                    }
                    if (i != 0) {
                        System.arraycopy(layoutNodeArr, 0, layoutNodeArr, 0 + 1, i + 0);
                    }
                    layoutNodeArr[0] = requireLayoutNode;
                    i++;
                    requireLayoutNode = requireLayoutNode.getParent$ui();
                }
                LayoutNode[] layoutNodeArr2 = new LayoutNode[16];
                int i3 = 0;
                while (requireLayoutNode2 != null) {
                    int i4 = i3 + 1;
                    if (layoutNodeArr2.length < i4) {
                        int length2 = layoutNodeArr2.length;
                        ?? r42 = new Object[Math.max(i4, length2 * 2)];
                        System.arraycopy(layoutNodeArr2, 0, r42, 0, length2);
                        layoutNodeArr2 = r42;
                    }
                    if (i3 != 0) {
                        System.arraycopy(layoutNodeArr2, 0, layoutNodeArr2, 0 + 1, i3 + 0);
                    }
                    layoutNodeArr2[0] = requireLayoutNode2;
                    i3++;
                    requireLayoutNode2 = requireLayoutNode2.getParent$ui();
                }
                int min = Math.min(i - 1, i3 - 1);
                if (min >= 0) {
                    int i5 = 0;
                    while (Intrinsics.areEqual(layoutNodeArr[i5], layoutNodeArr2[i5])) {
                        if (i5 != min) {
                            i5++;
                        }
                    }
                    return Intrinsics.compare(layoutNodeArr[i5].getPlaceOrder$ui(), layoutNodeArr2[i5].getPlaceOrder$ui());
                }
                a$$ExternalSyntheticBUOutline0.m$1("Could not find a common ancestor between the two FocusModifiers.");
                return 0;
            }
        } else {
            if (FocusTraversalKt.isEligibleForFocusSearch(focusTargetNode)) {
                return -1;
            }
            if (FocusTraversalKt.isEligibleForFocusSearch(focusTargetNode2)) {
                return 1;
            }
        }
        return 0;
    }
}
