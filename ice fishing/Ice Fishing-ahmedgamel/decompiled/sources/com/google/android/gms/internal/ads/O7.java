package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class O7 extends Q7 {

    /* renamed from: h, reason: collision with root package name */
    public final C7 f27371h;
    public final long i;

    public O7(C4219y7 c4219y7, C4002u6 c4002u6, int i, C7 c72) {
        super(c4219y7, "CX4J+2yEJ2HtJzNjBSAFoPZxV3S124qFqsrwrEik3kHdsHRX3oIIB4d/zi0EQ0fu", "gfLiyhD2OvLSOj6bwf+kcmK11rwQ90aeBshxHD6xXgk=", c4002u6, i, 53);
        this.f27371h = c72;
        if (c72 != null) {
            if (c72.f24810E <= -2) {
                WeakReference weakReference = c72.f24806A;
                if ((weakReference != null ? (View) weakReference.get() : null) == null) {
                    c72.f24810E = -3L;
                }
            }
            this.i = c72.f24810E;
        }
    }

    @Override // com.google.android.gms.internal.ads.Q7
    public final void a() {
        if (this.f27371h != null) {
            long longValue = ((Long) this.f27770e.invoke(null, Long.valueOf(this.i))).longValue();
            C4002u6 c4002u6 = this.f27769d;
            c4002u6.h();
            ((H6) c4002u6.f28504u).S(longValue);
        }
    }
}
