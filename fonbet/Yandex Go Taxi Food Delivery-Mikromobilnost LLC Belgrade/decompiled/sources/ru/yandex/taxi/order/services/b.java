package ru.yandex.taxi.order.services;

import android.content.Intent;
import android.os.Build;
import android.os.SystemClock;
import defpackage.chx;
import defpackage.dhx;
import defpackage.dxq0;
import defpackage.fhx;
import defpackage.g8e;
import defpackage.ghx;
import defpackage.gxq0;
import defpackage.hhx;
import defpackage.hst;
import defpackage.ihx;
import defpackage.jst;
import defpackage.pqb1;
import defpackage.unr0;
import defpackage.v180;
import defpackage.xby;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes9.dex */
public class b {
    public final c a;

    public b(c cVar) {
        this.a = cVar;
    }

    public final chx a(String str) {
        chx chxVar;
        chx a = this.a.a(str);
        if (a != null) {
            return a;
        }
        unr0.C(new Object[]{str}, 1, "Acquire new service for order %s", jst.e);
        c cVar = this.a;
        synchronized (cVar) {
            chxVar = (chx) kotlin.collections.a.Q(cVar.c);
            if (chxVar == null) {
                throw new Exception() { // from class: ru.yandex.taxi.order.services.KeepAliveServicePoolFactory$NoMoreServiceException
                };
            }
            cVar.c.remove(chxVar);
        }
        return chxVar;
    }

    public final ihx b(String str, v180 v180Var) {
        boolean z;
        try {
            chx a = a(str);
            if (a.c.c.contains(a)) {
                xby.l(jst.e, "KEEP_ALIVE_SERVICE:SERVICE_ALREADY_IN_POOL", null, new RuntimeException() { // from class: ru.yandex.taxi.order.services.KeepAliveServicePoolFactory$AccessToReleasedServiceException
                }, "Try to start foreground service " + a.a + " with state " + a.b.e.a.getValue() + " which already in pool", 2);
                return fhx.a;
            }
            e eVar = a.b;
            synchronized (eVar) {
                gxq0 gxq0Var = (gxq0) eVar.d.getValue();
                eVar.a();
                jst.e.o("KeepAliveService", "KeepAliveServiceStateHolder::onStartForeground");
                dxq0 dxq0Var = new dxq0(SystemClock.uptimeMillis(), v180Var);
                r0 r0Var = eVar.d;
                r0Var.getClass();
                r0Var.m(null, dxq0Var);
                eVar.c.offer(dxq0Var);
                if (gxq0Var instanceof dxq0) {
                    z = ((dxq0) gxq0Var).a().equals(v180Var) ? false : true;
                }
            }
            Class cls = a.a;
            if (!z) {
                cls.getClass();
                return dhx.a;
            }
            cls.getClass();
            Intent intent = new Intent(a.c.a, (Class<?>) a.a);
            intent.putExtras(v180Var.b());
            pqb1.d(a.c.a, intent);
            return new hhx(a.a);
        } catch (KeepAliveServicePoolFactory$NoMoreServiceException e) {
            xby.l(jst.e, "KEEP_ALIVE_SERVICE:SERVICE_LIMIT_EXCEED", null, e, g8e.o("Failed to start foreground service for order ", str), 2);
            return ghx.a;
        }
    }

    public void c(String str) {
        jst.e.x(new UnsupportedOperationException(), "Expedited job is not available on API=" + Build.VERSION.SDK_INT);
    }

    public void d(String str) {
        chx a = this.a.a(str);
        if (a != null) {
            hst hstVar = jst.e;
            unr0.C(new Object[]{str}, 1, "release service for order %s", hstVar);
            a.a.getClass();
            hstVar.getClass();
            a.b.f();
        }
    }
}
