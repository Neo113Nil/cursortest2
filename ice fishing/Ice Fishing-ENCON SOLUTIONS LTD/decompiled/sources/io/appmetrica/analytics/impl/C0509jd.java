package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.jd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0509jd extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0613nd f6279a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6280b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f6281c;

    public C0509jd(C0613nd c0613nd, int i2, String str) {
        this.f6279a = c0613nd;
        this.f6280b = i2;
        this.f6281c = str;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C0613nd.a(this.f6279a).a(new F9(this.f6280b, this.f6281c));
    }
}
