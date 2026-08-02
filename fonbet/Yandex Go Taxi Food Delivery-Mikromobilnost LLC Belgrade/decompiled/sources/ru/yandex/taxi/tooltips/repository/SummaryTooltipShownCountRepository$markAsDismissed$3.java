package ru.yandex.taxi.tooltips.repository;

import defpackage.cne0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pvz0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.tooltips.repository.SummaryTooltipShownCountRepository$markAsDismissed$3", f = "SummaryTooltipShownCountRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SummaryTooltipShownCountRepository$markAsDismissed$3 extends SuspendLambda implements wls {
    final /* synthetic */ String $key;
    final /* synthetic */ pvz0 $policy;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SummaryTooltipShownCountRepository$markAsDismissed$3(b bVar, String str, pvz0 pvz0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$key = str;
        this.$policy = pvz0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SummaryTooltipShownCountRepository$markAsDismissed$3(this.this$0, this.$key, this.$policy, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        SummaryTooltipShownCountRepository$markAsDismissed$3 summaryTooltipShownCountRepository$markAsDismissed$3 = (SummaryTooltipShownCountRepository$markAsDismissed$3) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        summaryTooltipShownCountRepository$markAsDismissed$3.invokeSuspend(zy11Var);
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
        b bVar = this.this$0;
        cne0 cne0Var = bVar.c;
        String str = this.$key;
        Integer num = (Integer) ((ConcurrentHashMap) bVar.e.getValue()).get(this.$key);
        cne0Var.d().putInt(str, num != null ? num.intValue() : 1).commit();
        boolean a = this.this$0.a(this.$policy);
        zy11 zy11Var = zy11.a;
        if (!a) {
            this.this$0.f.g(zy11Var);
        }
        return zy11Var;
    }
}
