package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class O7 extends Q7 {

    /* renamed from: h, reason: collision with root package name */
    public final C7 f26589h;
    public final long i;

    public O7(C4196y7 c4196y7, C3979u6 c3979u6, int i, C7 c72) {
        super(c4196y7, "CX4J+2yEJ2HtJzNjBSAFoPZxV3S124qFqsrwrEik3kHdsHRX3oIIB4d/zi0EQ0fu", "gfLiyhD2OvLSOj6bwf+kcmK11rwQ90aeBshxHD6xXgk=", c3979u6, i, 53);
        this.f26589h = c72;
        if (c72 != null) {
            if (c72.f24047E <= -2) {
                WeakReference weakReference = c72.f24043A;
                if ((weakReference != null ? (View) weakReference.get() : null) == null) {
                    c72.f24047E = -3L;
                }
            }
            this.i = c72.f24047E;
        }
    }

    @Override // com.google.android.gms.internal.ads.Q7
    public final void a() {
        if (this.f26589h != null) {
            long longValue = ((Long) this.f26983e.invoke(null, Long.valueOf(this.i))).longValue();
            C3979u6 c3979u6 = this.f26982d;
            c3979u6.h();
            ((H6) c3979u6.f27721u).S(longValue);
        }
    }
}
