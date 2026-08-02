package ru.yandex.taxi.logistics.sdk.deliverydashboard.ui;

import defpackage.bvf0;
import defpackage.c5i;
import defpackage.e100;
import defpackage.ehg;
import defpackage.ffx;
import defpackage.h4i;
import defpackage.hhg;
import defpackage.ike;
import defpackage.lw;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.st2;
import defpackage.tje;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes5.dex */
public final class b implements lw {
    public final h4i a;
    public final ru.yandex.taxi.logistics.sdk.dashboard.storage.c b;
    public final e100 c;
    public final c5i d;
    public final ike e;
    public final n0 f = ffx.c(0, 0, null, 7);
    public pzt0 g;

    public b(h4i h4iVar, ru.yandex.taxi.logistics.sdk.dashboard.storage.c cVar, e100 e100Var, st2 st2Var, c5i c5iVar) {
        this.a = h4iVar;
        this.b = cVar;
        this.c = e100Var;
        this.d = c5iVar;
        this.e = bvf0.a(st2Var.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        if (r8.c(r7, r0) == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005e, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005c, code lost:
    
        if (r8.a(r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(b bVar, ehg ehgVar, ContinuationImpl continuationImpl) {
        DeliveryDashboardActionListener$handle$2 deliveryDashboardActionListener$handle$2;
        int i;
        bVar.getClass();
        if (continuationImpl instanceof DeliveryDashboardActionListener$handle$2) {
            deliveryDashboardActionListener$handle$2 = (DeliveryDashboardActionListener$handle$2) continuationImpl;
            int i2 = deliveryDashboardActionListener$handle$2.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deliveryDashboardActionListener$handle$2.label = i2 - Integer.MIN_VALUE;
                Object obj = deliveryDashboardActionListener$handle$2.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deliveryDashboardActionListener$handle$2.label;
                if (i == 0) {
                    if (i == 1) {
                    } else if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                } else {
                    kotlin.b.b(obj);
                    String str = ehgVar.a;
                    ru.yandex.taxi.logistics.sdk.dashboard.storage.c cVar = bVar.b;
                    deliveryDashboardActionListener$handle$2.L$0 = null;
                    deliveryDashboardActionListener$handle$2.L$1 = null;
                    if (str != null) {
                        deliveryDashboardActionListener$handle$2.I$0 = 0;
                        deliveryDashboardActionListener$handle$2.label = 1;
                    } else {
                        deliveryDashboardActionListener$handle$2.label = 2;
                    }
                }
                n0 n0Var = bVar.d.a;
                zy11 zy11Var = zy11.a;
                n0Var.g(zy11Var);
                return zy11Var;
            }
        }
        deliveryDashboardActionListener$handle$2 = new DeliveryDashboardActionListener$handle$2(bVar, continuationImpl);
        Object obj2 = deliveryDashboardActionListener$handle$2.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deliveryDashboardActionListener$handle$2.label;
        if (i == 0) {
        }
        n0 n0Var2 = bVar.d.a;
        zy11 zy11Var2 = zy11.a;
        n0Var2.g(zy11Var2);
        return zy11Var2;
    }

    @Override // defpackage.lw
    public final void a(hhg hhgVar) {
        tje.N(this.e, null, null, new DeliveryDashboardActionListener$onAction$1(hhgVar, null, this), 3);
    }

    @Override // defpackage.lw
    public final void start() {
        pzt0 pzt0Var = this.g;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.g = tje.N(this.e, null, null, new DeliveryDashboardActionListener$start$1(this, null), 3);
    }

    @Override // defpackage.lw
    public final void stop() {
        bvf0.j(this.e, null);
    }
}
