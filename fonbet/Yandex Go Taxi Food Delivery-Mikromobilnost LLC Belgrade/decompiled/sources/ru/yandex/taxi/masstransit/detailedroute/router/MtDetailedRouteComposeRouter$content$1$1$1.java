package ru.yandex.taxi.masstransit.detailedroute.router;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.pf30;
import defpackage.qf30;
import defpackage.tse;
import defpackage.wh30;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.masstransit.detailedroute.ui.v2.d;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.detailedroute.router.MtDetailedRouteComposeRouter$content$1$1$1", f = "MtDetailedRouteComposeRouter.kt", l = {83}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtDetailedRouteComposeRouter$content$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ wh30 $action;
    int label;
    final /* synthetic */ qf30 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtDetailedRouteComposeRouter$content$1$1$1(qf30 qf30Var, wh30 wh30Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = qf30Var;
        this.$action = wh30Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MtDetailedRouteComposeRouter$content$1$1$1(this.this$0, this.$action, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtDetailedRouteComposeRouter$content$1$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            qf30 qf30Var = this.this$0;
            d dVar = qf30Var.I;
            wh30 wh30Var = this.$action;
            pf30 pf30Var = qf30Var.U;
            this.label = 1;
            if (dVar.c(wh30Var, pf30Var, this) == coroutineSingletons) {
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
