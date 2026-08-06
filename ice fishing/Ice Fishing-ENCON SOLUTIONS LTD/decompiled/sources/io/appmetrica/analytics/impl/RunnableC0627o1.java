package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.o1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0627o1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f6641a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f6642b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0756t1 f6643c;

    public RunnableC0627o1(C0756t1 c0756t1, String str, String str2) {
        this.f6643c = c0756t1;
        this.f6641a = str;
        this.f6642b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0756t1.a(this.f6643c).reportEvent(this.f6641a, this.f6642b);
    }
}
