package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.ads.Ph, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ThreadFactoryC2724Ph implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicInteger f27014a = new AtomicInteger(1);

    /* renamed from: b, reason: collision with root package name */
    public final int f27015b;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int andIncrement = this.f27014a.getAndIncrement();
        return new com.facebook.ads.internal.dynamicloading.a(this, runnable, D.y.j(andIncrement, "AdWorker(WebViewStartup) #", new StringBuilder(String.valueOf(andIncrement).length() + 26)), runnable);
    }
}
