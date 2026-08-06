package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Yh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Qn f5436a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0437gi f5437b;

    public Yh(C0437gi c0437gi, Qn qn) {
        this.f5437b = c0437gi;
        this.f5436a = qn;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0437gi c0437gi = this.f5437b;
        C0437gi.a(c0437gi.f6082a, c0437gi.f6085d, c0437gi.f6086e).a(this.f5436a);
    }
}
