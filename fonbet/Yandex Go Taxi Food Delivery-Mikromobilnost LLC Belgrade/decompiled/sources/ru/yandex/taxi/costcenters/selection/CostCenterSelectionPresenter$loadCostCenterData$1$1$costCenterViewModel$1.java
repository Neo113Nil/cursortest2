package ru.yandex.taxi.costcenters.selection;

import defpackage.jl40;
import defpackage.mvg;
import defpackage.mxe;
import defpackage.ny61;
import defpackage.rxe;
import defpackage.tcc;
import defpackage.tse;
import defpackage.twe;
import defpackage.uwe;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.costcenters.api.CostCenterField;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lrxe;", "<anonymous>", "(Ltse;)Lrxe;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.costcenters.selection.CostCenterSelectionPresenter$loadCostCenterData$1$1$costCenterViewModel$1", f = "CostCenterSelectionPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class CostCenterSelectionPresenter$loadCostCenterData$1$1$costCenterViewModel$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CostCenterSelectionPresenter$loadCostCenterData$1$1$costCenterViewModel$1(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CostCenterSelectionPresenter$loadCostCenterData$1$1$costCenterViewModel$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CostCenterSelectionPresenter$loadCostCenterData$1$1$costCenterViewModel$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        mxe mxeVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        uwe uweVar = this.this$0.x;
        CostCenterField costCenterField = uweVar.c;
        List list = costCenterField.f;
        CostCenterField.InputFormat inputFormat = costCenterField.e;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((CostCenterField.a) obj2).a.length() > 0) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new mxe(((CostCenterField.a) it.next()).a));
        }
        List x0 = kotlin.collections.a.x0(arrayList2, new twe());
        String b = uweVar.b.b(uweVar.c.a);
        Iterator it2 = x0.iterator();
        while (true) {
            if (!it2.hasNext()) {
                mxeVar = null;
                break;
            }
            mxeVar = (mxe) it2.next();
            if (jl40.l(mxeVar.a, b)) {
                break;
            }
        }
        if (mxeVar != null) {
            b = null;
        }
        rxe rxeVar = new rxe(x0, mxeVar, (mxeVar == null && inputFormat == CostCenterField.InputFormat.SELECT) ? null : b);
        if (rxeVar.b == null && inputFormat == CostCenterField.InputFormat.MIXED) {
            rxeVar.b = rxeVar.d;
        }
        return rxeVar;
    }
}
