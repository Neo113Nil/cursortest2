package com.yandex.plus.bdui.plus.analytics;

import com.yandex.passport.internal.ui.bouncer.p;
import com.yandex.plus.core.benchmark.l;
import com.yandex.plus.core.benchmark.o;
import com.yandex.plus.core.benchmark.t;
import com.yandex.plus.core.benchmark.u;
import com.yandex.plus.core.benchmark.v;
import defpackage.btf;
import defpackage.f1d;
import defpackage.hrg;
import defpackage.jyr;
import defpackage.k5r;
import defpackage.su4;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class d implements com.yandex.plus.bdui.analytics.a {
    public final com.yandex.plus.log.api.b a;
    public final p b;
    public final jyr c;
    public final jyr d;
    public final jyr e;
    public final ConcurrentHashMap f;

    public d(Function0 function0, Function0 function02, Function0 function03, com.yandex.plus.log.api.b bVar, p pVar) {
        function0.getClass();
        function02.getClass();
        function03.getClass();
        bVar.getClass();
        this.a = bVar;
        this.b = pVar;
        this.c = btf.b(function0);
        this.d = btf.b(function02);
        this.e = btf.b(function03);
        this.f = new ConcurrentHashMap();
    }

    /* JADX WARN: Type inference failed for: r5v6, types: [ezc, kotlin.jvm.functions.Function1] */
    @Override // com.yandex.plus.bdui.analytics.a
    public final void a(com.yandex.plus.bdui.analytics.c cVar) {
        o oVar;
        long j;
        Unit unit;
        p pVar = this.b;
        cVar.getClass();
        com.yandex.plus.log.api.b bVar = this.a;
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
        if (bVar.b(aVar)) {
            bVar.c(aVar, "PlusBenchmarkAnalyticsTransport", "sendEvent(); event = " + cVar);
        }
        String str = cVar.a;
        Map map = cVar.b;
        Object obj = map != null ? map.get("origin") : null;
        String str2 = obj instanceof String ? (String) obj : null;
        if (str2 == null) {
            com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.d;
            if (bVar.b(aVar2)) {
                bVar.c(aVar2, "PlusBenchmarkAnalyticsTransport", "sendEvent(); origin is not found for benchmark \"" + str + "\" with params " + map + '!');
                return;
            }
            return;
        }
        if (bVar.b(aVar)) {
            bVar.c(aVar, "PlusBenchmarkAnalyticsTransport", "sendEvent(); origin = ".concat(str2));
        }
        Object obj2 = map != null ? map.get(Constants.KEY_ACTION) : null;
        String str3 = obj2 instanceof String ? (String) obj2 : null;
        if (str3 == null) {
            com.yandex.plus.log.api.a aVar3 = com.yandex.plus.log.api.a.d;
            if (bVar.b(aVar3)) {
                bVar.c(aVar3, "PlusBenchmarkAnalyticsTransport", "sendEvent(); action is not found for benchmark \"" + str + "\" with params " + map + '!');
                return;
            }
            return;
        }
        if (bVar.b(aVar)) {
            bVar.c(aVar, "PlusBenchmarkAnalyticsTransport", "sendEvent(); action = ".concat(str3));
        }
        if (!str2.equals("METRIC")) {
            if (!str2.equals("FLOW")) {
                com.yandex.plus.log.api.a aVar4 = com.yandex.plus.log.api.a.d;
                if (bVar.b(aVar4)) {
                    bVar.c(aVar4, "PlusBenchmarkAnalyticsTransport", k5r.p(f1d.m("handleMetricBenchmark(); origin \"", str2, "\" is unknown for benchmark \"", str, "\" with params "), map, '!'));
                    return;
                }
                return;
            }
            int hashCode = str3.hashCode();
            if (hashCode != -1818421597) {
                if (hashCode != 912528627) {
                    if (hashCode == 2043342825 && str3.equals("METRIC_CANCEL")) {
                        com.yandex.plus.log.api.a aVar5 = com.yandex.plus.log.api.a.d;
                        if (bVar.b(aVar5)) {
                            bVar.c(aVar5, "PlusBenchmarkAnalyticsTransport", su4.o(f1d.m("handleMetricBenchmark(); action \"", str3, "\" is not applicable for benchmark \"", str, "\" with origin \""), str2, "\"!"));
                            return;
                        }
                        return;
                    }
                } else if (str3.equals("METRIC_START")) {
                    com.yandex.plus.log.api.a aVar6 = com.yandex.plus.log.api.a.d;
                    if (bVar.b(aVar6)) {
                        bVar.c(aVar6, "PlusBenchmarkAnalyticsTransport", su4.o(f1d.m("handleMetricBenchmark(); action \"", str3, "\" is not applicable for benchmark \"", str, "\" with origin \""), str2, "\"!"));
                        return;
                    }
                    return;
                }
            } else if (str3.equals("METRIC_REPORT")) {
                t tVar = (t) this.d.getValue();
                tVar.getClass();
                str.getClass();
                tVar.a();
                List list = (List) tVar.a.invoke(str);
                do {
                    Object obj3 = tVar.c.a.get();
                    obj3.getClass();
                    oVar = (o) obj3;
                    j = tVar.c.b;
                } while (oVar != tVar.c.a.get());
                l lVar = new l(list, tVar.b, new com.yandex.plus.core.benchmark.h(str, j, System.nanoTime()));
                ((v) this.e.getValue()).c(lVar, null);
                if (bVar.b(aVar)) {
                    bVar.c(aVar, "PlusBenchmarkAnalyticsTransport", hrg.q("handleMetricBenchmark(); benchmark \"", str, "\" tracked"));
                }
                pVar.invoke(cVar, lVar);
                return;
            }
            b(str3, str, cVar);
            return;
        }
        ConcurrentHashMap concurrentHashMap = this.f;
        int hashCode2 = str3.hashCode();
        if (hashCode2 != -1818421597) {
            if (hashCode2 != 912528627) {
                if (hashCode2 == 2043342825 && str3.equals("METRIC_CANCEL")) {
                    if (((l) concurrentHashMap.remove(str)) == null || !bVar.b(aVar)) {
                        return;
                    }
                    bVar.c(aVar, "PlusBenchmarkAnalyticsTransport", hrg.q("handleMetricBenchmark(); benchmark \"", str, "\" cancelled"));
                    return;
                }
            } else if (str3.equals("METRIC_START")) {
                if (((l) concurrentHashMap.get(str)) != null) {
                    com.yandex.plus.log.api.a aVar7 = com.yandex.plus.log.api.a.d;
                    if (bVar.b(aVar7)) {
                        bVar.c(aVar7, "PlusBenchmarkAnalyticsTransport", hrg.q("handleMetricBenchmark(); benchmark \"", str, "\" was already started!"));
                    }
                }
                l b = ((u) this.c.getValue()).b(str);
                b.c();
                concurrentHashMap.put(str, b);
                if (bVar.b(aVar)) {
                    bVar.c(aVar, "PlusBenchmarkAnalyticsTransport", hrg.q("handleMetricBenchmark(); benchmark \"", str, "\" started"));
                    return;
                }
                return;
            }
        } else if (str3.equals("METRIC_REPORT")) {
            l lVar2 = (l) concurrentHashMap.remove(str);
            if (lVar2 != null) {
                if (lVar2.d()) {
                    ((v) this.e.getValue()).c(lVar2, null);
                    if (bVar.b(aVar)) {
                        bVar.c(aVar, "PlusBenchmarkAnalyticsTransport", hrg.q("handleMetricBenchmark(); benchmark \"", str, "\" tracked"));
                    }
                    pVar.invoke(cVar, lVar2);
                    unit = Unit.a;
                } else {
                    com.yandex.plus.log.api.a aVar8 = com.yandex.plus.log.api.a.d;
                    if (bVar.b(aVar8)) {
                        bVar.c(aVar8, "PlusBenchmarkAnalyticsTransport", hrg.q("handleMetricBenchmark(); benchmark \"", str, "\" is already tracked!"));
                    }
                    unit = Unit.a;
                }
                if (unit != null) {
                    return;
                }
            }
            com.yandex.plus.log.api.a aVar9 = com.yandex.plus.log.api.a.d;
            if (bVar.b(aVar9)) {
                bVar.c(aVar9, "PlusBenchmarkAnalyticsTransport", hrg.q("handleMetricBenchmark(); benchmark \"", str, "\" is not found in started benchmarks!"));
                return;
            }
            return;
        }
        b(str3, str, cVar);
    }

    public final void b(String str, String str2, com.yandex.plus.bdui.analytics.c cVar) {
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.d;
        com.yandex.plus.log.api.b bVar = this.a;
        if (bVar.b(aVar)) {
            bVar.c(aVar, "PlusBenchmarkAnalyticsTransport", k5r.p(f1d.m("handleMetricBenchmark(); action \"", str, "\" is unknown for benchmark \"", str2, "\" with params "), cVar.b, '!'));
        }
    }
}
