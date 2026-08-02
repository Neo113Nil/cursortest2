package com.anythink.core.common.n.b.a;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15895a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f15896b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f15897c;

    public /* synthetic */ e(int i, String str, boolean z6) {
        this.f15895a = i;
        this.f15896b = str;
        this.f15897c = z6;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread a9;
        switch (this.f15895a) {
            case 0:
                a9 = c.a(this.f15896b, this.f15897c, runnable);
                return a9;
            default:
                Thread thread = new Thread(runnable, this.f15896b);
                thread.setDaemon(this.f15897c);
                return thread;
        }
    }
}
