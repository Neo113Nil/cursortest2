package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.om, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3689om implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f32938n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C3797qm f32939u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ AbstractBinderC3336i8 f32940v;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ RunnableC3689om(C3797qm c3797qm, InterfaceViewOnClickListenerC2713Om interfaceViewOnClickListenerC2713Om, int i) {
        this.f32938n = i;
        switch (i) {
            case 1:
                this.f32939u = c3797qm;
                this.f32940v = (AbstractBinderC3336i8) interfaceViewOnClickListenerC2713Om;
                break;
            default:
                this.f32939u = c3797qm;
                this.f32940v = (AbstractBinderC3336i8) interfaceViewOnClickListenerC2713Om;
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.ads.Om, com.google.android.gms.internal.ads.i8] */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.android.gms.internal.ads.Om, com.google.android.gms.internal.ads.i8] */
    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f32938n) {
            case 0:
                this.f32939u.g(this.f32940v);
                break;
            default:
                this.f32939u.h(this.f32940v);
                break;
        }
    }
}
