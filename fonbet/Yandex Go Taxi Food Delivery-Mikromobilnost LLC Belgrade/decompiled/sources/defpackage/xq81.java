package defpackage;

import android.app.Application;
import android.content.Context;
import java.util.WeakHashMap;
import yads.w0;

/* loaded from: classes7.dex */
public final class xq81 {
    public static final Object f = new Object();
    public static volatile xq81 g;
    public final Object a = new Object();
    public final WeakHashMap b = new WeakHashMap();
    public final WeakHashMap c = new WeakHashMap();
    public final w0 d = new w0(this);
    public boolean e;

    public final void a(Context context, qk61 qk61Var) {
        boolean z;
        synchronized (this.a) {
            this.c.put(qk61Var, null);
            synchronized (this.a) {
                z = this.e;
            }
            if (!z) {
                try {
                    ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(this.d);
                    this.e = true;
                } catch (Throwable unused) {
                }
            }
        }
    }

    public final void b(Context context, bi71 bi71Var) {
        boolean z;
        synchronized (this.a) {
            this.b.put(bi71Var, null);
            synchronized (this.a) {
                z = this.e;
            }
            if (!z) {
                try {
                    ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(this.d);
                    this.e = true;
                } catch (Throwable unused) {
                }
            }
        }
    }

    public final void c(Context context) {
        boolean z;
        synchronized (this.a) {
            if (this.b.isEmpty()) {
                if (this.c.isEmpty()) {
                    try {
                        synchronized (this.a) {
                            z = this.e;
                        }
                        if (z) {
                            ((Application) context.getApplicationContext()).unregisterActivityLifecycleCallbacks(this.d);
                            this.e = false;
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }

    public final void d(Context context, bi71 bi71Var) {
        synchronized (this.a) {
            this.b.remove(bi71Var);
            c(context);
        }
    }
}
