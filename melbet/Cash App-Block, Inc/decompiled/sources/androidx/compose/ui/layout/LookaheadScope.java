package androidx.compose.ui.layout;

/* loaded from: classes.dex */
public interface LookaheadScope {
    /* renamed from: localLookaheadPositionOf-au-aQtc */
    default long mo152localLookaheadPositionOfauaQtc(LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2) {
        LayoutCoordinates lookaheadCoordinates = toLookaheadCoordinates(layoutCoordinates);
        LayoutCoordinates lookaheadCoordinates2 = toLookaheadCoordinates(layoutCoordinates2);
        return lookaheadCoordinates instanceof LookaheadLayoutCoordinates ? ((LookaheadLayoutCoordinates) lookaheadCoordinates).mo840localPositionOfS_NoaFU(lookaheadCoordinates2, 0L, true) : lookaheadCoordinates2 instanceof LookaheadLayoutCoordinates ? ((LookaheadLayoutCoordinates) lookaheadCoordinates2).mo840localPositionOfS_NoaFU(lookaheadCoordinates, 0L, true) ^ (-9223372034707292160L) : lookaheadCoordinates.mo840localPositionOfS_NoaFU(lookaheadCoordinates, 0L, true);
    }

    LayoutCoordinates toLookaheadCoordinates(LayoutCoordinates layoutCoordinates);
}
