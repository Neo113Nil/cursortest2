package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class M7 extends P7 {

    /* renamed from: h, reason: collision with root package name */
    public final boolean f26305h;

    public M7(C4101w7 c4101w7, C3830r6 c3830r6, int i) {
        super(c4101w7, "NrTiKoqiGsnW0YmEvrYFxN8MEHR3HtreklnLu5ZS2/gdKln4kN9VtqKQ3DYD1lNw", "GRpsnBes2qRtyDPKutW4bBWph7anTp6FUrz2DgBHtv0=", c3830r6, i, 61);
        this.f26305h = c4101w7.f34942o.f33968a;
    }

    @Override // com.google.android.gms.internal.ads.P7
    public final void a() {
        long longValue = ((Long) this.f26845e.invoke(null, this.f26841a.f34929a, Boolean.valueOf(this.f26305h))).longValue();
        C3830r6 c3830r6 = this.f26844d;
        synchronized (c3830r6) {
            c3830r6.h();
            ((D6) c3830r6.f30000u).b0(longValue);
        }
    }
}
