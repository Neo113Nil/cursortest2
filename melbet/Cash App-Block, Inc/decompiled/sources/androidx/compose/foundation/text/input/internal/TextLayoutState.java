package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.relocation.BringIntoViewRequesterImpl;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.unit.Dp;
import androidx.recyclerview.widget.RecyclerView;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class TextLayoutState {
    public final BringIntoViewRequesterImpl bringIntoViewRequester;
    public final ParcelableSnapshotMutableState coreNodeCoordinates$delegate;
    public final ParcelableSnapshotMutableState decoratorNodeCoordinates$delegate;
    public final TextFieldLayoutStateCache layoutCache;
    public final TextFieldLayoutStateCache layoutResult$delegate;
    public final ParcelableSnapshotMutableState minHeightForSingleLineField$delegate;
    public final ParcelableSnapshotMutableState textLayoutNodeCoordinates$delegate;

    public TextLayoutState() {
        TextFieldLayoutStateCache textFieldLayoutStateCache = new TextFieldLayoutStateCache();
        this.layoutCache = textFieldLayoutStateCache;
        this.layoutResult$delegate = textFieldLayoutStateCache;
        NeverEqualPolicy neverEqualPolicy = NeverEqualPolicy.INSTANCE;
        this.textLayoutNodeCoordinates$delegate = new ParcelableSnapshotMutableState(null, neverEqualPolicy);
        this.coreNodeCoordinates$delegate = new ParcelableSnapshotMutableState(null, neverEqualPolicy);
        this.decoratorNodeCoordinates$delegate = new ParcelableSnapshotMutableState(null, neverEqualPolicy);
        this.minHeightForSingleLineField$delegate = Updater.mutableStateOf$default(new Dp(RecyclerView.DECELERATION_RATE));
        this.bringIntoViewRequester = new BringIntoViewRequesterImpl();
    }

    /* renamed from: coercedInVisibleBoundsOfInputText-MK-Hz9U$foundation, reason: not valid java name */
    public final long m409coercedInVisibleBoundsOfInputTextMKHz9U$foundation(long j) {
        Rect rect;
        LayoutCoordinates textLayoutNodeCoordinates = getTextLayoutNodeCoordinates();
        Rect rect2 = Rect.Zero;
        if (textLayoutNodeCoordinates != null) {
            if (textLayoutNodeCoordinates.isAttached()) {
                LayoutCoordinates decoratorNodeCoordinates = getDecoratorNodeCoordinates();
                rect = decoratorNodeCoordinates != null ? decoratorNodeCoordinates.localBoundingBoxOf(textLayoutNodeCoordinates, true) : null;
            } else {
                rect = rect2;
            }
            if (rect != null) {
                rect2 = rect;
            }
        }
        return MathUtilsKt.m394coerceIn3MmeM6k(j, rect2);
    }

    public final LayoutCoordinates getDecoratorNodeCoordinates() {
        return (LayoutCoordinates) this.decoratorNodeCoordinates$delegate.getValue();
    }

    public final TextLayoutResult getLayoutResult() {
        return (TextLayoutResult) this.layoutResult$delegate.getValue();
    }

    /* renamed from: getOffsetForPosition-3MmeM6k, reason: not valid java name */
    public final int m410getOffsetForPosition3MmeM6k(long j, boolean z) {
        TextLayoutResult layoutResult = getLayoutResult();
        if (layoutResult == null) {
            return -1;
        }
        if (z) {
            j = m409coercedInVisibleBoundsOfInputTextMKHz9U$foundation(j);
        }
        return layoutResult.multiParagraph.m966getOffsetForPositionk4lQ0M(MathUtilsKt.m397fromDecorationToTextLayoutUv8p0NA(this, j));
    }

    public final LayoutCoordinates getTextLayoutNodeCoordinates() {
        return (LayoutCoordinates) this.textLayoutNodeCoordinates$delegate.getValue();
    }

    /* renamed from: isPositionOnText-k-4lQ0M, reason: not valid java name */
    public final boolean m411isPositionOnTextk4lQ0M(long j) {
        TextLayoutResult layoutResult = getLayoutResult();
        if (layoutResult == null) {
            return false;
        }
        long m397fromDecorationToTextLayoutUv8p0NA = MathUtilsKt.m397fromDecorationToTextLayoutUv8p0NA(this, m409coercedInVisibleBoundsOfInputTextMKHz9U$foundation(j));
        int lineForVerticalPosition = layoutResult.multiParagraph.getLineForVerticalPosition(Float.intBitsToFloat((int) (BodyPartID.bodyIdMax & m397fromDecorationToTextLayoutUv8p0NA)));
        int i = (int) (m397fromDecorationToTextLayoutUv8p0NA >> 32);
        return Float.intBitsToFloat(i) >= layoutResult.getLineLeft(lineForVerticalPosition) && Float.intBitsToFloat(i) <= layoutResult.getLineRight(lineForVerticalPosition);
    }
}
