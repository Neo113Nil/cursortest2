package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class N7 extends Q7 {

    /* renamed from: h, reason: collision with root package name */
    public final boolean f26469h;

    public N7(C4196y7 c4196y7, C3979u6 c3979u6, int i) {
        super(c4196y7, "NrTiKoqiGsnW0YmEvrYFxN8MEHR3HtreklnLu5ZS2/gdKln4kN9VtqKQ3DYD1lNw", "GRpsnBes2qRtyDPKutW4bBWph7anTp6FUrz2DgBHtv0=", c3979u6, i, 61);
        this.f26469h = c4196y7.f35108o.f34220a;
    }

    @Override // com.google.android.gms.internal.ads.Q7
    public final void a() {
        long longValue = ((Long) this.f26983e.invoke(null, this.f26979a.f35095a, Boolean.valueOf(this.f26469h))).longValue();
        C3979u6 c3979u6 = this.f26982d;
        synchronized (c3979u6) {
            c3979u6.h();
            ((H6) c3979u6.f27721u).b0(longValue);
        }
    }
}
