package com.google.android.gms.internal.ads;

import android.net.NetworkCapabilities;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class M7 extends Q7 {

    /* renamed from: h, reason: collision with root package name */
    public final C3680o7 f27038h;
    public final long i;

    /* renamed from: j, reason: collision with root package name */
    public final long f27039j;

    public M7(C4219y7 c4219y7, C4002u6 c4002u6, int i, C3680o7 c3680o7, long j6, long j9) {
        super(c4219y7, "0RGuaC1LZ8p4RZIWK5IFPvVh1XqX7pdLKGQgqTXZ1mkub6VwNtebK8xyUGpHkvMn", "mIcXOfgrOloP6pQFjXZ3aL2iJ7mq+own2SaqzDvu6Tk=", c4002u6, i, 11);
        this.f27038h = c3680o7;
        this.i = j6;
        this.f27039j = j9;
    }

    @Override // com.google.android.gms.internal.ads.Q7
    public final void a() {
        C3680o7 c3680o7 = this.f27038h;
        if (c3680o7 != null) {
            String str = (String) this.f27770e.invoke(null, (NetworkCapabilities) c3680o7.f33649u, Long.valueOf(this.i), Long.valueOf(this.f27039j));
            C3626n7 c3626n7 = new C3626n7();
            HashMap p9 = MA.p(str);
            if (p9 != null) {
                c3626n7.f33465K = (Long) p9.get(0);
                c3626n7.f33466L = (Long) p9.get(1);
                c3626n7.f33467M = (Long) p9.get(2);
            }
            C4002u6 c4002u6 = this.f27769d;
            synchronized (c4002u6) {
                try {
                    long longValue = c3626n7.f33465K.longValue();
                    c4002u6.h();
                    ((H6) c4002u6.f28504u).J0(longValue);
                    if (((Long) c3626n7.f33466L).longValue() >= 0) {
                        long longValue2 = ((Long) c3626n7.f33466L).longValue();
                        c4002u6.h();
                        ((H6) c4002u6.f28504u).h0(longValue2);
                    }
                    if (((Long) c3626n7.f33467M).longValue() >= 0) {
                        long longValue3 = ((Long) c3626n7.f33467M).longValue();
                        c4002u6.h();
                        ((H6) c4002u6.f28504u).i0(longValue3);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
