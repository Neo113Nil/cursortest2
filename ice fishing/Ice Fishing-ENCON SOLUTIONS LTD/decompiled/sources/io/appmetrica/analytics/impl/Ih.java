package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Ih implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f4545a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f4546b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Throwable f4547c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0437gi f4548d;

    public Ih(C0437gi c0437gi, String str, String str2, Throwable th) {
        this.f4548d = c0437gi;
        this.f4545a = str;
        this.f4546b = str2;
        this.f4547c = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0437gi c0437gi = this.f4548d;
        C0437gi.a(c0437gi.f6082a, c0437gi.f6085d, c0437gi.f6086e).reportError(this.f4545a, this.f4546b, this.f4547c);
    }
}
