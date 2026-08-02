package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.zv, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC4314zv implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f36241n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Cv f36242u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Fv f36243v;

    public /* synthetic */ RunnableC4314zv(Cv cv, Fv fv, int i) {
        this.f36241n = i;
        this.f36242u = cv;
        this.f36243v = fv;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f36241n) {
            case 0:
                this.f36242u.n(this.f36243v, 1);
                break;
            default:
                Fv fv = this.f36243v;
                Cv cv = this.f36242u;
                if (!cv.f25010b.get() && fv.t() == 0 && fv.u()) {
                    fv.k();
                }
                cv.k(((Long) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33002d0)).longValue());
                break;
        }
    }
}
