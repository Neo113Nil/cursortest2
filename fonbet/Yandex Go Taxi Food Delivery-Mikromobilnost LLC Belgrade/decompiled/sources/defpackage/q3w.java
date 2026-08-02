package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public class q3w {
    public static Context a;
    public static Boolean b;

    public static synchronized boolean a(Context context) {
        Boolean bool;
        synchronized (q3w.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = a;
            if (context2 != null && (bool = b) != null && context2 == applicationContext) {
                return bool.booleanValue();
            }
            b = null;
            Boolean valueOf = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
            b = valueOf;
            a = applicationContext;
            return valueOf.booleanValue();
        }
    }
}
