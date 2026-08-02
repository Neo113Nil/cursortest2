package defpackage;

import com.yandex.go.agreement.trackable.analitycs.EULAAnalytics$AcceptanceCloseReason;
import com.yandex.go.agreement.trackable.analitycs.EULAAnalytics$AcceptanceTapAction;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class tan {
    public final pho a;

    public tan(pho phoVar) {
        this.a = phoVar;
    }

    public final void a(String str, EULAAnalytics$AcceptanceCloseReason eULAAnalytics$AcceptanceCloseReason) {
        HashMap p = x4e.p("id", str);
        p.put("close_reason", eULAAnalytics$AcceptanceCloseReason.getEventValue());
        this.a.a("EULA.Closed", p, 1, new HashMap());
    }

    public final void b(String str, EULAAnalytics$AcceptanceTapAction eULAAnalytics$AcceptanceTapAction, String str2) {
        HashMap p = x4e.p("id", str);
        p.put("action_name", eULAAnalytics$AcceptanceTapAction.getEventValue());
        p.put("url", str2);
        this.a.a("EULA.Tapped", p, 1, new HashMap());
    }
}
