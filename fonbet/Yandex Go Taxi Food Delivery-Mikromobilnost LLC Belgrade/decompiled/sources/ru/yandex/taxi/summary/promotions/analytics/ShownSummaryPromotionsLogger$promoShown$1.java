package ru.yandex.taxi.summary.promotions.analytics;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.has0;
import defpackage.j63;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.tse;
import defpackage.u051;
import defpackage.wls;
import defpackage.z051;
import defpackage.zkv0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.summary.ui.SummaryStateTracker;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.summary.promotions.analytics.ShownSummaryPromotionsLogger$promoShown$1", f = "ShownSummaryPromotionsLogger.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ShownSummaryPromotionsLogger$promoShown$1 extends SuspendLambda implements wls {
    final /* synthetic */ zkv0 $promotion;
    final /* synthetic */ SummaryPromotionsAnalytics$SummaryState $summaryState;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShownSummaryPromotionsLogger$promoShown$1(c cVar, zkv0 zkv0Var, SummaryPromotionsAnalytics$SummaryState summaryPromotionsAnalytics$SummaryState, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$promotion = zkv0Var;
        this.$summaryState = summaryPromotionsAnalytics$SummaryState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ShownSummaryPromotionsLogger$promoShown$1(this.this$0, this.$promotion, this.$summaryState, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ShownSummaryPromotionsLogger$promoShown$1 shownSummaryPromotionsLogger$promoShown$1 = (ShownSummaryPromotionsLogger$promoShown$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        shownSummaryPromotionsLogger$promoShown$1.invokeSuspend(zy11Var);
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
        c cVar = this.this$0;
        zkv0 zkv0Var = this.$promotion;
        SummaryPromotionsAnalytics$SummaryState summaryPromotionsAnalytics$SummaryState = this.$summaryState;
        j63 j63Var = cVar.h;
        z051 z051Var = zkv0Var.f;
        has0 has0Var = z051Var instanceof u051 ? new has0(zkv0Var, summaryPromotionsAnalytics$SummaryState, Boolean.valueOf(((u051) z051Var).a.a)) : new has0(zkv0Var, summaryPromotionsAnalytics$SummaryState, null);
        j63Var.remove(has0Var);
        SummaryStateTracker.SolidSummaryState a = cVar.b.a();
        pex0 m = ((k) cVar.c).m();
        if (jl40.l(has0Var.a.g, m != null ? m.b : null)) {
            if ((has0Var.b == SummaryPromotionsAnalytics$SummaryState.EXPANDED ? SummaryStateTracker.SolidSummaryState.EXPANDED : SummaryStateTracker.SolidSummaryState.COLLAPSED) == a) {
                cVar.b(has0Var);
                return zy11.a;
            }
        }
        j63Var.add(has0Var);
        return zy11.a;
    }
}
