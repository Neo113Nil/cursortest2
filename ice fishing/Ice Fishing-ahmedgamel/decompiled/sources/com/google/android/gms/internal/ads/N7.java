package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class N7 extends Q7 {

    /* renamed from: h, reason: collision with root package name */
    public final boolean f27253h;

    public N7(C4219y7 c4219y7, C4002u6 c4002u6, int i) {
        super(c4219y7, "NrTiKoqiGsnW0YmEvrYFxN8MEHR3HtreklnLu5ZS2/gdKln4kN9VtqKQ3DYD1lNw", "GRpsnBes2qRtyDPKutW4bBWph7anTp6FUrz2DgBHtv0=", c4002u6, i, 61);
        this.f27253h = c4219y7.f35894o.f35006a;
    }

    @Override // com.google.android.gms.internal.ads.Q7
    public final void a() {
        long longValue = ((Long) this.f27770e.invoke(null, this.f27766a.f35881a, Boolean.valueOf(this.f27253h))).longValue();
        C4002u6 c4002u6 = this.f27769d;
        synchronized (c4002u6) {
            c4002u6.h();
            ((H6) c4002u6.f28504u).b0(longValue);
        }
    }
}
