package ru.yandex.taxi.order;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.ahx;
import defpackage.b64;
import defpackage.dhx;
import defpackage.ehx;
import defpackage.hhx;
import defpackage.hst;
import defpackage.ihx;
import defpackage.jst;
import defpackage.ny61;
import defpackage.r180;
import defpackage.tgx;
import defpackage.tse;
import defpackage.v180;
import defpackage.w180;
import defpackage.wly0;
import defpackage.xby;
import defpackage.xk60;
import defpackage.y180;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes9.dex */
public final class k {
    public final tse a;
    public final y180 b;
    public final tgx c;
    public final ahx d;
    public final ru.yandex.taxi.order.services.a e;

    public k(tse tseVar, y180 y180Var, tgx tgxVar, ahx ahxVar, ru.yandex.taxi.order.services.a aVar) {
        this.a = tseVar;
        this.b = y180Var;
        this.c = tgxVar;
        this.d = ahxVar;
        this.e = aVar;
    }

    public final boolean a(TaxiOrder taxiOrder, boolean z, long j) {
        int i = r180.a[taxiOrder.h.getB().ordinal()];
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            return c(taxiOrder, z, j);
        }
        return false;
    }

    public final void b(TaxiOrder taxiOrder) {
        com.yandex.go.coroutines.b.g(this.a, null, null, new OrderMonitorController$ensureService$1(this, taxiOrder, null), 3);
    }

    public final boolean c(TaxiOrder taxiOrder, boolean z, long j) {
        ihx wly0Var;
        dhx dhxVar = dhx.a;
        ahx ahxVar = this.d;
        ahxVar.getClass();
        String str = taxiOrder.a;
        String p = taxiOrder.p();
        hst hstVar = jst.e;
        taxiOrder.h.getClass();
        hstVar.getClass();
        w180 k = ahxVar.a.k(taxiOrder, z, j);
        y180 y180Var = ahxVar.a;
        if (k instanceof v180) {
            try {
                ihx b = ahxVar.c.b(str, (v180) k);
                if (!b.equals(dhxVar) && !(b instanceof hhx)) {
                    int a = k.a();
                    xk60 xk60Var = y180Var.a.c;
                    xk60Var.getClass();
                    new Throwable();
                    hstVar.getClass();
                    xk60Var.i.c(a);
                }
                wly0Var = b;
            } catch (Exception e) {
                hst hstVar2 = jst.e;
                xby.l(hstVar2, "KEEP_ALIVE_SERVICE:FAILED_TO_START_FOREGROUND_SERVICE", null, e, b64.l("Exception while trying start service for order with id ", str, " and group id ", p), 2);
                int a2 = k.a();
                xk60 xk60Var2 = y180Var.a.c;
                xk60Var2.getClass();
                new Throwable();
                hstVar2.getClass();
                xk60Var2.i.c(a2);
                wly0Var = new wly0();
            }
        } else {
            xby.l(hstVar, "KEEP_ALIVE_SERVICE:CANT_START_FOREGROUND_WITHOUT_VALID_NOTIFICATION", null, new IllegalArgumentException(), "Invalid notification passed to startForeground", 2);
            wly0Var = ehx.a;
        }
        if (!(wly0Var instanceof hhx)) {
            return wly0Var.equals(dhxVar);
        }
        com.yandex.go.coroutines.b.g(this.a, null, null, new OrderMonitorController$reportStartForegroundIfNeeded$1(this, (hhx) wly0Var, null), 3);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(TaxiOrder taxiOrder, long j, ContinuationImpl continuationImpl) {
        OrderMonitorController$forceForegroundByPush$1 orderMonitorController$forceForegroundByPush$1;
        int i;
        if (continuationImpl instanceof OrderMonitorController$forceForegroundByPush$1) {
            orderMonitorController$forceForegroundByPush$1 = (OrderMonitorController$forceForegroundByPush$1) continuationImpl;
            int i2 = orderMonitorController$forceForegroundByPush$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                orderMonitorController$forceForegroundByPush$1.label = i2 - Integer.MIN_VALUE;
                Object obj = orderMonitorController$forceForegroundByPush$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderMonitorController$forceForegroundByPush$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    orderMonitorController$forceForegroundByPush$1.L$0 = taxiOrder;
                    orderMonitorController$forceForegroundByPush$1.J$0 = j;
                    orderMonitorController$forceForegroundByPush$1.label = 1;
                    obj = this.e.c(orderMonitorController$forceForegroundByPush$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j = orderMonitorController$forceForegroundByPush$1.J$0;
                    taxiOrder = (TaxiOrder) orderMonitorController$forceForegroundByPush$1.L$0;
                    kotlin.b.b(obj);
                }
                return ((Boolean) obj).booleanValue() ? Boolean.FALSE : Boolean.valueOf(c(taxiOrder, true, j));
            }
        }
        orderMonitorController$forceForegroundByPush$1 = new OrderMonitorController$forceForegroundByPush$1(this, continuationImpl);
        Object obj2 = orderMonitorController$forceForegroundByPush$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderMonitorController$forceForegroundByPush$1.label;
        if (i != 0) {
        }
        if (((Boolean) obj2).booleanValue()) {
        }
    }

    public final void e() {
        com.yandex.go.coroutines.b.g(this.a, null, null, new OrderMonitorController$stopForeground$1(this, null), 3);
    }
}
