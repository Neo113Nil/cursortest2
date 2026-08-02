package ru.yandex.taxi.perf.frame;

import android.app.Activity;
import android.view.FrameMetrics;
import android.view.Window;
import defpackage.dnr;
import defpackage.ffs;
import defpackage.gfs;
import defpackage.gtq0;
import defpackage.i3y;
import defpackage.r1s;
import defpackage.s1r;
import defpackage.tje;
import defpackage.tse;
import defpackage.v5r;
import defpackage.ycc;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.EmptySet;
import ru.yandex.taxi.perf.frame.a;

/* loaded from: classes6.dex */
public final class a {
    public final Activity a;
    public final tse b;
    public final r1s c;
    public boolean f;
    public final i3y d = kotlin.a.a(new v5r(22));
    public final i3y e = kotlin.a.a(new dnr(2, this));
    public final LinkedHashMap g = new LinkedHashMap();
    public Set h = EmptySet.a;
    public final gfs i = new Window.OnFrameMetricsAvailableListener() { // from class: gfs
        @Override // android.view.Window.OnFrameMetricsAvailableListener
        public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
            Pair pair;
            Long l;
            a aVar = a.this;
            synchronized (aVar) {
                pair = new Pair(kotlin.collections.a.N0(aVar.g.values()), kotlin.collections.a.N0(aVar.h));
            }
            Set<ffs> set = (Set) pair.getFirst();
            Set set2 = (Set) pair.getSecond();
            int d = gw00.d(tcc.n(set2, 10));
            if (d < 16) {
                d = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(d);
            for (Object obj : set2) {
                linkedHashMap.put(obj, Long.valueOf(frameMetrics.getMetric(((Number) obj).intValue())));
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                if (((Number) entry.getValue()).longValue() > -1) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
            }
            for (ffs ffsVar : set) {
                Iterator it = ffsVar.a.iterator();
                while (it.hasNext()) {
                    int intValue = ((Number) it.next()).intValue();
                    Long l2 = (Long) linkedHashMap2.get(Integer.valueOf(intValue));
                    if (l2 != null) {
                        long longValue = l2.longValue();
                        long[] jArr = ffsVar.d;
                        long j = jArr[intValue] + 1;
                        long[] jArr2 = ffsVar.c;
                        long j2 = jArr2[intValue];
                        jArr[intValue] = j;
                        jArr2[intValue] = ((longValue - j2) / j) + j2;
                    }
                }
                if (ffsVar.b && (l = (Long) linkedHashMap2.get(13)) != null) {
                    long longValue2 = l.longValue();
                    Long l3 = (Long) linkedHashMap2.get(8);
                    if (l3 != null && l3.longValue() >= longValue2) {
                        ffsVar.e++;
                    }
                }
            }
        }
    };

    /* JADX WARN: Type inference failed for: r1v7, types: [gfs] */
    public a(Activity activity, tse tseVar, r1s r1sVar) {
        this.a = activity;
        this.b = tseVar;
        this.c = r1sVar;
    }

    public final synchronized void a(String str, Set set) {
        this.g.putIfAbsent(str, new ffs(set));
        Collection values = this.g.values();
        ArrayList arrayList = new ArrayList();
        Iterator it = values.iterator();
        while (it.hasNext()) {
            ycc.r(((ffs) it.next()).a, arrayList);
        }
        this.h = kotlin.collections.a.N0(arrayList);
        if (!this.f) {
            this.f = true;
            tje.N(this.b, null, null, new FrameRenderStatsCollectorImpl$start$1(this, null), 3);
            gtq0.t(this.b, new s1r(13, this));
        }
    }

    public final synchronized void b(String str) {
        try {
            ffs ffsVar = (ffs) this.g.remove(str);
            if (ffsVar != null) {
                this.c.l(str, ffsVar);
            }
            if (this.g.isEmpty() && this.f) {
                this.f = false;
                tje.N(this.b, null, null, new FrameRenderStatsCollectorImpl$stopAndReport$2(this, null), 3);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
