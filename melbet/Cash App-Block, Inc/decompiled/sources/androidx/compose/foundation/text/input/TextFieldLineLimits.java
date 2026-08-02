package androidx.compose.foundation.text.input;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes.dex */
public interface TextFieldLineLimits {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* loaded from: classes3.dex */
    public final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final MultiLine Default;

        static {
            int i = 0;
            Default = new MultiLine(i, 3, i);
        }

        public static MultiLine getDefault() {
            return Default;
        }
    }

    public final class SingleLine implements TextFieldLineLimits {
        public static final SingleLine INSTANCE = new SingleLine();

        public final String toString() {
            return "TextFieldLineLimits.SingleLine";
        }
    }

    public final class MultiLine implements TextFieldLineLimits {
        public final int maxHeightInLines;
        public final int minHeightInLines;

        public MultiLine(int i, int i2) {
            this.minHeightInLines = i;
            this.maxHeightInLines = i2;
            boolean z = false;
            if (1 <= i && i <= i2) {
                z = true;
            }
            if (z) {
                return;
            }
            InlineClassHelperKt.throwIllegalArgumentException("Expected 1 ≤ minHeightInLines ≤ maxHeightInLines, were " + i + ", " + i2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || MultiLine.class != obj.getClass()) {
                return false;
            }
            MultiLine multiLine = (MultiLine) obj;
            return this.minHeightInLines == multiLine.minHeightInLines && this.maxHeightInLines == multiLine.maxHeightInLines;
        }

        public final int hashCode() {
            return (this.minHeightInLines * 31) + this.maxHeightInLines;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MultiLine(minHeightInLines=");
            sb.append(this.minHeightInLines);
            sb.append(", maxHeightInLines=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.maxHeightInLines, ')');
        }

        public /* synthetic */ MultiLine(int i, int i2, int i3) {
            this((i2 & 1) != 0 ? 1 : i, Integer.MAX_VALUE);
        }
    }
}
