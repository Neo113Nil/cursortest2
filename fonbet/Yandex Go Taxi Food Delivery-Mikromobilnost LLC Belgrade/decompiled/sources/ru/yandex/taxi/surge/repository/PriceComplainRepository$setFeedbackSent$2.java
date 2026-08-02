package ru.yandex.taxi.surge.repository;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.wt60;
import defpackage.zy11;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.surge.repository.PriceComplainRepository$setFeedbackSent$2", f = "PriceComplainRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class PriceComplainRepository$setFeedbackSent$2 extends SuspendLambda implements wls {
    final /* synthetic */ wt60 $offerWithTariffInfo;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PriceComplainRepository$setFeedbackSent$2(wt60 wt60Var, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$offerWithTariffInfo = wt60Var;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PriceComplainRepository$setFeedbackSent$2(this.$offerWithTariffInfo, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PriceComplainRepository$setFeedbackSent$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        Set M0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        wt60 wt60Var = this.$offerWithTariffInfo;
        if (wt60Var == null) {
            return null;
        }
        r0 r0Var = this.this$0.h;
        do {
            value = r0Var.getValue();
            M0 = kotlin.collections.a.M0((Set) value);
            M0.add(wt60Var);
        } while (!r0Var.k(value, M0));
        return zy11.a;
    }
}
