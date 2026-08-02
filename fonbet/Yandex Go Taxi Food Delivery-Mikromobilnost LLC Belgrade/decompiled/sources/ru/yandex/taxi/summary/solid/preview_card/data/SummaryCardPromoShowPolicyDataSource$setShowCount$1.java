package ru.yandex.taxi.summary.solid.preview_card.data;

import defpackage.fev0;
import defpackage.g8e;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.summary.solid.preview_card.data.SummaryCardPromoShowPolicyDataSource$setShowCount$1", f = "SummaryCardPromoShowPolicyDataSource.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SummaryCardPromoShowPolicyDataSource$setShowCount$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $id;
    final /* synthetic */ int $showCount;
    int label;
    final /* synthetic */ fev0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SummaryCardPromoShowPolicyDataSource$setShowCount$1(fev0 fev0Var, String str, int i, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fev0Var;
        this.$id = str;
        this.$showCount = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SummaryCardPromoShowPolicyDataSource$setShowCount$1(this.this$0, this.$id, this.$showCount, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        SummaryCardPromoShowPolicyDataSource$setShowCount$1 summaryCardPromoShowPolicyDataSource$setShowCount$1 = (SummaryCardPromoShowPolicyDataSource$setShowCount$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        summaryCardPromoShowPolicyDataSource$setShowCount$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        this.this$0.c.p(this.$showCount, g8e.o("pref_show_count_", this.$id));
        return zy11.a;
    }
}
