package ru.yandex.taxi.summary.promotions.repository;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.r;
import com.yandex.go.analytics.realtime.event.CreativeType;
import defpackage.bgx0;
import defpackage.bvf0;
import defpackage.ck;
import defpackage.cmt;
import defpackage.dbl0;
import defpackage.fas0;
import defpackage.gnv0;
import defpackage.h73;
import defpackage.hbp0;
import defpackage.hst;
import defpackage.i3y;
import defpackage.inv0;
import defpackage.ixn;
import defpackage.j0e;
import defpackage.jas0;
import defpackage.jbh;
import defpackage.jl40;
import defpackage.jnv0;
import defpackage.jsq0;
import defpackage.jst;
import defpackage.lei0;
import defpackage.lzu0;
import defpackage.mth;
import defpackage.nmv0;
import defpackage.nnv0;
import defpackage.ny61;
import defpackage.omu0;
import defpackage.on2;
import defpackage.qbl0;
import defpackage.qh2;
import defpackage.qpf0;
import defpackage.qqo;
import defpackage.qrq0;
import defpackage.rqo;
import defpackage.smv0;
import defpackage.t5r;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tmv0;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.umv0;
import defpackage.uze0;
import defpackage.w511;
import defpackage.wiq0;
import defpackage.xcc;
import defpackage.yal0;
import defpackage.yw01;
import defpackage.zkv0;
import defpackage.zw0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.internal.h;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.common_models.net.SimpleBooleanExperiment;
import ru.yandex.taxi.summary.promotions.api.SummaryPromotionsApi;
import ru.yandex.taxi.summary.promotions.models.SummaryPromotionsParam;
import ru.yandex.taxi.summary.promotions.models.SummaryPromotionsResponse;

/* loaded from: classes10.dex */
public final class e {
    public final ru.yandex.taxi.summary.promotions.models.a a;
    public final ru.yandex.taxi.summary.promotions.models.b b;
    public final uze0 c;
    public final qbl0 d;
    public final ru.yandex.taxi.summary.promotions.factory.a e;
    public final jas0 f;
    public final a g;
    public final smv0 h;
    public final wiq0 i;
    public final Lifecycle j;
    public final qpf0 k;
    public final bgx0 l;
    public final i3y m;
    public final hbp0 n;
    public final qqo o;
    public final r0 p = bvf0.c(jnv0.b);

    /* JADX WARN: Multi-variable type inference failed */
    public e(on2 on2Var, tt2 tt2Var, ru.yandex.taxi.summary.promotions.models.a aVar, ru.yandex.taxi.summary.promotions.models.b bVar, uze0 uze0Var, qbl0 qbl0Var, ru.yandex.taxi.summary.promotions.factory.a aVar2, jas0 jas0Var, a aVar3, smv0 smv0Var, wiq0 wiq0Var, Lifecycle lifecycle, rqo rqoVar, qpf0 qpf0Var, bgx0 bgx0Var) {
        this.a = aVar;
        this.b = bVar;
        this.c = uze0Var;
        this.d = qbl0Var;
        this.e = aVar2;
        this.f = jas0Var;
        this.g = aVar3;
        this.h = smv0Var;
        this.i = wiq0Var;
        this.j = lifecycle;
        this.k = qpf0Var;
        this.l = bgx0Var;
        this.m = kotlin.a.a(new ck(on2Var, 25));
        this.n = new hbp0(new SummaryPromotionsRepository$scopeDelegate$1(0, tt2Var, tt2.class, "io", "io()Lkotlinx/coroutines/CoroutineDispatcher;", 0), null, 0 == true ? 1 : 0, 6);
        this.o = ((jbh) rqoVar).a(SimpleBooleanExperiment.SUMMARY_PROMOTIONS);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final CoroutineSingletons a(e eVar, ContinuationImpl continuationImpl) {
        SummaryPromotionsRepository$listenSummaryPromotionsFlow$1 summaryPromotionsRepository$listenSummaryPromotionsFlow$1;
        int i;
        eVar.getClass();
        if (continuationImpl instanceof SummaryPromotionsRepository$listenSummaryPromotionsFlow$1) {
            summaryPromotionsRepository$listenSummaryPromotionsFlow$1 = (SummaryPromotionsRepository$listenSummaryPromotionsFlow$1) continuationImpl;
            int i2 = summaryPromotionsRepository$listenSummaryPromotionsFlow$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                summaryPromotionsRepository$listenSummaryPromotionsFlow$1.label = i2 - Integer.MIN_VALUE;
                Object obj = summaryPromotionsRepository$listenSummaryPromotionsFlow$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = summaryPromotionsRepository$listenSummaryPromotionsFlow$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    r0 r0Var = eVar.p;
                    SummaryPromotionsRepository$listenSummaryPromotionsFlow$2 summaryPromotionsRepository$listenSummaryPromotionsFlow$2 = new SummaryPromotionsRepository$listenSummaryPromotionsFlow$2(eVar, null);
                    summaryPromotionsRepository$listenSummaryPromotionsFlow$1.L$0 = null;
                    summaryPromotionsRepository$listenSummaryPromotionsFlow$1.L$1 = null;
                    summaryPromotionsRepository$listenSummaryPromotionsFlow$1.label = 1;
                    if (kotlinx.coroutines.flow.e.k(r0Var, summaryPromotionsRepository$listenSummaryPromotionsFlow$2, summaryPromotionsRepository$listenSummaryPromotionsFlow$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                ny61.r("SharedFlow never completes, this call should never return.");
                return null;
            }
        }
        summaryPromotionsRepository$listenSummaryPromotionsFlow$1 = new SummaryPromotionsRepository$listenSummaryPromotionsFlow$1(eVar, continuationImpl);
        Object obj2 = summaryPromotionsRepository$listenSummaryPromotionsFlow$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = summaryPromotionsRepository$listenSummaryPromotionsFlow$1.label;
        if (i != 0) {
        }
        ny61.r("SharedFlow never completes, this call should never return.");
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0073, code lost:
    
        if (r10 == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(e eVar, dbl0 dbl0Var, ContinuationImpl continuationImpl) {
        SummaryPromotionsRepository$requestPromotions$1 summaryPromotionsRepository$requestPromotions$1;
        int i;
        Object value;
        umv0 umv0Var;
        SummaryPromotionsParam summaryPromotionsParam;
        eVar.getClass();
        if (continuationImpl instanceof SummaryPromotionsRepository$requestPromotions$1) {
            summaryPromotionsRepository$requestPromotions$1 = (SummaryPromotionsRepository$requestPromotions$1) continuationImpl;
            int i2 = summaryPromotionsRepository$requestPromotions$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                summaryPromotionsRepository$requestPromotions$1.label = i2 - Integer.MIN_VALUE;
                Object obj = summaryPromotionsRepository$requestPromotions$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = summaryPromotionsRepository$requestPromotions$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (dbl0Var.a.t) {
                        return jnv0.b;
                    }
                    r0 r0Var = eVar.p;
                    do {
                        value = r0Var.getValue();
                        umv0Var = (umv0) value;
                        if (!umv0Var.b) {
                            umv0Var = umv0.a(umv0Var, null, 1);
                        }
                    } while (!r0Var.k(value, umv0Var));
                    ru.yandex.taxi.summary.promotions.factory.a aVar = eVar.e;
                    yal0 yal0Var = dbl0Var.a;
                    summaryPromotionsRepository$requestPromotions$1.L$0 = null;
                    summaryPromotionsRepository$requestPromotions$1.label = 1;
                    obj = aVar.a(yal0Var, summaryPromotionsRepository$requestPromotions$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    kotlin.b.b(obj);
                }
                summaryPromotionsParam = (SummaryPromotionsParam) obj;
                if (summaryPromotionsParam != SummaryPromotionsParam.k) {
                    return jnv0.b;
                }
                summaryPromotionsRepository$requestPromotions$1.L$0 = null;
                summaryPromotionsRepository$requestPromotions$1.L$1 = null;
                summaryPromotionsRepository$requestPromotions$1.label = 2;
                Object g = eVar.g(summaryPromotionsParam, summaryPromotionsRepository$requestPromotions$1);
                return g == obj2 ? obj2 : g;
            }
        }
        summaryPromotionsRepository$requestPromotions$1 = new SummaryPromotionsRepository$requestPromotions$1(eVar, continuationImpl);
        Object obj3 = summaryPromotionsRepository$requestPromotions$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = summaryPromotionsRepository$requestPromotions$1.label;
        if (i != 0) {
        }
        summaryPromotionsParam = (SummaryPromotionsParam) obj3;
        if (summaryPromotionsParam != SummaryPromotionsParam.k) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean c(SummaryPromotionsResponse.a aVar, Map map, List list, List list2, boolean z) {
        jsq0 m = aVar.getM();
        if (m != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (!m.contains((SummaryPromotionsResponse.DisplayOnType) it.next())) {
                    break;
                }
            }
        }
        if (list2.contains(aVar.getN().a())) {
            int i = gnv0.a[aVar.getG().getC().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        w511.b();
                        return false;
                    }
                } else if (z) {
                    z = false;
                }
                if (z) {
                    fas0 fas0Var = (fas0) map.get(aVar.getA());
                    if (fas0Var != null) {
                        SummaryPromotionsResponse.a.c g = aVar.getG();
                        if (fas0Var.a >= g.getA() || fas0Var.b >= g.getB()) {
                            break;
                        }
                    }
                    return true;
                }
            }
            z = true;
            if (z) {
            }
        }
        return false;
    }

    public static FormattedText f(String str, FormattedText formattedText) {
        if (formattedText.a.isEmpty()) {
            return new FormattedText(Collections.singletonList(new FormattedText.h(str, null, null, null, null, null, 2046)));
        }
        List<Object> list = formattedText.a;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        for (Object obj : list) {
            if (obj instanceof FormattedText.h) {
                obj = FormattedText.h.e((FormattedText.h) obj, str, null, null, 2046);
            }
            arrayList.add(obj);
        }
        return new FormattedText(arrayList);
    }

    public final h d() {
        return kotlinx.coroutines.flow.e.K((tpr[]) Arrays.copyOf(new tpr[]{new mth(this.p, 4), this.f.d}, 2));
    }

    public final qrq0 e(String str, String str2, boolean z, SummaryPromotionsResponse summaryPromotionsResponse, List list, List list2) {
        Object obj;
        SummaryPromotionsResponse.d dVar = summaryPromotionsResponse.a.a;
        List<SummaryPromotionsResponse.a> list3 = dVar.a;
        for (SummaryPromotionsResponse.a aVar : list3) {
            if (aVar.getP() != null) {
                smv0 smv0Var = this.h;
                smv0Var.getClass();
                Map p = aVar.getP();
                if (p != null && !p.isEmpty()) {
                    synchronized (smv0Var.d) {
                        if (!smv0Var.e.contains(aVar.getA())) {
                            smv0Var.e.add(aVar.getA());
                            hst hstVar = jst.e;
                            Objects.toString(Thread.currentThread());
                            hstVar.getClass();
                            ((com.yandex.go.analytics.realtime.a) smv0Var.c).d(new lei0(CreativeType.PromoOnSummary, aVar.getA(), aVar.getP()));
                        }
                    }
                }
            }
        }
        Iterator it = dVar.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (jl40.l(((SummaryPromotionsResponse.g) obj).getA(), str)) {
                break;
            }
        }
        SummaryPromotionsResponse.g gVar = (SummaryPromotionsResponse.g) obj;
        List b = gVar != null ? gVar.getB() : null;
        List list4 = b;
        if (list4 == null || list4.isEmpty()) {
            return ixn.a;
        }
        return new yw01(kotlin.sequences.b.g(kotlin.sequences.b.o(new h73(1, b), new qh2(list3, 16)), new zw0(this, this.f.a(), list, list2, z, str2)), new lzu0(6, this, str));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(SummaryPromotionsParam summaryPromotionsParam, ContinuationImpl continuationImpl) {
        SummaryPromotionsRepository$requestPromotionsFromNet$1 summaryPromotionsRepository$requestPromotionsFromNet$1;
        int i;
        try {
            if (continuationImpl instanceof SummaryPromotionsRepository$requestPromotionsFromNet$1) {
                summaryPromotionsRepository$requestPromotionsFromNet$1 = (SummaryPromotionsRepository$requestPromotionsFromNet$1) continuationImpl;
                int i2 = summaryPromotionsRepository$requestPromotionsFromNet$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    summaryPromotionsRepository$requestPromotionsFromNet$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = summaryPromotionsRepository$requestPromotionsFromNet$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = summaryPromotionsRepository$requestPromotionsFromNet$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        cmt<SummaryPromotionsResponse> a = ((SummaryPromotionsApi) this.m.getValue()).a(summaryPromotionsParam);
                        summaryPromotionsRepository$requestPromotionsFromNet$1.L$0 = null;
                        summaryPromotionsRepository$requestPromotionsFromNet$1.label = 1;
                        obj = ru.yandex.taxi.network.api.a.a(a, null, summaryPromotionsRepository$requestPromotionsFromNet$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                    }
                    return new umv0((SummaryPromotionsResponse) obj, false);
                }
            }
            if (i != 0) {
            }
            return new umv0((SummaryPromotionsResponse) obj, false);
        } catch (Exception e) {
            jst.e.k(e, "Error getting summary promotions");
            return jnv0.b;
        }
        summaryPromotionsRepository$requestPromotionsFromNet$1 = new SummaryPromotionsRepository$requestPromotionsFromNet$1(this, continuationImpl);
        Object obj2 = summaryPromotionsRepository$requestPromotionsFromNet$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = summaryPromotionsRepository$requestPromotionsFromNet$1.label;
    }

    public final void h() {
        hbp0 hbp0Var = this.n;
        hbp0Var.a();
        tje.N(hbp0Var, null, null, new SummaryPromotionsRepository$start$$inlined$safeCollectIn$1(new d(r.b(this.j)), null, this), 3);
        tje.N(hbp0Var.c(), null, null, new SummaryPromotionsRepository$start$3(this, null), 3);
        tje.N(hbp0Var.c(), null, null, new SummaryPromotionsRepository$start$4(this, null), 3);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r12v4 flv0, still in use, count: 2, list:
          (r12v4 flv0) from 0x0221: MOVE (r26v1 flv0) = (r12v4 flv0)
          (r12v4 flv0) from 0x020c: MOVE (r26v4 flv0) = (r12v4 flv0)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x02a8 -> B:11:0x02a9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:84:0x029c -> B:10:0x029e). Please report as a decompilation issue!!! */
    public final java.lang.Object i(java.lang.String r24, java.lang.String r25, java.util.List r26, kotlin.coroutines.jvm.internal.ContinuationImpl r27) {
        /*
            Method dump skipped, instructions count: 697
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.yandex.taxi.summary.promotions.repository.e.i(java.lang.String, java.lang.String, java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final tmv0 j(String str, String str2, boolean z, List list, List list2) {
        umv0 umv0Var = (umv0) this.p.getValue();
        return new tmv0(kotlin.sequences.b.s(e(str, str2, z, umv0Var.a, list, list2)), umv0Var.b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0091, code lost:
    
        if (r10.a().f() >= (r11 != null ? r11.a().f() : 0)) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final nnv0 k(String str, String str2, boolean z) {
        r0 r0Var = this.p;
        boolean z2 = ((umv0) r0Var.getValue()).b;
        qrq0 e = e(str, str2, z, ((umv0) r0Var.getValue()).a, jnv0.a, jnv0.c);
        t5r g = kotlin.sequences.b.g(e, new omu0(24));
        inv0 inv0Var = new inv0();
        List t = kotlin.sequences.b.t(g);
        xcc.q(t, inv0Var);
        Iterator it = ((ArrayList) t).iterator();
        nmv0 nmv0Var = null;
        zkv0 zkv0Var = (zkv0) (!it.hasNext() ? null : it.next());
        nmv0 nmv0Var2 = zkv0Var != null ? new nmv0(zkv0Var, z2) : null;
        zkv0 zkv0Var2 = (zkv0) kotlin.sequences.b.j(kotlin.sequences.b.g(e, new omu0(25)));
        nmv0 nmv0Var3 = zkv0Var2 != null ? new nmv0(zkv0Var2, z2) : null;
        if ((nmv0Var3 != null ? nmv0Var3.a().c() : null) instanceof j0e) {
        }
        nmv0Var = nmv0Var2;
        return new nnv0(nmv0Var3, nmv0Var);
    }
}
