package io.appmetrica.analytics.networktasks.internal;

/* loaded from: classes.dex */
public final class FinalConfigProvider<T> implements ConfigProvider<T> {

    /* renamed from: a, reason: collision with root package name */
    private final Object f7484a;

    public FinalConfigProvider(T t) {
        this.f7484a = t;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ConfigProvider
    public T getConfig() {
        return (T) this.f7484a;
    }
}
