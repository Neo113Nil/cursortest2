package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.NetworkServiceLocator;
import io.appmetrica.analytics.networktasks.internal.NetworkTask;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: io.appmetrica.analytics.impl.ln, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0571ln implements InterfaceC0568lk, InterfaceC0816v9 {

    /* renamed from: a, reason: collision with root package name */
    public final Ea f6466a;

    /* renamed from: b, reason: collision with root package name */
    public final Kl f6467b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f6468c = new AtomicBoolean(false);

    public C0571ln(Ea ea, Kl kl) {
        this.f6466a = ea;
        this.f6467b = kl;
        Objects.toString(ea.b());
    }

    public void a() {
    }

    public final void b() {
        if (this.f6468c.get()) {
            return;
        }
        g();
    }

    public final void c() {
        if (this.f6468c.get()) {
            return;
        }
        f();
        a();
    }

    public final Ea d() {
        return this.f6466a;
    }

    public final boolean e() {
        return this.f6468c.get();
    }

    public void f() {
        this.f6467b.a();
    }

    public void g() {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0568lk
    public final void onCreate() {
        this.f6468c.compareAndSet(true, false);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0568lk
    public final void onDestroy() {
        if (this.f6468c.compareAndSet(false, true)) {
            a();
        }
    }

    public final void a(NetworkTask networkTask) {
        C0610na.f6575I.getClass();
        NetworkServiceLocator.getInstance().getNetworkCore().startTask(networkTask);
    }
}
