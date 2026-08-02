package ru.yandex.taxi.costcenters.selection;

import defpackage.jst;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.nxe;
import defpackage.ny61;
import defpackage.rxe;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.costcenters.selection.CostCenterSelectionPresenter$loadCostCenterData$1", f = "CostCenterSelectionPresenter.kt", l = {62}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class CostCenterSelectionPresenter$loadCostCenterData$1 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CostCenterSelectionPresenter$loadCostCenterData$1(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CostCenterSelectionPresenter$loadCostCenterData$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CostCenterSelectionPresenter$loadCostCenterData$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        b bVar;
        b bVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                b bVar3 = this.this$0;
                try {
                    ((nxe) bVar3.Dg()).showProgress();
                    bVar3.z.getClass();
                    sjh sjhVar = uyj.a;
                    mdh mdhVar = mdh.b;
                    CostCenterSelectionPresenter$loadCostCenterData$1$1$costCenterViewModel$1 costCenterSelectionPresenter$loadCostCenterData$1$1$costCenterViewModel$1 = new CostCenterSelectionPresenter$loadCostCenterData$1$1$costCenterViewModel$1(bVar3, null);
                    this.L$0 = bVar3;
                    this.L$1 = bVar3;
                    this.label = 1;
                    Object k0 = tje.k0(mdhVar, costCenterSelectionPresenter$loadCostCenterData$1$1$costCenterViewModel$1, this);
                    if (k0 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    bVar = bVar3;
                    obj = k0;
                    bVar2 = bVar;
                } catch (Throwable th) {
                    th = th;
                    bVar = bVar3;
                    bVar.getClass();
                    jst.e.k(th, "CostCenter. Something wrong on load costs centers info");
                    ((nxe) bVar.Dg()).hideProgress();
                    return zy11.a;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                bVar = (b) this.L$1;
                bVar2 = (b) this.L$0;
                try {
                    kotlin.b.b(obj);
                } catch (Throwable th2) {
                    th = th2;
                    bVar.getClass();
                    jst.e.k(th, "CostCenter. Something wrong on load costs centers info");
                    ((nxe) bVar.Dg()).hideProgress();
                    return zy11.a;
                }
            }
            b.Qg(bVar2, (rxe) obj);
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
