package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* renamed from: io.appmetrica.analytics.impl.je, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0448je {
    public final AppMetricaConfig a;
    public final PublicLogger b;
    public final Context c;
    public final R2 d;
    public final String e;
    public final C0600ol f;
    public final String g;

    public C0448je(C0420ie c0420ie, AppMetricaConfig appMetricaConfig, PublicLogger publicLogger) {
        this.a = appMetricaConfig;
        this.b = publicLogger;
        this.c = c0420ie.c();
        this.d = c0420ie.b();
        this.e = c0420ie.k().d();
        this.f = c0420ie.j();
        this.g = c0420ie.k().g();
    }
}
