package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.IReporter;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;

/* loaded from: classes.dex */
public final class E5 {

    /* renamed from: a, reason: collision with root package name */
    public final C0625o f4340a;

    /* renamed from: b, reason: collision with root package name */
    public final IReporter f4341b;

    /* renamed from: c, reason: collision with root package name */
    public Context f4342c;

    /* renamed from: d, reason: collision with root package name */
    public final D5 f4343d;

    public E5(C0625o c0625o) {
        this(c0625o, 0);
    }

    public final synchronized void a(Context context) {
        if (this.f4342c == null) {
            Context applicationContext = context.getApplicationContext();
            this.f4340a.a(applicationContext);
            this.f4340a.registerListener(this.f4343d, ActivityEvent.RESUMED, ActivityEvent.PAUSED);
            this.f4342c = applicationContext;
        }
    }

    public E5(C0625o c0625o, IReporter iReporter) {
        this.f4340a = c0625o;
        this.f4341b = iReporter;
        this.f4343d = new D5(this);
    }

    public /* synthetic */ E5(C0625o c0625o, int i2) {
        this(c0625o, AbstractC0860x1.a());
    }

    public final synchronized Context a() {
        return this.f4342c;
    }
}
