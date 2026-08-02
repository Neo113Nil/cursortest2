package ru.yandex.taxi.analytics;

import android.content.Context;
import defpackage.ac20;
import defpackage.b64;
import defpackage.bvf0;
import defpackage.cl7;
import defpackage.dvw;
import defpackage.fc20;
import defpackage.gkd;
import defpackage.h3y;
import defpackage.ic20;
import defpackage.ike;
import defpackage.j18;
import defpackage.jc20;
import defpackage.jl40;
import defpackage.mc20;
import defpackage.rs2;
import defpackage.s8x;
import defpackage.tje;
import defpackage.tls;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.v0p;
import defpackage.v2u0;
import defpackage.vmz;
import io.appmetrica.analytics.AppMetricaYandex;
import io.appmetrica.analytics.MviTimestamp;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.a;

/* loaded from: classes9.dex */
public final class q implements ac20, v2u0 {
    public final Context a;
    public final ru.yandex.taxi.vendor_api.push.b b;
    public final h3y c;
    public final h3y d;
    public final rs2 e;
    public final v0p f;
    public final h3y g;
    public final com.yandex.go.proxyprovision.k h;
    public final h3y i;
    public final com.yandex.go.proxyprovision.mob.e j;
    public final h3y k;
    public final gkd l;
    public final CrashlyticsInteractor m;
    public volatile boolean p;
    public final ike r;
    public final CopyOnWriteArraySet n = new CopyOnWriteArraySet();
    public final CopyOnWriteArraySet o = new CopyOnWriteArraySet();
    public volatile s8x q = a.a();

    public q(Context context, ru.yandex.taxi.vendor_api.push.b bVar, h3y h3yVar, h3y h3yVar2, rs2 rs2Var, v0p v0pVar, h3y h3yVar3, com.yandex.go.proxyprovision.k kVar, h3y h3yVar4, com.yandex.go.proxyprovision.mob.e eVar, h3y h3yVar5, gkd gkdVar, CrashlyticsInteractor crashlyticsInteractor, tt2 tt2Var) {
        this.a = context;
        this.b = bVar;
        this.c = h3yVar;
        this.d = h3yVar2;
        this.e = rs2Var;
        this.f = v0pVar;
        this.g = h3yVar3;
        this.h = kVar;
        this.i = h3yVar4;
        this.j = eVar;
        this.k = h3yVar5;
        this.l = gkdVar;
        this.m = crashlyticsInteractor;
        tt2Var.getClass();
        this.r = bvf0.a(uyj.a.plus(jl40.a()));
    }

    public final void a(tls tlsVar) {
        tje.N(this.r, null, null, new MetricaWrapper$doAfterInit$1(tlsVar, null, this), 3);
    }

    public final void b(MviTimestamp mviTimestamp) {
        this.b.a();
        tje.N(this.r, null, null, new MetricaWrapper$init$1(this, mviTimestamp, null), 3);
    }

    public final void c(String str, String str2) {
        a(new MetricaWrapper$reportDiagnosticEvent$1(str, str2, this, null));
    }

    public final void d(String str, MapBuilder mapBuilder) {
        a(new MetricaWrapper$reportDiagnosticEvent$2(str, mapBuilder, this, null));
    }

    public final void e(String str, String str2, Throwable th) {
        a(new MetricaWrapper$reportError$2(str, str2, th, this, null));
    }

    public final void f(String str, Throwable th) {
        a(new MetricaWrapper$reportError$1(str, th, null, this));
    }

    public final void g(String str, String str2) {
        a(new MetricaWrapper$reportEvent$3(str, str2, this, null));
    }

    public final void h(String str, Map map) {
        a(new MetricaWrapper$reportEvent$1(str, map, this, null));
    }

    public final void i(String str, Throwable th) {
        a(new MetricaWrapper$reportWtfError$1(str, th, null, this));
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [T, mc20] */
    public final Object j(Continuation continuation) {
        j18 j18Var = new j18(1, dvw.b(continuation));
        Ref$ObjectRef y = b64.y(j18Var);
        int i = 0;
        ic20 ic20Var = new ic20(i, y);
        cl7 cl7Var = new cl7(j18Var, ic20Var);
        a(new MetricaWrapper$requestDeferredDeeplink$2$1(new MetricaWrapper$requestDeferredDeeplink$$inlined$suspendCallbackApi$2(1, cl7Var, cl7.class, "success", "success(Ljava/lang/Object;)V", 0), null, this));
        y.element = mc20.b;
        if (cl7Var.c()) {
            ic20Var.invoke();
        } else {
            j18Var.w(new jc20(cl7Var, i));
        }
        Object s = j18Var.s();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return s;
    }

    public final void k(Context context) {
        AppMetricaYandex.requestStartupParams(context, new fc20(new MetricaWrapper$requestStartupIdentifiers$1(1, this, q.class, "notifyListeners", "notifyListeners(Lru/yandex/taxi/analytics/MetricaParameters;)V", 0), new vmz(22, this, context)), "appmetrica_uuid", "appmetrica_device_id");
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [T, mc20] */
    public final Object l(Context context, ContinuationImpl continuationImpl) {
        int i = 1;
        j18 j18Var = new j18(1, dvw.b(continuationImpl));
        Ref$ObjectRef y = b64.y(j18Var);
        ic20 ic20Var = new ic20(i, y);
        cl7 cl7Var = new cl7(j18Var, ic20Var);
        a(new MetricaWrapper$requestStartupParams$2$1(context, new MetricaWrapper$requestStartupParams$$inlined$suspendCallbackApi$2(1, cl7Var, cl7.class, "success", "success(Ljava/lang/Object;)V", 0), new MetricaWrapper$requestStartupParams$$inlined$suspendCallbackApi$3(1, cl7Var, cl7.class, "error", "error(Ljava/lang/Throwable;)V", 0), null));
        y.element = mc20.c;
        if (cl7Var.c()) {
            ic20Var.invoke();
        } else {
            j18Var.w(new jc20(cl7Var, i));
        }
        Object s = j18Var.s();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return s;
    }
}
