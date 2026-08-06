package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AnrListener;

/* renamed from: io.appmetrica.analytics.impl.j1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0497j1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AnrListener f6238a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0756t1 f6239b;

    public RunnableC0497j1(C0756t1 c0756t1, AnrListener anrListener) {
        this.f6239b = c0756t1;
        this.f6238a = anrListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0756t1.a(this.f6239b).a(this.f6238a);
    }
}
