package ru.yandex.taxi.masstransit.trains.checkout;

import defpackage.agd;
import defpackage.gb40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.td40;
import defpackage.tse;
import defpackage.wls;
import defpackage.ya40;
import defpackage.yfd;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.trains.checkout.MtTrainCheckoutModalRouter$content$1$1$1", f = "MtTrainCheckoutModalRouter.kt", l = {85}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtTrainCheckoutModalRouter$content$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ td40 $action;
    final /* synthetic */ yfd $this_buildContent;
    int label;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtTrainCheckoutModalRouter$content$1$1$1(i iVar, td40 td40Var, yfd yfdVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = iVar;
        this.$action = td40Var;
        this.$this_buildContent = yfdVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MtTrainCheckoutModalRouter$content$1$1$1(this.this$0, this.$action, this.$this_buildContent, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtTrainCheckoutModalRouter$content$1$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            a aVar = (a) this.this$0.U.getValue();
            td40 td40Var = this.$action;
            r U = this.this$0.U();
            i iVar = this.this$0;
            ya40 ya40Var = iVar.T;
            gb40 gb40Var = (gb40) ((agd) this.$this_buildContent).a;
            tse o = iVar.o();
            this.label = 1;
            if (aVar.b(td40Var, U, ya40Var, gb40Var, o, this) == coroutineSingletons) {
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
