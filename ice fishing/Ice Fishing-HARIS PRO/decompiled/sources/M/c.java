package M;

import android.text.PrecomputedText;
import android.text.TextPaint;
import android.view.DisplayCutout;

/* loaded from: classes.dex */
public abstract /* synthetic */ class c {
    public static /* synthetic */ PrecomputedText.Params.Builder h(TextPaint textPaint) {
        return new PrecomputedText.Params.Builder(textPaint);
    }

    public static /* bridge */ /* synthetic */ DisplayCutout l(Object obj) {
        return (DisplayCutout) obj;
    }

    public static /* bridge */ /* synthetic */ boolean s(CharSequence charSequence) {
        return charSequence instanceof PrecomputedText;
    }

    public static /* bridge */ /* synthetic */ boolean t(Object obj) {
        return obj instanceof DisplayCutout;
    }
}
