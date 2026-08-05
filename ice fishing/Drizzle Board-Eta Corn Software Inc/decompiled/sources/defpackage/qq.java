package defpackage;

import android.os.Looper;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public abstract class qq {
    public static final em qoPGr6Ce;

    static {
        String str;
        int i = eb0.qoPGr6Ce;
        Object obj = null;
        try {
            str = System.getProperty("kotlinx.coroutines.fast.service.loader");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null) {
            Boolean.parseBoolean(str);
        }
        try {
            Iterator it = l60.FySoLYna(l60.I5GHvsYW(Arrays.asList(new CQoUvMBt()).iterator())).iterator();
            if (it.hasNext()) {
                obj = it.next();
                if (it.hasNext()) {
                    ((CQoUvMBt) obj).getClass();
                    do {
                        ((CQoUvMBt) it.next()).getClass();
                    } while (it.hasNext());
                }
            }
            if (((CQoUvMBt) obj) == null) {
                m1.Ey6iv0m0("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
                return;
            }
            Looper mainLooper = Looper.getMainLooper();
            if (mainLooper != null) {
                qoPGr6Ce = new em(fm.qoPGr6Ce(mainLooper), false);
            } else {
                m1.Ey6iv0m0("The main looper is not available");
            }
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
