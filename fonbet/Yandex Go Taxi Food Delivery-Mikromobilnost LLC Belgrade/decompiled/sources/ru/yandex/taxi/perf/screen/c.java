package ru.yandex.taxi.perf.screen;

import android.os.SystemClock;
import defpackage.ava0;
import defpackage.bvf0;
import defpackage.cvw;
import defpackage.cwa0;
import defpackage.dua0;
import defpackage.ewa0;
import defpackage.g18;
import defpackage.i3f;
import defpackage.ike;
import defpackage.jl40;
import defpackage.mdh;
import defpackage.ocp0;
import defpackage.qhw0;
import defpackage.rua0;
import defpackage.sjh;
import defpackage.sua0;
import defpackage.tje;
import defpackage.tn5;
import defpackage.tt2;
import defpackage.tua0;
import defpackage.ues;
import defpackage.uua0;
import defpackage.uyj;
import defpackage.ves;
import defpackage.vua0;
import defpackage.w511;
import defpackage.wes;
import defpackage.xua0;
import defpackage.y5e;
import defpackage.yjv0;
import defpackage.yua0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.EmptyList;

/* loaded from: classes9.dex */
public final class c {
    public final rua0 a;
    public final ru.yandex.taxi.perf.b b;
    public final ike c;
    public final ConcurrentHashMap d;
    public final ConcurrentHashMap e;
    public final ConcurrentHashMap f;
    public final ConcurrentHashMap.KeySetView g;
    public final ConcurrentHashMap h;
    public volatile i3f i;

    public c(rua0 rua0Var, ru.yandex.taxi.perf.b bVar, tt2 tt2Var) {
        this.a = rua0Var;
        this.b = bVar;
        qhw0 a = jl40.a();
        tt2Var.getClass();
        sjh sjhVar = uyj.a;
        this.c = bvf0.a(cvw.U(a, mdh.b));
        this.d = new ConcurrentHashMap();
        this.e = new ConcurrentHashMap();
        this.f = new ConcurrentHashMap();
        this.g = ConcurrentHashMap.newKeySet();
        this.h = new ConcurrentHashMap();
    }

    public final boolean a(yjv0 yjv0Var) {
        tn5 tn5Var = (tn5) this.d.get(yjv0Var.a());
        if (tn5Var != null) {
            return tn5Var.a(yjv0Var);
        }
        return false;
    }

    public final void b(PerformanceScreenName performanceScreenName) {
        g18 g18Var = (g18) this.h.remove(performanceScreenName);
        if (g18Var != null) {
            g18Var.cancel();
        }
    }

    public final void c(ava0 ava0Var) {
        if (ava0Var instanceof yua0) {
            yua0 yua0Var = (yua0) ava0Var;
            if (yua0Var.e().compareTo(ScreenPerformanceState.FIRST_CONTENTFUL_PAINT) >= 0) {
                b(yua0Var.d());
            }
            int i = ewa0.b[yua0Var.e().ordinal()];
            if (i != 1 && i != 2) {
                if (i == 3) {
                    wes wesVar = new wes(yua0Var.d(), yua0Var.c(), yua0Var.b().f(), yua0Var.a());
                    i3f i3fVar = this.i;
                    if (i3fVar != null) {
                        i3fVar.b(wesVar);
                    }
                } else if (i != 4) {
                    w511.b();
                    return;
                } else {
                    i3f i3fVar2 = this.i;
                    if (i3fVar2 != null) {
                        i3fVar2.b(new ues(yua0Var.d()));
                    }
                }
            }
        } else if (!(ava0Var instanceof xua0) && !(ava0Var instanceof sua0) && !(ava0Var instanceof tua0) && !(ava0Var instanceof uua0) && !(ava0Var instanceof vua0)) {
            w511.b();
            return;
        }
        tje.N(this.c, null, null, new PerformanceScreenRepository$report$1(ava0Var, this, null), 3);
    }

    public final void d(cwa0 cwa0Var) {
        this.g.add(cwa0Var.d);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        c(new yua0(cwa0Var.a, cwa0Var.d, cwa0Var.c, cwa0Var.b, 0L, Long.valueOf(elapsedRealtime - cwa0Var.e), elapsedRealtime - this.b.e(), ScreenPerformanceState.INTERRUPTED, EmptyList.a, !this.d.contains(cwa0Var.a)));
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(ScreenEndpoint screenEndpoint, long j, String str) {
        ConcurrentHashMap concurrentHashMap;
        cwa0 cwa0Var;
        cwa0 cwa0Var2;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Iterator it = this.e.entrySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            concurrentHashMap = this.d;
            if (!hasNext) {
                cwa0Var = null;
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            PerformanceScreenName performanceScreenName = (PerformanceScreenName) entry.getKey();
            cwa0Var = (cwa0) entry.getValue();
            if (!y5e.I(performanceScreenName).contains(screenEndpoint) || concurrentHashMap.get(performanceScreenName) != null) {
                cwa0Var = null;
            }
            if (cwa0Var != null) {
                break;
            }
        }
        if (cwa0Var == null) {
            for (Map.Entry entry2 : concurrentHashMap.entrySet()) {
                PerformanceScreenName performanceScreenName2 = (PerformanceScreenName) entry2.getKey();
                tn5 tn5Var = (tn5) entry2.getValue();
                boolean z = tn5Var.d().compareTo(ScreenPerformanceState.LARGEST_CONTENTFUL_PAINT) < 0;
                boolean contains = y5e.I(performanceScreenName2).contains(screenEndpoint);
                cwa0Var = tn5Var.b();
                if (!contains || !z) {
                    cwa0Var = null;
                }
                if (cwa0Var != null) {
                }
            }
            cwa0Var2 = null;
            if (cwa0Var2 == null) {
                ocp0 ocp0Var = new ocp0(screenEndpoint, elapsedRealtime - cwa0Var2.e, j, str);
                String str2 = cwa0Var2.d;
                EmptyList emptyList = EmptyList.a;
                ConcurrentHashMap concurrentHashMap2 = this.f;
                concurrentHashMap2.put(str2, kotlin.collections.a.o0((Collection) concurrentHashMap2.getOrDefault(str2, emptyList), ocp0Var));
                return;
            }
            return;
        }
        cwa0Var2 = cwa0Var;
        if (cwa0Var2 == null) {
        }
    }

    public final void f(cwa0 cwa0Var) {
        this.e.put(cwa0Var.a, cwa0Var);
        i3f i3fVar = this.i;
        if (i3fVar != null) {
            i3fVar.b(new ves(cwa0Var.a));
        }
    }

    public final void g(PerformanceScreenName performanceScreenName) {
        tn5 tn5Var;
        cwa0 cwa0Var = (cwa0) this.e.remove(performanceScreenName);
        if (cwa0Var == null) {
            return;
        }
        ConcurrentHashMap concurrentHashMap = this.d;
        boolean z = concurrentHashMap.get(performanceScreenName) == null;
        int i = ewa0.a[performanceScreenName.ordinal()];
        if (i == 1) {
            tn5Var = new tn5(cwa0Var, z, 2);
        } else if (i == 2) {
            tn5Var = new tn5(cwa0Var, z, 3);
        } else if (i == 3) {
            tn5Var = new tn5(cwa0Var, z, 1);
        } else if (i == 4) {
            tn5Var = new tn5(cwa0Var, z, 4);
        } else {
            if (i != 5) {
                w511.b();
                return;
            }
            tn5Var = new tn5(cwa0Var, z, 0);
        }
        if (this.g.remove(tn5Var.b().d)) {
            tn5.e(tn5Var, this.b.e());
        }
        concurrentHashMap.put(tn5Var.c(), tn5Var);
    }

    public final void h(PerformanceScreenName performanceScreenName) {
        tn5 tn5Var = (tn5) this.d.get(performanceScreenName);
        if (tn5Var == null) {
            return;
        }
        b(performanceScreenName);
        Iterator it = tn5.e(tn5Var, this.b.e()).iterator();
        while (it.hasNext()) {
            c((ava0) it.next());
        }
    }

    public final void i(dua0 dua0Var) {
        tn5 tn5Var = (tn5) this.d.get(dua0Var.a());
        if (tn5Var != null && tn5Var.a(dua0Var)) {
            List list = (List) this.f.get(tn5Var.b().d);
            if (list == null) {
                list = EmptyList.a;
            }
            Iterator it = tn5.f(tn5Var, dua0Var, this.b.e(), list).iterator();
            while (it.hasNext()) {
                c((ava0) it.next());
            }
        }
    }
}
