package ru.yandex.taxi.summary.requirements.list.interactors;

import defpackage.f6v;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lf6v;", "Lufx0;", "Lbnx0;", "it", "Lzy11;", "<anonymous>", "(Lf6v;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.summary.requirements.list.interactors.TariffRulesStateInteractor$tariffRulesStateFlow$2", f = "TariffRulesStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class TariffRulesStateInteractor$tariffRulesStateFlow$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ l0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TariffRulesStateInteractor$tariffRulesStateFlow$2(l0 l0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = l0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TariffRulesStateInteractor$tariffRulesStateFlow$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        TariffRulesStateInteractor$tariffRulesStateFlow$2 tariffRulesStateInteractor$tariffRulesStateFlow$2 = (TariffRulesStateInteractor$tariffRulesStateFlow$2) create((f6v) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        tariffRulesStateInteractor$tariffRulesStateFlow$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        kotlinx.coroutines.flow.r0 r0Var = this.this$0.d.h.a;
        r0Var.getClass();
        r0Var.m(null, EmptySet.a);
        return zy11.a;
    }
}
