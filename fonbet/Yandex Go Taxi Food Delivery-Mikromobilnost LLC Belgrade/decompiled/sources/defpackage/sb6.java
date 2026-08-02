package defpackage;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.delegates.BottomNavigationEvents$BottomNavigationClickButtonVersion;
import java.util.LinkedHashMap;

/* loaded from: classes3.dex */
public final class sb6 {
    public final AppAnalyticsReporter a;
    public String b;

    public sb6(AppAnalyticsReporter appAnalyticsReporter) {
        this.a = appAnalyticsReporter;
    }

    public final void a(String str, String str2, BottomNavigationEvents$BottomNavigationClickButtonVersion bottomNavigationEvents$BottomNavigationClickButtonVersion) {
        rt1 rt1Var = this.a.i;
        LinkedHashMap t = x4e.t(3, "button", str, "screen_type", str2);
        t.put("button_version", bottomNavigationEvents$BottomNavigationClickButtonVersion.getOriginalValue());
        rt1Var.a.a("bottom_navigation.click", t);
    }

    public final void c(String str) {
        if (jl40.l(this.b, str)) {
            return;
        }
        rt1 rt1Var = this.a.i;
        rt1Var.a.a("bottom_navigation.show", g8e.w(1, "button_list", str));
        this.b = str;
    }
}
