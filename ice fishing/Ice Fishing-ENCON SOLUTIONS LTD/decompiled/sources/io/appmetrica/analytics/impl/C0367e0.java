package io.appmetrica.analytics.impl;

import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0367e0 implements Cn {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0393f0 f5858a;

    public C0367e0(C0393f0 c0393f0) {
        this.f5858a = c0393f0;
    }

    @Override // io.appmetrica.analytics.impl.Cn
    public final Thread a() {
        return this.f5858a.f5959b;
    }

    @Override // io.appmetrica.analytics.impl.Cn
    public final StackTraceElement[] b() {
        C0393f0 c0393f0 = this.f5858a;
        return (StackTraceElement[]) c0393f0.f5958a.get(c0393f0.f5959b);
    }

    @Override // io.appmetrica.analytics.impl.Cn
    public final Map<Thread, StackTraceElement[]> c() {
        return this.f5858a.f5958a;
    }
}
