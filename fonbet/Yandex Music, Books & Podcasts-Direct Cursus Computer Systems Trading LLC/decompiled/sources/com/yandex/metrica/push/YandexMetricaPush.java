package com.yandex.metrica.push;

import android.app.NotificationChannel;
import android.content.Context;
import com.yandex.metrica.push.common.core.PushServiceControllerProvider;
import com.yandex.metrica.push.impl.C0077n;
import defpackage.xq0;
import java.util.Map;

/* loaded from: classes3.dex */
public final class YandexMetricaPush {
    public static final String EXTRA_ACTION_INFO = ".extra.ACTION_INFO";
    public static final String EXTRA_PAYLOAD = ".extra.payload";
    public static final String OPEN_DEFAULT_ACTIVITY_ACTION = "com.yandex.metrica.push.action.OPEN";
    private static volatile C0077n a;
    private static final Object b = new Object();

    private YandexMetricaPush() {
    }

    private static void a() {
        if (a != null) {
            return;
        }
        xq0.q("MetricaPush should be initialized by calling MetricaPush.init(Context).");
    }

    public static synchronized NotificationChannel getDefaultNotificationChannel() {
        NotificationChannel b2;
        synchronized (YandexMetricaPush.class) {
            synchronized (b) {
                a();
            }
            b2 = a.b().b();
        }
        return b2;
    }

    public static synchronized String getToken() {
        String j;
        synchronized (YandexMetricaPush.class) {
            synchronized (b) {
                a();
            }
            j = a.j();
        }
        return j;
    }

    public static synchronized Map<String, String> getTokens() {
        Map<String, String> k;
        synchronized (YandexMetricaPush.class) {
            synchronized (b) {
                a();
            }
            k = a.k();
        }
        return k;
    }

    public static synchronized void init(Context context) {
        synchronized (YandexMetricaPush.class) {
            if (a == null) {
                synchronized (b) {
                    try {
                        if (a == null) {
                            C0077n a2 = C0077n.a(context);
                            a2.l();
                            a = a2;
                        }
                    } finally {
                    }
                }
            }
        }
    }

    public static synchronized void setTokenUpdateListener(TokenUpdateListener tokenUpdateListener) {
        synchronized (YandexMetricaPush.class) {
            synchronized (b) {
                a();
            }
            a.a(tokenUpdateListener);
        }
    }

    public static synchronized void init(Context context, PushServiceControllerProvider... pushServiceControllerProviderArr) {
        synchronized (YandexMetricaPush.class) {
            if (a == null) {
                synchronized (b) {
                    try {
                        if (a == null) {
                            C0077n a2 = C0077n.a(context);
                            a2.a(pushServiceControllerProviderArr);
                            a = a2;
                        }
                    } finally {
                    }
                }
            }
        }
    }
}
