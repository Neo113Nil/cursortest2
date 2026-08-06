package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.di, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0360di implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0437gi f5820a;

    public RunnableC0360di(C0437gi c0437gi) {
        this.f5820a = c0437gi;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0437gi c0437gi = this.f5820a;
        C0437gi.a(c0437gi.f6082a, c0437gi.f6085d, c0437gi.f6086e).clearAppEnvironment();
    }
}
