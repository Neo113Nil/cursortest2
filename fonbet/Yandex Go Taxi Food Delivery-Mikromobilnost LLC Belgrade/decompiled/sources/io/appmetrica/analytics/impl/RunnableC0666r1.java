package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.r1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC0666r1 implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ J1 c;

    public RunnableC0666r1(J1 j1, String str, String str2) {
        this.c = j1;
        this.a = str;
        this.b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        F0 f0 = this.c.a;
        String str = this.a;
        String str2 = this.b;
        f0.getClass();
        E0.c().a(str, str2);
    }
}
