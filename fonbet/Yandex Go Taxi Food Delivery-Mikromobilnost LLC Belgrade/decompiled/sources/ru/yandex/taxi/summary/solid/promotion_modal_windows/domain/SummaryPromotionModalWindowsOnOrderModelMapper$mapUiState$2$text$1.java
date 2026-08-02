package ru.yandex.taxi.summary.solid.promotion_modal_windows.domain;

import defpackage.flv0;
import defpackage.ht1;
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
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.widget.utils.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Ljava/lang/CharSequence;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.summary.solid.promotion_modal_windows.domain.SummaryPromotionModalWindowsOnOrderModelMapper$mapUiState$2$text$1", f = "SummaryPromotionModalWindowsOnOrderModelMapper.kt", l = {41}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SummaryPromotionModalWindowsOnOrderModelMapper$mapUiState$2$text$1 extends SuspendLambda implements wls {
    final /* synthetic */ flv0 $modalView;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SummaryPromotionModalWindowsOnOrderModelMapper$mapUiState$2$text$1(flv0 flv0Var, Continuation continuation, a aVar) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$modalView = flv0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SummaryPromotionModalWindowsOnOrderModelMapper$mapUiState$2$text$1(this.$modalView, continuation, this.this$0);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SummaryPromotionModalWindowsOnOrderModelMapper$mapUiState$2$text$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        e eVar = this.this$0.c;
        ht1 ht1Var = this.$modalView.c;
        ht1Var.getClass();
        FormattedText formattedText = new FormattedText(ht1Var.a);
        this.label = 1;
        Object s = e.s(eVar, formattedText, this);
        return s == coroutineSingletons ? coroutineSingletons : s;
    }
}
