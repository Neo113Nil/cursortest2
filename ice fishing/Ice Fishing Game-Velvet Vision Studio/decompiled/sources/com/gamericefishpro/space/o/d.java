package com.gamericefishpro.space.o;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.gamericefishpro.space.d4.h;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends com.gamericefishpro.space.a.a {
    public final Object c = new Object();
    public final ExecutorService d = Executors.newFixedThreadPool(4, new c());
    public volatile Handler e;

    public static Handler f(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return h.a(looper);
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
