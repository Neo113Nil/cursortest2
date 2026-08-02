package androidx.compose.foundation.text;

import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.unit.Constraints;
import com.squareup.cash.wallet.views.Hero3DCardViewKt$$ExternalSyntheticLambda13;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class HorizontalScrollLayoutModifier implements LayoutModifier {
    public final int cursorOffset;
    public final TextFieldScrollerPosition scrollerPosition;
    public final Function0 textLayoutResultProvider;
    public final TransformedText transformedText;

    public HorizontalScrollLayoutModifier(TextFieldScrollerPosition textFieldScrollerPosition, int i, TransformedText transformedText, Function0 function0) {
        this.scrollerPosition = textFieldScrollerPosition;
        this.cursorOffset = i;
        this.transformedText = transformedText;
        this.textLayoutResultProvider = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof HorizontalScrollLayoutModifier) {
            HorizontalScrollLayoutModifier horizontalScrollLayoutModifier = (HorizontalScrollLayoutModifier) obj;
            if (this.scrollerPosition == horizontalScrollLayoutModifier.scrollerPosition && this.cursorOffset == horizontalScrollLayoutModifier.cursorOffset && this.transformedText.equals(horizontalScrollLayoutModifier.transformedText) && Intrinsics.areEqual(this.textLayoutResultProvider, horizontalScrollLayoutModifier.textLayoutResultProvider)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.textLayoutResultProvider.hashCode() + ((this.transformedText.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.cursorOffset, this.scrollerPosition.hashCode() * 31, 31)) * 31);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    /* renamed from: measure-3p2s80s, reason: not valid java name */
    public final MeasureResult mo351measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        long j2;
        if (measurable.maxIntrinsicWidth(Constraints.m1024getMaxHeightimpl(j)) < Constraints.m1025getMaxWidthimpl(j)) {
            j2 = j;
        } else {
            j2 = j;
            j = Constraints.m1018copyZbe2FdA$default(j2, 0, Integer.MAX_VALUE, 0, 0, 13);
        }
        Placeable mo833measureBRTryo0 = measurable.mo833measureBRTryo0(j);
        int min = Math.min(mo833measureBRTryo0.width, Constraints.m1025getMaxWidthimpl(j2));
        return MeasureScope.layout$default(measureScope, min, mo833measureBRTryo0.height, new Hero3DCardViewKt$$ExternalSyntheticLambda13(this, measureScope, mo833measureBRTryo0, min, 1));
    }

    public final String toString() {
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.scrollerPosition + ", cursorOffset=" + this.cursorOffset + ", transformedText=" + this.transformedText + ", textLayoutResultProvider=" + this.textLayoutResultProvider + ')';
    }
}
