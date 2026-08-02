package androidx.compose.ui.focus;

import android.os.Trace;
import android.view.KeyEvent;
import android.view.View;
import androidx.collection.MutableLongSet;
import androidx.collection.MutableObjectList;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyInputModifierNode;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.TailModifierNode;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.LayoutDirection;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.contour.ContourLayout$matchParentX$1;
import com.squareup.contour.constraints.SizeConfigSmartLambdas$wrapContent$1;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class FocusOwnerImpl {
    public FocusTargetNode activeFocusTargetNode;
    public final FocusInvalidationManager focusInvalidationManager;
    public MutableLongSet keysCurrentlyDown;
    public final AndroidComposeView owner;
    public final AndroidComposeView platformFocusOwner;
    public final FocusTargetNode rootFocusNode = new FocusTargetNode(2, null, 14);
    public final FocusOwnerImpl$modifier$1 modifier = new ModifierNodeElement() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$modifier$1
        @Override // androidx.compose.ui.node.ModifierNodeElement
        public final Modifier.Node create() {
            return FocusOwnerImpl.this.rootFocusNode;
        }

        public final boolean equals(Object obj) {
            return obj == this;
        }

        public final int hashCode() {
            return FocusOwnerImpl.this.rootFocusNode.hashCode();
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public final void inspectableProperties(InspectorInfo inspectorInfo) {
            inspectorInfo.setName("RootFocusTarget");
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public final /* bridge */ /* synthetic */ void update(Modifier.Node node) {
        }
    };
    public final MutableObjectList listeners = new MutableObjectList(1);

    /* JADX WARN: Type inference failed for: r4v3, types: [androidx.compose.ui.focus.FocusOwnerImpl$modifier$1] */
    public FocusOwnerImpl(AndroidComposeView androidComposeView, AndroidComposeView androidComposeView2) {
        this.platformFocusOwner = androidComposeView;
        this.owner = androidComposeView2;
        this.focusInvalidationManager = new FocusInvalidationManager(this, androidComposeView2);
    }

    /* renamed from: clearFocus, reason: collision with other method in class */
    public final boolean m599clearFocus(boolean z) {
        NodeChain nodeChain;
        if (getActiveFocusTargetNode() != null) {
            FocusTargetNode activeFocusTargetNode = getActiveFocusTargetNode();
            setActiveFocusTargetNode(null);
            if (activeFocusTargetNode != null) {
                activeFocusTargetNode.dispatchFocusCallbacks$ui(FocusStateImpl.Active, FocusStateImpl.Inactive);
                if (!activeFocusTargetNode.getNode().isAttached()) {
                    InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
                }
                Modifier.Node parent$ui = activeFocusTargetNode.getNode().getParent$ui();
                LayoutNode requireLayoutNode = DepthSortedSetKt.requireLayoutNode(activeFocusTargetNode);
                while (requireLayoutNode != null) {
                    if ((((Modifier.Node) requireLayoutNode.nodes.head).getAggregateChildKindSet$ui() & 1024) != 0) {
                        while (parent$ui != null) {
                            if ((parent$ui.getKindSet$ui() & 1024) != 0) {
                                Modifier.Node node = parent$ui;
                                MutableVector mutableVector = null;
                                while (node != null) {
                                    if (node instanceof FocusTargetNode) {
                                        ((FocusTargetNode) node).dispatchFocusCallbacks$ui(FocusStateImpl.ActiveParent, FocusStateImpl.Inactive);
                                    } else if ((node.getKindSet$ui() & 1024) != 0 && (node instanceof DelegatingNode)) {
                                        int i = 0;
                                        for (Modifier.Node node2 = ((DelegatingNode) node).delegate; node2 != null; node2 = node2.getChild$ui()) {
                                            if ((node2.getKindSet$ui() & 1024) != 0) {
                                                i++;
                                                if (i == 1) {
                                                    node = node2;
                                                } else {
                                                    if (mutableVector == null) {
                                                        mutableVector = new MutableVector(0, new Modifier.Node[16]);
                                                    }
                                                    if (node != null) {
                                                        mutableVector.add(node);
                                                        node = null;
                                                    }
                                                    mutableVector.add(node2);
                                                }
                                            }
                                        }
                                        if (i == 1) {
                                        }
                                    }
                                    node = DepthSortedSetKt.access$pop(mutableVector);
                                }
                            }
                            parent$ui = parent$ui.getParent$ui();
                        }
                    }
                    requireLayoutNode = requireLayoutNode.getParent$ui();
                    parent$ui = (requireLayoutNode == null || (nodeChain = requireLayoutNode.nodes) == null) ? null : (TailModifierNode) nodeChain.tail;
                }
            }
        }
        return true;
    }

    /* renamed from: clearFocus-I7lrPNg, reason: not valid java name */
    public final boolean m594clearFocusI7lrPNg(int i, boolean z, boolean z2) {
        boolean z3 = true;
        if (z) {
            m599clearFocus(z);
        } else {
            int ordinal = FocusTraversalKt.m614performCustomClearFocusMxy_nc0(this.rootFocusNode, i).ordinal();
            if (ordinal == 0) {
                m599clearFocus(z);
            } else {
                if (ordinal != 1 && ordinal != 2 && ordinal != 3) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return false;
                }
                z3 = false;
            }
        }
        if (z3 && z2) {
            clearOwnerFocus();
        }
        return z3;
    }

    public final void clearOwnerFocus() {
        AndroidComposeView androidComposeView = this.platformFocusOwner;
        if (androidComposeView.isFocused() || androidComposeView.hasFocus()) {
            androidComposeView.clearFocus();
        } else if (androidComposeView.hasFocus()) {
            View findFocus = androidComposeView.findFocus();
            if (findFocus != null) {
                findFocus.clearFocus();
            }
            androidComposeView.clearFocus();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x009c, code lost:
    
        if (r7 == null) goto L45;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01de A[Catch: all -> 0x0383, TryCatch #0 {all -> 0x0383, blocks: (B:3:0x0007, B:5:0x000e, B:9:0x0019, B:11:0x0029, B:13:0x002d, B:14:0x0035, B:15:0x0055, B:18:0x0061, B:20:0x006b, B:21:0x0071, B:23:0x007d, B:25:0x0084, B:27:0x008c, B:31:0x0096, B:36:0x01de, B:38:0x01e8, B:39:0x01eb, B:41:0x01fa, B:44:0x020a, B:48:0x0216, B:51:0x021c, B:52:0x0221, B:54:0x0229, B:56:0x0231, B:58:0x0235, B:60:0x023d, B:62:0x0245, B:68:0x024d, B:70:0x0256, B:71:0x025a, B:66:0x025d, B:77:0x0265, B:88:0x026a, B:91:0x026f, B:93:0x0275, B:100:0x0279, B:105:0x0284, B:107:0x028c, B:115:0x02a3, B:117:0x02aa, B:151:0x02ae, B:146:0x02f6, B:119:0x02ba, B:121:0x02c2, B:123:0x02c6, B:125:0x02ce, B:127:0x02d6, B:133:0x02de, B:135:0x02e7, B:136:0x02eb, B:131:0x02ee, B:157:0x02fb, B:161:0x030b, B:163:0x0312, B:197:0x0316, B:192:0x035e, B:165:0x0322, B:167:0x032a, B:169:0x032e, B:171:0x0336, B:173:0x033e, B:179:0x0346, B:181:0x034f, B:182:0x0353, B:177:0x0356, B:204:0x0365, B:206:0x036c, B:219:0x00a0, B:221:0x00aa, B:222:0x00ad, B:224:0x00b7, B:227:0x00c7, B:231:0x00d3, B:266:0x0130, B:268:0x0134, B:233:0x00d8, B:235:0x00e0, B:237:0x00e4, B:239:0x00ec, B:241:0x00f4, B:247:0x00fc, B:249:0x0105, B:250:0x0109, B:245:0x010c, B:256:0x0114, B:270:0x0119, B:273:0x011e, B:275:0x0124, B:282:0x0128, B:287:0x013c, B:289:0x0146, B:290:0x0149, B:292:0x0157, B:295:0x0167, B:299:0x0173, B:334:0x01d0, B:336:0x01d4, B:301:0x0178, B:303:0x0180, B:305:0x0184, B:307:0x018c, B:309:0x0194, B:315:0x019c, B:317:0x01a5, B:318:0x01a9, B:313:0x01ac, B:324:0x01b4, B:339:0x01b9, B:342:0x01be, B:344:0x01c4, B:351:0x01c8, B:356:0x0039, B:358:0x003f, B:360:0x0043, B:362:0x0049, B:364:0x004d), top: B:2:0x0007 }] */
    /* JADX WARN: Type inference failed for: r0v20, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r12v24, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r12v25, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r12v29, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r12v30, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r12v34, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r12v35 */
    /* JADX WARN: Type inference failed for: r12v36, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v37 */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r12v39 */
    /* JADX WARN: Type inference failed for: r12v40 */
    /* JADX WARN: Type inference failed for: r12v43, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r12v44 */
    /* JADX WARN: Type inference failed for: r12v45, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v46 */
    /* JADX WARN: Type inference failed for: r12v47 */
    /* JADX WARN: Type inference failed for: r12v48 */
    /* JADX WARN: Type inference failed for: r12v49 */
    /* JADX WARN: Type inference failed for: r12v64 */
    /* JADX WARN: Type inference failed for: r12v65 */
    /* JADX WARN: Type inference failed for: r12v66 */
    /* JADX WARN: Type inference failed for: r12v67 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v6, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* renamed from: dispatchKeyEvent-YhN2O0w, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m595dispatchKeyEventYhN2O0w(KeyEvent keyEvent, Function0 function0) {
        Object obj;
        Modifier.Node node;
        NodeChain nodeChain;
        Object obj2;
        NodeChain nodeChain2;
        int size;
        NodeChain nodeChain3;
        boolean z;
        FocusTargetNode focusTargetNode = this.rootFocusNode;
        Trace.beginSection("FocusOwnerImpl:dispatchKeyEvent");
        try {
            if (this.focusInvalidationManager.isInvalidationScheduled) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching key event while focus system is invalidated.");
                return false;
            }
            long m782getKeyZmokQxo = KeyEventType.m782getKeyZmokQxo(keyEvent);
            int m790getTypeZmokQxo = KeyEventType.m790getTypeZmokQxo(keyEvent);
            if (KeyEventType.m772equalsimpl0(m790getTypeZmokQxo, 2)) {
                MutableLongSet mutableLongSet = this.keysCurrentlyDown;
                if (mutableLongSet == null) {
                    mutableLongSet = new MutableLongSet(3);
                    this.keysCurrentlyDown = mutableLongSet;
                }
                mutableLongSet.plusAssign(m782getKeyZmokQxo);
            } else if (KeyEventType.m772equalsimpl0(m790getTypeZmokQxo, 1)) {
                MutableLongSet mutableLongSet2 = this.keysCurrentlyDown;
                if (mutableLongSet2 == null || !mutableLongSet2.contains(m782getKeyZmokQxo)) {
                    return false;
                }
                MutableLongSet mutableLongSet3 = this.keysCurrentlyDown;
                if (mutableLongSet3 != null) {
                    mutableLongSet3.remove(m782getKeyZmokQxo);
                }
            }
            FocusTargetNode findActiveFocusNode = FocusTraversalKt.findActiveFocusNode(focusTargetNode);
            if (findActiveFocusNode != null) {
                if (!findActiveFocusNode.getNode().isAttached()) {
                    InlineClassHelperKt.throwIllegalStateException("visitLocalDescendants called on an unattached node");
                }
                Modifier.Node node2 = findActiveFocusNode.getNode();
                if ((node2.getAggregateChildKindSet$ui() & 9216) != 0) {
                    node = null;
                    for (Modifier.Node child$ui = node2.getChild$ui(); child$ui != null; child$ui = child$ui.getChild$ui()) {
                        if ((child$ui.getKindSet$ui() & 9216) != 0) {
                            if ((child$ui.getKindSet$ui() & 1024) != 0) {
                                break;
                            }
                            node = child$ui;
                        }
                    }
                } else {
                    node = null;
                }
            }
            if (findActiveFocusNode != null) {
                if (!findActiveFocusNode.getNode().isAttached()) {
                    InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
                }
                Modifier.Node node3 = findActiveFocusNode.getNode();
                LayoutNode requireLayoutNode = DepthSortedSetKt.requireLayoutNode(findActiveFocusNode);
                loop11: while (true) {
                    if (requireLayoutNode == null) {
                        obj2 = null;
                        break;
                    }
                    if ((((Modifier.Node) requireLayoutNode.nodes.head).getAggregateChildKindSet$ui() & PKIFailureInfo.certRevoked) != 0) {
                        while (node3 != null) {
                            if ((node3.getKindSet$ui() & PKIFailureInfo.certRevoked) != 0) {
                                MutableVector mutableVector = null;
                                Modifier.Node node4 = node3;
                                while (node4 != null) {
                                    if (node4 instanceof KeyInputModifierNode) {
                                        obj2 = node4;
                                        break loop11;
                                    }
                                    if ((node4.getKindSet$ui() & PKIFailureInfo.certRevoked) != 0 && (node4 instanceof DelegatingNode)) {
                                        Modifier.Node node5 = ((DelegatingNode) node4).delegate;
                                        int i = 0;
                                        node4 = node4;
                                        mutableVector = mutableVector;
                                        while (node5 != null) {
                                            if ((node5.getKindSet$ui() & PKIFailureInfo.certRevoked) != 0) {
                                                i++;
                                                mutableVector = mutableVector;
                                                if (i == 1) {
                                                    node4 = node5;
                                                } else {
                                                    if (mutableVector == null) {
                                                        mutableVector = new MutableVector(0, new Modifier.Node[16]);
                                                    }
                                                    if (node4 != null) {
                                                        mutableVector.add(node4);
                                                        node4 = null;
                                                    }
                                                    mutableVector.add(node5);
                                                }
                                            }
                                            node5 = node5.getChild$ui();
                                            node4 = node4;
                                            mutableVector = mutableVector;
                                        }
                                        if (i == 1) {
                                        }
                                    }
                                    node4 = DepthSortedSetKt.access$pop(mutableVector);
                                }
                            }
                            node3 = node3.getParent$ui();
                        }
                    }
                    requireLayoutNode = requireLayoutNode.getParent$ui();
                    node3 = (requireLayoutNode == null || (nodeChain2 = requireLayoutNode.nodes) == null) ? null : (TailModifierNode) nodeChain2.tail;
                }
                Object obj3 = (KeyInputModifierNode) obj2;
                if (obj3 != null) {
                    node = ((Modifier.Node) obj3).getNode();
                    if (node != null) {
                        if (!node.getNode().isAttached()) {
                            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
                        }
                        Modifier.Node parent$ui = node.getNode().getParent$ui();
                        LayoutNode requireLayoutNode2 = DepthSortedSetKt.requireLayoutNode(node);
                        ArrayList arrayList = null;
                        while (requireLayoutNode2 != null) {
                            if ((((Modifier.Node) requireLayoutNode2.nodes.head).getAggregateChildKindSet$ui() & PKIFailureInfo.certRevoked) != 0) {
                                while (parent$ui != null) {
                                    if ((parent$ui.getKindSet$ui() & PKIFailureInfo.certRevoked) != 0) {
                                        Modifier.Node node6 = parent$ui;
                                        MutableVector mutableVector2 = null;
                                        while (node6 != null) {
                                            if (node6 instanceof KeyInputModifierNode) {
                                                if (arrayList == null) {
                                                    arrayList = new ArrayList();
                                                }
                                                arrayList.add(node6);
                                                z = false;
                                            } else {
                                                z = true;
                                            }
                                            if (z && (node6.getKindSet$ui() & PKIFailureInfo.certRevoked) != 0 && (node6 instanceof DelegatingNode)) {
                                                int i2 = 0;
                                                for (Modifier.Node node7 = ((DelegatingNode) node6).delegate; node7 != null; node7 = node7.getChild$ui()) {
                                                    if ((node7.getKindSet$ui() & PKIFailureInfo.certRevoked) != 0) {
                                                        i2++;
                                                        if (i2 == 1) {
                                                            node6 = node7;
                                                        } else {
                                                            if (mutableVector2 == null) {
                                                                mutableVector2 = new MutableVector(0, new Modifier.Node[16]);
                                                            }
                                                            if (node6 != null) {
                                                                mutableVector2.add(node6);
                                                                node6 = null;
                                                            }
                                                            mutableVector2.add(node7);
                                                        }
                                                    }
                                                }
                                                if (i2 == 1) {
                                                }
                                            }
                                            node6 = DepthSortedSetKt.access$pop(mutableVector2);
                                        }
                                    }
                                    parent$ui = parent$ui.getParent$ui();
                                }
                            }
                            requireLayoutNode2 = requireLayoutNode2.getParent$ui();
                            parent$ui = (requireLayoutNode2 == null || (nodeChain3 = requireLayoutNode2.nodes) == null) ? null : (TailModifierNode) nodeChain3.tail;
                        }
                        if (arrayList != null && arrayList.size() - 1 >= 0) {
                            while (true) {
                                int i3 = size - 1;
                                if (((KeyInputModifierNode) arrayList.get(size)).mo163onPreKeyEventZmokQxo(keyEvent)) {
                                    return true;
                                }
                                if (i3 < 0) {
                                    break;
                                }
                                size = i3;
                            }
                        }
                        DelegatingNode node8 = node.getNode();
                        ?? r0 = 0;
                        while (node8 != 0) {
                            if (node8 instanceof KeyInputModifierNode) {
                                if (((KeyInputModifierNode) node8).mo163onPreKeyEventZmokQxo(keyEvent)) {
                                    return true;
                                }
                            } else if ((node8.getKindSet$ui() & PKIFailureInfo.certRevoked) != 0 && (node8 instanceof DelegatingNode)) {
                                Modifier.Node node9 = node8.delegate;
                                int i4 = 0;
                                r0 = r0;
                                node8 = node8;
                                while (node9 != null) {
                                    if ((node9.getKindSet$ui() & PKIFailureInfo.certRevoked) != 0) {
                                        i4++;
                                        r0 = r0;
                                        if (i4 == 1) {
                                            node8 = node9;
                                        } else {
                                            if (r0 == 0) {
                                                r0 = new MutableVector(0, new Modifier.Node[16]);
                                            }
                                            if (node8 != 0) {
                                                r0.add(node8);
                                                node8 = 0;
                                            }
                                            r0.add(node9);
                                        }
                                    }
                                    node9 = node9.getChild$ui();
                                    r0 = r0;
                                    node8 = node8;
                                }
                                if (i4 == 1) {
                                }
                            }
                            node8 = DepthSortedSetKt.access$pop(r0);
                        }
                        if (((Boolean) function0.invoke()).booleanValue()) {
                            return true;
                        }
                        DelegatingNode node10 = node.getNode();
                        ?? r14 = 0;
                        while (node10 != 0) {
                            if (node10 instanceof KeyInputModifierNode) {
                                if (((KeyInputModifierNode) node10).mo161onKeyEventZmokQxo(keyEvent)) {
                                    return true;
                                }
                            } else if ((node10.getKindSet$ui() & PKIFailureInfo.certRevoked) != 0 && (node10 instanceof DelegatingNode)) {
                                Modifier.Node node11 = node10.delegate;
                                int i5 = 0;
                                node10 = node10;
                                r14 = r14;
                                while (node11 != null) {
                                    if ((node11.getKindSet$ui() & PKIFailureInfo.certRevoked) != 0) {
                                        i5++;
                                        r14 = r14;
                                        if (i5 == 1) {
                                            node10 = node11;
                                        } else {
                                            if (r14 == 0) {
                                                r14 = new MutableVector(0, new Modifier.Node[16]);
                                            }
                                            if (node10 != 0) {
                                                r14.add(node10);
                                                node10 = 0;
                                            }
                                            r14.add(node11);
                                        }
                                    }
                                    node11 = node11.getChild$ui();
                                    node10 = node10;
                                    r14 = r14;
                                }
                                if (i5 == 1) {
                                }
                            }
                            node10 = DepthSortedSetKt.access$pop(r14);
                        }
                        if (arrayList != null) {
                            int size2 = arrayList.size();
                            for (int i6 = 0; i6 < size2; i6++) {
                                if (((KeyInputModifierNode) arrayList.get(i6)).mo161onKeyEventZmokQxo(keyEvent)) {
                                    return true;
                                }
                            }
                        }
                    }
                    return false;
                }
            }
            if (!focusTargetNode.getNode().isAttached()) {
                InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
            }
            Modifier.Node parent$ui2 = focusTargetNode.getNode().getParent$ui();
            LayoutNode requireLayoutNode3 = DepthSortedSetKt.requireLayoutNode(focusTargetNode);
            loop15: while (true) {
                if (requireLayoutNode3 == null) {
                    obj = null;
                    break;
                }
                if ((((Modifier.Node) requireLayoutNode3.nodes.head).getAggregateChildKindSet$ui() & PKIFailureInfo.certRevoked) != 0) {
                    while (parent$ui2 != null) {
                        if ((parent$ui2.getKindSet$ui() & PKIFailureInfo.certRevoked) != 0) {
                            Modifier.Node node12 = parent$ui2;
                            MutableVector mutableVector3 = null;
                            while (node12 != null) {
                                if (node12 instanceof KeyInputModifierNode) {
                                    obj = node12;
                                    break loop15;
                                }
                                if ((node12.getKindSet$ui() & PKIFailureInfo.certRevoked) != 0 && (node12 instanceof DelegatingNode)) {
                                    Modifier.Node node13 = ((DelegatingNode) node12).delegate;
                                    int i7 = 0;
                                    node12 = node12;
                                    mutableVector3 = mutableVector3;
                                    while (node13 != null) {
                                        if ((node13.getKindSet$ui() & PKIFailureInfo.certRevoked) != 0) {
                                            i7++;
                                            mutableVector3 = mutableVector3;
                                            if (i7 == 1) {
                                                node12 = node13;
                                            } else {
                                                if (mutableVector3 == null) {
                                                    mutableVector3 = new MutableVector(0, new Modifier.Node[16]);
                                                }
                                                if (node12 != null) {
                                                    mutableVector3.add(node12);
                                                    node12 = null;
                                                }
                                                mutableVector3.add(node13);
                                            }
                                        }
                                        node13 = node13.getChild$ui();
                                        node12 = node12;
                                        mutableVector3 = mutableVector3;
                                    }
                                    if (i7 == 1) {
                                    }
                                }
                                node12 = DepthSortedSetKt.access$pop(mutableVector3);
                            }
                        }
                        parent$ui2 = parent$ui2.getParent$ui();
                    }
                }
                requireLayoutNode3 = requireLayoutNode3.getParent$ui();
                parent$ui2 = (requireLayoutNode3 == null || (nodeChain = requireLayoutNode3.nodes) == null) ? null : (TailModifierNode) nodeChain.tail;
            }
            Object obj4 = (KeyInputModifierNode) obj;
            node = obj4 != null ? ((Modifier.Node) obj4).getNode() : null;
            if (node != null) {
            }
            return false;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x012b, code lost:
    
        continue;
     */
    /* renamed from: focusSearch-ULY8qGw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Boolean m596focusSearchULY8qGw(int i, Rect rect, Function1 function1) {
        boolean z;
        FocusTargetNode focusTargetNode;
        NodeChain nodeChain;
        boolean z2;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = this.owner.layoutDirection$delegate;
        FocusTargetNode focusTargetNode2 = this.rootFocusNode;
        FocusTargetNode findActiveFocusNode = FocusTraversalKt.findActiveFocusNode(focusTargetNode2);
        int i2 = 4;
        if (findActiveFocusNode != null) {
            LayoutDirection layoutDirection = (LayoutDirection) parcelableSnapshotMutableState.getValue();
            FocusPropertiesImpl fetchFocusProperties$ui = findActiveFocusNode.fetchFocusProperties$ui();
            FocusRequester focusRequester = fetchFocusProperties$ui.start;
            FocusRequester focusRequester2 = fetchFocusProperties$ui.end;
            if (i == 1) {
                focusRequester = fetchFocusProperties$ui.next;
            } else if (i == 2) {
                focusRequester = fetchFocusProperties$ui.previous;
            } else if (i == 5) {
                focusRequester = fetchFocusProperties$ui.up;
            } else if (i == 6) {
                focusRequester = fetchFocusProperties$ui.down;
            } else if (i == 3) {
                int ordinal = layoutDirection.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    focusRequester = focusRequester2;
                }
                if (focusRequester == FocusRequester.Default) {
                    focusRequester = null;
                }
                if (focusRequester == null) {
                    focusRequester = fetchFocusProperties$ui.left;
                }
            } else if (i == 4) {
                int ordinal2 = layoutDirection.ordinal();
                if (ordinal2 == 0) {
                    focusRequester = focusRequester2;
                } else if (ordinal2 != 1) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                if (focusRequester == FocusRequester.Default) {
                    focusRequester = null;
                }
                if (focusRequester == null) {
                    focusRequester = fetchFocusProperties$ui.right;
                }
            } else {
                if (i != 7 && i != 8) {
                    a$$ExternalSyntheticBUOutline0.m$1("invalid FocusDirection");
                    return null;
                }
                CancelIndicatingFocusBoundaryScope cancelIndicatingFocusBoundaryScope = new CancelIndicatingFocusBoundaryScope(i);
                FocusOwnerImpl focusOwnerImpl = ((AndroidComposeView) DepthSortedSetKt.requireOwner(findActiveFocusNode)).focusOwner;
                FocusTargetNode activeFocusTargetNode = focusOwnerImpl.getActiveFocusTargetNode();
                if (i == 7) {
                    fetchFocusProperties$ui.onEnter.invoke(cancelIndicatingFocusBoundaryScope);
                } else {
                    fetchFocusProperties$ui.onExit.invoke(cancelIndicatingFocusBoundaryScope);
                }
                focusRequester = cancelIndicatingFocusBoundaryScope.isCanceled ? FocusRequester.Cancel : activeFocusTargetNode != focusOwnerImpl.getActiveFocusTargetNode() ? FocusRequester.Redirect : FocusRequester.Default;
            }
            FocusRequester focusRequester3 = FocusRequester.Cancel;
            if (!Intrinsics.areEqual(focusRequester, focusRequester3)) {
                if (Intrinsics.areEqual(focusRequester, FocusRequester.Redirect)) {
                    FocusTargetNode findActiveFocusNode2 = FocusTraversalKt.findActiveFocusNode(focusTargetNode2);
                    if (findActiveFocusNode2 != null) {
                        return (Boolean) function1.invoke(findActiveFocusNode2);
                    }
                } else {
                    FocusRequester focusRequester4 = FocusRequester.Default;
                    if (!Intrinsics.areEqual(focusRequester, focusRequester4)) {
                        if (focusRequester == focusRequester4) {
                            a$$ExternalSyntheticBUOutline0.m$1("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
                            return null;
                        }
                        if (focusRequester == focusRequester3) {
                            a$$ExternalSyntheticBUOutline0.m$1("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
                            return null;
                        }
                        MutableVector mutableVector = focusRequester.focusRequesterNodes;
                        int i3 = mutableVector.size;
                        if (i3 == 0) {
                            System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
                            z2 = false;
                        } else {
                            Object[] objArr = mutableVector.content;
                            boolean z3 = false;
                            for (int i4 = 0; i4 < i3; i4++) {
                                Object obj = (FocusRequesterModifierNode) objArr[i4];
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
                                    int i5 = mutableVector2.size;
                                    if (i5 != 0) {
                                        Modifier.Node node2 = (Modifier.Node) mutableVector2.removeAt(i5 - 1);
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
                                                            if (((Boolean) function1.invoke((FocusTargetNode) node2)).booleanValue()) {
                                                                z3 = true;
                                                                break;
                                                            }
                                                        } else if ((node2.getKindSet$ui() & 1024) != 0 && (node2 instanceof DelegatingNode)) {
                                                            int i6 = 0;
                                                            for (Modifier.Node node3 = ((DelegatingNode) node2).delegate; node3 != null; node3 = node3.getChild$ui()) {
                                                                if ((node3.getKindSet$ui() & 1024) != 0) {
                                                                    i6++;
                                                                    if (i6 == 1) {
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
                                                            if (i6 == 1) {
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
                            z2 = z3;
                        }
                        return Boolean.valueOf(z2);
                    }
                }
            }
            return null;
        }
        findActiveFocusNode = null;
        LayoutDirection layoutDirection2 = (LayoutDirection) parcelableSnapshotMutableState.getValue();
        FocusOwnerImpl$focusSearch$1 focusOwnerImpl$focusSearch$1 = new FocusOwnerImpl$focusSearch$1(0, findActiveFocusNode, this, function1);
        if (i == 1 || i == 2) {
            return Boolean.valueOf(FocusOwnerImplKt.m602oneDimensionalFocusSearchOMvw8(focusTargetNode2, i, focusOwnerImpl$focusSearch$1));
        }
        if (i == 3 || i == 4 || i == 5 || i == 6) {
            return FocusTraversalKt.m618twoDimensionalFocusSearchsMXa3k8(i, focusOwnerImpl$focusSearch$1, focusTargetNode2, rect);
        }
        if (i == 7) {
            int ordinal3 = layoutDirection2.ordinal();
            if (ordinal3 != 0) {
                if (ordinal3 != 1) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                i2 = 3;
            }
            FocusTargetNode findActiveFocusNode3 = FocusTraversalKt.findActiveFocusNode(focusTargetNode2);
            if (findActiveFocusNode3 != null) {
                return FocusTraversalKt.m618twoDimensionalFocusSearchsMXa3k8(i2, focusOwnerImpl$focusSearch$1, findActiveFocusNode3, rect);
            }
            return null;
        }
        if (i != 8) {
            a$$ExternalSyntheticBUOutline0.m(FocusDirection.m592toStringimpl(i), "Focus search invoked with invalid FocusDirection ");
            return null;
        }
        FocusTargetNode findActiveFocusNode4 = FocusTraversalKt.findActiveFocusNode(focusTargetNode2);
        if (findActiveFocusNode4 != null) {
            if (!findActiveFocusNode4.getNode().isAttached()) {
                InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
            }
            Modifier.Node parent$ui = findActiveFocusNode4.getNode().getParent$ui();
            LayoutNode requireLayoutNode = DepthSortedSetKt.requireLayoutNode(findActiveFocusNode4);
            loop5: while (true) {
                if (requireLayoutNode == null) {
                    focusTargetNode = null;
                    break;
                }
                if ((((Modifier.Node) requireLayoutNode.nodes.head).getAggregateChildKindSet$ui() & 1024) != 0) {
                    while (parent$ui != null) {
                        if ((parent$ui.getKindSet$ui() & 1024) != 0) {
                            Modifier.Node node4 = parent$ui;
                            MutableVector mutableVector4 = null;
                            while (node4 != null) {
                                if (node4 instanceof FocusTargetNode) {
                                    FocusTargetNode focusTargetNode3 = (FocusTargetNode) node4;
                                    if (focusTargetNode3.fetchFocusProperties$ui().canFocus) {
                                        focusTargetNode = focusTargetNode3;
                                        break loop5;
                                    }
                                } else if ((node4.getKindSet$ui() & 1024) != 0 && (node4 instanceof DelegatingNode)) {
                                    int i7 = 0;
                                    for (Modifier.Node node5 = ((DelegatingNode) node4).delegate; node5 != null; node5 = node5.getChild$ui()) {
                                        if ((node5.getKindSet$ui() & 1024) != 0) {
                                            i7++;
                                            if (i7 == 1) {
                                                node4 = node5;
                                            } else {
                                                if (mutableVector4 == null) {
                                                    mutableVector4 = new MutableVector(0, new Modifier.Node[16]);
                                                }
                                                if (node4 != null) {
                                                    mutableVector4.add(node4);
                                                    node4 = null;
                                                }
                                                mutableVector4.add(node5);
                                            }
                                        }
                                    }
                                    if (i7 != 1) {
                                        node4 = DepthSortedSetKt.access$pop(mutableVector4);
                                    }
                                }
                                node4 = DepthSortedSetKt.access$pop(mutableVector4);
                            }
                        }
                        parent$ui = parent$ui.getParent$ui();
                    }
                }
                requireLayoutNode = requireLayoutNode.getParent$ui();
                parent$ui = (requireLayoutNode == null || (nodeChain = requireLayoutNode.nodes) == null) ? null : (TailModifierNode) nodeChain.tail;
            }
            z = false;
        } else {
            z = false;
            focusTargetNode = null;
        }
        return Boolean.valueOf((focusTargetNode == null || focusTargetNode == focusTargetNode2) ? z : ((Boolean) focusOwnerImpl$focusSearch$1.invoke(focusTargetNode)).booleanValue());
    }

    public final FocusTargetNode getActiveFocusTargetNode() {
        FocusTargetNode focusTargetNode = this.activeFocusTargetNode;
        if (focusTargetNode == null || !focusTargetNode.isAttached()) {
            return null;
        }
        return this.activeFocusTargetNode;
    }

    /* renamed from: moveFocus-aToIllA, reason: not valid java name */
    public final boolean m597moveFocusaToIllA(int i, boolean z) {
        FocusTargetNode activeFocusTargetNode = getActiveFocusTargetNode();
        AndroidComposeView androidComposeView = this.platformFocusOwner;
        int i2 = 1;
        if (activeFocusTargetNode == null || !activeFocusTargetNode.isInteropViewHost || !androidComposeView.m918moveFocusInChildren3ESFkO8(i)) {
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            ref$ObjectRef.element = Boolean.FALSE;
            FocusTargetNode activeFocusTargetNode2 = getActiveFocusTargetNode();
            Boolean m596focusSearchULY8qGw = m596focusSearchULY8qGw(i, androidComposeView.getEmbeddedViewFocusRect(), new SizeConfigSmartLambdas$wrapContent$1(ref$ObjectRef, i, i2));
            if (!Intrinsics.areEqual(m596focusSearchULY8qGw, Boolean.TRUE) || activeFocusTargetNode2 == getActiveFocusTargetNode()) {
                if (m596focusSearchULY8qGw != null && ref$ObjectRef.element != null) {
                    if (!m596focusSearchULY8qGw.booleanValue() || !((Boolean) ref$ObjectRef.element).booleanValue()) {
                        if (FocusOwnerImplKt.m601is1dFocusSearch3ESFkO8(i) && z && m594clearFocusI7lrPNg(i, false, false)) {
                            Boolean m596focusSearchULY8qGw2 = m596focusSearchULY8qGw(i, null, new ContourLayout$matchParentX$1(i, 2));
                            if (m596focusSearchULY8qGw2 != null ? m596focusSearchULY8qGw2.booleanValue() : false) {
                            }
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    /* renamed from: resetFocus-3ESFkO8, reason: not valid java name */
    public final boolean m598resetFocus3ESFkO8(int i) {
        if (!m594clearFocusI7lrPNg(i, false, false)) {
            return false;
        }
        Boolean m596focusSearchULY8qGw = m596focusSearchULY8qGw(i, null, new ContourLayout$matchParentX$1(i, 1));
        boolean booleanValue = m596focusSearchULY8qGw != null ? m596focusSearchULY8qGw.booleanValue() : false;
        if (!booleanValue) {
            clearOwnerFocus();
        }
        return booleanValue;
    }

    public final void setActiveFocusTargetNode(FocusTargetNode focusTargetNode) {
        FocusTargetNode focusTargetNode2 = this.activeFocusTargetNode;
        this.activeFocusTargetNode = focusTargetNode;
        MutableObjectList mutableObjectList = this.listeners;
        Object[] objArr = mutableObjectList.content;
        int i = mutableObjectList._size;
        for (int i2 = 0; i2 < i; i2++) {
            ((FocusListener) objArr[i2]).onFocusChanged(focusTargetNode2, focusTargetNode);
        }
    }

    public final void clearFocus(boolean z) {
        m594clearFocusI7lrPNg(8, z, true);
    }
}
