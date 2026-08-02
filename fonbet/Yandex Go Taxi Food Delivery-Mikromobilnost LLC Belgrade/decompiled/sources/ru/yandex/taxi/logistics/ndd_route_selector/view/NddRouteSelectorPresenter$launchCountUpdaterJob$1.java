package ru.yandex.taxi.logistics.ndd_route_selector.view;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.wi50;
import defpackage.wls;
import defpackage.yi50;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\u001a\u0010\u0004\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "", "", "", "selectedFilters", "Lzy11;", "<anonymous>", "(Ljava/util/List;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.logistics.ndd_route_selector.view.NddRouteSelectorPresenter$launchCountUpdaterJob$1", f = "NddRouteSelectorPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class NddRouteSelectorPresenter$launchCountUpdaterJob$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ yi50 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NddRouteSelectorPresenter$launchCountUpdaterJob$1(yi50 yi50Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = yi50Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        NddRouteSelectorPresenter$launchCountUpdaterJob$1 nddRouteSelectorPresenter$launchCountUpdaterJob$1 = new NddRouteSelectorPresenter$launchCountUpdaterJob$1(this.this$0, continuation);
        nddRouteSelectorPresenter$launchCountUpdaterJob$1.L$0 = obj;
        return nddRouteSelectorPresenter$launchCountUpdaterJob$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        NddRouteSelectorPresenter$launchCountUpdaterJob$1 nddRouteSelectorPresenter$launchCountUpdaterJob$1 = (NddRouteSelectorPresenter$launchCountUpdaterJob$1) create((List) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        nddRouteSelectorPresenter$launchCountUpdaterJob$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List list = (List) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        ((wi50) this.this$0.Dg()).setCounter(list != null ? list.size() : 0);
        return zy11.a;
    }
}
