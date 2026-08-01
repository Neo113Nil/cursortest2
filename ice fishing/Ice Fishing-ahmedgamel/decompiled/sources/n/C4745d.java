package n;

import K.i;
import X2.e;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: n.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4745d extends e {

    /* renamed from: h, reason: collision with root package name */
    public final Object f39448h = new Object();
    public final ExecutorService i = Executors.newFixedThreadPool(4, new ThreadFactoryC4744c());

    /* renamed from: j, reason: collision with root package name */
    public volatile Handler f39449j;

    public static Handler T(Looper looper) {
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
