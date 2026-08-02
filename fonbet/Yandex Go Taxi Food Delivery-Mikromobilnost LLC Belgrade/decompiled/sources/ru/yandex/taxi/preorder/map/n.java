package ru.yandex.taxi.preorder.map;

import android.content.Context;
import defpackage.a3v;
import defpackage.bl00;
import defpackage.bvf0;
import defpackage.e6l0;
import defpackage.f6l0;
import defpackage.ffx;
import defpackage.fji;
import defpackage.g0c0;
import defpackage.g6l0;
import defpackage.gci0;
import defpackage.jl40;
import defpackage.l6l0;
import defpackage.nj6;
import defpackage.ny61;
import defpackage.nyb0;
import defpackage.o400;
import defpackage.oyb0;
import defpackage.p0c0;
import defpackage.pwy0;
import defpackage.pzt0;
import defpackage.qj6;
import defpackage.r0c0;
import defpackage.rq00;
import defpackage.scc;
import defpackage.sjh;
import defpackage.sq00;
import defpackage.t3l0;
import defpackage.tje;
import defpackage.tls;
import defpackage.tpr;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.uze0;
import defpackage.vyb0;
import defpackage.wiq0;
import defpackage.wsr0;
import defpackage.xsr0;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.tariffs.model.PriceUpdate$PriceLoadingState;
import ru.yandex.taxi.theme.ThemeType;

/* loaded from: classes6.dex */
public final class n {
    public g6l0 A;
    public g6l0 B;
    public g6l0 C;
    public g6l0 D;
    public String E;
    public qj6 F;
    public fji G;
    public fji H;
    public final n0 I;
    public final gci0 J;
    public final ru.yandex.taxi.combo.factory.a a;
    public final wiq0 b;
    public final uze0 c;
    public final ru.yandex.taxi.preorder.map.interactor.c d;
    public final pwy0 e;
    public final tse f;
    public final tt2 g;
    public final a3v h;
    public final nj6 i;
    public final c j;
    public final r0c0 k;
    public final Context l;
    public final ru.yandex.taxi.delivery.pin.k m;
    public final com.yandex.go.taxi.summary.map.clarify_source_point.interactor.a n;
    public final oyb0 o;
    public final nyb0 p;
    public final ru.yandex.taxi.preorder.map.interactor.a q;
    public final r0 r;
    public final r0 s;
    public final r0 t;
    public final r0 u;
    public final r0 v;
    public final t3l0 w;
    public pzt0 x;
    public g6l0 y;
    public g6l0 z;

    public n(ru.yandex.taxi.combo.factory.a aVar, wiq0 wiq0Var, uze0 uze0Var, ru.yandex.taxi.preorder.map.interactor.c cVar, pwy0 pwy0Var, tse tseVar, tt2 tt2Var, a3v a3vVar, nj6 nj6Var, c cVar2, r0c0 r0c0Var, Context context, ru.yandex.taxi.delivery.pin.k kVar, com.yandex.go.taxi.summary.map.clarify_source_point.interactor.a aVar2, oyb0 oyb0Var, nyb0 nyb0Var, ru.yandex.taxi.preorder.map.interactor.a aVar3) {
        this.a = aVar;
        this.b = wiq0Var;
        this.c = uze0Var;
        this.d = cVar;
        this.e = pwy0Var;
        this.f = tseVar;
        this.g = tt2Var;
        this.h = a3vVar;
        this.i = nj6Var;
        this.j = cVar2;
        this.k = r0c0Var;
        this.l = context;
        this.m = kVar;
        this.n = aVar2;
        this.o = oyb0Var;
        this.p = nyb0Var;
        this.q = aVar3;
        Boolean bool = Boolean.FALSE;
        this.r = bvf0.c(bool);
        p0c0 p0c0Var = p0c0.e;
        this.s = bvf0.c(p0c0Var);
        this.t = bvf0.c(p0c0Var);
        this.u = bvf0.c(bool);
        this.v = bvf0.c(bool);
        this.w = new t3l0(null, null, false, null, 12);
        this.E = "";
        n0 b = ffx.b(1, 0, BufferOverflow.DROP_OLDEST);
        b.g(zy11.a);
        this.I = b;
        tpr t = kotlinx.coroutines.flow.e.t(new m(((com.yandex.go.taxi.tariffs.internal.repository.k) wiq0Var).j.b(), this));
        tt2Var.getClass();
        this.J = kotlinx.coroutines.flow.e.R(kotlinx.coroutines.flow.e.F(t, uyj.a), tseVar, wsr0.a(xsr0.a, 3), null);
    }

    public static final Object a(n nVar, Integer num, g0c0 g0c0Var, e6l0 e6l0Var, boolean z, ThemeType themeType, SuspendLambda suspendLambda) {
        nVar.getClass();
        return nVar.f(new RouteOverlayIconHolder$commonState$2(nVar, n.class, "previousCommonState", "getPreviousCommonState()Lru/yandex/taxi/preorder/map/RouteOverlayIconHolder$IconState;", 0), new f6l0(nVar, 0), new RouteOverlayIconHolder$commonState$4(nVar, num, g0c0Var, e6l0Var, z, null), scc.g(num, e6l0Var, g0c0Var, themeType), suspendLambda);
    }

    public static final Object b(n nVar, e6l0 e6l0Var, ThemeType themeType, SuspendLambda suspendLambda) {
        nVar.getClass();
        return nVar.f(new RouteOverlayIconHolder$loadingState$2(nVar, n.class, "previousLoadingState", "getPreviousLoadingState()Lru/yandex/taxi/preorder/map/RouteOverlayIconHolder$IconState;", 0), new f6l0(nVar, 1), new RouteOverlayIconHolder$loadingState$4(nVar, e6l0Var, null), scc.g(e6l0Var.a, themeType), suspendLambda);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(n nVar, vyb0 vyb0Var, ContinuationImpl continuationImpl) {
        RouteOverlayIconHolder$needConfirmationState$1 routeOverlayIconHolder$needConfirmationState$1;
        int i;
        nVar.getClass();
        if (continuationImpl instanceof RouteOverlayIconHolder$needConfirmationState$1) {
            routeOverlayIconHolder$needConfirmationState$1 = (RouteOverlayIconHolder$needConfirmationState$1) continuationImpl;
            int i2 = routeOverlayIconHolder$needConfirmationState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                routeOverlayIconHolder$needConfirmationState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = routeOverlayIconHolder$needConfirmationState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = routeOverlayIconHolder$needConfirmationState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    c cVar = nVar.j;
                    routeOverlayIconHolder$needConfirmationState$1.L$0 = null;
                    routeOverlayIconHolder$needConfirmationState$1.label = 1;
                    obj = cVar.b.h(new sq00(null, null, true, null, null, vyb0Var.a, null, false, false, new rq00(vyb0Var.b.a, vyb0Var.c.a), null, 0.0f, 7643), routeOverlayIconHolder$needConfirmationState$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return new t3l0((bl00) obj, null, false, null, 14);
            }
        }
        routeOverlayIconHolder$needConfirmationState$1 = new RouteOverlayIconHolder$needConfirmationState$1(nVar, continuationImpl);
        Object obj2 = routeOverlayIconHolder$needConfirmationState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = routeOverlayIconHolder$needConfirmationState$1.label;
        if (i != 0) {
        }
        return new t3l0((bl00) obj2, null, false, null, 14);
    }

    public static final Object d(n nVar, SuspendLambda suspendLambda) {
        tt2 tt2Var = nVar.g;
        String str = nVar.E;
        if (str == null || str.length() == 0) {
            fji fjiVar = nVar.G;
            String str2 = fjiVar != null ? fjiVar.b : null;
            if (str2 == null || str2.length() == 0) {
                fji fjiVar2 = nVar.H;
                String str3 = fjiVar2 != null ? fjiVar2.b : null;
                if (str3 == null || str3.length() == 0) {
                    qj6 qj6Var = nVar.F;
                    String str4 = qj6Var != null ? qj6Var.a : null;
                    if (str4 == null || str4.length() == 0) {
                        ru.yandex.taxi.preorder.map.interactor.a aVar = nVar.q;
                        if (aVar.a((PriceUpdate$PriceLoadingState) ((com.yandex.go.taxi.tariffs.internal.repository.k) aVar.d).j.c.getValue(), ((com.yandex.go.taxi.tariffs.internal.repository.k) aVar.c).n()) == null) {
                            tt2Var.getClass();
                            sjh sjhVar = uyj.a;
                            Object k0 = tje.k0(o400.a, new RouteOverlayIconHolder$updateFocusRect$3(null, nVar), suspendLambda);
                            if (k0 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                                return k0;
                            }
                            return zy11.a;
                        }
                    }
                }
            }
        }
        tt2Var.getClass();
        sjh sjhVar2 = uyj.a;
        Object k02 = tje.k0(o400.a, new RouteOverlayIconHolder$updateFocusRect$2(null, nVar), suspendLambda);
        if (k02 == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return k02;
        }
        return zy11.a;
    }

    public final void e(l6l0 l6l0Var, l6l0 l6l0Var2, l6l0 l6l0Var3) {
        if (this.x != null) {
            return;
        }
        this.x = tje.N(this.f, null, null, new RouteOverlayIconHolder$attach$1(this, l6l0Var, l6l0Var2, l6l0Var3, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(MutablePropertyReference0Impl mutablePropertyReference0Impl, tls tlsVar, tls tlsVar2, List list, Continuation continuation) {
        RouteOverlayIconHolder$cachedState$1 routeOverlayIconHolder$cachedState$1;
        int i;
        if (continuation instanceof RouteOverlayIconHolder$cachedState$1) {
            routeOverlayIconHolder$cachedState$1 = (RouteOverlayIconHolder$cachedState$1) continuation;
            int i2 = routeOverlayIconHolder$cachedState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                routeOverlayIconHolder$cachedState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = routeOverlayIconHolder$cachedState$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = routeOverlayIconHolder$cachedState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    g6l0 g6l0Var = (g6l0) mutablePropertyReference0Impl.get();
                    if (jl40.l(g6l0Var != null ? g6l0Var.b : null, list)) {
                        return g6l0Var.a;
                    }
                    routeOverlayIconHolder$cachedState$1.L$0 = null;
                    routeOverlayIconHolder$cachedState$1.L$1 = tlsVar;
                    routeOverlayIconHolder$cachedState$1.L$2 = null;
                    routeOverlayIconHolder$cachedState$1.L$3 = list;
                    routeOverlayIconHolder$cachedState$1.L$4 = null;
                    routeOverlayIconHolder$cachedState$1.label = 1;
                    obj = tlsVar2.invoke(routeOverlayIconHolder$cachedState$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    list = (List) routeOverlayIconHolder$cachedState$1.L$3;
                    tlsVar = (tls) routeOverlayIconHolder$cachedState$1.L$1;
                    kotlin.b.b(obj);
                }
                t3l0 t3l0Var = (t3l0) obj;
                tlsVar.invoke(new g6l0(t3l0Var, list));
                return t3l0Var;
            }
        }
        routeOverlayIconHolder$cachedState$1 = new RouteOverlayIconHolder$cachedState$1(continuation, this);
        Object obj3 = routeOverlayIconHolder$cachedState$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = routeOverlayIconHolder$cachedState$1.label;
        if (i != 0) {
        }
        t3l0 t3l0Var2 = (t3l0) obj3;
        tlsVar.invoke(new g6l0(t3l0Var2, list));
        return t3l0Var2;
    }
}
