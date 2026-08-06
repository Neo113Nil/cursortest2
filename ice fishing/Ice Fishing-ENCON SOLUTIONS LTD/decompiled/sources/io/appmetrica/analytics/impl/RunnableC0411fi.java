package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.fi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0411fi implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f5993a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f5994b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0437gi f5995c;

    public RunnableC0411fi(C0437gi c0437gi, String str, String str2) {
        this.f5995c = c0437gi;
        this.f5993a = str;
        this.f5994b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0437gi c0437gi = this.f5995c;
        C0437gi.a(c0437gi.f6082a, c0437gi.f6085d, c0437gi.f6086e).reportEvent(this.f5993a, this.f5994b);
    }
}
