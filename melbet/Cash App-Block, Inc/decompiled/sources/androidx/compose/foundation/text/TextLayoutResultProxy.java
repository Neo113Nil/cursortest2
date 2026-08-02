package androidx.compose.foundation.text;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.TextLayoutResult;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public final class TextLayoutResultProxy {
    public LayoutCoordinates decorationBoxCoordinates;
    public LayoutCoordinates innerTextFieldCoordinates = null;
    public final TextLayoutResult value;

    public TextLayoutResultProxy(LayoutCoordinates layoutCoordinates, TextLayoutResult textLayoutResult) {
        this.value = textLayoutResult;
        this.decorationBoxCoordinates = layoutCoordinates;
    }

    /* renamed from: coercedInVisibleBoundsOfInputText-MK-Hz9U, reason: not valid java name */
    public final long m368coercedInVisibleBoundsOfInputTextMKHz9U(long j) {
        Rect rect;
        LayoutCoordinates layoutCoordinates = this.innerTextFieldCoordinates;
        Rect rect2 = Rect.Zero;
        if (layoutCoordinates != null) {
            if (layoutCoordinates.isAttached()) {
                LayoutCoordinates layoutCoordinates2 = this.decorationBoxCoordinates;
                rect = layoutCoordinates2 != null ? layoutCoordinates2.localBoundingBoxOf(layoutCoordinates, true) : null;
            } else {
                rect = rect2;
            }
            if (rect != null) {
                rect2 = rect;
            }
        }
        int i = (int) (j >> 32);
        float intBitsToFloat = Float.intBitsToFloat(i);
        float f = rect2.left;
        if (intBitsToFloat >= f) {
            float intBitsToFloat2 = Float.intBitsToFloat(i);
            f = rect2.right;
            if (intBitsToFloat2 <= f) {
                f = Float.intBitsToFloat(i);
            }
        }
        int i2 = (int) (j & BodyPartID.bodyIdMax);
        float intBitsToFloat3 = Float.intBitsToFloat(i2);
        float f2 = rect2.top;
        if (intBitsToFloat3 >= f2) {
            float intBitsToFloat4 = Float.intBitsToFloat(i2);
            f2 = rect2.bottom;
            if (intBitsToFloat4 <= f2) {
                f2 = Float.intBitsToFloat(i2);
            }
        }
        return (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & BodyPartID.bodyIdMax);
    }

    /* renamed from: getOffsetForPosition-3MmeM6k, reason: not valid java name */
    public final int m369getOffsetForPosition3MmeM6k(long j, boolean z) {
        if (z) {
            j = m368coercedInVisibleBoundsOfInputTextMKHz9U(j);
        }
        return this.value.multiParagraph.m966getOffsetForPositionk4lQ0M(m371translateDecorationToInnerCoordinatesMKHz9U$foundation(j));
    }

    /* renamed from: isPositionOnText-k-4lQ0M, reason: not valid java name */
    public final boolean m370isPositionOnTextk4lQ0M(long j) {
        long m371translateDecorationToInnerCoordinatesMKHz9U$foundation = m371translateDecorationToInnerCoordinatesMKHz9U$foundation(m368coercedInVisibleBoundsOfInputTextMKHz9U(j));
        float intBitsToFloat = Float.intBitsToFloat((int) (BodyPartID.bodyIdMax & m371translateDecorationToInnerCoordinatesMKHz9U$foundation));
        TextLayoutResult textLayoutResult = this.value;
        int lineForVerticalPosition = textLayoutResult.multiParagraph.getLineForVerticalPosition(intBitsToFloat);
        int i = (int) (m371translateDecorationToInnerCoordinatesMKHz9U$foundation >> 32);
        return Float.intBitsToFloat(i) >= textLayoutResult.getLineLeft(lineForVerticalPosition) && Float.intBitsToFloat(i) <= textLayoutResult.getLineRight(lineForVerticalPosition);
    }

    /* renamed from: translateDecorationToInnerCoordinates-MK-Hz9U$foundation, reason: not valid java name */
    public final long m371translateDecorationToInnerCoordinatesMKHz9U$foundation(long j) {
        LayoutCoordinates layoutCoordinates;
        LayoutCoordinates layoutCoordinates2 = this.innerTextFieldCoordinates;
        if (layoutCoordinates2 != null) {
            if (!layoutCoordinates2.isAttached()) {
                layoutCoordinates2 = null;
            }
            if (layoutCoordinates2 != null && (layoutCoordinates = this.decorationBoxCoordinates) != null) {
                LayoutCoordinates layoutCoordinates3 = layoutCoordinates.isAttached() ? layoutCoordinates : null;
                if (layoutCoordinates3 != null) {
                    return layoutCoordinates2.mo839localPositionOfR5De75A(layoutCoordinates3, j);
                }
            }
        }
        return j;
    }

    /* renamed from: translateInnerToDecorationCoordinates-MK-Hz9U$foundation, reason: not valid java name */
    public final long m372translateInnerToDecorationCoordinatesMKHz9U$foundation(long j) {
        LayoutCoordinates layoutCoordinates;
        LayoutCoordinates layoutCoordinates2 = this.innerTextFieldCoordinates;
        if (layoutCoordinates2 != null) {
            if (!layoutCoordinates2.isAttached()) {
                layoutCoordinates2 = null;
            }
            if (layoutCoordinates2 != null && (layoutCoordinates = this.decorationBoxCoordinates) != null) {
                LayoutCoordinates layoutCoordinates3 = layoutCoordinates.isAttached() ? layoutCoordinates : null;
                if (layoutCoordinates3 != null) {
                    return layoutCoordinates3.mo839localPositionOfR5De75A(layoutCoordinates2, j);
                }
            }
        }
        return j;
    }
}
