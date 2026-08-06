package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.qj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0697qj implements Qa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f6786a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f6787b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Throwable f6788c;

    public C0697qj(String str, String str2, Throwable th) {
        this.f6786a = str;
        this.f6787b = str2;
        this.f6788c = th;
    }

    @Override // io.appmetrica.analytics.impl.Qa
    public final void a(Ra ra) {
        ra.reportError(this.f6786a, this.f6787b, this.f6788c);
    }
}
