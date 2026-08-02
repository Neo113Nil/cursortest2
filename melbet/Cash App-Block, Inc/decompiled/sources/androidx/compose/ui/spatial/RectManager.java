package androidx.compose.ui.spatial;

import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableObjectList;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.node.InnerNodeCoordinator;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeKt;
import androidx.compose.ui.node.MeasurePassDelegate;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.OwnedLayer;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.GraphicsLayerOwnerLayer;
import androidx.compose.ui.spatial.ThrottledCallbacks;
import androidx.compose.ui.unit.IntOffset;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.contour.ContourLayout$geometry$1;
import kotlin.jvm.functions.Function0;
import okhttp3.internal.http.StatusLine;
import org.bouncycastle.asn1.cmc.BodyPartID;
import papa.Handlers$$ExternalSyntheticLambda2;

/* loaded from: classes.dex */
public final class RectManager {
    public final MutableRect cachedRect;
    public final MutableObjectList callbacks;
    public final ContourLayout$geometry$1 dispatchLambda;
    public Handlers$$ExternalSyntheticLambda2 dispatchToken;
    public final AndroidComposeView executeDelayed;
    public boolean isDirty;
    public boolean isFragmented;
    public boolean isScreenOrWindowDirty;
    public final StatusLine rects;
    public long scheduledDispatchDeadline;
    public final ThrottledCallbacks throttledCallbacks;

    public RectManager(AndroidComposeView androidComposeView) {
        this.executeDelayed = androidComposeView;
        StatusLine statusLine = new StatusLine((byte) 0, 2);
        statusLine.protocol = new long[192];
        statusLine.message = new long[192];
        this.rects = statusLine;
        this.throttledCallbacks = new ThrottledCallbacks();
        this.callbacks = new MutableObjectList();
        this.scheduledDispatchDeadline = -1L;
        this.dispatchLambda = new ContourLayout$geometry$1(this, 9);
        this.cachedRect = new MutableRect();
    }

    public static boolean hasPositionalLayerTransformations(NodeCoordinator nodeCoordinator) {
        OwnedLayer ownedLayer = nodeCoordinator.layer;
        return (ownedLayer == null || ColorKt.m688isIdentity58bKbWc(((GraphicsLayerOwnerLayer) ownedLayer).m934getMatrixsQKQjiQ())) ? false : true;
    }

    /* renamed from: outerToInnerOffset-Bjo55l4, reason: not valid java name */
    public static long m951outerToInnerOffsetBjo55l4(LayoutNode layoutNode) {
        NodeChain nodeChain = layoutNode.nodes;
        NodeCoordinator nodeCoordinator = (NodeCoordinator) nodeChain.outerCoordinator;
        long j = 0;
        for (NodeCoordinator nodeCoordinator2 = (InnerNodeCoordinator) nodeChain.innerCoordinator; nodeCoordinator2 != null && nodeCoordinator2 != nodeCoordinator; nodeCoordinator2 = nodeCoordinator2.wrappedBy) {
            if (hasPositionalLayerTransformations(nodeCoordinator2)) {
                return 9223372034707292159L;
            }
            j = IntOffset.m1049plusqkQi6aY(j, nodeCoordinator2.position);
        }
        return j;
    }

    public static void resetHasPositionalLayerTransformationsForSubtreeIfNeeded(LayoutNode layoutNode) {
        if (!layoutNode.hasPositionalLayerTransformationsInOffsetFromRoot || hasPositionalLayerTransformations((NodeCoordinator) layoutNode.nodes.outerCoordinator)) {
            return;
        }
        layoutNode.hasPositionalLayerTransformationsInOffsetFromRoot = false;
        if (layoutNode.outerToInnerOffsetDirty) {
            layoutNode.outerToInnerOffset = m951outerToInnerOffsetBjo55l4(layoutNode);
            layoutNode.outerToInnerOffsetDirty = false;
        }
        if (IntOffset.m1047equalsimpl0(layoutNode.outerToInnerOffset, 9223372034707292159L)) {
            return;
        }
        MutableVector mutableVector = layoutNode.get_children$ui();
        Object[] objArr = mutableVector.content;
        int i = mutableVector.size;
        for (int i2 = 0; i2 < i; i2++) {
            resetHasPositionalLayerTransformationsForSubtreeIfNeeded((LayoutNode) objArr[i2]);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0217  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchCallbacks() {
        boolean z;
        long j;
        StatusLine statusLine;
        int i;
        long j2;
        long j3;
        int i2;
        long[] jArr;
        long j4;
        long j5;
        Handlers$$ExternalSyntheticLambda2 handlers$$ExternalSyntheticLambda2 = this.dispatchToken;
        if (handlers$$ExternalSyntheticLambda2 != null) {
            this.executeDelayed.removeCallbacks(handlers$$ExternalSyntheticLambda2);
            this.dispatchToken = null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        boolean z2 = this.isDirty;
        boolean z3 = z2 || this.isScreenOrWindowDirty;
        StatusLine statusLine2 = this.rects;
        boolean z4 = true;
        ThrottledCallbacks throttledCallbacks = this.throttledCallbacks;
        if (z2) {
            this.isDirty = false;
            MutableObjectList mutableObjectList = this.callbacks;
            Object[] objArr = mutableObjectList.content;
            int i3 = mutableObjectList._size;
            for (int i4 = 0; i4 < i3; i4++) {
                ((Function0) objArr[i4]).invoke();
            }
            long[] jArr2 = (long[]) statusLine2.protocol;
            int i5 = statusLine2.code;
            int i6 = 0;
            while (i6 < jArr2.length - 2 && i6 < i5) {
                long j6 = jArr2[i6 + 2];
                boolean z5 = z4;
                int i7 = i5;
                if ((((int) (j6 >> 60)) & 1) != 0) {
                    long j7 = jArr2[i6];
                    long j8 = jArr2[i6 + 1];
                    ThrottledCallbacks.Entry entry = (ThrottledCallbacks.Entry) throttledCallbacks.rectChangedMap.get(((int) j6) & 33554431);
                    while (entry != null) {
                        ThrottledCallbacks.Entry entry2 = entry.next;
                        boolean z6 = z3;
                        long j9 = entry.lastInvokeMillis;
                        boolean z7 = (currentTimeMillis - j9 >= 0 || j9 == Long.MIN_VALUE) ? z5 : false;
                        entry.topLeft = j7;
                        entry.bottomRight = j8;
                        if (z7) {
                            entry.lastInvokeMillis = currentTimeMillis;
                            j4 = j7;
                            j5 = j8;
                            entry.m955fire9b9wPM(j4, j5, throttledCallbacks.windowOffset, throttledCallbacks.screenOffset, throttledCallbacks.viewToWindowMatrix);
                        } else {
                            j4 = j7;
                            j5 = j8;
                        }
                        entry = entry2;
                        j7 = j4;
                        j8 = j5;
                        z3 = z6;
                    }
                }
                i6 += 3;
                z4 = z5;
                i5 = i7;
                z3 = z3;
            }
            z = z3;
            j = 0;
            long[] jArr3 = (long[]) statusLine2.protocol;
            int i8 = statusLine2.code;
            for (int i9 = 0; i9 < jArr3.length - 2 && i9 < i8; i9 += 3) {
                int i10 = i9 + 2;
                jArr3[i10] = jArr3[i10] & (-1152921504606846977L);
            }
        } else {
            z = z3;
            j = 0;
        }
        if (this.isScreenOrWindowDirty) {
            this.isScreenOrWindowDirty = false;
            long j10 = throttledCallbacks.windowOffset;
            long j11 = throttledCallbacks.screenOffset;
            float[] fArr = throttledCallbacks.viewToWindowMatrix;
            MutableIntObjectMap mutableIntObjectMap = throttledCallbacks.rectChangedMap;
            j2 = 128;
            Object[] objArr2 = mutableIntObjectMap.values;
            long[] jArr4 = mutableIntObjectMap.metadata;
            int length = jArr4.length - 2;
            if (length >= 0) {
                int i11 = 0;
                int i12 = 8;
                j3 = 255;
                while (true) {
                    long j12 = j10;
                    long j13 = jArr4[i11];
                    int i13 = i12;
                    statusLine = statusLine2;
                    if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i14 = 8 - ((~(i11 - length)) >>> 31);
                        long j14 = j13;
                        int i15 = 0;
                        while (i15 < i14) {
                            if ((j14 & 255) < 128) {
                                ThrottledCallbacks.Entry entry3 = (ThrottledCallbacks.Entry) objArr2[(i11 << 3) + i15];
                                while (entry3 != null) {
                                    throttledCallbacks.m953fireWY9HvpM(entry3, j12, j11, fArr, currentTimeMillis);
                                    entry3 = entry3.next;
                                    i13 = i13;
                                    jArr4 = jArr4;
                                }
                            }
                            long[] jArr5 = jArr4;
                            int i16 = i13;
                            j14 >>= i16;
                            i15++;
                            j12 = j12;
                            i13 = i16;
                            jArr4 = jArr5;
                        }
                        jArr = jArr4;
                        i = i13;
                        j10 = j12;
                        if (i14 != i) {
                            break;
                        }
                    } else {
                        jArr = jArr4;
                        i = i13;
                        j10 = j12;
                    }
                    if (i11 == length) {
                        break;
                    }
                    i11++;
                    i12 = i;
                    statusLine2 = statusLine;
                    jArr4 = jArr;
                }
                if (z) {
                    long j15 = throttledCallbacks.windowOffset;
                    long j16 = throttledCallbacks.screenOffset;
                    float[] fArr2 = throttledCallbacks.viewToWindowMatrix;
                    ThrottledCallbacks.Entry entry4 = throttledCallbacks.globalChangeEntries;
                    if (entry4 != null) {
                        while (entry4 != null) {
                            LayoutNode requireLayoutNode = DepthSortedSetKt.requireLayoutNode(entry4.node);
                            entry4.topLeft = ((AndroidComposeView) LayoutNodeKt.requireOwner(requireLayoutNode)).rectManager.m952getOffsetFromRectListForBjo55l4(requireLayoutNode);
                            entry4.bottomRight = ((requireLayoutNode.getWidth() + ((int) (r12 >> 32))) << 32) | ((requireLayoutNode.getHeight() + ((int) (r12 & BodyPartID.bodyIdMax))) & BodyPartID.bodyIdMax);
                            throttledCallbacks.m953fireWY9HvpM(entry4, j15, j16, fArr2, currentTimeMillis);
                            entry4 = entry4.next;
                        }
                    }
                }
                if (this.isFragmented) {
                    i2 = 0;
                } else {
                    i2 = 0;
                    this.isFragmented = false;
                    StatusLine statusLine3 = statusLine;
                    long[] jArr6 = (long[]) statusLine3.protocol;
                    int i17 = statusLine3.code;
                    long[] jArr7 = (long[]) statusLine3.message;
                    int i18 = 0;
                    for (int i19 = 0; i19 < jArr6.length - 2 && i18 < jArr7.length - 2 && i19 < i17; i19 += 3) {
                        int i20 = i19 + 2;
                        if (jArr6[i20] != RectListKt.TombStone) {
                            jArr7[i18] = jArr6[i19];
                            jArr7[i18 + 1] = jArr6[i19 + 1];
                            jArr7[i18 + 2] = jArr6[i20];
                            i18 += 3;
                        }
                    }
                    statusLine3.code = i18;
                    statusLine3.protocol = jArr7;
                    statusLine3.message = jArr6;
                }
                if (throttledCallbacks.minDebounceDeadline <= currentTimeMillis) {
                    MutableIntObjectMap mutableIntObjectMap2 = throttledCallbacks.rectChangedMap;
                    Object[] objArr3 = mutableIntObjectMap2.values;
                    long[] jArr8 = mutableIntObjectMap2.metadata;
                    int length2 = jArr8.length - 2;
                    if (length2 >= 0) {
                        int i21 = i2;
                        while (true) {
                            long j17 = jArr8[i21];
                            if ((((~j17) << 7) & j17 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i22 = 8 - ((~(i21 - length2)) >>> 31);
                                long j18 = j17;
                                for (int i23 = i2; i23 < i22; i23++) {
                                    if ((j18 & j3) < j2) {
                                        for (ThrottledCallbacks.Entry entry5 = (ThrottledCallbacks.Entry) objArr3[(i21 << 3) + i23]; entry5 != null; entry5 = entry5.next) {
                                        }
                                    }
                                    j18 >>= i;
                                }
                                if (i22 != i) {
                                    break;
                                }
                            }
                            if (i21 == length2) {
                                break;
                            } else {
                                i21++;
                            }
                        }
                    }
                    ThrottledCallbacks.Entry entry6 = throttledCallbacks.globalChangeEntries;
                    if (entry6 != null) {
                        while (entry6 != null) {
                            entry6 = entry6.next;
                        }
                    }
                    throttledCallbacks.minDebounceDeadline = -1L;
                }
                if (throttledCallbacks.minDebounceDeadline <= j) {
                    scheduleDebounceCallback();
                    return;
                }
                return;
            }
            statusLine = statusLine2;
            i = 8;
        } else {
            statusLine = statusLine2;
            i = 8;
            j2 = 128;
        }
        j3 = 255;
        if (z) {
        }
        if (this.isFragmented) {
        }
        if (throttledCallbacks.minDebounceDeadline <= currentTimeMillis) {
        }
        if (throttledCallbacks.minDebounceDeadline <= j) {
        }
    }

    /* renamed from: getOffsetFromRectListFor-Bjo55l4, reason: not valid java name */
    public final long m952getOffsetFromRectListForBjo55l4(LayoutNode layoutNode) {
        long j;
        int i = layoutNode.semanticsId & 33554431;
        StatusLine statusLine = this.rects;
        long[] jArr = (long[]) statusLine.protocol;
        int i2 = statusLine.code;
        for (int i3 = 0; i3 < jArr.length - 2 && i3 < i2; i3 += 3) {
            if ((((int) jArr[i3 + 2]) & 33554431) == i) {
                j = jArr[i3];
                break;
            }
        }
        j = Long.MAX_VALUE;
        if (j == Long.MAX_VALUE) {
            return 9223372034707292159L;
        }
        return (((int) j) & BodyPartID.bodyIdMax) | (((int) (j >> 32)) << 32);
    }

    public final void insertOrUpdateTransformedNodeSubhierarchy(LayoutNode layoutNode) {
        boolean z;
        boolean z2 = true;
        layoutNode.hasPositionalLayerTransformationsInOffsetFromRoot = true;
        NodeChain nodeChain = layoutNode.nodes;
        NodeCoordinator nodeCoordinator = (NodeCoordinator) nodeChain.outerCoordinator;
        MeasurePassDelegate measurePassDelegate = layoutNode.layoutDelegate.measurePassDelegate;
        int measuredWidth = measurePassDelegate.getMeasuredWidth();
        float measuredHeight = measurePassDelegate.getMeasuredHeight();
        MutableRect mutableRect = this.cachedRect;
        mutableRect.left = RecyclerView.DECELERATION_RATE;
        mutableRect.top = RecyclerView.DECELERATION_RATE;
        mutableRect.right = measuredWidth;
        mutableRect.bottom = measuredHeight;
        while (true) {
            if (nodeCoordinator == null) {
                break;
            }
            LayoutNode layoutNode2 = nodeCoordinator.layoutNode;
            if (nodeCoordinator == ((NodeCoordinator) layoutNode2.nodes.outerCoordinator) && !layoutNode2.hasPositionalLayerTransformationsInOffsetFromRoot) {
                if (!IntOffset.m1047equalsimpl0(m952getOffsetFromRectListForBjo55l4(layoutNode2), 9223372034707292159L)) {
                    mutableRect.m619translatek4lQ0M((Float.floatToRawIntBits((int) (r9 >> 32)) << 32) | (Float.floatToRawIntBits((int) (r9 & BodyPartID.bodyIdMax)) & BodyPartID.bodyIdMax));
                    break;
                }
            }
            OwnedLayer ownedLayer = nodeCoordinator.layer;
            if (ownedLayer != null) {
                float[] m934getMatrixsQKQjiQ = ((GraphicsLayerOwnerLayer) ownedLayer).m934getMatrixsQKQjiQ();
                if (!ColorKt.m688isIdentity58bKbWc(m934getMatrixsQKQjiQ)) {
                    Matrix.m701mapimpl(m934getMatrixsQKQjiQ, mutableRect);
                }
            }
            float f = (int) (nodeCoordinator.position >> 32);
            mutableRect.m619translatek4lQ0M((BodyPartID.bodyIdMax & Float.floatToRawIntBits((int) (r9 & BodyPartID.bodyIdMax))) | (Float.floatToRawIntBits(f) << 32));
            nodeCoordinator = nodeCoordinator.wrappedBy;
        }
        int i = (int) mutableRect.left;
        int i2 = (int) mutableRect.top;
        int i3 = (int) mutableRect.right;
        int i4 = (int) mutableRect.bottom;
        int i5 = layoutNode.semanticsId;
        boolean z3 = layoutNode.addedToRectList;
        layoutNode.addedToRectList = true;
        StatusLine statusLine = this.rects;
        if (z3) {
            int i6 = i5 & 33554431;
            long[] jArr = (long[]) statusLine.protocol;
            int i7 = statusLine.code;
            int i8 = 0;
            while (i8 < jArr.length - 2 && i8 < i7) {
                int i9 = i8 + 2;
                long j = jArr[i9];
                z = z2;
                if ((((int) j) & 33554431) == i6) {
                    jArr[i8] = (i << 32) | (i2 & BodyPartID.bodyIdMax);
                    jArr[i8 + 1] = (i3 << 32) | (i4 & BodyPartID.bodyIdMax);
                    jArr[i9] = (((j >> 63) & 1) << 60) | j;
                    break;
                }
                i8 += 3;
                z2 = z;
            }
        }
        z = z2;
        LayoutNode parent$ui = layoutNode.getParent$ui();
        statusLine.insert(i5, i, i2, i3, i4, (r22 & 32) != 0 ? -1 : parent$ui != null ? parent$ui.semanticsId : -1, nodeChain.m889hasH91voCI$ui(1024), nodeChain.m889hasH91voCI$ui(16), this.throttledCallbacks.rectChangedMap.containsKey(i5), -1);
        layoutNode.rectInParentDirty = false;
        this.isDirty = z;
        MutableVector mutableVector = layoutNode.get_children$ui();
        Object[] objArr = mutableVector.content;
        int i10 = mutableVector.size;
        for (int i11 = 0; i11 < i10; i11++) {
            LayoutNode layoutNode3 = (LayoutNode) objArr[i11];
            if (layoutNode3.isPlaced()) {
                insertOrUpdateTransformedNodeSubhierarchy(layoutNode3);
            }
        }
    }

    public final void recalculateRectIfDirty(LayoutNode layoutNode) {
        long j;
        int i;
        boolean isPlaced = layoutNode.isPlaced();
        NodeChain nodeChain = layoutNode.nodes;
        if (isPlaced && layoutNode.rectInParentDirty) {
            LayoutNode parent$ui = layoutNode.getParent$ui();
            if (parent$ui == null || parent$ui.hasPositionalLayerTransformationsInOffsetFromRoot) {
                j = parent$ui == null ? 0L : 9223372034707292159L;
            } else {
                if (parent$ui.outerToInnerOffsetDirty) {
                    parent$ui.outerToInnerOffsetDirty = false;
                    parent$ui.outerToInnerOffset = m951outerToInnerOffsetBjo55l4(parent$ui);
                }
                j = parent$ui.outerToInnerOffset;
            }
            NodeCoordinator nodeCoordinator = (NodeCoordinator) nodeChain.outerCoordinator;
            if (IntOffset.m1047equalsimpl0(j, 9223372034707292159L) || hasPositionalLayerTransformations(nodeCoordinator)) {
                insertOrUpdateTransformedNodeSubhierarchy(layoutNode);
            } else if (layoutNode.hasPositionalLayerTransformationsInOffsetFromRoot) {
                insertOrUpdateTransformedNodeSubhierarchy(layoutNode);
                resetHasPositionalLayerTransformationsForSubtreeIfNeeded(layoutNode);
            } else {
                long m1049plusqkQi6aY = IntOffset.m1049plusqkQi6aY(j, nodeCoordinator.position);
                MeasurePassDelegate measurePassDelegate = layoutNode.layoutDelegate.measurePassDelegate;
                int measuredWidth = measurePassDelegate.getMeasuredWidth();
                int measuredHeight = measurePassDelegate.getMeasuredHeight();
                int i2 = layoutNode.semanticsId;
                boolean z = layoutNode.addedToRectList;
                StatusLine statusLine = this.rects;
                long j2 = BodyPartID.bodyIdMax;
                if (!z) {
                    layoutNode.addedToRectList = true;
                    boolean m889hasH91voCI$ui = nodeChain.m889hasH91voCI$ui(1024);
                    boolean m889hasH91voCI$ui2 = nodeChain.m889hasH91voCI$ui(16);
                    boolean containsKey = this.throttledCallbacks.rectChangedMap.containsKey(i2);
                    if (parent$ui != null) {
                        int i3 = parent$ui.semanticsId;
                        int i4 = (int) (m1049plusqkQi6aY >> 32);
                        int i5 = (int) (m1049plusqkQi6aY & BodyPartID.bodyIdMax);
                        int i6 = i2 & 33554431;
                        long[] jArr = (long[]) statusLine.protocol;
                        i = statusLine.code - 3;
                        while (true) {
                            if (i < 0) {
                                break;
                            }
                            if ((((int) jArr[i + 2]) & 33554431) == i3) {
                                long j3 = jArr[i];
                                int i7 = ((int) (j3 >> 32)) + i4;
                                int i8 = ((int) j3) + i5;
                                statusLine.insert(i6, i7, i8, i7 + measuredWidth, i8 + measuredHeight, i3, m889hasH91voCI$ui, m889hasH91voCI$ui2, containsKey, i);
                                break;
                            }
                            i -= 3;
                        }
                    } else {
                        int i9 = (int) (m1049plusqkQi6aY >> 32);
                        int i10 = (int) (m1049plusqkQi6aY & BodyPartID.bodyIdMax);
                        statusLine.insert(i2, i9, i10, i9 + measuredWidth, i10 + measuredHeight, (r22 & 32) != 0 ? -1 : 0, m889hasH91voCI$ui, m889hasH91voCI$ui2, containsKey, -1);
                    }
                } else if (parent$ui == null) {
                    int i11 = (int) (m1049plusqkQi6aY >> 32);
                    int i12 = (int) (m1049plusqkQi6aY & BodyPartID.bodyIdMax);
                    int i13 = measuredWidth + i11;
                    int i14 = i12 + measuredHeight;
                    int i15 = i2 & 33554431;
                    long[] jArr2 = (long[]) statusLine.protocol;
                    int i16 = statusLine.code;
                    int i17 = 0;
                    while (true) {
                        if (i17 >= jArr2.length - 2 || i17 >= i16) {
                            break;
                        }
                        int i18 = i17 + 2;
                        long j4 = jArr2[i18];
                        if ((((int) j4) & 33554431) == i15) {
                            long j5 = jArr2[i17];
                            int i19 = i17;
                            jArr2[i19] = (i11 << 32) | (i12 & BodyPartID.bodyIdMax);
                            jArr2[i19 + 1] = (i13 << 32) | (i14 & BodyPartID.bodyIdMax);
                            jArr2[i18] = (((j4 >> 63) & 1) << 60) | j4;
                            int i20 = i11 - ((int) (j5 >> 32));
                            int i21 = i12 - ((int) j5);
                            if ((i20 != 0) | (i21 != 0)) {
                                statusLine.updateSubhierarchy(i20, i21, (RectListKt.EverythingButParentId & j4) | (((i19 + 3) & 33554431) << 25));
                            }
                        } else {
                            i17 += 3;
                        }
                    }
                } else {
                    int i22 = parent$ui.semanticsId;
                    int i23 = (int) (m1049plusqkQi6aY >> 32);
                    int i24 = (int) (m1049plusqkQi6aY & BodyPartID.bodyIdMax);
                    int i25 = i2 & 33554431;
                    long[] jArr3 = (long[]) statusLine.protocol;
                    int i26 = statusLine.code;
                    int i27 = 0;
                    while (true) {
                        if (i27 >= jArr3.length - 2 || i27 >= i26) {
                            break;
                        }
                        long j6 = j2;
                        if ((((int) jArr3[i27 + 2]) & 33554431) == i22) {
                            long j7 = jArr3[i27];
                            int i28 = ((int) (j7 >> 32)) + i23;
                            int i29 = ((int) j7) + i24;
                            int i30 = i28 + measuredWidth;
                            int i31 = i29 + measuredHeight;
                            i27 += 3;
                            while (i27 < jArr3.length - 2 && i27 < i26) {
                                int i32 = i27 + 2;
                                int i33 = i22;
                                int i34 = i23;
                                long j8 = jArr3[i32];
                                int i35 = i24;
                                if ((((int) j8) & 33554431) == i25) {
                                    long j9 = jArr3[i27];
                                    long[] jArr4 = jArr3;
                                    int i36 = i28 - ((int) (j9 >> 32));
                                    int i37 = i29 - ((int) j9);
                                    jArr4[i27] = (i29 & j6) | (i28 << 32);
                                    jArr4[i27 + 1] = (i30 << 32) | (i31 & j6);
                                    jArr4[i32] = j8 | (((j8 >> 63) & 1) << 60);
                                    if (i36 != 0 || i37 != 0) {
                                        statusLine.updateSubhierarchy(i36, i37, (j8 & RectListKt.EverythingButParentId) | (((i27 + 3) & 33554431) << 25));
                                    }
                                } else {
                                    i27 += 3;
                                    i22 = i33;
                                    i23 = i34;
                                    i24 = i35;
                                }
                            }
                        }
                        i27 += 3;
                        jArr3 = jArr3;
                        j2 = j6;
                        i22 = i22;
                        i23 = i23;
                        i24 = i24;
                    }
                }
            }
            layoutNode.rectInParentDirty = false;
            this.isDirty = true;
            scheduleDebounceCallback();
        }
    }

    public final void remove(LayoutNode layoutNode) {
        if (layoutNode.addedToRectList) {
            int i = layoutNode.semanticsId & 33554431;
            StatusLine statusLine = this.rects;
            long[] jArr = (long[]) statusLine.protocol;
            int i2 = statusLine.code;
            int i3 = 0;
            while (true) {
                if (i3 >= jArr.length - 2 || i3 >= i2) {
                    break;
                }
                int i4 = i3 + 2;
                if ((((int) jArr[i4]) & 33554431) == i) {
                    jArr[i3] = -1;
                    jArr[i3 + 1] = -1;
                    jArr[i4] = RectListKt.TombStone;
                    break;
                }
                i3 += 3;
            }
            layoutNode.addedToRectList = false;
            layoutNode.rectInParentDirty = true;
            this.isDirty = true;
            this.isFragmented = true;
        }
    }

    public final void scheduleDebounceCallback() {
        Handlers$$ExternalSyntheticLambda2 handlers$$ExternalSyntheticLambda2 = this.dispatchToken;
        boolean z = handlers$$ExternalSyntheticLambda2 != null;
        long j = this.throttledCallbacks.minDebounceDeadline;
        if (j >= 0 || !z) {
            if (this.scheduledDispatchDeadline == j && z) {
                return;
            }
            AndroidComposeView androidComposeView = this.executeDelayed;
            if (handlers$$ExternalSyntheticLambda2 != null) {
                androidComposeView.removeCallbacks(handlers$$ExternalSyntheticLambda2);
            }
            long currentTimeMillis = System.currentTimeMillis();
            long max = Math.max(j, 16 + currentTimeMillis);
            this.scheduledDispatchDeadline = max;
            Handlers$$ExternalSyntheticLambda2 handlers$$ExternalSyntheticLambda22 = new Handlers$$ExternalSyntheticLambda2(1, this.dispatchLambda);
            androidComposeView.postDelayed(handlers$$ExternalSyntheticLambda22, max - currentTimeMillis);
            this.dispatchToken = handlers$$ExternalSyntheticLambda22;
        }
    }
}
