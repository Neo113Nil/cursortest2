package io.appmetrica.analytics.impl;

import android.content.Intent;
import android.os.RemoteException;
import h1.C0239i;
import io.appmetrica.analytics.internal.IAppMetricaService;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;

/* renamed from: io.appmetrica.analytics.impl.xh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractCallableC0876xh implements Callable {

    /* renamed from: d, reason: collision with root package name */
    public static final C0850wh f7205d = new C0850wh();

    /* renamed from: a, reason: collision with root package name */
    public final C0652p0 f7206a;

    /* renamed from: b, reason: collision with root package name */
    public final Zk f7207b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f7208c;

    public AbstractCallableC0876xh(C0652p0 c0652p0, Zk zk) {
        this.f7206a = c0652p0;
        this.f7207b = zk;
    }

    public abstract void a(IAppMetricaService iAppMetricaService);

    public void a(Throwable th) {
    }

    public final C0652p0 b() {
        return this.f7206a;
    }

    public boolean c() {
        C0652p0 c0652p0 = this.f7206a;
        synchronized (c0652p0) {
            try {
                if (c0652p0.f6705d == null) {
                    c0652p0.f6706e = new CountDownLatch(1);
                    Intent a2 = c0652p0.f6709h.a(c0652p0.f6702a);
                    try {
                        c0652p0.f6708g.b(c0652p0.f6702a);
                        c0652p0.f6702a.bindService(a2, c0652p0.f6711j, 1);
                    } catch (Throwable unused) {
                    }
                }
            } finally {
            }
        }
        this.f7206a.a(5000L);
        return true;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        a();
        return C0239i.f3393a;
    }

    public final boolean d() {
        return this.f7208c;
    }

    public final void a(boolean z2) {
        this.f7208c = z2;
    }

    public void a() {
        IAppMetricaService iAppMetricaService;
        try {
            if (this.f7208c) {
                return;
            }
            this.f7208c = true;
            int i2 = 0;
            do {
                C0652p0 c0652p0 = this.f7206a;
                synchronized (c0652p0) {
                    iAppMetricaService = c0652p0.f6705d;
                }
                if (iAppMetricaService != null) {
                    try {
                        a(iAppMetricaService);
                        Zk zk = this.f7207b;
                        if (zk != null && !((C0488ii) zk).a()) {
                            return;
                        }
                        this.f7206a.c();
                        return;
                    } catch (RemoteException unused) {
                    }
                }
                i2++;
                if (!c() || O1.f4844e.get()) {
                    return;
                }
            } while (i2 < 3);
        } catch (Throwable th) {
            a(th);
        }
    }
}
