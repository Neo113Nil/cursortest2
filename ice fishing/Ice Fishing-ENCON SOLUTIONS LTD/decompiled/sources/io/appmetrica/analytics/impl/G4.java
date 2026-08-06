package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;

/* loaded from: classes.dex */
public abstract class G4 extends AbstractC0631o5 {
    public G4(BaseRequestConfig.ComponentLoader<Object, Object, L5> componentLoader, C0415fm c0415fm, BaseRequestConfig.BaseRequestArguments<C0630o4, Object> baseRequestArguments) {
        super(componentLoader, c0415fm, baseRequestArguments);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0631o5
    public final void a(Object obj) {
        C0630o4 c0630o4 = (C0630o4) obj;
        synchronized (this) {
            super.a((Object) c0630o4);
        }
    }

    public final synchronized void a(C0630o4 c0630o4) {
        super.a((Object) c0630o4);
    }
}
