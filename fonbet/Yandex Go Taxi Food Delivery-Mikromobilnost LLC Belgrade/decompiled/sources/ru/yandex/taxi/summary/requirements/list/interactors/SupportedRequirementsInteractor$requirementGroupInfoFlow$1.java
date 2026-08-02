package ru.yandex.taxi.summary.requirements.list.interactors;

import defpackage.mi31;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vfx0;
import defpackage.ygj0;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lmi31;", "verticalTariff", "Lzy11;", "<unused var>", "Lf6v;", "Lhmx0;", "Lygj0;", "<anonymous>", "(Lru/yandex/taxi/tariffs/model/verticals/VerticalTariff;V)Lru/yandex/taxi/requirements/utils/Identifiable;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.summary.requirements.list.interactors.SupportedRequirementsInteractor$requirementGroupInfoFlow$1", f = "SupportedRequirementsInteractor.kt", l = {64}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SupportedRequirementsInteractor$requirementGroupInfoFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ k0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportedRequirementsInteractor$requirementGroupInfoFlow$1(k0 k0Var, Continuation continuation) {
        super(3, continuation);
        this.this$0 = k0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        SupportedRequirementsInteractor$requirementGroupInfoFlow$1 supportedRequirementsInteractor$requirementGroupInfoFlow$1 = new SupportedRequirementsInteractor$requirementGroupInfoFlow$1(this.this$0, (Continuation) obj3);
        supportedRequirementsInteractor$requirementGroupInfoFlow$1.L$0 = (mi31) obj;
        return supportedRequirementsInteractor$requirementGroupInfoFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        mi31 mi31Var = (mi31) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ArrayList b = this.this$0.j.b(mi31Var);
            j jVar = this.this$0.m;
            this.L$0 = mi31Var;
            this.L$1 = null;
            this.label = 1;
            obj = jVar.a(b, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        ygj0 ygj0Var = new ygj0(mi31Var.b().b, (List) obj);
        this.this$0.f.getClass();
        return ru.yandex.taxi.requirements.utils.c.b(ygj0Var, vfx0.b(mi31Var));
    }
}
