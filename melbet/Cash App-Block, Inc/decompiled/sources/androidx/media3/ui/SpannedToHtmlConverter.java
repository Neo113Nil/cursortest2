package androidx.media3.ui;

import android.text.Html;
import bo.app.ng$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public abstract class SpannedToHtmlConverter {
    public static final Pattern NEWLINE_PATTERN = Pattern.compile("(&#13;)?&#10;");

    public final class SpanInfo {
        public final String closingTag;
        public final int end;
        public final String openingTag;
        public final int start;
        public static final ng$$ExternalSyntheticLambda0 FOR_OPENING_TAGS = new ng$$ExternalSyntheticLambda0(21);
        public static final ng$$ExternalSyntheticLambda0 FOR_CLOSING_TAGS = new ng$$ExternalSyntheticLambda0(22);

        public SpanInfo(String str, int i, int i2, String str2) {
            this.start = i;
            this.end = i2;
            this.openingTag = str;
            this.closingTag = str2;
        }
    }

    public final class Transition {
        public final ArrayList spansAdded = new ArrayList();
        public final ArrayList spansRemoved = new ArrayList();
    }

    public static String escapeHtml(CharSequence charSequence) {
        return NEWLINE_PATTERN.matcher(Html.escapeHtml(charSequence)).replaceAll("<br>");
    }
}
