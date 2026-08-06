package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.rj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0722rj implements Qa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Throwable f6844a;

    public C0722rj(Throwable th) {
        this.f6844a = th;
    }

    @Override // io.appmetrica.analytics.impl.Qa
    public final void a(Ra ra) {
        ra.reportUnhandledException(this.f6844a);
    }
}
