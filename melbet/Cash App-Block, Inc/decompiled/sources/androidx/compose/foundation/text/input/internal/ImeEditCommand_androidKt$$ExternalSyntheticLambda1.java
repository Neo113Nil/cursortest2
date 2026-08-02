package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.ui.text.TextRange;
import coil3.size.SizeKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.RangesKt___RangesKt;

/* loaded from: classes3.dex */
public final /* synthetic */ class ImeEditCommand_androidKt$$ExternalSyntheticLambda1 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ImeEditCommandScope f$0;
    public final /* synthetic */ int f$1;
    public final /* synthetic */ int f$2;

    public /* synthetic */ ImeEditCommand_androidKt$$ExternalSyntheticLambda1(ImeEditCommandScope imeEditCommandScope, int i, int i2) {
        this.$r8$classId = 0;
        this.f$0 = imeEditCommandScope;
        this.f$1 = i;
        this.f$2 = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        ImeEditCommandScope imeEditCommandScope = this.f$0;
        int i2 = this.f$2;
        int i3 = this.f$1;
        TextFieldBuffer textFieldBuffer = (TextFieldBuffer) obj;
        switch (i) {
            case 0:
                long mo388mapToTransformedGEjPoXI = imeEditCommandScope.mo388mapToTransformedGEjPoXI(SizeKt.TextRange(0, textFieldBuffer.buffer.length()));
                int m990getMinimpl = TextRange.m990getMinimpl(mo388mapToTransformedGEjPoXI);
                int m989getMaximpl = TextRange.m989getMaximpl(mo388mapToTransformedGEjPoXI);
                if (i3 < m990getMinimpl) {
                    i3 = m990getMinimpl;
                }
                if (i3 <= m989getMaximpl) {
                    m989getMaximpl = i3;
                }
                int m990getMinimpl2 = TextRange.m990getMinimpl(mo388mapToTransformedGEjPoXI);
                int m989getMaximpl2 = TextRange.m989getMaximpl(mo388mapToTransformedGEjPoXI);
                if (i2 < m990getMinimpl2) {
                    i2 = m990getMinimpl2;
                }
                if (i2 <= m989getMaximpl2) {
                    m989getMaximpl2 = i2;
                }
                textFieldBuffer.m379setSelection5zctL8(imeEditCommandScope.mo387mapFromTransformedGEjPoXI(SizeKt.TextRange(m989getMaximpl, m989getMaximpl2)));
                break;
            case 1:
                if (i3 < 0 || i2 < 0) {
                    InlineClassHelperKt.throwIllegalArgumentException("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i3 + " and " + i2 + " respectively.");
                }
                long mo388mapToTransformedGEjPoXI2 = imeEditCommandScope.mo388mapToTransformedGEjPoXI(textFieldBuffer.selectionInChars);
                int m989getMaximpl3 = TextRange.m989getMaximpl(mo388mapToTransformedGEjPoXI2);
                int i4 = m989getMaximpl3 + i2;
                if (((m989getMaximpl3 ^ i4) & (i2 ^ i4)) < 0) {
                    i4 = imeEditCommandScope.getTransformedLength();
                }
                long mo387mapFromTransformedGEjPoXI = imeEditCommandScope.mo387mapFromTransformedGEjPoXI(SizeKt.TextRange(TextRange.m989getMaximpl(mo388mapToTransformedGEjPoXI2), Math.min(i4, imeEditCommandScope.getTransformedLength())));
                MathUtilsKt.imeDelete(textFieldBuffer, TextRange.m990getMinimpl(mo387mapFromTransformedGEjPoXI), TextRange.m989getMaximpl(mo387mapFromTransformedGEjPoXI));
                int m990getMinimpl3 = TextRange.m990getMinimpl(mo388mapToTransformedGEjPoXI2);
                int i5 = m990getMinimpl3 - i3;
                if (((i3 ^ m990getMinimpl3) & (m990getMinimpl3 ^ i5)) < 0) {
                    i5 = 0;
                }
                long mo387mapFromTransformedGEjPoXI2 = imeEditCommandScope.mo387mapFromTransformedGEjPoXI(SizeKt.TextRange(Math.max(0, i5), TextRange.m990getMinimpl(mo388mapToTransformedGEjPoXI2)));
                MathUtilsKt.imeDelete(textFieldBuffer, TextRange.m990getMinimpl(mo387mapFromTransformedGEjPoXI2), TextRange.m989getMaximpl(mo387mapFromTransformedGEjPoXI2));
                break;
            default:
                TextRange textRange = textFieldBuffer.composition;
                PartialGapBuffer partialGapBuffer = textFieldBuffer.buffer;
                if (textRange != null) {
                    textFieldBuffer.m378setCompositionOEnZFl4(null);
                }
                if (i3 < 0) {
                    i3 = 0;
                }
                if (i2 < 0) {
                    i2 = 0;
                }
                long mo387mapFromTransformedGEjPoXI3 = imeEditCommandScope.mo387mapFromTransformedGEjPoXI(SizeKt.TextRange(i3, i2));
                int coerceIn = RangesKt___RangesKt.coerceIn(TextRange.m990getMinimpl(mo387mapFromTransformedGEjPoXI3), 0, partialGapBuffer.length());
                int coerceIn2 = RangesKt___RangesKt.coerceIn(TextRange.m989getMaximpl(mo387mapFromTransformedGEjPoXI3), 0, partialGapBuffer.length());
                if (coerceIn != coerceIn2) {
                    if (coerceIn < coerceIn2) {
                        textFieldBuffer.setComposition$foundation(coerceIn, coerceIn2, null);
                    } else {
                        textFieldBuffer.setComposition$foundation(coerceIn2, coerceIn, null);
                    }
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ ImeEditCommand_androidKt$$ExternalSyntheticLambda1(int i, int i2, ImeEditCommandScope imeEditCommandScope, int i3) {
        this.$r8$classId = i3;
        this.f$1 = i;
        this.f$2 = i2;
        this.f$0 = imeEditCommandScope;
    }
}
