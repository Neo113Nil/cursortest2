package defpackage;

/* loaded from: classes.dex */
public abstract class jg0 {
    public static final defpackage.e30 IHQe1A4L2xu;

    static {
        java.lang.String str;
        int i = defpackage.oe1.IHQe1A4L2xu;
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
            java.util.Iterator it = defpackage.a81.wll2JLbTBC2(defpackage.a81.p4kuH6PDtgom(java.util.Arrays.asList(new defpackage.y1()).iterator())).iterator();
            if (it.hasNext()) {
                obj = it.next();
                if (it.hasNext()) {
                    ((defpackage.y1) obj).getClass();
                    do {
                        ((defpackage.y1) it.next()).getClass();
                    } while (it.hasNext());
                }
            }
            if (((defpackage.y1) obj) == null) {
                defpackage.db.AARZUJiTa("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
                return;
            }
            android.os.Looper mainLooper = android.os.Looper.getMainLooper();
            if (mainLooper != null) {
                IHQe1A4L2xu = new defpackage.e30(defpackage.f30.IHQe1A4L2xu(mainLooper));
            } else {
                defpackage.db.AARZUJiTa("The main looper is not available");
            }
        } catch (java.lang.Throwable th) {
            throw new java.util.ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
