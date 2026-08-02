package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final /* synthetic */ class Av implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f24538n = 1;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Cv f24539u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f24540v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Fv f24541w;

    public /* synthetic */ Av(Cv cv, int i, Fv fv) {
        this.f24539u = cv;
        this.f24540v = i;
        this.f24541w = fv;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f24538n) {
            case 0:
                this.f24539u.n(this.f24541w, this.f24540v);
                break;
            default:
                Cv cv = this.f24539u;
                int i = this.f24540v;
                if (i > 0) {
                    cv.n(this.f24541w, i);
                }
                cv.k(0L);
                break;
        }
    }

    public /* synthetic */ Av(Cv cv, Fv fv, int i) {
        this.f24539u = cv;
        this.f24541w = fv;
        this.f24540v = i;
    }
}
