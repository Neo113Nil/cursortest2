package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.bi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0308bi implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0437gi f5677a;

    public RunnableC0308bi(C0437gi c0437gi) {
        this.f5677a = c0437gi;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0437gi c0437gi = this.f5677a;
        C0437gi.a(c0437gi.f6082a, c0437gi.f6085d, c0437gi.f6086e).sendEventsBuffer();
    }
}
