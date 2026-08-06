package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class Yf implements Wf {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0383eg f5435a;

    public Yf(C0383eg c0383eg) {
        this.f5435a = c0383eg;
    }

    @Override // io.appmetrica.analytics.impl.Wf
    public final void a() {
        C0383eg c0383eg = this.f5435a;
        C0921za c0921za = c0383eg.f5937b;
        Xf xf = new Xf(c0383eg);
        c0921za.getClass();
        try {
            FutureTask futureTask = new FutureTask(new CallableC0895ya(c0921za));
            C0610na.f6575I.f6586d.f6399a.getClass();
            new InterruptionSafeThread(futureTask, "IAA-SHMSR-" + ThreadFactoryC0924zd.f7275a.incrementAndGet()).start();
            C0616ng c0616ng = (C0616ng) futureTask.get(5L, TimeUnit.SECONDS);
            AbstractC0572lo.a(c0921za.f7274b);
            C0383eg.a(c0383eg, c0616ng, C0383eg.a(c0383eg));
        } catch (Throwable th) {
            try {
                xf.a(th);
            } finally {
                AbstractC0572lo.a(c0921za.f7274b);
            }
        }
    }
}
