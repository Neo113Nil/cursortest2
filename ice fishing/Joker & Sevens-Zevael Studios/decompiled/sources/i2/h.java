package i2;

import android.graphics.Rect;
import android.graphics.text.LineBreakConfig;
import android.os.Build;
import android.text.Layout;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class h {
    public static StaticLayout a(CharSequence charSequence, TextPaint textPaint, int i10, int i11, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i12, TextUtils.TruncateAt truncateAt, int i13, int i14, boolean z10, int i15, int i16, int i17, int i18) {
        LineBreakConfig.Builder lineBreakStyle;
        LineBreakConfig.Builder lineBreakWordStyle;
        LineBreakConfig build;
        if (i11 < 0) {
            m2.a.a("invalid start value");
        }
        int length = charSequence.length();
        if (i11 < 0 || i11 > length) {
            m2.a.a("invalid end value");
        }
        if (i12 < 0) {
            m2.a.a("invalid maxLines value");
        }
        if (i10 < 0) {
            m2.a.a("invalid width value");
        }
        if (i13 < 0) {
            m2.a.a("invalid ellipsizedWidth value");
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, i11, textPaint, i10);
        obtain.setTextDirection(textDirectionHeuristic);
        obtain.setAlignment(alignment);
        obtain.setMaxLines(i12);
        obtain.setEllipsize(truncateAt);
        obtain.setEllipsizedWidth(i13);
        obtain.setLineSpacing(0.0f, 1.0f);
        obtain.setIncludePad(z10);
        obtain.setBreakStrategy(i15);
        obtain.setHyphenationFrequency(i18);
        obtain.setIndents(null, null);
        int i19 = Build.VERSION.SDK_INT;
        obtain.setJustificationMode(i14);
        if (i19 >= 28) {
            obtain.setUseLineSpacingFromFallbacks(true);
        }
        if (i19 >= 33) {
            lineBreakStyle = a.a().setLineBreakStyle(i16);
            lineBreakWordStyle = lineBreakStyle.setLineBreakWordStyle(i17);
            build = lineBreakWordStyle.build();
            obtain.setLineBreakConfig(build);
        }
        if (i19 >= 35) {
            obtain.setUseBoundsForWidth(false);
        }
        return obtain.build();
    }

    public static final Rect b(TextPaint textPaint, CharSequence charSequence, int i10, int i11) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (spanned.nextSpanTransition(i10 - 1, i11, MetricAffectingSpan.class) != i11) {
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                TextPaint textPaint2 = new TextPaint();
                while (i10 < i11) {
                    int nextSpanTransition = spanned.nextSpanTransition(i10, i11, MetricAffectingSpan.class);
                    MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spanned.getSpans(i10, nextSpanTransition, MetricAffectingSpan.class);
                    textPaint2.set(textPaint);
                    bc.b h10 = pc.j.h(metricAffectingSpanArr);
                    while (h10.hasNext()) {
                        MetricAffectingSpan metricAffectingSpan = (MetricAffectingSpan) h10.next();
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint2);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 29) {
                        textPaint2.getTextBounds(charSequence, i10, nextSpanTransition, rect2);
                    } else {
                        textPaint2.getTextBounds(charSequence.toString(), i10, nextSpanTransition, rect2);
                    }
                    rect.right = rect2.width() + rect.right;
                    rect.top = Math.min(rect.top, rect2.top);
                    rect.bottom = Math.max(rect.bottom, rect2.bottom);
                    i10 = nextSpanTransition;
                }
                return rect;
            }
        }
        Rect rect3 = new Rect();
        if (Build.VERSION.SDK_INT >= 29) {
            textPaint.getTextBounds(charSequence, i10, i11, rect3);
            return rect3;
        }
        textPaint.getTextBounds(charSequence.toString(), i10, i11, rect3);
        return rect3;
    }

    public static final boolean c(Spanned spanned, Class cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }
}
