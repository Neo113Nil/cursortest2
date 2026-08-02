package defpackage;

import android.graphics.Rect;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;
import java.util.List;

/* loaded from: classes15.dex */
public final class vhi0 implements j4b {
    public int A;
    public final TextView a;
    public boolean b = true;
    public final SpannableStringBuilder c;
    public final int w;
    public String x;
    public CharSequence y;
    public boolean z;

    public vhi0(TextView textView) {
        this.a = textView;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((char) 8230);
        spannableStringBuilder.append((CharSequence) " ");
        String string = textView.getContext().getResources().getString(oyh0.messaging_more);
        int i = fxa1.c(jng0.messagingVoiceMessagesMoreTextColor, textView.getContext()).data;
        SpannableString spannableString = new SpannableString(string);
        spannableString.setSpan(new ForegroundColorSpan(i), 0, string.length(), 18);
        spannableStringBuilder.append((CharSequence) spannableString);
        this.c = spannableStringBuilder;
        this.w = m810.b(textView.getContext().getResources().getDimension(gvg0.messaging_recognized_text_padding) * 2.0f);
        this.x = "";
        this.y = "";
        this.A = textView.getWidth();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        int b;
        int i = this.A;
        int i2 = this.w;
        if (i < i2) {
            return;
        }
        Rect rect = new Rect();
        TextView textView = this.a;
        TextPaint paint = textView.getPaint();
        SpannableStringBuilder spannableStringBuilder = this.c;
        paint.getTextBounds(spannableStringBuilder.toString(), 0, spannableStringBuilder.length(), rect);
        int width = rect.width();
        String str = this.x;
        int i3 = this.A - i2;
        List list = dmy0.a;
        if (!evu0.J(str) && (b = nrn.b(str, spannableStringBuilder.toString(), textView.getPaint(), i3, textView.getLineSpacingMultiplier(), textView.getLineSpacingExtra(), 3, width)) != str.length() && b > 0) {
            if (b != 0 && b < str.length()) {
                char charAt = str.charAt(b);
                if (Character.isLetterOrDigit(charAt) || charAt == '-') {
                    while (b > 0 && Character.isLetterOrDigit(str.charAt(b - 1))) {
                        b--;
                    }
                }
                while (b > 0) {
                    char charAt2 = str.charAt(b - 1);
                    if (!rza.b(charAt2) && !dmy0.a.contains(Character.valueOf(charAt2))) {
                        break;
                    } else {
                        b--;
                    }
                }
            }
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str);
            for (Object obj : spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), Object.class)) {
                int spanEnd = spannableStringBuilder2.getSpanEnd(obj);
                if (spanEnd >= b) {
                    int spanStart = spannableStringBuilder2.getSpanStart(obj);
                    int spanFlags = spannableStringBuilder2.getSpanFlags(obj) & (-52);
                    spannableStringBuilder2.removeSpan(obj);
                    spannableStringBuilder2.setSpan(obj, spanStart, spanEnd, spanFlags | 34);
                }
            }
            spannableStringBuilder2.replace(b, spannableStringBuilder2.length(), (CharSequence) spannableStringBuilder);
            for (Object obj2 : spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), Object.class)) {
                spannableStringBuilder2.removeSpan(obj2);
                spannableStringBuilder2.setSpan(obj2, spannableStringBuilder2.length() - (spannableStringBuilder.length() - spannableStringBuilder.getSpanStart(obj2)), spannableStringBuilder2.length() - (spannableStringBuilder.length() - spannableStringBuilder.getSpanEnd(obj2)), spannableStringBuilder.getSpanFlags(obj2));
            }
            str = spannableStringBuilder2;
        }
        this.y = str;
        this.z = !str.equals(this.x);
    }

    public final void b() {
        if (this.z) {
            boolean z = this.b;
            if (z) {
                if (z) {
                    this.b = false;
                    c();
                    return;
                }
                return;
            }
            if (z) {
                return;
            }
            this.b = true;
            c();
        }
    }

    public final void c() {
        this.a.setText((this.z && this.b) ? this.y : this.x);
    }

    @Override // defpackage.j4b
    public final void setMaxSize(int i) {
        if (this.A == i) {
            return;
        }
        this.A = i;
        a();
        c();
    }
}
