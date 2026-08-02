package androidx.compose.foundation.contextmenu;

import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import coil3.request.ErrorResult;
import coil3.request.ImageRequest;
import coil3.request.SuccessResult;
import kotlin.jvm.functions.Function0;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public final class ContextMenuPopupPositionProvider implements PopupPositionProvider, ImageRequest.Listener {
    public final Function0 anchorPositionBlock;

    @Override // androidx.compose.ui.window.PopupPositionProvider
    /* renamed from: calculatePosition-llwVHH4, reason: not valid java name */
    public long mo190calculatePositionllwVHH4(IntRect intRect, long j, LayoutDirection layoutDirection, long j2) {
        return (ContextMenuPopupPositionProviderKt.alignPopupAxis(intRect.top + ((int) (r0 & BodyPartID.bodyIdMax)), (int) (j2 & BodyPartID.bodyIdMax), true, (int) (j & BodyPartID.bodyIdMax)) & BodyPartID.bodyIdMax) | (ContextMenuPopupPositionProviderKt.alignPopupAxis(intRect.left + ((int) (((IntOffset) this.anchorPositionBlock.invoke()).packedValue >> 32)), (int) (j2 >> 32), layoutDirection == LayoutDirection.Ltr, (int) (j >> 32)) << 32);
    }

    @Override // coil3.request.ImageRequest.Listener
    public void onError(ImageRequest imageRequest, ErrorResult errorResult) {
        this.anchorPositionBlock.invoke();
    }

    @Override // coil3.request.ImageRequest.Listener
    public void onSuccess(SuccessResult successResult) {
    }
}
