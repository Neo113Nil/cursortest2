package ru.yandex.taxi.summary.solid.preview_card.data;

import defpackage.fev0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qv10;
import defpackage.r8s0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lr8s0;", "<anonymous>", "(Ltse;)Lr8s0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.summary.solid.preview_card.data.SummaryCardPromoShowPolicyDataSource$getShowPolicy$2", f = "SummaryCardPromoShowPolicyDataSource.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SummaryCardPromoShowPolicyDataSource$getShowPolicy$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $id;
    int label;
    final /* synthetic */ fev0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SummaryCardPromoShowPolicyDataSource$getShowPolicy$2(fev0 fev0Var, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fev0Var;
        this.$id = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SummaryCardPromoShowPolicyDataSource$getShowPolicy$2(this.this$0, this.$id, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SummaryCardPromoShowPolicyDataSource$getShowPolicy$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        return new r8s0(this.$id, qv10.d("pref_show_count_", this.$id, this.this$0.c, 0), qv10.d("pref_max_show_count_", this.$id, this.this$0.c, 0));
    }
}
