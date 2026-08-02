package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.ads.If, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ThreadFactoryC2624If implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26274a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f26275b;

    public ThreadFactoryC2624If() {
        this.f26274a = 1;
        this.f26275b = new AtomicInteger(1);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f26274a) {
            case 0:
                int andIncrement = this.f26275b.getAndIncrement();
                return new Thread(runnable, D.x.k(andIncrement, "AdWorker(SCION_TASK_EXECUTOR) #", new StringBuilder(String.valueOf(andIncrement).length() + 31)));
            default:
                int andIncrement2 = this.f26275b.getAndIncrement();
                return new Thread(runnable, D.x.k(andIncrement2, "AdWorker(NG) #", new StringBuilder(String.valueOf(andIncrement2).length() + 14)));
        }
    }

    public ThreadFactoryC2624If(C2641Jf c2641Jf) {
        this.f26274a = 0;
        Objects.requireNonNull(c2641Jf);
        this.f26275b = new AtomicInteger(1);
    }
}
