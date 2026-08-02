package ru.yandex.taxi.logistics.deliveries.multiorder;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.aiz;
import defpackage.avj0;
import defpackage.cm2;
import defpackage.cne0;
import defpackage.g6u;
import defpackage.i5v;
import defpackage.ihz;
import defpackage.khz;
import defpackage.kyh0;
import defpackage.lhz;
import defpackage.mvg;
import defpackage.nuh;
import defpackage.ny61;
import defpackage.o400;
import defpackage.ouh;
import defpackage.oxa0;
import defpackage.p0u;
import defpackage.puh;
import defpackage.qrq0;
import defpackage.quh;
import defpackage.sjh;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.vhz;
import defpackage.vms;
import defpackage.vwa0;
import defpackage.w511;
import defpackage.wls;
import defpackage.xhz;
import defpackage.xli;
import defpackage.xnt;
import defpackage.y7u;
import defpackage.yhz;
import defpackage.ysa1;
import defpackage.zhz;
import defpackage.zls;
import defpackage.zuj0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "Lquh;", "deliveries", "", "Lxli;", "ongoingCalls", "Lvhz;", "<anonymous>", "(Ljava/util/List;Ljava/util/Set;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.logistics.deliveries.multiorder.LogisticsOrdersInteractor$ordersOnMultiorderFlow$1", f = "LogisticsOrdersInteractor.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.THIRD_PARTY_COOKIE_DEPRECATION_METADATA_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class LogisticsOrdersInteractor$ordersOnMultiorderFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ d this$0;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "Lvhz;", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.logistics.deliveries.multiorder.LogisticsOrdersInteractor$ordersOnMultiorderFlow$1$1", f = "LogisticsOrdersInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.logistics.deliveries.multiorder.LogisticsOrdersInteractor$ordersOnMultiorderFlow$1$1, reason: invalid class name */
    /* loaded from: classes5.dex */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ List<quh> $deliveries;
        final /* synthetic */ Set<xli> $ongoingCalls;
        int label;
        final /* synthetic */ d this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(List list, d dVar, Set set, Continuation continuation) {
            super(2, continuation);
            this.$deliveries = list;
            this.this$0 = dVar;
            this.$ongoingCalls = set;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.$deliveries, this.this$0, this.$ongoingCalls, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Iterator it;
            d dVar;
            vhz vhzVar;
            String str;
            khz khzVar;
            zhz zhzVar;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            List<quh> list = this.$deliveries;
            d dVar2 = this.this$0;
            Set<xli> set = this.$ongoingCalls;
            ArrayList arrayList = new ArrayList(tcc.n(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                quh quhVar = (quh) it2.next();
                aiz aizVar = dVar2.c;
                zuj0 zuj0Var = aizVar.b;
                boolean z = quhVar instanceof puh;
                EmptyList emptyList = EmptyList.a;
                zhz zhzVar2 = xhz.a;
                if (z) {
                    puh puhVar = (puh) quhVar;
                    String str2 = puhVar.a;
                    String str3 = puhVar.a;
                    String str4 = puhVar.b;
                    UUID uuid = puhVar.c;
                    String str5 = puhVar.d;
                    String str6 = puhVar.e;
                    lhz lhzVar = aizVar.a;
                    Object obj2 = puhVar.o;
                    if (obj2 instanceof Map) {
                        str = null;
                        khzVar = new khz(((xnt) lhzVar.a).a(obj2, cm2.a));
                    } else {
                        lhzVar.getClass();
                        khzVar = null;
                        str = null;
                    }
                    i5v i5vVar = puhVar.f;
                    if (i5vVar != null) {
                        zhzVar = new yhz(i5vVar.a);
                    } else {
                        if (i5vVar != null) {
                            w511.b();
                            return str;
                        }
                        zhzVar = zhzVar2;
                    }
                    vwa0 vwa0Var = puhVar.g;
                    oxa0 oxa0Var = puhVar.i;
                    List list2 = puhVar.j;
                    List list3 = puhVar.l;
                    it = it2;
                    Map c = ysa1.c(puhVar);
                    dVar = dVar2;
                    Object obj3 = c != null ? c.get("order_status") : str;
                    String str7 = obj3 instanceof String ? (String) obj3 : str;
                    if (str7 == null) {
                        str7 = "";
                    }
                    vhzVar = new vhz(str3, str4, uuid, str5, str6, khzVar, zhzVar, vwa0Var, oxa0Var, list2, list3, new ihz(str2, str7, emptyList, c), set.contains(new xli(str2)), puhVar.p, puhVar.r, false, puhVar.t);
                } else {
                    it = it2;
                    dVar = dVar2;
                    if (quhVar instanceof nuh) {
                        nuh nuhVar = (nuh) quhVar;
                        vhzVar = new vhz(null, null, nuhVar.a, ((avj0) zuj0Var).h(kyh0.logistics_multiorder_creating_task_title), null, null, zhzVar2, null, null, emptyList, emptyList, null, false, false, false, true, nuhVar.b);
                    } else {
                        if (!(quhVar instanceof ouh)) {
                            w511.b();
                            return null;
                        }
                        ouh ouhVar = (ouh) quhVar;
                        avj0 avj0Var = (avj0) zuj0Var;
                        vhzVar = new vhz(null, ouhVar.a, null, avj0Var.h(kyh0.pending_market_delivery_list_item_title), avj0Var.h(kyh0.pending_market_delivery_list_item_subtitle), null, null, null, null, emptyList, emptyList, null, false, false, false, true, ouhVar.b);
                    }
                }
                arrayList.add(vhzVar);
                it2 = it;
                dVar2 = dVar;
            }
            return arrayList;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LogisticsOrdersInteractor$ordersOnMultiorderFlow$1(d dVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = dVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LogisticsOrdersInteractor$ordersOnMultiorderFlow$1 logisticsOrdersInteractor$ordersOnMultiorderFlow$1 = new LogisticsOrdersInteractor$ordersOnMultiorderFlow$1(this.this$0, (Continuation) obj3);
        logisticsOrdersInteractor$ordersOnMultiorderFlow$1.L$0 = (List) obj;
        logisticsOrdersInteractor$ordersOnMultiorderFlow$1.L$1 = (Set) obj2;
        return logisticsOrdersInteractor$ordersOnMultiorderFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List list = (List) this.L$0;
        Set set = (Set) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            qrq0 qrq0Var = y7u.b;
            ArrayList g = vms.g(list, new p0u(20));
            cne0 cne0Var = this.this$0.d.a;
            cne0Var.u("logistic", !g.isEmpty());
            cne0Var.r("logistic_statuses", vms.e("logistic", g));
            if (list.isEmpty()) {
                return EmptyList.a;
            }
            this.this$0.a.getClass();
            sjh sjhVar = uyj.a;
            g6u g6uVar = o400.a;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(list, this.this$0, set, null);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 1;
            obj = tje.k0(g6uVar, anonymousClass1, this);
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
        return (List) obj;
    }
}
