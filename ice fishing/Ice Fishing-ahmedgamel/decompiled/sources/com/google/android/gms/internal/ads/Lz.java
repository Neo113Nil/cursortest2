package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class Lz implements Jz {

    /* renamed from: a, reason: collision with root package name */
    public final C3025bx f26988a;

    /* renamed from: b, reason: collision with root package name */
    public final Zz f26989b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC3307hA f26990c;

    /* renamed from: d, reason: collision with root package name */
    public final C4006uA f26991d;

    /* renamed from: e, reason: collision with root package name */
    public final ExecutorService f26992e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReference f26993f = new AtomicReference("2.904631200.-1");

    public Lz(C3025bx c3025bx, Zz zz, InterfaceC3307hA interfaceC3307hA, C4006uA c4006uA, ExecutorService executorService) {
        this.f26988a = c3025bx;
        this.f26989b = zz;
        this.f26990c = interfaceC3307hA;
        this.f26991d = c4006uA;
        this.f26992e = executorService;
    }

    @Override // com.google.android.gms.internal.ads.Jz
    public final RunnableFutureC2989bE a(Context context) {
        return QC.o(new E2.w(13, this, context), this.f26992e);
    }

    @Override // com.google.android.gms.internal.ads.Jz
    public final void b(MotionEvent motionEvent) {
        Xw b9 = this.f26988a.b();
        C4006uA c4006uA = this.f26991d;
        if (b9 == null) {
            c4006uA.b(15004);
        } else {
            if (motionEvent == null) {
                return;
            }
            try {
                b9.i(motionEvent);
            } catch (C2971ax e9) {
                c4006uA.d(15005, e9);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.Jz
    public final String c() {
        return (String) this.f26993f.get();
    }

    @Override // com.google.android.gms.internal.ads.Jz
    public final RunnableFutureC2989bE d(Context context, View view, Activity activity) {
        return QC.o(new CallableC2900Ym(this, context, view, activity, 3), this.f26992e);
    }

    @Override // com.google.android.gms.internal.ads.Jz
    public final RunnableFutureC2989bE e(Context context, String str, View view) {
        return QC.o(new CallableC2900Ym(this, context, str, view, 4), this.f26992e);
    }

    @Override // com.google.android.gms.internal.ads.Jz
    public final ID f() {
        ID s9 = ID.s(this.f26989b.f());
        L2 l22 = L2.f26820C;
        GD gd = GD.f25742n;
        final int i = 0;
        C3901sD t6 = QC.t(QC.u(QC.q(s9, Throwable.class, l22, gd), new UA(this) { // from class: com.google.android.gms.internal.ads.Kz

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Lz f26803b;

            {
                this.f26803b = this;
            }

            @Override // com.google.android.gms.internal.ads.UA
            public final Object apply(Object obj) {
                switch (i) {
                    case 0:
                        Ky ky = (Ky) obj;
                        Lz lz = this.f26803b;
                        if (lz.f26990c.b(ky) && ky != null) {
                            return new Boolean(true);
                        }
                        lz.f26991d.b(15003);
                        throw new B0.c(1);
                    default:
                        Uw uw = (Uw) obj;
                        Lz lz2 = this.f26803b;
                        lz2.getClass();
                        if (uw == null) {
                            throw new B0.c(3);
                        }
                        if (Build.VERSION.SDK_INT >= 34) {
                            uw.f28841b.setReadOnly();
                        }
                        lz2.f26991d.f(15002, new RunnableC3071cq(18, lz2, uw));
                        return new Boolean(true);
                }
            }
        }, gd), new C4187xc(15, this), gd);
        final int i4 = 1;
        return QC.u(QC.u(t6, new UA(this) { // from class: com.google.android.gms.internal.ads.Kz

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Lz f26803b;

            {
                this.f26803b = this;
            }

            @Override // com.google.android.gms.internal.ads.UA
            public final Object apply(Object obj) {
                switch (i4) {
                    case 0:
                        Ky ky = (Ky) obj;
                        Lz lz = this.f26803b;
                        if (lz.f26990c.b(ky) && ky != null) {
                            return new Boolean(true);
                        }
                        lz.f26991d.b(15003);
                        throw new B0.c(1);
                    default:
                        Uw uw = (Uw) obj;
                        Lz lz2 = this.f26803b;
                        lz2.getClass();
                        if (uw == null) {
                            throw new B0.c(3);
                        }
                        if (Build.VERSION.SDK_INT >= 34) {
                            uw.f28841b.setReadOnly();
                        }
                        lz2.f26991d.f(15002, new RunnableC3071cq(18, lz2, uw));
                        return new Boolean(true);
                }
            }
        }, gd), L2.f26819B, gd);
    }

    @Override // com.google.android.gms.internal.ads.Jz
    public final int h() {
        return 3;
    }
}
