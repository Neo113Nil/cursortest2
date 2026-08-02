package ru.yandex.taxi.masstransit.detailedroute.interactor;

import defpackage.dz00;
import defpackage.ig30;
import defpackage.jf30;
import defpackage.k110;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "La631;", "vehicles", "Lig30;", "<anonymous>", "(Ljava/util/List;)Lig30;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.detailedroute.interactor.MtDetailedRouteOverlayUiStateInteractor$vehiclesFlow$1$1", f = "MtDetailedRouteOverlayUiStateInteractor.kt", l = {82}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtDetailedRouteOverlayUiStateInteractor$vehiclesFlow$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ jf30 $mode;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtDetailedRouteOverlayUiStateInteractor$vehiclesFlow$1$1(a aVar, jf30 jf30Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$mode = jf30Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MtDetailedRouteOverlayUiStateInteractor$vehiclesFlow$1$1 mtDetailedRouteOverlayUiStateInteractor$vehiclesFlow$1$1 = new MtDetailedRouteOverlayUiStateInteractor$vehiclesFlow$1$1(this.this$0, this.$mode, continuation);
        mtDetailedRouteOverlayUiStateInteractor$vehiclesFlow$1$1.L$0 = obj;
        return mtDetailedRouteOverlayUiStateInteractor$vehiclesFlow$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtDetailedRouteOverlayUiStateInteractor$vehiclesFlow$1$1) create((List) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List list = (List) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            dz00 dz00Var = this.this$0.g;
            this.L$0 = list;
            this.label = 1;
            obj = dz00Var.a.b(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return new ig30(this.$mode, list, ((k110) obj).b());
    }
}
