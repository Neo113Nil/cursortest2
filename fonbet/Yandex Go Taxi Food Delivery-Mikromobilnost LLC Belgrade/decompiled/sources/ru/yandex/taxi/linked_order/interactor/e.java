package ru.yandex.taxi.linked_order.interactor;

import androidx.lifecycle.Lifecycle;
import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import defpackage.a3y0;
import defpackage.g050;
import defpackage.gtq0;
import defpackage.hpy;
import defpackage.hvx;
import defpackage.ipy;
import defpackage.jst;
import defpackage.l8x;
import defpackage.lxx;
import defpackage.ny61;
import defpackage.owx;
import defpackage.qoy;
import defpackage.s10;
import defpackage.scc;
import defpackage.sny;
import defpackage.tcc;
import defpackage.tny;
import defpackage.tse;
import defpackage.uny;
import defpackage.w511;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.linked_order.models.data.LinkedOrderType;
import ru.yandex.taxi.linked_order.models.net.dto.LinkedOrderStatusDto;
import ru.yandex.taxi.linked_order.models.net.dto.LinkedOrderTypeDto;

/* loaded from: classes9.dex */
public final class e implements lxx {
    public final s10 a;
    public final ipy b;
    public final ru.yandex.taxi.am.m c;
    public final com.yandex.go.lifecycle.a d;
    public final ru.yandex.taxi.linked_order.provider.e e;
    public final uny f;
    public final qoy g;
    public final ru.yandex.taxi.linked_order.provider.i h;
    public final tse i;
    public final Lifecycle j;
    public List l;
    public final a3y0 k = new a3y0(TaxiOrderLogGroup.EMPTY.getTag(), "LaunchLinkedOrdersInteractor");
    public final kotlinx.coroutines.sync.a m = gtq0.a();

    public e(s10 s10Var, ipy ipyVar, ru.yandex.taxi.am.m mVar, com.yandex.go.lifecycle.a aVar, ru.yandex.taxi.linked_order.provider.e eVar, uny unyVar, qoy qoyVar, ru.yandex.taxi.linked_order.provider.i iVar, tse tseVar, Lifecycle lifecycle) {
        this.a = s10Var;
        this.b = ipyVar;
        this.c = mVar;
        this.d = aVar;
        this.e = eVar;
        this.f = unyVar;
        this.g = qoyVar;
        this.h = iVar;
        this.i = tseVar;
        this.j = lifecycle;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x008a, code lost:
    
        if (r11.a(r0) == r1) goto L57;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0092 A[Catch: all -> 0x00a8, TryCatch #0 {all -> 0x00a8, blocks: (B:17:0x008e, B:19:0x0092, B:20:0x0098, B:22:0x009e, B:24:0x00ab), top: B:16:0x008e }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0115 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0138 A[LOOP:2: B:55:0x0132->B:57:0x0138, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0158 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0159 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r10v9, types: [g050] */
    @Override // defpackage.lxx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(owx owxVar, Continuation continuation) {
        LaunchLinkedOrdersInteractor$process$1 launchLinkedOrdersInteractor$process$1;
        int i;
        List g;
        kotlinx.coroutines.sync.a aVar;
        List list;
        Iterator it;
        LinkedOrderType linkedOrderType;
        sny snyVar;
        try {
            if (continuation instanceof LaunchLinkedOrdersInteractor$process$1) {
                launchLinkedOrdersInteractor$process$1 = (LaunchLinkedOrdersInteractor$process$1) continuation;
                int i2 = launchLinkedOrdersInteractor$process$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    launchLinkedOrdersInteractor$process$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = launchLinkedOrdersInteractor$process$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = launchLinkedOrdersInteractor$process$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        LaunchLinkedOrdersInteractor$process$processJobs$1 launchLinkedOrdersInteractor$process$processJobs$1 = new LaunchLinkedOrdersInteractor$process$processJobs$1(null, this);
                        tse tseVar = this.i;
                        g = scc.g(com.yandex.go.coroutines.b.g(tseVar, null, null, launchLinkedOrdersInteractor$process$processJobs$1, 3), com.yandex.go.coroutines.b.g(tseVar, null, null, new LaunchLinkedOrdersInteractor$process$processJobs$2(null, this), 3));
                        launchLinkedOrdersInteractor$process$1.L$0 = owxVar;
                        launchLinkedOrdersInteractor$process$1.L$1 = g;
                        aVar = this.m;
                        launchLinkedOrdersInteractor$process$1.L$2 = aVar;
                        launchLinkedOrdersInteractor$process$1.label = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kotlin.b.b(obj);
                            return obj;
                        }
                        ?? r10 = (g050) launchLinkedOrdersInteractor$process$1.L$2;
                        g = (List) launchLinkedOrdersInteractor$process$1.L$1;
                        owx owxVar2 = (owx) launchLinkedOrdersInteractor$process$1.L$0;
                        kotlin.b.b(obj);
                        aVar = r10;
                        owxVar = owxVar2;
                    }
                    list = this.l;
                    if (list != null) {
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            ((l8x) it2.next()).a(null);
                        }
                    }
                    this.l = g;
                    aVar.d(null);
                    List<hvx> list2 = owxVar.z;
                    ArrayList arrayList = new ArrayList();
                    for (hvx hvxVar : list2) {
                        LinkedOrderTypeDto c = hvxVar.getC();
                        this.f.getClass();
                        int i3 = tny.a[c.ordinal()];
                        if (i3 == 1) {
                            linkedOrderType = LinkedOrderType.AMBULANCE;
                        } else {
                            if (i3 != 2) {
                                w511.b();
                                return null;
                            }
                            linkedOrderType = LinkedOrderType.DEFAULT;
                        }
                        LinkedOrderStatusDto b = hvxVar.getB();
                        this.b.getClass();
                        switch (b == null ? -1 : hpy.a[b.ordinal()]) {
                            case -1:
                                jst.e.getClass();
                                snyVar = null;
                                if (snyVar != null) {
                                    arrayList.add(snyVar);
                                }
                            case 0:
                            default:
                                w511.b();
                                return null;
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                                snyVar = new sny(hvxVar.getA(), linkedOrderType);
                                if (snyVar != null) {
                                }
                                break;
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                                snyVar = null;
                                if (snyVar != null) {
                                }
                                break;
                        }
                    }
                    r0 r0Var = this.a.a;
                    r0Var.getClass();
                    r0Var.m(null, arrayList);
                    ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                    it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((sny) it.next()).a);
                    }
                    launchLinkedOrdersInteractor$process$1.L$0 = null;
                    launchLinkedOrdersInteractor$process$1.L$1 = null;
                    launchLinkedOrdersInteractor$process$1.L$2 = null;
                    launchLinkedOrdersInteractor$process$1.L$3 = null;
                    launchLinkedOrdersInteractor$process$1.L$4 = null;
                    launchLinkedOrdersInteractor$process$1.label = 2;
                    Object b2 = this.e.b(arrayList2, launchLinkedOrdersInteractor$process$1);
                    return b2 != coroutineSingletons ? coroutineSingletons : b2;
                }
            }
            list = this.l;
            if (list != null) {
            }
            this.l = g;
            aVar.d(null);
            List<hvx> list22 = owxVar.z;
            ArrayList arrayList3 = new ArrayList();
            while (r10.hasNext()) {
            }
            r0 r0Var2 = this.a.a;
            r0Var2.getClass();
            r0Var2.m(null, arrayList3);
            ArrayList arrayList22 = new ArrayList(tcc.n(arrayList3, 10));
            it = arrayList3.iterator();
            while (it.hasNext()) {
            }
            launchLinkedOrdersInteractor$process$1.L$0 = null;
            launchLinkedOrdersInteractor$process$1.L$1 = null;
            launchLinkedOrdersInteractor$process$1.L$2 = null;
            launchLinkedOrdersInteractor$process$1.L$3 = null;
            launchLinkedOrdersInteractor$process$1.L$4 = null;
            launchLinkedOrdersInteractor$process$1.label = 2;
            Object b22 = this.e.b(arrayList22, launchLinkedOrdersInteractor$process$1);
            if (b22 != coroutineSingletons) {
            }
        } catch (Throwable th) {
            aVar.d(null);
            throw th;
        }
        launchLinkedOrdersInteractor$process$1 = new LaunchLinkedOrdersInteractor$process$1(this, (ContinuationImpl) continuation);
        Object obj2 = launchLinkedOrdersInteractor$process$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = launchLinkedOrdersInteractor$process$1.label;
        if (i != 0) {
        }
    }

    @Override // defpackage.j35
    public final String getName() {
        return "LaunchLinkedOrdersInteractor";
    }
}
