package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ExternalAttribution;

/* renamed from: io.appmetrica.analytics.impl.k1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0523k1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ExternalAttribution f6335a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0756t1 f6336b;

    public RunnableC0523k1(C0756t1 c0756t1, ExternalAttribution externalAttribution) {
        this.f6336b = c0756t1;
        this.f6335a = externalAttribution;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0756t1.a(this.f6336b).a(this.f6335a);
    }
}
