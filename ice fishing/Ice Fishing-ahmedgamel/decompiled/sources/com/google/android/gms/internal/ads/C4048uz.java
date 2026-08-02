package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.google.android.gms.internal.ads.uz, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4048uz implements Ly {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC3158eN f35379a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC3158eN f35380b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC3158eN f35381c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f35382d;

    /* renamed from: e, reason: collision with root package name */
    public final long f35383e;

    public C4048uz(InterfaceC3158eN interfaceC3158eN, InterfaceC3158eN interfaceC3158eN2, InterfaceC3158eN interfaceC3158eN3, boolean z6, long j6) {
        this.f35379a = interfaceC3158eN;
        this.f35380b = interfaceC3158eN2;
        this.f35381c = interfaceC3158eN3;
        this.f35382d = z6;
        this.f35383e = j6;
    }

    @Override // com.google.android.gms.internal.ads.Ly
    public final P3.a a(Context context) {
        return ((Jz) this.f35380b.f()).a(context);
    }

    @Override // com.google.android.gms.internal.ads.Ly
    public final void b(MotionEvent motionEvent) {
        ((Jz) this.f35380b.f()).b(motionEvent);
    }

    @Override // com.google.android.gms.internal.ads.Ly
    public final String c() {
        return ((Jz) this.f35380b.f()).c();
    }

    @Override // com.google.android.gms.internal.ads.Ly
    public final P3.a d(Context context, View view, Activity activity) {
        return ((Jz) this.f35380b.f()).d(context, view, activity);
    }

    @Override // com.google.android.gms.internal.ads.Ly
    public final P3.a e(Context context, String str, View view) {
        return ((Jz) this.f35380b.f()).e(context, str, view);
    }

    @Override // com.google.android.gms.internal.ads.Ly
    public final P3.a f() {
        GD gd = GD.f25742n;
        if (this.f35382d) {
            final int i = 1;
            C3901sD t6 = QC.t(QC.q(ID.s(((Cz) this.f35379a.f()).a()), Throwable.class, L2.f26840v, gd), new BD(this) { // from class: com.google.android.gms.internal.ads.sz

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ C4048uz f34962b;

                {
                    this.f34962b = this;
                }

                @Override // com.google.android.gms.internal.ads.BD
                public final /* synthetic */ P3.a a(Object obj) {
                    switch (i) {
                        case 0:
                            return ((Jz) this.f34962b.f35380b.f()).f();
                        case 1:
                            return ((Yz) this.f34962b.f35381c.f()).c();
                        default:
                            return ((Jz) this.f34962b.f35380b.f()).f();
                    }
                }
            }, gd);
            final int i4 = 2;
            return QC.t(t6, new BD(this) { // from class: com.google.android.gms.internal.ads.sz

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ C4048uz f34962b;

                {
                    this.f34962b = this;
                }

                @Override // com.google.android.gms.internal.ads.BD
                public final /* synthetic */ P3.a a(Object obj) {
                    switch (i4) {
                        case 0:
                            return ((Jz) this.f34962b.f35380b.f()).f();
                        case 1:
                            return ((Yz) this.f34962b.f35381c.f()).c();
                        default:
                            return ((Jz) this.f34962b.f35380b.f()).f();
                    }
                }
            }, gd);
        }
        final int i6 = 0;
        C3901sD t9 = QC.t(QC.q(ID.s(((Yz) this.f35381c.f()).c()), Throwable.class, L2.f26841w, gd), new BD(this) { // from class: com.google.android.gms.internal.ads.sz

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C4048uz f34962b;

            {
                this.f34962b = this;
            }

            @Override // com.google.android.gms.internal.ads.BD
            public final /* synthetic */ P3.a a(Object obj) {
                switch (i6) {
                    case 0:
                        return ((Jz) this.f34962b.f35380b.f()).f();
                    case 1:
                        return ((Yz) this.f34962b.f35381c.f()).c();
                    default:
                        return ((Jz) this.f34962b.f35380b.f()).f();
                }
            }
        }, gd);
        t9.a(new RunnableC3830qw(4, this), gd);
        return t9;
    }

    @Override // com.google.android.gms.internal.ads.Ly
    public final int h() {
        return ((Jz) this.f35380b.f()).h();
    }
}
