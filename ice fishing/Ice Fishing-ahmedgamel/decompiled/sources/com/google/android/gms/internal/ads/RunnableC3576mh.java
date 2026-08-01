package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.mh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3576mh implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f32438n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C3684oh f32439u;

    public /* synthetic */ RunnableC3576mh(C3684oh c3684oh, int i) {
        this.f32438n = i;
        this.f32439u = c3684oh;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f32438n) {
            case 0:
                C3684oh c3684oh = this.f32439u;
                C4114wg c4114wg = c3684oh.f32919x;
                if (c4114wg != null) {
                    if (!c3684oh.f32920y) {
                        c4114wg.k();
                        c3684oh.f32920y = true;
                    }
                    c3684oh.f32919x.f();
                    break;
                }
                break;
            case 1:
                C4114wg c4114wg2 = this.f32439u.f32919x;
                if (c4114wg2 != null) {
                    c4114wg2.g();
                    break;
                }
                break;
            default:
                C4114wg c4114wg3 = this.f32439u.f32919x;
                if (c4114wg3 != null) {
                    c4114wg3.e();
                    break;
                }
                break;
        }
    }
}
