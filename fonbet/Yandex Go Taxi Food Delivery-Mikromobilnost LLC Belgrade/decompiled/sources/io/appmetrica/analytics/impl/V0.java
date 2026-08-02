package io.appmetrica.analytics.impl;

import android.content.Context;
import defpackage.b64;
import defpackage.hek0;
import defpackage.scc;
import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.ModulesFacade;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

/* loaded from: classes4.dex */
public final class V0 {
    public final C0678rd a = new C0678rd(V4.l().d());
    public final C0707sd b = new C0707sd();
    public final C0765ud c = new C0765ud();

    public static final void a(V0 v0, String str, String str2, String str3) {
        List list;
        Context a;
        C0765ud c0765ud = v0.c;
        c0765ud.getClass();
        if (str == null) {
            str = "null";
        }
        Pair pair = new Pair("sender", str);
        if (str2 == null) {
            str2 = "null";
        }
        Pair pair2 = new Pair(DatabaseHelper.OttTrackingTable.COLUMN_EVENT, str2);
        if (str3 == null) {
            str3 = "null";
        }
        LinkedHashMap l = kotlin.collections.b.l(pair, pair2, new Pair("payload", str3));
        ModuleEvent.Builder withName = ModuleEvent.newBuilder(4).withName("appmetrica_system_event_42");
        synchronized (c0765ud) {
            try {
                if (c0765ud.a == null && (a = V4.l().g.a()) != null) {
                    c0765ud.a = scc.g(new Ag(), new Aq(a), new ps());
                }
                list = c0765ud.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((InterfaceC0780v) it.next()).a(l);
            }
        }
        ModulesFacade.reportEvent(withName.withAttributes(l).build());
    }

    public final void a(String str, String str2, String str3) {
        C0678rd c0678rd = this.a;
        if (c0678rd.c.a((Void) null).a && c0678rd.d.a(str).a && c0678rd.e.a(str2).a && c0678rd.f.a(str3).a) {
            this.b.getClass();
            IHandlerExecutor a = V4.l().c.a();
            ((Pa) a).b.post(new hek0(this, str, str2, str3, 8));
            return;
        }
        StringBuilder v = b64.v("Failed report event from sender: ", str, " with name = ", str2, " and payload = ");
        v.append(str3);
        PublicLogger.INSTANCE.getAnonymousInstance().warning("[AppMetricaLibraryAdapterProxy]".concat(v.toString()), new Object[0]);
    }
}
