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
    public final C3002bx f26197a;

    /* renamed from: b, reason: collision with root package name */
    public final Zz f26198b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC3284hA f26199c;

    /* renamed from: d, reason: collision with root package name */
    public final C3983uA f26200d;

    /* renamed from: e, reason: collision with root package name */
    public final ExecutorService f26201e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReference f26202f = new AtomicReference("2.904631200.-1");

    public Lz(C3002bx c3002bx, Zz zz, InterfaceC3284hA interfaceC3284hA, C3983uA c3983uA, ExecutorService executorService) {
        this.f26197a = c3002bx;
        this.f26198b = zz;
        this.f26199c = interfaceC3284hA;
        this.f26200d = c3983uA;
        this.f26201e = executorService;
    }

    @Override // com.google.android.gms.internal.ads.Jz
    public final RunnableFutureC2966bE a(Context context) {
        return QC.o(new C2.x(13, this, context), this.f26201e);
    }

    @Override // com.google.android.gms.internal.ads.Jz
    public final void b(MotionEvent motionEvent) {
        Xw b9 = this.f26197a.b();
        C3983uA c3983uA = this.f26200d;
        if (b9 == null) {
            c3983uA.b(15004);
        } else {
            if (motionEvent == null) {
                return;
            }
            try {
                b9.i(motionEvent);
            } catch (C2948ax e9) {
                c3983uA.d(15005, e9);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.Jz
    public final String c() {
        return (String) this.f26202f.get();
    }

    @Override // com.google.android.gms.internal.ads.Jz
    public final RunnableFutureC2966bE d(Context context, View view, Activity activity) {
        return QC.o(new CallableC2861Xm(this, context, view, activity, 3), this.f26201e);
    }

    @Override // com.google.android.gms.internal.ads.Jz
    public final RunnableFutureC2966bE e(Context context, String str, View view) {
        return QC.o(new CallableC2861Xm(this, context, str, view, 4), this.f26201e);
    }

    @Override // com.google.android.gms.internal.ads.Jz
    public final ID f() {
        ID s9 = ID.s(this.f26198b.f());
        L2 l22 = L2.f26020C;
        GD gd = GD.f24952n;
        final int i = 0;
        C3878sD t6 = QC.t(QC.u(QC.q(s9, Throwable.class, l22, gd), new UA(this) { // from class: com.google.android.gms.internal.ads.Kz

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Lz f26003b;

            {
                this.f26003b = this;
            }

            @Override // com.google.android.gms.internal.ads.UA
            public final Object apply(Object obj) {
                switch (i) {
                    case 0:
                        Ky ky = (Ky) obj;
                        Lz lz = this.f26003b;
                        if (lz.f26199c.b(ky) && ky != null) {
                            return new Boolean(true);
                        }
                        lz.f26200d.b(15003);
                        throw new B0.c(1);
                    default:
                        Uw uw = (Uw) obj;
                        Lz lz2 = this.f26003b;
                        lz2.getClass();
                        if (uw == null) {
                            throw new B0.c(3);
                        }
                        if (Build.VERSION.SDK_INT >= 34) {
                            uw.f28044b.setReadOnly();
                        }
                        lz2.f26200d.f(15002, new RunnableC3048cq(18, lz2, uw));
                        return new Boolean(true);
                }
            }
        }, gd), new C4164xc(15, this), gd);
        final int i6 = 1;
        return QC.u(QC.u(t6, new UA(this) { // from class: com.google.android.gms.internal.ads.Kz

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Lz f26003b;

            {
                this.f26003b = this;
            }

            @Override // com.google.android.gms.internal.ads.UA
            public final Object apply(Object obj) {
                switch (i6) {
                    case 0:
                        Ky ky = (Ky) obj;
                        Lz lz = this.f26003b;
                        if (lz.f26199c.b(ky) && ky != null) {
                            return new Boolean(true);
                        }
                        lz.f26200d.b(15003);
                        throw new B0.c(1);
                    default:
                        Uw uw = (Uw) obj;
                        Lz lz2 = this.f26003b;
                        lz2.getClass();
                        if (uw == null) {
                            throw new B0.c(3);
                        }
                        if (Build.VERSION.SDK_INT >= 34) {
                            uw.f28044b.setReadOnly();
                        }
                        lz2.f26200d.f(15002, new RunnableC3048cq(18, lz2, uw));
                        return new Boolean(true);
                }
            }
        }, gd), L2.f26019B, gd);
    }

    @Override // com.google.android.gms.internal.ads.Jz
    public final int h() {
        return 3;
    }
}
