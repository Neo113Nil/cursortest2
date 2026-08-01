package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final /* synthetic */ class Av implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f23766n = 1;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Cv f23767u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f23768v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Fv f23769w;

    public /* synthetic */ Av(Cv cv, int i, Fv fv) {
        this.f23767u = cv;
        this.f23768v = i;
        this.f23769w = fv;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f23766n) {
            case 0:
                this.f23767u.n(this.f23769w, this.f23768v);
                break;
            default:
                Cv cv = this.f23767u;
                int i = this.f23768v;
                if (i > 0) {
                    cv.n(this.f23769w, i);
                }
                cv.k(0L);
                break;
        }
    }

    public /* synthetic */ Av(Cv cv, Fv fv, int i) {
        this.f23767u = cv;
        this.f23769w = fv;
        this.f23768v = i;
    }
}
