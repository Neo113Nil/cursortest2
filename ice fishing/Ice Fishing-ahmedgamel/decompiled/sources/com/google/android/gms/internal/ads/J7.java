package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class J7 extends Q7 {

    /* renamed from: h, reason: collision with root package name */
    public final long f25649h;

    public J7(C4196y7 c4196y7, C3979u6 c3979u6, long j6, int i) {
        super(c4196y7, "y0L1OSEMWW8/imV1M3pvQITWJfkGk5GAMqJuL5aNLdq8sTbK6BFpI8/D5pLc65zr", "dBSRUGPKY8JzIPoAEV0GB9RkRHGvAJPAM3BhqN1QQjE=", c3979u6, i, 25);
        this.f25649h = j6;
    }

    @Override // com.google.android.gms.internal.ads.Q7
    public final void a() {
        long longValue = ((Long) this.f26983e.invoke(null, new Object[0])).longValue();
        C3979u6 c3979u6 = this.f26982d;
        synchronized (c3979u6) {
            c3979u6.h();
            ((H6) c3979u6.f27721u).n0(longValue);
            long j6 = this.f25649h;
            if (j6 != 0) {
                c3979u6.h();
                ((H6) c3979u6.f27721u).O0(longValue - j6);
                c3979u6.h();
                ((H6) c3979u6.f27721u).R0(j6);
            }
        }
    }
}
