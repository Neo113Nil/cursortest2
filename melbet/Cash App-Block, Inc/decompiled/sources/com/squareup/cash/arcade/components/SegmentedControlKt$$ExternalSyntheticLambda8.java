package com.squareup.cash.arcade.components;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.internal.MathUtilsKt;
import androidx.compose.foundation.text.input.internal.PartialGapBuffer;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextRange;
import com.squareup.cash.investing.components.metrics.InvestingFinancialGraphBarView;
import com.squareup.contour.ContourLayout;
import com.squareup.contour.YInt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final /* synthetic */ class SegmentedControlKt$$ExternalSyntheticLambda8 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ int f$0;
    public final /* synthetic */ int f$1;

    public /* synthetic */ SegmentedControlKt$$ExternalSyntheticLambda8(int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$0 = i;
        this.f$1 = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        int i2 = 0;
        int i3 = this.f$1;
        int i4 = this.f$0;
        switch (i) {
            case 0:
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver.getClass();
                SemanticsPropertiesKt.m950setRolekuIjeqM(semanticsPropertyReceiver, 3);
                SemanticsPropertiesKt.setSelected(semanticsPropertyReceiver, i4 == i3);
                return Unit.INSTANCE;
            case 1:
                TextFieldBuffer textFieldBuffer = (TextFieldBuffer) obj;
                if (i4 < 0 || i3 < 0) {
                    InlineClassHelperKt.throwIllegalArgumentException("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i4 + " and " + i3 + " respectively.");
                }
                int i5 = 0;
                int i6 = 0;
                while (true) {
                    if (i5 < i4) {
                        int i7 = i6 + 1;
                        long j = textFieldBuffer.selectionInChars;
                        PartialGapBuffer partialGapBuffer = textFieldBuffer.buffer;
                        int m990getMinimpl = TextRange.m990getMinimpl(j);
                        long j2 = textFieldBuffer.selectionInChars;
                        if (m990getMinimpl > i7) {
                            i6 = (Character.isHighSurrogate(partialGapBuffer.charAt((TextRange.m990getMinimpl(j2) - i7) - 1)) && Character.isLowSurrogate(partialGapBuffer.charAt(TextRange.m990getMinimpl(textFieldBuffer.selectionInChars) - i7))) ? i6 + 2 : i7;
                            i5++;
                        } else {
                            i6 = TextRange.m990getMinimpl(j2);
                        }
                    }
                }
                int i8 = 0;
                while (true) {
                    if (i2 < i3) {
                        int i9 = i8 + 1;
                        long j3 = textFieldBuffer.selectionInChars;
                        PartialGapBuffer partialGapBuffer2 = textFieldBuffer.buffer;
                        if (TextRange.m989getMaximpl(j3) + i9 < partialGapBuffer2.length()) {
                            i8 = (Character.isHighSurrogate(partialGapBuffer2.charAt((TextRange.m989getMaximpl(textFieldBuffer.selectionInChars) + i9) - 1)) && Character.isLowSurrogate(partialGapBuffer2.charAt(TextRange.m989getMaximpl(textFieldBuffer.selectionInChars) + i9))) ? i8 + 2 : i9;
                            i2++;
                        } else {
                            i8 = partialGapBuffer2.length() - TextRange.m989getMaximpl(textFieldBuffer.selectionInChars);
                        }
                    }
                }
                MathUtilsKt.imeDelete(textFieldBuffer, TextRange.m989getMaximpl(textFieldBuffer.selectionInChars), TextRange.m989getMaximpl(textFieldBuffer.selectionInChars) + i8);
                MathUtilsKt.imeDelete(textFieldBuffer, TextRange.m990getMinimpl(textFieldBuffer.selectionInChars) - i6, TextRange.m990getMinimpl(textFieldBuffer.selectionInChars));
                return Unit.INSTANCE;
            case 2:
                ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                int i10 = InvestingFinancialGraphBarView.$r8$clinit;
                layoutSpec.getClass();
                return new YInt((layoutSpec.getParent().m4372bottomh0YXg9w() - i4) + i3);
            case 3:
                ContourLayout.LayoutSpec layoutSpec2 = (ContourLayout.LayoutSpec) obj;
                int i11 = InvestingFinancialGraphBarView.$r8$clinit;
                layoutSpec2.getClass();
                return new YInt((layoutSpec2.getParent().m4372bottomh0YXg9w() - i4) - i3);
            case 4:
                ContourLayout.LayoutSpec layoutSpec3 = (ContourLayout.LayoutSpec) obj;
                int i12 = InvestingFinancialGraphBarView.$r8$clinit;
                layoutSpec3.getClass();
                return new YInt((layoutSpec3.getParent().m4372bottomh0YXg9w() - i4) + i3);
            case 5:
                ContourLayout.LayoutSpec layoutSpec4 = (ContourLayout.LayoutSpec) obj;
                int i13 = InvestingFinancialGraphBarView.$r8$clinit;
                layoutSpec4.getClass();
                return new YInt((layoutSpec4.getParent().m4372bottomh0YXg9w() - i4) - i3);
            default:
                SemanticsPropertyReceiver semanticsPropertyReceiver2 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver2.getClass();
                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver2, "Page " + (i4 + 1) + " of " + i3);
                return Unit.INSTANCE;
        }
    }
}
