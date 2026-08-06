package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Hh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f4476a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Throwable f4477b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0437gi f4478c;

    public Hh(C0437gi c0437gi, String str, Throwable th) {
        this.f4478c = c0437gi;
        this.f4476a = str;
        this.f4477b = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0437gi c0437gi = this.f4478c;
        C0437gi.a(c0437gi.f6082a, c0437gi.f6085d, c0437gi.f6086e).reportError(this.f4476a, this.f4477b);
    }
}
