package n;

import K.i;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: n.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4759d extends Q3.b {

    /* renamed from: b, reason: collision with root package name */
    public final Object f39606b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final ExecutorService f39607c = Executors.newFixedThreadPool(4, new ThreadFactoryC4758c());

    /* renamed from: d, reason: collision with root package name */
    public volatile Handler f39608d;

    public static Handler z(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return i.b(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }
}
