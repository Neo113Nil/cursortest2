package ru.yandex.taxi.summary.requirements.list.interactors;

import defpackage.cfj0;
import defpackage.lmw0;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.nqi0;
import defpackage.ny61;
import defpackage.rol0;
import defpackage.sjh;
import defpackage.tpr;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.vng;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.summary.requirements.list.interactors.RequirementCommunicationsInteractor$preloadRequiredCommunications$2", f = "RequirementCommunicationsInteractor.kt", l = {34}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class RequirementCommunicationsInteractor$preloadRequiredCommunications$2 extends SuspendLambda implements wls {
    final /* synthetic */ List<lmw0> $requirements;
    int label;
    final /* synthetic */ v this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RequirementCommunicationsInteractor$preloadRequiredCommunications$2(v vVar, List list, Continuation continuation) {
        super(2, continuation);
        this.this$0 = vVar;
        this.$requirements = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RequirementCommunicationsInteractor$preloadRequiredCommunications$2(this.this$0, this.$requirements, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RequirementCommunicationsInteractor$preloadRequiredCommunications$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tpr F;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            v vVar = this.this$0;
            List<lmw0> list = this.$requirements;
            tt2 tt2Var = vVar.d;
            if (list != null) {
                q qVar = new q(new rol0(new RequirementCommunicationsInteractor$notLoadedBannerIdsFlow$1(vVar, list, null)));
                tt2Var.getClass();
                sjh sjhVar = uyj.a;
                F = kotlinx.coroutines.flow.e.F(qVar, mdh.b);
            } else {
                s sVar = new s(kotlinx.coroutines.flow.e.t(new u(vng.l(vVar.c.d(), new nqi0(10), vng.c), vVar)));
                tt2Var.getClass();
                sjh sjhVar2 = uyj.a;
                F = kotlinx.coroutines.flow.e.F(sVar, mdh.b);
            }
            cfj0 cfj0Var = new cfj0(0, this.this$0);
            this.label = 1;
            if (F.collect(cfj0Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
