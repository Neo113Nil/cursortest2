package kotlin.text;

import android.text.PrecomputedText;
import android.text.TextPaint;

/* loaded from: classes.dex */
public abstract /* synthetic */ class CatchingFishJetpackCompose {
    public static /* synthetic */ PrecomputedText.Params.Builder CatchingFishLayout(TextPaint textPaint) {
        return new PrecomputedText.Params.Builder(textPaint);
    }

    public static /* bridge */ /* synthetic */ boolean CatchingFishSpannableWidget(CharSequence charSequence) {
        return charSequence instanceof PrecomputedText;
    }
}
