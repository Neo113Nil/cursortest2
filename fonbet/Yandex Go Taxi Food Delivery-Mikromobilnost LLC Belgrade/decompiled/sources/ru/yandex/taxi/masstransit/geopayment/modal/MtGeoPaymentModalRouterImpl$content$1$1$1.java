package ru.yandex.taxi.masstransit.geopayment.modal;

import defpackage.agd;
import defpackage.ml30;
import defpackage.mvg;
import defpackage.n26;
import defpackage.ny61;
import defpackage.pk30;
import defpackage.tse;
import defpackage.wls;
import defpackage.yfd;
import defpackage.zk30;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.geopayment.modal.MtGeoPaymentModalRouterImpl$content$1$1$1", f = "MtGeoPaymentModalRouterImpl.kt", l = {MSException.ERROR_INVALID_PARAMETER}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtGeoPaymentModalRouterImpl$content$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ ml30 $action;
    final /* synthetic */ yfd $this_buildContent;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtGeoPaymentModalRouterImpl$content$1$1$1(e eVar, ml30 ml30Var, yfd yfdVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$action = ml30Var;
        this.$this_buildContent = yfdVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MtGeoPaymentModalRouterImpl$content$1$1$1(this.this$0, this.$action, this.$this_buildContent, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtGeoPaymentModalRouterImpl$content$1$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            f fVar = (f) this.this$0.L.getValue();
            ml30 ml30Var = this.$action;
            e eVar = this.this$0;
            pk30 pk30Var = eVar.N;
            tse o = eVar.o();
            n26 n26Var = ((zk30) ((agd) this.$this_buildContent).a).a;
            this.label = 1;
            if (fVar.c(ml30Var, pk30Var, o, n26Var, this) == coroutineSingletons) {
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
