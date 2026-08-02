package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Kj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2662Kj implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f26742n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C3887s f26743u;

    public /* synthetic */ RunnableC2662Kj(C3887s c3887s, int i) {
        this.f26742n = i;
        this.f26743u = c3887s;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f26742n) {
            case 0:
                this.f26743u.w(new C3231fp(3));
                break;
            default:
                ((Dr) ((C3504ku) ((T8) this.f26743u.f34558y).f28480v).f32446v).h();
                break;
        }
    }
}
