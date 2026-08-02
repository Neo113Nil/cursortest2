package ru.yandex.taxi.summary.requirements.list.interactors;

import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import defpackage.dp01;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.up01;
import defpackage.vp01;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lpex0;", PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, "Lzy11;", "<anonymous>", "(Lpex0;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.summary.requirements.list.interactors.TransferRequirementStateInteractor$subscribeSelectedTariffChanged$3", f = "TransferRequirementStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class TransferRequirementStateInteractor$subscribeSelectedTariffChanged$3 extends SuspendLambda implements wls {
    final /* synthetic */ String $optionName;
    final /* synthetic */ String $requirementName;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ u0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferRequirementStateInteractor$subscribeSelectedTariffChanged$3(u0 u0Var, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = u0Var;
        this.$requirementName = str;
        this.$optionName = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TransferRequirementStateInteractor$subscribeSelectedTariffChanged$3 transferRequirementStateInteractor$subscribeSelectedTariffChanged$3 = new TransferRequirementStateInteractor$subscribeSelectedTariffChanged$3(this.this$0, this.$requirementName, this.$optionName, continuation);
        transferRequirementStateInteractor$subscribeSelectedTariffChanged$3.L$0 = obj;
        return transferRequirementStateInteractor$subscribeSelectedTariffChanged$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        TransferRequirementStateInteractor$subscribeSelectedTariffChanged$3 transferRequirementStateInteractor$subscribeSelectedTariffChanged$3 = (TransferRequirementStateInteractor$subscribeSelectedTariffChanged$3) create((pex0) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        transferRequirementStateInteractor$subscribeSelectedTariffChanged$3.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        pex0 pex0Var = (pex0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        boolean c = u0.c(this.this$0, pex0Var.f(), this.$requirementName, this.$optionName);
        u0 u0Var = this.this$0;
        if (c) {
            vp01 b = ((dp01) u0Var.d()).b();
            b.a.a.T = ((up01) b.c.getValue()).a;
        } else {
            ((dp01) u0Var.d()).b().a.a.T = null;
        }
        return zy11.a;
    }
}
