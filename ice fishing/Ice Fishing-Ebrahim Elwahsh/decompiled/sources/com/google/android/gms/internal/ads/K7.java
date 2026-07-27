package com.google.android.gms.internal.ads;

import android.net.NetworkCapabilities;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class K7 extends P7 {

    /* renamed from: h, reason: collision with root package name */
    public final C3562m7 f25938h;
    public final long i;

    /* renamed from: j, reason: collision with root package name */
    public final long f25939j;

    public K7(C4101w7 c4101w7, C3830r6 c3830r6, int i, C3562m7 c3562m7, long j9, long j10) {
        super(c4101w7, "0RGuaC1LZ8p4RZIWK5IFPvVh1XqX7pdLKGQgqTXZ1mkub6VwNtebK8xyUGpHkvMn", "mIcXOfgrOloP6pQFjXZ3aL2iJ7mq+own2SaqzDvu6Tk=", c3830r6, i, 11);
        this.f25938h = c3562m7;
        this.i = j9;
        this.f25939j = j10;
    }

    @Override // com.google.android.gms.internal.ads.P7
    public final void a() {
        C3562m7 c3562m7 = this.f25938h;
        if (c3562m7 != null) {
            String str = (String) this.f26845e.invoke(null, (NetworkCapabilities) c3562m7.f32668u, Long.valueOf(this.i), Long.valueOf(this.f25939j));
            C3508l7 c3508l7 = new C3508l7();
            HashMap o9 = AbstractC2720Pd.o(str);
            if (o9 != null) {
                c3508l7.J = (Long) o9.get(0);
                c3508l7.f32542K = (Long) o9.get(1);
                c3508l7.f32543L = (Long) o9.get(2);
            }
            C3830r6 c3830r6 = this.f26844d;
            synchronized (c3830r6) {
                try {
                    long longValue = c3508l7.J.longValue();
                    c3830r6.h();
                    ((D6) c3830r6.f30000u).J0(longValue);
                    if (((Long) c3508l7.f32542K).longValue() >= 0) {
                        long longValue2 = ((Long) c3508l7.f32542K).longValue();
                        c3830r6.h();
                        ((D6) c3830r6.f30000u).h0(longValue2);
                    }
                    if (((Long) c3508l7.f32543L).longValue() >= 0) {
                        long longValue3 = ((Long) c3508l7.f32543L).longValue();
                        c3830r6.h();
                        ((D6) c3830r6.f30000u).i0(longValue3);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
