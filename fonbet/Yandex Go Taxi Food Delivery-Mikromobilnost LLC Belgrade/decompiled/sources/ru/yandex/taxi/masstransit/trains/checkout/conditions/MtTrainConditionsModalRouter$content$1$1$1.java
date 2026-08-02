package ru.yandex.taxi.masstransit.trains.checkout.conditions;

import defpackage.ge40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.trains.checkout.conditions.MtTrainConditionsModalRouter$content$1$1$1", f = "MtTrainConditionsModalRouter.kt", l = {28}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtTrainConditionsModalRouter$content$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ ge40 $action;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtTrainConditionsModalRouter$content$1$1$1(b bVar, ge40 ge40Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$action = ge40Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MtTrainConditionsModalRouter$content$1$1$1(this.this$0, this.$action, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtTrainConditionsModalRouter$content$1$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        b bVar = this.this$0;
        ge40 ge40Var = this.$action;
        this.label = 1;
        b.U(bVar, ge40Var);
        return zy11Var == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
