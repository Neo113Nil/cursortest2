package androidx.compose.ui.platform;

import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import com.google.mlkit.vision.text.Text;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class AccessibilityIterators$LineTextSegmentIterator extends Text.TextBase {
    public static AccessibilityIterators$LineTextSegmentIterator lineInstance;
    public TextLayoutResult layoutResult;
    public static final ResolvedTextDirection DirectionStart = ResolvedTextDirection.Rtl;
    public static final ResolvedTextDirection DirectionEnd = ResolvedTextDirection.Ltr;

    @Override // com.google.mlkit.vision.text.Text.TextBase
    public final int[] following(int i) {
        int i2;
        if (getText().length() > 0 && i < getText().length()) {
            TextLayoutResult textLayoutResult = this.layoutResult;
            ResolvedTextDirection resolvedTextDirection = DirectionStart;
            if (i < 0) {
                if (textLayoutResult == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                    throw null;
                }
                i2 = textLayoutResult.multiParagraph.getLineForOffset(0);
            } else {
                if (textLayoutResult == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                    throw null;
                }
                int lineForOffset = textLayoutResult.multiParagraph.getLineForOffset(i);
                i2 = getLineEdgeIndex(lineForOffset, resolvedTextDirection) == i ? lineForOffset : lineForOffset + 1;
            }
            TextLayoutResult textLayoutResult2 = this.layoutResult;
            if (textLayoutResult2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                throw null;
            }
            if (i2 < textLayoutResult2.multiParagraph.lineCount) {
                return getRange(getLineEdgeIndex(i2, resolvedTextDirection), getLineEdgeIndex(i2, DirectionEnd) + 1);
            }
        }
        return null;
    }

    public final int getLineEdgeIndex(int i, ResolvedTextDirection resolvedTextDirection) {
        TextLayoutResult textLayoutResult = this.layoutResult;
        if (textLayoutResult == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
            throw null;
        }
        int lineStart = textLayoutResult.getLineStart(i);
        TextLayoutResult textLayoutResult2 = this.layoutResult;
        if (textLayoutResult2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
            throw null;
        }
        ResolvedTextDirection paragraphDirection = textLayoutResult2.multiParagraph.getParagraphDirection(lineStart);
        TextLayoutResult textLayoutResult3 = this.layoutResult;
        if (resolvedTextDirection != paragraphDirection) {
            if (textLayoutResult3 != null) {
                return textLayoutResult3.getLineStart(i);
            }
            Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
            throw null;
        }
        if (textLayoutResult3 != null) {
            return textLayoutResult3.multiParagraph.getLineEnd(i, false) - 1;
        }
        Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
        throw null;
    }

    public final void initialize(String str, TextLayoutResult textLayoutResult) {
        this.zza = str;
        this.layoutResult = textLayoutResult;
    }

    @Override // com.google.mlkit.vision.text.Text.TextBase
    public final int[] preceding(int i) {
        int i2;
        if (getText().length() > 0 && i > 0) {
            int length = getText().length();
            TextLayoutResult textLayoutResult = this.layoutResult;
            ResolvedTextDirection resolvedTextDirection = DirectionEnd;
            if (i > length) {
                if (textLayoutResult == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                    throw null;
                }
                i2 = textLayoutResult.multiParagraph.getLineForOffset(getText().length());
            } else {
                if (textLayoutResult == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                    throw null;
                }
                int lineForOffset = textLayoutResult.multiParagraph.getLineForOffset(i);
                i2 = getLineEdgeIndex(lineForOffset, resolvedTextDirection) + 1 == i ? lineForOffset : lineForOffset - 1;
            }
            if (i2 >= 0) {
                return getRange(getLineEdgeIndex(i2, DirectionStart), getLineEdgeIndex(i2, resolvedTextDirection) + 1);
            }
        }
        return null;
    }
}
