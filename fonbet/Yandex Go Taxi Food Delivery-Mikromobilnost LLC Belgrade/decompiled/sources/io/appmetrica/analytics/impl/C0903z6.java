package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.IReporter;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;

/* renamed from: io.appmetrica.analytics.impl.z6, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0903z6 {
    public final C0607p a;
    public final IReporter b;
    public Context c;
    public final C0874y6 d;

    public C0903z6(C0607p c0607p, IReporter iReporter) {
        this.a = c0607p;
        this.b = iReporter;
        this.d = new C0874y6(this);
    }

    public final synchronized void a(Context context) {
        if (this.c == null) {
            Context applicationContext = context.getApplicationContext();
            this.a.a(applicationContext);
            this.a.registerListener(this.d, ActivityEvent.RESUMED, ActivityEvent.PAUSED);
            this.c = applicationContext;
        }
    }

    public C0903z6(C0607p c0607p) {
        this(c0607p, 0);
    }

    public /* synthetic */ C0903z6(C0607p c0607p, int i) {
        this(c0607p, R1.a());
    }

    public final synchronized Context a() {
        return this.c;
    }
}
