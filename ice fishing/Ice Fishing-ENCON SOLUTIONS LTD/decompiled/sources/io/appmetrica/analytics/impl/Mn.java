package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Mn implements InterfaceC0293b3 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f4785a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0293b3 f4786b;

    public Mn(Object obj, InterfaceC0293b3 interfaceC0293b3) {
        this.f4785a = obj;
        this.f4786b = interfaceC0293b3;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0293b3
    public final int getBytesTruncated() {
        return this.f4786b.getBytesTruncated();
    }

    public final String toString() {
        return "TrimmingResult{value=" + this.f4785a + ", metaInfo=" + this.f4786b + '}';
    }
}
