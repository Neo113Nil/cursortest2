package ru.yandex.videoplayer.multiplatform.fetcher;

import defpackage.cfo;
import defpackage.ep4;
import defpackage.f050;
import defpackage.phs0;
import defpackage.qwq;
import defpackage.sls;
import defpackage.swq;
import defpackage.tls;
import defpackage.tuw;
import defpackage.twq;
import defpackage.u3n;
import defpackage.uuw;
import defpackage.wvb1;
import defpackage.zy11;
import java.util.Iterator;
import java.util.LinkedHashMap;
import ru.yandex.video.m3.player.bandwidth.DurationMeasurerImpl;

/* loaded from: classes7.dex */
public final class a {
    public static final f050 k = new f050();
    public final DurationMeasurerImpl.Factory a;
    public double b;
    public int c;
    public boolean d;
    public u3n e;
    public final cfo f = new cfo();
    public final LinkedHashMap g = new LinkedHashMap();
    public final Double h = null;
    public final boolean i = false;
    public final wvb1 j;

    public a(DurationMeasurerImpl.Factory factory, twq twqVar) {
        a aVar;
        tuw tuwVar;
        this.a = factory;
        uuw uuwVar = twqVar.a;
        if (uuwVar != null) {
            aVar = this;
            tuwVar = uuwVar.create(new FetcherProgressAccumulator$1(0, aVar, a.class, "process", "process()V", 0), 100.0d);
        } else {
            aVar = this;
            tuwVar = null;
        }
        aVar.j = tuwVar != null ? new wvb1(tuwVar) : null;
    }

    public final void a(final phs0 phs0Var) {
        f050 f050Var = k;
        if (f050.b) {
            sls slsVar = new sls() { // from class: ru.yandex.videoplayer.multiplatform.fetcher.FetcherProgressAccumulator$appendFetcher$1$fetcherInfo$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.sls
                public final Object invoke() {
                    int i;
                    wvb1 wvb1Var;
                    wvb1 wvb1Var2;
                    a aVar = a.this;
                    qwq qwqVar = phs0Var;
                    f050 f050Var2 = a.k;
                    if (f050.b) {
                        swq swqVar = (swq) aVar.g.get(qwqVar);
                        i = swqVar != null ? swqVar.a : 0;
                        swq swqVar2 = (swq) aVar.g.get(qwqVar);
                        if (swqVar2 != null) {
                            swqVar2.a = i + 1;
                        }
                        aVar.c++;
                        if (!aVar.d && ((wvb1Var2 = aVar.j) == null || !wvb1Var2.a)) {
                            aVar.d = true;
                            aVar.e = aVar.a.create();
                            wvb1 wvb1Var3 = aVar.j;
                            if (wvb1Var3 != null) {
                                wvb1Var3.start();
                            }
                        }
                    } else {
                        aVar.getClass();
                        synchronized (f050Var2.a) {
                            try {
                                swq swqVar3 = (swq) aVar.g.get(qwqVar);
                                i = swqVar3 != null ? swqVar3.a : 0;
                                swq swqVar4 = (swq) aVar.g.get(qwqVar);
                                if (swqVar4 != null) {
                                    swqVar4.a = i + 1;
                                }
                                aVar.c++;
                                if (!aVar.d && ((wvb1Var = aVar.j) == null || !wvb1Var.a)) {
                                    aVar.d = true;
                                    aVar.e = aVar.a.create();
                                    wvb1 wvb1Var4 = aVar.j;
                                    if (wvb1Var4 != null) {
                                        wvb1Var4.start();
                                    }
                                }
                            } finally {
                            }
                        }
                    }
                    return zy11.a;
                }
            };
            sls slsVar2 = new sls() { // from class: ru.yandex.videoplayer.multiplatform.fetcher.FetcherProgressAccumulator$appendFetcher$1$fetcherInfo$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.sls
                public final Object invoke() {
                    a aVar = a.this;
                    qwq qwqVar = phs0Var;
                    f050 f050Var2 = a.k;
                    if (f050.b) {
                        swq swqVar = (swq) aVar.g.get(qwqVar);
                        int i = swqVar != null ? swqVar.a : 0;
                        swq swqVar2 = (swq) aVar.g.get(qwqVar);
                        if (swqVar2 != null) {
                            swqVar2.a = Math.max(i - 1, 0);
                        }
                        aVar.c = Math.max(aVar.c - 1, 0);
                    } else {
                        aVar.getClass();
                        synchronized (f050Var2.a) {
                            try {
                                swq swqVar3 = (swq) aVar.g.get(qwqVar);
                                int i2 = swqVar3 != null ? swqVar3.a : 0;
                                swq swqVar4 = (swq) aVar.g.get(qwqVar);
                                if (swqVar4 != null) {
                                    swqVar4.a = Math.max(i2 - 1, 0);
                                }
                                aVar.c = Math.max(aVar.c - 1, 0);
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    a aVar2 = a.this;
                    if (aVar2.c == 0 && aVar2.i) {
                        aVar2.b();
                    }
                    return zy11.a;
                }
            };
            this.g.put(phs0Var, new swq(slsVar, slsVar2));
            phs0Var.a(new FetcherProgressAccumulator$appendFetcher$1$1(this));
            phs0Var.c(slsVar);
            phs0Var.b(slsVar2);
            return;
        }
        synchronized (f050Var.a) {
            sls slsVar3 = new sls() { // from class: ru.yandex.videoplayer.multiplatform.fetcher.FetcherProgressAccumulator$appendFetcher$1$fetcherInfo$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.sls
                public final Object invoke() {
                    int i;
                    wvb1 wvb1Var;
                    wvb1 wvb1Var2;
                    a aVar = a.this;
                    qwq qwqVar = phs0Var;
                    f050 f050Var2 = a.k;
                    if (f050.b) {
                        swq swqVar = (swq) aVar.g.get(qwqVar);
                        i = swqVar != null ? swqVar.a : 0;
                        swq swqVar2 = (swq) aVar.g.get(qwqVar);
                        if (swqVar2 != null) {
                            swqVar2.a = i + 1;
                        }
                        aVar.c++;
                        if (!aVar.d && ((wvb1Var2 = aVar.j) == null || !wvb1Var2.a)) {
                            aVar.d = true;
                            aVar.e = aVar.a.create();
                            wvb1 wvb1Var3 = aVar.j;
                            if (wvb1Var3 != null) {
                                wvb1Var3.start();
                            }
                        }
                    } else {
                        aVar.getClass();
                        synchronized (f050Var2.a) {
                            try {
                                swq swqVar3 = (swq) aVar.g.get(qwqVar);
                                i = swqVar3 != null ? swqVar3.a : 0;
                                swq swqVar4 = (swq) aVar.g.get(qwqVar);
                                if (swqVar4 != null) {
                                    swqVar4.a = i + 1;
                                }
                                aVar.c++;
                                if (!aVar.d && ((wvb1Var = aVar.j) == null || !wvb1Var.a)) {
                                    aVar.d = true;
                                    aVar.e = aVar.a.create();
                                    wvb1 wvb1Var4 = aVar.j;
                                    if (wvb1Var4 != null) {
                                        wvb1Var4.start();
                                    }
                                }
                            } finally {
                            }
                        }
                    }
                    return zy11.a;
                }
            };
            sls slsVar4 = new sls() { // from class: ru.yandex.videoplayer.multiplatform.fetcher.FetcherProgressAccumulator$appendFetcher$1$fetcherInfo$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.sls
                public final Object invoke() {
                    a aVar = a.this;
                    qwq qwqVar = phs0Var;
                    f050 f050Var2 = a.k;
                    if (f050.b) {
                        swq swqVar = (swq) aVar.g.get(qwqVar);
                        int i = swqVar != null ? swqVar.a : 0;
                        swq swqVar2 = (swq) aVar.g.get(qwqVar);
                        if (swqVar2 != null) {
                            swqVar2.a = Math.max(i - 1, 0);
                        }
                        aVar.c = Math.max(aVar.c - 1, 0);
                    } else {
                        aVar.getClass();
                        synchronized (f050Var2.a) {
                            try {
                                swq swqVar3 = (swq) aVar.g.get(qwqVar);
                                int i2 = swqVar3 != null ? swqVar3.a : 0;
                                swq swqVar4 = (swq) aVar.g.get(qwqVar);
                                if (swqVar4 != null) {
                                    swqVar4.a = Math.max(i2 - 1, 0);
                                }
                                aVar.c = Math.max(aVar.c - 1, 0);
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    a aVar2 = a.this;
                    if (aVar2.c == 0 && aVar2.i) {
                        aVar2.b();
                    }
                    return zy11.a;
                }
            };
            this.g.put(phs0Var, new swq(slsVar3, slsVar4));
            phs0Var.a(new FetcherProgressAccumulator$appendFetcher$1$1(this));
            phs0Var.c(slsVar3);
            phs0Var.b(slsVar4);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00af, code lost:
    
        if (r6 >= (r3 != null ? r3.getDurationMs() : 0.0d)) goto L63;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        double durationMs;
        f050 f050Var = k;
        if (!f050.b) {
            synchronized (f050Var.a) {
                if (this.d) {
                    if (this.c == 0 && this.b == 0.0d) {
                        this.d = false;
                        this.e = null;
                        wvb1 wvb1Var = this.j;
                        if (wvb1Var != null) {
                            wvb1Var.stop();
                        }
                        return;
                    }
                    double d = this.b;
                    if (d == 0.0d) {
                        Double d2 = this.h;
                        if (d2 != null) {
                            double doubleValue = d2.doubleValue();
                            u3n u3nVar = this.e;
                        }
                        return;
                    }
                    this.b = 0.0d;
                    u3n u3nVar2 = this.e;
                    durationMs = u3nVar2 != null ? u3nVar2.getDurationMs() : 0.0d;
                    this.e = this.a.create();
                    cfo cfoVar = this.f;
                    ep4 ep4Var = new ep4(durationMs, d);
                    Iterator it = cfoVar.a.iterator();
                    while (it.hasNext()) {
                        ((tls) it.next()).invoke(ep4Var);
                    }
                    return;
                }
                return;
            }
        }
        if (this.d) {
            if (this.c == 0 && this.b == 0.0d) {
                this.d = false;
                this.e = null;
                wvb1 wvb1Var2 = this.j;
                if (wvb1Var2 != null) {
                    wvb1Var2.stop();
                    return;
                }
                return;
            }
            double d3 = this.b;
            if (d3 == 0.0d) {
                Double d4 = this.h;
                if (d4 == null) {
                    return;
                }
                double doubleValue2 = d4.doubleValue();
                u3n u3nVar3 = this.e;
                if (doubleValue2 >= (u3nVar3 != null ? u3nVar3.getDurationMs() : 0.0d)) {
                    return;
                }
            }
            this.b = 0.0d;
            u3n u3nVar4 = this.e;
            durationMs = u3nVar4 != null ? u3nVar4.getDurationMs() : 0.0d;
            this.e = this.a.create();
            cfo cfoVar2 = this.f;
            ep4 ep4Var2 = new ep4(durationMs, d3);
            Iterator it2 = cfoVar2.a.iterator();
            while (it2.hasNext()) {
                ((tls) it2.next()).invoke(ep4Var2);
            }
        }
    }
}
