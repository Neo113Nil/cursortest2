package ru.yandex.taxi.routeselector.presentation;

import com.yandex.go.address.models.Address;
import defpackage.ah00;
import defpackage.atd0;
import defpackage.gh00;
import defpackage.hwo0;
import defpackage.kip;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zht0;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.persuggest.api.finalsuggest.Action;
import ru.yandex.taxi.persuggest.api.finalsuggest.PositionInitAction;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;
import ru.yandex.taxi.preorder.source.domain.SourcePointRouteSelectorFinalizeInteractorImpl$requestForSourcePoint$$inlined$safeCollect$1;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.routeselector.presentation.RouteSelectorPresenter$attachView$1", f = "RouteSelectorPresenter.kt", l = {154}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class RouteSelectorPresenter$attachView$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ s this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteSelectorPresenter$attachView$1(s sVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = sVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RouteSelectorPresenter$attachView$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RouteSelectorPresenter$attachView$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        zzs b;
        Object collect;
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
        hwo0 hwo0Var = this.this$0.i0;
        this.label = 1;
        if (((Boolean) ((kip) hwo0Var.x).a.b()).booleanValue()) {
            Address g = ((com.yandex.go.route.interactor.c) hwo0Var.c).g();
            if (g == null || (b = g.B()) == null) {
                b = ((gh00) ((ah00) hwo0Var.b)).e.b();
            }
            collect = new kotlinx.coroutines.flow.o(atd0.b((atd0) hwo0Var.w, b, RoutePointType.POINT_A, "auto", PositionInitAction.MAP, Action.FINALIZE), new SourcePointRouteSelectorFinalizeInteractorImpl$requestForSourcePoint$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null)).collect(new zht0(), this);
        } else {
            collect = zy11Var;
        }
        return collect == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
