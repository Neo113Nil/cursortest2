package androidx.compose.ui.node;

import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.extractor.text.CueEncoder;

/* loaded from: classes3.dex */
public abstract class TouchBoundsExpansion {
    public static final /* synthetic */ int $r8$clinit = 0;
    public static final long None = CueEncoder.pack$ui(0, 0, 0, 0);

    /* renamed from: computeLeft-impl$ui, reason: not valid java name */
    public static final int m908computeLeftimpl$ui(long j, LayoutDirection layoutDirection) {
        return ((Long.MIN_VALUE & j) == 0 || layoutDirection == LayoutDirection.Ltr) ? CueEncoder.access$unpack(0, j) : CueEncoder.access$unpack(2, j);
    }

    /* renamed from: computeRight-impl$ui, reason: not valid java name */
    public static final int m909computeRightimpl$ui(long j, LayoutDirection layoutDirection) {
        return ((Long.MIN_VALUE & j) == 0 || layoutDirection == LayoutDirection.Ltr) ? CueEncoder.access$unpack(2, j) : CueEncoder.access$unpack(0, j);
    }

    /* renamed from: getBottom-impl, reason: not valid java name */
    public static final int m910getBottomimpl(long j) {
        return CueEncoder.access$unpack(3, j);
    }

    /* renamed from: getTop-impl, reason: not valid java name */
    public static final int m911getTopimpl(long j) {
        return CueEncoder.access$unpack(1, j);
    }
}
