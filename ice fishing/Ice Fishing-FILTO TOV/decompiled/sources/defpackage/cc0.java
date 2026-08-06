package defpackage;

import android.os.Looper;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class cc0 {
    public static final dz GWasM1elztuh;

    static {
        String str;
        int i = p71.GWasM1elztuh;
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
            Iterator it = x01.ozMwhSAI(x01.k8h8IjolWQ(Arrays.asList(new g0()).iterator())).iterator();
            if (it.hasNext()) {
                obj = it.next();
                if (it.hasNext()) {
                    ((g0) obj).getClass();
                    do {
                        ((g0) it.next()).getClass();
                    } while (it.hasNext());
                }
            }
            if (((g0) obj) == null) {
                o4.jivtDDk9H("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
                return;
            }
            Looper mainLooper = Looper.getMainLooper();
            if (mainLooper != null) {
                GWasM1elztuh = new dz(ez.GWasM1elztuh(mainLooper));
            } else {
                o4.jivtDDk9H("The main looper is not available");
            }
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
