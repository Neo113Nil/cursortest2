package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class P1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0278ae f4895a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0892y7 f4896b;

    public P1(R1 r12, C0892y7 c0892y7) {
        this.f4895a = r12;
        this.f4896b = c0892y7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4895a.consume(this.f4896b);
    }
}
