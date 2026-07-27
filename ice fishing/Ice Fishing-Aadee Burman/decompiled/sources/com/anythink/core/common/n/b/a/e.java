package com.anythink.core.common.n.b.a;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15108a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f15109b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f15110c;

    public /* synthetic */ e(int i, String str, boolean z3) {
        this.f15108a = i;
        this.f15109b = str;
        this.f15110c = z3;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread a9;
        switch (this.f15108a) {
            case 0:
                a9 = c.a(this.f15109b, this.f15110c, runnable);
                return a9;
            default:
                Thread thread = new Thread(runnable, this.f15109b);
                thread.setDaemon(this.f15110c);
                return thread;
        }
    }
}
