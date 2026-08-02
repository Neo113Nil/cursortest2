package ru.yandex.taxi.orderbutton.summary.solid.interactors;

import defpackage.g6t0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wi70;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lwi70;", "buttonModel", "", "buttonOnly", "Lg6t0;", "<anonymous>", "(Lwi70;Z)Lg6t0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.orderbutton.summary.solid.interactors.SolidSummaryButtonModelInteractor$modelFlow$2", f = "SolidSummaryButtonModelInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SolidSummaryButtonModelInteractor$modelFlow$2 extends SuspendLambda implements zls {
    final /* synthetic */ boolean $showRequirements;
    final /* synthetic */ boolean $smallSummary;
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SolidSummaryButtonModelInteractor$modelFlow$2(boolean z, boolean z2, Continuation continuation) {
        super(3, continuation);
        this.$showRequirements = z;
        this.$smallSummary = z2;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        SolidSummaryButtonModelInteractor$modelFlow$2 solidSummaryButtonModelInteractor$modelFlow$2 = new SolidSummaryButtonModelInteractor$modelFlow$2(this.$showRequirements, this.$smallSummary, (Continuation) obj3);
        solidSummaryButtonModelInteractor$modelFlow$2.L$0 = (wi70) obj;
        solidSummaryButtonModelInteractor$modelFlow$2.Z$0 = booleanValue;
        return solidSummaryButtonModelInteractor$modelFlow$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        wi70 wi70Var = (wi70) this.L$0;
        boolean z = this.Z$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return new g6t0(wi70Var, !z, !z && (this.$showRequirements || !this.$smallSummary));
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
