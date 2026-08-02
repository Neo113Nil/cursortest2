package ru.yandex.taxi.routeselector.presentation;

import defpackage.m9l0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lzy11;", "<anonymous>", "(Z)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.routeselector.presentation.RouteSelectorPresenter$attachView$14", f = "RouteSelectorPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class RouteSelectorPresenter$attachView$14 extends SuspendLambda implements wls {
    final /* synthetic */ m9l0 $mvpView;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteSelectorPresenter$attachView$14(m9l0 m9l0Var, Continuation continuation) {
        super(2, continuation);
        this.$mvpView = m9l0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RouteSelectorPresenter$attachView$14(this.$mvpView, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        RouteSelectorPresenter$attachView$14 routeSelectorPresenter$attachView$14 = (RouteSelectorPresenter$attachView$14) create(bool, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        routeSelectorPresenter$attachView$14.invokeSuspend(zy11Var);
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
        this.$mvpView.renderPickupFromPhotoTooltip(null);
        return zy11.a;
    }
}
