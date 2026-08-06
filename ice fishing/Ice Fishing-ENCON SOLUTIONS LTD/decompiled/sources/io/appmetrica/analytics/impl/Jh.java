package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Jh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Throwable f4593a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0437gi f4594b;

    public Jh(C0437gi c0437gi, Throwable th) {
        this.f4594b = c0437gi;
        this.f4593a = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0437gi c0437gi = this.f4594b;
        C0437gi.a(c0437gi.f6082a, c0437gi.f6085d, c0437gi.f6086e).reportUnhandledException(this.f4593a);
    }
}
