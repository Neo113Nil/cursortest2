package n;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c extends v6.a {

    /* renamed from: d, reason: collision with root package name */
    public final Object f4975d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public final ExecutorService f4976e = Executors.newFixedThreadPool(4, new b());

    /* renamed from: f, reason: collision with root package name */
    public volatile Handler f4977f;

    public static Handler q(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return b3.a.b(looper);
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
