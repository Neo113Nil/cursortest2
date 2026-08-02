package io.appmetrica.analytics.impl;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: io.appmetrica.analytics.impl.gh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0365gh implements InterfaceC0387ha, InterfaceC0394hh {
    public final I7 a;
    public final AtomicLong b;

    public C0365gh(I7 i7) {
        this.a = i7;
        this.b = new AtomicLong(i7.a());
        i7.a(this);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0387ha
    public final void a() {
        this.b.set(this.a.a());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0387ha
    public final void b(List<Integer> list) {
        this.b.addAndGet(-list.size());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0387ha
    public final void a(List<Integer> list) {
        this.b.addAndGet(list.size());
    }

    public final long b() {
        return this.b.get();
    }
}
