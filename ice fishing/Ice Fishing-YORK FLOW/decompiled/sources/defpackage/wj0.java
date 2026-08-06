package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public abstract class wj0 {
    public static final defpackage.s40 ZpBGe2uQfcn8;

    static {
        java.lang.String str;
        int i = defpackage.xi1.ZpBGe2uQfcn8;
        java.lang.Object obj = null;
        try {
            str = java.lang.System.getProperty("kotlinx.coroutines.fast.service.loader");
        } catch (java.lang.SecurityException unused) {
            str = null;
        }
        if (str != null) {
            java.lang.Boolean.parseBoolean(str);
        }
        try {
            java.util.Iterator it = defpackage.fc1.xahdJg25P1Bv(defpackage.fc1.hH0RRJrNssvh(java.util.Arrays.asList(new defpackage.f1()).iterator())).iterator();
            if (it.hasNext()) {
                obj = it.next();
                if (it.hasNext()) {
                    ((defpackage.f1) obj).getClass();
                    do {
                        ((defpackage.f1) it.next()).getClass();
                    } while (it.hasNext());
                }
            }
            if (((defpackage.f1) obj) == null) {
                defpackage.h7.P05cfTpS5W5L("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
                return;
            }
            android.os.Looper mainLooper = android.os.Looper.getMainLooper();
            if (mainLooper != null) {
                ZpBGe2uQfcn8 = new defpackage.s40(defpackage.t40.ZpBGe2uQfcn8(mainLooper));
            } else {
                defpackage.h7.P05cfTpS5W5L("The main looper is not available");
            }
        } catch (java.lang.Throwable th) {
            throw new java.util.ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
