package m;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.Log;
import android.widget.TextView;

/* renamed from: m.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4689a0 {
    public static StaticLayout a(CharSequence charSequence, Layout.Alignment alignment, int i, int i4, TextView textView, TextPaint textPaint, AbstractC4695d0 abstractC4695d0) {
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i);
        StaticLayout.Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
        if (i4 == -1) {
            i4 = Integer.MAX_VALUE;
        }
        hyphenationFrequency.setMaxLines(i4);
        try {
            abstractC4695d0.a(obtain, textView);
        } catch (ClassCastException unused) {
            Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
        }
        return obtain.build();
    }
}
