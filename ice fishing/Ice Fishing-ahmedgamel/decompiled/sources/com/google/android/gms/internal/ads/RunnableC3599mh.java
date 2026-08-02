package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.mh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3599mh implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f33218n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C3707oh f33219u;

    public /* synthetic */ RunnableC3599mh(C3707oh c3707oh, int i) {
        this.f33218n = i;
        this.f33219u = c3707oh;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f33218n) {
            case 0:
                C3707oh c3707oh = this.f33219u;
                C4137wg c4137wg = c3707oh.f33705x;
                if (c4137wg != null) {
                    if (!c3707oh.f33706y) {
                        c4137wg.k();
                        c3707oh.f33706y = true;
                    }
                    c3707oh.f33705x.f();
                    break;
                }
                break;
            case 1:
                C4137wg c4137wg2 = this.f33219u.f33705x;
                if (c4137wg2 != null) {
                    c4137wg2.g();
                    break;
                }
                break;
            default:
                C4137wg c4137wg3 = this.f33219u.f33705x;
                if (c4137wg3 != null) {
                    c4137wg3.e();
                    break;
                }
                break;
        }
    }
}
