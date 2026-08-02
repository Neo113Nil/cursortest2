package defpackage;

import com.yandex.go.analytics.realtime.a;
import com.yandex.go.analytics.realtime.event.RealtimeEventType;
import com.yandex.go.flex.common.api.actions.SendRealtimeAnalyticsAction;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.b;
import kotlinx.serialization.json.c;

/* loaded from: classes.dex */
public final class tei0 implements sei0 {
    public final oei0 a;
    public final dei0 b;

    public tei0(oei0 oei0Var, dei0 dei0Var) {
        this.a = oei0Var;
        this.b = dei0Var;
    }

    public static jei0 b(SendRealtimeAnalyticsAction.Event event) {
        String str = event.a;
        String str2 = event.b;
        String str3 = event.c;
        LinkedHashMap c = xsq0.c(event.d);
        c cVar = event.e;
        Map c2 = cVar != null ? xsq0.c(cVar) : b.f();
        c cVar2 = event.f;
        return new jei0(str3, str2, System.currentTimeMillis(), str, c, c2, cVar2 != null ? xsq0.c(cVar2) : null);
    }

    public final void a(SendRealtimeAnalyticsAction.Event event) {
        Boolean bool = event.g;
        String str = event.c;
        boolean l = jl40.l(bool, Boolean.TRUE);
        oei0 oei0Var = this.a;
        if (l) {
            if (!((pei0) oei0Var).a.add(new Pair(event.a, str + event.e))) {
                return;
            }
        }
        if (jl40.l(str, RealtimeEventType.Received.getEventName())) {
            ((pei0) oei0Var).b.clear();
        }
        jei0 b = b(event);
        if (event.h != null || jl40.l(str, RealtimeEventType.Shown.getEventName())) {
            ((pei0) oei0Var).b.add(event);
        }
        ((a) this.b).d(b);
    }
}
