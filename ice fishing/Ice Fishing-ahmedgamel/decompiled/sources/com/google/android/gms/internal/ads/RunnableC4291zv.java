package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.zv, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC4291zv implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f35472n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Cv f35473u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Fv f35474v;

    public /* synthetic */ RunnableC4291zv(Cv cv, Fv fv, int i) {
        this.f35472n = i;
        this.f35473u = cv;
        this.f35474v = fv;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f35472n) {
            case 0:
                this.f35473u.n(this.f35474v, 1);
                break;
            default:
                Fv fv = this.f35474v;
                Cv cv = this.f35473u;
                if (!cv.f24265b.get() && fv.t() == 0 && fv.u()) {
                    fv.k();
                }
                cv.k(((Long) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32223d0)).longValue());
                break;
        }
    }
}
