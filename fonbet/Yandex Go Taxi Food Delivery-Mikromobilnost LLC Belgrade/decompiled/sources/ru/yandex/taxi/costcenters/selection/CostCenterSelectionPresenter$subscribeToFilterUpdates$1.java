package ru.yandex.taxi.costcenters.selection;

import defpackage.ewe;
import defpackage.mvg;
import defpackage.mxe;
import defpackage.nxe;
import defpackage.ny61;
import defpackage.rxe;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "filterText", "Lzy11;", "<anonymous>", "(Ljava/lang/String;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.costcenters.selection.CostCenterSelectionPresenter$subscribeToFilterUpdates$1", f = "CostCenterSelectionPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class CostCenterSelectionPresenter$subscribeToFilterUpdates$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CostCenterSelectionPresenter$subscribeToFilterUpdates$1(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CostCenterSelectionPresenter$subscribeToFilterUpdates$1 costCenterSelectionPresenter$subscribeToFilterUpdates$1 = new CostCenterSelectionPresenter$subscribeToFilterUpdates$1(this.this$0, continuation);
        costCenterSelectionPresenter$subscribeToFilterUpdates$1.L$0 = obj;
        return costCenterSelectionPresenter$subscribeToFilterUpdates$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        CostCenterSelectionPresenter$subscribeToFilterUpdates$1 costCenterSelectionPresenter$subscribeToFilterUpdates$1 = (CostCenterSelectionPresenter$subscribeToFilterUpdates$1) create((String) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        costCenterSelectionPresenter$subscribeToFilterUpdates$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str = (String) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        ((nxe) this.this$0.Dg()).showProgress();
        b bVar = this.this$0;
        rxe rxeVar = bVar.B;
        rxeVar.c = str;
        if (str == null) {
            str = "";
        }
        rxeVar.d = new mxe(str);
        ((ewe) bVar.Dg()).enableDoneButton(bVar.Mg());
        return zy11.a;
    }
}
