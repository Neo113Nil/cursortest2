package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class F implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f25455n;

    /* renamed from: u, reason: collision with root package name */
    public final FQ f25456u;

    public /* synthetic */ F(FQ fq, int i) {
        this.f25455n = i;
        this.f25456u = fq;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [com.google.android.gms.internal.ads.pQ, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f25455n) {
            case 0:
                FQ fq = this.f25456u;
                for (KQ kq : fq.f25567L) {
                    kq.k(true);
                    if (kq.f26685g != null) {
                        kq.f26685g = null;
                        kq.f26684f = null;
                    }
                }
                C4297ze c4297ze = fq.f25560D;
                Q0 q02 = (Q0) c4297ze.f36134v;
                if (q02 != null) {
                    q02.e();
                    c4297ze.f36134v = null;
                }
                c4297ze.f36135w = null;
                break;
            case 1:
                FQ fq2 = this.f25456u;
                if (!fq2.f25587o0) {
                    ?? r1 = fq2.f25565I;
                    r1.getClass();
                    r1.j(fq2);
                    break;
                }
                break;
            case 2:
                this.f25456u.f25581i0 = true;
                break;
            default:
                this.f25456u.r();
                break;
        }
    }
}
