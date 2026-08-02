package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.CookieSyncManager;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class sbv extends ytg {
    public String c;

    public final void C(atg atgVar, Bundle bundle, c3c c3cVar) {
        String str;
        btg b;
        ctg i = i();
        this.c = null;
        if (bundle != null) {
            if (bundle.containsKey("e2e")) {
                this.c = bundle.getString("e2e");
            }
            try {
                ja f = ytg.f(atgVar.b, bundle, p(), atgVar.d);
                b = new btg(i.g, 1, f, ytg.g(bundle, atgVar.o), null, null);
                CookieSyncManager.createInstance(i.c.l()).sync();
                if (f != null) {
                    i().c.l().getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).edit().putString("TOKEN", f.e).apply();
                }
            } catch (c3c e) {
                b = btg.b(i.g, null, e.getMessage(), null);
            }
        } else if (c3cVar instanceof f3c) {
            b = btg.a(i.g, "User canceled log in.");
        } else {
            this.c = null;
            String message = c3cVar.getMessage();
            if (c3cVar instanceof l3c) {
                g3c g3cVar = ((l3c) c3cVar).a;
                Locale locale = Locale.ROOT;
                int i2 = g3cVar.d;
                StringBuilder sb = new StringBuilder();
                sb.append(i2);
                str = sb.toString();
                message = g3cVar.toString();
            } else {
                str = null;
            }
            b = btg.b(i.g, null, message, str);
        }
        if (!gvt.D(this.c)) {
            k(this.c);
        }
        i.f(b);
    }

    public final Bundle o(atg atgVar) {
        Bundle bundle = new Bundle();
        Set set = atgVar.b;
        if (set != null && !set.isEmpty()) {
            String join = TextUtils.join(StringUtils.COMMA, atgVar.b);
            bundle.putString("scope", join);
            a("scope", join);
        }
        bundle.putString("default_audience", su4.d(atgVar.c));
        bundle.putString("state", h(atgVar.e));
        Date date = ja.l;
        ja N = n7w.N();
        String str = N != null ? N.e : null;
        String str2 = CommonUrlParts.Values.FALSE_INTEGER;
        if (str == null || !str.equals(i().c.l().getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).getString("TOKEN", ""))) {
            gvt.c(i().c.l());
            a("access_token", CommonUrlParts.Values.FALSE_INTEGER);
        } else {
            bundle.putString("access_token", str);
            a("access_token", "1");
        }
        bundle.putString("cbt", String.valueOf(System.currentTimeMillis()));
        HashSet hashSet = j3c.a;
        if (gtt.c()) {
            str2 = "1";
        }
        bundle.putString("ies", str2);
        return bundle;
    }

    public abstract ra p();
}
