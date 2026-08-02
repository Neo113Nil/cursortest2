package ru.yandex.taxi.orders;

import android.content.Context;
import com.yandex.go.feedback_common.data.model.FeedbackParam;
import com.yandex.go.taxi.order.e0;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.y;
import defpackage.a3y0;
import defpackage.ata0;
import defpackage.bd80;
import defpackage.bpt0;
import defpackage.crq0;
import defpackage.d2z;
import defpackage.evu0;
import defpackage.f20;
import defpackage.fag;
import defpackage.h3y;
import defpackage.hst;
import defpackage.jst;
import defpackage.kjz;
import defpackage.ksq;
import defpackage.ny61;
import defpackage.o58;
import defpackage.ob0;
import defpackage.p2y0;
import defpackage.pz1;
import defpackage.pz40;
import defpackage.qa0;
import defpackage.qv10;
import defpackage.rsq;
import defpackage.rtq;
import defpackage.rvx;
import defpackage.tsa0;
import defpackage.unr0;
import defpackage.usa0;
import defpackage.uw40;
import defpackage.w511;
import defpackage.xc80;
import defpackage.ysg;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.object.DriveState;
import ru.yandex.taxi.object.TaxiOrderFeedbackFlow;

/* loaded from: classes9.dex */
public final class a {
    public final uw40 a;
    public final p2y0 b;
    public final ysg c;
    public final xc80 d;
    public final h3y e;
    public final kjz f;

    public a(uw40 uw40Var, p2y0 p2y0Var, ysg ysgVar, xc80 xc80Var, h3y h3yVar, kjz kjzVar) {
        this.a = uw40Var;
        this.b = p2y0Var;
        this.c = ysgVar;
        this.d = xc80Var;
        this.e = h3yVar;
        this.f = kjzVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0103, code lost:
    
        r2 = ((defpackage.f20) r2).c();
        r0.L$0 = r13;
        r0.L$1 = null;
        r0.L$2 = null;
        r0.L$3 = null;
        r0.L$4 = null;
        r0.L$5 = r12;
        r0.L$6 = null;
        r0.L$7 = null;
        r0.label = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x011f, code lost:
    
        if (c(r2, r0) != r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00fd, code lost:
    
        r2 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d9, code lost:
    
        r2 = (defpackage.rtq) r2;
        r7 = r2.getA();
        r2 = r2.getB();
        r0.L$0 = r13;
        r0.L$1 = null;
        r0.L$2 = null;
        r0.L$3 = null;
        r0.L$4 = null;
        r0.L$5 = r12;
        r0.L$6 = null;
        r0.L$7 = null;
        r0.label = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00f9, code lost:
    
        if (b(r7, r2, r0) != r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00fc, code lost:
    
        r2 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x013a, code lost:
    
        if (d(r12, r0) == r1) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0122 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ata0 ata0Var, ContinuationImpl continuationImpl) {
        LocalCachePendingOrdersHandler$handle$1 localCachePendingOrdersHandler$handle$1;
        int i;
        ata0 ata0Var2;
        Iterator it;
        if (continuationImpl instanceof LocalCachePendingOrdersHandler$handle$1) {
            localCachePendingOrdersHandler$handle$1 = (LocalCachePendingOrdersHandler$handle$1) continuationImpl;
            int i2 = localCachePendingOrdersHandler$handle$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                localCachePendingOrdersHandler$handle$1.label = i2 - Integer.MIN_VALUE;
                Object obj = localCachePendingOrdersHandler$handle$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = localCachePendingOrdersHandler$handle$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    this.a.d(ata0Var.a);
                    Iterable iterable = ata0Var.b;
                    if (iterable == null) {
                        iterable = EmptyList.a;
                    }
                    ArrayList m0 = kotlin.collections.a.m0(iterable, ata0Var.c);
                    HashSet hashSet = new HashSet();
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = m0.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        if (hashSet.add(((tsa0) next).getA())) {
                            arrayList.add(next);
                        }
                    }
                    ata0Var2 = ata0Var;
                    it = arrayList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                        }
                    }
                    return obj2;
                }
                if (i != 1 && i != 2) {
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    kjz kjzVar = this.f;
                    rsq rsqVar = (rsq) ((h3y) kjzVar.c).get();
                    rsqVar.b.c((Context) kjzVar.b);
                    return zy11.a;
                }
                it = (Iterator) localCachePendingOrdersHandler$handle$1.L$5;
                ata0 ata0Var3 = (ata0) localCachePendingOrdersHandler$handle$1.L$0;
                kotlin.b.b(obj);
                ata0Var2 = ata0Var3;
                while (true) {
                    if (it.hasNext()) {
                        tsa0 tsa0Var = (tsa0) it.next();
                        if (evu0.J(tsa0Var.getA())) {
                            jst.e.r("Probably wrong parsing", new IllegalStateException("Can't create order from ask feedback"));
                        } else {
                            if (tsa0Var instanceof rtq) {
                                break;
                            }
                            if (tsa0Var instanceof f20) {
                                break;
                            }
                            if (it.hasNext()) {
                                List list = ata0Var2.d;
                                localCachePendingOrdersHandler$handle$1.L$0 = null;
                                localCachePendingOrdersHandler$handle$1.L$1 = null;
                                localCachePendingOrdersHandler$handle$1.L$2 = null;
                                localCachePendingOrdersHandler$handle$1.L$3 = null;
                                localCachePendingOrdersHandler$handle$1.L$4 = null;
                                localCachePendingOrdersHandler$handle$1.L$5 = null;
                                localCachePendingOrdersHandler$handle$1.L$6 = null;
                                localCachePendingOrdersHandler$handle$1.L$7 = null;
                                localCachePendingOrdersHandler$handle$1.label = 3;
                            }
                        }
                    }
                }
                return obj2;
            }
        }
        localCachePendingOrdersHandler$handle$1 = new LocalCachePendingOrdersHandler$handle$1(this, continuationImpl);
        Object obj3 = localCachePendingOrdersHandler$handle$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = localCachePendingOrdersHandler$handle$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x01f1, code lost:
    
        if (r10.a(r11, r0) == r1) goto L88;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, TaxiOrderFeedbackFlow taxiOrderFeedbackFlow, ContinuationImpl continuationImpl) {
        LocalCachePendingOrdersHandler$handleCompletedOrder$1 localCachePendingOrdersHandler$handleCompletedOrder$1;
        int i;
        boolean G;
        int i2;
        TaxiOrder taxiOrder;
        FeedbackParam feedbackParam;
        pz40 pz40Var;
        Integer num;
        List J0;
        if (continuationImpl instanceof LocalCachePendingOrdersHandler$handleCompletedOrder$1) {
            localCachePendingOrdersHandler$handleCompletedOrder$1 = (LocalCachePendingOrdersHandler$handleCompletedOrder$1) continuationImpl;
            int i3 = localCachePendingOrdersHandler$handleCompletedOrder$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                localCachePendingOrdersHandler$handleCompletedOrder$1.label = i3 - Integer.MIN_VALUE;
                Object obj = localCachePendingOrdersHandler$handleCompletedOrder$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = localCachePendingOrdersHandler$handleCompletedOrder$1.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return zy11.a;
                    }
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = localCachePendingOrdersHandler$handleCompletedOrder$1.I$0;
                    taxiOrder = (TaxiOrder) localCachePendingOrdersHandler$handleCompletedOrder$1.L$2;
                    kotlin.b.b(obj);
                    if (i2 == 0) {
                        y yVar = ((rsq) ((h3y) this.f.c).get()).e;
                        List<String> singletonList = Collections.singletonList(taxiOrder.a);
                        yVar.getClass();
                        for (String str2 : singletonList) {
                            yVar.e.h(str2, "FeedbackHandler");
                            yVar.c(str2);
                        }
                        synchronized (yVar.q) {
                            J0 = kotlin.collections.a.J0(yVar.r.values());
                        }
                        Iterator it = J0.iterator();
                        while (it.hasNext()) {
                            ((e0) ((fag) ((bpt0) it.next())).b()).f();
                        }
                        yVar.t.g(taxiOrder);
                    }
                    return zy11.a;
                }
                kotlin.b.b(obj);
                if (((ysg) ((com.yandex.go.taxi.order.domain.repositories.e0) this.b).a.get()).e(str)) {
                    qv10.C(new Object[]{str}, 1, "Handle completed order, but order is dead - id: %s", jst.e);
                    return zy11.a;
                }
                ysg ysgVar = this.c;
                synchronized (ysgVar) {
                    G = kotlin.collections.a.G(ysgVar.d().b, str);
                }
                rsq rsqVar = (rsq) ((h3y) this.f.c).get();
                rsqVar.getClass();
                boolean z = crq0.a(str) || rsqVar.b.b(str) || !(((feedbackParam = (FeedbackParam) rsqVar.d.e.get(str)) == null || (num = feedbackParam.c) == null || num.intValue() == 0) && ((pz40Var = (pz40) ((com.yandex.go.taxi.order.feedback.domain.b) rsqVar.a).h.get(str)) == null || ((ksq) ((r0) pz40Var).getValue()).i == 0));
                if (G) {
                    qv10.C(new Object[]{str}, 1, "Handle completed order, but NoAskFeedback set - id: %s", jst.e);
                }
                if (z) {
                    qv10.C(new Object[]{str}, 1, "Handle completed order, but already rated - id: %s", jst.e);
                }
                if (G || z) {
                    rsq rsqVar2 = (rsq) ((h3y) this.f.c).get();
                    rsqVar2.f.getClass();
                    a3y0.h(new String[]{"dismissFeedback"});
                    hst hstVar = jst.e;
                    rsqVar2.c.b(str);
                    usa0 usa0Var = (usa0) this.e.get();
                    localCachePendingOrdersHandler$handleCompletedOrder$1.L$0 = null;
                    localCachePendingOrdersHandler$handleCompletedOrder$1.L$1 = null;
                    localCachePendingOrdersHandler$handleCompletedOrder$1.Z$0 = G;
                    localCachePendingOrdersHandler$handleCompletedOrder$1.Z$1 = z;
                    localCachePendingOrdersHandler$handleCompletedOrder$1.label = 1;
                } else {
                    hst hstVar2 = jst.e;
                    unr0.C(new Object[]{str}, 1, "Feedback is available for orderId : %s", hstVar2);
                    TaxiOrder i4 = ((com.yandex.go.taxi.order.domain.repositories.e0) this.b).i(str);
                    if (i4 == null) {
                        unr0.D(new Object[]{str}, 1, "Unknown order : %s", hstVar2, new IllegalStateException("Missing order when handle active orders feedback"));
                        return zy11.a;
                    }
                    ?? r5 = taxiOrderFeedbackFlow != TaxiOrderFeedbackFlow.TRACKING_ONLY ? 0 : 1;
                    synchronized (i4) {
                        i4.l = i4.l.W(r5);
                    }
                    usa0 usa0Var2 = (usa0) this.e.get();
                    localCachePendingOrdersHandler$handleCompletedOrder$1.L$0 = null;
                    localCachePendingOrdersHandler$handleCompletedOrder$1.L$1 = null;
                    localCachePendingOrdersHandler$handleCompletedOrder$1.L$2 = i4;
                    localCachePendingOrdersHandler$handleCompletedOrder$1.Z$0 = G;
                    localCachePendingOrdersHandler$handleCompletedOrder$1.Z$1 = z;
                    localCachePendingOrdersHandler$handleCompletedOrder$1.I$0 = r5;
                    localCachePendingOrdersHandler$handleCompletedOrder$1.label = 2;
                    if (usa0Var2.b(i4, localCachePendingOrdersHandler$handleCompletedOrder$1) != coroutineSingletons) {
                        i2 = r5;
                        taxiOrder = i4;
                        if (i2 == 0) {
                        }
                        return zy11.a;
                    }
                }
                return coroutineSingletons;
            }
        }
        localCachePendingOrdersHandler$handleCompletedOrder$1 = new LocalCachePendingOrdersHandler$handleCompletedOrder$1(this, continuationImpl);
        Object obj2 = localCachePendingOrdersHandler$handleCompletedOrder$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = localCachePendingOrdersHandler$handleCompletedOrder$1.label;
        if (i == 0) {
        }
    }

    public final Object c(rvx rvxVar, ContinuationImpl continuationImpl) {
        zy11 zy11Var = zy11.a;
        DriveState b = rvxVar.getB();
        int[] iArr = d2z.a;
        switch (iArr[b.ordinal()]) {
            case 1:
                return b(rvxVar.getA(), TaxiOrderFeedbackFlow.FORCE_SCREEN, continuationImpl);
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                bd80 bd80Var = (bd80) this.d;
                TaxiOrder c = bd80Var.a.c(rvxVar.getA(), new o58(3, bd80Var, rvxVar), new qa0(15, rvxVar));
                DriveState b2 = c.h.getB();
                int i = iArr[b2.ordinal()];
                if (i != 1) {
                    switch (i) {
                        case 9:
                            jst.e.x(new IllegalStateException("We didn't expect preorder in launch"), "Probably wrong parsing");
                            break;
                    }
                    return e(c, continuationImpl);
                }
                qv10.C(new Object[]{b2}, 1, "Receive order in launch which already in %s state", jst.e);
                return zy11Var;
            case 9:
            case 10:
            case 11:
            case 12:
                DriveState b3 = rvxVar.getB();
                jst.e.r(String.format("Unexpected order status '%s' in active orders response", Arrays.copyOf(new Object[]{b3}, 1)), new IllegalStateException("Unexpected order status"));
                return zy11Var;
            default:
                w511.b();
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(List list, ContinuationImpl continuationImpl) {
        LocalCachePendingOrdersHandler$handleOrdersWithWalkingRoute$1 localCachePendingOrdersHandler$handleOrdersWithWalkingRoute$1;
        int i;
        Iterator it;
        if (continuationImpl instanceof LocalCachePendingOrdersHandler$handleOrdersWithWalkingRoute$1) {
            localCachePendingOrdersHandler$handleOrdersWithWalkingRoute$1 = (LocalCachePendingOrdersHandler$handleOrdersWithWalkingRoute$1) continuationImpl;
            int i2 = localCachePendingOrdersHandler$handleOrdersWithWalkingRoute$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                localCachePendingOrdersHandler$handleOrdersWithWalkingRoute$1.label = i2 - Integer.MIN_VALUE;
                Object obj = localCachePendingOrdersHandler$handleOrdersWithWalkingRoute$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = localCachePendingOrdersHandler$handleOrdersWithWalkingRoute$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    it = list.iterator();
                } else {
                    if (i != 1 && i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    it = (Iterator) localCachePendingOrdersHandler$handleOrdersWithWalkingRoute$1.L$1;
                    kotlin.b.b(obj);
                }
                while (it.hasNext()) {
                    pz1 pz1Var = (pz1) it.next();
                    TaxiOrder i3 = ((com.yandex.go.taxi.order.domain.repositories.e0) this.b).i(pz1Var.getA());
                    if (i3 != null) {
                        if (!i3.l.getY()) {
                            rvx b = pz1Var.b();
                            localCachePendingOrdersHandler$handleOrdersWithWalkingRoute$1.L$0 = null;
                            localCachePendingOrdersHandler$handleOrdersWithWalkingRoute$1.L$1 = it;
                            localCachePendingOrdersHandler$handleOrdersWithWalkingRoute$1.L$2 = null;
                            localCachePendingOrdersHandler$handleOrdersWithWalkingRoute$1.L$3 = null;
                            localCachePendingOrdersHandler$handleOrdersWithWalkingRoute$1.label = 1;
                            if (c(b, localCachePendingOrdersHandler$handleOrdersWithWalkingRoute$1) == obj2) {
                                return obj2;
                            }
                        } else if (i3.l.getA()) {
                            localCachePendingOrdersHandler$handleOrdersWithWalkingRoute$1.L$0 = null;
                            localCachePendingOrdersHandler$handleOrdersWithWalkingRoute$1.L$1 = it;
                            localCachePendingOrdersHandler$handleOrdersWithWalkingRoute$1.L$2 = null;
                            localCachePendingOrdersHandler$handleOrdersWithWalkingRoute$1.L$3 = null;
                            localCachePendingOrdersHandler$handleOrdersWithWalkingRoute$1.label = 2;
                            if (e(i3, localCachePendingOrdersHandler$handleOrdersWithWalkingRoute$1) == obj2) {
                                return obj2;
                            }
                        } else {
                            continue;
                        }
                    }
                }
                return zy11.a;
            }
        }
        localCachePendingOrdersHandler$handleOrdersWithWalkingRoute$1 = new LocalCachePendingOrdersHandler$handleOrdersWithWalkingRoute$1(this, continuationImpl);
        Object obj3 = localCachePendingOrdersHandler$handleOrdersWithWalkingRoute$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = localCachePendingOrdersHandler$handleOrdersWithWalkingRoute$1.label;
        if (i != 0) {
        }
        while (it.hasNext()) {
        }
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(TaxiOrder taxiOrder, ContinuationImpl continuationImpl) {
        LocalCachePendingOrdersHandler$reactivateOrder$1 localCachePendingOrdersHandler$reactivateOrder$1;
        int i;
        usa0 usa0Var;
        if (continuationImpl instanceof LocalCachePendingOrdersHandler$reactivateOrder$1) {
            localCachePendingOrdersHandler$reactivateOrder$1 = (LocalCachePendingOrdersHandler$reactivateOrder$1) continuationImpl;
            int i2 = localCachePendingOrdersHandler$reactivateOrder$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                localCachePendingOrdersHandler$reactivateOrder$1.label = i2 - Integer.MIN_VALUE;
                Object obj = localCachePendingOrdersHandler$reactivateOrder$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = localCachePendingOrdersHandler$reactivateOrder$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    usa0 usa0Var2 = (usa0) this.e.get();
                    ((ysg) ((com.yandex.go.taxi.order.domain.repositories.e0) this.b).a.get()).f(taxiOrder.a, null, new ob0(4, taxiOrder));
                    localCachePendingOrdersHandler$reactivateOrder$1.L$0 = taxiOrder;
                    localCachePendingOrdersHandler$reactivateOrder$1.L$1 = usa0Var2;
                    localCachePendingOrdersHandler$reactivateOrder$1.label = 1;
                    if (usa0Var2.b(taxiOrder, localCachePendingOrdersHandler$reactivateOrder$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    usa0Var = usa0Var2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    usa0Var = (usa0) localCachePendingOrdersHandler$reactivateOrder$1.L$1;
                    taxiOrder = (TaxiOrder) localCachePendingOrdersHandler$reactivateOrder$1.L$0;
                    kotlin.b.b(obj);
                }
                usa0Var.c(taxiOrder.a);
                return zy11.a;
            }
        }
        localCachePendingOrdersHandler$reactivateOrder$1 = new LocalCachePendingOrdersHandler$reactivateOrder$1(this, continuationImpl);
        Object obj2 = localCachePendingOrdersHandler$reactivateOrder$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = localCachePendingOrdersHandler$reactivateOrder$1.label;
        if (i != 0) {
        }
        usa0Var.c(taxiOrder.a);
        return zy11.a;
    }
}
