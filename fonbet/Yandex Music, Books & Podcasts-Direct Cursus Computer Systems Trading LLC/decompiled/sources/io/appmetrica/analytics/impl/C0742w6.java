package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.IReporter;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;

/* renamed from: io.appmetrica.analytics.impl.w6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0742w6 {
    public final C0533p a;
    public final IReporter b;
    public Context c;
    public final C0713v6 d;

    public C0742w6(C0533p c0533p, IReporter iReporter) {
        this.a = c0533p;
        this.b = iReporter;
        this.d = new C0713v6(this);
    }

    public final synchronized void a(Context context) {
        if (this.c == null) {
            Context applicationContext = context.getApplicationContext();
            this.a.a(applicationContext);
            this.a.registerListener(this.d, ActivityEvent.RESUMED, ActivityEvent.PAUSED);
            this.c = applicationContext;
        }
    }

    public C0742w6(C0533p c0533p) {
        this(c0533p, 0);
    }

    public /* synthetic */ C0742w6(C0533p c0533p, int i) {
        this(c0533p, R1.a());
    }

    public final synchronized Context a() {
        return this.c;
    }
}
