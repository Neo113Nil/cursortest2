package androidx.camera.core.impl.utils;

import android.content.Context;
import android.os.Build;
import androidx.core.view.WindowCompat$Api35Impl;
import androidx.media3.ui.PlayerView;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Objects;

/* loaded from: classes3.dex */
public abstract class ContextUtil {
    public static final Object CACHE_LOCK = new Object();
    public static final HashMap CACHED_CONTEXTS = new HashMap();

    public static Context getPersistentApplicationContext(Context context) {
        int deviceId;
        Context applicationContext = context.getApplicationContext();
        int hashCode = context.getApplicationContext().hashCode();
        int i = Build.VERSION.SDK_INT;
        Context context2 = null;
        String format2 = String.format("%d-%d-%s", Integer.valueOf(hashCode), Integer.valueOf(i >= 34 ? context.getDeviceId() : 0), i >= 30 ? WindowCompat$Api35Impl.getAttributionTag(context) : null);
        synchronized (CACHE_LOCK) {
            try {
                HashMap hashMap = CACHED_CONTEXTS;
                WeakReference weakReference = (WeakReference) hashMap.get(format2);
                if (weakReference != null) {
                    Context context3 = (Context) weakReference.get();
                    if (context3 != null) {
                        context2 = context3;
                    } else {
                        hashMap.remove(format2);
                    }
                }
                if (context2 != null) {
                    return context2;
                }
                if (i >= 34) {
                    deviceId = context.getDeviceId();
                    applicationContext = PlayerView.Api34.createDeviceContext(applicationContext, deviceId);
                }
                if (i >= 30) {
                    String attributionTag = WindowCompat$Api35Impl.getAttributionTag(context);
                    if (!Objects.equals(attributionTag, WindowCompat$Api35Impl.getAttributionTag(applicationContext))) {
                        applicationContext = WindowCompat$Api35Impl.createAttributionContext(applicationContext, attributionTag);
                    }
                }
                hashMap.put(format2, new WeakReference(applicationContext));
                return applicationContext;
            } finally {
            }
        }
    }
}
