package io.appmetrica.analytics.push.impl;

import android.content.Context;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.IReporter;
import io.appmetrica.analytics.push.BuildConfig;
import io.appmetrica.analytics.push.coreutils.internal.utils.Tracker;
import java.util.HashMap;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.push.impl.w, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C1083w implements Tracker {
    public final Context a;
    public volatile IReporter b;
    public final Object c = new Object();
    public final C1086x d;

    public C1083w(Context context, M1 m1) {
        this.a = context;
        this.d = new C1086x(m1, "sdk");
    }

    public final IReporter a() {
        if (this.b == null) {
            synchronized (this.c) {
                try {
                    if (this.b == null) {
                        this.b = AppMetrica.getReporter(this.a, "0e5e9c33-f8c3-4568-86c5-2e4f57523f72");
                    }
                } finally {
                }
            }
        }
        return this.b;
    }

    @Override // io.appmetrica.analytics.push.coreutils.internal.utils.Tracker
    public final void pauseSession() {
        a().pauseSession();
    }

    @Override // io.appmetrica.analytics.push.coreutils.internal.utils.Tracker
    public final void reportError(String str, Throwable th) {
        StringBuilder sb = new StringBuilder("version_code = 50139818;");
        C1018c2 c1018c2 = r.a(this.a).d;
        if (c1018c2 != null) {
            sb.append("transport = ");
            sb.append(c1018c2.b.keySet());
        }
        sb.append(";");
        sb.append(str);
        a().reportError(sb.toString(), th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.appmetrica.analytics.push.coreutils.internal.utils.Tracker
    public final void reportEvent(String str, Map map) {
        if (map == null) {
            map = new HashMap();
        }
        map.put("version_code", String.valueOf(BuildConfig.VERSION_CODE));
        C1018c2 c1018c2 = r.a(this.a).d;
        if (c1018c2 != null) {
            map.put("transport", c1018c2.b.keySet().toString());
        }
        map.put("event_id", Long.valueOf(this.d.a()));
        a().reportEvent(str, (Map<String, Object>) map);
    }

    @Override // io.appmetrica.analytics.push.coreutils.internal.utils.Tracker
    public final void reportUnhandledException(Throwable th) {
        a().reportUnhandledException(th);
    }

    @Override // io.appmetrica.analytics.push.coreutils.internal.utils.Tracker
    public final void resumeSession() {
        a().resumeSession();
    }

    @Override // io.appmetrica.analytics.push.coreutils.internal.utils.Tracker
    public final void reportEvent(String str) {
        reportEvent(str, null);
    }
}
