package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Mh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f4765a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0437gi f4766b;

    public Mh(C0437gi c0437gi, String str) {
        this.f4766b = c0437gi;
        this.f4765a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0437gi c0437gi = this.f4766b;
        C0437gi.a(c0437gi.f6082a, c0437gi.f6085d, c0437gi.f6086e).setUserProfileID(this.f4765a);
    }
}
