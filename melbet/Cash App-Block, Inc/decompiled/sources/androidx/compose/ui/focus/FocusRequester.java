package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.DepthSortedSetKt;
import bo.app.a$$ExternalSyntheticBUOutline0;

/* loaded from: classes.dex */
public final class FocusRequester {
    public final MutableVector focusRequesterNodes = new MutableVector(0, new FocusRequesterModifierNode[16]);
    public static final FocusRequester Default = new FocusRequester();
    public static final FocusRequester Cancel = new FocusRequester();
    public static final FocusRequester Redirect = new FocusRequester();

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0058, code lost:
    
        continue;
     */
    /* renamed from: requestFocus-3ESFkO8$default, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m605requestFocus3ESFkO8$default(FocusRequester focusRequester) {
        focusRequester.getClass();
        if (focusRequester == Default) {
            a$$ExternalSyntheticBUOutline0.m$1("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
            return;
        }
        if (focusRequester == Cancel) {
            a$$ExternalSyntheticBUOutline0.m$1("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
            return;
        }
        MutableVector mutableVector = focusRequester.focusRequesterNodes;
        int i = mutableVector.size;
        if (i == 0) {
            System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
            return;
        }
        Object[] objArr = mutableVector.content;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = (FocusRequesterModifierNode) objArr[i2];
            if (!((Modifier.Node) obj).getNode().isAttached()) {
                InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
            }
            MutableVector mutableVector2 = new MutableVector(0, new Modifier.Node[16]);
            Modifier.Node node = (Modifier.Node) obj;
            Modifier.Node child$ui = node.getNode().getChild$ui();
            if (child$ui == null) {
                DepthSortedSetKt.access$addLayoutNodeChildren(mutableVector2, node.getNode());
            } else {
                mutableVector2.add(child$ui);
            }
            while (true) {
                int i3 = mutableVector2.size;
                if (i3 != 0) {
                    Modifier.Node node2 = (Modifier.Node) mutableVector2.removeAt(i3 - 1);
                    if ((node2.getAggregateChildKindSet$ui() & 1024) == 0) {
                        DepthSortedSetKt.access$addLayoutNodeChildren(mutableVector2, node2);
                    } else {
                        while (true) {
                            if (node2 == null) {
                                break;
                            }
                            if ((node2.getKindSet$ui() & 1024) != 0) {
                                MutableVector mutableVector3 = null;
                                while (node2 != null) {
                                    if (node2 instanceof FocusTargetNode) {
                                        if (((FocusTargetNode) node2).m608requestFocus3ESFkO8(7)) {
                                            break;
                                        }
                                    } else if ((node2.getKindSet$ui() & 1024) != 0 && (node2 instanceof DelegatingNode)) {
                                        int i4 = 0;
                                        for (Modifier.Node node3 = ((DelegatingNode) node2).delegate; node3 != null; node3 = node3.getChild$ui()) {
                                            if ((node3.getKindSet$ui() & 1024) != 0) {
                                                i4++;
                                                if (i4 == 1) {
                                                    node2 = node3;
                                                } else {
                                                    if (mutableVector3 == null) {
                                                        mutableVector3 = new MutableVector(0, new Modifier.Node[16]);
                                                    }
                                                    if (node2 != null) {
                                                        mutableVector3.add(node2);
                                                        node2 = null;
                                                    }
                                                    mutableVector3.add(node3);
                                                }
                                            }
                                        }
                                        if (i4 == 1) {
                                        }
                                    }
                                    node2 = DepthSortedSetKt.access$pop(mutableVector3);
                                }
                            } else {
                                node2 = node2.getChild$ui();
                            }
                        }
                    }
                }
            }
        }
    }

    public final void freeFocus() {
        MutableVector mutableVector = this.focusRequesterNodes;
        int i = mutableVector.size;
        if (i == 0) {
            System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
            return;
        }
        Object[] objArr = mutableVector.content;
        for (int i2 = 0; i2 < i && !FocusOwnerImplKt.freeFocus((FocusRequesterModifierNode) objArr[i2]); i2++) {
        }
    }
}
