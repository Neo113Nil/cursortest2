package com.google.android.gms.internal.ads;

import S7.AbstractC0410y;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.ads.Nn, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2717Nn {

    /* renamed from: a, reason: collision with root package name */
    public final Px f27314a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f27315b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f27316c = new AtomicBoolean(false);

    public C2717Nn(Px px) {
        this.f27314a = px;
    }

    public final void a(com.bumptech.glide.manager.o oVar) {
        this.f27316c.set(true);
        synchronized (oVar.f24255v) {
            try {
                if (((C4274z8) oVar.f24256w) == null) {
                    oVar.f24256w = new C4274z8();
                }
                C4274z8 c4274z8 = (C4274z8) oVar.f24256w;
                synchronized (c4274z8.f36083v) {
                    c4274z8.f36087z.add(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Px px = this.f27314a;
        px.getClass();
        AbstractC0410y.o(px.f27668a, null, new Jx(px, null), 3);
    }

    public final void b() {
        if (this.f27315b.get()) {
            Px px = this.f27314a;
            px.getClass();
            MA.g(px.f27668a, px.f27669b, new Nx(px, null));
        }
    }

    public final void c() {
        if (this.f27315b.get()) {
            Px px = this.f27314a;
            px.getClass();
            MA.g(px.f27668a, px.f27669b, new C4262yx(px, null));
        }
    }

    public final void d() {
        if (this.f27315b.getAndSet(false)) {
            Px px = this.f27314a;
            px.getClass();
            MA.g(px.f27668a, px.f27669b, new Lx(px, null));
        }
    }
}
