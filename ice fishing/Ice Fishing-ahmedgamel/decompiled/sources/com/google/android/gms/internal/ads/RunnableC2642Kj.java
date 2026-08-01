package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Kj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2642Kj implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f25964n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C3864s f25965u;

    public /* synthetic */ RunnableC2642Kj(C3864s c3864s, int i) {
        this.f25964n = i;
        this.f25965u = c3864s;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f25964n) {
            case 0:
                this.f25965u.w(new C3208fp(3));
                break;
            default:
                ((Dr) ((C3481ku) ((T8) this.f25965u.f33790y).f27697v).f31664v).h();
                break;
        }
    }
}
