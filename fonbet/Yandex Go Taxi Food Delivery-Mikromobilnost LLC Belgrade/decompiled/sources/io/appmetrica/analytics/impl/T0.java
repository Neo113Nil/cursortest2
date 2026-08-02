package io.appmetrica.analytics.impl;

import android.content.Context;
import defpackage.gw00;
import io.appmetrica.analytics.AdvIdentifiersResult;
import io.appmetrica.analytics.AnrListener;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.AppMetricaYandex;
import io.appmetrica.analytics.AppMetricaYandexConfig;
import io.appmetrica.analytics.FeaturesResult;
import io.appmetrica.analytics.IAdvIdentifiersCallback;
import io.appmetrica.analytics.IParamsCallback;
import io.appmetrica.analytics.IReporterYandex;
import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.ModulesFacade;
import io.appmetrica.analytics.MviEventsReporter;
import io.appmetrica.analytics.PulseConfig;
import io.appmetrica.analytics.ReporterYandexConfig;
import io.appmetrica.analytics.RtmClientEvent;
import io.appmetrica.analytics.RtmConfig;
import io.appmetrica.analytics.RtmErrorEvent;
import io.appmetrica.analytics.UserInfo;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.ApiKeyUtils;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* loaded from: classes9.dex */
public final class T0 extends AbstractC0611p3 {
    public final ns e;
    public final qs f;
    public final C0369gl g;
    public final Ne h;

    public T0(F0 f0, ls lsVar, C0369gl c0369gl) {
        this(f0, c0369gl, new ns(f0), lsVar, new qs(), C0225bl.a(), V4.l().j(), new Ne());
    }

    public final IReporterYandex a(Context context, String str) {
        C0398hl c0398hl;
        ns nsVar = this.e;
        nsVar.c.a(context);
        nsVar.e.a(str);
        qs qsVar = this.f;
        context.getApplicationContext();
        qsVar.getClass();
        IHandlerExecutor a = AbstractC0611p3.a();
        ((Pa) a).b.post(new S0(this, context));
        AppMetrica.getReporter(context, str);
        C0369gl c0369gl = this.g;
        synchronized (c0369gl.e) {
            try {
                LinkedHashMap linkedHashMap = c0369gl.c;
                Object obj = linkedHashMap.get(str);
                if (obj == null) {
                    obj = new C0398hl(context, str, AppMetrica.getReporter(context, str), c0369gl.b);
                    linkedHashMap.put(str, obj);
                }
                c0398hl = (C0398hl) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0398hl;
    }

    public final void b(UserInfo userInfo) {
        Context context;
        this.e.a.a(null);
        this.f.getClass();
        C0903z6 c0903z6 = V4.l().g;
        synchronized (c0903z6) {
            context = c0903z6.c;
        }
        if (context != null) {
            AppMetricaYandex.getReporter(context, "20799a27-fa80-4b36-b2db-0f8141f24180").setUserInfo(userInfo);
        }
        Ne ne = this.h;
        ne.getClass();
        Gc[] gcArr = Gc.a;
        ModulesFacade.reportEvent(ModuleEvent.newBuilder(9).withExtras(userInfo != null ? gw00.e(new Pair("ai", MessageNano.toByteArray(ne.a.a.a.fromModel(userInfo)))) : kotlin.collections.b.f()).build());
    }

    public final void c(String str, String str2) {
        ns nsVar = this.e;
        nsVar.a.a(null);
        nsVar.i.a(str);
        this.f.getClass();
        this.h.getClass();
        Gc[] gcArr = Gc.a;
        ModulesFacade.reportEvent(ModuleEvent.newBuilder(22).withName(str).withValue(str2).withServiceDataReporterType(3).build());
    }

    public final void d(String str, String str2) {
        ns nsVar = this.e;
        nsVar.a.a(null);
        nsVar.i.a(str);
        nsVar.j.a(str2);
        this.f.getClass();
        this.h.getClass();
        Gc[] gcArr = Gc.a;
        ModulesFacade.reportEvent(ModuleEvent.newBuilder(23).withName(str).withValue(str2).withServiceDataReporterType(3).build());
    }

    public final void e(String str, String str2) {
        ns nsVar = this.e;
        nsVar.a.a(null);
        nsVar.k.a(str);
        nsVar.m.a(str2);
        this.f.getClass();
        IHandlerExecutor a = AbstractC0611p3.a();
        ((Pa) a).b.post(new M0(this, str, str2));
    }

    public final void f(String str, String str2) {
        this.e.a.a(null);
        this.f.getClass();
        this.h.getClass();
        Gc[] gcArr = Gc.a;
        ModulesFacade.reportEvent(ModuleEvent.newBuilder(11).withName(str).withValue(str2).build());
    }

    public final void g() {
        this.e.getClass();
        this.f.getClass();
        AppMetrica.sendEventsBuffer();
    }

    public T0() {
        this(new F0(), new ls(), C0267d5.b.a().a());
    }

    public T0(F0 f0, C0369gl c0369gl, ns nsVar, ls lsVar, qs qsVar, C0225bl c0225bl, B8 b8, Ne ne) {
        super(f0, lsVar, c0225bl, b8);
        this.e = nsVar;
        this.f = qsVar;
        this.g = c0369gl;
        this.h = ne;
    }

    public final Map<String, String> e() {
        this.e.getClass();
        this.f.getClass();
        this.a.getClass();
        E0 e0 = E0.e;
        if (e0 == null) {
            return null;
        }
        return e0.d().i();
    }

    public final MviEventsReporter f() {
        this.e.getClass();
        this.f.getClass();
        return C0249cg.a;
    }

    public final void c() {
        this.e.getClass();
        this.f.getClass();
        IHandlerExecutor a = AbstractC0611p3.a();
        ((Pa) a).b.post(new Q0(this));
    }

    public final String c(Context context) {
        this.e.c.a(context);
        qs qsVar = this.f;
        qsVar.a.a(context.getApplicationContext());
        return AppMetrica.getUuid(context);
    }

    public final AdvIdentifiersResult d() {
        this.e.getClass();
        this.f.getClass();
        this.a.getClass();
        E0 e0 = E0.e;
        if (e0 == null) {
            return null;
        }
        return e0.d().f();
    }

    public final void a(Context context, AppMetricaYandexConfig appMetricaYandexConfig) {
        if (!E0.g) {
            ns nsVar = this.e;
            nsVar.c.a(context);
            nsVar.b.a(appMetricaYandexConfig);
            qs qsVar = this.f;
            context.getApplicationContext();
            qsVar.getClass();
            AppMetrica.activate(context, appMetricaYandexConfig);
            IHandlerExecutor a = AbstractC0611p3.a();
            ((Pa) a).b.post(new S0(this, context));
            return;
        }
        LoggerStorage.getMainPublicOrAnonymousLogger().warning("AppMetrica SDK already has been activated. Ignore attempt to activate with apiKey = %s", ApiKeyUtils.createPartialApiKey(appMetricaYandexConfig.apiKey));
    }

    public final void a(String str, Throwable th) {
        ns nsVar = this.e;
        nsVar.a.a(null);
        nsVar.k.a(str);
        nsVar.l.a(th);
        this.f.getClass();
        IHandlerExecutor a = AbstractC0611p3.a();
        ((Pa) a).b.post(new N0(this, str, th));
    }

    public final FeaturesResult b(Context context) {
        this.e.c.a(context);
        qs qsVar = this.f;
        context.getApplicationContext();
        qsVar.getClass();
        F0 f0 = this.a;
        Context applicationContext = context.getApplicationContext();
        f0.getClass();
        return new FeaturesResult(E0.a(applicationContext).d().h().a);
    }

    public final void a(RtmClientEvent rtmClientEvent) {
        ns nsVar = this.e;
        nsVar.a.a(null);
        nsVar.i.a(rtmClientEvent != null ? rtmClientEvent.name : null);
        this.f.getClass();
        ((Pa) AbstractC0611p3.a()).b.post(new O0(this, rtmClientEvent));
    }

    public final void a(RtmErrorEvent rtmErrorEvent) {
        ns nsVar = this.e;
        nsVar.a.a(null);
        nsVar.k.a(rtmErrorEvent != null ? rtmErrorEvent.message : null);
        this.f.getClass();
        ((Pa) AbstractC0611p3.a()).b.post(new P0(this, rtmErrorEvent));
    }

    public final void b(String str, Map<String, Object> map) {
        this.e.a.a(null);
        this.f.getClass();
        this.h.getClass();
        Gc[] gcArr = Gc.a;
        ModulesFacade.reportEvent(ModuleEvent.newBuilder(11).withName(str).withValue(Vc.c(map)).build());
    }

    public final void a(UserInfo userInfo) {
        ns nsVar = this.e;
        nsVar.a.a(null);
        nsVar.h.a(userInfo);
        this.f.getClass();
        Ne ne = this.h;
        ne.getClass();
        Gc[] gcArr = Gc.a;
        ModulesFacade.reportEvent(ModuleEvent.newBuilder(12).withExtras(gw00.e(new Pair("ai", MessageNano.toByteArray(ne.a.a.a.fromModel(userInfo))))).build());
    }

    public final void b() {
        this.e.getClass();
        this.f.getClass();
        AppMetrica.clearAppEnvironment();
    }

    public final void b(String str, String str2) {
        this.e.g.a(str);
        this.f.getClass();
        AppMetrica.putErrorEnvironmentValue(str, str2);
    }

    public final void a(RtmConfig rtmConfig) {
        this.e.a.a(null);
        this.f.getClass();
        IHandlerExecutor a = AbstractC0611p3.a();
        ((Pa) a).b.post(new L0(this, rtmConfig));
    }

    public final void a(Context context, ReporterYandexConfig reporterYandexConfig) {
        ns nsVar = this.e;
        nsVar.c.a(context);
        nsVar.d.a(reporterYandexConfig);
        qs qsVar = this.f;
        context.getApplicationContext();
        qsVar.getClass();
        IHandlerExecutor a = AbstractC0611p3.a();
        ((Pa) a).b.post(new S0(this, context));
        AppMetrica.activateReporter(context, reporterYandexConfig);
    }

    public final void a(PulseConfig pulseConfig) {
        ns nsVar = this.e;
        nsVar.a.a(null);
        nsVar.f.a(pulseConfig);
        this.f.getClass();
        IHandlerExecutor a = AbstractC0611p3.a();
        ((Pa) a).b.post(new R0(this, pulseConfig));
    }

    public final void a(String str, Map<String, Object> map) {
        ns nsVar = this.e;
        nsVar.a.a(null);
        nsVar.i.a(str);
        this.f.getClass();
        this.h.getClass();
        Gc[] gcArr = Gc.a;
        ModulesFacade.reportEvent(ModuleEvent.newBuilder(22).withName(str).withServiceDataReporterType(3).withAttributes(map).build());
    }

    public final void a(Context context, IParamsCallback iParamsCallback, List<String> list) {
        ns nsVar = this.e;
        nsVar.c.a(context);
        nsVar.n.a(iParamsCallback);
        nsVar.o.a(list);
        qs qsVar = this.f;
        qsVar.a.a(context.getApplicationContext());
        AppMetrica.requestStartupParams(context, new C0533mc(iParamsCallback), new ArrayList(list));
    }

    public final void a(Context context, IAdvIdentifiersCallback iAdvIdentifiersCallback) {
        ns nsVar = this.e;
        nsVar.c.a(context);
        nsVar.p.a(iAdvIdentifiersCallback);
        qs qsVar = this.f;
        qsVar.a.a(context.getApplicationContext());
        AppMetrica.requestStartupParams(context, new Zb(iAdvIdentifiersCallback, new V()), Arrays.asList("appmetrica_google_adv_id", "appmetrica_huawei_oaid", "appmetrica_yandex_adv_id"));
    }

    public final String a(Context context) {
        this.e.c.a(context);
        qs qsVar = this.f;
        qsVar.a.a(context.getApplicationContext());
        return AppMetrica.getDeviceId(context);
    }

    public final void a(String str, String str2) {
        this.e.g.a(str);
        this.f.getClass();
        AppMetrica.putAppEnvironmentValue(str, str2);
    }

    public final void a(AnrListener anrListener) {
        this.e.q.a(anrListener);
        this.f.getClass();
        AppMetrica.registerAnrListener(anrListener);
    }

    public static InterfaceC0651qe a(T0 t0) {
        InterfaceC0651qe interfaceC0651qe;
        C0369gl c0369gl = t0.g;
        synchronized (c0369gl.f) {
            interfaceC0651qe = c0369gl.d;
            if (interfaceC0651qe == null) {
                if (Boolean.TRUE.equals(V4.l().l.b)) {
                    interfaceC0651qe = new C0679re();
                    c0369gl.d = interfaceC0651qe;
                } else {
                    throw new IllegalStateException("AppMetrica isn't initialized. Use AppMetrica#activate(android.content.Context, String) method to activate.");
                }
            }
        }
        return interfaceC0651qe;
    }
}
