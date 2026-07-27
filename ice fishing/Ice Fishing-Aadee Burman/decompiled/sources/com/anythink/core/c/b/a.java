package com.anythink.core.c.b;

import java.util.Calendar;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    e f12035b;

    /* renamed from: c, reason: collision with root package name */
    private final String f12036c = "a";

    /* renamed from: a, reason: collision with root package name */
    Map<String, com.anythink.core.c.a.c> f12034a = new ConcurrentHashMap();

    public a(e eVar) {
        this.f12035b = eVar;
    }

    private com.anythink.core.c.a.d a(String str, int i, com.anythink.core.d.f fVar) {
        com.anythink.core.c.a.c cVar = this.f12034a.get(str);
        int i6 = fVar.a() == 1 ? i : -1;
        if (cVar == null || !cVar.b(fVar) || cVar.a(i6) == null) {
            cVar = new com.anythink.core.c.a.c();
            cVar.a(fVar);
            int c9 = fVar.c();
            long currentTimeMillis = System.currentTimeMillis() - ((fVar.b() * 86400) * 1000);
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(currentTimeMillis);
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            cVar.a(i6, this.f12035b.a(str, i6, calendar.getTimeInMillis(), c9));
            this.f12034a.put(str, cVar);
        } else {
            cVar.c(i);
        }
        return cVar.b(i6);
    }

    private void a(String str, com.anythink.core.c.a.a aVar) {
        com.anythink.core.c.a.c cVar = this.f12034a.get(str);
        aVar.a();
        aVar.toString();
        if (cVar != null) {
            cVar.a(aVar);
        }
    }

    private List<com.anythink.core.c.a.a> a(String str, int i, com.anythink.core.d.f fVar, int i6) {
        long currentTimeMillis = System.currentTimeMillis() - ((fVar.b() * 86400) * 1000);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return this.f12035b.a(str, i, calendar.getTimeInMillis(), i6);
    }
}
