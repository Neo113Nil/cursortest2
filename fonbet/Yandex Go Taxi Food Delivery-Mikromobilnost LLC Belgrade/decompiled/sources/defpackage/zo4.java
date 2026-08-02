package defpackage;

import androidx.appcompat.widget.AppCompatTextView;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes11.dex */
public abstract class zo4 {
    public static final Pattern a = Pattern.compile("^([\\d\\u0660-\\u0669\\u066B\\u066C\\u06F0-\\u06F9\\.\\,]+)\\s+([^\\d\\u0660-\\u0669\\u066B\\u066C\\u06F0-\\u06F9]+)$");

    public static final void a(AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, String str) {
        Matcher matcher = a.matcher(str);
        if (!matcher.find()) {
            appCompatTextView.setText(str);
            appCompatTextView.setVisibility(0);
            appCompatTextView2.setVisibility(8);
        } else {
            appCompatTextView.setText(matcher.group(1));
            appCompatTextView2.setText(matcher.group(2));
            appCompatTextView.setVisibility(0);
            appCompatTextView2.setVisibility(0);
        }
    }
}
