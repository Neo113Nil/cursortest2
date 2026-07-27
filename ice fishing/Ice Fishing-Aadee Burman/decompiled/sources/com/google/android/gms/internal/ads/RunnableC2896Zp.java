package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Zp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2896Zp implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f28969n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Uv f28970u;

    public /* synthetic */ RunnableC2896Zp(Uv uv, int i) {
        this.f28969n = i;
        this.f28970u = uv;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f28969n) {
            case 0:
                this.f28970u.a();
                break;
            default:
                if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32266h6)).booleanValue() && MA.f26253E.f27159u) {
                    this.f28970u.c();
                    break;
                }
                break;
        }
    }
}
