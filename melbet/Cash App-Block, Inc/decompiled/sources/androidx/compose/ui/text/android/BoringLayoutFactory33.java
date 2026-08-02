package androidx.compose.ui.text.android;

import android.graphics.text.LineBreakConfig;
import android.text.BoringLayout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;

/* loaded from: classes.dex */
public abstract class BoringLayoutFactory33 {
    public static final BoringLayout.Metrics isBoring(CharSequence charSequence, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic) {
        return BoringLayout.isBoring(charSequence, textPaint, textDirectionHeuristic, true, null);
    }

    public static final boolean isFallbackLineSpacingEnabled(BoringLayout boringLayout) {
        return boringLayout.isFallbackLineSpacingEnabled();
    }

    public static final void setLineBreakConfig(StaticLayout.Builder builder, int i, int i2) {
        builder.setLineBreakConfig(new LineBreakConfig.Builder().setLineBreakStyle(i).setLineBreakWordStyle(i2).build());
    }

    public static final boolean isFallbackLineSpacingEnabled(StaticLayout staticLayout) {
        return staticLayout.isFallbackLineSpacingEnabled();
    }
}
