package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.LookaheadDelegate;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.unit.IntOffset;
import app.cash.molecule.PlatformKt;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class LookaheadLayoutCoordinates implements LayoutCoordinates {
    public final LookaheadDelegate lookaheadDelegate;

    public LookaheadLayoutCoordinates(LookaheadDelegate lookaheadDelegate) {
        this.lookaheadDelegate = lookaheadDelegate;
    }

    /* renamed from: getLookaheadOffset-F1C5BW0, reason: not valid java name */
    public final long m850getLookaheadOffsetF1C5BW0() {
        LookaheadDelegate lookaheadDelegate = this.lookaheadDelegate;
        LookaheadDelegate rootLookaheadDelegate = RulerKt.getRootLookaheadDelegate(lookaheadDelegate);
        return Offset.m625minusMKHz9U(mo840localPositionOfS_NoaFU(rootLookaheadDelegate.lookaheadLayoutCoordinates, 0L, true), lookaheadDelegate.coordinator.mo840localPositionOfS_NoaFU(rootLookaheadDelegate.coordinator, 0L, true));
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public final LayoutCoordinates getParentLayoutCoordinates() {
        LookaheadDelegate lookaheadDelegate;
        if (!isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("LayoutCoordinate operations are only valid when isAttached is true");
        }
        NodeCoordinator nodeCoordinator = ((NodeCoordinator) this.lookaheadDelegate.coordinator.layoutNode.nodes.outerCoordinator).wrappedBy;
        if (nodeCoordinator == null || (lookaheadDelegate = nodeCoordinator.getLookaheadDelegate()) == null) {
            return null;
        }
        return lookaheadDelegate.lookaheadLayoutCoordinates;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: getSize-YbymL2g */
    public final long mo838getSizeYbymL2g() {
        LookaheadDelegate lookaheadDelegate = this.lookaheadDelegate;
        return (lookaheadDelegate.width << 32) | (lookaheadDelegate.height & BodyPartID.bodyIdMax);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public final boolean isAttached() {
        return this.lookaheadDelegate.coordinator.isAttached();
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public final Rect localBoundingBoxOf(LayoutCoordinates layoutCoordinates, boolean z) {
        return this.lookaheadDelegate.coordinator.localBoundingBoxOf(layoutCoordinates, z);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: localPositionOf-R5De75A */
    public final long mo839localPositionOfR5De75A(LayoutCoordinates layoutCoordinates, long j) {
        return mo840localPositionOfS_NoaFU(layoutCoordinates, j, true);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: localPositionOf-S_NoaFU */
    public final long mo840localPositionOfS_NoaFU(LayoutCoordinates layoutCoordinates, long j, boolean z) {
        boolean z2 = layoutCoordinates instanceof LookaheadLayoutCoordinates;
        LookaheadDelegate lookaheadDelegate = this.lookaheadDelegate;
        if (!z2) {
            LookaheadDelegate rootLookaheadDelegate = RulerKt.getRootLookaheadDelegate(lookaheadDelegate);
            NodeCoordinator nodeCoordinator = rootLookaheadDelegate.coordinator;
            long mo840localPositionOfS_NoaFU = mo840localPositionOfS_NoaFU(rootLookaheadDelegate.lookaheadLayoutCoordinates, j, z);
            float f = (int) (rootLookaheadDelegate.position & BodyPartID.bodyIdMax);
            long m625minusMKHz9U = Offset.m625minusMKHz9U(mo840localPositionOfS_NoaFU, (BodyPartID.bodyIdMax & Float.floatToRawIntBits(f)) | (Float.floatToRawIntBits((int) (r5 >> 32)) << 32));
            if (!nodeCoordinator.isAttached()) {
                InlineClassHelperKt.throwIllegalStateException("LayoutCoordinate operations are only valid when isAttached is true");
            }
            nodeCoordinator.onCoordinatesUsed$ui();
            NodeCoordinator nodeCoordinator2 = nodeCoordinator.wrappedBy;
            if (nodeCoordinator2 != null) {
                nodeCoordinator = nodeCoordinator2;
            }
            return Offset.m626plusMKHz9U(m625minusMKHz9U, nodeCoordinator.mo840localPositionOfS_NoaFU(layoutCoordinates, 0L, z));
        }
        LookaheadDelegate lookaheadDelegate2 = ((LookaheadLayoutCoordinates) layoutCoordinates).lookaheadDelegate;
        NodeCoordinator nodeCoordinator3 = lookaheadDelegate2.coordinator;
        nodeCoordinator3.onCoordinatesUsed$ui();
        LookaheadDelegate lookaheadDelegate3 = lookaheadDelegate.coordinator.findCommonAncestor$ui(nodeCoordinator3).getLookaheadDelegate();
        if (lookaheadDelegate3 != null) {
            boolean z3 = !z;
            long m1048minusqkQi6aY = IntOffset.m1048minusqkQi6aY(IntOffset.m1049plusqkQi6aY(lookaheadDelegate2.m882positionIniSbpLlY$ui(lookaheadDelegate3, z3), PlatformKt.m1344roundk4lQ0M(j)), lookaheadDelegate.m882positionIniSbpLlY$ui(lookaheadDelegate3, z3));
            float f2 = (int) (m1048minusqkQi6aY >> 32);
            float f3 = (int) (m1048minusqkQi6aY & BodyPartID.bodyIdMax);
            return (Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f3) & BodyPartID.bodyIdMax);
        }
        LookaheadDelegate rootLookaheadDelegate2 = RulerKt.getRootLookaheadDelegate(lookaheadDelegate2);
        boolean z4 = !z;
        long m1049plusqkQi6aY = IntOffset.m1049plusqkQi6aY(IntOffset.m1049plusqkQi6aY(lookaheadDelegate2.m882positionIniSbpLlY$ui(rootLookaheadDelegate2, z4), rootLookaheadDelegate2.position), PlatformKt.m1344roundk4lQ0M(j));
        LookaheadDelegate rootLookaheadDelegate3 = RulerKt.getRootLookaheadDelegate(lookaheadDelegate);
        long m1048minusqkQi6aY2 = IntOffset.m1048minusqkQi6aY(m1049plusqkQi6aY, IntOffset.m1049plusqkQi6aY(lookaheadDelegate.m882positionIniSbpLlY$ui(rootLookaheadDelegate3, z4), rootLookaheadDelegate3.position));
        float f4 = (int) (m1048minusqkQi6aY2 >> 32);
        float f5 = (int) (m1048minusqkQi6aY2 & BodyPartID.bodyIdMax);
        long floatToRawIntBits = Float.floatToRawIntBits(f4);
        long floatToRawIntBits2 = Float.floatToRawIntBits(f5) & BodyPartID.bodyIdMax;
        NodeCoordinator nodeCoordinator4 = rootLookaheadDelegate3.coordinator.wrappedBy;
        nodeCoordinator4.getClass();
        NodeCoordinator nodeCoordinator5 = rootLookaheadDelegate2.coordinator.wrappedBy;
        nodeCoordinator5.getClass();
        return nodeCoordinator4.mo840localPositionOfS_NoaFU(nodeCoordinator5, floatToRawIntBits2 | (floatToRawIntBits << 32), z);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: localToRoot-MK-Hz9U */
    public final long mo841localToRootMKHz9U(long j) {
        return this.lookaheadDelegate.coordinator.mo841localToRootMKHz9U(Offset.m626plusMKHz9U(j, m850getLookaheadOffsetF1C5BW0()));
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: localToScreen-MK-Hz9U */
    public final long mo842localToScreenMKHz9U(long j) {
        return this.lookaheadDelegate.coordinator.mo842localToScreenMKHz9U(Offset.m626plusMKHz9U(0L, m850getLookaheadOffsetF1C5BW0()));
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: localToWindow-MK-Hz9U */
    public final long mo843localToWindowMKHz9U(long j) {
        return this.lookaheadDelegate.coordinator.mo843localToWindowMKHz9U(Offset.m626plusMKHz9U(j, m850getLookaheadOffsetF1C5BW0()));
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: screenToLocal-MK-Hz9U */
    public final long mo844screenToLocalMKHz9U(long j) {
        return Offset.m626plusMKHz9U(this.lookaheadDelegate.coordinator.mo844screenToLocalMKHz9U(j), m850getLookaheadOffsetF1C5BW0());
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: transformFrom-EL8BTi8 */
    public final void mo845transformFromEL8BTi8(LayoutCoordinates layoutCoordinates, float[] fArr) {
        this.lookaheadDelegate.coordinator.mo845transformFromEL8BTi8(layoutCoordinates, fArr);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: transformToScreen-58bKbWc */
    public final void mo846transformToScreen58bKbWc(float[] fArr) {
        this.lookaheadDelegate.coordinator.mo846transformToScreen58bKbWc(fArr);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: windowToLocal-MK-Hz9U */
    public final long mo847windowToLocalMKHz9U(long j) {
        return Offset.m626plusMKHz9U(this.lookaheadDelegate.coordinator.mo847windowToLocalMKHz9U(j), m850getLookaheadOffsetF1C5BW0());
    }
}
