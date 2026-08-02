package defpackage;

import android.text.Html;
import android.text.Spannable;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import defpackage.tls;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class rtu {
    public static final Set a = j73.f0(new String[]{"\n", "\\U2028", "\\u2028", "\\U+2028", "\\u+2028"});

    public static final Spannable a(final tls tlsVar, String str) {
        String v = cvu0.v(str, "\\\"", "\"", false);
        Iterator it = a.iterator();
        while (it.hasNext()) {
            v = cvu0.v(v, (String) it.next(), "<br>", false);
        }
        Spannable spannable = (Spannable) Html.fromHtml(v, 63);
        for (final URLSpan uRLSpan : (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class)) {
            spannable.setSpan(new ClickableSpan() { // from class: com.ybsdk.core.utils.ext.HtmlExtensionsKt$toHtml$2$1
                @Override // android.text.style.ClickableSpan
                public void onClick(View widget) {
                    tls.this.invoke(uRLSpan.getURL());
                }

                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public void updateDrawState(TextPaint ds) {
                    super.updateDrawState(ds);
                    ds.setUnderlineText(false);
                }
            }, spannable.getSpanStart(uRLSpan), spannable.getSpanEnd(uRLSpan), 0);
            spannable.removeSpan(uRLSpan);
        }
        return spannable;
    }
}
