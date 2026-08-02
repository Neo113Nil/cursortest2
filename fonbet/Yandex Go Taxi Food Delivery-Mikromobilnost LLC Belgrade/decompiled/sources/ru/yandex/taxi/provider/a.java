package ru.yandex.taxi.provider;

import android.os.SystemClock;
import com.yandex.go.navigation.screen.api.Screen;
import com.yandex.go.zone.dto.objects.ServiceLevel;
import defpackage.a1o;
import defpackage.b64;
import defpackage.cmt;
import defpackage.dbl0;
import defpackage.fmt;
import defpackage.i3y;
import defpackage.lbl0;
import defpackage.ny61;
import defpackage.on2;
import defpackage.oyr;
import defpackage.ppr;
import defpackage.qbl0;
import defpackage.rbl0;
import defpackage.vng;
import defpackage.yal0;
import defpackage.zal0;
import defpackage.zzs;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.analytics.j;
import ru.yandex.taxi.perf.screen.ScreenEndpoint;
import ru.yandex.taxi.routestats.api.RouteStatsApi;

/* loaded from: classes9.dex */
public final class a {
    public static final a1o h = new a1o("full");
    public static final a1o i = new a1o("lightweight");
    public final on2 a;
    public final zal0 b;
    public final qbl0 c;
    public final com.yandex.go.navigation.screen.c d;
    public final rbl0 e;
    public final ru.yandex.taxi.perf.screen.c f;
    public final i3y g = kotlin.a.a(new ppr(23, this));

    public a(on2 on2Var, zal0 zal0Var, qbl0 qbl0Var, com.yandex.go.navigation.screen.c cVar, rbl0 rbl0Var, ru.yandex.taxi.perf.screen.c cVar2) {
        this.a = on2Var;
        this.b = zal0Var;
        this.c = qbl0Var;
        this.d = cVar;
        this.e = rbl0Var;
        this.f = cVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0098 A[Catch: all -> 0x003b, TryCatch #0 {all -> 0x003b, blocks: (B:12:0x0037, B:13:0x0088, B:16:0x0094, B:18:0x0098, B:19:0x00a2), top: B:11:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(lbl0 lbl0Var, ContinuationImpl continuationImpl) {
        LoadRouteStatsInteractorImpl$fetchRouteStats$1 loadRouteStatsInteractorImpl$fetchRouteStats$1;
        int i2;
        long j;
        lbl0 lbl0Var2;
        String a;
        lbl0 lbl0Var3 = lbl0Var;
        if (continuationImpl instanceof LoadRouteStatsInteractorImpl$fetchRouteStats$1) {
            loadRouteStatsInteractorImpl$fetchRouteStats$1 = (LoadRouteStatsInteractorImpl$fetchRouteStats$1) continuationImpl;
            int i3 = loadRouteStatsInteractorImpl$fetchRouteStats$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                loadRouteStatsInteractorImpl$fetchRouteStats$1.label = i3 - Integer.MIN_VALUE;
                LoadRouteStatsInteractorImpl$fetchRouteStats$1 loadRouteStatsInteractorImpl$fetchRouteStats$12 = loadRouteStatsInteractorImpl$fetchRouteStats$1;
                Object obj = loadRouteStatsInteractorImpl$fetchRouteStats$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = loadRouteStatsInteractorImpl$fetchRouteStats$12.label;
                ru.yandex.taxi.perf.screen.c cVar = this.f;
                if (i2 != 0) {
                    kotlin.b.b(obj);
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    try {
                        cmt<yal0> a2 = ((RouteStatsApi) this.g.getValue()).a(lbl0Var3, lbl0Var3.r ? i : h);
                        LoadRouteStatsInteractorImpl$fetchRouteStats$routeStatsResponse$1 loadRouteStatsInteractorImpl$fetchRouteStats$routeStatsResponse$1 = new LoadRouteStatsInteractorImpl$fetchRouteStats$routeStatsResponse$1(1, this, a.class, "logThrowable", "logThrowable(Ljava/lang/Throwable;)V", 0);
                        loadRouteStatsInteractorImpl$fetchRouteStats$12.L$0 = lbl0Var3;
                        loadRouteStatsInteractorImpl$fetchRouteStats$12.J$0 = elapsedRealtime;
                        loadRouteStatsInteractorImpl$fetchRouteStats$12.label = 1;
                        obj = ru.yandex.taxi.network.api.a.b(a2, loadRouteStatsInteractorImpl$fetchRouteStats$routeStatsResponse$1, loadRouteStatsInteractorImpl$fetchRouteStats$12);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        lbl0Var2 = lbl0Var3;
                        j = elapsedRealtime;
                    } catch (Throwable th) {
                        th = th;
                        j = elapsedRealtime;
                        if (!lbl0Var3.r) {
                        }
                        throw th;
                    }
                } else {
                    if (i2 != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j = loadRouteStatsInteractorImpl$fetchRouteStats$12.J$0;
                    lbl0Var2 = (lbl0) loadRouteStatsInteractorImpl$fetchRouteStats$12.L$0;
                    try {
                        kotlin.b.b(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        lbl0Var3 = lbl0Var2;
                        if (!lbl0Var3.r) {
                            cVar.e(ScreenEndpoint.RouteStats, SystemClock.elapsedRealtime() - j, "");
                        }
                        throw th;
                    }
                }
                a = ((fmt) obj).e.a("X-YaTraceId");
                if (a == null) {
                    a = "";
                }
                if (!lbl0Var2.r) {
                    cVar.e(ScreenEndpoint.RouteStats, SystemClock.elapsedRealtime() - j, a);
                }
                fmt fmtVar = (fmt) obj;
                String a3 = fmtVar.e.a("X-YaTraceId");
                Object obj2 = fmtVar.a;
                yal0 yal0Var = (yal0) obj2;
                yal0Var.s = a3;
                yal0Var.t = lbl0Var2.r;
                return obj2;
            }
        }
        loadRouteStatsInteractorImpl$fetchRouteStats$1 = new LoadRouteStatsInteractorImpl$fetchRouteStats$1(this, continuationImpl);
        LoadRouteStatsInteractorImpl$fetchRouteStats$1 loadRouteStatsInteractorImpl$fetchRouteStats$122 = loadRouteStatsInteractorImpl$fetchRouteStats$1;
        Object obj3 = loadRouteStatsInteractorImpl$fetchRouteStats$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = loadRouteStatsInteractorImpl$fetchRouteStats$122.label;
        ru.yandex.taxi.perf.screen.c cVar2 = this.f;
        if (i2 != 0) {
        }
        a = ((fmt) obj3).e.a("X-YaTraceId");
        if (a == null) {
        }
        if (!lbl0Var2.r) {
        }
        fmt fmtVar2 = (fmt) obj3;
        String a32 = fmtVar2.e.a("X-YaTraceId");
        Object obj22 = fmtVar2.a;
        yal0 yal0Var2 = (yal0) obj22;
        yal0Var2.s = a32;
        yal0Var2.t = lbl0Var2.r;
        return obj22;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(yal0 yal0Var, lbl0 lbl0Var) {
        Object obj;
        String str;
        rbl0 rbl0Var = this.e;
        rbl0Var.getClass();
        boolean z = lbl0Var.r;
        r0 r0Var = rbl0Var.a;
        if (z) {
            r0Var.l(null);
        } else {
            r0Var.getClass();
            r0Var.m(null, lbl0Var);
        }
        Screen b = this.d.b();
        List list = lbl0Var.e;
        i d = ((j) this.b.a).d("Main.GetRouteStats");
        d.g("success", true);
        if (yal0Var != null) {
            Iterator it = yal0Var.b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                String str2 = ((ServiceLevel) obj).S;
                if (str2 != null && str2.length() != 0) {
                    break;
                }
            }
            ServiceLevel serviceLevel = (ServiceLevel) obj;
            if (serviceLevel != null) {
                str = serviceLevel.S;
                if (str != null && str.length() != 0) {
                    d.d("offer_id", str);
                }
                if (!list.isEmpty()) {
                    d.f("coordinate_a", vng.n((zzs) list.get(0)));
                    if (list.size() > 1) {
                        d.f("coordinate_b", vng.n((zzs) b64.c(1, list)));
                    }
                    int size = list.size() - 1;
                    for (int i2 = 1; i2 < size; i2++) {
                        String i3 = oyr.i(i2, "coordinate_additional_");
                        zzs zzsVar = (zzs) list.get(i2);
                        HashMap hashMap = new HashMap();
                        hashMap.put("lat", Double.valueOf(zzsVar.a));
                        hashMap.put("lon", Double.valueOf(zzsVar.b));
                        int i4 = zzsVar.c;
                        if (i4 > 0) {
                            hashMap.put("acc", Integer.valueOf(i4));
                        }
                        d.f(i3, hashMap);
                    }
                }
                d.m();
                dbl0 dbl0Var = new dbl0(yal0Var, b, lbl0Var.e, lbl0Var.q, lbl0Var.h, lbl0Var.k);
                qbl0 qbl0Var = this.c;
                r0 r0Var2 = qbl0Var.b;
                r0Var2.getClass();
                r0Var2.m(null, dbl0Var);
                ((ru.yandex.taxi.routestats.a) qbl0Var.a.get()).m(dbl0Var);
                if (lbl0Var.n) {
                    r0 r0Var3 = qbl0Var.c;
                    r0Var3.getClass();
                    r0Var3.m(null, dbl0Var);
                    return;
                }
                return;
            }
        }
        str = null;
        if (str != null) {
            d.d("offer_id", str);
        }
        if (!list.isEmpty()) {
        }
        d.m();
        dbl0 dbl0Var2 = new dbl0(yal0Var, b, lbl0Var.e, lbl0Var.q, lbl0Var.h, lbl0Var.k);
        qbl0 qbl0Var2 = this.c;
        r0 r0Var22 = qbl0Var2.b;
        r0Var22.getClass();
        r0Var22.m(null, dbl0Var2);
        ((ru.yandex.taxi.routestats.a) qbl0Var2.a.get()).m(dbl0Var2);
        if (lbl0Var.n) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(lbl0 lbl0Var, ContinuationImpl continuationImpl) {
        LoadRouteStatsInteractorImpl$routeStats$1 loadRouteStatsInteractorImpl$routeStats$1;
        int i2;
        if (continuationImpl instanceof LoadRouteStatsInteractorImpl$routeStats$1) {
            loadRouteStatsInteractorImpl$routeStats$1 = (LoadRouteStatsInteractorImpl$routeStats$1) continuationImpl;
            int i3 = loadRouteStatsInteractorImpl$routeStats$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                loadRouteStatsInteractorImpl$routeStats$1.label = i3 - Integer.MIN_VALUE;
                Object obj = loadRouteStatsInteractorImpl$routeStats$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = loadRouteStatsInteractorImpl$routeStats$1.label;
                if (i2 != 0) {
                    kotlin.b.b(obj);
                    loadRouteStatsInteractorImpl$routeStats$1.L$0 = lbl0Var;
                    loadRouteStatsInteractorImpl$routeStats$1.label = 1;
                    obj = a(lbl0Var, loadRouteStatsInteractorImpl$routeStats$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i2 != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    lbl0Var = (lbl0) loadRouteStatsInteractorImpl$routeStats$1.L$0;
                    kotlin.b.b(obj);
                }
                yal0 yal0Var = (yal0) obj;
                b(yal0Var, lbl0Var);
                return yal0Var;
            }
        }
        loadRouteStatsInteractorImpl$routeStats$1 = new LoadRouteStatsInteractorImpl$routeStats$1(this, continuationImpl);
        Object obj3 = loadRouteStatsInteractorImpl$routeStats$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = loadRouteStatsInteractorImpl$routeStats$1.label;
        if (i2 != 0) {
        }
        yal0 yal0Var2 = (yal0) obj3;
        b(yal0Var2, lbl0Var);
        return yal0Var2;
    }
}
