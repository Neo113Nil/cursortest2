package ru.yandex.taxi.map_common.map;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.rk00;
import defpackage.tcc;
import defpackage.uk00;
import defpackage.ycc;
import defpackage.zk00;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lzk00;", "global", "Luk00;", "navigator", "", "Lrk00;", "<anonymous>", "(Lzk00;Luk00;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.map_common.map.MapKitGlobalExperimentsInteractor$Companion$mergeExperimentFlows$1", f = "MapKitGlobalExperimentsInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class MapKitGlobalExperimentsInteractor$Companion$mergeExperimentFlows$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        MapKitGlobalExperimentsInteractor$Companion$mergeExperimentFlows$1 mapKitGlobalExperimentsInteractor$Companion$mergeExperimentFlows$1 = new MapKitGlobalExperimentsInteractor$Companion$mergeExperimentFlows$1(3, (Continuation) obj3);
        mapKitGlobalExperimentsInteractor$Companion$mergeExperimentFlows$1.L$0 = (zk00) obj;
        mapKitGlobalExperimentsInteractor$Companion$mergeExperimentFlows$1.L$1 = (uk00) obj2;
        return mapKitGlobalExperimentsInteractor$Companion$mergeExperimentFlows$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        zk00 zk00Var = (zk00) this.L$0;
        uk00 uk00Var = (uk00) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        boolean z = uk00Var.b;
        List list = EmptyList.a;
        List list2 = z ? uk00Var.c : list;
        if (zk00Var.b) {
            Map map = zk00Var.d;
            List arrayList = new ArrayList();
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                Map map2 = (Map) entry.getValue();
                ArrayList arrayList2 = new ArrayList();
                for (Map.Entry entry2 : map2.entrySet()) {
                    String str2 = (String) entry2.getKey();
                    List list3 = (List) entry2.getValue();
                    ArrayList arrayList3 = new ArrayList(tcc.n(list3, 10));
                    Iterator it = list3.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(new rk00(str, str2, (String) it.next()));
                    }
                    ycc.r(arrayList3, arrayList2);
                }
                ycc.r(arrayList2, arrayList);
            }
            list = arrayList;
        }
        List<rk00> list4 = list;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (rk00 rk00Var : list4) {
            linkedHashSet.add(new Pair(rk00Var.a, rk00Var.b));
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : list2) {
            rk00 rk00Var2 = (rk00) obj2;
            if (!linkedHashSet.contains(new Pair(rk00Var2.a, rk00Var2.b))) {
                arrayList4.add(obj2);
            }
        }
        return kotlin.collections.a.m0(list4, arrayList4);
    }
}
