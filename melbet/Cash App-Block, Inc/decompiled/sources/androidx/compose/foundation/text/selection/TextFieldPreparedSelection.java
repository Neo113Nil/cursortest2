package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.KeyMappingKt;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.CommitTextCommand;
import androidx.compose.ui.text.input.EditCommand;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.SetSelectionCommand;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import coil3.size.SizeKt;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public final class TextFieldPreparedSelection {
    public final AnnotatedString annotatedString;
    public final TextFieldValue currentValue;
    public final TextLayoutResult layoutResult;
    public final TextLayoutResultProxy layoutResultProxy;
    public final OffsetMapping offsetMapping;
    public final long originalSelection;
    public final AnnotatedString originalText;
    public long selection;
    public final TextPreparedSelectionState state;

    public TextFieldPreparedSelection(TextFieldValue textFieldValue, OffsetMapping offsetMapping, TextLayoutResultProxy textLayoutResultProxy, TextPreparedSelectionState textPreparedSelectionState) {
        AnnotatedString annotatedString = textFieldValue.annotatedString;
        long j = textFieldValue.selection;
        TextLayoutResult textLayoutResult = textLayoutResultProxy != null ? textLayoutResultProxy.value : null;
        this.originalText = annotatedString;
        this.originalSelection = j;
        this.layoutResult = textLayoutResult;
        this.offsetMapping = offsetMapping;
        this.state = textPreparedSelectionState;
        this.selection = j;
        this.annotatedString = annotatedString;
        this.currentValue = textFieldValue;
        this.layoutResultProxy = textLayoutResultProxy;
    }

    public final List deleteIfSelectedOr(Function1 function1) {
        if (!TextRange.m987getCollapsedimpl(this.selection)) {
            return CollectionsKt__CollectionsKt.listOf((Object[]) new EditCommand[]{new CommitTextCommand("", 0), new SetSelectionCommand(TextRange.m990getMinimpl(this.selection), TextRange.m990getMinimpl(this.selection))});
        }
        EditCommand editCommand = (EditCommand) function1.invoke(this);
        if (editCommand != null) {
            return CollectionsKt__CollectionsJVMKt.listOf(editCommand);
        }
        return null;
    }

    public final Integer getLineEndByOffset() {
        TextLayoutResult textLayoutResult = this.layoutResult;
        if (textLayoutResult == null) {
            return null;
        }
        MultiParagraph multiParagraph = textLayoutResult.multiParagraph;
        int m989getMaximpl = TextRange.m989getMaximpl(this.selection);
        OffsetMapping offsetMapping = this.offsetMapping;
        return Integer.valueOf(offsetMapping.transformedToOriginal(multiParagraph.getLineEnd(multiParagraph.getLineForOffset(offsetMapping.originalToTransformed(m989getMaximpl)), true)));
    }

    public final Integer getLineStartByOffset() {
        TextLayoutResult textLayoutResult = this.layoutResult;
        if (textLayoutResult == null) {
            return null;
        }
        int m990getMinimpl = TextRange.m990getMinimpl(this.selection);
        OffsetMapping offsetMapping = this.offsetMapping;
        return Integer.valueOf(offsetMapping.transformedToOriginal(textLayoutResult.getLineStart(textLayoutResult.multiParagraph.getLineForOffset(offsetMapping.originalToTransformed(m990getMinimpl)))));
    }

    public final Integer getNextWordOffset() {
        int length;
        TextLayoutResult textLayoutResult = this.layoutResult;
        if (textLayoutResult == null) {
            return null;
        }
        int transformedEndOffset = transformedEndOffset();
        while (true) {
            AnnotatedString annotatedString = this.originalText;
            if (transformedEndOffset < annotatedString.text.length()) {
                int length2 = this.annotatedString.text.length() - 1;
                if (transformedEndOffset <= length2) {
                    length2 = transformedEndOffset;
                }
                long m978getWordBoundaryjx7JFs = textLayoutResult.m978getWordBoundaryjx7JFs(length2);
                int i = TextRange.$r8$clinit;
                int i2 = (int) (m978getWordBoundaryjx7JFs & BodyPartID.bodyIdMax);
                if (i2 > transformedEndOffset) {
                    length = this.offsetMapping.transformedToOriginal(i2);
                    break;
                }
                transformedEndOffset++;
            } else {
                length = annotatedString.text.length();
                break;
            }
        }
        return Integer.valueOf(length);
    }

    public final Integer getPreviousWordOffset() {
        int i;
        TextLayoutResult textLayoutResult = this.layoutResult;
        if (textLayoutResult == null) {
            return null;
        }
        int transformedEndOffset = transformedEndOffset();
        while (true) {
            if (transformedEndOffset <= 0) {
                i = 0;
                break;
            }
            int length = this.annotatedString.text.length() - 1;
            if (transformedEndOffset <= length) {
                length = transformedEndOffset;
            }
            long m978getWordBoundaryjx7JFs = textLayoutResult.m978getWordBoundaryjx7JFs(length);
            int i2 = TextRange.$r8$clinit;
            int i3 = (int) (m978getWordBoundaryjx7JFs >> 32);
            if (i3 < transformedEndOffset) {
                i = this.offsetMapping.transformedToOriginal(i3);
                break;
            }
            transformedEndOffset--;
        }
        return Integer.valueOf(i);
    }

    public final boolean isLtr() {
        TextLayoutResult textLayoutResult = this.layoutResult;
        return (textLayoutResult != null ? textLayoutResult.multiParagraph.getParagraphDirection(transformedEndOffset()) : null) != ResolvedTextDirection.Rtl;
    }

    public final int jumpByLinesOffset(TextLayoutResult textLayoutResult, int i) {
        int transformedEndOffset = transformedEndOffset();
        TextPreparedSelectionState textPreparedSelectionState = this.state;
        if (textPreparedSelectionState.cachedX == null) {
            textPreparedSelectionState.cachedX = Float.valueOf(textLayoutResult.getCursorRect(transformedEndOffset).left);
        }
        MultiParagraph multiParagraph = textLayoutResult.multiParagraph;
        int lineForOffset = multiParagraph.getLineForOffset(transformedEndOffset) + i;
        if (lineForOffset < 0) {
            return 0;
        }
        if (lineForOffset >= multiParagraph.lineCount) {
            return this.annotatedString.text.length();
        }
        float lineBottom = multiParagraph.getLineBottom(lineForOffset) - 1.0f;
        Float f = textPreparedSelectionState.cachedX;
        f.getClass();
        float floatValue = f.floatValue();
        if ((isLtr() && floatValue >= textLayoutResult.getLineRight(lineForOffset)) || (!isLtr() && floatValue <= textLayoutResult.getLineLeft(lineForOffset))) {
            return multiParagraph.getLineEnd(lineForOffset, true);
        }
        return this.offsetMapping.transformedToOriginal(multiParagraph.m966getOffsetForPositionk4lQ0M((Float.floatToRawIntBits(lineBottom) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(f.floatValue()) << 32)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0011, code lost:
    
        if (r9 == null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int jumpByPagesOffset(TextLayoutResultProxy textLayoutResultProxy, int i) {
        Rect rect;
        LayoutCoordinates layoutCoordinates = textLayoutResultProxy.innerTextFieldCoordinates;
        TextLayoutResult textLayoutResult = textLayoutResultProxy.value;
        if (layoutCoordinates != null) {
            LayoutCoordinates layoutCoordinates2 = textLayoutResultProxy.decorationBoxCoordinates;
            rect = layoutCoordinates2 != null ? layoutCoordinates2.localBoundingBoxOf(layoutCoordinates, true) : null;
        }
        rect = Rect.Zero;
        long j = this.currentValue.selection;
        int i2 = TextRange.$r8$clinit;
        int i3 = (int) (j & BodyPartID.bodyIdMax);
        OffsetMapping offsetMapping = this.offsetMapping;
        Rect cursorRect = textLayoutResult.getCursorRect(offsetMapping.originalToTransformed(i3));
        float f = cursorRect.left;
        float intBitsToFloat = (Float.intBitsToFloat((int) (rect.m634getSizeNHjbRc() & BodyPartID.bodyIdMax)) * i) + cursorRect.top;
        return offsetMapping.transformedToOriginal(textLayoutResult.multiParagraph.m966getOffsetForPositionk4lQ0M((Float.floatToRawIntBits(intBitsToFloat) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(f) << 32)));
    }

    public final void moveCursorLeft() {
        TextPreparedSelectionState textPreparedSelectionState = this.state;
        textPreparedSelectionState.cachedX = null;
        AnnotatedString annotatedString = this.annotatedString;
        if (annotatedString.text.length() > 0) {
            if (isLtr()) {
                moveCursorPrev();
                return;
            }
            textPreparedSelectionState.cachedX = null;
            if (annotatedString.text.length() > 0) {
                String str = annotatedString.text;
                long j = this.selection;
                int i = TextRange.$r8$clinit;
                int findFollowingBreak = KeyMappingKt.findFollowingBreak((int) (j & BodyPartID.bodyIdMax), str);
                if (findFollowingBreak != -1) {
                    setSelection(findFollowingBreak, findFollowingBreak);
                }
            }
        }
    }

    public final void moveCursorNextByParagraph() {
        this.state.cachedX = null;
        AnnotatedString annotatedString = this.annotatedString;
        String str = annotatedString.text;
        String str2 = annotatedString.text;
        if (str.length() > 0) {
            int findParagraphEnd = KeyMappingKt.findParagraphEnd(TextRange.m989getMaximpl(this.selection), str2);
            if (findParagraphEnd == TextRange.m989getMaximpl(this.selection) && findParagraphEnd != str2.length()) {
                findParagraphEnd = KeyMappingKt.findParagraphEnd(findParagraphEnd + 1, str2);
            }
            setSelection(findParagraphEnd, findParagraphEnd);
        }
    }

    public final void moveCursorPrev() {
        this.state.cachedX = null;
        AnnotatedString annotatedString = this.annotatedString;
        if (annotatedString.text.length() > 0) {
            String str = annotatedString.text;
            long j = this.selection;
            int i = TextRange.$r8$clinit;
            int findPrecedingBreak = KeyMappingKt.findPrecedingBreak((int) (j & BodyPartID.bodyIdMax), str);
            if (findPrecedingBreak != -1) {
                setSelection(findPrecedingBreak, findPrecedingBreak);
            }
        }
    }

    public final void moveCursorPrevByParagraph() {
        this.state.cachedX = null;
        AnnotatedString annotatedString = this.annotatedString;
        String str = annotatedString.text;
        String str2 = annotatedString.text;
        if (str.length() > 0) {
            int findParagraphStart = KeyMappingKt.findParagraphStart(TextRange.m990getMinimpl(this.selection), str2);
            if (findParagraphStart == TextRange.m990getMinimpl(this.selection) && findParagraphStart != 0) {
                findParagraphStart = KeyMappingKt.findParagraphStart(findParagraphStart - 1, str2);
            }
            setSelection(findParagraphStart, findParagraphStart);
        }
    }

    public final void moveCursorRight() {
        TextPreparedSelectionState textPreparedSelectionState = this.state;
        textPreparedSelectionState.cachedX = null;
        AnnotatedString annotatedString = this.annotatedString;
        if (annotatedString.text.length() > 0) {
            if (!isLtr()) {
                moveCursorPrev();
                return;
            }
            textPreparedSelectionState.cachedX = null;
            if (annotatedString.text.length() > 0) {
                String str = annotatedString.text;
                long j = this.selection;
                int i = TextRange.$r8$clinit;
                int findFollowingBreak = KeyMappingKt.findFollowingBreak((int) (j & BodyPartID.bodyIdMax), str);
                if (findFollowingBreak != -1) {
                    setSelection(findFollowingBreak, findFollowingBreak);
                }
            }
        }
    }

    public final void moveCursorToLineEnd() {
        Integer lineEndByOffset;
        this.state.cachedX = null;
        if (this.annotatedString.text.length() <= 0 || (lineEndByOffset = getLineEndByOffset()) == null) {
            return;
        }
        int intValue = lineEndByOffset.intValue();
        setSelection(intValue, intValue);
    }

    public final void moveCursorToLineStart() {
        Integer lineStartByOffset;
        this.state.cachedX = null;
        if (this.annotatedString.text.length() <= 0 || (lineStartByOffset = getLineStartByOffset()) == null) {
            return;
        }
        int intValue = lineStartByOffset.intValue();
        setSelection(intValue, intValue);
    }

    public final void selectMovement() {
        if (this.annotatedString.text.length() > 0) {
            int i = TextRange.$r8$clinit;
            this.selection = SizeKt.TextRange((int) (this.originalSelection >> 32), (int) (this.selection & BodyPartID.bodyIdMax));
        }
    }

    public final void setSelection(int i, int i2) {
        this.selection = SizeKt.TextRange(i, i2);
    }

    public final int transformedEndOffset() {
        long j = this.selection;
        int i = TextRange.$r8$clinit;
        return this.offsetMapping.originalToTransformed((int) (j & BodyPartID.bodyIdMax));
    }
}
