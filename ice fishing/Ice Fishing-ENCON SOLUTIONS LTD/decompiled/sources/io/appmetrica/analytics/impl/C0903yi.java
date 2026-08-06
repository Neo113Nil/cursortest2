package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Looper;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.yi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0903yi implements InterfaceC0362dk {

    /* renamed from: e, reason: collision with root package name */
    public static final C0877xi f7233e = new C0877xi();

    /* renamed from: f, reason: collision with root package name */
    public static final long f7234f;

    /* renamed from: g, reason: collision with root package name */
    public static final long f7235g;

    /* renamed from: a, reason: collision with root package name */
    public final C0652p0 f7236a;

    /* renamed from: b, reason: collision with root package name */
    public final Yj f7237b;

    /* renamed from: c, reason: collision with root package name */
    public final TimeProvider f7238c;

    /* renamed from: d, reason: collision with root package name */
    public final ICommonExecutor f7239d;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f7234f = timeUnit.toMillis(1L);
        f7235g = timeUnit.toMillis(4L);
    }

    public C0903yi(C0652p0 c0652p0, Yj yj, TimeProvider timeProvider) {
        this.f7236a = c0652p0;
        this.f7237b = yj;
        this.f7238c = timeProvider;
        this.f7239d = C0294b4.l().g().b();
    }

    public final void a(C0824vh c0824vh) {
        Callable pg;
        ICommonExecutor iCommonExecutor = this.f7239d;
        if (c0824vh.f7066b) {
            Yj yj = this.f7237b;
            pg = new C0322c6(yj.f5442a, yj.f5443b, yj.f5444c, c0824vh);
        } else {
            Yj yj2 = this.f7237b;
            pg = new Pg(yj2.f5443b, yj2.f5444c, c0824vh);
        }
        iCommonExecutor.submit(pg);
    }

    public final void b(C0824vh c0824vh) {
        long uptimeMillis = this.f7238c.uptimeMillis();
        Yj yj = this.f7237b;
        C0322c6 c0322c6 = new C0322c6(yj.f5442a, yj.f5443b, yj.f5444c, c0824vh);
        long j2 = kotlin.jvm.internal.i.a(Looper.myLooper(), Looper.getMainLooper()) ? f7234f : f7235g;
        if (this.f7236a.a()) {
            try {
                this.f7239d.submit(c0322c6).get(j2, TimeUnit.MILLISECONDS);
            } catch (Throwable unused) {
            }
        }
        if (c0322c6.f7208c) {
            return;
        }
        try {
            c0322c6.a();
            Thread.sleep(Math.max(0L, j2 - (this.f7238c.uptimeMillis() - uptimeMillis)));
        } catch (Throwable unused2) {
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0362dk
    public final void reportData(int i2, Bundle bundle) {
        ICommonExecutor iCommonExecutor = this.f7239d;
        Yj yj = this.f7237b;
        iCommonExecutor.submit(new Nn(yj.f5443b, yj.f5444c, i2, bundle));
    }

    public C0903yi(C0652p0 c0652p0, Yj yj) {
        this(c0652p0, yj, new SystemTimeProvider());
    }

    public final void a(Bf bf) {
        ICommonExecutor iCommonExecutor = this.f7239d;
        Yj yj = this.f7237b;
        iCommonExecutor.submit(new C0717re(yj.f5443b, yj.f5444c, bf));
    }

    public final void b(Bf bf) {
        ICommonExecutor iCommonExecutor = this.f7239d;
        Yj yj = this.f7237b;
        iCommonExecutor.submit(new Ei(yj.f5443b, yj.f5444c, bf));
    }
}
