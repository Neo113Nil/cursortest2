package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.m1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC0522m1 implements Runnable {
    public final /* synthetic */ J1 a;

    public RunnableC0522m1(J1 j1) {
        this.a = j1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        J1.a(this.a).sendEventsBuffer();
    }
}
