package ru.yandex.taxi.summary.requirements.list.interactors;

import defpackage.amc;
import defpackage.e4a0;
import defpackage.mi31;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.tcc;
import defpackage.vfx0;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lmi31;", "verticalTariff", "Le4a0;", "paymentMethod", "Lf6v;", "Lufx0;", "", "<anonymous>", "(Lmi31;Le4a0;)Lf6v;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.summary.requirements.list.interactors.CostCenterItemStateInteractor$availableFlow$1", f = "CostCenterItemStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class CostCenterItemStateInteractor$availableFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CostCenterItemStateInteractor$availableFlow$1(Continuation continuation, i iVar) {
        super(3, continuation);
        this.this$0 = iVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        CostCenterItemStateInteractor$availableFlow$1 costCenterItemStateInteractor$availableFlow$1 = new CostCenterItemStateInteractor$availableFlow$1((Continuation) obj3, this.this$0);
        costCenterItemStateInteractor$availableFlow$1.L$0 = (mi31) obj;
        costCenterItemStateInteractor$availableFlow$1.L$1 = (e4a0) obj2;
        return costCenterItemStateInteractor$availableFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        mi31 mi31Var = (mi31) this.L$0;
        e4a0 e4a0Var = (e4a0) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        i iVar = this.this$0;
        pex0 pex0Var = mi31Var.a;
        iVar.getClass();
        TariffOrderFlow tariffOrderFlow = pex0Var.u0;
        amc amcVar = iVar.c;
        Boolean valueOf = Boolean.valueOf(tcc.o(amcVar.e.b.values()).contains(tariffOrderFlow) && amcVar.e(tariffOrderFlow) && e4a0Var.a() == PaymentMethod$Type.CORP);
        this.this$0.b.getClass();
        return ru.yandex.taxi.requirements.utils.c.b(valueOf, vfx0.a(mi31Var));
    }
}
