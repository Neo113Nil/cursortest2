package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Kh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0437gi f4639a;

    public Kh(C0437gi c0437gi) {
        this.f4639a = c0437gi;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0437gi c0437gi = this.f4639a;
        C0437gi.a(c0437gi.f6082a, c0437gi.f6085d, c0437gi.f6086e).resumeSession();
    }
}
