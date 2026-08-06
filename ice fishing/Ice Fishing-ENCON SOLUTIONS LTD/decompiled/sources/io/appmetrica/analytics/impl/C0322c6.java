package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.pm.ServiceInfo;
import h1.C0239i;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.internal.AppMetricaService;

/* renamed from: io.appmetrica.analytics.impl.c6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0322c6 extends Pg {

    /* renamed from: f, reason: collision with root package name */
    public final Context f5722f;

    /* renamed from: g, reason: collision with root package name */
    public final C0824vh f5723g;

    /* renamed from: h, reason: collision with root package name */
    public final C0709r6 f5724h;

    /* renamed from: i, reason: collision with root package name */
    public final K1 f5725i;

    /* renamed from: j, reason: collision with root package name */
    public final C0606n6 f5726j;

    public C0322c6(Context context, C0652p0 c0652p0, Zk zk, C0824vh c0824vh) {
        super(c0652p0, zk, c0824vh);
        this.f5722f = context;
        this.f5723g = c0824vh;
        this.f5724h = C0294b4.l().i();
        this.f5725i = C0294b4.l().f();
        this.f5726j = new C0606n6(context);
    }

    @Override // io.appmetrica.analytics.impl.AbstractCallableC0876xh
    public final synchronized void a() {
        try {
            if (this.f7208c) {
                return;
            }
            this.f7208c = true;
            String a2 = this.f5724h.f6811a.a();
            K1 k12 = this.f5725i;
            Context context = this.f5722f;
            k12.getClass();
            ServiceInfo serviceInfo = PackageManagerUtils.getServiceInfo(context, AppMetricaService.class);
            if (kotlin.jvm.internal.i.a(a2, serviceInfo != null ? serviceInfo.processName : null)) {
                this.f5726j.a(this.f5723g);
            } else {
                this.f7206a.c();
                this.f7208c = false;
                super.a();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // io.appmetrica.analytics.impl.AbstractCallableC0876xh
    public final boolean c() {
        this.f5726j.a(this.f5723g);
        return false;
    }

    @Override // io.appmetrica.analytics.impl.AbstractCallableC0876xh, java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        a();
        return C0239i.f3393a;
    }
}
