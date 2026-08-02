package ru.yandex.taxi.masstransit.overlay.onmap;

import defpackage.fk40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sk40;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lsk40;", "it", "Lzy11;", "<anonymous>", "(Lsk40;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.overlay.onmap.MtViewOnMapOverlayPresenter$attachView$3", f = "MtViewOnMapOverlayPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtViewOnMapOverlayPresenter$attachView$3 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtViewOnMapOverlayPresenter$attachView$3(Continuation continuation, h hVar) {
        super(2, continuation);
        this.this$0 = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MtViewOnMapOverlayPresenter$attachView$3 mtViewOnMapOverlayPresenter$attachView$3 = new MtViewOnMapOverlayPresenter$attachView$3(continuation, this.this$0);
        mtViewOnMapOverlayPresenter$attachView$3.L$0 = obj;
        return mtViewOnMapOverlayPresenter$attachView$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        MtViewOnMapOverlayPresenter$attachView$3 mtViewOnMapOverlayPresenter$attachView$3 = (MtViewOnMapOverlayPresenter$attachView$3) create((sk40) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        mtViewOnMapOverlayPresenter$attachView$3.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        sk40 sk40Var = (sk40) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        r0 r0Var = this.this$0.N;
        fk40 fk40Var = sk40Var.b;
        r0Var.getClass();
        r0Var.m(null, fk40Var);
        return zy11.a;
    }
}
