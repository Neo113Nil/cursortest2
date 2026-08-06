package io.appmetrica.analytics.impl;

import android.os.Handler;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Set;

/* renamed from: io.appmetrica.analytics.impl.pb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0663pb implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f6735a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f6736b;

    public RunnableC0663pb(Handler handler, I2 i2) {
        this.f6735a = new WeakReference(handler);
        this.f6736b = new WeakReference(i2);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Handler handler = (Handler) this.f6735a.get();
        I2 i2 = (I2) this.f6736b.get();
        if (handler == null || i2 == null) {
            return;
        }
        boolean f2 = i2.f4495b.f();
        if (!f2) {
            PublicLogger publicLogger = i2.f4496c;
            Set set = AbstractC0842w9.f7096a;
            EnumC0301bb enumC0301bb = EnumC0301bb.EVENT_TYPE_UNDEFINED;
            M3 m3 = new M3("", "", 3, 0, publicLogger);
            C0851wi c0851wi = i2.f4501h;
            Fh fh = i2.f4495b;
            c0851wi.getClass();
            c0851wi.a(C0851wi.a(m3, fh), fh, 1, (Map) null);
        }
        if (f2) {
            return;
        }
        C0637ob.a(handler, i2, this);
    }
}
