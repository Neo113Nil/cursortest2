package ru.yandex.taxi.logistics.sdk.tracking.domain.impl;

import defpackage.dms;
import defpackage.gri;
import defpackage.jgu;
import defpackage.jl40;
import defpackage.jwh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oth;
import defpackage.t701;
import defpackage.w701;
import defpackage.x701;
import defpackage.zy11;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0016\u0010\n\u001a\u0012\u0012\b\u0012\u00060\u0003j\u0002`\b\u0012\u0004\u0012\u00020\t0\u0007H\n¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lx701;", "trackingState", "", "", "editingIds", "Loth;", "hiddenDeliveriesState", "", "Lru/yandex/logistics/cargo_form/async/api/TaskId;", "Lc3s;", "activeTasks", "<anonymous>", "(Lx701;Ljava/util/Set;Loth;Ljava/util/Map;)Lx701;"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.tracking.domain.impl.TrackingRepositoryImpl$_trackingFlow$1", f = "TrackingRepositoryImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class TrackingRepositoryImpl$_trackingFlow$1 extends SuspendLambda implements dms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    /* synthetic */ Object L$3;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackingRepositoryImpl$_trackingFlow$1(e eVar, Continuation continuation) {
        super(5, continuation);
        this.this$0 = eVar;
    }

    @Override // defpackage.dms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        TrackingRepositoryImpl$_trackingFlow$1 trackingRepositoryImpl$_trackingFlow$1 = new TrackingRepositoryImpl$_trackingFlow$1(this.this$0, (Continuation) obj5);
        trackingRepositoryImpl$_trackingFlow$1.L$0 = (x701) obj;
        trackingRepositoryImpl$_trackingFlow$1.L$1 = (Set) obj2;
        trackingRepositoryImpl$_trackingFlow$1.L$2 = (oth) obj3;
        trackingRepositoryImpl$_trackingFlow$1.L$3 = (Map) obj4;
        return trackingRepositoryImpl$_trackingFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        x701 x701Var = (x701) this.L$0;
        Set set = (Set) this.L$1;
        oth othVar = (oth) this.L$2;
        Map map = (Map) this.L$3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (!(x701Var instanceof t701)) {
            return x701Var;
        }
        Set<jgu> set2 = othVar.a;
        if (!(set2 instanceof Collection) || !set2.isEmpty()) {
            for (jgu jguVar : set2) {
                String str = jguVar.a;
                t701 t701Var = (t701) x701Var;
                int i = t701Var.b;
                gri griVar = t701Var.a;
                if (jl40.l(str, griVar.a) && i <= jguVar.b) {
                    jwh jwhVar = this.this$0.c;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("order_id", griVar.a);
                    linkedHashMap.put("revision", new Integer(i));
                    jwhVar.a.o("Delivery.OrderError.TrackingOpenedForHiddenDelivery", null, linkedHashMap);
                    return w701.a;
                }
            }
        }
        e eVar = this.this$0;
        t701 t701Var2 = (t701) x701Var;
        gri griVar2 = t701Var2.a;
        boolean contains = set.contains(eVar.a.a);
        return new t701(new gri(griVar2.a, griVar2.b, griVar2.c, griVar2.d, griVar2.e, griVar2.f, griVar2.g, griVar2.h, griVar2.i, griVar2.j, griVar2.k, griVar2.l, eVar.a(griVar2.m, contains, map), eVar.a(griVar2.n, contains, map), griVar2.o, griVar2.p, griVar2.q, griVar2.r, griVar2.s, griVar2.t, griVar2.u, griVar2.v, griVar2.w, griVar2.x), t701Var2.b);
    }
}
