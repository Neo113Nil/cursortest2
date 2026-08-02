package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final /* synthetic */ class Bv implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f24747n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Cv f24748u;

    public /* synthetic */ Bv(Cv cv, int i) {
        this.f24747n = i;
        this.f24748u = cv;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f24747n) {
            case 0:
                this.f24748u.l();
                break;
            case 1:
                this.f24748u.l();
                break;
            case 2:
                this.f24748u.l();
                break;
            case 3:
                this.f24748u.l();
                break;
            default:
                Cv cv = this.f24748u;
                cv.f25010b.set(false);
                cv.l();
                break;
        }
    }
}
