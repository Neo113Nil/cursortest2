package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Sh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f5061a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0437gi f5062b;

    public Sh(C0437gi c0437gi, boolean z2) {
        this.f5062b = c0437gi;
        this.f5061a = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0437gi c0437gi = this.f5062b;
        C0437gi.a(c0437gi.f6082a, c0437gi.f6085d, c0437gi.f6086e).setDataSendingEnabled(this.f5061a);
    }
}
