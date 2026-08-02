package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.mt, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3611mt implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f33400n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ BinderC3665nt f33401u;

    public /* synthetic */ RunnableC3611mt(BinderC3665nt binderC3665nt, int i) {
        this.f33400n = i;
        this.f33401u = binderC3665nt;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f33400n) {
            case 0:
                BinderC3665nt binderC3665nt = this.f33401u;
                binderC3665nt.f33584n.b().execute(new RunnableC3611mt(binderC3665nt, 1));
                break;
            default:
                this.f33401u.U3(5);
                break;
        }
    }
}
