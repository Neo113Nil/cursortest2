package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import yads.i1;

/* loaded from: classes7.dex */
public final class tb71 {
    public static final tb71 a = new tb71();
    public static i1 b;

    public static final Activity a() {
        Activity a2;
        synchronized (a) {
            i1 i1Var = b;
            a2 = i1Var != null ? i1Var.a() : null;
        }
        return a2;
    }

    public static final void b(Context context) {
        synchronized (a) {
            try {
                if (b == null) {
                    Context applicationContext = context.getApplicationContext();
                    Activity activity = null;
                    Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                    if (application != null) {
                        Activity activity2 = context instanceof Activity ? (Activity) context : null;
                        if (activity2 != null && !activity2.isFinishing() && !activity2.isDestroyed()) {
                            activity = activity2;
                        }
                        i1 i1Var = new i1(activity);
                        b = i1Var;
                        application.registerActivityLifecycleCallbacks(i1Var);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
