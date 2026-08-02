package androidx.compose.ui.platform;

import com.google.mlkit.vision.text.Text;

/* loaded from: classes3.dex */
public final class AccessibilityIterators$ParagraphTextSegmentIterator extends Text.TextBase {
    public static AccessibilityIterators$ParagraphTextSegmentIterator instance;

    @Override // com.google.mlkit.vision.text.Text.TextBase
    public final int[] following(int i) {
        int length = getText().length();
        if (length <= 0 || i >= length) {
            return null;
        }
        if (i < 0) {
            i = 0;
        }
        while (i < length && getText().charAt(i) == '\n' && (getText().charAt(i) == '\n' || (i != 0 && getText().charAt(i - 1) != '\n'))) {
            i++;
        }
        if (i >= length) {
            return null;
        }
        int i2 = i + 1;
        while (i2 < length && !isEndBoundary(i2)) {
            i2++;
        }
        return getRange(i, i2);
    }

    public final boolean isEndBoundary(int i) {
        if (i <= 0 || getText().charAt(i - 1) == '\n') {
            return false;
        }
        return i == getText().length() || getText().charAt(i) == '\n';
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        return null;
     */
    @Override // com.google.mlkit.vision.text.Text.TextBase
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int[] preceding(int i) {
        int length = getText().length();
        if (length <= 0 || i <= 0) {
            return null;
        }
        if (i > length) {
            i = length;
        }
        while (i > 0 && getText().charAt(i - 1) == '\n' && !isEndBoundary(i)) {
            i--;
        }
        int i2 = i - 1;
        while (i2 > 0 && (getText().charAt(i2) == '\n' || (i2 != 0 && getText().charAt(i2 - 1) != '\n'))) {
            i2--;
        }
        return getRange(i2, i);
    }
}
