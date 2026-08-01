package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.mt, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3588mt implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f32622n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ BinderC3642nt f32623u;

    public /* synthetic */ RunnableC3588mt(BinderC3642nt binderC3642nt, int i) {
        this.f32622n = i;
        this.f32623u = binderC3642nt;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f32622n) {
            case 0:
                BinderC3642nt binderC3642nt = this.f32623u;
                binderC3642nt.f32797n.b().execute(new RunnableC3588mt(binderC3642nt, 1));
                break;
            default:
                this.f32623u.U3(5);
                break;
        }
    }
}
