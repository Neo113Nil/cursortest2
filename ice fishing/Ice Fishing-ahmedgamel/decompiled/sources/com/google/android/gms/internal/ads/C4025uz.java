package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.google.android.gms.internal.ads.uz, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4025uz implements Ly {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC3135eN f34616a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC3135eN f34617b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC3135eN f34618c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f34619d;

    /* renamed from: e, reason: collision with root package name */
    public final long f34620e;

    public C4025uz(InterfaceC3135eN interfaceC3135eN, InterfaceC3135eN interfaceC3135eN2, InterfaceC3135eN interfaceC3135eN3, boolean z3, long j6) {
        this.f34616a = interfaceC3135eN;
        this.f34617b = interfaceC3135eN2;
        this.f34618c = interfaceC3135eN3;
        this.f34619d = z3;
        this.f34620e = j6;
    }

    @Override // com.google.android.gms.internal.ads.Ly
    public final N3.a a(Context context) {
        return ((Jz) this.f34617b.f()).a(context);
    }

    @Override // com.google.android.gms.internal.ads.Ly
    public final void b(MotionEvent motionEvent) {
        ((Jz) this.f34617b.f()).b(motionEvent);
    }

    @Override // com.google.android.gms.internal.ads.Ly
    public final String c() {
        return ((Jz) this.f34617b.f()).c();
    }

    @Override // com.google.android.gms.internal.ads.Ly
    public final N3.a d(Context context, View view, Activity activity) {
        return ((Jz) this.f34617b.f()).d(context, view, activity);
    }

    @Override // com.google.android.gms.internal.ads.Ly
    public final N3.a e(Context context, String str, View view) {
        return ((Jz) this.f34617b.f()).e(context, str, view);
    }

    @Override // com.google.android.gms.internal.ads.Ly
    public final N3.a f() {
        GD gd = GD.f24952n;
        if (this.f34619d) {
            final int i = 1;
            C3878sD t6 = QC.t(QC.q(ID.s(((Cz) this.f34616a.f()).a()), Throwable.class, L2.f26040v, gd), new BD(this) { // from class: com.google.android.gms.internal.ads.sz

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ C4025uz f34176b;

                {
                    this.f34176b = this;
                }

                @Override // com.google.android.gms.internal.ads.BD
                public final /* synthetic */ N3.a a(Object obj) {
                    switch (i) {
                        case 0:
                            return ((Jz) this.f34176b.f34617b.f()).f();
                        case 1:
                            return ((Yz) this.f34176b.f34618c.f()).c();
                        default:
                            return ((Jz) this.f34176b.f34617b.f()).f();
                    }
                }
            }, gd);
            final int i6 = 2;
            return QC.t(t6, new BD(this) { // from class: com.google.android.gms.internal.ads.sz

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ C4025uz f34176b;

                {
                    this.f34176b = this;
                }

                @Override // com.google.android.gms.internal.ads.BD
                public final /* synthetic */ N3.a a(Object obj) {
                    switch (i6) {
                        case 0:
                            return ((Jz) this.f34176b.f34617b.f()).f();
                        case 1:
                            return ((Yz) this.f34176b.f34618c.f()).c();
                        default:
                            return ((Jz) this.f34176b.f34617b.f()).f();
                    }
                }
            }, gd);
        }
        final int i9 = 0;
        C3878sD t9 = QC.t(QC.q(ID.s(((Yz) this.f34618c.f()).c()), Throwable.class, L2.f26041w, gd), new BD(this) { // from class: com.google.android.gms.internal.ads.sz

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C4025uz f34176b;

            {
                this.f34176b = this;
            }

            @Override // com.google.android.gms.internal.ads.BD
            public final /* synthetic */ N3.a a(Object obj) {
                switch (i9) {
                    case 0:
                        return ((Jz) this.f34176b.f34617b.f()).f();
                    case 1:
                        return ((Yz) this.f34176b.f34618c.f()).c();
                    default:
                        return ((Jz) this.f34176b.f34617b.f()).f();
                }
            }
        }, gd);
        t9.a(new RunnableC3807qw(4, this), gd);
        return t9;
    }

    @Override // com.google.android.gms.internal.ads.Ly
    public final int h() {
        return ((Jz) this.f34617b.f()).h();
    }
}
