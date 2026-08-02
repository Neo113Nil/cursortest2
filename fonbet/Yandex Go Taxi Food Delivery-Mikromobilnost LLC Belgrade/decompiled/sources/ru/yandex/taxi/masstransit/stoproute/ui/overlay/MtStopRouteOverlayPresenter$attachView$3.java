package ru.yandex.taxi.masstransit.stoproute.ui.overlay;

import defpackage.b340;
import defpackage.d240;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.stoproute.ui.overlay.MtStopRouteOverlayPresenter$attachView$3", f = "MtStopRouteOverlayPresenter.kt", l = {48}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtStopRouteOverlayPresenter$attachView$3 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ b340 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtStopRouteOverlayPresenter$attachView$3(b340 b340Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = b340Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MtStopRouteOverlayPresenter$attachView$3(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtStopRouteOverlayPresenter$attachView$3) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            b340 b340Var = this.this$0;
            ru.yandex.taxi.masstransit.utils.a aVar = b340Var.B;
            d240 d240Var = new d240(2, b340Var);
            this.label = 1;
            if (aVar.a(d240Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
