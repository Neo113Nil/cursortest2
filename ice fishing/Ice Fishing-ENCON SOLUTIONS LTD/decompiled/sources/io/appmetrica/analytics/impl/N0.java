package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class N0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f4790a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0756t1 f4791b;

    public N0(C0756t1 c0756t1, String str) {
        this.f4791b = c0756t1;
        this.f4790a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4791b.d().f6278b.a(this.f4790a, false);
    }
}
