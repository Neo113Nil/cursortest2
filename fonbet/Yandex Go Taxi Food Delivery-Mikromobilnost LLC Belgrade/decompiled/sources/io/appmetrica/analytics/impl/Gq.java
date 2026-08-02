package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.NetworkServiceLocator;
import io.appmetrica.analytics.networktasks.internal.NetworkTask;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes9.dex */
public class Gq implements Dn, Ka {
    public final InterfaceC0302ec a;
    public final InterfaceC0344fp b;
    public final AtomicBoolean c = new AtomicBoolean(false);

    public Gq(InterfaceC0302ec interfaceC0302ec, InterfaceC0344fp interfaceC0344fp) {
        this.a = interfaceC0302ec;
        this.b = interfaceC0344fp;
        Objects.toString(interfaceC0302ec.a());
    }

    public final void a(NetworkTask networkTask) {
        Jb.I.getClass();
        NetworkServiceLocator.getInstance().getNetworkCore().startTask(networkTask);
    }

    public final void b() {
        if (this.c.get()) {
            return;
        }
        g();
    }

    public final void c() {
        if (this.c.get()) {
            return;
        }
        f();
        a();
    }

    public final InterfaceC0302ec d() {
        return this.a;
    }

    public final boolean e() {
        return this.c.get();
    }

    public void f() {
        this.b.a();
    }

    public void g() {
    }

    @Override // io.appmetrica.analytics.impl.Dn
    public final void onCreate() {
        this.c.compareAndSet(true, false);
    }

    @Override // io.appmetrica.analytics.impl.Dn
    public final void onDestroy() {
        if (this.c.compareAndSet(false, true)) {
            a();
        }
    }

    public void a() {
    }
}
