package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.Hh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2589Hh implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ BinderC2606Ih f25343n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f25344u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f25345v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f25346w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ boolean f25347x;

    public /* synthetic */ RunnableC2589Hh(BinderC2606Ih binderC2606Ih, int i, int i6, boolean z3, boolean z6) {
        this.f25343n = binderC2606Ih;
        this.f25344u = i;
        this.f25345v = i6;
        this.f25346w = z3;
        this.f25347x = z6;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        int i;
        boolean z3;
        boolean z6;
        q2.C0 c02;
        q2.C0 c03;
        q2.C0 c04;
        BinderC2606Ih binderC2606Ih = this.f25343n;
        int i6 = this.f25344u;
        int i9 = this.f25345v;
        boolean z9 = this.f25346w;
        boolean z10 = this.f25347x;
        synchronized (binderC2606Ih.f25552u) {
            try {
                boolean z11 = binderC2606Ih.f25557z;
                if (z11 || i9 != 1) {
                    i = i9;
                    z3 = false;
                } else {
                    i9 = 1;
                    i = 1;
                    z3 = true;
                }
                boolean z12 = i6 != i9;
                if (z12 && i == 1) {
                    z6 = true;
                    i = 1;
                } else {
                    z6 = false;
                }
                boolean z13 = z12 && i == 2;
                boolean z14 = z12 && i == 3;
                binderC2606Ih.f25557z = z11 || z3;
                if (z3) {
                    try {
                        q2.C0 c05 = binderC2606Ih.f25556y;
                        if (c05 != null) {
                            c05.d();
                        }
                    } catch (RemoteException e9) {
                        v2.i.i("#007 Could not call remote method.", e9);
                    }
                }
                if (z6 && (c04 = binderC2606Ih.f25556y) != null) {
                    c04.e();
                }
                if (z13 && (c03 = binderC2606Ih.f25556y) != null) {
                    c03.h();
                }
                if (z14) {
                    q2.C0 c06 = binderC2606Ih.f25556y;
                    if (c06 != null) {
                        c06.g();
                    }
                    binderC2606Ih.f25551n.u();
                }
                if (z9 != z10 && (c02 = binderC2606Ih.f25556y) != null) {
                    c02.C2(z10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
