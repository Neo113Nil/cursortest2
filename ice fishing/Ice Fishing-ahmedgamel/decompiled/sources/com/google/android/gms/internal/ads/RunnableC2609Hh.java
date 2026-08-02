package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.Hh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2609Hh implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ BinderC2626Ih f26096n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f26097u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f26098v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f26099w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ boolean f26100x;

    public /* synthetic */ RunnableC2609Hh(BinderC2626Ih binderC2626Ih, int i, int i4, boolean z6, boolean z9) {
        this.f26096n = binderC2626Ih;
        this.f26097u = i;
        this.f26098v = i4;
        this.f26099w = z6;
        this.f26100x = z9;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        int i;
        boolean z6;
        boolean z9;
        s2.C0 c02;
        s2.C0 c03;
        s2.C0 c04;
        BinderC2626Ih binderC2626Ih = this.f26096n;
        int i4 = this.f26097u;
        int i6 = this.f26098v;
        boolean z10 = this.f26099w;
        boolean z11 = this.f26100x;
        synchronized (binderC2626Ih.f26301u) {
            try {
                boolean z12 = binderC2626Ih.f26306z;
                if (z12 || i6 != 1) {
                    i = i6;
                    z6 = false;
                } else {
                    i6 = 1;
                    i = 1;
                    z6 = true;
                }
                boolean z13 = i4 != i6;
                if (z13 && i == 1) {
                    z9 = true;
                    i = 1;
                } else {
                    z9 = false;
                }
                boolean z14 = z13 && i == 2;
                boolean z15 = z13 && i == 3;
                binderC2626Ih.f26306z = z12 || z6;
                if (z6) {
                    try {
                        s2.C0 c05 = binderC2626Ih.f26305y;
                        if (c05 != null) {
                            c05.d();
                        }
                    } catch (RemoteException e9) {
                        x2.i.i("#007 Could not call remote method.", e9);
                    }
                }
                if (z9 && (c04 = binderC2626Ih.f26305y) != null) {
                    c04.e();
                }
                if (z14 && (c03 = binderC2626Ih.f26305y) != null) {
                    c03.h();
                }
                if (z15) {
                    s2.C0 c06 = binderC2626Ih.f26305y;
                    if (c06 != null) {
                        c06.g();
                    }
                    binderC2626Ih.f26300n.u();
                }
                if (z10 != z11 && (c02 = binderC2626Ih.f26305y) != null) {
                    c02.y2(z11);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
