package io.appmetrica.analytics.impl;

import android.content.Context;
import h1.C0234d;
import i1.AbstractC0253j;
import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.ModulesFacade;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class F0 {

    /* renamed from: a, reason: collision with root package name */
    public final Bb f4369a = new Bb(C0294b4.l().d());

    /* renamed from: b, reason: collision with root package name */
    public final Cb f4370b = new Cb();

    /* renamed from: c, reason: collision with root package name */
    public final Eb f4371c = new Eb();

    public final void a(String str, String str2, String str3) {
        Bb bb = this.f4369a;
        if (bb.f4199c.a((Void) null).f6792a && bb.f4200d.a(str).f6792a && bb.f4201e.a(str2).f6792a && bb.f4202f.a(str3).f6792a) {
            this.f4370b.getClass();
            ((C0920z9) C0294b4.l().f5584c.a()).f7271b.post(new Ko(this, str, str2, str3, 0));
            return;
        }
        PublicLogger.Companion.getAnonymousInstance().warning(C1.a.i("[AppMetricaLibraryAdapterProxy]", "Failed report event from sender: " + str + " with name = " + str2 + " and payload = " + str3), new Object[0]);
    }

    public static final void a(F0 f0, String str, String str2, String str3) {
        List list;
        Context a2;
        Eb eb = f0.f4371c;
        eb.getClass();
        if (str == null) {
            str = "null";
        }
        C0234d c0234d = new C0234d("sender", str);
        if (str2 == null) {
            str2 = "null";
        }
        C0234d c0234d2 = new C0234d("event", str2);
        if (str3 == null) {
            str3 = "null";
        }
        C0234d[] c0234dArr = {c0234d, c0234d2, new C0234d("payload", str3)};
        LinkedHashMap linkedHashMap = new LinkedHashMap(i1.v.G(3));
        i1.u.J(linkedHashMap, c0234dArr);
        ModuleEvent.Builder withName = ModuleEvent.newBuilder(4).withName("appmetrica_system_event_42");
        synchronized (eb) {
            try {
                if (eb.f4350a == null && (a2 = C0294b4.l().f5588g.a()) != null) {
                    eb.f4350a = AbstractC0253j.B(new Pd(), new C0416fn(a2), new Jo());
                }
                list = eb.f4350a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((InterfaceC0754t) it.next()).a(linkedHashMap);
            }
        }
        ModulesFacade.reportEvent(withName.withAttributes(linkedHashMap).build());
    }
}
