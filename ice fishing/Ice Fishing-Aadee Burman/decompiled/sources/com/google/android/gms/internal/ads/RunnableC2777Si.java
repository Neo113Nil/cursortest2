package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Si, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2777Si implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f27535n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C2793Ti f27536u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f27537v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f27538w;

    public /* synthetic */ RunnableC2777Si(C2793Ti c2793Ti, int i, int i6, int i9) {
        this.f27535n = i9;
        this.f27536u = c2793Ti;
        this.f27537v = i;
        this.f27538w = i6;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f27535n) {
            case 0:
                C2793Ti c2793Ti = this.f27536u;
                c2793Ti.getClass();
                c2793Ti.f27778u.execute(new RunnableC2777Si(c2793Ti, this.f27537v, this.f27538w, 1));
                break;
            default:
                this.f27536u.c(this.f27537v - 1, this.f27538w);
                break;
        }
    }
}
