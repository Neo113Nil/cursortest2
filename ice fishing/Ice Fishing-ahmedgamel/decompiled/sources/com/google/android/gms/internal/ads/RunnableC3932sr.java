package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.sr, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3932sr implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f34942n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C3986tr f34943u;

    public /* synthetic */ RunnableC3932sr(C3986tr c3986tr, int i) {
        this.f34942n = i;
        this.f34943u = c3986tr;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f34942n) {
            case 0:
                this.f34943u.c();
                break;
            case 1:
                this.f34943u.c();
                break;
            default:
                C3986tr c3986tr = this.f34943u;
                c3986tr.getClass();
                c3986tr.f35183f.execute(new RunnableC3932sr(c3986tr, 1));
                break;
        }
    }
}
