package ru.yandex.taxi.summary.solid.promotion_modal_windows.domain;

import defpackage.bvf0;
import defpackage.flv0;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lxlv0;", "<anonymous>", "(Ltse;)Lxlv0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.summary.solid.promotion_modal_windows.domain.SummaryPromotionModalWindowsOnOrderModelMapper$toUiState$2", f = "SummaryPromotionModalWindowsOnOrderModelMapper.kt", l = {33}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SummaryPromotionModalWindowsOnOrderModelMapper$toUiState$2 extends SuspendLambda implements wls {
    final /* synthetic */ flv0 $modalView;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SummaryPromotionModalWindowsOnOrderModelMapper$toUiState$2(flv0 flv0Var, Continuation continuation, a aVar) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$modalView = flv0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SummaryPromotionModalWindowsOnOrderModelMapper$toUiState$2(this.$modalView, continuation, this.this$0);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SummaryPromotionModalWindowsOnOrderModelMapper$toUiState$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        a aVar = this.this$0;
        flv0 flv0Var = this.$modalView;
        this.label = 1;
        aVar.getClass();
        Object n = bvf0.n(new SummaryPromotionModalWindowsOnOrderModelMapper$mapUiState$2(flv0Var, null, aVar), this);
        return n == coroutineSingletons ? coroutineSingletons : n;
    }
}
