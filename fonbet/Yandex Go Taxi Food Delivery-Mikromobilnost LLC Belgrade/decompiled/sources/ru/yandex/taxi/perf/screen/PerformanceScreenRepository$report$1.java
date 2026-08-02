package ru.yandex.taxi.perf.screen;

import defpackage.ava0;
import defpackage.b64;
import defpackage.czf0;
import defpackage.dua0;
import defpackage.hst;
import defpackage.jst;
import defpackage.jua0;
import defpackage.lx4;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ocp0;
import defpackage.oyr;
import defpackage.rua0;
import defpackage.sua0;
import defpackage.tcc;
import defpackage.tse;
import defpackage.tua0;
import defpackage.unr0;
import defpackage.uua0;
import defpackage.vua0;
import defpackage.w511;
import defpackage.wls;
import defpackage.wua0;
import defpackage.wwg;
import defpackage.xby;
import defpackage.xua0;
import defpackage.yua0;
import defpackage.zua0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;
import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.analytics.j;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.perf.screen.PerformanceScreenRepository$report$1", f = "PerformanceScreenRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class PerformanceScreenRepository$report$1 extends SuspendLambda implements wls {
    final /* synthetic */ ava0 $action;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PerformanceScreenRepository$report$1(ava0 ava0Var, c cVar, Continuation continuation) {
        super(2, continuation);
        this.$action = ava0Var;
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PerformanceScreenRepository$report$1(this.$action, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        PerformanceScreenRepository$report$1 performanceScreenRepository$report$1 = (PerformanceScreenRepository$report$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        performanceScreenRepository$report$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        ava0 ava0Var = this.$action;
        if (ava0Var instanceof wua0) {
            wua0 wua0Var = (wua0) ava0Var;
            this.this$0.a.getClass();
            if (wua0Var instanceof sua0) {
                sua0 sua0Var = (sua0) wua0Var;
                xby.l(jst.e, oyr.p("Perf:Error:", sua0Var.a.getAnalyticsName(), ":MissingElement"), null, null, "Trying to update missing element: ".concat(sua0Var.b), 6);
            } else if (wua0Var instanceof tua0) {
                tua0 tua0Var = (tua0) wua0Var;
                xby.l(jst.e, oyr.p("Perf:Error:", tua0Var.a.getAnalyticsName(), ":WrongElementName"), null, null, unr0.p("Trying to update element ", tua0Var.b, " from other element: ", tua0Var.c, "}"), 6);
            } else if (wua0Var instanceof uua0) {
                uua0 uua0Var = (uua0) wua0Var;
                String analyticsName = uua0Var.a.getAnalyticsName();
                String analyticsName2 = uua0Var.c.getAnalyticsName();
                String analyticsName3 = uua0Var.d.getAnalyticsName();
                hst hstVar = jst.e;
                String p = oyr.p("Perf:Error:", analyticsName, ":WrongElementState");
                StringBuilder v = b64.v("Trying to update element ", uua0Var.b, " from state: ", analyticsName2, " to state: ");
                v.append(analyticsName3);
                xby.l(hstVar, p, null, null, v.toString(), 6);
            } else {
                if (!(wua0Var instanceof vua0)) {
                    w511.b();
                    return null;
                }
                vua0 vua0Var = (vua0) wua0Var;
                xby.l(jst.e, oyr.p("Perf:Error:", vua0Var.a.getAnalyticsName(), ":WrongScreenElement"), null, null, b64.l("Trying to update element ", vua0Var.b, " from other screen: ", vua0Var.c.getAnalyticsName()), 6);
            }
        } else {
            if (!(ava0Var instanceof zua0)) {
                w511.b();
                return null;
            }
            rua0 rua0Var = this.this$0.a;
            zua0 zua0Var = (zua0) ava0Var;
            jua0 jua0Var = rua0Var.c;
            czf0 czf0Var = rua0Var.b;
            lx4 lx4Var = rua0Var.a;
            if (zua0Var instanceof yua0) {
                yua0 yua0Var = (yua0) zua0Var;
                long j = yua0Var.e;
                String l = b64.l("Perf.Screen.", yua0Var.a.getAnalyticsName(), Extension.DOT_CHAR, yua0Var.h.getAnalyticsName());
                i d = ((j) lx4Var).d(l);
                LinkedHashMap linkedHashMap = d.a;
                d.d("id", yua0Var.b);
                d.d("intent_reason", yua0Var.c.f());
                d.d("intent_source_screen", yua0Var.d);
                d.c(j, RemoteBioParameters.TIME);
                linkedHashMap.put("time_since_open_intent", yua0Var.f);
                d.d("time_since_app_launch", wwg.q(yua0Var.g));
                List<ocp0> list = yua0Var.i;
                ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                for (ocp0 ocp0Var : list) {
                    arrayList.add(kotlin.collections.b.i(new Pair("endpoint", ocp0Var.a.getAnalyticName()), new Pair("time_since_intent", Long.valueOf(ocp0Var.b)), new Pair("request_duration", Long.valueOf(ocp0Var.c)), new Pair("trace_id", ocp0Var.d)));
                }
                if (arrayList.isEmpty()) {
                    arrayList = null;
                }
                if (arrayList != null) {
                    linkedHashMap.put("endpoints", arrayList);
                }
                d.g("is_first_opening", yua0Var.j);
                d.m();
                czf0Var.getClass();
                czf0.a(j, l);
                jua0Var.getClass();
            } else {
                if (!(zua0Var instanceof xua0)) {
                    w511.b();
                    return null;
                }
                xua0 xua0Var = (xua0) zua0Var;
                long j2 = xua0Var.d;
                dua0 dua0Var = xua0Var.g;
                String analyticsName4 = dua0Var.a.getAnalyticsName();
                String str = dua0Var.b;
                String analyticsName5 = dua0Var.c.getAnalyticsName();
                StringBuilder v2 = b64.v("Perf.Screen.", analyticsName4, Extension.DOT_CHAR, str, Extension.DOT_CHAR);
                v2.append(analyticsName5);
                String sb = v2.toString();
                i d2 = ((j) lx4Var).d(sb);
                d2.d("id", xua0Var.a);
                d2.d("intent_reason", xua0Var.b.f());
                d2.d("intent_source_screen", xua0Var.c);
                d2.c(j2, RemoteBioParameters.TIME);
                d2.a.put("time_since_open_intent", xua0Var.e);
                d2.d("time_since_app_launch", wwg.q(xua0Var.f));
                d2.m();
                czf0Var.getClass();
                czf0.a(j2, sb);
                jua0Var.getClass();
            }
        }
        return zy11.a;
    }
}
