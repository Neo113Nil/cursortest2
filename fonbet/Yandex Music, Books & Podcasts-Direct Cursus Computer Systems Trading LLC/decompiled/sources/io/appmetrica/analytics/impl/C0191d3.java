package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.d3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0191d3 {
    public final C0637sh a;
    public final long b;
    public final long c;
    public final SystemTimeProvider d;
    public final Map e;

    public C0191d3(H5 h5, C0637sh c0637sh) {
        this.a = c0637sh;
        h5.b();
        this.b = 60000L;
        this.c = 604800000L;
        this.d = new SystemTimeProvider();
        Map<String, Long> f = c0637sh.f();
        a(f);
        this.e = f;
    }

    public final void a(Map map) {
        long currentTimeMillis = this.d.currentTimeMillis();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (((Number) entry.getValue()).longValue() < currentTimeMillis - this.c) {
                linkedHashSet.add(str);
            }
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            map.remove((String) it.next());
        }
    }
}
