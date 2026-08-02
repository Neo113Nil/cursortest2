package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import io.appmetrica.analytics.networktasks.internal.ConfigProvider;

/* loaded from: classes9.dex */
public final class O8 implements InterfaceC0302ec, ConfigProvider, InterfaceC0360gc {
    public final Context a;
    public final K5 b;
    public final V8 c;
    public final P8 d;
    public final CounterConfigurationReporterType e;

    public O8(Context context, K5 k5, C0439j5 c0439j5, Bp bp, Q5 q5, CounterConfigurationReporterType counterConfigurationReporterType) {
        this(context, k5, c0439j5, bp, q5, counterConfigurationReporterType, new C0545mo(), new N8(), new M8(), Jb.k().D().a(k5));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0562nc, io.appmetrica.analytics.impl.InterfaceC0517lp
    public final synchronized void a(Bp bp) {
        this.d.a(bp);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0302ec
    public final void b() {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0302ec
    public final CounterConfigurationReporterType c() {
        return this.e;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0360gc
    public final void d() {
    }

    public final U8 e() {
        return (U8) this.d.a();
    }

    public final P8 f() {
        return this.d;
    }

    public final V8 g() {
        return this.c;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ConfigProvider
    public final Object getConfig() {
        return (U8) this.d.a();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0302ec
    public final Context getContext() {
        return this.a;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0302ec
    public final K5 a() {
        return this.b;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0302ec, io.appmetrica.analytics.impl.InterfaceC0360gc, io.appmetrica.analytics.impl.InterfaceC0562nc
    public final void a(C0439j5 c0439j5) {
        this.d.a(c0439j5);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0360gc, io.appmetrica.analytics.impl.InterfaceC0562nc
    public final void a(K6 k6) {
        this.c.a(k6);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0562nc, io.appmetrica.analytics.impl.InterfaceC0517lp
    public final void a(EnumC0315ep enumC0315ep, Bp bp) {
    }

    public O8(Context context, K5 k5, C0439j5 c0439j5, Bp bp, Q5 q5, CounterConfigurationReporterType counterConfigurationReporterType, C0545mo c0545mo, N8 n8, M8 m8, as asVar) {
        this.a = context;
        this.b = k5;
        this.e = counterConfigurationReporterType;
        this.c = n8.a(this, q5, c0545mo, asVar);
        synchronized (this) {
            S8 s8 = new S8(c0439j5);
            m8.getClass();
            this.d = M8.a(context, k5, bp, s8);
        }
    }
}
