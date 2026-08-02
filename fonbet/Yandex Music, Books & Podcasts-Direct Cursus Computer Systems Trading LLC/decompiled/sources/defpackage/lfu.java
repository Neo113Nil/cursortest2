package defpackage;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class lfu implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final HashMap d = new HashMap();
    public final WeakReference a;
    public final Handler b = new Handler(Looper.getMainLooper());
    public final AtomicBoolean c = new AtomicBoolean(false);

    public lfu(Activity activity) {
        this.a = new WeakReference(activity);
    }

    public static final HashMap a() {
        if (bp6.a.contains(lfu.class)) {
            return null;
        }
        try {
            return d;
        } catch (Throwable th) {
            bp6.a(lfu.class, th);
            return null;
        }
    }

    public final void b() {
        if (bp6.a.contains(this)) {
            return;
        }
        try {
            yyo yyoVar = new yyo(11, this);
            Thread currentThread = Thread.currentThread();
            Looper mainLooper = Looper.getMainLooper();
            mainLooper.getClass();
            if (currentThread == mainLooper.getThread()) {
                yyoVar.run();
            } else {
                this.b.post(yyoVar);
            }
        } catch (Throwable th) {
            bp6.a(this, th);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (bp6.a.contains(this)) {
            return;
        }
        try {
            b();
        } catch (Throwable th) {
            bp6.a(this, th);
        }
    }
}
