package ru.yandex.taxi.summary.solid.promotion_modal_windows.ui;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.summary.solid.promotion_modal_windows.ui.SummaryPromotionModalWindowByIdRouterImpl", f = "SummaryPromotionModalWindowByIdRouterImpl.kt", l = {43}, m = "findSummaryPromotionModalWindow", v = 2)
/* loaded from: classes6.dex */
final class SummaryPromotionModalWindowByIdRouterImpl$findSummaryPromotionModalWindow$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SummaryPromotionModalWindowByIdRouterImpl$findSummaryPromotionModalWindow$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return a.P(this.this$0, null, this);
    }
}
