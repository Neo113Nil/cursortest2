package ru.yandex.taxi.experiments;

import com.yandex.go.experiments.api.ExperimentSource;
import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.a2b0;
import defpackage.abb1;
import defpackage.c7h;
import defpackage.clw0;
import defpackage.dxd;
import defpackage.fku0;
import defpackage.in2;
import defpackage.jst;
import defpackage.kdx;
import defpackage.khh;
import defpackage.lwj0;
import defpackage.owx;
import defpackage.qn11;
import defpackage.tje;
import defpackage.un11;
import defpackage.v1b0;
import defpackage.v4r0;
import defpackage.vku0;
import defpackage.vn11;
import defpackage.w1b0;
import defpackage.w511;
import defpackage.weu;
import defpackage.wku0;
import defpackage.wnt;
import defpackage.x1b0;
import defpackage.xn11;
import defpackage.xnt;
import defpackage.zn11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.r0;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.common_models.net.CacheStatus;
import ru.yandex.taxi.common_models.net.SimpleBooleanExperiment;
import ru.yandex.taxi.common_models.net.SimplePersistentBooleanExperiment;

/* loaded from: classes9.dex */
public abstract class r implements v1b0, w1b0, x1b0 {
    public final p a;

    public r(p pVar) {
        this.a = pVar;
        ExperimentSource source = getSource();
        pVar.k = source;
        if (pVar.i.compareAndSet(false, true)) {
            tje.N(pVar.h, null, null, new PersistentExperimentsImpl$initialize$1(pVar, source, null), 3);
        }
    }

    @Override // defpackage.x1b0
    public final vn11 a(vn11 vn11Var) {
        return this.a.a(vn11Var);
    }

    @Override // defpackage.x1b0
    public final m b(SimplePersistentBooleanExperiment simplePersistentBooleanExperiment) {
        return this.a.b(simplePersistentBooleanExperiment);
    }

    @Override // defpackage.x1b0
    public final xn11 c(xn11 xn11Var) {
        return this.a.c(xn11Var);
    }

    @Override // defpackage.x1b0
    public final k d(SimpleBooleanExperiment simpleBooleanExperiment) {
        return this.a.d(simpleBooleanExperiment);
    }

    @Override // defpackage.x1b0
    public final Object f(SimplePersistentBooleanExperiment simplePersistentBooleanExperiment, Continuation continuation) {
        return this.a.f(simplePersistentBooleanExperiment, continuation);
    }

    @Override // defpackage.x1b0
    public final boolean g(SimplePersistentBooleanExperiment simplePersistentBooleanExperiment) {
        return this.a.g(simplePersistentBooleanExperiment);
    }

    @Override // defpackage.x1b0
    public final o h(qn11 qn11Var) {
        return this.a.h(qn11Var);
    }

    @Override // defpackage.x1b0
    public final Object i(vn11 vn11Var, Continuation continuation) {
        return this.a.i(vn11Var, continuation);
    }

    @Override // defpackage.x1b0
    public final boolean j(SimpleBooleanExperiment simpleBooleanExperiment) {
        return this.a.j(simpleBooleanExperiment);
    }

    public void k(owx owxVar) {
        l(owxVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x006d, code lost:
    
        if (r7 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01ae, code lost:
    
        if ((r5 instanceof defpackage.n96 ? ((defpackage.n96) r5).b() : r5 instanceof defpackage.w96 ? ((defpackage.w96) r5).h() : false) == false) goto L98;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0108 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0025 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(lwj0 lwj0Var) {
        String str;
        String str2;
        fku0 fku0Var;
        p pVar = this.a;
        pVar.getClass();
        zn11 r = lwj0Var.getR();
        Collection<un11> values = r != null ? r.b.values() : null;
        if (values == null) {
            values = EmptyList.a;
        }
        ArrayList arrayList = new ArrayList();
        for (un11 un11Var : values) {
            qn11 qn11Var = un11Var.a;
            if (qn11Var != null) {
                String str3 = un11Var.b;
                clw0 clw0Var = (clw0) pVar.c.a.get(str3);
                if (clw0Var != null && clw0Var.d) {
                    CacheStatus cacheStatus = un11Var.d;
                    int i = cacheStatus == null ? -1 : a2b0.a[cacheStatus.ordinal()];
                    if (i != -1) {
                        if (i != 1) {
                            if (i != 2 && i != 3) {
                                w511.b();
                                return;
                            }
                        }
                        str2 = "";
                        kotlinx.serialization.json.b bVar = un11Var.e;
                        wnt wntVar = pVar.a;
                        if (bVar != null) {
                            try {
                                fku0Var = new fku0(str3, str2, bVar, ((xnt) wntVar).e(bVar, kotlinx.serialization.json.b.Companion.serializer()));
                            } catch (Exception e) {
                                jst.e.x(e, "can't persist experiment " + str3);
                            }
                        } else {
                            Boolean valueOf = qn11Var instanceof c7h ? Boolean.valueOf(((c7h) qn11Var).b) : qn11Var instanceof khh ? Boolean.valueOf(((khh) qn11Var).b) : null;
                            if (valueOf == null) {
                                clw0 clw0Var2 = (clw0) pVar.c.a.get(str3);
                                if (clw0Var2 != null) {
                                    KSerializer kSerializer = (KSerializer) clw0Var2.e.getValue();
                                    fku0Var = new fku0(str3, str2, ((xnt) wntVar).a(qn11Var, kSerializer), ((xnt) wntVar).e(qn11Var, kSerializer));
                                }
                            } else if (valueOf.booleanValue()) {
                                kdx kdxVar = new kdx();
                                abb1.c(kdxVar, BackendConfig.Restrictions.ENABLED, Boolean.TRUE);
                                fku0Var = new fku0(str3, str2, kdxVar.a(), null);
                            }
                        }
                        if (fku0Var == null) {
                            arrayList.add(fku0Var);
                        }
                    }
                    str2 = un11Var.c;
                }
            }
            fku0Var = null;
            if (fku0Var == null) {
            }
        }
        wku0 wku0Var = pVar.d;
        ExperimentSource experimentSource = pVar.k;
        if (experimentSource == null) {
            experimentSource = null;
        }
        wku0Var.g(experimentSource, arrayList);
        if (r != null) {
            Set keySet = r.b.keySet();
            ConcurrentHashMap concurrentHashMap = pVar.g;
            ExperimentSource experimentSource2 = pVar.k;
            if (experimentSource2 == null) {
                experimentSource2 = null;
            }
            Set g = v4r0.g((Set) concurrentHashMap.computeIfAbsent(experimentSource2, new dxd(7, new weu(22, pVar))), keySet);
            Collection<un11> values2 = r.b.values();
            ArrayList arrayList2 = new ArrayList();
            for (un11 un11Var2 : values2) {
                qn11 qn11Var2 = un11Var2.a;
                if (qn11Var2 != null) {
                    str = un11Var2.b;
                    clw0 clw0Var3 = (clw0) pVar.c.a.get(str);
                    if (clw0Var3 != null && clw0Var3.d) {
                        if ((qn11Var2 instanceof c7h ? Boolean.valueOf(((c7h) qn11Var2).b) : qn11Var2 instanceof khh ? Boolean.valueOf(((khh) qn11Var2).b) : null) != null) {
                        }
                    }
                }
                str = null;
                if (str != null) {
                    arrayList2.add(str);
                }
            }
            wku0 wku0Var2 = pVar.d;
            ExperimentSource experimentSource3 = pVar.k;
            ExperimentSource experimentSource4 = experimentSource3 != null ? experimentSource3 : null;
            LinkedHashSet h = v4r0.h(g, arrayList2);
            wku0Var2.getClass();
            if (!h.isEmpty()) {
                ReentrantReadWriteLock.ReadLock readLock = wku0Var2.h.readLock();
                readLock.lock();
                try {
                    vku0 h2 = wku0Var2.h(experimentSource4);
                    synchronized (h2.e()) {
                        List I = kotlin.collections.a.I(h);
                        ReentrantReadWriteLock.WriteLock writeLock = h2.a().writeLock();
                        writeLock.lock();
                        try {
                            LinkedHashMap b = h2.b();
                            Iterator it = I.iterator();
                            while (it.hasNext()) {
                                b.remove((String) it.next());
                            }
                            if (!h2.d()) {
                                h2.f().addAll(I);
                            }
                            writeLock.unlock();
                            wku0Var2.e.c(new in2(23, wku0Var2, experimentSource4, I));
                        } finally {
                            writeLock.unlock();
                        }
                    }
                } finally {
                    readLock.unlock();
                }
            }
        }
        r0 r0Var = pVar.e;
        if (r == null) {
            r = zn11.c;
        }
        r0Var.l(r);
        pVar.f.clear();
    }
}
