package io.appmetrica.analytics.impl;

import android.content.Context;
import com.connectsdk.service.NetcastTVService;
import defpackage.f1d;
import defpackage.u75;
import defpackage.uah;
import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.ModulesFacade;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;

/* loaded from: classes5.dex */
public final class U0 {
    public final C0143bd a = new C0143bd(R4.l().d());
    public final C0172cd b = new C0172cd();
    public final C0229ed c = new C0229ed();

    public static final void a(U0 u0, String str, String str2, String str3) {
        List list;
        Context a;
        C0229ed c0229ed = u0.c;
        c0229ed.getClass();
        if (str == null) {
            str = "null";
        }
        Pair pair = new Pair("sender", str);
        if (str2 == null) {
            str2 = "null";
        }
        Pair pair2 = new Pair(NetcastTVService.UDAP_API_EVENT, str2);
        if (str3 == null) {
            str3 = "null";
        }
        LinkedHashMap g = uah.g(pair, pair2, new Pair("payload", str3));
        ModuleEvent.Builder withName = ModuleEvent.newBuilder(4).withName("appmetrica_system_event_42");
        synchronized (c0229ed) {
            try {
                if (c0229ed.a == null && (a = R4.l().g.a()) != null) {
                    c0229ed.a = u75.h(new C0405kg(), new C0386jq(a), new Vr());
                }
                list = c0229ed.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((InterfaceC0677u) it.next()).a(g);
            }
        }
        ModulesFacade.reportEvent(withName.withAttributes(g).build());
    }

    public final void a(String str, String str2, String str3) {
        C0143bd c0143bd = this.a;
        if (c0143bd.c.a((Void) null).a && c0143bd.d.a(str).a && c0143bd.e.a(str2).a && c0143bd.f.a(str3).a) {
            this.b.getClass();
            IHandlerExecutor a = R4.l().c.a();
            ((Ha) a).b.post(new defpackage.r8(this, str, str2, str3, 14));
            return;
        }
        StringBuilder m = f1d.m("Failed report event from sender: ", str, " with name = ", str2, " and payload = ");
        m.append(str3);
        PublicLogger.INSTANCE.getAnonymousInstance().warning("[AppMetricaLibraryAdapterProxy]".concat(m.toString()), new Object[0]);
    }
}
