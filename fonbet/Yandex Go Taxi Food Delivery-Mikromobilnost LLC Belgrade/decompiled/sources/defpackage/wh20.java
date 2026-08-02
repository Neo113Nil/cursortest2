package defpackage;

import android.net.Uri;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.DivkitThemeChangeListener;

/* loaded from: classes15.dex */
public final class wh20 {
    public final lh20 a;
    public String b;
    public String c;

    public wh20(lh20 lh20Var) {
        this.a = lh20Var;
    }

    public final String a() {
        Uri parse;
        String str = this.b;
        if (str == null || (parse = Uri.parse(str)) == null) {
            return null;
        }
        Uri.Builder buildUpon = parse.buildUpon();
        boolean contains = parse.getQueryParameterNames().contains("lang");
        lh20 lh20Var = this.a;
        if (!contains) {
            buildUpon.appendQueryParameter("lang", lh20Var.b);
        }
        if (!parse.getQueryParameterNames().contains("parentOrigin")) {
            buildUpon.appendQueryParameter("parentOrigin", parse.getScheme() + "://" + parse.getHost());
        }
        if (!parse.getQueryParameterNames().contains("channelId")) {
            buildUpon.appendQueryParameter("channelId", b());
        }
        if (!parse.getQueryParameterNames().contains(DivkitThemeChangeListener.THEME_VARIABLE_NAME)) {
            buildUpon.appendQueryParameter(DivkitThemeChangeListener.THEME_VARIABLE_NAME, lh20Var.f);
        }
        if (!parse.getQueryParameterNames().contains("miniappProtoVersion")) {
            buildUpon.appendQueryParameter("miniappProtoVersion", "1.1");
        }
        return buildUpon.build().toString();
    }

    public final String b() {
        String num;
        String str = this.b;
        if (str != null && (num = Integer.valueOf(Math.abs(str.hashCode())).toString()) != null) {
            return g8e.p(this.a.a, "_", num);
        }
        ny61.r("url must be initialized");
        return null;
    }
}
