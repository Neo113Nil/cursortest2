package ru.yandex.taxi.summary.solid;

import defpackage.an8;
import defpackage.eci0;
import defpackage.gci0;
import defpackage.hbp0;
import defpackage.jqr;
import defpackage.mrj;
import defpackage.mth;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qls0;
import defpackage.qqo;
import defpackage.tpr;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.wsr0;
import defpackage.xsr0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.MSException;
import ru.yandex.taxi.summary.solid.interactor.PromotionInfoInteractor$tooltipFlow$$inlined$flatMapLatest$1;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.summary.solid.SolidSummaryCommunicationsDelegate$attach$1", f = "SolidSummaryCommunicationsDelegate.kt", l = {MSException.ERROR_BUSY}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SolidSummaryCommunicationsDelegate$attach$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SolidSummaryCommunicationsDelegate$attach$1(d dVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SolidSummaryCommunicationsDelegate$attach$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SolidSummaryCommunicationsDelegate$attach$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            p pVar = this.this$0.a;
            f fVar = new f(kotlinx.coroutines.flow.e.s(((com.yandex.go.taxi.tariffs.internal.repository.k) pVar.j).j.b(), new qls0(8)));
            hbp0 hbp0Var = pVar.s;
            tse c = hbp0Var.c();
            wsr0 wsr0Var = xsr0.a;
            gci0 R = kotlinx.coroutines.flow.e.R(fVar, c, wsr0.a(wsr0Var, 3), null);
            eci0 O = kotlinx.coroutines.flow.e.O(kotlinx.coroutines.flow.e.X(new mth(R, 6), new SolidSummaryCommunicationsDelegatePresenter$communicationsFlow$$inlined$flatMapLatest$1(null, pVar)), hbp0Var.c(), wsr0.a(wsr0Var, 3), 1);
            eci0 O2 = kotlinx.coroutines.flow.e.O(kotlinx.coroutines.flow.e.X(new mth(R, 6), new SolidSummaryCommunicationsDelegatePresenter$communicationsFlow$$inlined$flatMapLatest$2(null, pVar)), hbp0Var.c(), wsr0.a(wsr0Var, 3), 1);
            kotlinx.coroutines.flow.internal.g I = kotlinx.coroutines.flow.e.I(O2, new SolidSummaryCommunicationsDelegatePresenter$communicationsFlow$dialogueFlow$1(null, pVar));
            mrj mrjVar = pVar.g;
            tpr r = mrjVar.r(new mth(R, 6), new SolidSummaryCommunicationsDelegatePresenter$communicationsFlow$bottomNotificationFlow$1(1, pVar, p.class, "currentTariffDescriptionFlow", "currentTariffDescriptionFlow(Lru/yandex/taxi/tariffs/model/BaseTariffInfo;)Lkotlinx/coroutines/flow/Flow;", 0), O2);
            SolidSummaryCommunicationsDelegatePresenter$communicationsFlow$tooltipFlow$1 solidSummaryCommunicationsDelegatePresenter$communicationsFlow$tooltipFlow$1 = new SolidSummaryCommunicationsDelegatePresenter$communicationsFlow$tooltipFlow$1(1, pVar, p.class, "currentTariffDescriptionFlow", "currentTariffDescriptionFlow(Lru/yandex/taxi/tariffs/model/BaseTariffInfo;)Lkotlinx/coroutines/flow/Flow;", 0);
            ru.yandex.taxi.summary.solid.interactor.p pVar2 = (ru.yandex.taxi.summary.solid.interactor.p) mrjVar.c;
            pVar2.getClass();
            tpr t = kotlinx.coroutines.flow.e.t(new mth(new ru.yandex.taxi.summary.solid.interactor.c(kotlinx.coroutines.flow.e.X(O2, new PromotionInfoInteractor$tooltipFlow$$inlined$flatMapLatest$1(null, pVar2, solidSummaryCommunicationsDelegatePresenter$communicationsFlow$tooltipFlow$1))), 6));
            kotlinx.coroutines.flow.internal.g X = kotlinx.coroutines.flow.e.X(new mth(R, 6), new SolidSummaryCommunicationsDelegatePresenter$communicationsFlow$$inlined$flatMapLatest$3(null, pVar));
            an8 an8Var = pVar.i;
            jqr jqrVar = new jqr(kotlinx.coroutines.flow.e.s(new jqr(new mth(new k(new tpr[]{kotlinx.coroutines.flow.e.t(new ru.yandex.taxi.summary.solid.interactor.g(((qqo) an8Var.x).a(), an8Var)), I, O, r, t, X, pVar.e.a()}, R, pVar), 6), new SolidSummaryCommunicationsDelegatePresenter$communicationsFlowInternal$2(null, pVar), 3), new qls0(7)), new SolidSummaryCommunicationsDelegatePresenter$communicationsFlowInternal$4(null, pVar), 3);
            pVar.k.getClass();
            tpr F = kotlinx.coroutines.flow.e.F(jqrVar, uyj.a);
            c cVar = new c(this.this$0);
            this.label = 1;
            if (F.collect(cVar, this) == coroutineSingletons) {
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
