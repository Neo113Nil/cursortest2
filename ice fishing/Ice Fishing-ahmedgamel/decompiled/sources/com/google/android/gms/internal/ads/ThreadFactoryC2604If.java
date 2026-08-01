package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.ads.If, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ThreadFactoryC2604If implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25525a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f25526b;

    public ThreadFactoryC2604If() {
        this.f25525a = 1;
        this.f25526b = new AtomicInteger(1);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f25525a) {
            case 0:
                int andIncrement = this.f25526b.getAndIncrement();
                return new Thread(runnable, D.y.m(andIncrement, "AdWorker(SCION_TASK_EXECUTOR) #", new StringBuilder(String.valueOf(andIncrement).length() + 31)));
            default:
                int andIncrement2 = this.f25526b.getAndIncrement();
                return new Thread(runnable, D.y.m(andIncrement2, "AdWorker(NG) #", new StringBuilder(String.valueOf(andIncrement2).length() + 14)));
        }
    }

    public ThreadFactoryC2604If(C2621Jf c2621Jf) {
        this.f25525a = 0;
        Objects.requireNonNull(c2621Jf);
        this.f25526b = new AtomicInteger(1);
    }
}
