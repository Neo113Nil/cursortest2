package com.google.android.gms.internal.ads;

import O7.AbstractC0399y;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.ads.On, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2713On {

    /* renamed from: a, reason: collision with root package name */
    public final Qx f26761a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f26762b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f26763c = new AtomicBoolean(false);

    public C2713On(Qx qx) {
        this.f26761a = qx;
    }

    public final void a(com.bumptech.glide.manager.o oVar) {
        this.f26763c.set(true);
        synchronized (oVar.f23624v) {
            try {
                if (((C4102w8) oVar.f23625w) == null) {
                    oVar.f23625w = new C4102w8();
                }
                C4102w8 c4102w8 = (C4102w8) oVar.f23625w;
                synchronized (c4102w8.f34948v) {
                    c4102w8.f34952z.add(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Qx qx = this.f26761a;
        qx.getClass();
        AbstractC0399y.o(qx.f27277a, null, new Kx(qx, null), 3);
    }

    public final void b() {
        if (this.f26762b.get()) {
            Qx qx = this.f26761a;
            qx.getClass();
            PA.k(qx.f27277a, qx.f27278b, new Ox(qx, null));
        }
    }

    public final void c() {
        if (this.f26762b.get()) {
            Qx qx = this.f26761a;
            qx.getClass();
            PA.k(qx.f27277a, qx.f27278b, new C4306zx(qx, null));
        }
    }

    public final void d() {
        if (this.f26762b.getAndSet(false)) {
            Qx qx = this.f26761a;
            qx.getClass();
            PA.k(qx.f27277a, qx.f27278b, new Mx(qx, null));
        }
    }
}
