package ru.yandex.taxi.logistics.sdk.management.deliveries;

import defpackage.buh;
import defpackage.cuh;
import defpackage.duh;
import defpackage.hfi;
import defpackage.hwh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.management.deliveries.DeliveriesModel$clearAlerts$1", f = "DeliveriesModel.kt", l = {102}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class DeliveriesModel$clearAlerts$1 extends SuspendLambda implements wls {
    final /* synthetic */ buh $state;
    int I$0;
    Object L$0;
    int label;
    final /* synthetic */ duh this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveriesModel$clearAlerts$1(buh buhVar, duh duhVar, Continuation continuation) {
        super(2, continuation);
        this.$state = buhVar;
        this.this$0 = duhVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DeliveriesModel$clearAlerts$1(this.$state, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DeliveriesModel$clearAlerts$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            List list = this.$state.a;
            if (list != null) {
                List list2 = list;
                ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((hfi) it.next()).e());
                }
                hwh hwhVar = this.this$0.a;
                cuh cuhVar = new cuh(arrayList, 0);
                this.L$0 = null;
                this.I$0 = 0;
                this.label = 1;
                if (((ru.yandex.taxi.logistics.sdk.delivery.state.b) hwhVar).c(cuhVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
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
