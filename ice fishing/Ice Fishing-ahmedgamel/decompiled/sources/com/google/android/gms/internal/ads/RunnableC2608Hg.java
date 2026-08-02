package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Hg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2608Hg implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f26092n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f26093u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ long f26094v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f26095w;

    public /* synthetic */ RunnableC2608Hg(Object obj, boolean z6, long j6, int i) {
        this.f26092n = i;
        this.f26095w = obj;
        this.f26093u = z6;
        this.f26094v = j6;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f26092n) {
            case 0:
                ((TextureViewSurfaceTextureListenerC2625Ig) this.f26095w).f26288v.M0(this.f26094v, this.f26093u);
                break;
            default:
                ((InterfaceC4084vh) this.f26095w).M0(this.f26094v, this.f26093u);
                break;
        }
    }
}
