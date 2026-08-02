package androidx.compose.ui.platform;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.recyclerview.widget.RecyclerView;
import com.google.mlkit.vision.text.Text;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class AccessibilityIterators$PageTextSegmentIterator extends Text.TextBase {
    public static AccessibilityIterators$PageTextSegmentIterator pageInstance;
    public TextLayoutResult layoutResult;
    public SemanticsNode node;
    public static final ResolvedTextDirection DirectionStart = ResolvedTextDirection.Rtl;
    public static final ResolvedTextDirection DirectionEnd = ResolvedTextDirection.Ltr;

    @Override // com.google.mlkit.vision.text.Text.TextBase
    public final int[] following(int i) {
        int i2;
        if (getText().length() > 0 && i < getText().length()) {
            try {
                SemanticsNode semanticsNode = this.node;
                if (semanticsNode == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("node");
                    throw null;
                }
                Rect boundsInRoot = semanticsNode.getBoundsInRoot();
                int round = Math.round(boundsInRoot.bottom - boundsInRoot.top);
                if (i <= 0) {
                    i = 0;
                }
                TextLayoutResult textLayoutResult = this.layoutResult;
                if (textLayoutResult == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                    throw null;
                }
                int lineForOffset = textLayoutResult.multiParagraph.getLineForOffset(i);
                TextLayoutResult textLayoutResult2 = this.layoutResult;
                if (textLayoutResult2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                    throw null;
                }
                float lineTop = textLayoutResult2.multiParagraph.getLineTop(lineForOffset) + round;
                TextLayoutResult textLayoutResult3 = this.layoutResult;
                if (textLayoutResult3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                    throw null;
                }
                float lineTop2 = textLayoutResult3.multiParagraph.getLineTop(r0.lineCount - 1);
                TextLayoutResult textLayoutResult4 = this.layoutResult;
                if (lineTop < lineTop2) {
                    if (textLayoutResult4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                        throw null;
                    }
                    i2 = textLayoutResult4.multiParagraph.getLineForVerticalPosition(lineTop);
                } else {
                    if (textLayoutResult4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                        throw null;
                    }
                    i2 = textLayoutResult4.multiParagraph.lineCount;
                }
                return getRange(i, getLineEdgeIndex$1(i2 - 1, DirectionEnd) + 1);
            } catch (IllegalStateException unused) {
            }
        }
        return null;
    }

    public final int getLineEdgeIndex$1(int i, ResolvedTextDirection resolvedTextDirection) {
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

    public final void initialize(String str, TextLayoutResult textLayoutResult, SemanticsNode semanticsNode) {
        this.zza = str;
        this.layoutResult = textLayoutResult;
        this.node = semanticsNode;
    }

    @Override // com.google.mlkit.vision.text.Text.TextBase
    public final int[] preceding(int i) {
        int i2;
        if (getText().length() > 0 && i > 0) {
            try {
                SemanticsNode semanticsNode = this.node;
                if (semanticsNode == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("node");
                    throw null;
                }
                Rect boundsInRoot = semanticsNode.getBoundsInRoot();
                int round = Math.round(boundsInRoot.bottom - boundsInRoot.top);
                int length = getText().length();
                if (length <= i) {
                    i = length;
                }
                TextLayoutResult textLayoutResult = this.layoutResult;
                if (textLayoutResult == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                    throw null;
                }
                int lineForOffset = textLayoutResult.multiParagraph.getLineForOffset(i);
                TextLayoutResult textLayoutResult2 = this.layoutResult;
                if (textLayoutResult2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                    throw null;
                }
                float lineTop = textLayoutResult2.multiParagraph.getLineTop(lineForOffset) - round;
                if (lineTop > RecyclerView.DECELERATION_RATE) {
                    TextLayoutResult textLayoutResult3 = this.layoutResult;
                    if (textLayoutResult3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                        throw null;
                    }
                    i2 = textLayoutResult3.multiParagraph.getLineForVerticalPosition(lineTop);
                } else {
                    i2 = 0;
                }
                if (i == getText().length() && i2 < lineForOffset) {
                    i2++;
                }
                return getRange(getLineEdgeIndex$1(i2, DirectionStart), i);
            } catch (IllegalStateException unused) {
            }
        }
        return null;
    }
}
