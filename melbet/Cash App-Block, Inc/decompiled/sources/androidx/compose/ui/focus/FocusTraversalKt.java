package androidx.compose.ui.focus;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.ValueInsets;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.TailModifierNode;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.contour.ContourLayout$geometry$1;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class FocusTraversalKt {
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004a, code lost:
    
        if (r21 != 3) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004d, code lost:
    
        if (r21 != 4) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0050, code lost:
    
        if (r21 != 3) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
    
        r1 = r11 - r19.right;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006d, code lost:
    
        if (r1 >= androidx.recyclerview.widget.RecyclerView.DECELERATION_RATE) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006f, code lost:
    
        r1 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0071, code lost:
    
        if (r21 != 3) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0073, code lost:
    
        r11 = r11 - r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0087, code lost:
    
        if (r11 >= 1.0f) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0089, code lost:
    
        r11 = 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008c, code lost:
    
        if (r1 >= r11) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008e, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0075, code lost:
    
        if (r21 != 4) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0077, code lost:
    
        r11 = r2 - r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007a, code lost:
    
        if (r21 != 5) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007c, code lost:
    
        r11 = r9 - r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007f, code lost:
    
        if (r21 != 6) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0081, code lost:
    
        r11 = r6 - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0090, code lost:
    
        bo.app.a$$ExternalSyntheticBUOutline0.m$1("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0093, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0057, code lost:
    
        if (r21 != 4) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0059, code lost:
    
        r1 = r19.left - r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x005d, code lost:
    
        if (r21 != 5) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x005f, code lost:
    
        r1 = r9 - r19.bottom;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0064, code lost:
    
        if (r21 != 6) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0066, code lost:
    
        r1 = r19.top - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0094, code lost:
    
        bo.app.a$$ExternalSyntheticBUOutline0.m$1("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0097, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x004f, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x003a, code lost:
    
        if (r10 <= r7) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0041, code lost:
    
        if (r9 >= r6) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0048, code lost:
    
        if (r8 <= r5) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0033, code lost:
    
        if (r11 >= r2) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0098, code lost:
    
        return true;
     */
    /* renamed from: beamBeats-I7lrPNg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean m609beamBeatsI7lrPNg(Rect rect, Rect rect2, Rect rect3, int i) {
        boolean beamBeats_I7lrPNg$inSourceBeam = beamBeats_I7lrPNg$inSourceBeam(i, rect3, rect);
        float f = rect3.top;
        float f2 = rect3.bottom;
        float f3 = rect3.left;
        float f4 = rect3.right;
        float f5 = rect.bottom;
        float f6 = rect.top;
        float f7 = rect.right;
        float f8 = rect.left;
        if (!beamBeats_I7lrPNg$inSourceBeam && beamBeats_I7lrPNg$inSourceBeam(i, rect2, rect)) {
            if (i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        if (i != 6) {
                            a$$ExternalSyntheticBUOutline0.m$1("This function should only be used for 2-D focus search");
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final boolean beamBeats_I7lrPNg$inSourceBeam(int i, Rect rect, Rect rect2) {
        if (i == 3 || i == 4) {
            return rect.bottom > rect2.top && rect.top < rect2.bottom;
        }
        if (i == 5 || i == 6) {
            return rect.right > rect2.left && rect.left < rect2.right;
        }
        a$$ExternalSyntheticBUOutline0.m$1("This function should only be used for 2-D focus search");
        return false;
    }

    public static final boolean clearFocus(FocusTargetNode focusTargetNode, boolean z) {
        int ordinal = focusTargetNode.getFocusState$1().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                FocusTargetNode activeChild = getActiveChild(focusTargetNode);
                if (!(activeChild != null ? clearFocus(activeChild, z) : true)) {
                    return false;
                }
                focusTargetNode.dispatchFocusCallbacks$ui(FocusStateImpl.ActiveParent, FocusStateImpl.Inactive);
                return true;
            }
            if (ordinal == 2) {
                return z;
            }
            if (ordinal != 3) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return false;
            }
        }
        return true;
    }

    public static final void collectAccessibleChildren(FocusTargetNode focusTargetNode, MutableVector mutableVector) {
        if (!focusTargetNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
        }
        MutableVector mutableVector2 = new MutableVector(0, new Modifier.Node[16]);
        Modifier.Node child$ui = focusTargetNode.getNode().getChild$ui();
        if (child$ui == null) {
            DepthSortedSetKt.access$addLayoutNodeChildren(mutableVector2, focusTargetNode.getNode());
        } else {
            mutableVector2.add(child$ui);
        }
        while (true) {
            int i = mutableVector2.size;
            if (i == 0) {
                return;
            }
            Modifier.Node node = (Modifier.Node) mutableVector2.removeAt(i - 1);
            if ((node.getAggregateChildKindSet$ui() & 1024) == 0) {
                DepthSortedSetKt.access$addLayoutNodeChildren(mutableVector2, node);
            } else {
                while (true) {
                    if (node == null) {
                        break;
                    }
                    if ((node.getKindSet$ui() & 1024) != 0) {
                        MutableVector mutableVector3 = null;
                        while (node != null) {
                            if (node instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) node;
                                if (focusTargetNode2.isAttached() && !DepthSortedSetKt.requireLayoutNode(focusTargetNode2).isDeactivated) {
                                    if (focusTargetNode2.fetchFocusProperties$ui().canFocus) {
                                        mutableVector.add(focusTargetNode2);
                                    } else {
                                        collectAccessibleChildren(focusTargetNode2, mutableVector);
                                    }
                                }
                            } else if ((node.getKindSet$ui() & 1024) != 0 && (node instanceof DelegatingNode)) {
                                int i2 = 0;
                                for (Modifier.Node node2 = ((DelegatingNode) node).delegate; node2 != null; node2 = node2.getChild$ui()) {
                                    if ((node2.getKindSet$ui() & 1024) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            node = node2;
                                        } else {
                                            if (mutableVector3 == null) {
                                                mutableVector3 = new MutableVector(0, new Modifier.Node[16]);
                                            }
                                            if (node != null) {
                                                mutableVector3.add(node);
                                                node = null;
                                            }
                                            mutableVector3.add(node2);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            node = DepthSortedSetKt.access$pop(mutableVector3);
                        }
                    } else {
                        node = node.getChild$ui();
                    }
                }
            }
        }
    }

    public static final FocusTargetNode findActiveFocusNode(FocusTargetNode focusTargetNode) {
        FocusTargetNode activeFocusTargetNode = ((AndroidComposeView) DepthSortedSetKt.requireOwner(focusTargetNode)).focusOwner.getActiveFocusTargetNode();
        if (activeFocusTargetNode == null || !activeFocusTargetNode.isAttached()) {
            return null;
        }
        return activeFocusTargetNode;
    }

    /* renamed from: findBestCandidate-4WY_MpI, reason: not valid java name */
    public static final FocusTargetNode m610findBestCandidate4WY_MpI(MutableVector mutableVector, Rect rect, int i) {
        Rect translate;
        FocusTargetNode focusTargetNode = null;
        if (i == 3) {
            translate = rect.translate((rect.right - rect.left) + 1.0f, RecyclerView.DECELERATION_RATE);
        } else if (i == 4) {
            translate = rect.translate(-((rect.right - rect.left) + 1.0f), RecyclerView.DECELERATION_RATE);
        } else if (i == 5) {
            translate = rect.translate(RecyclerView.DECELERATION_RATE, (rect.bottom - rect.top) + 1.0f);
        } else {
            if (i != 6) {
                a$$ExternalSyntheticBUOutline0.m$1("This function should only be used for 2-D focus search");
                return null;
            }
            translate = rect.translate(RecyclerView.DECELERATION_RATE, -((rect.bottom - rect.top) + 1.0f));
        }
        Object[] objArr = mutableVector.content;
        int i2 = mutableVector.size;
        for (int i3 = 0; i3 < i2; i3++) {
            FocusTargetNode focusTargetNode2 = (FocusTargetNode) objArr[i3];
            if (isEligibleForFocusSearch(focusTargetNode2)) {
                Rect focusRect = focusRect(focusTargetNode2);
                if (m613isBetterCandidateI7lrPNg(focusRect, translate, rect, i)) {
                    focusTargetNode = focusTargetNode2;
                    translate = focusRect;
                }
            }
        }
        return focusTargetNode;
    }

    /* renamed from: findChildCorrespondingToFocusEnter--OM-vw8, reason: not valid java name */
    public static final boolean m611findChildCorrespondingToFocusEnterOMvw8(FocusTargetNode focusTargetNode, int i, Function1 function1) {
        Rect rect;
        MutableVector mutableVector = new MutableVector(0, new FocusTargetNode[16]);
        collectAccessibleChildren(focusTargetNode, mutableVector);
        int i2 = mutableVector.size;
        if (i2 <= 1) {
            FocusTargetNode focusTargetNode2 = (FocusTargetNode) (i2 == 0 ? null : mutableVector.content[0]);
            if (focusTargetNode2 != null) {
                return ((Boolean) function1.invoke(focusTargetNode2)).booleanValue();
            }
        } else {
            if (i == 7) {
                i = 4;
            }
            if (i == 4 || i == 6) {
                Rect focusRect = focusRect(focusTargetNode);
                float f = focusRect.left;
                float f2 = focusRect.top;
                rect = new Rect(f, f2, f, f2);
            } else {
                if (i != 3 && i != 5) {
                    a$$ExternalSyntheticBUOutline0.m$1("This function should only be used for 2-D focus search");
                    return false;
                }
                Rect focusRect2 = focusRect(focusTargetNode);
                float f3 = focusRect2.right;
                float f4 = focusRect2.bottom;
                rect = new Rect(f3, f4, f3, f4);
            }
            FocusTargetNode m610findBestCandidate4WY_MpI = m610findBestCandidate4WY_MpI(mutableVector, rect, i);
            if (m610findBestCandidate4WY_MpI != null) {
                return ((Boolean) function1.invoke(m610findBestCandidate4WY_MpI)).booleanValue();
            }
        }
        return false;
    }

    public static final Rect focusRect(FocusTargetNode focusTargetNode) {
        NodeCoordinator coordinator$ui;
        boolean isAttached = focusTargetNode.isAttached();
        Rect rect = Rect.Zero;
        if (isAttached && (coordinator$ui = focusTargetNode.getCoordinator$ui()) != null) {
            LayoutCoordinates findRootCoordinates = ValueInsets.findRootCoordinates(coordinator$ui);
            if (!findRootCoordinates.isAttached()) {
                findRootCoordinates = null;
            }
            if (findRootCoordinates != null) {
                return focusTargetNode.fetchFocusRect$ui(findRootCoordinates);
            }
        }
        return rect;
    }

    public static final Modifier focusRequester(Modifier modifier, FocusRequester focusRequester) {
        return modifier.then(new FocusRequesterElement(focusRequester));
    }

    public static final boolean freeFocus(FocusTargetNode focusTargetNode) {
        int ordinal = focusTargetNode.getFocusState$1().ordinal();
        if (ordinal == 0) {
            return true;
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                ((AndroidComposeView) DepthSortedSetKt.requireOwner(focusTargetNode)).focusOwner.getClass();
                focusTargetNode.dispatchFocusCallbacks$ui(FocusStateImpl.Captured, FocusStateImpl.Active);
                return true;
            }
            if (ordinal != 3) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return false;
            }
        }
        return false;
    }

    /* renamed from: generateAndSearchChildren-4C6V_qg, reason: not valid java name */
    public static final boolean m612generateAndSearchChildren4C6V_qg(int i, FocusOwnerImpl$focusSearch$1 focusOwnerImpl$focusSearch$1, FocusTargetNode focusTargetNode, Rect rect) {
        if (m617searchChildren4C6V_qg(i, focusOwnerImpl$focusSearch$1, focusTargetNode, rect)) {
            return true;
        }
        Boolean bool = (Boolean) FocusOwnerImplKt.m603searchBeyondBoundsOMvw8(focusTargetNode, i, new OneDimensionalFocusSearchKt$generateAndSearchChildren$1(((AndroidComposeView) DepthSortedSetKt.requireOwner(focusTargetNode)).focusOwner.getActiveFocusTargetNode(), focusTargetNode, rect, i, focusOwnerImpl$focusSearch$1, 1));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x003c, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final FocusTargetNode getActiveChild(FocusTargetNode focusTargetNode) {
        FocusTargetNode focusTargetNode2;
        if (focusTargetNode.getNode().isAttached()) {
            if (!focusTargetNode.getNode().isAttached()) {
                InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
            }
            MutableVector mutableVector = new MutableVector(0, new Modifier.Node[16]);
            Modifier.Node child$ui = focusTargetNode.getNode().getChild$ui();
            if (child$ui == null) {
                DepthSortedSetKt.access$addLayoutNodeChildren(mutableVector, focusTargetNode.getNode());
            } else {
                mutableVector.add(child$ui);
            }
            loop0: while (true) {
                int i = mutableVector.size;
                if (i == 0) {
                    break;
                }
                Modifier.Node node = (Modifier.Node) mutableVector.removeAt(i - 1);
                if ((node.getAggregateChildKindSet$ui() & 1024) == 0) {
                    DepthSortedSetKt.access$addLayoutNodeChildren(mutableVector, node);
                } else {
                    while (true) {
                        if (node == null) {
                            break;
                        }
                        if ((node.getKindSet$ui() & 1024) != 0) {
                            MutableVector mutableVector2 = null;
                            while (node != null) {
                                if (node instanceof FocusTargetNode) {
                                    focusTargetNode2 = (FocusTargetNode) node;
                                    if (focusTargetNode2.getNode().isAttached()) {
                                        int ordinal = focusTargetNode2.getFocusState$1().ordinal();
                                        if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
                                            break loop0;
                                        }
                                        if (ordinal != 3) {
                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                            return null;
                                        }
                                    }
                                } else if ((node.getKindSet$ui() & 1024) != 0 && (node instanceof DelegatingNode)) {
                                    int i2 = 0;
                                    for (Modifier.Node node2 = ((DelegatingNode) node).delegate; node2 != null; node2 = node2.getChild$ui()) {
                                        if ((node2.getKindSet$ui() & 1024) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                node = node2;
                                            } else {
                                                if (mutableVector2 == null) {
                                                    mutableVector2 = new MutableVector(0, new Modifier.Node[16]);
                                                }
                                                if (node != null) {
                                                    mutableVector2.add(node);
                                                    node = null;
                                                }
                                                mutableVector2.add(node2);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                node = DepthSortedSetKt.access$pop(mutableVector2);
                            }
                        } else {
                            node = node.getChild$ui();
                        }
                    }
                }
            }
            return focusTargetNode2;
        }
        return null;
    }

    /* renamed from: isBetterCandidate-I7lrPNg, reason: not valid java name */
    public static final boolean m613isBetterCandidateI7lrPNg(Rect rect, Rect rect2, Rect rect3, int i) {
        if (!isBetterCandidate_I7lrPNg$isCandidate(i, rect, rect3)) {
            return false;
        }
        if (isBetterCandidate_I7lrPNg$isCandidate(i, rect2, rect3) && !m609beamBeatsI7lrPNg(rect3, rect, rect2, i)) {
            return !m609beamBeatsI7lrPNg(rect3, rect2, rect, i) && isBetterCandidate_I7lrPNg$weightedDistance(i, rect3, rect) < isBetterCandidate_I7lrPNg$weightedDistance(i, rect3, rect2);
        }
        return true;
    }

    public static final boolean isBetterCandidate_I7lrPNg$isCandidate(int i, Rect rect, Rect rect2) {
        if (i == 3) {
            float f = rect2.right;
            float f2 = rect2.left;
            float f3 = rect.right;
            return (f > f3 || f2 >= f3) && f2 > rect.left;
        }
        if (i == 4) {
            float f4 = rect2.left;
            float f5 = rect2.right;
            float f6 = rect.left;
            return (f4 < f6 || f5 <= f6) && f5 < rect.right;
        }
        if (i == 5) {
            float f7 = rect2.bottom;
            float f8 = rect2.top;
            float f9 = rect.bottom;
            return (f7 > f9 || f8 >= f9) && f8 > rect.top;
        }
        if (i != 6) {
            a$$ExternalSyntheticBUOutline0.m$1("This function should only be used for 2-D focus search");
            return false;
        }
        float f10 = rect2.top;
        float f11 = rect2.bottom;
        float f12 = rect.top;
        return (f10 < f12 || f11 <= f12) && f11 < rect.bottom;
    }

    public static final long isBetterCandidate_I7lrPNg$weightedDistance(int i, Rect rect, Rect rect2) {
        float f;
        float f2;
        float m;
        float f3;
        float f4;
        if (i == 3) {
            f = rect.left;
            f2 = rect2.right;
        } else if (i == 4) {
            f = rect2.left;
            f2 = rect.right;
        } else if (i == 5) {
            f = rect.top;
            f2 = rect2.bottom;
        } else {
            if (i != 6) {
                a$$ExternalSyntheticBUOutline0.m$1("This function should only be used for 2-D focus search");
                return 0L;
            }
            f = rect2.top;
            f2 = rect.bottom;
        }
        float f5 = f - f2;
        if (f5 < RecyclerView.DECELERATION_RATE) {
            f5 = 0.0f;
        }
        long j = (long) f5;
        if (i == 3 || i == 4) {
            float f6 = rect.top;
            m = Recorder$$ExternalSyntheticOutline2.m(rect.bottom, f6, 2.0f, f6);
            f3 = rect2.top;
            f4 = rect2.bottom;
        } else {
            if (i != 5 && i != 6) {
                a$$ExternalSyntheticBUOutline0.m$1("This function should only be used for 2-D focus search");
                return 0L;
            }
            float f7 = rect.left;
            m = Recorder$$ExternalSyntheticOutline2.m(rect.right, f7, 2.0f, f7);
            f3 = rect2.left;
            f4 = rect2.right;
        }
        long j2 = (long) (m - (((f4 - f3) / 2.0f) + f3));
        return (j2 * j2) + (13 * j * j);
    }

    public static final boolean isEligibleForFocusSearch(FocusTargetNode focusTargetNode) {
        LayoutNode layoutNode;
        NodeCoordinator coordinator$ui;
        LayoutNode layoutNode2;
        NodeCoordinator coordinator$ui2 = focusTargetNode.getCoordinator$ui();
        return (coordinator$ui2 == null || (layoutNode = coordinator$ui2.layoutNode) == null || !layoutNode.isPlaced() || (coordinator$ui = focusTargetNode.getCoordinator$ui()) == null || (layoutNode2 = coordinator$ui.layoutNode) == null || !layoutNode2.isAttached()) ? false : true;
    }

    /* renamed from: performCustomClearFocus-Mxy_nc0, reason: not valid java name */
    public static final CustomDestinationResult m614performCustomClearFocusMxy_nc0(FocusTargetNode focusTargetNode, int i) {
        int ordinal = focusTargetNode.getFocusState$1().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                FocusTargetNode activeChild = getActiveChild(focusTargetNode);
                if (activeChild == null) {
                    a$$ExternalSyntheticBUOutline0.m$3("ActiveParent with no focused child");
                    return null;
                }
                CustomDestinationResult m614performCustomClearFocusMxy_nc0 = m614performCustomClearFocusMxy_nc0(activeChild, i);
                CustomDestinationResult customDestinationResult = CustomDestinationResult.None;
                CustomDestinationResult customDestinationResult2 = m614performCustomClearFocusMxy_nc0 != customDestinationResult ? m614performCustomClearFocusMxy_nc0 : null;
                if (customDestinationResult2 != null) {
                    return customDestinationResult2;
                }
                if (focusTargetNode.isProcessingCustomExit) {
                    return customDestinationResult;
                }
                focusTargetNode.isProcessingCustomExit = true;
                try {
                    FocusPropertiesImpl fetchFocusProperties$ui = focusTargetNode.fetchFocusProperties$ui();
                    CancelIndicatingFocusBoundaryScope cancelIndicatingFocusBoundaryScope = new CancelIndicatingFocusBoundaryScope(i);
                    FocusOwnerImpl focusOwnerImpl = ((AndroidComposeView) DepthSortedSetKt.requireOwner(focusTargetNode)).focusOwner;
                    FocusTargetNode activeFocusTargetNode = focusOwnerImpl.getActiveFocusTargetNode();
                    fetchFocusProperties$ui.onExit.invoke(cancelIndicatingFocusBoundaryScope);
                    FocusTargetNode activeFocusTargetNode2 = focusOwnerImpl.getActiveFocusTargetNode();
                    if (!cancelIndicatingFocusBoundaryScope.isCanceled) {
                        return (activeFocusTargetNode == activeFocusTargetNode2 || activeFocusTargetNode2 == null) ? customDestinationResult : FocusRequester.Redirect == FocusRequester.Cancel ? CustomDestinationResult.Cancelled : CustomDestinationResult.Redirected;
                    }
                    FocusRequester focusRequester = FocusRequester.Default;
                    return CustomDestinationResult.Cancelled;
                } finally {
                    focusTargetNode.isProcessingCustomExit = false;
                }
            }
            if (ordinal == 2) {
                return CustomDestinationResult.Cancelled;
            }
            if (ordinal != 3) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
        }
        return CustomDestinationResult.None;
    }

    /* renamed from: performCustomEnter-Mxy_nc0, reason: not valid java name */
    public static final CustomDestinationResult m615performCustomEnterMxy_nc0(FocusTargetNode focusTargetNode, int i) {
        if (!focusTargetNode.isProcessingCustomEnter) {
            focusTargetNode.isProcessingCustomEnter = true;
            try {
                FocusPropertiesImpl fetchFocusProperties$ui = focusTargetNode.fetchFocusProperties$ui();
                CancelIndicatingFocusBoundaryScope cancelIndicatingFocusBoundaryScope = new CancelIndicatingFocusBoundaryScope(i);
                FocusOwnerImpl focusOwnerImpl = ((AndroidComposeView) DepthSortedSetKt.requireOwner(focusTargetNode)).focusOwner;
                FocusTargetNode activeFocusTargetNode = focusOwnerImpl.getActiveFocusTargetNode();
                fetchFocusProperties$ui.onEnter.invoke(cancelIndicatingFocusBoundaryScope);
                FocusTargetNode activeFocusTargetNode2 = focusOwnerImpl.getActiveFocusTargetNode();
                if (cancelIndicatingFocusBoundaryScope.isCanceled) {
                    FocusRequester focusRequester = FocusRequester.Default;
                    return CustomDestinationResult.Cancelled;
                }
                if (activeFocusTargetNode != activeFocusTargetNode2 && activeFocusTargetNode2 != null) {
                    return FocusRequester.Redirect == FocusRequester.Cancel ? CustomDestinationResult.Cancelled : CustomDestinationResult.Redirected;
                }
            } finally {
                focusTargetNode.isProcessingCustomEnter = false;
            }
        }
        return CustomDestinationResult.None;
    }

    /* renamed from: performCustomRequestFocus-Mxy_nc0, reason: not valid java name */
    public static final CustomDestinationResult m616performCustomRequestFocusMxy_nc0(FocusTargetNode focusTargetNode, int i) {
        Modifier.Node node;
        NodeChain nodeChain;
        int ordinal = focusTargetNode.getFocusState$1().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                FocusTargetNode activeChild = getActiveChild(focusTargetNode);
                if (activeChild != null) {
                    return m614performCustomClearFocusMxy_nc0(activeChild, i);
                }
                a$$ExternalSyntheticBUOutline0.m$3("ActiveParent with no focused child");
                return null;
            }
            if (ordinal != 2) {
                if (ordinal != 3) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                if (!focusTargetNode.getNode().isAttached()) {
                    InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
                }
                Modifier.Node parent$ui = focusTargetNode.getNode().getParent$ui();
                LayoutNode requireLayoutNode = DepthSortedSetKt.requireLayoutNode(focusTargetNode);
                loop0: while (true) {
                    if (requireLayoutNode == null) {
                        node = null;
                        break;
                    }
                    if ((((Modifier.Node) requireLayoutNode.nodes.head).getAggregateChildKindSet$ui() & 1024) != 0) {
                        while (parent$ui != null) {
                            if ((parent$ui.getKindSet$ui() & 1024) != 0) {
                                node = parent$ui;
                                MutableVector mutableVector = null;
                                while (node != null) {
                                    if (node instanceof FocusTargetNode) {
                                        break loop0;
                                    }
                                    if ((node.getKindSet$ui() & 1024) != 0 && (node instanceof DelegatingNode)) {
                                        int i2 = 0;
                                        for (Modifier.Node node2 = ((DelegatingNode) node).delegate; node2 != null; node2 = node2.getChild$ui()) {
                                            if ((node2.getKindSet$ui() & 1024) != 0) {
                                                i2++;
                                                if (i2 == 1) {
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
                                        if (i2 == 1) {
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
                FocusTargetNode focusTargetNode2 = (FocusTargetNode) node;
                if (focusTargetNode2 == null) {
                    return CustomDestinationResult.None;
                }
                int ordinal2 = focusTargetNode2.getFocusState$1().ordinal();
                if (ordinal2 == 0) {
                    return m615performCustomEnterMxy_nc0(focusTargetNode2, i);
                }
                if (ordinal2 == 1) {
                    return m616performCustomRequestFocusMxy_nc0(focusTargetNode2, i);
                }
                if (ordinal2 == 2) {
                    return CustomDestinationResult.Cancelled;
                }
                if (ordinal2 != 3) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                CustomDestinationResult m616performCustomRequestFocusMxy_nc0 = m616performCustomRequestFocusMxy_nc0(focusTargetNode2, i);
                CustomDestinationResult customDestinationResult = m616performCustomRequestFocusMxy_nc0 != CustomDestinationResult.None ? m616performCustomRequestFocusMxy_nc0 : null;
                return customDestinationResult == null ? m615performCustomEnterMxy_nc0(focusTargetNode2, i) : customDestinationResult;
            }
        }
        return CustomDestinationResult.None;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v49, types: [java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v19, types: [java.lang.Object, java.lang.Object[]] */
    public static final boolean performRequestFocus(FocusTargetNode focusTargetNode) {
        MutableVector mutableVector;
        NodeChain nodeChain;
        FocusOwnerImpl focusOwnerImpl;
        boolean z;
        int i;
        MutableVector mutableVector2;
        int i2;
        int i3;
        NodeChain nodeChain2;
        FocusOwnerImpl focusOwnerImpl2 = ((AndroidComposeView) DepthSortedSetKt.requireOwner(focusTargetNode)).focusOwner;
        FocusTargetNode activeFocusTargetNode = focusOwnerImpl2.getActiveFocusTargetNode();
        FocusStateImpl focusState$1 = focusTargetNode.getFocusState$1();
        if (activeFocusTargetNode == focusTargetNode) {
            focusTargetNode.dispatchFocusCallbacks$ui(focusState$1, focusState$1);
            return true;
        }
        if ((activeFocusTargetNode == null || activeFocusTargetNode.isInteropViewHost) && !focusTargetNode.isInteropViewHost && !((AndroidComposeView) DepthSortedSetKt.requireOwner(focusTargetNode)).focusOwner.platformFocusOwner.m919requestOwnerFocus7o62pno()) {
            return false;
        }
        if (activeFocusTargetNode != null) {
            mutableVector = new MutableVector(0, new FocusTargetNode[16]);
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
                            MutableVector mutableVector3 = null;
                            while (node != null) {
                                if (node instanceof FocusTargetNode) {
                                    mutableVector.add((FocusTargetNode) node);
                                } else if ((node.getKindSet$ui() & 1024) != 0 && (node instanceof DelegatingNode)) {
                                    int i4 = 0;
                                    for (Modifier.Node node2 = ((DelegatingNode) node).delegate; node2 != null; node2 = node2.getChild$ui()) {
                                        if ((node2.getKindSet$ui() & 1024) != 0) {
                                            i4++;
                                            if (i4 == 1) {
                                                node = node2;
                                            } else {
                                                if (mutableVector3 == null) {
                                                    mutableVector3 = new MutableVector(0, new Modifier.Node[16]);
                                                }
                                                if (node != null) {
                                                    mutableVector3.add(node);
                                                    node = null;
                                                }
                                                mutableVector3.add(node2);
                                            }
                                        }
                                    }
                                    if (i4 == 1) {
                                    }
                                }
                                node = DepthSortedSetKt.access$pop(mutableVector3);
                            }
                        }
                        parent$ui = parent$ui.getParent$ui();
                    }
                }
                requireLayoutNode = requireLayoutNode.getParent$ui();
                parent$ui = (requireLayoutNode == null || (nodeChain2 = requireLayoutNode.nodes) == null) ? null : (TailModifierNode) nodeChain2.tail;
            }
        } else {
            mutableVector = null;
        }
        FocusTargetNode[] focusTargetNodeArr = new FocusTargetNode[16];
        FocusTargetNode[] focusTargetNodeArr2 = new FocusTargetNode[16];
        if (!focusTargetNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node parent$ui2 = focusTargetNode.getNode().getParent$ui();
        LayoutNode requireLayoutNode2 = DepthSortedSetKt.requireLayoutNode(focusTargetNode);
        boolean z2 = true;
        int i5 = 0;
        int i6 = 0;
        while (requireLayoutNode2 != null) {
            if ((((Modifier.Node) requireLayoutNode2.nodes.head).getAggregateChildKindSet$ui() & 1024) != 0) {
                while (parent$ui2 != null) {
                    if ((parent$ui2.getKindSet$ui() & 1024) != 0) {
                        Modifier.Node node3 = parent$ui2;
                        MutableVector mutableVector4 = null;
                        while (node3 != null) {
                            if (node3 instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = node3;
                                if (Intrinsics.areEqual(mutableVector != null ? Boolean.valueOf(mutableVector.remove(focusTargetNode2)) : null, Boolean.TRUE)) {
                                    int i7 = i5 + 1;
                                    if (focusTargetNodeArr.length < i7) {
                                        int length = focusTargetNodeArr.length;
                                        focusOwnerImpl = focusOwnerImpl2;
                                        ?? r1 = new Object[Math.max(i7, length * 2)];
                                        i3 = i7;
                                        System.arraycopy(focusTargetNodeArr, 0, r1, 0, length);
                                        focusTargetNodeArr = r1;
                                    } else {
                                        focusOwnerImpl = focusOwnerImpl2;
                                        i3 = i7;
                                    }
                                    focusTargetNodeArr[i5] = focusTargetNode2;
                                    i5 = i3;
                                } else {
                                    focusOwnerImpl = focusOwnerImpl2;
                                    int i8 = i6 + 1;
                                    if (focusTargetNodeArr2.length < i8) {
                                        int length2 = focusTargetNodeArr2.length;
                                        ?? r5 = new Object[Math.max(i8, length2 * 2)];
                                        i2 = i8;
                                        System.arraycopy(focusTargetNodeArr2, 0, r5, 0, length2);
                                        focusTargetNodeArr2 = r5;
                                    } else {
                                        i2 = i8;
                                    }
                                    focusTargetNodeArr2[i6] = focusTargetNode2;
                                    i6 = i2;
                                }
                                if (focusTargetNode2 == activeFocusTargetNode) {
                                    z2 = false;
                                }
                                z = false;
                            } else {
                                focusOwnerImpl = focusOwnerImpl2;
                                z = true;
                            }
                            if (z && (node3.getKindSet$ui() & 1024) != 0 && (node3 instanceof DelegatingNode)) {
                                int i9 = 0;
                                for (Modifier.Node node4 = ((DelegatingNode) node3).delegate; node4 != null; node4 = node4.getChild$ui()) {
                                    if ((node4.getKindSet$ui() & 1024) != 0) {
                                        int i10 = i9 + 1;
                                        if (i10 == 1) {
                                            node3 = node4;
                                            i = i10;
                                        } else {
                                            if (mutableVector4 == null) {
                                                i = i10;
                                                mutableVector2 = new MutableVector(0, new Modifier.Node[16]);
                                            } else {
                                                i = i10;
                                                mutableVector2 = mutableVector4;
                                            }
                                            if (node3 != null) {
                                                mutableVector2.add(node3);
                                                node3 = null;
                                            }
                                            mutableVector2.add(node4);
                                            mutableVector4 = mutableVector2;
                                        }
                                        i9 = i;
                                    }
                                }
                                if (i9 == 1) {
                                    focusOwnerImpl2 = focusOwnerImpl;
                                }
                            }
                            node3 = DepthSortedSetKt.access$pop(mutableVector4);
                            focusOwnerImpl2 = focusOwnerImpl;
                        }
                    }
                    parent$ui2 = parent$ui2.getParent$ui();
                    focusOwnerImpl2 = focusOwnerImpl2;
                }
            }
            FocusOwnerImpl focusOwnerImpl3 = focusOwnerImpl2;
            requireLayoutNode2 = requireLayoutNode2.getParent$ui();
            parent$ui2 = (requireLayoutNode2 == null || (nodeChain = requireLayoutNode2.nodes) == null) ? null : (TailModifierNode) nodeChain.tail;
            focusOwnerImpl2 = focusOwnerImpl3;
        }
        FocusOwnerImpl focusOwnerImpl4 = focusOwnerImpl2;
        if (!z2 || activeFocusTargetNode == null || clearFocus(activeFocusTargetNode, false)) {
            DepthSortedSetKt.observeReads(focusTargetNode, new ContourLayout$geometry$1(focusTargetNode, 1));
            int ordinal = focusTargetNode.getFocusState$1().ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return false;
                        }
                    }
                }
                ((AndroidComposeView) DepthSortedSetKt.requireOwner(focusTargetNode)).focusOwner.setActiveFocusTargetNode(focusTargetNode);
            }
            if (z2 && activeFocusTargetNode != null) {
                activeFocusTargetNode.dispatchFocusCallbacks$ui(FocusStateImpl.Active, FocusStateImpl.Inactive);
            }
            if (mutableVector != null) {
                int i11 = mutableVector.size - 1;
                Object[] objArr = mutableVector.content;
                if (i11 < objArr.length) {
                    while (i11 >= 0) {
                        FocusTargetNode focusTargetNode3 = (FocusTargetNode) objArr[i11];
                        if (focusOwnerImpl4.getActiveFocusTargetNode() != focusTargetNode) {
                            break;
                        }
                        focusTargetNode3.dispatchFocusCallbacks$ui(FocusStateImpl.ActiveParent, FocusStateImpl.Inactive);
                        i11--;
                    }
                }
            }
            int i12 = i6 - 1;
            if (i12 < focusTargetNodeArr2.length) {
                while (i12 >= 0) {
                    FocusTargetNode focusTargetNode4 = focusTargetNodeArr2[i12];
                    if (focusOwnerImpl4.getActiveFocusTargetNode() != focusTargetNode) {
                        break;
                    }
                    focusTargetNode4.dispatchFocusCallbacks$ui(focusTargetNode4 == activeFocusTargetNode ? FocusStateImpl.Active : FocusStateImpl.Inactive, FocusStateImpl.ActiveParent);
                    i12--;
                }
            }
            if (focusOwnerImpl4.getActiveFocusTargetNode() == focusTargetNode) {
                focusTargetNode.dispatchFocusCallbacks$ui(focusState$1, FocusStateImpl.Active);
                if (focusOwnerImpl4.getActiveFocusTargetNode() != focusTargetNode) {
                    break;
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: searchChildren-4C6V_qg, reason: not valid java name */
    public static final boolean m617searchChildren4C6V_qg(int i, FocusOwnerImpl$focusSearch$1 focusOwnerImpl$focusSearch$1, FocusTargetNode focusTargetNode, Rect rect) {
        FocusTargetNode m610findBestCandidate4WY_MpI;
        MutableVector mutableVector = new MutableVector(0, new FocusTargetNode[16]);
        if (!focusTargetNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
        }
        MutableVector mutableVector2 = new MutableVector(0, new Modifier.Node[16]);
        Modifier.Node child$ui = focusTargetNode.getNode().getChild$ui();
        if (child$ui == null) {
            DepthSortedSetKt.access$addLayoutNodeChildren(mutableVector2, focusTargetNode.getNode());
        } else {
            mutableVector2.add(child$ui);
        }
        while (true) {
            int i2 = mutableVector2.size;
            if (i2 == 0) {
                break;
            }
            Modifier.Node node = (Modifier.Node) mutableVector2.removeAt(i2 - 1);
            if ((node.getAggregateChildKindSet$ui() & 1024) == 0) {
                DepthSortedSetKt.access$addLayoutNodeChildren(mutableVector2, node);
            } else {
                while (true) {
                    if (node == null) {
                        break;
                    }
                    if ((node.getKindSet$ui() & 1024) != 0) {
                        MutableVector mutableVector3 = null;
                        while (node != null) {
                            if (node instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) node;
                                if (focusTargetNode2.isAttached()) {
                                    mutableVector.add(focusTargetNode2);
                                }
                            } else if ((node.getKindSet$ui() & 1024) != 0 && (node instanceof DelegatingNode)) {
                                int i3 = 0;
                                for (Modifier.Node node2 = ((DelegatingNode) node).delegate; node2 != null; node2 = node2.getChild$ui()) {
                                    if ((node2.getKindSet$ui() & 1024) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            node = node2;
                                        } else {
                                            if (mutableVector3 == null) {
                                                mutableVector3 = new MutableVector(0, new Modifier.Node[16]);
                                            }
                                            if (node != null) {
                                                mutableVector3.add(node);
                                                node = null;
                                            }
                                            mutableVector3.add(node2);
                                        }
                                    }
                                }
                                if (i3 == 1) {
                                }
                            }
                            node = DepthSortedSetKt.access$pop(mutableVector3);
                        }
                    } else {
                        node = node.getChild$ui();
                    }
                }
            }
        }
        while (mutableVector.size != 0 && (m610findBestCandidate4WY_MpI = m610findBestCandidate4WY_MpI(mutableVector, rect, i)) != null) {
            if (m610findBestCandidate4WY_MpI.fetchFocusProperties$ui().canFocus) {
                return ((Boolean) focusOwnerImpl$focusSearch$1.invoke(m610findBestCandidate4WY_MpI)).booleanValue();
            }
            if (m612generateAndSearchChildren4C6V_qg(i, focusOwnerImpl$focusSearch$1, m610findBestCandidate4WY_MpI, rect)) {
                return true;
            }
            mutableVector.remove(m610findBestCandidate4WY_MpI);
        }
        return false;
    }

    /* renamed from: twoDimensionalFocusSearch-sMXa3k8, reason: not valid java name */
    public static final Boolean m618twoDimensionalFocusSearchsMXa3k8(int i, FocusOwnerImpl$focusSearch$1 focusOwnerImpl$focusSearch$1, FocusTargetNode focusTargetNode, Rect rect) {
        int ordinal = focusTargetNode.getFocusState$1().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                FocusTargetNode activeChild = getActiveChild(focusTargetNode);
                if (activeChild == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("ActiveParent must have a focusedChild");
                    return null;
                }
                int ordinal2 = activeChild.getFocusState$1().ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 == 1) {
                        Boolean m618twoDimensionalFocusSearchsMXa3k8 = m618twoDimensionalFocusSearchsMXa3k8(i, focusOwnerImpl$focusSearch$1, activeChild, rect);
                        if (!Intrinsics.areEqual(m618twoDimensionalFocusSearchsMXa3k8, Boolean.FALSE)) {
                            return m618twoDimensionalFocusSearchsMXa3k8;
                        }
                        if (rect == null) {
                            if (activeChild.getFocusState$1() != FocusStateImpl.ActiveParent) {
                                a$$ExternalSyntheticBUOutline0.m$1("Searching for active node in inactive hierarchy");
                                return null;
                            }
                            FocusTargetNode findActiveFocusNode = findActiveFocusNode(activeChild);
                            if (findActiveFocusNode == null) {
                                a$$ExternalSyntheticBUOutline0.m$1("ActiveParent must have a focusedChild");
                                return null;
                            }
                            rect = focusRect(findActiveFocusNode);
                        }
                        return Boolean.valueOf(m612generateAndSearchChildren4C6V_qg(i, focusOwnerImpl$focusSearch$1, focusTargetNode, rect));
                    }
                    if (ordinal2 != 2) {
                        if (ordinal2 != 3) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("ActiveParent must have a focusedChild");
                        return null;
                    }
                }
                if (rect == null) {
                    rect = focusRect(activeChild);
                }
                return Boolean.valueOf(m612generateAndSearchChildren4C6V_qg(i, focusOwnerImpl$focusSearch$1, focusTargetNode, rect));
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return focusTargetNode.fetchFocusProperties$ui().canFocus ? (Boolean) focusOwnerImpl$focusSearch$1.invoke(focusTargetNode) : rect == null ? Boolean.valueOf(m611findChildCorrespondingToFocusEnterOMvw8(focusTargetNode, i, focusOwnerImpl$focusSearch$1)) : Boolean.valueOf(m617searchChildren4C6V_qg(i, focusOwnerImpl$focusSearch$1, focusTargetNode, rect));
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
        }
        return Boolean.valueOf(m611findChildCorrespondingToFocusEnterOMvw8(focusTargetNode, i, focusOwnerImpl$focusSearch$1));
    }
}
