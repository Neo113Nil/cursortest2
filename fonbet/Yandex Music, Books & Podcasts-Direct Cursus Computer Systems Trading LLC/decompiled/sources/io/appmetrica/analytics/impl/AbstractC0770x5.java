package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;

/* renamed from: io.appmetrica.analytics.impl.x5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC0770x5 extends AbstractC0280g6 {
    public AbstractC0770x5(@NonNull BaseRequestConfig.ComponentLoader<Object, Object, D6> componentLoader, @NonNull C0385jp c0385jp, @NonNull BaseRequestConfig.BaseRequestArguments<C0250f5, Object> baseRequestArguments) {
        super(componentLoader, c0385jp, baseRequestArguments);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0280g6
    public final void a(@NonNull Object obj) {
        C0250f5 c0250f5 = (C0250f5) obj;
        synchronized (this) {
            super.a((Object) c0250f5);
        }
    }

    public final synchronized void a(@NonNull C0250f5 c0250f5) {
        super.a((Object) c0250f5);
    }
}
