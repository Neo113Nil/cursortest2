package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Di implements InterfaceC0293b3 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f4305a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0293b3 f4306b;

    public Di(Object obj, InterfaceC0293b3 interfaceC0293b3) {
        this.f4305a = obj;
        this.f4306b = interfaceC0293b3;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0293b3
    public final int getBytesTruncated() {
        return this.f4306b.getBytesTruncated();
    }

    public final String toString() {
        return "Result{result=" + this.f4305a + ", metaInfo=" + this.f4306b + '}';
    }
}
