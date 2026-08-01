package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final /* synthetic */ class Bv implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f23984n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Cv f23985u;

    public /* synthetic */ Bv(Cv cv, int i) {
        this.f23984n = i;
        this.f23985u = cv;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23984n) {
            case 0:
                this.f23985u.l();
                break;
            case 1:
                this.f23985u.l();
                break;
            case 2:
                this.f23985u.l();
                break;
            case 3:
                this.f23985u.l();
                break;
            default:
                Cv cv = this.f23985u;
                cv.f24265b.set(false);
                cv.l();
                break;
        }
    }
}
