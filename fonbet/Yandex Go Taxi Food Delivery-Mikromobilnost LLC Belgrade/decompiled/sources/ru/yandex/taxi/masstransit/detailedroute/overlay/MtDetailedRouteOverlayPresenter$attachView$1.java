package ru.yandex.taxi.masstransit.detailedroute.overlay;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.pi00;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.o;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.detailedroute.overlay.MtDetailedRouteOverlayPresenter$attachView$1", f = "MtDetailedRouteOverlayPresenter.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtDetailedRouteOverlayPresenter$attachView$1 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtDetailedRouteOverlayPresenter$attachView$1(Continuation continuation, d dVar) {
        super(2, continuation);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MtDetailedRouteOverlayPresenter$attachView$1(continuation, this.this$0);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtDetailedRouteOverlayPresenter$attachView$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            d dVar = this.this$0;
            o oVar = new o(dVar.A.b, new MtDetailedRouteOverlayPresenter$attachView$1$invokeSuspend$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null));
            pi00 pi00Var = new pi00(13, dVar);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 1;
            if (oVar.collect(pi00Var, this) == coroutineSingletons) {
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
