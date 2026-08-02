package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Sn, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2802Sn implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f28341n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C2819Tn f28342u;

    public /* synthetic */ RunnableC2802Sn(C2819Tn c2819Tn, int i) {
        this.f28341n = i;
        this.f28342u = c2819Tn;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f28341n) {
            case 0:
                C2819Tn c2819Tn = this.f28342u;
                c2819Tn.getClass();
                c2819Tn.f28580c.execute(new RunnableC2802Sn(c2819Tn, 1));
                break;
            case 1:
                this.f28342u.a();
                break;
            default:
                this.f28342u.a();
                break;
        }
    }
}
