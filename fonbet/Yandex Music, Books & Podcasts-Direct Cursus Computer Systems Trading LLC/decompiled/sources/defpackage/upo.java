package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class upo extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ xpo s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ upo(xpo xpoVar, int i) {
        super(1);
        this.r = i;
        this.s = xpoVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        ca4 ca4Var;
        int i = this.r;
        xpo xpoVar = this.s;
        switch (i) {
            case 0:
                if (!((lpo) obj).a()) {
                    ((thk) xpoVar.x()).b.g();
                }
                break;
            case 1:
                Pair pair = (Pair) obj;
                ((thk) xpoVar.x()).b.e((jb4) pair.a, (Function1) pair.b);
                break;
            default:
                Pair pair2 = (Pair) obj;
                int ordinal = ((kpo) pair2.b).a.ordinal();
                int i2 = 1;
                if (ordinal == 0) {
                    mfk mfkVar = (mfk) pair2.a;
                    ((thk) xpoVar.x()).d.setText(R.string.paymentsdk_challenger_amount_title);
                    ((x60) xpoVar.y().n).a(gut.m1(d0n.RANDOM_AMT_CHALLENGE));
                    if (!qdq.y() ? (str = mfkVar.c) == null : (str = mfkVar.d) == null) {
                        str = "";
                    }
                    String str2 = mfkVar.b;
                    tl2 tl2Var = new tl2(str, (str2 != null ? str2 : "").concat("://"));
                    String string = xpoVar.requireContext().getString(R.string.paymentsdk_challenger_amount_description);
                    string.getClass();
                    SpannableString spannableString = new SpannableString(k5r.m(string, StringUtil.SPACE, str, " -"));
                    Resources resources = xpoVar.getResources();
                    Resources.Theme theme = xpoVar.requireContext().getTheme();
                    ThreadLocal threadLocal = e3o.a;
                    Drawable drawable = resources.getDrawable(R.drawable.paymentsdk_ic_link, theme);
                    if (drawable != null) {
                        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                        ca4Var = new ca4(drawable);
                    } else {
                        ca4Var = null;
                    }
                    spannableString.setSpan(ca4Var, spannableString.length() - 1, spannableString.length(), 17);
                    spannableString.setSpan(new vpo(xpoVar, tl2Var), string.length(), spannableString.length(), 33);
                    TextView textView = ((thk) xpoVar.x()).a;
                    textView.setText(spannableString, TextView.BufferType.SPANNABLE);
                    textView.setMovementMethod(new LinkMovementMethod());
                } else if (ordinal == 1) {
                    kpo kpoVar = (kpo) pair2.b;
                    Resources.Theme theme2 = xpoVar.requireContext().getTheme();
                    theme2.getClass();
                    int color = xpoVar.requireContext().getColor(ocg.A(theme2, R.attr.paymentsdk_is_light_theme, true) ? R.color.paymentsdk_textSecondaryLight : R.color.paymentsdk_textSecondaryDark);
                    ((x60) xpoVar.y().n).a(gut.m1(d0n.SMS_CHALLENGE));
                    int color2 = xpoVar.requireContext().getColor(R.color.paymentsdk_highlightColor);
                    ((thk) xpoVar.x()).a.setOnClickListener(new tpo(xpoVar, i2));
                    xpoVar.y().t.f(xpoVar.getViewLifecycleOwner(), new uy6(8, new ngi(xpoVar, color2, color, i2)));
                    String string2 = xpoVar.requireContext().getString(R.string.paymentsdk_challenger_sms_subtitle, kpoVar.g);
                    string2.getClass();
                    ((thk) xpoVar.x()).d.setText(R.string.paymentsdk_challenger_sms_title);
                    ((thk) xpoVar.x()).c.setText(string2);
                }
                break;
        }
        return Unit.a;
    }
}
