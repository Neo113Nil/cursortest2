package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.text.style.RelativeSizeSpan;
import ru.yandex.taxi.utils.CustomImageSpan;
import ru.yandex.taxi.utils.ForegroundColorSpanFix;
import ru.yandex.taxi.utils.HtmlTagHandler;

/* loaded from: classes6.dex */
public abstract class qeb1 {
    public static final void a(int i, fid fidVar, tls tlsVar, f530 f530Var) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-932836462);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(f530Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            oeb1.c(btsVar, bb1.g(f530Var, tlsVar));
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new m28(f530Var, tlsVar, i);
        }
    }

    public static yjy b(Context context) {
        return new yjy(context.getString(kyh0.link_welcome_title), context.getString(kyh0.link_welcome_description));
    }

    public static final Spanned c(String str) {
        return Html.fromHtml(str, 0, null, new HtmlTagHandler());
    }

    public static final boolean d(CharSequence charSequence) {
        if (charSequence instanceof Spannable) {
            Spannable spannable = (Spannable) charSequence;
            if (!(spannable.getSpans(0, spannable.length(), ClickableSpan.class).length == 0)) {
                return true;
            }
        }
        return false;
    }

    public static final SpannableString e(int i, String str) {
        return f(str, i, 1.0f);
    }

    public static final SpannableString f(CharSequence charSequence, int i, float f) {
        SpannableString spannableString = new SpannableString(charSequence);
        if (charSequence.length() != 0) {
            spannableString.setSpan(new ForegroundColorSpanFix(i), 0, charSequence.length(), 17);
            if (f != 1.0f) {
                spannableString.setSpan(new RelativeSizeSpan(f), 0, charSequence.length(), 17);
                return spannableString;
            }
        }
        return spannableString;
    }

    public static final SpannableStringBuilder g(CharSequence charSequence, Drawable drawable, int i) {
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
        valueOf.append((CharSequence) " ");
        valueOf.append(" ", new CustomImageSpan(drawable, i, false, true, null, 20, null), 0);
        return valueOf;
    }
}
