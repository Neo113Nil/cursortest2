package ru.yandex.taxi.notifications;

import com.yandex.go.taxi.order.domain.repositories.e0;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.eci0;
import defpackage.fxo;
import defpackage.h3y;
import defpackage.hxo;
import defpackage.jl40;
import defpackage.jxo;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.p2y0;
import defpackage.pzt0;
import defpackage.q5z;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.yw60;
import defpackage.z180;
import defpackage.zy11;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.order.k;

/* loaded from: classes9.dex */
public final class b implements yw60 {
    public final tse a;
    public final tt2 b;
    public final jxo c;
    public final g d;
    public final h3y e;
    public final p2y0 f;
    public final hxo g;
    public pzt0 h;

    public b(tse tseVar, tt2 tt2Var, jxo jxoVar, g gVar, h3y h3yVar, p2y0 p2y0Var, hxo hxoVar) {
        this.a = tseVar;
        this.b = tt2Var;
        this.c = jxoVar;
        this.d = gVar;
        this.e = h3yVar;
        this.f = p2y0Var;
        this.g = hxoVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0063, code lost:
    
        if (r9 == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0065, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004d, code lost:
    
        if (r9 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(b bVar, TaxiOrder taxiOrder, ContinuationImpl continuationImpl) {
        ExtendedNotificationImageRefreshInteractor$awaitCarImageAndRefresh$1 extendedNotificationImageRefreshInteractor$awaitCarImageAndRefresh$1;
        Object obj;
        int i;
        bVar.getClass();
        if (continuationImpl instanceof ExtendedNotificationImageRefreshInteractor$awaitCarImageAndRefresh$1) {
            extendedNotificationImageRefreshInteractor$awaitCarImageAndRefresh$1 = (ExtendedNotificationImageRefreshInteractor$awaitCarImageAndRefresh$1) continuationImpl;
            int i2 = extendedNotificationImageRefreshInteractor$awaitCarImageAndRefresh$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                extendedNotificationImageRefreshInteractor$awaitCarImageAndRefresh$1.label = i2 - Integer.MIN_VALUE;
                obj = extendedNotificationImageRefreshInteractor$awaitCarImageAndRefresh$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = extendedNotificationImageRefreshInteractor$awaitCarImageAndRefresh$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    extendedNotificationImageRefreshInteractor$awaitCarImageAndRefresh$1.L$0 = taxiOrder;
                    extendedNotificationImageRefreshInteractor$awaitCarImageAndRefresh$1.label = 1;
                    obj = bVar.k(taxiOrder, extendedNotificationImageRefreshInteractor$awaitCarImageAndRefresh$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        TaxiOrder taxiOrder2 = (TaxiOrder) obj;
                        if (taxiOrder2 != null) {
                            ((k) bVar.e.get()).a(taxiOrder2, false, 0L);
                            return zy11Var;
                        }
                        return zy11Var;
                    }
                    taxiOrder = (TaxiOrder) extendedNotificationImageRefreshInteractor$awaitCarImageAndRefresh$1.L$0;
                    kotlin.b.b(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    String str = taxiOrder.a;
                    extendedNotificationImageRefreshInteractor$awaitCarImageAndRefresh$1.L$0 = null;
                    extendedNotificationImageRefreshInteractor$awaitCarImageAndRefresh$1.label = 2;
                    obj = bVar.j(str, extendedNotificationImageRefreshInteractor$awaitCarImageAndRefresh$1);
                }
                return zy11Var;
            }
        }
        extendedNotificationImageRefreshInteractor$awaitCarImageAndRefresh$1 = new ExtendedNotificationImageRefreshInteractor$awaitCarImageAndRefresh$1(bVar, continuationImpl);
        obj = extendedNotificationImageRefreshInteractor$awaitCarImageAndRefresh$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = extendedNotificationImageRefreshInteractor$awaitCarImageAndRefresh$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        return zy11Var2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object i(b bVar, TaxiOrder taxiOrder, ContinuationImpl continuationImpl) {
        ExtendedNotificationImageRefreshInteractor$collectUntilCarImageReady$1 extendedNotificationImageRefreshInteractor$collectUntilCarImageReady$1;
        int i;
        bVar.getClass();
        if (continuationImpl instanceof ExtendedNotificationImageRefreshInteractor$collectUntilCarImageReady$1) {
            extendedNotificationImageRefreshInteractor$collectUntilCarImageReady$1 = (ExtendedNotificationImageRefreshInteractor$collectUntilCarImageReady$1) continuationImpl;
            int i2 = extendedNotificationImageRefreshInteractor$collectUntilCarImageReady$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                extendedNotificationImageRefreshInteractor$collectUntilCarImageReady$1.label = i2 - Integer.MIN_VALUE;
                Object obj = extendedNotificationImageRefreshInteractor$collectUntilCarImageReady$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = extendedNotificationImageRefreshInteractor$collectUntilCarImageReady$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    eci0 eci0Var = bVar.d.j;
                    ExtendedNotificationImageRefreshInteractor$collectUntilCarImageReady$loadedImage$1 extendedNotificationImageRefreshInteractor$collectUntilCarImageReady$loadedImage$1 = new ExtendedNotificationImageRefreshInteractor$collectUntilCarImageReady$loadedImage$1(bVar, taxiOrder, null);
                    extendedNotificationImageRefreshInteractor$collectUntilCarImageReady$1.L$0 = null;
                    extendedNotificationImageRefreshInteractor$collectUntilCarImageReady$1.label = 1;
                    obj = kotlinx.coroutines.flow.e.z(eci0Var, extendedNotificationImageRefreshInteractor$collectUntilCarImageReady$loadedImage$1, extendedNotificationImageRefreshInteractor$collectUntilCarImageReady$1);
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
                return Boolean.valueOf(((zy11) obj) != null);
            }
        }
        extendedNotificationImageRefreshInteractor$collectUntilCarImageReady$1 = new ExtendedNotificationImageRefreshInteractor$collectUntilCarImageReady$1(bVar, continuationImpl);
        Object obj2 = extendedNotificationImageRefreshInteractor$collectUntilCarImageReady$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = extendedNotificationImageRefreshInteractor$collectUntilCarImageReady$1.label;
        if (i != 0) {
        }
        return Boolean.valueOf(((zy11) obj2) != null);
    }

    @Override // defpackage.yw60
    public final void e() {
        tje.N(this.a, null, null, new ExtendedNotificationImageRefreshInteractor$onAppCreated$1(this, null), 3);
    }

    @Override // defpackage.s150
    public final String getName() {
        return "ExtendedNotificationImageRefreshInteractor";
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(String str, ContinuationImpl continuationImpl) {
        ExtendedNotificationImageRefreshInteractor$activeExtendedOrder$1 extendedNotificationImageRefreshInteractor$activeExtendedOrder$1;
        int i;
        o2y0 o2y0Var;
        TaxiOrder b;
        if (continuationImpl instanceof ExtendedNotificationImageRefreshInteractor$activeExtendedOrder$1) {
            extendedNotificationImageRefreshInteractor$activeExtendedOrder$1 = (ExtendedNotificationImageRefreshInteractor$activeExtendedOrder$1) continuationImpl;
            int i2 = extendedNotificationImageRefreshInteractor$activeExtendedOrder$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                extendedNotificationImageRefreshInteractor$activeExtendedOrder$1.label = i2 - Integer.MIN_VALUE;
                Object obj = extendedNotificationImageRefreshInteractor$activeExtendedOrder$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = extendedNotificationImageRefreshInteractor$activeExtendedOrder$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    p2y0 p2y0Var = this.f;
                    extendedNotificationImageRefreshInteractor$activeExtendedOrder$1.L$0 = null;
                    extendedNotificationImageRefreshInteractor$activeExtendedOrder$1.label = 1;
                    obj = ((e0) p2y0Var).p(str, extendedNotificationImageRefreshInteractor$activeExtendedOrder$1);
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
                o2y0Var = (o2y0) obj;
                if (o2y0Var == null && (b = o2y0Var.b()) != null && this.g.f(b.h.getB())) {
                    return b;
                }
                return null;
            }
        }
        extendedNotificationImageRefreshInteractor$activeExtendedOrder$1 = new ExtendedNotificationImageRefreshInteractor$activeExtendedOrder$1(this, continuationImpl);
        Object obj2 = extendedNotificationImageRefreshInteractor$activeExtendedOrder$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = extendedNotificationImageRefreshInteractor$activeExtendedOrder$1.label;
        if (i != 0) {
        }
        o2y0Var = (o2y0) obj2;
        if (o2y0Var == null) {
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(TaxiOrder taxiOrder, ContinuationImpl continuationImpl) {
        ExtendedNotificationImageRefreshInteractor$awaitCarImageReady$1 extendedNotificationImageRefreshInteractor$awaitCarImageReady$1;
        int i;
        if (continuationImpl instanceof ExtendedNotificationImageRefreshInteractor$awaitCarImageReady$1) {
            extendedNotificationImageRefreshInteractor$awaitCarImageReady$1 = (ExtendedNotificationImageRefreshInteractor$awaitCarImageReady$1) continuationImpl;
            int i2 = extendedNotificationImageRefreshInteractor$awaitCarImageReady$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                extendedNotificationImageRefreshInteractor$awaitCarImageReady$1.label = i2 - Integer.MIN_VALUE;
                Object obj = extendedNotificationImageRefreshInteractor$awaitCarImageReady$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = extendedNotificationImageRefreshInteractor$awaitCarImageReady$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ExtendedNotificationImageRefreshInteractor$awaitCarImageReady$ready$1 extendedNotificationImageRefreshInteractor$awaitCarImageReady$ready$1 = new ExtendedNotificationImageRefreshInteractor$awaitCarImageReady$ready$1(this, taxiOrder, null);
                    extendedNotificationImageRefreshInteractor$awaitCarImageReady$1.L$0 = null;
                    extendedNotificationImageRefreshInteractor$awaitCarImageReady$1.label = 1;
                    obj = kotlinx.coroutines.a.w(15000L, extendedNotificationImageRefreshInteractor$awaitCarImageReady$ready$1, extendedNotificationImageRefreshInteractor$awaitCarImageReady$1);
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
                return Boolean.valueOf(jl40.l((Boolean) obj, Boolean.TRUE));
            }
        }
        extendedNotificationImageRefreshInteractor$awaitCarImageReady$1 = new ExtendedNotificationImageRefreshInteractor$awaitCarImageReady$1(this, continuationImpl);
        Object obj2 = extendedNotificationImageRefreshInteractor$awaitCarImageReady$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = extendedNotificationImageRefreshInteractor$awaitCarImageReady$1.label;
        if (i != 0) {
        }
        return Boolean.valueOf(jl40.l((Boolean) obj2, Boolean.TRUE));
    }

    public final boolean m(TaxiOrder taxiOrder) {
        fxo d = this.g.d();
        if (d == null) {
            return true;
        }
        String a = taxiOrder.V().g.getA();
        g gVar = this.d;
        gVar.getClass();
        ConcurrentHashMap concurrentHashMap = gVar.h;
        if (q5z.S(a) == null || d.a() == null || d.c() == null || !(concurrentHashMap.get(d.a()) instanceof z180) || !(concurrentHashMap.get(d.c()) instanceof z180)) {
            return concurrentHashMap.get(d.b()) instanceof z180;
        }
        return true;
    }
}
