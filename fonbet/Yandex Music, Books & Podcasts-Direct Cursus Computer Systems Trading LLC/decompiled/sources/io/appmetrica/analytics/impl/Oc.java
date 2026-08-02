package io.appmetrica.analytics.impl;

import android.os.Handler;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
public final class Oc implements Runnable {
    public final WeakReference a;
    public final WeakReference b;

    public Oc(Handler handler, AbstractC0768x3 abstractC0768x3) {
        this.a = new WeakReference(handler);
        this.b = new WeakReference(abstractC0768x3);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Handler handler = (Handler) this.a.get();
        AbstractC0768x3 abstractC0768x3 = (AbstractC0768x3) this.b.get();
        if (handler == null || abstractC0768x3 == null) {
            return;
        }
        boolean f = abstractC0768x3.b.f();
        if (!f) {
            PublicLogger publicLogger = abstractC0768x3.c;
            Set set = Ea.a;
            EnumC0603rc enumC0603rc = EnumC0603rc.EVENT_TYPE_UNDEFINED;
            C4 c4 = new C4("", "", 3, 0, publicLogger);
            C0237el c0237el = abstractC0768x3.h;
            C0351ik c0351ik = abstractC0768x3.b;
            c0237el.getClass();
            c0237el.a(C0237el.a(c4, c0351ik), c0351ik, 1, (Map) null);
        }
        if (f) {
            return;
        }
        Nc.a(handler, abstractC0768x3, this);
    }
}
