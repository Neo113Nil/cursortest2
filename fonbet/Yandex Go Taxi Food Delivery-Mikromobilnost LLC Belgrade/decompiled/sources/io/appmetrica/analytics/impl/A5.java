package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;

/* loaded from: classes9.dex */
public abstract class A5 extends AbstractC0440j6 {
    public A5(BaseRequestConfig.ComponentLoader<Object, Object, G6> componentLoader, Bp bp, BaseRequestConfig.BaseRequestArguments<C0439j5, Object> baseRequestArguments) {
        super(componentLoader, bp, baseRequestArguments);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0440j6
    public final void a(Object obj) {
        C0439j5 c0439j5 = (C0439j5) obj;
        synchronized (this) {
            super.a((Object) c0439j5);
        }
    }

    public final synchronized void a(C0439j5 c0439j5) {
        super.a((Object) c0439j5);
    }
}
