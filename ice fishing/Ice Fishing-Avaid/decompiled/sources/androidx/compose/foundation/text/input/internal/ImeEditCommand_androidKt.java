package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.TextFieldBufferKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.RangesKt;

/* compiled from: ImeEditCommand.android.kt */
@Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0002\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000\u001a\u001c\u0010\u0007\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0000\u001a8\u0010\n\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u001a\b\u0002\u0010\u000b\u001a\u0014\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u000e0\rj\u0002`\u000f\u0018\u00010\fH\u0000\u001a\u001c\u0010\u0010\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0006H\u0000\u001a\u001c\u0010\u0013\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0006H\u0000\u001a\f\u0010\u0014\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\u001c\u0010\u0015\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0000\u001a\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0002\u001a$\u0010\u001b\u001a\u00020\u0001*\u00020\u001c2\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u001dH\u0001\u001a\u001c\u0010\u001e\u001a\u00020\u0001*\u00020\u001c2\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0001¨\u0006\u001f"}, d2 = {"commitText", "", "Landroidx/compose/foundation/text/input/internal/ImeEditCommandScope;", "text", "", "newCursorPosition", "", "setComposingRegion", "start", "end", "setComposingText", "annotations", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/AnnotatedString$Annotation;", "Landroidx/compose/foundation/text/input/PlacedAnnotation;", "deleteSurroundingText", "lengthBeforeCursor", "lengthAfterCursor", "deleteSurroundingTextInCodePoints", "finishComposingText", "setSelection", "isSurrogatePair", "", "high", "", "low", "imeReplace", "Landroidx/compose/foundation/text/input/TextFieldBuffer;", "", "imeDelete", "foundation"}, k = 2, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final class ImeEditCommand_androidKt {
    public static final void commitText(ImeEditCommandScope imeEditCommandScope, final String str, final int i) {
        imeEditCommandScope.edit(new Function1() { // from class: androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit commitText$lambda$0;
                commitText$lambda$0 = ImeEditCommand_androidKt.commitText$lambda$0(str, i, (TextFieldBuffer) obj);
                return commitText$lambda$0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit commitText$lambda$0(String str, int i, TextFieldBuffer textFieldBuffer) {
        TextRange composition = textFieldBuffer.getComposition();
        if (composition != null) {
            imeReplace(textFieldBuffer, TextRange.m9141getStartimpl(composition.getPackedValue()), TextRange.m9136getEndimpl(composition.getPackedValue()), str);
        } else {
            imeReplace(textFieldBuffer, TextRange.m9139getMinimpl(textFieldBuffer.getSelectionInChars()), TextRange.m9138getMaximpl(textFieldBuffer.getSelectionInChars()), str);
        }
        textFieldBuffer.m1972setSelection5zctL8(TextRangeKt.TextRange(RangesKt.coerceIn(i > 0 ? (r0 + i) - 1 : (TextRange.m9139getMinimpl(textFieldBuffer.getSelectionInChars()) + i) - str.length(), 0, textFieldBuffer.getLength())));
        return Unit.INSTANCE;
    }

    public static final void setComposingRegion(final ImeEditCommandScope imeEditCommandScope, final int i, final int i2) {
        imeEditCommandScope.edit(new Function1() { // from class: androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit composingRegion$lambda$0;
                composingRegion$lambda$0 = ImeEditCommand_androidKt.setComposingRegion$lambda$0(i, i2, imeEditCommandScope, (TextFieldBuffer) obj);
                return composingRegion$lambda$0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setComposingRegion$lambda$0(int i, int i2, ImeEditCommandScope imeEditCommandScope, TextFieldBuffer textFieldBuffer) {
        if (textFieldBuffer.hasComposition$foundation()) {
            textFieldBuffer.commitComposition$foundation();
        }
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        long mo2007mapFromTransformedGEjPoXI = imeEditCommandScope.mo2007mapFromTransformedGEjPoXI(TextRangeKt.TextRange(i, i2));
        int coerceIn = RangesKt.coerceIn(TextRange.m9139getMinimpl(mo2007mapFromTransformedGEjPoXI), 0, textFieldBuffer.getLength());
        int coerceIn2 = RangesKt.coerceIn(TextRange.m9138getMaximpl(mo2007mapFromTransformedGEjPoXI), 0, textFieldBuffer.getLength());
        if (coerceIn != coerceIn2) {
            if (coerceIn < coerceIn2) {
                TextFieldBuffer.setComposition$foundation$default(textFieldBuffer, coerceIn, coerceIn2, null, 4, null);
            } else {
                TextFieldBuffer.setComposition$foundation$default(textFieldBuffer, coerceIn2, coerceIn, null, 4, null);
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void setComposingText$default(ImeEditCommandScope imeEditCommandScope, String str, int i, List list, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            list = null;
        }
        setComposingText(imeEditCommandScope, str, i, list);
    }

    public static final void setComposingText(ImeEditCommandScope imeEditCommandScope, final String str, final int i, final List<AnnotatedString.Range<AnnotatedString.Annotation>> list) {
        imeEditCommandScope.edit(new Function1() { // from class: androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit composingText$lambda$0;
                composingText$lambda$0 = ImeEditCommand_androidKt.setComposingText$lambda$0(str, list, i, (TextFieldBuffer) obj);
                return composingText$lambda$0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setComposingText$lambda$0(String str, List list, int i, TextFieldBuffer textFieldBuffer) {
        TextRange composition = textFieldBuffer.getComposition();
        if (composition != null) {
            String str2 = str;
            imeReplace(textFieldBuffer, TextRange.m9141getStartimpl(composition.getPackedValue()), TextRange.m9136getEndimpl(composition.getPackedValue()), str2);
            if (str2.length() > 0) {
                textFieldBuffer.setComposition$foundation(TextRange.m9141getStartimpl(composition.getPackedValue()), TextRange.m9141getStartimpl(composition.getPackedValue()) + str.length(), list);
            }
        } else {
            int m9139getMinimpl = TextRange.m9139getMinimpl(textFieldBuffer.getSelectionInChars());
            String str3 = str;
            imeReplace(textFieldBuffer, m9139getMinimpl, TextRange.m9138getMaximpl(textFieldBuffer.getSelectionInChars()), str3);
            if (str3.length() > 0) {
                textFieldBuffer.setComposition$foundation(m9139getMinimpl, str.length() + m9139getMinimpl, list);
            }
        }
        textFieldBuffer.m1972setSelection5zctL8(TextRangeKt.TextRange(RangesKt.coerceIn(i > 0 ? (r5 + i) - 1 : (TextRange.m9139getMinimpl(textFieldBuffer.getSelectionInChars()) + i) - str.length(), 0, textFieldBuffer.getLength())));
        return Unit.INSTANCE;
    }

    public static final void deleteSurroundingText(final ImeEditCommandScope imeEditCommandScope, final int i, final int i2) {
        imeEditCommandScope.edit(new Function1() { // from class: androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit deleteSurroundingText$lambda$0;
                deleteSurroundingText$lambda$0 = ImeEditCommand_androidKt.deleteSurroundingText$lambda$0(i, i2, imeEditCommandScope, (TextFieldBuffer) obj);
                return deleteSurroundingText$lambda$0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit deleteSurroundingText$lambda$0(int i, int i2, ImeEditCommandScope imeEditCommandScope, TextFieldBuffer textFieldBuffer) {
        if (!(i >= 0 && i2 >= 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.");
        }
        long mo2008mapToTransformedGEjPoXI = imeEditCommandScope.mo2008mapToTransformedGEjPoXI(textFieldBuffer.getSelectionInChars());
        int m9138getMaximpl = TextRange.m9138getMaximpl(mo2008mapToTransformedGEjPoXI);
        int i3 = m9138getMaximpl + i2;
        if (((i2 ^ i3) & (m9138getMaximpl ^ i3)) < 0) {
            i3 = imeEditCommandScope.getTransformedLength();
        }
        long mo2007mapFromTransformedGEjPoXI = imeEditCommandScope.mo2007mapFromTransformedGEjPoXI(TextRangeKt.TextRange(TextRange.m9138getMaximpl(mo2008mapToTransformedGEjPoXI), Math.min(i3, imeEditCommandScope.getTransformedLength())));
        imeDelete(textFieldBuffer, TextRange.m9139getMinimpl(mo2007mapFromTransformedGEjPoXI), TextRange.m9138getMaximpl(mo2007mapFromTransformedGEjPoXI));
        int m9139getMinimpl = TextRange.m9139getMinimpl(mo2008mapToTransformedGEjPoXI);
        int i4 = m9139getMinimpl - i;
        if (((i ^ m9139getMinimpl) & (m9139getMinimpl ^ i4)) < 0) {
            i4 = 0;
        }
        long mo2007mapFromTransformedGEjPoXI2 = imeEditCommandScope.mo2007mapFromTransformedGEjPoXI(TextRangeKt.TextRange(Math.max(0, i4), TextRange.m9139getMinimpl(mo2008mapToTransformedGEjPoXI)));
        imeDelete(textFieldBuffer, TextRange.m9139getMinimpl(mo2007mapFromTransformedGEjPoXI2), TextRange.m9138getMaximpl(mo2007mapFromTransformedGEjPoXI2));
        return Unit.INSTANCE;
    }

    public static final void deleteSurroundingTextInCodePoints(ImeEditCommandScope imeEditCommandScope, final int i, final int i2) {
        imeEditCommandScope.edit(new Function1() { // from class: androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit deleteSurroundingTextInCodePoints$lambda$0;
                deleteSurroundingTextInCodePoints$lambda$0 = ImeEditCommand_androidKt.deleteSurroundingTextInCodePoints$lambda$0(i, i2, (TextFieldBuffer) obj);
                return deleteSurroundingTextInCodePoints$lambda$0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit deleteSurroundingTextInCodePoints$lambda$0(int i, int i2, TextFieldBuffer textFieldBuffer) {
        int i3 = 0;
        if (!(i >= 0 && i2 >= 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.");
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (i4 < i) {
                int i6 = i5 + 1;
                if (TextRange.m9139getMinimpl(textFieldBuffer.getSelectionInChars()) > i6) {
                    i5 = isSurrogatePair(textFieldBuffer.asCharSequence().charAt((TextRange.m9139getMinimpl(textFieldBuffer.getSelectionInChars()) - i6) - 1), textFieldBuffer.asCharSequence().charAt(TextRange.m9139getMinimpl(textFieldBuffer.getSelectionInChars()) - i6)) ? i5 + 2 : i6;
                    i4++;
                } else {
                    i5 = TextRange.m9139getMinimpl(textFieldBuffer.getSelectionInChars());
                    break;
                }
            } else {
                break;
            }
        }
        int i7 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            int i8 = i7 + 1;
            if (TextRange.m9138getMaximpl(textFieldBuffer.getSelectionInChars()) + i8 < textFieldBuffer.getLength()) {
                i7 = isSurrogatePair(textFieldBuffer.asCharSequence().charAt((TextRange.m9138getMaximpl(textFieldBuffer.getSelectionInChars()) + i8) - 1), textFieldBuffer.asCharSequence().charAt(TextRange.m9138getMaximpl(textFieldBuffer.getSelectionInChars()) + i8)) ? i7 + 2 : i8;
                i3++;
            } else {
                i7 = textFieldBuffer.getLength() - TextRange.m9138getMaximpl(textFieldBuffer.getSelectionInChars());
                break;
            }
        }
        imeDelete(textFieldBuffer, TextRange.m9138getMaximpl(textFieldBuffer.getSelectionInChars()), TextRange.m9138getMaximpl(textFieldBuffer.getSelectionInChars()) + i7);
        imeDelete(textFieldBuffer, TextRange.m9139getMinimpl(textFieldBuffer.getSelectionInChars()) - i5, TextRange.m9139getMinimpl(textFieldBuffer.getSelectionInChars()));
        return Unit.INSTANCE;
    }

    public static final void finishComposingText(ImeEditCommandScope imeEditCommandScope) {
        imeEditCommandScope.edit(new Function1() { // from class: androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit finishComposingText$lambda$0;
                finishComposingText$lambda$0 = ImeEditCommand_androidKt.finishComposingText$lambda$0((TextFieldBuffer) obj);
                return finishComposingText$lambda$0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit finishComposingText$lambda$0(TextFieldBuffer textFieldBuffer) {
        textFieldBuffer.commitComposition$foundation();
        return Unit.INSTANCE;
    }

    public static final void setSelection(final ImeEditCommandScope imeEditCommandScope, final int i, final int i2) {
        imeEditCommandScope.edit(new Function1() { // from class: androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit selection$lambda$0;
                selection$lambda$0 = ImeEditCommand_androidKt.setSelection$lambda$0(ImeEditCommandScope.this, i, i2, (TextFieldBuffer) obj);
                return selection$lambda$0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setSelection$lambda$0(ImeEditCommandScope imeEditCommandScope, int i, int i2, TextFieldBuffer textFieldBuffer) {
        long mo2008mapToTransformedGEjPoXI = imeEditCommandScope.mo2008mapToTransformedGEjPoXI(TextRangeKt.TextRange(0, textFieldBuffer.getLength()));
        int m9139getMinimpl = TextRange.m9139getMinimpl(mo2008mapToTransformedGEjPoXI);
        int m9138getMaximpl = TextRange.m9138getMaximpl(mo2008mapToTransformedGEjPoXI);
        if (i < m9139getMinimpl) {
            i = m9139getMinimpl;
        }
        if (i <= m9138getMaximpl) {
            m9138getMaximpl = i;
        }
        int m9139getMinimpl2 = TextRange.m9139getMinimpl(mo2008mapToTransformedGEjPoXI);
        int m9138getMaximpl2 = TextRange.m9138getMaximpl(mo2008mapToTransformedGEjPoXI);
        if (i2 < m9139getMinimpl2) {
            i2 = m9139getMinimpl2;
        }
        if (i2 <= m9138getMaximpl2) {
            m9138getMaximpl2 = i2;
        }
        textFieldBuffer.m1972setSelection5zctL8(imeEditCommandScope.mo2007mapFromTransformedGEjPoXI(TextRangeKt.TextRange(m9138getMaximpl, m9138getMaximpl2)));
        return Unit.INSTANCE;
    }

    private static final boolean isSurrogatePair(char c, char c2) {
        return Character.isHighSurrogate(c) && Character.isLowSurrogate(c2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0046, code lost:
    
        if (r8 == r2) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0049, code lost:
    
        r6.commitComposition$foundation();
        r6.clearHighlight$foundation();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void imeReplace(TextFieldBuffer textFieldBuffer, int i, int i2, CharSequence charSequence) {
        int min = Math.min(i, i2);
        int max = Math.max(i, i2);
        int i3 = 0;
        int i4 = min;
        while (i4 < max && i3 < charSequence.length() && charSequence.charAt(i3) == textFieldBuffer.asCharSequence().charAt(i4)) {
            i3++;
            i4++;
        }
        int length = charSequence.length();
        while (max > i4 && length > i3 && charSequence.charAt(length - 1) == textFieldBuffer.asCharSequence().charAt(max - 1)) {
            length--;
            max--;
        }
        textFieldBuffer.replace(i4, max, charSequence.subSequence(i3, length));
        textFieldBuffer.m1972setSelection5zctL8(TextRangeKt.TextRange(min + charSequence.length()));
    }

    public static final void imeDelete(TextFieldBuffer textFieldBuffer, int i, int i2) {
        TextRange composition = textFieldBuffer.getComposition();
        int min = Math.min(i, i2);
        int max = Math.max(i, i2);
        TextFieldBufferKt.delete(textFieldBuffer, min, max);
        if (composition != null) {
            composition.getPackedValue();
            long m1976adjustTextRangevJH6DeI = TextFieldBufferKt.m1976adjustTextRangevJH6DeI(composition.getPackedValue(), min, max, 0);
            if (TextRange.m9135getCollapsedimpl(m1976adjustTextRangevJH6DeI)) {
                textFieldBuffer.commitComposition$foundation();
            } else {
                TextFieldBuffer.setComposition$foundation$default(textFieldBuffer, TextRange.m9139getMinimpl(m1976adjustTextRangevJH6DeI), TextRange.m9138getMaximpl(m1976adjustTextRangevJH6DeI), null, 4, null);
            }
        }
    }
}
