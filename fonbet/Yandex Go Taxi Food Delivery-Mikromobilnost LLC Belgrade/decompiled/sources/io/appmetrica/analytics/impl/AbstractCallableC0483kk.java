package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import defpackage.zy11;
import io.appmetrica.analytics.internal.IAppMetricaService;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;

/* renamed from: io.appmetrica.analytics.impl.kk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractCallableC0483kk implements Callable {
    public static final C0454jk d = new C0454jk();
    public final C0781v0 a;
    public final InterfaceC0863xo b;
    public boolean c;

    public AbstractCallableC0483kk(C0781v0 c0781v0, InterfaceC0863xo interfaceC0863xo) {
        this.a = c0781v0;
        this.b = interfaceC0863xo;
    }

    public void a() {
        IAppMetricaService iAppMetricaService;
        try {
            if (this.c) {
                return;
            }
            this.c = true;
            int i = 0;
            do {
                C0781v0 c0781v0 = this.a;
                synchronized (c0781v0) {
                    iAppMetricaService = c0781v0.d;
                }
                if (iAppMetricaService != null) {
                    try {
                        a(iAppMetricaService);
                        InterfaceC0863xo interfaceC0863xo = this.b;
                        if (interfaceC0863xo != null && !((Vk) interfaceC0863xo).a()) {
                            return;
                        }
                        this.a.c();
                        return;
                    } catch (RemoteException unused) {
                    }
                }
                i++;
                if (!c() || C0899z2.e.get()) {
                    return;
                }
            } while (i < 3);
        } catch (Throwable th) {
            a(th);
        }
    }

    public abstract void a(IAppMetricaService iAppMetricaService);

    public final C0781v0 b() {
        return this.a;
    }

    public boolean c() {
        C0781v0 c0781v0 = this.a;
        synchronized (c0781v0) {
            try {
                if (c0781v0.d == null) {
                    c0781v0.e = new CountDownLatch(1);
                    C0523m2 c0523m2 = c0781v0.h;
                    Context context = c0781v0.a;
                    c0523m2.getClass();
                    Intent a = C0523m2.a(context);
                    try {
                        c0781v0.g.b(c0781v0.a);
                        c0781v0.a.bindService(a, c0781v0.j, 1);
                    } catch (Throwable unused) {
                    }
                }
            } finally {
            }
        }
        this.a.a(5000L);
        return true;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        a();
        return zy11.a;
    }

    public final boolean d() {
        return this.c;
    }

    public void a(Throwable th) {
    }

    public final void a(boolean z) {
        this.c = z;
    }
}
