package com.facebook.ads.internal.dynamicloading;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public Method f24310a;

    /* renamed from: b, reason: collision with root package name */
    public final A8.a f24311b = new A8.a(1, this);

    public final Object a(Class cls) {
        return cls.cast(Proxy.newProxyInstance(DynamicLoaderFallback.class.getClassLoader(), new Class[]{cls}, this.f24311b));
    }
}
