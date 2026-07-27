package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Pi, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2725Pi implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f27016n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C2776Si f27017u;

    public /* synthetic */ RunnableC2725Pi(C2776Si c2776Si, int i) {
        this.f27016n = i;
        this.f27017u = c2776Si;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f27016n) {
            case 0:
                C2776Si c2776Si = this.f27017u;
                c2776Si.getClass();
                c2776Si.f27603u.execute(new RunnableC2725Pi(c2776Si, 1));
                break;
            default:
                this.f27017u.o();
                break;
        }
    }
}
