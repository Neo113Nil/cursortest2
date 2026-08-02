package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.pm, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3766pm implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f33913n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C3873rm f33914u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ AbstractBinderC3359i8 f33915v;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ RunnableC3766pm(C3873rm c3873rm, InterfaceViewOnClickListenerC2750Pm interfaceViewOnClickListenerC2750Pm, int i) {
        this.f33913n = i;
        switch (i) {
            case 1:
                this.f33914u = c3873rm;
                this.f33915v = (AbstractBinderC3359i8) interfaceViewOnClickListenerC2750Pm;
                break;
            default:
                this.f33914u = c3873rm;
                this.f33915v = (AbstractBinderC3359i8) interfaceViewOnClickListenerC2750Pm;
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.ads.Pm, com.google.android.gms.internal.ads.i8] */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.android.gms.internal.ads.Pm, com.google.android.gms.internal.ads.i8] */
    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f33913n) {
            case 0:
                this.f33914u.g(this.f33915v);
                break;
            default:
                this.f33914u.h(this.f33915v);
                break;
        }
    }
}
