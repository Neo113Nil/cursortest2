package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.jh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3427jh implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f32119n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C3481kh f32120u;

    public /* synthetic */ RunnableC3427jh(C3481kh c3481kh, int i) {
        this.f32119n = i;
        this.f32120u = c3481kh;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f32119n) {
            case 0:
                C3481kh c3481kh = this.f32120u;
                C3965tg c3965tg = c3481kh.f32314x;
                if (c3965tg != null) {
                    if (!c3481kh.f32315y) {
                        c3965tg.k();
                        c3481kh.f32315y = true;
                    }
                    c3481kh.f32314x.f();
                    break;
                }
                break;
            case 1:
                C3965tg c3965tg2 = this.f32120u.f32314x;
                if (c3965tg2 != null) {
                    c3965tg2.g();
                    break;
                }
                break;
            default:
                C3965tg c3965tg3 = this.f32120u.f32314x;
                if (c3965tg3 != null) {
                    c3965tg3.e();
                    break;
                }
                break;
        }
    }
}
