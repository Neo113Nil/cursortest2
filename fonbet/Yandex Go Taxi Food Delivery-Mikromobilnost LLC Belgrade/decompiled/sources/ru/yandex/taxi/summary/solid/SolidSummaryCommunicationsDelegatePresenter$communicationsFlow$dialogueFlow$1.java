package ru.yandex.taxi.summary.solid;

import defpackage.gsc;
import defpackage.mvg;
import defpackage.nmv0;
import defpackage.nnv0;
import defpackage.ny61;
import defpackage.wls;
import defpackage.xfj;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.summary.promotions.analytics.SummaryPromotionsAnalytics$SummaryState;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lgsc;", "Lnnv0;", "promotionList", "Lxfj;", "<anonymous>", "(Lgsc;)Lgsc;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.summary.solid.SolidSummaryCommunicationsDelegatePresenter$communicationsFlow$dialogueFlow$1", f = "SolidSummaryCommunicationsDelegatePresenter.kt", l = {HProv.PP_DELETE_SAVED_PASSWD}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SolidSummaryCommunicationsDelegatePresenter$communicationsFlow$dialogueFlow$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ p this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SolidSummaryCommunicationsDelegatePresenter$communicationsFlow$dialogueFlow$1(Continuation continuation, p pVar) {
        super(2, continuation);
        this.this$0 = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SolidSummaryCommunicationsDelegatePresenter$communicationsFlow$dialogueFlow$1 solidSummaryCommunicationsDelegatePresenter$communicationsFlow$dialogueFlow$1 = new SolidSummaryCommunicationsDelegatePresenter$communicationsFlow$dialogueFlow$1(continuation, this.this$0);
        solidSummaryCommunicationsDelegatePresenter$communicationsFlow$dialogueFlow$1.L$0 = obj;
        return solidSummaryCommunicationsDelegatePresenter$communicationsFlow$dialogueFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SolidSummaryCommunicationsDelegatePresenter$communicationsFlow$dialogueFlow$1) create((gsc) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        gsc gscVar = (gsc) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            nnv0 nnv0Var = (nnv0) gscVar.b;
            nmv0 nmv0Var = nnv0Var.b;
            if (nmv0Var == null) {
                nmv0Var = nnv0Var.a;
            }
            ru.yandex.taxi.summary.promotions.interactor.a aVar = this.this$0.b;
            SummaryPromotionsAnalytics$SummaryState summaryPromotionsAnalytics$SummaryState = SummaryPromotionsAnalytics$SummaryState.COLLAPSED;
            this.L$0 = gscVar;
            this.L$1 = null;
            this.label = 1;
            obj = aVar.a(nmv0Var, summaryPromotionsAnalytics$SummaryState, this);
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
        return new gsc(gscVar.a, (xfj) obj);
    }
}
