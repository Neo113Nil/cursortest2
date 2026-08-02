package ru.yandex.taxi.preorder.summary.solid.interactors;

import com.yandex.go.taxi.summary.models.ForceTariffSwitchForIntercityOrdersExperiment;
import defpackage.cdj0;
import defpackage.cjj0;
import defpackage.d2s;
import defpackage.eja1;
import defpackage.f2s;
import defpackage.g2s;
import defpackage.ik31;
import defpackage.jl40;
import defpackage.mi31;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.yw01;
import defpackage.zls;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lik31;", "verticalsSnapshot", "Lcom/yandex/go/taxi/summary/models/ForceTariffSwitchForIntercityOrdersExperiment;", "exp", "Lg2s;", "<anonymous>", "(Lik31;Lcom/yandex/go/taxi/summary/models/ForceTariffSwitchForIntercityOrdersExperiment;)Lg2s;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.preorder.summary.solid.interactors.ForceTariffSwitchOrderInteractor$awaitTariffSwitchInfo$3", f = "ForceTariffSwitchOrderInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ForceTariffSwitchOrderInteractor$awaitTariffSwitchInfo$3 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ y this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ForceTariffSwitchOrderInteractor$awaitTariffSwitchInfo$3(y yVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = yVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ForceTariffSwitchOrderInteractor$awaitTariffSwitchInfo$3 forceTariffSwitchOrderInteractor$awaitTariffSwitchInfo$3 = new ForceTariffSwitchOrderInteractor$awaitTariffSwitchInfo$3(this.this$0, (Continuation) obj3);
        forceTariffSwitchOrderInteractor$awaitTariffSwitchInfo$3.L$0 = (ik31) obj;
        forceTariffSwitchOrderInteractor$awaitTariffSwitchInfo$3.L$1 = (ForceTariffSwitchForIntercityOrdersExperiment) obj2;
        return forceTariffSwitchOrderInteractor$awaitTariffSwitchInfo$3.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        mi31 mi31Var;
        Object obj2;
        ik31 ik31Var = (ik31) this.L$0;
        ForceTariffSwitchForIntercityOrdersExperiment forceTariffSwitchForIntercityOrdersExperiment = (ForceTariffSwitchForIntercityOrdersExperiment) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        y yVar = this.this$0;
        yVar.getClass();
        if (forceTariffSwitchForIntercityOrdersExperiment.b && !yVar.d.a.a) {
            List list = forceTariffSwitchForIntercityOrdersExperiment.h;
            String str = ik31Var.b.f;
            yw01 d = eja1.d("", ik31Var.a.a);
            Iterator it = list.iterator();
            loop0: while (true) {
                if (!it.hasNext()) {
                    mi31Var = null;
                    break;
                }
                ForceTariffSwitchForIntercityOrdersExperiment.TariffRule tariffRule = (ForceTariffSwitchForIntercityOrdersExperiment.TariffRule) it.next();
                if (tariffRule.a.contains(str)) {
                    for (String str2 : tariffRule.b) {
                        Iterator it2 = d.a.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = d.b.invoke(it2.next());
                            if (jl40.l(((mi31) obj2).f, str2)) {
                                break;
                            }
                        }
                        mi31Var = (mi31) obj2;
                        if (mi31Var != null) {
                            break loop0;
                        }
                    }
                }
            }
            if (mi31Var != null) {
                pex0 pex0Var = mi31Var.a;
                cjj0 cjj0Var = yVar.c;
                boolean z = true;
                boolean z2 = forceTariffSwitchForIntercityOrdersExperiment.c || cjj0Var.b(cjj0Var.c(pex0Var, mi31Var.b, yVar.b.a.x, yVar.a.b(), cdj0.a), true) == 0;
                boolean z3 = forceTariffSwitchForIntercityOrdersExperiment.d || ru.yandex.taxi.tariffs.model.b.j(pex0Var, yVar.b.a.h());
                if (!forceTariffSwitchForIntercityOrdersExperiment.e && yVar.b.a.G.b.isEmpty()) {
                    z = false;
                }
                if (z2 && z3 && z) {
                    f2s f2sVar = (f2s) forceTariffSwitchForIntercityOrdersExperiment.i.get(mi31Var.a.b);
                    if (f2sVar == null) {
                        f2sVar = forceTariffSwitchForIntercityOrdersExperiment.g ? d2s.INSTANCE : null;
                    }
                    return new g2s(mi31Var.a, ik31Var.b, f2sVar);
                }
            }
        }
        return null;
    }
}
