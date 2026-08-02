package defpackage;

import android.content.SharedPreferences;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.rconfig.b;
import java.util.UUID;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* loaded from: classes8.dex */
public final class y1r0 {
    public static final /* synthetic */ kgx[] g = {new MutablePropertyReference1Impl("counter", 0, "getCounter()I", y1r0.class), oyr.B(qoi0.a, y1r0.class, "lastPauseTimeMs", "getLastPauseTimeMs()J", 0), new MutablePropertyReference1Impl("currentSessionId", 0, "getCurrentSessionId()Ljava/lang/String;", y1r0.class)};
    public final b a;
    public final AppAnalyticsReporter b;
    public final a6w c;
    public final a6w d;
    public final a6w e;
    public final Object f = new Object();

    public y1r0(b bVar, AppAnalyticsReporter appAnalyticsReporter, SharedPreferences sharedPreferences) {
        this.a = bVar;
        this.b = appAnalyticsReporter;
        this.c = new a6w(0, sharedPreferences, "prefs_sessions_without_fullscreen_counter");
        this.d = new a6w(1, sharedPreferences, "prefs_last_pause_time_ms");
        this.e = new a6w(2, sharedPreferences, UUID.randomUUID().toString());
    }

    public final void a() {
        synchronized (this.f) {
            a6w a6wVar = this.c;
            kgx kgxVar = g[0];
            a6wVar.b(0);
            this.b.o.a.a("fullscreen_notification.sessions_without_fullscreens_dropped", null);
        }
    }

    public final int b() {
        int i;
        synchronized (this.f) {
            a6w a6wVar = this.c;
            kgx kgxVar = g[0];
            i = a6wVar.b.getInt(a6wVar.c, 0);
        }
        return i;
    }
}
