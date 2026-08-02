package io.appmetrica.analytics.impl;

/* loaded from: classes4.dex */
public final class L6 extends AbstractC0584o5 {
    public L6(String str, double d) {
        super(2, str, Double.valueOf(d), new C0332fd(), new C0555n5(new C0823wd(new C0382h5(100))));
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0584o5
    public final void a(Ir ir) {
        Kr kr = ir.d;
        kr.c = ((Double) this.f).doubleValue() + kr.c;
    }
}
