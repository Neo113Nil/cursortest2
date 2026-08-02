package com.google.android.material.internal;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton$$ExternalSyntheticLambda3;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes4.dex */
public final class StaticLayoutBuilderCompat {
    public int end;
    public boolean isRtl;
    public final TextPaint paint;
    public CharSequence source;
    public StaticLayoutBuilderConfigurer staticLayoutBuilderConfigurer;
    public final int width;
    public Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
    public int maxLines = Integer.MAX_VALUE;
    public float lineSpacingAdd = RecyclerView.DECELERATION_RATE;
    public float lineSpacingMultiplier = 1.0f;
    public int hyphenationFrequency = 1;
    public boolean includePad = true;
    public TextUtils.TruncateAt ellipsize = null;

    public final class StaticLayoutBuilderCompatException extends Exception {
    }

    public StaticLayoutBuilderCompat(CharSequence charSequence, TextPaint textPaint, int i) {
        this.source = charSequence;
        this.paint = textPaint;
        this.width = i;
        this.end = charSequence.length();
    }

    public final StaticLayout build() {
        if (this.source == null) {
            this.source = "";
        }
        int max = Math.max(0, this.width);
        CharSequence charSequence = this.source;
        int i = this.maxLines;
        TextPaint textPaint = this.paint;
        if (i == 1) {
            charSequence = TextUtils.ellipsize(charSequence, textPaint, max, this.ellipsize);
        }
        int min = Math.min(charSequence.length(), this.end);
        this.end = min;
        if (this.isRtl && this.maxLines == 1) {
            this.alignment = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, min, textPaint, max);
        obtain.setAlignment(this.alignment);
        obtain.setIncludePad(this.includePad);
        obtain.setTextDirection(this.isRtl ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.ellipsize;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.maxLines);
        float f = this.lineSpacingAdd;
        if (f != RecyclerView.DECELERATION_RATE || this.lineSpacingMultiplier != 1.0f) {
            obtain.setLineSpacing(f, this.lineSpacingMultiplier);
        }
        if (this.maxLines > 1) {
            obtain.setHyphenationFrequency(this.hyphenationFrequency);
        }
        StaticLayoutBuilderConfigurer staticLayoutBuilderConfigurer = this.staticLayoutBuilderConfigurer;
        if (staticLayoutBuilderConfigurer != null) {
            obtain.setBreakStrategy(((TextInputLayout) ((MaterialButton$$ExternalSyntheticLambda3) staticLayoutBuilderConfigurer).f$0).placeholderTextView.getBreakStrategy());
        }
        return obtain.build();
    }
}
