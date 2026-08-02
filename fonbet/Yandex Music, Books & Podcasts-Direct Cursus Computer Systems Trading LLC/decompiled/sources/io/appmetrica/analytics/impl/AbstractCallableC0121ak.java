package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import io.appmetrica.analytics.internal.IAppMetricaService;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.ak, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractCallableC0121ak implements Callable {

    @NotNull
    public static final Zj d = new Zj();
    public final C0649t0 a;
    public final InterfaceC0183co b;
    public boolean c;

    public AbstractCallableC0121ak(C0649t0 c0649t0, InterfaceC0183co interfaceC0183co) {
        this.a = c0649t0;
        this.b = interfaceC0183co;
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
                C0649t0 c0649t0 = this.a;
                synchronized (c0649t0) {
                    iAppMetricaService = c0649t0.d;
                }
                if (iAppMetricaService != null) {
                    try {
                        a(iAppMetricaService);
                        InterfaceC0183co interfaceC0183co = this.b;
                        if (interfaceC0183co != null && !((Lk) interfaceC0183co).a()) {
                            return;
                        }
                        this.a.c();
                        return;
                    } catch (RemoteException unused) {
                    }
                }
                i++;
                if (!c() || C0823z2.e.get()) {
                    return;
                }
            } while (i < 3);
        } catch (Throwable th) {
            a(th);
        }
    }

    public abstract void a(IAppMetricaService iAppMetricaService);

    @NotNull
    public final C0649t0 b() {
        return this.a;
    }

    public boolean c() {
        C0649t0 c0649t0 = this.a;
        synchronized (c0649t0) {
            try {
                if (c0649t0.d == null) {
                    c0649t0.e = new CountDownLatch(1);
                    C0449m2 c0449m2 = c0649t0.h;
                    Context context = c0649t0.a;
                    c0449m2.getClass();
                    Intent a = C0449m2.a(context);
                    try {
                        c0649t0.g.b(c0649t0.a);
                        c0649t0.a.bindService(a, c0649t0.j, 1);
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
        return Unit.a;
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
