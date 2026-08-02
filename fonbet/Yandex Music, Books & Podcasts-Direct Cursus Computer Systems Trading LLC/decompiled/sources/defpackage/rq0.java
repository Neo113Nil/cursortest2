package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.f;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public abstract class rq0 {
    public static final qhp a = new qhp(new f48(3));
    public static final int b = -100;
    public static dqg c = null;
    public static dqg d = null;
    public static Boolean e = null;
    public static boolean f = false;
    public static final cz0 g = new cz0(0);
    public static final Object h = new Object();
    public static final Object i = new Object();

    public static void b() {
        dqg dqgVar;
        cz0 cz0Var = g;
        cz0Var.getClass();
        ty0 ty0Var = new ty0(cz0Var);
        while (ty0Var.hasNext()) {
            rq0 rq0Var = (rq0) ((WeakReference) ty0Var.next()).get();
            if (rq0Var != null) {
                er0 er0Var = (er0) rq0Var;
                Context context = er0Var.k;
                if (f(context) && (dqgVar = c) != null && !dqgVar.equals(d)) {
                    a.execute(new oq0(context, 1));
                }
                er0Var.r(true, true);
            }
        }
    }

    public static Object c() {
        Context context;
        cz0 cz0Var = g;
        cz0Var.getClass();
        ty0 ty0Var = new ty0(cz0Var);
        while (ty0Var.hasNext()) {
            rq0 rq0Var = (rq0) ((WeakReference) ty0Var.next()).get();
            if (rq0Var != null && (context = ((er0) rq0Var).k) != null) {
                return context.getSystemService(CommonUrlParts.LOCALE);
            }
        }
        return null;
    }

    public static boolean f(Context context) {
        if (e == null) {
            try {
                int i2 = gu0.a;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) gu0.class), fu0.a() | 128).metaData;
                if (bundle != null) {
                    e = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                e = Boolean.FALSE;
            }
        }
        return e.booleanValue();
    }

    public static void i(er0 er0Var) {
        synchronized (h) {
            try {
                cz0 cz0Var = g;
                cz0Var.getClass();
                ty0 ty0Var = new ty0(cz0Var);
                while (ty0Var.hasNext()) {
                    rq0 rq0Var = (rq0) ((WeakReference) ty0Var.next()).get();
                    if (rq0Var == er0Var || rq0Var == null) {
                        ty0Var.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void q(Context context) {
        if (f(context)) {
            if (Build.VERSION.SDK_INT >= 33) {
                if (f) {
                    return;
                }
                a.execute(new oq0(context, 0));
                return;
            }
            synchronized (i) {
                try {
                    dqg dqgVar = c;
                    if (dqgVar == null) {
                        if (d == null) {
                            d = dqg.a(f.e(context));
                        }
                        if (d.c()) {
                        } else {
                            c = d;
                        }
                    } else if (!dqgVar.equals(d)) {
                        dqg dqgVar2 = c;
                        d = dqgVar2;
                        f.d(context, dqgVar2.a.a.toLanguageTags());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public abstract void d();

    public abstract void e();

    public abstract void g();

    public abstract void h();

    public abstract boolean j(int i2);

    public abstract void k(int i2);

    public abstract void l(View view);

    public abstract void m(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void n(int i2);

    public abstract void o(CharSequence charSequence);

    public abstract ig p(hg hgVar);
}
