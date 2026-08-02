package androidx.compose.foundation.text.selection;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import app.cash.molecule.PlatformKt;

/* loaded from: classes3.dex */
public final class HandlePositionProvider implements PopupPositionProvider {
    public final Alignment handleReferencePoint;
    public final OffsetProvider positionProvider;
    public long prevPosition = 0;

    public HandlePositionProvider(Alignment alignment, OffsetProvider offsetProvider) {
        this.handleReferencePoint = alignment;
        this.positionProvider = offsetProvider;
    }

    @Override // androidx.compose.ui.window.PopupPositionProvider
    /* renamed from: calculatePosition-llwVHH4 */
    public final long mo190calculatePositionllwVHH4(IntRect intRect, long j, LayoutDirection layoutDirection, long j2) {
        long mo345provideF1C5BW0 = this.positionProvider.mo345provideF1C5BW0();
        if ((9223372034707292159L & mo345provideF1C5BW0) == 9205357640488583168L) {
            mo345provideF1C5BW0 = this.prevPosition;
        }
        this.prevPosition = mo345provideF1C5BW0;
        return IntOffset.m1049plusqkQi6aY(IntOffset.m1049plusqkQi6aY(intRect.m1052getTopLeftnOccac(), PlatformKt.m1344roundk4lQ0M(mo345provideF1C5BW0)), this.handleReferencePoint.mo584alignKFBX0sM(j2, 0L, layoutDirection));
    }
}
