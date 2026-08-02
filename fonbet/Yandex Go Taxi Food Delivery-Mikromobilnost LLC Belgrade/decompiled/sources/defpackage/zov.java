package defpackage;

import java.util.HashMap;

/* loaded from: classes12.dex */
public final class zov {
    public final i650 a;

    public zov(i650 i650Var) {
        this.a = i650Var;
    }

    public final void a(String str) {
        i650 i650Var = this.a;
        HashMap u = n.u(i650Var);
        if (str != null) {
            u.put("error", str);
        }
        i650Var.a.a("navigation.reports.road_events.event_adding.error", u, 1, new HashMap());
    }
}
