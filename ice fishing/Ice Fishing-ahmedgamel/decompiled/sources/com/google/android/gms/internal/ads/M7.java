package com.google.android.gms.internal.ads;

import android.net.NetworkCapabilities;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class M7 extends Q7 {

    /* renamed from: h, reason: collision with root package name */
    public final C3657o7 f26247h;
    public final long i;

    /* renamed from: j, reason: collision with root package name */
    public final long f26248j;

    public M7(C4196y7 c4196y7, C3979u6 c3979u6, int i, C3657o7 c3657o7, long j6, long j9) {
        super(c4196y7, "0RGuaC1LZ8p4RZIWK5IFPvVh1XqX7pdLKGQgqTXZ1mkub6VwNtebK8xyUGpHkvMn", "mIcXOfgrOloP6pQFjXZ3aL2iJ7mq+own2SaqzDvu6Tk=", c3979u6, i, 11);
        this.f26247h = c3657o7;
        this.i = j6;
        this.f26248j = j9;
    }

    @Override // com.google.android.gms.internal.ads.Q7
    public final void a() {
        C3657o7 c3657o7 = this.f26247h;
        if (c3657o7 != null) {
            String str = (String) this.f26983e.invoke(null, (NetworkCapabilities) c3657o7.f32862u, Long.valueOf(this.i), Long.valueOf(this.f26248j));
            C3603n7 c3603n7 = new C3603n7();
            HashMap p9 = MA.p(str);
            if (p9 != null) {
                c3603n7.f32687K = (Long) p9.get(0);
                c3603n7.f32688L = (Long) p9.get(1);
                c3603n7.f32689M = (Long) p9.get(2);
            }
            C3979u6 c3979u6 = this.f26982d;
            synchronized (c3979u6) {
                try {
                    long longValue = c3603n7.f32687K.longValue();
                    c3979u6.h();
                    ((H6) c3979u6.f27721u).J0(longValue);
                    if (((Long) c3603n7.f32688L).longValue() >= 0) {
                        long longValue2 = ((Long) c3603n7.f32688L).longValue();
                        c3979u6.h();
                        ((H6) c3979u6.f27721u).h0(longValue2);
                    }
                    if (((Long) c3603n7.f32689M).longValue() >= 0) {
                        long longValue3 = ((Long) c3603n7.f32689M).longValue();
                        c3979u6.h();
                        ((H6) c3979u6.f27721u).i0(longValue3);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
