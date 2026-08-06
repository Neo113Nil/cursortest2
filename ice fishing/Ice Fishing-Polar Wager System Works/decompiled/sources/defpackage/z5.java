package defpackage;

/* loaded from: classes.dex */
public final class z5 implements defpackage.a20 {
    public final defpackage.c1NqjJifC7 AARZUJiTa;
    public volatile defpackage.xk adDC3e2L;
    public final java.lang.Object xiZrDbcSW0 = new java.lang.Object();

    public z5(defpackage.c1NqjJifC7 c1nqjjifc7) {
        this.AARZUJiTa = c1nqjjifc7;
    }

    @Override // defpackage.a20
    public final java.lang.Object F7NU4MC0GW() {
        if (this.adDC3e2L == null) {
            synchronized (this.xiZrDbcSW0) {
                try {
                    if (this.adDC3e2L == null) {
                        this.adDC3e2L = new defpackage.xk(new defpackage.a6((com.corsair.ledger.CorsairApp) this.AARZUJiTa.xiZrDbcSW0, false));
                    }
                } finally {
                }
            }
        }
        return this.adDC3e2L;
    }
}
