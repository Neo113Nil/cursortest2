package ru.yandex.taxi.widgets.data.repository;

import com.yandex.go.superapp.orders.card.experiments.y;
import defpackage.bvf0;
import defpackage.eci0;
import defpackage.ffx;
import defpackage.g050;
import defpackage.g551;
import defpackage.g8e;
import defpackage.gtq0;
import defpackage.i18;
import defpackage.i3y;
import defpackage.ike;
import defpackage.jb7;
import defpackage.joh;
import defpackage.jst;
import defpackage.koh;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.oay0;
import defpackage.qv10;
import defpackage.rol0;
import defpackage.sjh;
import defpackage.sls;
import defpackage.smw0;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.wsr0;
import defpackage.xby;
import defpackage.xsr0;
import defpackage.y451;
import defpackage.y4z;
import defpackage.yaf0;
import defpackage.z151;
import defpackage.zy11;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.multiorder.multi.ServiceType;
import ru.yandex.taxi.superapp.knownOrder.u;

/* loaded from: classes10.dex */
public final class t {
    public final u a;
    public final tse b;
    public final tt2 c;
    public final ru.yandex.taxi.widgets.data.repository.widgets.a d;
    public final y451 e;
    public final ru.yandex.taxi.widgets.data.datasources.fallback.a f;
    public final g551 g;
    public final y h;
    public final y4z i;
    public final i3y p;
    public final i3y r;
    public final i3y j = kotlin.a.a(new z151(4));
    public final kotlinx.coroutines.sync.a k = gtq0.a();
    public final AtomicReference l = new AtomicReference();
    public final AtomicReference m = new AtomicReference();
    public final LinkedHashMap n = new LinkedHashMap();
    public final Object o = new Object();
    public final n0 q = ffx.c(0, 0, null, 7);
    public final i3y s = kotlin.a.a(new oay0(18, this));

    public t(u uVar, tse tseVar, tt2 tt2Var, ru.yandex.taxi.widgets.data.repository.widgets.a aVar, y451 y451Var, ru.yandex.taxi.widgets.data.datasources.fallback.a aVar2, g551 g551Var, y yVar, y4z y4zVar) {
        this.a = uVar;
        this.b = tseVar;
        this.c = tt2Var;
        this.d = aVar;
        this.e = y451Var;
        this.f = aVar2;
        this.g = g551Var;
        this.h = yVar;
        this.i = y4zVar;
        final int i = 0;
        this.p = kotlin.a.a(new sls(this) { // from class: ru.yandex.taxi.widgets.data.repository.k
            public final /* synthetic */ t b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                switch (i) {
                    case 0:
                        t tVar = this.b;
                        return kotlinx.coroutines.flow.e.X(new m((tpr) tVar.s.getValue(), null), new WidgetsDtoRepository$createWidgetsFlow$2(tVar, true, tVar.l, new jb7(tVar.g, new ServiceType[]{ServiceType.TAXI}), null, null));
                    default:
                        t tVar2 = this.b;
                        return tVar2.d(new m0(kotlinx.coroutines.flow.e.K((tpr) tVar2.p.getValue(), tVar2.q), tVar2.i.b, new WidgetsDtoRepository$applyLocalDeferments$1(tVar2, null)));
                }
            }
        });
        final int i2 = 1;
        this.r = kotlin.a.a(new sls(this) { // from class: ru.yandex.taxi.widgets.data.repository.k
            public final /* synthetic */ t b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        t tVar = this.b;
                        return kotlinx.coroutines.flow.e.X(new m((tpr) tVar.s.getValue(), null), new WidgetsDtoRepository$createWidgetsFlow$2(tVar, true, tVar.l, new jb7(tVar.g, new ServiceType[]{ServiceType.TAXI}), null, null));
                    default:
                        t tVar2 = this.b;
                        return tVar2.d(new m0(kotlinx.coroutines.flow.e.K((tpr) tVar2.p.getValue(), tVar2.q), tVar2.i.b, new WidgetsDtoRepository$applyLocalDeferments$1(tVar2, null)));
                }
            }
        });
        tt2Var.getClass();
        sjh sjhVar = uyj.a;
        tje.N(tseVar, mdh.b, null, new WidgetsDtoRepository$handleTrackingDeferRequests$1(this, null), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0187 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* JADX WARN: Type inference failed for: r12v5, types: [T, java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(t tVar, String str, String str2, Continuation continuation) {
        WidgetsDtoRepository$processDeferRequest$1 widgetsDtoRepository$processDeferRequest$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        Ref$ObjectRef z;
        String str3;
        Exception exc;
        joh johVar;
        g050 g050Var;
        String str4;
        koh kohVar;
        Throwable th;
        Ref$ObjectRef ref$ObjectRef;
        String str5;
        Map map;
        n0 n0Var;
        String str6;
        Object failure;
        Throwable a;
        Object value;
        Iterable<i18> iterable;
        tVar.getClass();
        try {
            if (continuation instanceof WidgetsDtoRepository$processDeferRequest$1) {
                widgetsDtoRepository$processDeferRequest$1 = (WidgetsDtoRepository$processDeferRequest$1) continuation;
                int i2 = widgetsDtoRepository$processDeferRequest$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    widgetsDtoRepository$processDeferRequest$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = widgetsDtoRepository$processDeferRequest$1.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = widgetsDtoRepository$processDeferRequest$1.label;
                    if (i != 0) {
                        z = qv10.z(obj);
                        try {
                            joh johVar2 = new joh(str, str2);
                            tpr tprVar = (tpr) tVar.s.getValue();
                            widgetsDtoRepository$processDeferRequest$1.L$0 = str;
                            widgetsDtoRepository$processDeferRequest$1.L$1 = null;
                            widgetsDtoRepository$processDeferRequest$1.L$2 = z;
                            widgetsDtoRepository$processDeferRequest$1.L$3 = johVar2;
                            widgetsDtoRepository$processDeferRequest$1.label = 1;
                            Object y = kotlinx.coroutines.flow.e.y(tprVar, widgetsDtoRepository$processDeferRequest$1);
                            if (y != coroutineSingletons) {
                                str3 = str;
                                johVar = johVar2;
                                obj = y;
                            }
                            return coroutineSingletons;
                        } catch (Exception e) {
                            str3 = str;
                            exc = e;
                            str6 = str3;
                            failure = new Result.Failure(exc);
                            ref$ObjectRef = z;
                            a = Result.a(failure);
                            if (a != null) {
                            }
                            Boolean bool = Boolean.FALSE;
                            if (failure instanceof Result.Failure) {
                            }
                            Boolean bool2 = (Boolean) failure;
                            synchronized (tVar.o) {
                            }
                        }
                    } else if (i == 1) {
                        johVar = (joh) widgetsDtoRepository$processDeferRequest$1.L$3;
                        z = (Ref$ObjectRef) widgetsDtoRepository$processDeferRequest$1.L$2;
                        str3 = (String) widgetsDtoRepository$processDeferRequest$1.L$0;
                        try {
                            kotlin.b.b(obj);
                        } catch (Exception e2) {
                            exc = e2;
                            str6 = str3;
                            failure = new Result.Failure(exc);
                            ref$ObjectRef = z;
                            a = Result.a(failure);
                            if (a != null) {
                            }
                            Boolean bool3 = Boolean.FALSE;
                            if (failure instanceof Result.Failure) {
                            }
                            Boolean bool22 = (Boolean) failure;
                            synchronized (tVar.o) {
                            }
                        }
                    } else if (i == 2) {
                        g050Var = (g050) widgetsDtoRepository$processDeferRequest$1.L$4;
                        kohVar = (koh) widgetsDtoRepository$processDeferRequest$1.L$3;
                        z = (Ref$ObjectRef) widgetsDtoRepository$processDeferRequest$1.L$2;
                        str4 = (String) widgetsDtoRepository$processDeferRequest$1.L$0;
                        try {
                            kotlin.b.b(obj);
                            try {
                                ru.yandex.taxi.widgets.data.repository.widgets.a aVar = tVar.d;
                                widgetsDtoRepository$processDeferRequest$1.L$0 = str4;
                                widgetsDtoRepository$processDeferRequest$1.L$1 = null;
                                widgetsDtoRepository$processDeferRequest$1.L$2 = z;
                                widgetsDtoRepository$processDeferRequest$1.L$3 = null;
                                widgetsDtoRepository$processDeferRequest$1.L$4 = g050Var;
                                widgetsDtoRepository$processDeferRequest$1.L$5 = null;
                                widgetsDtoRepository$processDeferRequest$1.label = 3;
                                obj = aVar.a(kohVar, widgetsDtoRepository$processDeferRequest$1);
                                if (obj != coroutineSingletons) {
                                    ref$ObjectRef = z;
                                    str5 = str4;
                                    map = (Map) obj;
                                    tVar.l.set(map);
                                    n0Var = tVar.q;
                                    widgetsDtoRepository$processDeferRequest$1.L$0 = str5;
                                    widgetsDtoRepository$processDeferRequest$1.L$1 = null;
                                    widgetsDtoRepository$processDeferRequest$1.L$2 = ref$ObjectRef;
                                    widgetsDtoRepository$processDeferRequest$1.L$3 = null;
                                    widgetsDtoRepository$processDeferRequest$1.L$4 = g050Var;
                                    widgetsDtoRepository$processDeferRequest$1.L$5 = null;
                                    widgetsDtoRepository$processDeferRequest$1.L$6 = null;
                                    widgetsDtoRepository$processDeferRequest$1.label = 4;
                                    if (n0Var.emit(map, widgetsDtoRepository$processDeferRequest$1) != coroutineSingletons) {
                                    }
                                }
                                return coroutineSingletons;
                            } catch (Throwable th2) {
                                th = th2;
                                ref$ObjectRef = z;
                                str5 = str4;
                                g050Var.d(null);
                                throw th;
                            }
                        } catch (Exception e3) {
                            exc = e3;
                            str3 = str4;
                            str6 = str3;
                            failure = new Result.Failure(exc);
                            ref$ObjectRef = z;
                            a = Result.a(failure);
                            if (a != null) {
                            }
                            Boolean bool32 = Boolean.FALSE;
                            if (failure instanceof Result.Failure) {
                            }
                            Boolean bool222 = (Boolean) failure;
                            synchronized (tVar.o) {
                            }
                        }
                    } else {
                        if (i == 3) {
                            g050Var = (g050) widgetsDtoRepository$processDeferRequest$1.L$4;
                            ref$ObjectRef = (Ref$ObjectRef) widgetsDtoRepository$processDeferRequest$1.L$2;
                            str5 = (String) widgetsDtoRepository$processDeferRequest$1.L$0;
                            try {
                                kotlin.b.b(obj);
                                map = (Map) obj;
                                tVar.l.set(map);
                                n0Var = tVar.q;
                                widgetsDtoRepository$processDeferRequest$1.L$0 = str5;
                                widgetsDtoRepository$processDeferRequest$1.L$1 = null;
                                widgetsDtoRepository$processDeferRequest$1.L$2 = ref$ObjectRef;
                                widgetsDtoRepository$processDeferRequest$1.L$3 = null;
                                widgetsDtoRepository$processDeferRequest$1.L$4 = g050Var;
                                widgetsDtoRepository$processDeferRequest$1.L$5 = null;
                                widgetsDtoRepository$processDeferRequest$1.L$6 = null;
                                widgetsDtoRepository$processDeferRequest$1.label = 4;
                                if (n0Var.emit(map, widgetsDtoRepository$processDeferRequest$1) != coroutineSingletons) {
                                    str6 = str5;
                                    g050Var.d(null);
                                    failure = Boolean.TRUE;
                                    a = Result.a(failure);
                                    if (a != null) {
                                    }
                                    Boolean bool322 = Boolean.FALSE;
                                    if (failure instanceof Result.Failure) {
                                    }
                                    Boolean bool2222 = (Boolean) failure;
                                    synchronized (tVar.o) {
                                    }
                                }
                                return coroutineSingletons;
                            } catch (Throwable th3) {
                                th = th3;
                                g050Var.d(null);
                                throw th;
                            }
                        }
                        if (i != 4) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        g050Var = (g050) widgetsDtoRepository$processDeferRequest$1.L$4;
                        ref$ObjectRef = (Ref$ObjectRef) widgetsDtoRepository$processDeferRequest$1.L$2;
                        str6 = (String) widgetsDtoRepository$processDeferRequest$1.L$0;
                        try {
                            kotlin.b.b(obj);
                            try {
                                g050Var.d(null);
                                failure = Boolean.TRUE;
                            } catch (Exception e4) {
                                exc = e4;
                                z = ref$ObjectRef;
                                str3 = str6;
                                str6 = str3;
                                failure = new Result.Failure(exc);
                                ref$ObjectRef = z;
                                a = Result.a(failure);
                                if (a != null) {
                                }
                                Boolean bool3222 = Boolean.FALSE;
                                if (failure instanceof Result.Failure) {
                                }
                                Boolean bool22222 = (Boolean) failure;
                                synchronized (tVar.o) {
                                }
                            }
                            a = Result.a(failure);
                            if (a != null) {
                                xby.l(jst.e, "SUPERAPP_TEAM:DEFER_TRACKING", null, a, g8e.o("Failed to defer tracking ", str6), 2);
                            }
                            Boolean bool32222 = Boolean.FALSE;
                            if (failure instanceof Result.Failure) {
                                failure = bool32222;
                            }
                            Boolean bool222222 = (Boolean) failure;
                            synchronized (tVar.o) {
                                r0 r0Var = tVar.i.a;
                                do {
                                    value = r0Var.getValue();
                                } while (!r0Var.k(value, kotlin.collections.b.j(str6, (Map) value)));
                                iterable = (List) tVar.n.remove(str6);
                                if (iterable == null) {
                                    iterable = EmptyList.a;
                                }
                            }
                            smw0.A(tVar.m, ref$ObjectRef.element);
                            for (i18 i18Var : iterable) {
                                if (i18Var.isActive()) {
                                    i18Var.resumeWith(bool222222);
                                }
                            }
                            return zy11.a;
                        } catch (Throwable th4) {
                            th = th4;
                            str5 = str6;
                            try {
                                g050Var.d(null);
                                throw th;
                            } catch (Exception e5) {
                                exc = e5;
                                String str7 = str5;
                                z = ref$ObjectRef;
                                str3 = str7;
                                str6 = str3;
                                failure = new Result.Failure(exc);
                                ref$ObjectRef = z;
                                a = Result.a(failure);
                                if (a != null) {
                                }
                                Boolean bool322222 = Boolean.FALSE;
                                if (failure instanceof Result.Failure) {
                                }
                                Boolean bool2222222 = (Boolean) failure;
                                synchronized (tVar.o) {
                                }
                            }
                        }
                    }
                    ?? r12 = (List) obj;
                    koh kohVar2 = new koh(johVar, r12);
                    z.element = r12;
                    tVar.m.set(r12);
                    g050Var = tVar.k;
                    widgetsDtoRepository$processDeferRequest$1.L$0 = str3;
                    widgetsDtoRepository$processDeferRequest$1.L$1 = null;
                    widgetsDtoRepository$processDeferRequest$1.L$2 = z;
                    widgetsDtoRepository$processDeferRequest$1.L$3 = kohVar2;
                    widgetsDtoRepository$processDeferRequest$1.L$4 = g050Var;
                    widgetsDtoRepository$processDeferRequest$1.L$5 = null;
                    widgetsDtoRepository$processDeferRequest$1.label = 2;
                    if (g050Var.a(widgetsDtoRepository$processDeferRequest$1) != coroutineSingletons) {
                        str4 = str3;
                        kohVar = kohVar2;
                        ru.yandex.taxi.widgets.data.repository.widgets.a aVar2 = tVar.d;
                        widgetsDtoRepository$processDeferRequest$1.L$0 = str4;
                        widgetsDtoRepository$processDeferRequest$1.L$1 = null;
                        widgetsDtoRepository$processDeferRequest$1.L$2 = z;
                        widgetsDtoRepository$processDeferRequest$1.L$3 = null;
                        widgetsDtoRepository$processDeferRequest$1.L$4 = g050Var;
                        widgetsDtoRepository$processDeferRequest$1.L$5 = null;
                        widgetsDtoRepository$processDeferRequest$1.label = 3;
                        obj = aVar2.a(kohVar, widgetsDtoRepository$processDeferRequest$1);
                        if (obj != coroutineSingletons) {
                        }
                    }
                    return coroutineSingletons;
                }
            }
            if (i != 0) {
            }
            ?? r122 = (List) obj;
            koh kohVar22 = new koh(johVar, r122);
            z.element = r122;
            tVar.m.set(r122);
            g050Var = tVar.k;
            widgetsDtoRepository$processDeferRequest$1.L$0 = str3;
            widgetsDtoRepository$processDeferRequest$1.L$1 = null;
            widgetsDtoRepository$processDeferRequest$1.L$2 = z;
            widgetsDtoRepository$processDeferRequest$1.L$3 = kohVar22;
            widgetsDtoRepository$processDeferRequest$1.L$4 = g050Var;
            widgetsDtoRepository$processDeferRequest$1.L$5 = null;
            widgetsDtoRepository$processDeferRequest$1.label = 2;
            if (g050Var.a(widgetsDtoRepository$processDeferRequest$1) != coroutineSingletons) {
            }
            return coroutineSingletons;
        } catch (CancellationException e6) {
            throw e6;
        }
        widgetsDtoRepository$processDeferRequest$1 = new WidgetsDtoRepository$processDeferRequest$1(tVar, continuation);
        Object obj2 = widgetsDtoRepository$processDeferRequest$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = widgetsDtoRepository$processDeferRequest$1.label;
    }

    public final rol0 b() {
        return new rol0(new WidgetsDtoRepository$getAllWidgetListsFlow$1(this, null));
    }

    public final rol0 c(yaf0 yaf0Var) {
        return new rol0(new WidgetsDtoRepository$getWidgetListFlow$1(this, yaf0Var, null));
    }

    public final eci0 d(tpr tprVar) {
        tpr t = kotlinx.coroutines.flow.e.t(tprVar);
        this.c.getClass();
        sjh sjhVar = uyj.a;
        tpr F = kotlinx.coroutines.flow.e.F(t, mdh.b);
        ike M = bvf0.M(this.b, uyj.a);
        xsr0.a.getClass();
        return kotlinx.coroutines.flow.e.O(F, M, wsr0.b, 1);
    }
}
