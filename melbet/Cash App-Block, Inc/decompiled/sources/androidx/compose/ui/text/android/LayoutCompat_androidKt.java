package androidx.compose.ui.text.android;

import android.text.Layout;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class LayoutCompat_androidKt {
    public static final List access$toListOfCustomers() {
        List list = Collections.EMPTY_LIST;
        list.getClass();
        return list;
    }

    public static final int getLineForOffset(Layout layout, int i, boolean z) {
        if (i <= 0) {
            return 0;
        }
        if (i >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i);
        int lineStart = layout.getLineStart(lineForOffset);
        int lineEnd = layout.getLineEnd(lineForOffset);
        if (lineStart == i || lineEnd == i) {
            if (lineStart == i) {
                if (z) {
                    return lineForOffset - 1;
                }
            } else if (!z) {
                return lineForOffset + 1;
            }
        }
        return lineForOffset;
    }
}
