package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class J7 extends Q7 {

    /* renamed from: h, reason: collision with root package name */
    public final long f26402h;

    public J7(C4219y7 c4219y7, C4002u6 c4002u6, long j6, int i) {
        super(c4219y7, "y0L1OSEMWW8/imV1M3pvQITWJfkGk5GAMqJuL5aNLdq8sTbK6BFpI8/D5pLc65zr", "dBSRUGPKY8JzIPoAEV0GB9RkRHGvAJPAM3BhqN1QQjE=", c4002u6, i, 25);
        this.f26402h = j6;
    }

    @Override // com.google.android.gms.internal.ads.Q7
    public final void a() {
        long longValue = ((Long) this.f27770e.invoke(null, new Object[0])).longValue();
        C4002u6 c4002u6 = this.f27769d;
        synchronized (c4002u6) {
            c4002u6.h();
            ((H6) c4002u6.f28504u).n0(longValue);
            long j6 = this.f26402h;
            if (j6 != 0) {
                c4002u6.h();
                ((H6) c4002u6.f28504u).O0(longValue - j6);
                c4002u6.h();
                ((H6) c4002u6.f28504u).R0(j6);
            }
        }
    }
}
