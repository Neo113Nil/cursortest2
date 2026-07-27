package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class Nz implements Lz {

    /* renamed from: a, reason: collision with root package name */
    public final C3011bx f26628a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC3024cA f26629b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC3457kA f26630c;

    /* renamed from: d, reason: collision with root package name */
    public final C4158xA f26631d;

    /* renamed from: e, reason: collision with root package name */
    public final ExecutorService f26632e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReference f26633f = new AtomicReference("2.893135394.-1");

    public Nz(C3011bx c3011bx, InterfaceC3024cA interfaceC3024cA, InterfaceC3457kA interfaceC3457kA, C4158xA c4158xA, ExecutorService executorService) {
        this.f26628a = c3011bx;
        this.f26629b = interfaceC3024cA;
        this.f26630c = interfaceC3457kA;
        this.f26631d = c4158xA;
        this.f26632e = executorService;
    }

    @Override // com.google.android.gms.internal.ads.Lz
    public final String a() {
        return (String) this.f26633f.get();
    }

    @Override // com.google.android.gms.internal.ads.Lz
    public final RunnableFutureC3083dE b(Context context) {
        return C3686oN.p(new T6(12, this, context), this.f26632e);
    }

    @Override // com.google.android.gms.internal.ads.Lz
    public final void c(MotionEvent motionEvent) {
        Zw b9 = this.f26628a.b();
        C4158xA c4158xA = this.f26631d;
        if (b9 == null) {
            c4158xA.b(15004);
        } else {
            if (motionEvent == null) {
                return;
            }
            try {
                b9.i(motionEvent);
            } catch (C2956ax e6) {
                c4158xA.d(15005, e6);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.Lz
    public final JD d() {
        JD s3 = JD.s(this.f26629b.d());
        J2 j22 = J2.f25690C;
        HD hd = HD.f25326n;
        final int i = 0;
        C3945tD y6 = C3686oN.y(C3686oN.A(C3686oN.u(s3, Throwable.class, j22, hd), new XA(this) { // from class: com.google.android.gms.internal.ads.Mz

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Nz f26407b;

            {
                this.f26407b = this;
            }

            @Override // com.google.android.gms.internal.ads.XA
            public final Object apply(Object obj) {
                switch (i) {
                    case 0:
                        My my = (My) obj;
                        Nz nz = this.f26407b;
                        if (nz.f26630c.a(my) && my != null) {
                            return new Boolean(true);
                        }
                        nz.f26631d.b(15003);
                        throw new B0.c(1);
                    default:
                        Vw vw = (Vw) obj;
                        Nz nz2 = this.f26407b;
                        nz2.getClass();
                        if (vw == null) {
                            throw new B0.c(3);
                        }
                        if (Build.VERSION.SDK_INT >= 34) {
                            vw.f28323b.setReadOnly();
                        }
                        nz2.f26631d.f(15002, new RunnableC3329hp(19, nz2, vw));
                        return new Boolean(true);
                }
            }
        }, hd), new C3907sc(15, this), hd);
        final int i4 = 1;
        return C3686oN.A(C3686oN.A(y6, new XA(this) { // from class: com.google.android.gms.internal.ads.Mz

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Nz f26407b;

            {
                this.f26407b = this;
            }

            @Override // com.google.android.gms.internal.ads.XA
            public final Object apply(Object obj) {
                switch (i4) {
                    case 0:
                        My my = (My) obj;
                        Nz nz = this.f26407b;
                        if (nz.f26630c.a(my) && my != null) {
                            return new Boolean(true);
                        }
                        nz.f26631d.b(15003);
                        throw new B0.c(1);
                    default:
                        Vw vw = (Vw) obj;
                        Nz nz2 = this.f26407b;
                        nz2.getClass();
                        if (vw == null) {
                            throw new B0.c(3);
                        }
                        if (Build.VERSION.SDK_INT >= 34) {
                            vw.f28323b.setReadOnly();
                        }
                        nz2.f26631d.f(15002, new RunnableC3329hp(19, nz2, vw));
                        return new Boolean(true);
                }
            }
        }, hd), J2.f25689B, hd);
    }

    @Override // com.google.android.gms.internal.ads.Lz
    public final int e() {
        return 3;
    }

    @Override // com.google.android.gms.internal.ads.Lz
    public final RunnableFutureC3083dE f(Context context, View view, Activity activity) {
        return C3686oN.p(new CallableC2831Vm(this, context, view, activity, 3), this.f26632e);
    }

    @Override // com.google.android.gms.internal.ads.Lz
    public final RunnableFutureC3083dE g(Context context, String str, View view) {
        return C3686oN.p(new CallableC2831Vm(this, context, str, view, 4), this.f26632e);
    }
}
