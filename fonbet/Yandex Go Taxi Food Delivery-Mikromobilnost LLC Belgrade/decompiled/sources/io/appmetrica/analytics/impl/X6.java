package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.pm.ServiceInfo;
import defpackage.jl40;
import defpackage.zy11;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.internal.AppMetricaService;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class X6 extends C0887yj {
    public final Context f;
    public final C0425ik g;
    public final boolean h;
    public final C0615p7 i;
    public final C0639q2 j;
    public final C0470k7 k;

    public X6(Context context, C0781v0 c0781v0, InterfaceC0863xo interfaceC0863xo, C0425ik c0425ik, boolean z) {
        super(c0781v0, interfaceC0863xo, c0425ik);
        this.f = context;
        this.g = c0425ik;
        this.h = z;
        this.i = V4.l().i();
        this.j = V4.l().f();
        this.k = new C0470k7(context);
    }

    @Override // io.appmetrica.analytics.impl.AbstractCallableC0483kk
    public final synchronized void a() {
        try {
            if (this.c) {
                return;
            }
            this.c = true;
            String a = this.i.a.a();
            C0639q2 c0639q2 = this.j;
            Context context = this.f;
            c0639q2.getClass();
            ServiceInfo serviceInfo = PackageManagerUtils.getServiceInfo(context, AppMetricaService.class);
            String str = serviceInfo != null ? serviceInfo.processName : null;
            if (this.h || !jl40.l(a, str)) {
                this.a.c();
                this.c = false;
                super.a();
            } else {
                this.k.a(this.g);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // io.appmetrica.analytics.impl.AbstractCallableC0483kk
    public final boolean c() {
        this.k.a(this.g);
        return false;
    }

    @Override // io.appmetrica.analytics.impl.AbstractCallableC0483kk, java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        a();
        return zy11.a;
    }

    public /* synthetic */ X6(Context context, C0781v0 c0781v0, InterfaceC0863xo interfaceC0863xo, C0425ik c0425ik, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, c0781v0, interfaceC0863xo, c0425ik, (i & 16) != 0 ? false : z);
    }
}
