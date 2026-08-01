package com.google.android.gms.internal.ads;

import S7.AbstractC0406y;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.ads.Mn, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2680Mn {

    /* renamed from: a, reason: collision with root package name */
    public final Px f26332a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f26333b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f26334c = new AtomicBoolean(false);

    public C2680Mn(Px px) {
        this.f26332a = px;
    }

    public final void a(com.bumptech.glide.manager.p pVar) {
        this.f26334c.set(true);
        synchronized (pVar.f23470v) {
            try {
                if (((C4251z8) pVar.f23471w) == null) {
                    pVar.f23471w = new C4251z8();
                }
                C4251z8 c4251z8 = (C4251z8) pVar.f23471w;
                synchronized (c4251z8.f35299v) {
                    c4251z8.f35303z.add(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Px px = this.f26332a;
        px.getClass();
        AbstractC0406y.o(px.f26881a, null, new Jx(px, null), 3);
    }

    public final void b() {
        if (this.f26333b.get()) {
            Px px = this.f26332a;
            px.getClass();
            MA.g(px.f26881a, px.f26882b, new Nx(px, null));
        }
    }

    public final void c() {
        if (this.f26333b.get()) {
            Px px = this.f26332a;
            px.getClass();
            MA.g(px.f26881a, px.f26882b, new C4239yx(px, null));
        }
    }

    public final void d() {
        if (this.f26333b.getAndSet(false)) {
            Px px = this.f26332a;
            px.getClass();
            MA.g(px.f26881a, px.f26882b, new Lx(px, null));
        }
    }
}
