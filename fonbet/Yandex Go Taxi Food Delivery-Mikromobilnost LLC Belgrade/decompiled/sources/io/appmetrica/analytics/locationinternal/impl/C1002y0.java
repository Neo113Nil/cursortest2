package io.appmetrica.analytics.locationinternal.impl;

import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.cache.LocationDataCacheUpdateScheduler;
import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* renamed from: io.appmetrica.analytics.locationinternal.impl.y0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C1002y0 implements J0, LocationControllerObserver, E1 {
    public C0933c a;
    public final A2 b;
    public final n2 c;
    public final C0973o0 d;
    public final IHandlerExecutor e;
    public boolean f;
    public boolean g;
    public final v2 h;

    public C1002y0(ServiceContext serviceContext, A2 a2, n2 n2Var, C0973o0 c0973o0) {
        this.d = c0973o0;
        IHandlerExecutor moduleExecutor = serviceContext.getExecutorProvider().getModuleExecutor();
        this.e = moduleExecutor;
        this.b = a2;
        a2.d().setUpdateScheduler(new LocationDataCacheUpdateScheduler(moduleExecutor, a2, a2.d(), "lbs"));
        this.c = n2Var;
        this.h = new v2(serviceContext.getExecutorProvider().getModuleExecutor(), this, 0);
    }

    @Override // io.appmetrica.analytics.locationinternal.impl.J0
    public final void a(C0933c c0933c) {
        this.e.execute(new RunnableC0999x0(this, c0933c));
    }

    @Override // io.appmetrica.analytics.locationinternal.impl.E1
    public final void b() {
        if (this.g) {
            F0 f0 = new F0();
            f0.d = w2.a((Collection) this.b.e.getData());
            List list = (List) this.c.a.a();
            JSONArray jSONArray = new JSONArray();
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    try {
                        jSONArray.put(AbstractC0979q0.a((C0966m) it.next()));
                    } catch (Throwable unused) {
                    }
                }
            }
            f0.e = jSONArray;
            this.d.e.consume(f0);
        }
    }

    public final void c() {
        C0933c c0933c = this.a;
        boolean z = c0933c != null && c0933c.c.a;
        long j = c0933c == null ? this.h.d : c0933c.c.h;
        boolean z2 = this.f && z;
        if (z2 == this.g) {
            v2 v2Var = this.h;
            if (v2Var.d != j) {
                v2Var.a(j);
                this.h.c();
                return;
            }
            return;
        }
        if (!z2) {
            this.g = false;
            this.h.e();
            return;
        }
        this.g = true;
        v2 v2Var2 = this.h;
        synchronized (v2Var2) {
            v2Var2.d = j;
        }
        this.h.d();
        F0 f0 = new F0();
        f0.d = w2.a((Collection) this.b.e.getData());
        List list = (List) this.c.a.a();
        JSONArray jSONArray = new JSONArray();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                try {
                    jSONArray.put(AbstractC0979q0.a((C0966m) it.next()));
                } catch (Throwable unused) {
                }
            }
        }
        f0.e = jSONArray;
        this.d.e.consume(f0);
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationControllerObserver
    public final void startLocationTracking() {
        this.f = true;
        c();
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationControllerObserver
    public final void stopLocationTracking() {
        this.f = false;
        this.g = false;
        this.h.e();
    }
}
