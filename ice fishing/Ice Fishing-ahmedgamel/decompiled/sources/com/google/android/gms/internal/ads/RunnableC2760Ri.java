package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Ri, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2760Ri implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f27319n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C2793Ti f27320u;

    public /* synthetic */ RunnableC2760Ri(C2793Ti c2793Ti, int i) {
        this.f27319n = i;
        this.f27320u = c2793Ti;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f27319n) {
            case 0:
                C2793Ti c2793Ti = this.f27320u;
                c2793Ti.getClass();
                c2793Ti.f27778u.execute(new RunnableC2760Ri(c2793Ti, 1));
                break;
            default:
                this.f27320u.f();
                break;
        }
    }
}
