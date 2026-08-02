package ru.yandex.taxi.scooters.presentation.finish_info;

import defpackage.hmn0;
import defpackage.imn0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tse;
import defpackage.ukn0;
import defpackage.wls;
import defpackage.wmn0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.scooters.experiments.FinishCard;
import ru.yandex.taxi.scooters.experiments.g0;
import ru.yandex.taxi.scooters.presentation.feedback.data.model.FeedbackSettingsParams$Screen;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.presentation.finish_info.ScootersFinishInfoPresenter$attachView$2", f = "ScootersFinishInfoPresenter.kt", l = {HProv.PP_BIO_STATISTICA_LEN}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ScootersFinishInfoPresenter$attachView$2 extends SuspendLambda implements wls {
    final /* synthetic */ wmn0 $mvpView;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersFinishInfoPresenter$attachView$2(d dVar, wmn0 wmn0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$mvpView = wmn0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersFinishInfoPresenter$attachView$2(this.this$0, this.$mvpView, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersFinishInfoPresenter$attachView$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FinishCard.Statistics statistics;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            imn0 imn0Var = this.this$0.L;
            if (imn0Var.f == FeedbackSettingsParams$Screen.FINISH_CARD) {
                hmn0 hmn0Var = imn0Var.i;
                String str = hmn0Var != null ? hmn0Var.c : null;
                if (str != null && str.length() != 0) {
                    ukn0 ukn0Var = this.this$0.z;
                    this.label = 1;
                    obj = ukn0Var.a.b(this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            }
            return zy11.a;
        }
        if (i != 1) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        FinishCard finishCard = ((g0) obj).h;
        if (finishCard != null && (statistics = finishCard.c) != null && statistics.a) {
            d dVar = this.this$0;
            if (dVar.M == null) {
                tje.N(this.this$0.Jg(), null, null, new ScootersFinishInfoPresenter$attachView$2$invokeSuspend$$inlined$collectIn$1(dVar.H.a(dVar.L), null, this.$mvpView), 3);
            }
        }
        return zy11.a;
    }
}
