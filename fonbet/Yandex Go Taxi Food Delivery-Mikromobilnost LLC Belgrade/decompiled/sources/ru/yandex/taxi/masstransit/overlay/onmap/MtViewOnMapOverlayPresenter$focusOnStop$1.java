package ru.yandex.taxi.masstransit.overlay.onmap;

import defpackage.bzy0;
import defpackage.gh00;
import defpackage.hj40;
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
@mvg(c = "ru.yandex.taxi.masstransit.overlay.onmap.MtViewOnMapOverlayPresenter$focusOnStop$1", f = "MtViewOnMapOverlayPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtViewOnMapOverlayPresenter$focusOnStop$1 extends SuspendLambda implements wls {
    final /* synthetic */ bzy0 $state;
    int label;
    final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtViewOnMapOverlayPresenter$focusOnStop$1(bzy0 bzy0Var, h hVar, Continuation continuation) {
        super(2, continuation);
        this.$state = bzy0Var;
        this.this$0 = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MtViewOnMapOverlayPresenter$focusOnStop$1(this.$state, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        MtViewOnMapOverlayPresenter$focusOnStop$1 mtViewOnMapOverlayPresenter$focusOnStop$1 = (MtViewOnMapOverlayPresenter$focusOnStop$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        mtViewOnMapOverlayPresenter$focusOnStop$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        hj40 a = this.$state.a();
        zy11 zy11Var = zy11.a;
        if (a == null) {
            return zy11Var;
        }
        h hVar = this.this$0;
        ((gh00) hVar.I).D(a.d, 17.0f, 400.0f, null);
        return zy11Var;
    }
}
