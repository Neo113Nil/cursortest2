package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class E implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f24619n;

    /* renamed from: u, reason: collision with root package name */
    public final PQ f24620u;

    public /* synthetic */ E(PQ pq, int i) {
        this.f24619n = i;
        this.f24620u = pq;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [com.google.android.gms.internal.ads.zQ, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f24619n) {
            case 0:
                PQ pq = this.f24620u;
                for (UQ uq : pq.f26940L) {
                    uq.k(true);
                    if (uq.f28016g != null) {
                        uq.f28016g = null;
                        uq.f28015f = null;
                    }
                }
                C4017ue c4017ue = pq.f26933D;
                O0 o02 = (O0) c4017ue.f34631v;
                if (o02 != null) {
                    o02.f();
                    c4017ue.f34631v = null;
                }
                c4017ue.f34632w = null;
                break;
            case 1:
                PQ pq2 = this.f24620u;
                if (!pq2.f26961t0) {
                    ?? r12 = pq2.f26938I;
                    r12.getClass();
                    r12.e(pq2);
                    break;
                }
                break;
            case 2:
                this.f24620u.f26955n0 = true;
                break;
            default:
                this.f24620u.s();
                break;
        }
    }
}
