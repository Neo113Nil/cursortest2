package com.yandex.passport.internal.report;

import android.os.SystemClock;
import com.connectsdk.service.NetcastTVService;
import defpackage.tah;
import defpackage.uah;
import defpackage.v75;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;

/* loaded from: classes4.dex */
public final class gf {
    public long a;
    public final List b;
    public final Map c;

    public gf() {
        List synchronizedList = Collections.synchronizedList(new ArrayList());
        synchronizedList.getClass();
        this.b = synchronizedList;
        Map synchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        synchronizedMap.getClass();
        this.c = synchronizedMap;
    }

    public final ArrayList a() {
        ArrayList y0;
        synchronized (this.b) {
            y0 = CollectionsKt.y0(this.b);
        }
        long j = this.a;
        ArrayList arrayList = new ArrayList(v75.o(y0, 10));
        Iterator it = y0.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            arrayList.add(uah.e(new Pair(NetcastTVService.UDAP_API_EVENT, pair.a), new Pair("time", Long.valueOf(((Number) pair.b).longValue() - j))));
        }
        return arrayList;
    }

    public final LinkedHashMap b() {
        ArrayList y0;
        synchronized (this.b) {
            y0 = CollectionsKt.y0(this.b);
        }
        long j = this.a;
        int a = tah.a(v75.o(y0, 10));
        if (a < 16) {
            a = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a);
        Iterator it = y0.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            linkedHashMap.put((String) pair.a, Long.valueOf(((Number) pair.b).longValue() - j));
        }
        return linkedHashMap;
    }

    public final Map c() {
        Map o;
        synchronized (this.c) {
            o = uah.o(this.c);
        }
        return o;
    }

    public final void d() {
        this.a = 0L;
        this.b.clear();
        this.c.clear();
    }

    public final void e(String str) {
        this.b.add(new Pair(str, Long.valueOf(SystemClock.elapsedRealtime())));
    }
}
