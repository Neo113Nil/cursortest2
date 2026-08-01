package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.sr, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3909sr implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f34156n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C3963tr f34157u;

    public /* synthetic */ RunnableC3909sr(C3963tr c3963tr, int i) {
        this.f34156n = i;
        this.f34157u = c3963tr;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f34156n) {
            case 0:
                this.f34157u.c();
                break;
            case 1:
                this.f34157u.c();
                break;
            default:
                C3963tr c3963tr = this.f34157u;
                c3963tr.getClass();
                c3963tr.f34409f.execute(new RunnableC3909sr(c3963tr, 1));
                break;
        }
    }
}
