package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Rect;

/* loaded from: classes.dex */
public interface LayoutCoordinates {
    LayoutCoordinates getParentLayoutCoordinates();

    /* renamed from: getSize-YbymL2g, reason: not valid java name */
    long mo838getSizeYbymL2g();

    boolean isAttached();

    Rect localBoundingBoxOf(LayoutCoordinates layoutCoordinates, boolean z);

    /* renamed from: localPositionOf-R5De75A, reason: not valid java name */
    long mo839localPositionOfR5De75A(LayoutCoordinates layoutCoordinates, long j);

    /* renamed from: localPositionOf-S_NoaFU, reason: not valid java name */
    long mo840localPositionOfS_NoaFU(LayoutCoordinates layoutCoordinates, long j, boolean z);

    /* renamed from: localToRoot-MK-Hz9U, reason: not valid java name */
    long mo841localToRootMKHz9U(long j);

    /* renamed from: localToScreen-MK-Hz9U, reason: not valid java name */
    long mo842localToScreenMKHz9U(long j);

    /* renamed from: localToWindow-MK-Hz9U, reason: not valid java name */
    long mo843localToWindowMKHz9U(long j);

    /* renamed from: screenToLocal-MK-Hz9U, reason: not valid java name */
    long mo844screenToLocalMKHz9U(long j);

    /* renamed from: transformFrom-EL8BTi8, reason: not valid java name */
    void mo845transformFromEL8BTi8(LayoutCoordinates layoutCoordinates, float[] fArr);

    /* renamed from: transformToScreen-58bKbWc, reason: not valid java name */
    void mo846transformToScreen58bKbWc(float[] fArr);

    /* renamed from: windowToLocal-MK-Hz9U, reason: not valid java name */
    long mo847windowToLocalMKHz9U(long j);
}
