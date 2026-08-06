package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.p2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0654p2 {

    /* renamed from: a, reason: collision with root package name */
    public final We f6715a;

    /* renamed from: b, reason: collision with root package name */
    public final long f6716b;

    /* renamed from: c, reason: collision with root package name */
    public final long f6717c;

    /* renamed from: d, reason: collision with root package name */
    public final SystemTimeProvider f6718d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f6719e;

    public C0654p2(Q4 q4, We we) {
        this.f6715a = we;
        q4.b();
        this.f6716b = TimeUnit.MINUTES.toMillis(1L);
        this.f6717c = TimeUnit.DAYS.toMillis(7L);
        this.f6718d = new SystemTimeProvider();
        Map<String, Long> f2 = we.f();
        a(f2);
        this.f6719e = f2;
    }

    public final void a(Map map) {
        long currentTimeMillis = this.f6718d.currentTimeMillis();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (((Number) entry.getValue()).longValue() < currentTimeMillis - this.f6717c) {
                linkedHashSet.add(str);
            }
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            map.remove((String) it.next());
        }
    }
}
