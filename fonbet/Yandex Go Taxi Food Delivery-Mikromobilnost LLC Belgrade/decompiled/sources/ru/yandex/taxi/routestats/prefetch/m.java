package ru.yandex.taxi.routestats.prefetch;

import defpackage.a1o;
import defpackage.boe0;
import defpackage.cbl0;
import defpackage.csf0;
import defpackage.g050;
import defpackage.gtq0;
import defpackage.gw00;
import defpackage.i3y;
import defpackage.ioe0;
import defpackage.jne0;
import defpackage.jst;
import defpackage.kne0;
import defpackage.nbl0;
import defpackage.noh;
import defpackage.ny61;
import defpackage.on2;
import defpackage.pbl0;
import defpackage.qh2;
import defpackage.sdc;
import defpackage.tt2;
import defpackage.yal0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes9.dex */
public final class m {
    public static final a1o i = new a1o("full");
    public static final a1o j = new a1o("lightweight");
    public final on2 a;
    public final tt2 b;
    public final com.yandex.go.analytics.b c;
    public final nbl0 d;
    public final i3y e = kotlin.a.a(new csf0(16, this));
    public final kotlinx.coroutines.sync.a f = gtq0.a();
    public final ArrayList g = new ArrayList();
    public final AtomicBoolean h = new AtomicBoolean(true);

    public m(on2 on2Var, tt2 tt2Var, com.yandex.go.analytics.b bVar, nbl0 nbl0Var) {
        this.a = on2Var;
        this.b = tt2Var;
        this.c = bVar;
        this.d = nbl0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0117, code lost:
    
        if (r1 == r4) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0078, code lost:
    
        if (r5 == r4) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a6 A[Catch: all -> 0x00df, TryCatch #2 {all -> 0x00df, blocks: (B:22:0x009c, B:23:0x00a0, B:25:0x00a6, B:27:0x00ba, B:29:0x00c2, B:31:0x00c8, B:32:0x00e1, B:37:0x00eb, B:39:0x00ef, B:41:0x00f5, B:49:0x00fc), top: B:21:0x009c }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0105 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0106 A[Catch: all -> 0x003d, CancellationException -> 0x012e, TRY_ENTER, TryCatch #3 {CancellationException -> 0x012e, all -> 0x003d, blocks: (B:13:0x0038, B:14:0x011a, B:45:0x0106), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fc A[Catch: all -> 0x00df, TRY_LEAVE, TryCatch #2 {all -> 0x00df, blocks: (B:22:0x009c, B:23:0x00a0, B:25:0x00a6, B:27:0x00ba, B:29:0x00c2, B:31:0x00c8, B:32:0x00e1, B:37:0x00eb, B:39:0x00ef, B:41:0x00f5, B:49:0x00fc), top: B:21:0x009c }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ea A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(cbl0 cbl0Var, ContinuationImpl continuationImpl) {
        RouteStatsPrefetchRepositoryImpl$consume$1 routeStatsPrefetchRepositoryImpl$consume$1;
        CoroutineSingletons coroutineSingletons;
        int i2;
        Object obj;
        Object k;
        kotlinx.coroutines.sync.a aVar;
        g050 g050Var;
        int i3;
        Object obj2;
        Iterator it;
        Object obj3;
        pbl0 pbl0Var;
        pbl0 pbl0Var2;
        ArrayList arrayList = this.g;
        try {
            if (continuationImpl instanceof RouteStatsPrefetchRepositoryImpl$consume$1) {
                routeStatsPrefetchRepositoryImpl$consume$1 = (RouteStatsPrefetchRepositoryImpl$consume$1) continuationImpl;
                int i4 = routeStatsPrefetchRepositoryImpl$consume$1.label;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    routeStatsPrefetchRepositoryImpl$consume$1.label = i4 - Integer.MIN_VALUE;
                    Object obj4 = routeStatsPrefetchRepositoryImpl$consume$1.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i2 = routeStatsPrefetchRepositoryImpl$consume$1.label;
                    if (i2 != 0) {
                        kotlin.b.b(obj4);
                        obj = cbl0Var;
                        routeStatsPrefetchRepositoryImpl$consume$1.L$0 = obj;
                        routeStatsPrefetchRepositoryImpl$consume$1.label = 1;
                        k = ((noh) this.d.d.getValue()).k(routeStatsPrefetchRepositoryImpl$consume$1);
                    } else if (i2 == 1) {
                        Object obj5 = (jne0) routeStatsPrefetchRepositoryImpl$consume$1.L$0;
                        kotlin.b.b(obj4);
                        k = obj4;
                        obj = obj5;
                    } else {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            pbl0Var2 = (pbl0) routeStatsPrefetchRepositoryImpl$consume$1.L$1;
                            kotlin.b.b(obj4);
                            return new ioe0((yal0) obj4, pbl0Var2.b());
                        }
                        i3 = routeStatsPrefetchRepositoryImpl$consume$1.I$0;
                        g050Var = (g050) routeStatsPrefetchRepositoryImpl$consume$1.L$1;
                        obj2 = (jne0) routeStatsPrefetchRepositoryImpl$consume$1.L$0;
                        kotlin.b.b(obj4);
                        try {
                            it = arrayList.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    obj3 = null;
                                    break;
                                }
                                obj3 = it.next();
                                kne0 a = ((cbl0) obj2).a(((pbl0) obj3).a());
                                if (i3 != 0 && this.h.get() && a.a() != null) {
                                    this.c.b("RouteStats.ConsumeDiff", gw00.e(new Pair("diffs", a.a())));
                                }
                                if (a.b()) {
                                    break;
                                }
                            }
                            pbl0Var = (pbl0) obj3;
                            if (pbl0Var != null || pbl0Var.d()) {
                                if (pbl0Var != null) {
                                    arrayList.clear();
                                }
                                pbl0Var2 = null;
                            } else {
                                arrayList.clear();
                                pbl0Var2 = pbl0Var;
                            }
                            g050Var.d(null);
                            if (pbl0Var2 != null) {
                                return null;
                            }
                            noh c = pbl0Var2.c();
                            routeStatsPrefetchRepositoryImpl$consume$1.L$0 = null;
                            routeStatsPrefetchRepositoryImpl$consume$1.L$1 = pbl0Var2;
                            routeStatsPrefetchRepositoryImpl$consume$1.I$0 = i3;
                            routeStatsPrefetchRepositoryImpl$consume$1.label = 3;
                            obj4 = c.k(routeStatsPrefetchRepositoryImpl$consume$1);
                        } catch (Throwable th) {
                            g050Var.d(null);
                            throw th;
                        }
                    }
                    boe0 boe0Var = (boe0) k;
                    int i5 = (boe0Var == null && boe0Var.e) ? 1 : 0;
                    routeStatsPrefetchRepositoryImpl$consume$1.L$0 = obj;
                    aVar = this.f;
                    routeStatsPrefetchRepositoryImpl$consume$1.L$1 = aVar;
                    routeStatsPrefetchRepositoryImpl$consume$1.I$0 = i5;
                    routeStatsPrefetchRepositoryImpl$consume$1.label = 2;
                    if (aVar.a(routeStatsPrefetchRepositoryImpl$consume$1) != coroutineSingletons) {
                        g050Var = aVar;
                        i3 = i5;
                        obj2 = obj;
                        it = arrayList.iterator();
                        while (true) {
                            if (it.hasNext()) {
                            }
                        }
                        pbl0Var = (pbl0) obj3;
                        if (pbl0Var != null) {
                        }
                        if (pbl0Var != null) {
                        }
                        pbl0Var2 = null;
                        g050Var.d(null);
                        if (pbl0Var2 != null) {
                        }
                    }
                    return coroutineSingletons;
                }
            }
            if (i2 != 0) {
            }
            boe0 boe0Var2 = (boe0) k;
            if (boe0Var2 == null) {
            }
            routeStatsPrefetchRepositoryImpl$consume$1.L$0 = obj;
            aVar = this.f;
            routeStatsPrefetchRepositoryImpl$consume$1.L$1 = aVar;
            routeStatsPrefetchRepositoryImpl$consume$1.I$0 = i5;
            routeStatsPrefetchRepositoryImpl$consume$1.label = 2;
            if (aVar.a(routeStatsPrefetchRepositoryImpl$consume$1) != coroutineSingletons) {
            }
            return coroutineSingletons;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th2) {
            jst.e.k(th2, "Prefetched routestats failed, falling back to normal request");
            return null;
        }
        routeStatsPrefetchRepositoryImpl$consume$1 = new RouteStatsPrefetchRepositoryImpl$consume$1(this, continuationImpl);
        Object obj42 = routeStatsPrefetchRepositoryImpl$consume$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = routeStatsPrefetchRepositoryImpl$consume$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004e A[Catch: all -> 0x005c, LOOP:0: B:12:0x0048->B:14:0x004e, LOOP_END, TryCatch #0 {all -> 0x005c, blocks: (B:11:0x0044, B:12:0x0048, B:14:0x004e, B:16:0x005e), top: B:10:0x0044 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        RouteStatsPrefetchRepositoryImpl$invalidate$1 routeStatsPrefetchRepositoryImpl$invalidate$1;
        int i2;
        g050 g050Var;
        Iterator it;
        ArrayList arrayList = this.g;
        try {
            if (continuationImpl instanceof RouteStatsPrefetchRepositoryImpl$invalidate$1) {
                routeStatsPrefetchRepositoryImpl$invalidate$1 = (RouteStatsPrefetchRepositoryImpl$invalidate$1) continuationImpl;
                int i3 = routeStatsPrefetchRepositoryImpl$invalidate$1.label;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    routeStatsPrefetchRepositoryImpl$invalidate$1.label = i3 - Integer.MIN_VALUE;
                    Object obj = routeStatsPrefetchRepositoryImpl$invalidate$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i2 = routeStatsPrefetchRepositoryImpl$invalidate$1.label;
                    if (i2 != 0) {
                        kotlin.b.b(obj);
                        g050Var = this.f;
                        routeStatsPrefetchRepositoryImpl$invalidate$1.L$0 = g050Var;
                        routeStatsPrefetchRepositoryImpl$invalidate$1.label = 1;
                        if (g050Var.a(routeStatsPrefetchRepositoryImpl$invalidate$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i2 != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        g050Var = (g050) routeStatsPrefetchRepositoryImpl$invalidate$1.L$0;
                        kotlin.b.b(obj);
                    }
                    it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((pbl0) it.next()).c().a(null);
                    }
                    arrayList.clear();
                    g050Var.d(null);
                    return zy11.a;
                }
            }
            it = arrayList.iterator();
            while (it.hasNext()) {
            }
            arrayList.clear();
            g050Var.d(null);
            return zy11.a;
        } catch (Throwable th) {
            g050Var.d(null);
            throw th;
        }
        routeStatsPrefetchRepositoryImpl$invalidate$1 = new RouteStatsPrefetchRepositoryImpl$invalidate$1(this, continuationImpl);
        Object obj2 = routeStatsPrefetchRepositoryImpl$invalidate$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = routeStatsPrefetchRepositoryImpl$invalidate$1.label;
        if (i2 != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0054 A[Catch: all -> 0x006c, TryCatch #0 {all -> 0x006c, blocks: (B:11:0x004a, B:12:0x004e, B:14:0x0054, B:17:0x0064, B:22:0x006e), top: B:10:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ArrayList arrayList, ContinuationImpl continuationImpl) {
        RouteStatsPrefetchRepositoryImpl$invalidateExcept$1 routeStatsPrefetchRepositoryImpl$invalidateExcept$1;
        int i2;
        g050 g050Var;
        ArrayList arrayList2;
        Iterator it;
        ArrayList arrayList3 = this.g;
        try {
            if (continuationImpl instanceof RouteStatsPrefetchRepositoryImpl$invalidateExcept$1) {
                routeStatsPrefetchRepositoryImpl$invalidateExcept$1 = (RouteStatsPrefetchRepositoryImpl$invalidateExcept$1) continuationImpl;
                int i3 = routeStatsPrefetchRepositoryImpl$invalidateExcept$1.label;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    routeStatsPrefetchRepositoryImpl$invalidateExcept$1.label = i3 - Integer.MIN_VALUE;
                    Object obj = routeStatsPrefetchRepositoryImpl$invalidateExcept$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i2 = routeStatsPrefetchRepositoryImpl$invalidateExcept$1.label;
                    if (i2 != 0) {
                        kotlin.b.b(obj);
                        routeStatsPrefetchRepositoryImpl$invalidateExcept$1.L$0 = arrayList;
                        g050Var = this.f;
                        routeStatsPrefetchRepositoryImpl$invalidateExcept$1.L$1 = g050Var;
                        routeStatsPrefetchRepositoryImpl$invalidateExcept$1.label = 1;
                        arrayList2 = arrayList;
                        if (g050Var.a(routeStatsPrefetchRepositoryImpl$invalidateExcept$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i2 != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        g050Var = (g050) routeStatsPrefetchRepositoryImpl$invalidateExcept$1.L$1;
                        ?? r7 = (List) routeStatsPrefetchRepositoryImpl$invalidateExcept$1.L$0;
                        kotlin.b.b(obj);
                        arrayList2 = r7;
                    }
                    it = arrayList3.iterator();
                    while (it.hasNext()) {
                        pbl0 pbl0Var = (pbl0) it.next();
                        if (!arrayList2.contains(pbl0Var.a())) {
                            pbl0Var.c().a(null);
                        }
                    }
                    arrayList3.removeIf(new sdc(27, new qh2(arrayList2, 12)));
                    g050Var.d(null);
                    return zy11.a;
                }
            }
            it = arrayList3.iterator();
            while (it.hasNext()) {
            }
            arrayList3.removeIf(new sdc(27, new qh2(arrayList2, 12)));
            g050Var.d(null);
            return zy11.a;
        } catch (Throwable th) {
            g050Var.d(null);
            throw th;
        }
        routeStatsPrefetchRepositoryImpl$invalidateExcept$1 = new RouteStatsPrefetchRepositoryImpl$invalidateExcept$1(this, continuationImpl);
        Object obj2 = routeStatsPrefetchRepositoryImpl$invalidateExcept$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = routeStatsPrefetchRepositoryImpl$invalidateExcept$1.label;
        if (i2 != 0) {
        }
    }
}
