package androidx.compose.foundation.text.contextmenu.internal;

import androidx.compose.foundation.contextmenu.ContextMenuPopupPositionProvider;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;

/* loaded from: classes3.dex */
public final class MaintainWindowPositionPopupPositionProvider implements PopupPositionProvider {
    public final ContextMenuPopupPositionProvider popupPositionProvider;
    public LayoutDirection previousLayoutDirection;
    public IntSize previousPopupContentSize;
    public IntOffset previousPosition;
    public IntSize previousWindowSize;

    public MaintainWindowPositionPopupPositionProvider(ContextMenuPopupPositionProvider contextMenuPopupPositionProvider) {
        this.popupPositionProvider = contextMenuPopupPositionProvider;
    }

    @Override // androidx.compose.ui.window.PopupPositionProvider
    /* renamed from: calculatePosition-llwVHH4 */
    public final long mo190calculatePositionllwVHH4(IntRect intRect, long j, LayoutDirection layoutDirection, long j2) {
        IntOffset intOffset = this.previousPosition;
        if (intOffset != null) {
            IntSize intSize = this.previousWindowSize;
            if ((intSize == null ? false : IntSize.m1055equalsimpl0(intSize.packedValue, j)) && this.previousLayoutDirection == layoutDirection) {
                IntSize intSize2 = this.previousPopupContentSize;
                if (intSize2 != null ? IntSize.m1055equalsimpl0(intSize2.packedValue, j2) : false) {
                    return intOffset.packedValue;
                }
            }
        }
        long mo190calculatePositionllwVHH4 = this.popupPositionProvider.mo190calculatePositionllwVHH4(intRect, j, layoutDirection, j2);
        this.previousWindowSize = new IntSize(j);
        this.previousLayoutDirection = layoutDirection;
        this.previousPopupContentSize = new IntSize(j2);
        this.previousPosition = new IntOffset(mo190calculatePositionllwVHH4);
        return mo190calculatePositionllwVHH4;
    }
}
