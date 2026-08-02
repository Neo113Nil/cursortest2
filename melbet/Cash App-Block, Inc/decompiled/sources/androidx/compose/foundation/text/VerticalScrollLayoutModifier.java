package androidx.compose.foundation.text;

import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.unit.Constraints;
import com.squareup.cash.pools.views.PoolGoalMetKt$$ExternalSyntheticLambda6;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class VerticalScrollLayoutModifier implements LayoutModifier {
    public final int cursorOffset;
    public final TextFieldScrollerPosition scrollerPosition;
    public final Function0 textLayoutResultProvider;
    public final TransformedText transformedText;

    public VerticalScrollLayoutModifier(TextFieldScrollerPosition textFieldScrollerPosition, int i, TransformedText transformedText, Function0 function0) {
        this.scrollerPosition = textFieldScrollerPosition;
        this.cursorOffset = i;
        this.transformedText = transformedText;
        this.textLayoutResultProvider = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof VerticalScrollLayoutModifier) {
            VerticalScrollLayoutModifier verticalScrollLayoutModifier = (VerticalScrollLayoutModifier) obj;
            if (this.scrollerPosition == verticalScrollLayoutModifier.scrollerPosition && this.cursorOffset == verticalScrollLayoutModifier.cursorOffset && this.transformedText.equals(verticalScrollLayoutModifier.transformedText) && Intrinsics.areEqual(this.textLayoutResultProvider, verticalScrollLayoutModifier.textLayoutResultProvider)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.textLayoutResultProvider.hashCode() + ((this.transformedText.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.cursorOffset, this.scrollerPosition.hashCode() * 31, 31)) * 31);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo351measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        Placeable mo833measureBRTryo0 = measurable.mo833measureBRTryo0(Constraints.m1018copyZbe2FdA$default(j, 0, 0, 0, Integer.MAX_VALUE, 7));
        int min = Math.min(mo833measureBRTryo0.height, Constraints.m1024getMaxHeightimpl(j));
        return MeasureScope.layout$default(measureScope, mo833measureBRTryo0.width, min, new PoolGoalMetKt$$ExternalSyntheticLambda6(this, mo833measureBRTryo0, min, 1));
    }

    public final String toString() {
        return "VerticalScrollLayoutModifier(scrollerPosition=" + this.scrollerPosition + ", cursorOffset=" + this.cursorOffset + ", transformedText=" + this.transformedText + ", textLayoutResultProvider=" + this.textLayoutResultProvider + ')';
    }
}
