package ru.yandex.taxi.logistics.sdk.management;

import defpackage.ixa0;
import defpackage.lxa0;
import defpackage.ny61;
import defpackage.puh;
import defpackage.vpr;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class d implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ String b;
    public final /* synthetic */ puh c;

    public d(vpr vprVar, String str, puh puhVar) {
        this.a = vprVar;
        this.b = str;
        this.c = puhVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        DeliveriesManagerImpl$getPerformerRouteFlows$lambda$0$$inlined$map$1$2$1 deliveriesManagerImpl$getPerformerRouteFlows$lambda$0$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof DeliveriesManagerImpl$getPerformerRouteFlows$lambda$0$$inlined$map$1$2$1) {
            deliveriesManagerImpl$getPerformerRouteFlows$lambda$0$$inlined$map$1$2$1 = (DeliveriesManagerImpl$getPerformerRouteFlows$lambda$0$$inlined$map$1$2$1) continuation;
            int i2 = deliveriesManagerImpl$getPerformerRouteFlows$lambda$0$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deliveriesManagerImpl$getPerformerRouteFlows$lambda$0$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = deliveriesManagerImpl$getPerformerRouteFlows$lambda$0$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deliveriesManagerImpl$getPerformerRouteFlows$lambda$0$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    puh puhVar = this.c;
                    List list = puhVar.k;
                    List list2 = puhVar.h;
                    lxa0 lxa0Var = new lxa0(this.b, list, list2, (ixa0) obj);
                    deliveriesManagerImpl$getPerformerRouteFlows$lambda$0$$inlined$map$1$2$1.L$0 = null;
                    deliveriesManagerImpl$getPerformerRouteFlows$lambda$0$$inlined$map$1$2$1.L$1 = null;
                    deliveriesManagerImpl$getPerformerRouteFlows$lambda$0$$inlined$map$1$2$1.L$2 = null;
                    deliveriesManagerImpl$getPerformerRouteFlows$lambda$0$$inlined$map$1$2$1.L$3 = null;
                    deliveriesManagerImpl$getPerformerRouteFlows$lambda$0$$inlined$map$1$2$1.I$0 = 0;
                    deliveriesManagerImpl$getPerformerRouteFlows$lambda$0$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(lxa0Var, deliveriesManagerImpl$getPerformerRouteFlows$lambda$0$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        deliveriesManagerImpl$getPerformerRouteFlows$lambda$0$$inlined$map$1$2$1 = new DeliveriesManagerImpl$getPerformerRouteFlows$lambda$0$$inlined$map$1$2$1(this, continuation);
        Object obj22 = deliveriesManagerImpl$getPerformerRouteFlows$lambda$0$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deliveriesManagerImpl$getPerformerRouteFlows$lambda$0$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
