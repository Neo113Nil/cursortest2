package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Lh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0437gi f4706a;

    public Lh(C0437gi c0437gi) {
        this.f4706a = c0437gi;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0437gi c0437gi = this.f4706a;
        C0437gi.a(c0437gi.f6082a, c0437gi.f6085d, c0437gi.f6086e).pauseSession();
    }
}
