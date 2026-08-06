package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.internal.IAppMetricaService;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.p0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0652p0 {

    /* renamed from: k, reason: collision with root package name */
    public static final long f6701k = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: a, reason: collision with root package name */
    public final Context f6702a;

    /* renamed from: b, reason: collision with root package name */
    public final ICommonExecutor f6703b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f6704c;

    /* renamed from: d, reason: collision with root package name */
    public IAppMetricaService f6705d;

    /* renamed from: e, reason: collision with root package name */
    public CountDownLatch f6706e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f6707f;

    /* renamed from: g, reason: collision with root package name */
    public final F1 f6708g;

    /* renamed from: h, reason: collision with root package name */
    public final G1 f6709h;

    /* renamed from: i, reason: collision with root package name */
    public final RunnableC0600n0 f6710i;

    /* renamed from: j, reason: collision with root package name */
    public final ServiceConnectionC0626o0 f6711j;

    public C0652p0(Context context, ICommonExecutor iCommonExecutor) {
        this(context, iCommonExecutor, C0294b4.l().e(), new G1());
    }

    public final synchronized boolean a() {
        return this.f6705d != null;
    }

    public final void b() {
        synchronized (this.f6707f) {
            this.f6703b.remove(this.f6710i);
        }
    }

    public final void c() {
        ICommonExecutor iCommonExecutor = this.f6703b;
        synchronized (this.f6707f) {
            try {
                iCommonExecutor.remove(this.f6710i);
                if (!this.f6704c) {
                    iCommonExecutor.executeDelayed(this.f6710i, f6701k);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(Long l2) {
        try {
            synchronized (this) {
                try {
                    CountDownLatch countDownLatch = this.f6706e;
                    if (countDownLatch == null) {
                        return;
                    }
                    countDownLatch.await(l2.longValue(), TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (InterruptedException unused) {
        }
    }

    public C0652p0(Context context, ICommonExecutor iCommonExecutor, F1 f12, G1 g12) {
        this.f6705d = null;
        this.f6707f = new Object();
        this.f6710i = new RunnableC0600n0(this);
        this.f6711j = new ServiceConnectionC0626o0(this);
        this.f6702a = context.getApplicationContext();
        this.f6703b = iCommonExecutor;
        this.f6704c = false;
        this.f6708g = f12;
        this.f6709h = g12;
    }
}
