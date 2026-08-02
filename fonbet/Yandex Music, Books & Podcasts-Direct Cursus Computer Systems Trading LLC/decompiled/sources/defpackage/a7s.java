package defpackage;

import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.TextView;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class a7s implements ux8 {
    public LinkedHashMap a;
    public boolean b;

    public final void a(boolean z) {
        this.b = z;
        Iterator it = this.a.entrySet().iterator();
        while (it.hasNext()) {
            ((View) ((Map.Entry) it.next()).getValue()).setVisibility(this.b ? 0 : 8);
        }
    }

    @Override // defpackage.ux8
    public final void b(gc8 gc8Var, xzb xzbVar, View view, dp8 dp8Var) {
        xzbVar.getClass();
        view.getClass();
        dp8Var.getClass();
        String id = dp8Var.getId();
        if (id == null) {
            ssg.a(6, "TariffPaywallConditionsExtension", "Div must be used with id", null);
            return;
        }
        l18 l18Var = l18.b;
        bdt I = hag.I(skr.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        skr skrVar = (skr) qdcVar.C(I);
        String c = skrVar.c(R.string.kinopaywal_application_license);
        String d = skrVar.d(R.string.kinopaywal_application_license_pattern, c);
        int T = StringsKt.T(d, c, 0, false, 6);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(d);
        spannableStringBuilder.setSpan(new URLSpan(skrVar.d(R.string.url_mobile_legal, swf.H().a)), T, new IntRange(T, c.length() + T, 1).b, 17);
        if ((view instanceof TextView ? (TextView) view : null) != null) {
            TextView textView = (TextView) view;
            textView.setText(spannableStringBuilder);
            textView.setLinkTextColor(textView.getCurrentTextColor());
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
        view.setVisibility(this.b ? 0 : 8);
        this.a.put(id, view);
    }

    @Override // defpackage.ux8
    public final boolean c(dp8 dp8Var) {
        dp8Var.getClass();
        return sj2.t(dp8Var, "conditions");
    }

    @Override // defpackage.ux8
    public final void e(gc8 gc8Var, xzb xzbVar, View view, dp8 dp8Var) {
        gc8Var.getClass();
        xzbVar.getClass();
        view.getClass();
        dp8Var.getClass();
        String id = dp8Var.getId();
        if (id != null) {
        }
    }
}
