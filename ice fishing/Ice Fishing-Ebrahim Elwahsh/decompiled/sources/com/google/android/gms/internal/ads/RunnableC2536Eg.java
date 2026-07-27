package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Eg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2536Eg implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f24781n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f24782u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ long f24783v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f24784w;

    public /* synthetic */ RunnableC2536Eg(Object obj, boolean z8, long j9, int i) {
        this.f24781n = i;
        this.f24784w = obj;
        this.f24782u = z8;
        this.f24783v = j9;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f24781n) {
            case 0:
                ((TextureViewSurfaceTextureListenerC2553Fg) this.f24784w).f24987v.M0(this.f24783v, this.f24782u);
                break;
            default:
                ((InterfaceC3858rh) this.f24784w).M0(this.f24783v, this.f24782u);
                break;
        }
    }
}
