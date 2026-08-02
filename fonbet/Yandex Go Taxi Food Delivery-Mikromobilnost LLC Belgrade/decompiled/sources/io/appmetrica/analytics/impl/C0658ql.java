package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Looper;
import defpackage.jl40;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.ql, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0658ql implements InterfaceC0746tn {
    public static final C0629pl e = new C0629pl();
    public static final long f = 1000;
    public static final long g = 4000;
    public final C0781v0 a;
    public final C0602on b;
    public final TimeProvider c;
    public final ICommonExecutor d;

    public C0658ql(C0781v0 c0781v0, C0602on c0602on, TimeProvider timeProvider) {
        this.a = c0781v0;
        this.b = c0602on;
        this.c = timeProvider;
        this.d = V4.l().g().c();
    }

    public final void a(C0425ik c0425ik) {
        ICommonExecutor iCommonExecutor = this.d;
        boolean z = c0425ik.b;
        C0602on c0602on = this.b;
        iCommonExecutor.submit(z ? new X6(c0602on.a, c0602on.b, c0602on.c, c0425ik, true) : new C0887yj(c0602on.b, c0602on.c, c0425ik));
    }

    public final void b(C0425ik c0425ik) {
        long uptimeMillis = this.c.uptimeMillis();
        C0602on c0602on = this.b;
        X6 x6 = new X6(c0602on.a, c0602on.b, c0602on.c, c0425ik, false);
        long j = jl40.l(Looper.myLooper(), Looper.getMainLooper()) ? f : g;
        if (this.a.a()) {
            try {
                this.d.submit(x6).get(j, TimeUnit.MILLISECONDS);
            } catch (Throwable unused) {
            }
        }
        if (x6.c) {
            return;
        }
        try {
            x6.a();
            Thread.sleep(Math.max(0L, j - (this.c.uptimeMillis() - uptimeMillis)));
        } catch (Throwable unused2) {
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0746tn
    public final void reportData(int i, Bundle bundle) {
        ICommonExecutor iCommonExecutor = this.d;
        C0602on c0602on = this.b;
        iCommonExecutor.submit(new C0519lr(c0602on.b, c0602on.c, i, bundle));
    }

    public C0658ql(C0781v0 c0781v0, C0602on c0602on) {
        this(c0781v0, c0602on, new SystemTimeProvider());
    }

    public final void a(C0597oi c0597oi) {
        ICommonExecutor iCommonExecutor = this.d;
        C0602on c0602on = this.b;
        iCommonExecutor.submit(new C0307eh(c0602on.b, c0602on.c, c0597oi));
    }

    public final void b(C0597oi c0597oi) {
        ICommonExecutor iCommonExecutor = this.d;
        C0602on c0602on = this.b;
        iCommonExecutor.submit(new C0831wl(c0602on.b, c0602on.c, c0597oi));
    }
}
