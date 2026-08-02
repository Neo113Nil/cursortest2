package defpackage;

import android.text.SpannedString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.widget.TextView;
import ru.yandex.taxi.utils.StyledTypefaceSpan;

/* loaded from: classes6.dex */
public abstract class yty0 {
    public static final StaticLayout a(TextView textView, CharSequence charSequence) {
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), b(textView, charSequence), (textView.getMeasuredWidth() - textView.getPaddingLeft()) - textView.getPaddingRight());
        if (textView.getLayout() != null) {
            obtain.setAlignment(textView.getLayout().getAlignment());
            obtain.setLineSpacing(textView.getLayout().getSpacingAdd(), textView.getLayout().getSpacingMultiplier());
        }
        obtain.setIncludePad(textView.getIncludeFontPadding());
        return obtain.build();
    }

    public static final TextPaint b(TextView textView, CharSequence charSequence) {
        StyledTypefaceSpan[] styledTypefaceSpanArr;
        StyledTypefaceSpan styledTypefaceSpan;
        if (charSequence.length() > 0 && (styledTypefaceSpanArr = (StyledTypefaceSpan[]) SpannedString.valueOf(charSequence).getSpans(0, 1, StyledTypefaceSpan.class)) != null && (styledTypefaceSpan = (StyledTypefaceSpan) j73.D(styledTypefaceSpanArr)) != null) {
            styledTypefaceSpan.updateMeasureState(textView.getPaint());
        }
        return textView.getPaint();
    }
}
