package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.qh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0695qh extends Rg {
    public C0695qh(X4 x4) {
        super(x4);
    }

    @Override // io.appmetrica.analytics.impl.Rg
    public final boolean a(P5 p5) {
        ((C0527k5) this.f4998a.f5361p).e();
        Rk rk = this.f4998a.f5355j;
        synchronized (rk) {
            try {
                Dk b2 = rk.b(p5);
                if (b2.f4316g) {
                    b2.f4316g = false;
                    Uk uk = b2.f4311b;
                    uk.a(Uk.f5180i, Boolean.FALSE);
                    uk.b();
                }
                if (rk.f5007g != 1) {
                    rk.b(rk.f5006f, p5);
                }
                rk.f5007g = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }
}
