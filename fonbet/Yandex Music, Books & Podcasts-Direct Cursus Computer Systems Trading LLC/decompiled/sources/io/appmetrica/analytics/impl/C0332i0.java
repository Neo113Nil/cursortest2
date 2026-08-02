package io.appmetrica.analytics.impl;

import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.i0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0332i0 implements Hq {
    public final /* synthetic */ C0360j0 a;

    public C0332i0(C0360j0 c0360j0) {
        this.a = c0360j0;
    }

    @Override // io.appmetrica.analytics.impl.Hq
    @NotNull
    public final Thread a() {
        return this.a.b;
    }

    @Override // io.appmetrica.analytics.impl.Hq
    public final StackTraceElement[] b() {
        C0360j0 c0360j0 = this.a;
        return (StackTraceElement[]) c0360j0.a.get(c0360j0.b);
    }

    @Override // io.appmetrica.analytics.impl.Hq
    @NotNull
    public final Map<Thread, StackTraceElement[]> c() {
        return this.a.a;
    }
}
