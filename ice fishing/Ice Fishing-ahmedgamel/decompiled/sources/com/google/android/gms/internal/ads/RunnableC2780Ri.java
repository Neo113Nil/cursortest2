package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Ri, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2780Ri implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f28003n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C2814Ti f28004u;

    public /* synthetic */ RunnableC2780Ri(C2814Ti c2814Ti, int i) {
        this.f28003n = i;
        this.f28004u = c2814Ti;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f28003n) {
            case 0:
                C2814Ti c2814Ti = this.f28004u;
                c2814Ti.getClass();
                c2814Ti.f28565u.execute(new RunnableC2780Ri(c2814Ti, 1));
                break;
            default:
                this.f28004u.f();
                break;
        }
    }
}
