package ru.yandex.taxi.linked_order.provider;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.v10;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.internal.j;

/* loaded from: classes5.dex */
public final class c implements tpr {
    public final /* synthetic */ tpr[] a;

    public c(tpr[] tprVarArr) {
        this.a = tprVarArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        ActiveLinkedOrderRepository$activeOrdersFlow$lambda$0$$inlined$combine$1$1 activeLinkedOrderRepository$activeOrdersFlow$lambda$0$$inlined$combine$1$1;
        int i;
        if (continuation instanceof ActiveLinkedOrderRepository$activeOrdersFlow$lambda$0$$inlined$combine$1$1) {
            activeLinkedOrderRepository$activeOrdersFlow$lambda$0$$inlined$combine$1$1 = (ActiveLinkedOrderRepository$activeOrdersFlow$lambda$0$$inlined$combine$1$1) continuation;
            int i2 = activeLinkedOrderRepository$activeOrdersFlow$lambda$0$$inlined$combine$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                activeLinkedOrderRepository$activeOrdersFlow$lambda$0$$inlined$combine$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = activeLinkedOrderRepository$activeOrdersFlow$lambda$0$$inlined$combine$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = activeLinkedOrderRepository$activeOrdersFlow$lambda$0$$inlined$combine$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    tpr[] tprVarArr = this.a;
                    v10 v10Var = new v10(tprVarArr, 0);
                    ActiveLinkedOrderRepository$activeOrdersFlow$lambda$0$$inlined$combine$1$3 activeLinkedOrderRepository$activeOrdersFlow$lambda$0$$inlined$combine$1$3 = new ActiveLinkedOrderRepository$activeOrdersFlow$lambda$0$$inlined$combine$1$3(3, null);
                    activeLinkedOrderRepository$activeOrdersFlow$lambda$0$$inlined$combine$1$1.L$0 = null;
                    activeLinkedOrderRepository$activeOrdersFlow$lambda$0$$inlined$combine$1$1.L$1 = null;
                    activeLinkedOrderRepository$activeOrdersFlow$lambda$0$$inlined$combine$1$1.L$2 = null;
                    activeLinkedOrderRepository$activeOrdersFlow$lambda$0$$inlined$combine$1$1.label = 1;
                    if (j.a(vprVar, v10Var, activeLinkedOrderRepository$activeOrdersFlow$lambda$0$$inlined$combine$1$3, activeLinkedOrderRepository$activeOrdersFlow$lambda$0$$inlined$combine$1$1, tprVarArr) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        activeLinkedOrderRepository$activeOrdersFlow$lambda$0$$inlined$combine$1$1 = new ActiveLinkedOrderRepository$activeOrdersFlow$lambda$0$$inlined$combine$1$1(this, continuation);
        Object obj2 = activeLinkedOrderRepository$activeOrdersFlow$lambda$0$$inlined$combine$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = activeLinkedOrderRepository$activeOrdersFlow$lambda$0$$inlined$combine$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
