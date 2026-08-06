package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.ci, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0334ci implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f5751a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f5752b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0437gi f5753c;

    public RunnableC0334ci(C0437gi c0437gi, String str, String str2) {
        this.f5753c = c0437gi;
        this.f5751a = str;
        this.f5752b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0437gi c0437gi = this.f5753c;
        C0437gi.a(c0437gi.f6082a, c0437gi.f6085d, c0437gi.f6086e).putAppEnvironmentValue(this.f5751a, this.f5752b);
    }
}
