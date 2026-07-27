package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class F implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f24699n;

    /* renamed from: u, reason: collision with root package name */
    public final CQ f24700u;

    public /* synthetic */ F(CQ cq, int i) {
        this.f24699n = i;
        this.f24700u = cq;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [com.google.android.gms.internal.ads.mQ, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f24699n) {
            case 0:
                CQ cq = this.f24700u;
                for (HQ hq : cq.f24128L) {
                    hq.k(true);
                    if (hq.f25308g != null) {
                        hq.f25308g = null;
                        hq.f25307f = null;
                    }
                }
                C4274ze c4274ze = cq.f24121D;
                Q0 q02 = (Q0) c4274ze.f35361v;
                if (q02 != null) {
                    q02.e();
                    c4274ze.f35361v = null;
                }
                c4274ze.f35362w = null;
                break;
            case 1:
                CQ cq2 = this.f24700u;
                if (!cq2.f24149t0) {
                    ?? r12 = cq2.f24126I;
                    r12.getClass();
                    r12.j(cq2);
                    break;
                }
                break;
            case 2:
                this.f24700u.f24143n0 = true;
                break;
            default:
                this.f24700u.r();
                break;
        }
    }
}
