package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.b;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;
import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.analytics.j;

/* loaded from: classes12.dex */
public final class r91 {
    public final lx4 a;
    public final czf0 b;
    public final jua0 c;

    public r91(lx4 lx4Var, czf0 czf0Var, jua0 jua0Var) {
        this.a = lx4Var;
        this.b = czf0Var;
        this.c = jua0Var;
    }

    public final void a(String str, v91 v91Var, long j, long j2, List list) {
        String concat = "Perf.Screen.Suggest.AddressesListUpdate.".concat(str);
        i d = ((j) this.a).d(concat);
        d.d("id", v91Var.a);
        d.c(j, RemoteBioParameters.TIME);
        d.d("time_since_app_launch", wwg.q(j2));
        v91Var.c.getClass();
        d.d("intent_reason", "taxi_shortcut");
        d.d("intent_source_screen", v91Var.d);
        d.d("point_type", v91Var.e.getAnalyticsValue());
        List<ocp0> list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        for (ocp0 ocp0Var : list2) {
            arrayList.add(b.i(new Pair("endpoint", ocp0Var.a), new Pair("time_since_intent", Long.valueOf(ocp0Var.b)), new Pair("request_duration", Long.valueOf(ocp0Var.c)), new Pair("trace_id", ocp0Var.d)));
        }
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        if (arrayList != null) {
            d.e("endpoints", arrayList);
        }
        d.m();
        this.b.getClass();
        czf0.a(j, concat);
        this.c.getClass();
    }
}
