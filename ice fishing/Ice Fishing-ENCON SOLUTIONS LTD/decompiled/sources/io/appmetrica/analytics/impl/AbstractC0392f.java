package io.appmetrica.analytics.impl;

import android.content.Context;

/* renamed from: io.appmetrica.analytics.impl.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0392f implements InterfaceC0397f4 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f5956a;

    /* renamed from: b, reason: collision with root package name */
    public final Bg f5957b;

    public AbstractC0392f(Context context, Bg bg) {
        this.f5956a = context.getApplicationContext();
        this.f5957b = bg;
        bg.a(this);
        C0610na.k().n().b(this);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0397f4
    public final void a(P5 p5, C0656p4 c0656p4) {
        b(p5, c0656p4);
    }

    public final Bg b() {
        return this.f5957b;
    }

    public abstract void b(P5 p5, C0656p4 c0656p4);

    public final Context c() {
        return this.f5956a;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0397f4
    public final void a() {
        this.f5957b.b(this);
        C0610na.f6575I.m().a(this);
    }
}
