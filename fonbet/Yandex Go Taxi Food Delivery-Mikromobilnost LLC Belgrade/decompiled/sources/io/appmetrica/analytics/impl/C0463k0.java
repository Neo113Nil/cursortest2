package io.appmetrica.analytics.impl;

import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.k0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0463k0 implements InterfaceC0202ar {
    public final /* synthetic */ C0492l0 a;

    public C0463k0(C0492l0 c0492l0) {
        this.a = c0492l0;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0202ar
    public final Thread a() {
        return this.a.b;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0202ar
    public final StackTraceElement[] b() {
        C0492l0 c0492l0 = this.a;
        return (StackTraceElement[]) c0492l0.a.get(c0492l0.b);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0202ar
    public final Map<Thread, StackTraceElement[]> c() {
        return this.a.a;
    }
}
