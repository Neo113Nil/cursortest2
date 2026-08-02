package ru.yandex.taxi.masstransit.stop.router;

import defpackage.agd;
import defpackage.igu0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.v040;
import defpackage.wls;
import defpackage.x140;
import defpackage.y140;
import defpackage.yfd;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.stop.router.MtStopModalRouter$content$1$1$1", f = "MtStopModalRouter.kt", l = {109}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtStopModalRouter$content$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ v040 $action;
    final /* synthetic */ x140 $navigator;
    final /* synthetic */ yfd $this_buildContent;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtStopModalRouter$content$1$1$1(b bVar, v040 v040Var, x140 x140Var, yfd yfdVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$action = v040Var;
        this.$navigator = x140Var;
        this.$this_buildContent = yfdVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MtStopModalRouter$content$1$1$1(this.this$0, this.$action, this.$navigator, this.$this_buildContent, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtStopModalRouter$content$1$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ru.yandex.taxi.masstransit.stop.interactor.a aVar = this.this$0.U;
            v040 v040Var = this.$action;
            x140 x140Var = this.$navigator;
            igu0 igu0Var = ((y140) ((agd) this.$this_buildContent).a).a;
            this.label = 1;
            if (aVar.b(v040Var, x140Var, igu0Var, this) == coroutineSingletons) {
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
