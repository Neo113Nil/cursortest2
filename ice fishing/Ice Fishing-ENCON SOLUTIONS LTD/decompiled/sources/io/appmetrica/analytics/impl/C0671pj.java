package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.pj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0671pj implements Qa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f6751a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Throwable f6752b;

    public C0671pj(String str, Throwable th) {
        this.f6751a = str;
        this.f6752b = th;
    }

    @Override // io.appmetrica.analytics.impl.Qa
    public final void a(Ra ra) {
        ra.reportError(this.f6751a, this.f6752b);
    }
}
