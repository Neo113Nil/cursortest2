package io.appmetrica.analytics.impl;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: io.appmetrica.analytics.impl.te, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0769te implements S8, InterfaceC0795ue {

    /* renamed from: a, reason: collision with root package name */
    public final L6 f6947a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicLong f6948b;

    public C0769te(L6 l6) {
        this.f6947a = l6;
        this.f6948b = new AtomicLong(l6.a());
        l6.a(this);
    }

    @Override // io.appmetrica.analytics.impl.S8
    public final void a(List<Integer> list) {
        this.f6948b.addAndGet(list.size());
    }

    @Override // io.appmetrica.analytics.impl.S8
    public final void b(List<Integer> list) {
        this.f6948b.addAndGet(-list.size());
    }

    @Override // io.appmetrica.analytics.impl.S8
    public final void a() {
        this.f6948b.set(this.f6947a.a());
    }

    public final long b() {
        return this.f6948b.get();
    }
}
