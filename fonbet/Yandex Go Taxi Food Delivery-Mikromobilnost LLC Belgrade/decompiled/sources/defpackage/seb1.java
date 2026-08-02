package defpackage;

import android.graphics.Path;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.AbsoluteSizeSpan;
import ru.yandex.taxi.utils.AbsoluteSizeSpanFix;
import ru.yandex.taxi.utils.CustomImageSpan;
import ru.yandex.taxi.widget.text.method.LinkMovementMethod;

/* loaded from: classes12.dex */
public abstract class seb1 {
    public static final LinkMovementMethod a(tls tlsVar) {
        return new LinkMovementMethod(new nb1(9, tlsVar));
    }

    public static Path b(float f, float f2, float f3, float f4, float f5, boolean z, boolean z2, boolean z3, boolean z4) {
        Path path = new Path();
        if (f4 < 0.0f) {
            f4 = 0.0f;
        }
        if (f5 < 0.0f) {
            f5 = 0.0f;
        }
        float f6 = f2 - 0.0f;
        float f7 = f3 - f;
        float f8 = f6 / 2.0f;
        if (f4 > f8) {
            f4 = f8;
        }
        float f9 = f7 / 2.0f;
        if (f5 > f9) {
            f5 = f9;
        }
        float f10 = f6 - (2.0f * f4);
        float f11 = f7 - (2.0f * f5);
        path.moveTo(f2, f + f5);
        if (z2) {
            float f12 = -f5;
            path.rQuadTo(0.0f, f12, -f4, f12);
        } else {
            path.rLineTo(0.0f, -f5);
            path.rLineTo(-f4, 0.0f);
        }
        path.rLineTo(-f10, 0.0f);
        if (z) {
            float f13 = -f4;
            path.rQuadTo(f13, 0.0f, f13, f5);
        } else {
            path.rLineTo(-f4, 0.0f);
            path.rLineTo(0.0f, f5);
        }
        path.rLineTo(0.0f, f11);
        if (z4) {
            path.rQuadTo(0.0f, f5, f4, f5);
        } else {
            path.rLineTo(0.0f, f5);
            path.rLineTo(f4, 0.0f);
        }
        path.rLineTo(f10, 0.0f);
        if (z3) {
            path.rQuadTo(f4, 0.0f, f4, -f5);
        } else {
            path.rLineTo(f4, 0.0f);
            path.rLineTo(0.0f, -f5);
        }
        path.rLineTo(0.0f, -f11);
        path.close();
        return path;
    }

    public static final SpannedString c(CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        for (CustomImageSpan customImageSpan : (CustomImageSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), CustomImageSpan.class)) {
            int spanStart = spannableStringBuilder.getSpanStart(customImageSpan);
            int spanEnd = spannableStringBuilder.getSpanEnd(customImageSpan);
            AbsoluteSizeSpan absoluteSizeSpan = (AbsoluteSizeSpan) j73.D(spannableStringBuilder.getSpans(spanStart - 1, spanStart, AbsoluteSizeSpan.class));
            AbsoluteSizeSpan absoluteSizeSpan2 = (AbsoluteSizeSpan) j73.D(spannableStringBuilder.getSpans(spanEnd, spanEnd + 1, AbsoluteSizeSpan.class));
            if (absoluteSizeSpan == null) {
                absoluteSizeSpan = absoluteSizeSpan2;
            }
            if (absoluteSizeSpan != null) {
                spannableStringBuilder.setSpan(new AbsoluteSizeSpanFix(absoluteSizeSpan.getSize(), absoluteSizeSpan.getDip()), spanStart, spanEnd, 17);
            }
        }
        return new SpannedString(spannableStringBuilder);
    }
}
