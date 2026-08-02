package kotlin;

import defpackage.i3y;
import defpackage.sls;
import defpackage.w4y;
import defpackage.w511;

/* loaded from: classes9.dex */
public class a {
    public static i3y a(sls slsVar) {
        return new SynchronizedLazyImpl(slsVar);
    }

    public static i3y b(LazyThreadSafetyMode lazyThreadSafetyMode, sls slsVar) {
        int i = w4y.a[lazyThreadSafetyMode.ordinal()];
        if (i == 1) {
            return new SynchronizedLazyImpl(slsVar);
        }
        if (i == 2) {
            return new SafePublicationLazyImpl(slsVar);
        }
        if (i == 3) {
            return new UnsafeLazyImpl(slsVar);
        }
        w511.b();
        return null;
    }
}
