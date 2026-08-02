package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.j1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC0435j1 implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ J1 b;

    public RunnableC0435j1(J1 j1, String str) {
        this.b = j1;
        this.a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        F0 f0 = this.b.a;
        String str = this.a;
        f0.getClass();
        E0.c().setUserProfileID(str);
    }
}
