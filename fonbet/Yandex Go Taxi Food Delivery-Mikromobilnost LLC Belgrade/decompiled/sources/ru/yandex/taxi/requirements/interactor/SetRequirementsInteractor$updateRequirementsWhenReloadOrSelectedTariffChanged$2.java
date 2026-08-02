package ru.yandex.taxi.requirements.interactor;

import defpackage.fnx0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oqx0;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lfnx0;", "selection", "", "reloadTime", "Loqx0;", "<anonymous>", "(Lfnx0;J)Loqx0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.requirements.interactor.SetRequirementsInteractor$updateRequirementsWhenReloadOrSelectedTariffChanged$2", f = "SetRequirementsInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class SetRequirementsInteractor$updateRequirementsWhenReloadOrSelectedTariffChanged$2 extends SuspendLambda implements zls {
    /* synthetic */ long J$0;
    /* synthetic */ Object L$0;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long longValue = ((Number) obj2).longValue();
        SetRequirementsInteractor$updateRequirementsWhenReloadOrSelectedTariffChanged$2 setRequirementsInteractor$updateRequirementsWhenReloadOrSelectedTariffChanged$2 = new SetRequirementsInteractor$updateRequirementsWhenReloadOrSelectedTariffChanged$2(3, (Continuation) obj3);
        setRequirementsInteractor$updateRequirementsWhenReloadOrSelectedTariffChanged$2.L$0 = (fnx0) obj;
        setRequirementsInteractor$updateRequirementsWhenReloadOrSelectedTariffChanged$2.J$0 = longValue;
        return setRequirementsInteractor$updateRequirementsWhenReloadOrSelectedTariffChanged$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        fnx0 fnx0Var = (fnx0) this.L$0;
        long j = this.J$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return new oqx0(fnx0Var, j);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
