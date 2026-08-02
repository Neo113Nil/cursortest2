package io.appmetrica.analytics.impl;

import android.os.Handler;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Set;

/* renamed from: io.appmetrica.analytics.impl.ed, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC0303ed implements Runnable {
    public final WeakReference a;
    public final WeakReference b;

    public RunnableC0303ed(Handler handler, AbstractC0842x3 abstractC0842x3) {
        this.a = new WeakReference(handler);
        this.b = new WeakReference(abstractC0842x3);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Handler handler = (Handler) this.a.get();
        AbstractC0842x3 abstractC0842x3 = (AbstractC0842x3) this.b.get();
        if (handler == null || abstractC0842x3 == null) {
            return;
        }
        boolean f = abstractC0842x3.b.f();
        if (!f) {
            PublicLogger publicLogger = abstractC0842x3.c;
            Set set = La.a;
            Hc hc = Hc.EVENT_TYPE_UNDEFINED;
            G4 g4 = new G4("", "", 3, 0, publicLogger);
            C0600ol c0600ol = abstractC0842x3.h;
            C0714sk c0714sk = abstractC0842x3.b;
            c0600ol.getClass();
            c0600ol.a(C0600ol.a(g4, c0714sk), c0714sk, 1, (Map) null);
        }
        if (f) {
            return;
        }
        C0275dd.a(handler, abstractC0842x3, this);
    }
}
