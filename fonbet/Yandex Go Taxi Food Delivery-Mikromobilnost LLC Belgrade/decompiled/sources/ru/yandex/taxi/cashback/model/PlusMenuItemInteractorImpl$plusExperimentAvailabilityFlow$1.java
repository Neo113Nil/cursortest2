package ru.yandex.taxi.cashback.model;

import defpackage.b59;
import defpackage.bms;
import defpackage.h3b0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lb59;", "cashbackVisibilityModel", "", "isPlusSdkExperimentEnabled", "zoneAvailability", "<anonymous>", "(Lb59;ZZ)Z"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.cashback.model.PlusMenuItemInteractorImpl$plusExperimentAvailabilityFlow$1", f = "PlusMenuItemInteractorImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class PlusMenuItemInteractorImpl$plusExperimentAvailabilityFlow$1 extends SuspendLambda implements bms {
    final /* synthetic */ h3b0 $viewModel;
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    /* synthetic */ boolean Z$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlusMenuItemInteractorImpl$plusExperimentAvailabilityFlow$1(h3b0 h3b0Var, Continuation continuation) {
        super(4, continuation);
        this.$viewModel = h3b0Var;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        boolean booleanValue2 = ((Boolean) obj3).booleanValue();
        PlusMenuItemInteractorImpl$plusExperimentAvailabilityFlow$1 plusMenuItemInteractorImpl$plusExperimentAvailabilityFlow$1 = new PlusMenuItemInteractorImpl$plusExperimentAvailabilityFlow$1(this.$viewModel, (Continuation) obj4);
        plusMenuItemInteractorImpl$plusExperimentAvailabilityFlow$1.L$0 = (b59) obj;
        plusMenuItemInteractorImpl$plusExperimentAvailabilityFlow$1.Z$0 = booleanValue;
        plusMenuItemInteractorImpl$plusExperimentAvailabilityFlow$1.Z$1 = booleanValue2;
        return plusMenuItemInteractorImpl$plusExperimentAvailabilityFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        b59 b59Var = (b59) this.L$0;
        boolean z = this.Z$0;
        boolean z2 = this.Z$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return Boolean.valueOf(((b59Var.a && this.$viewModel.a != null) || z) && z2);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
