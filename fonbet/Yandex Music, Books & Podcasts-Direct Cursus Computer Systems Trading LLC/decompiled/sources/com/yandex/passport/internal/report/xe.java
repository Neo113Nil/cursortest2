package com.yandex.passport.internal.report;

import android.content.Context;
import defpackage.ca8;
import defpackage.e5b;
import defpackage.gld;
import defpackage.tah;
import defpackage.uah;
import defpackage.v75;
import defpackage.x97;
import io.appmetrica.analytics.IReporterYandex;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class xe implements af {
    public final Context a;
    public final d b;
    public final IReporterYandex c;
    public volatile Map d;

    public xe(Context context, d dVar, IReporterYandex iReporterYandex, com.yandex.passport.common.analytics.k kVar) {
        context.getClass();
        dVar.getClass();
        iReporterYandex.getClass();
        kVar.getClass();
        this.a = context;
        this.b = dVar;
        this.c = iReporterYandex;
        e5b e5bVar = e5b.a;
        e5bVar.getClass();
        this.d = e5bVar;
        x97.y(gld.e(ca8.a), null, null, new we(kVar, this, (Continuation) null), 3);
    }

    @Override // com.yandex.passport.internal.report.af
    public final void a(String str, Map map) {
        str.getClass();
        map.getClass();
        Map<String, Object> c = c(map);
        this.c.reportEvent(str, c);
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.a, "[METRICA EVENT]", str + ": " + c, 8);
        }
    }

    @Override // com.yandex.passport.internal.report.af
    public final void b(String str, LinkedHashMap linkedHashMap) {
        str.getClass();
        Map<String, Object> c = c(linkedHashMap);
        this.c.reportStatboxEvent(str, c);
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.a, "[STATBOX EVENT]", str + ": " + c, 8);
        }
    }

    public final Map c(Map map) {
        ArrayList a = this.b.a();
        ArrayList arrayList = new ArrayList(v75.o(a, 10));
        Iterator it = a.iterator();
        while (it.hasNext()) {
            ze zeVar = (ze) it.next();
            arrayList.add(new Pair(zeVar.getName(), zeVar.getValue()));
        }
        map.getClass();
        if (map.isEmpty()) {
            return uah.n(arrayList);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        uah.l(linkedHashMap, arrayList);
        return linkedHashMap;
    }

    public final void d(ef efVar) {
        Throwable th;
        Pair b = efVar.b();
        String str = (String) b.a;
        Map map = (Map) b.b;
        ArrayList a = this.b.a();
        int a2 = tah.a(v75.o(a, 10));
        if (a2 < 16) {
            a2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a2);
        Iterator it = a.iterator();
        while (it.hasNext()) {
            ze zeVar = (ze) it.next();
            linkedHashMap.put(zeVar.getName(), zeVar.getValue());
        }
        LinkedHashMap i = uah.i(linkedHashMap, map);
        this.c.reportEvent(str, i);
        this.c.reportRtmError(efVar.a(uah.i(linkedHashMap, this.d), this.a));
        if ((efVar instanceof cf) && (th = ((cf) efVar).d) != null) {
            this.c.reportUnhandledException(th);
        }
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.e, "[METRICA EVENT]", str + ": " + i, 8);
        }
    }
}
