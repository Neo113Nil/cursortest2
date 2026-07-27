package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.mt, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3601mt implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f32770n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ BinderC3655nt f32771u;

    public /* synthetic */ RunnableC3601mt(BinderC3655nt binderC3655nt, int i) {
        this.f32770n = i;
        this.f32771u = binderC3655nt;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f32770n) {
            case 0:
                BinderC3655nt binderC3655nt = this.f32771u;
                binderC3655nt.f33057n.b().execute(new RunnableC3601mt(binderC3655nt, 1));
                break;
            default:
                this.f32771u.G3(5);
                break;
        }
    }
}
