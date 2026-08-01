package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Hg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2588Hg implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f25339n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f25340u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ long f25341v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f25342w;

    public /* synthetic */ RunnableC2588Hg(Object obj, boolean z3, long j6, int i) {
        this.f25339n = i;
        this.f25342w = obj;
        this.f25340u = z3;
        this.f25341v = j6;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f25339n) {
            case 0:
                ((TextureViewSurfaceTextureListenerC2605Ig) this.f25342w).f25539v.N0(this.f25341v, this.f25340u);
                break;
            default:
                ((InterfaceC4061vh) this.f25342w).N0(this.f25341v, this.f25340u);
                break;
        }
    }
}
