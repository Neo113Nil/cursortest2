package ru.yandex.taxi.logistics.deliveries.order;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.oxa0;
import defpackage.puh;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.logistics.deliveries.order.LogisticsTrackingTrackingCardUiStateInteractor$getTitleUpdates$$inlined$flatMapLatest$1", f = "LogisticsTrackingTrackingCardUiStateInteractor.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
public final class LogisticsTrackingTrackingCardUiStateInteractor$getTitleUpdates$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    final /* synthetic */ String $deliveryId$inlined;
    final /* synthetic */ String $modelTitle$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LogisticsTrackingTrackingCardUiStateInteractor$getTitleUpdates$$inlined$flatMapLatest$1(Continuation continuation, c cVar, String str, String str2) {
        super(3, continuation);
        this.this$0 = cVar;
        this.$modelTitle$inlined = str;
        this.$deliveryId$inlined = str2;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LogisticsTrackingTrackingCardUiStateInteractor$getTitleUpdates$$inlined$flatMapLatest$1 logisticsTrackingTrackingCardUiStateInteractor$getTitleUpdates$$inlined$flatMapLatest$1 = new LogisticsTrackingTrackingCardUiStateInteractor$getTitleUpdates$$inlined$flatMapLatest$1((Continuation) obj3, this.this$0, this.$modelTitle$inlined, this.$deliveryId$inlined);
        logisticsTrackingTrackingCardUiStateInteractor$getTitleUpdates$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        logisticsTrackingTrackingCardUiStateInteractor$getTitleUpdates$$inlined$flatMapLatest$1.L$1 = obj2;
        return logisticsTrackingTrackingCardUiStateInteractor$getTitleUpdates$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        oxa0 oxa0Var;
        oxa0 oxa0Var2;
        vpr vprVar = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            puh puhVar = (puh) obj2;
            tpr a = this.this$0.c.a(puhVar != null ? puhVar.d : null, puhVar != null ? puhVar.e : null, puhVar != null ? puhVar.m : null, this.$modelTitle$inlined, (puhVar == null || (oxa0Var2 = puhVar.i) == null) ? null : oxa0Var2.c, (puhVar == null || (oxa0Var = puhVar.i) == null) ? null : oxa0Var.a, this.$deliveryId$inlined);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (e.u(a, vprVar, this) == coroutineSingletons) {
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
