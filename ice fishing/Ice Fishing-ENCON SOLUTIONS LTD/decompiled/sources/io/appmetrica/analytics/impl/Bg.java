package io.appmetrica.analytics.impl;

import android.content.Context;

/* loaded from: classes.dex */
public final class Bg implements Ql, Ga {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4216a;

    /* renamed from: b, reason: collision with root package name */
    public final Q4 f4217b;

    /* renamed from: c, reason: collision with root package name */
    public final R4 f4218c;

    /* renamed from: d, reason: collision with root package name */
    public final Am f4219d;

    /* renamed from: e, reason: collision with root package name */
    public final Pa f4220e;

    public Bg(Context context, Q4 q4, C0656p4 c0656p4, Y4 y4, R4 r4, Hl hl) {
        this.f4216a = context;
        this.f4217b = q4;
        this.f4218c = r4;
        Am a2 = hl.a(context, q4, c0656p4.f6720a);
        this.f4219d = a2;
        this.f4220e = y4.a(context, q4, c0656p4.f6721b, a2);
        hl.a(q4, this);
    }

    public final Q4 a() {
        return this.f4217b;
    }

    public final Context b() {
        return this.f4216a;
    }

    public final void a(InterfaceC0397f4 interfaceC0397f4) {
        this.f4218c.f4982a.add(interfaceC0397f4);
    }

    public final void b(InterfaceC0397f4 interfaceC0397f4) {
        this.f4218c.f4982a.remove(interfaceC0397f4);
    }

    @Override // io.appmetrica.analytics.impl.Ql
    public final void a(C0415fm c0415fm) {
        ((X4) this.f4220e).a(c0415fm);
    }

    @Override // io.appmetrica.analytics.impl.Ql
    public final void a(Jl jl, C0415fm c0415fm) {
        ((X4) this.f4220e).getClass();
    }

    @Override // io.appmetrica.analytics.impl.Ga
    public final void a(C0656p4 c0656p4) {
        this.f4219d.a(c0656p4.f6720a);
        this.f4220e.a(c0656p4.f6721b);
    }

    public Bg(Context context, Q4 q4, C0656p4 c0656p4, Y4 y4) {
        this(context, q4, c0656p4, y4, new R4(), Hl.a());
    }

    public final void a(P5 p5, C0656p4 c0656p4) {
        if (!AbstractC0842w9.f7098c.contains(EnumC0301bb.a(p5.f4907d))) {
            this.f4220e.a(c0656p4.f6721b);
        }
        ((X4) this.f4220e).a(p5);
    }
}
