package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.ld, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0561ld extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0613nd f6445a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f6446b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ byte[] f6447c;

    public C0561ld(C0613nd c0613nd, String str, byte[] bArr) {
        this.f6445a = c0613nd;
        this.f6446b = str;
        this.f6447c = bArr;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C0613nd.a(this.f6445a).setSessionExtra(this.f6446b, this.f6447c);
    }
}
