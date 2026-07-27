package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Qi, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2742Qi implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f27200n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C2776Si f27201u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f27202v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f27203w;

    public /* synthetic */ RunnableC2742Qi(C2776Si c2776Si, int i, int i4, int i9) {
        this.f27200n = i9;
        this.f27201u = c2776Si;
        this.f27202v = i;
        this.f27203w = i4;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f27200n) {
            case 0:
                C2776Si c2776Si = this.f27201u;
                c2776Si.getClass();
                c2776Si.f27603u.execute(new RunnableC2742Qi(c2776Si, this.f27202v, this.f27203w, 1));
                break;
            default:
                this.f27201u.d(this.f27202v - 1, this.f27203w);
                break;
        }
    }
}
