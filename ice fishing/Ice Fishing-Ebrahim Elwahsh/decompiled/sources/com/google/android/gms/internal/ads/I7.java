package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class I7 extends P7 {

    /* renamed from: h, reason: collision with root package name */
    public final long f25530h;

    public I7(C4101w7 c4101w7, C3830r6 c3830r6, long j9, int i) {
        super(c4101w7, "y0L1OSEMWW8/imV1M3pvQITWJfkGk5GAMqJuL5aNLdq8sTbK6BFpI8/D5pLc65zr", "dBSRUGPKY8JzIPoAEV0GB9RkRHGvAJPAM3BhqN1QQjE=", c3830r6, i, 25);
        this.f25530h = j9;
    }

    @Override // com.google.android.gms.internal.ads.P7
    public final void a() {
        long longValue = ((Long) this.f26845e.invoke(null, new Object[0])).longValue();
        C3830r6 c3830r6 = this.f26844d;
        synchronized (c3830r6) {
            c3830r6.h();
            ((D6) c3830r6.f30000u).n0(longValue);
            long j9 = this.f25530h;
            if (j9 != 0) {
                c3830r6.h();
                ((D6) c3830r6.f30000u).O0(longValue - j9);
                c3830r6.h();
                ((D6) c3830r6.f30000u).R0(j9);
            }
        }
    }
}
