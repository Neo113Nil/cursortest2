package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.ei, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0385ei implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f5943a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0437gi f5944b;

    public RunnableC0385ei(C0437gi c0437gi, String str) {
        this.f5944b = c0437gi;
        this.f5943a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0437gi c0437gi = this.f5944b;
        C0437gi.a(c0437gi.f6082a, c0437gi.f6085d, c0437gi.f6086e).reportEvent(this.f5943a);
    }
}
