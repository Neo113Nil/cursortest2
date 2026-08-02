package ru.yandex.taxi.summary.solid.preview_card.interactor;

import com.yandex.go.zone.dto.objects.SummaryCardPromo;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.modal.popup.ui.PopupDialogModalView;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.summary.solid.preview_card.interactor.SummaryCardPromoInteractor$onSelectedTariffChanged$1$1$1", f = "SummaryCardPromoInteractor.kt", l = {33}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SummaryCardPromoInteractor$onSelectedTariffChanged$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ SummaryCardPromo $summaryCardPromo;
    final /* synthetic */ String $tariffName;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SummaryCardPromoInteractor$onSelectedTariffChanged$1$1$1(a aVar, String str, SummaryCardPromo summaryCardPromo, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$tariffName = str;
        this.$summaryCardPromo = summaryCardPromo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SummaryCardPromoInteractor$onSelectedTariffChanged$1$1$1(this.this$0, this.$tariffName, this.$summaryCardPromo, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SummaryCardPromoInteractor$onSelectedTariffChanged$1$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ru.yandex.taxi.summary.solid.preview_card.di.a aVar = this.this$0.d;
            String str = this.$tariffName;
            SummaryCardPromo summaryCardPromo = this.$summaryCardPromo;
            this.label = 1;
            obj = aVar.a(str, summaryCardPromo, this);
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
        this.this$0.a.a().s((PopupDialogModalView) obj, true);
        return zy11.a;
    }
}
