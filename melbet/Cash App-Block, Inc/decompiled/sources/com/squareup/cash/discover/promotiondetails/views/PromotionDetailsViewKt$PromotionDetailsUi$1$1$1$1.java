package com.squareup.cash.discover.promotiondetails.views;

import app.cash.broadway.ui.compose.UiScope;
import com.squareup.cash.discover.promotiondetails.viewmodels.PromotionDetailsViewEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes6.dex */
public final /* synthetic */ class PromotionDetailsViewKt$PromotionDetailsUi$1$1$1$1 extends FunctionReferenceImpl implements Function0 {
    public final /* synthetic */ Function1 $onEvent;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ UiScope $this_UiScope;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PromotionDetailsViewKt$PromotionDetailsUi$1$1$1$1(UiScope uiScope, Function1 function1, int i) {
        super(0, ArrayIteratorKt.class, "close", "PromotionDetailsUi$lambda$0$close(Lapp/cash/broadway/ui/compose/UiScope;Lkotlin/jvm/functions/Function1;)V", 0);
        this.$r8$classId = i;
        switch (i) {
            case 1:
                this.$this_UiScope = uiScope;
                this.$onEvent = function1;
                super(0, ArrayIteratorKt.class, "close", "PromotionDetailsUi$lambda$0$close(Lapp/cash/broadway/ui/compose/UiScope;Lkotlin/jvm/functions/Function1;)V", 0);
                break;
            default:
                this.$this_UiScope = uiScope;
                this.$onEvent = function1;
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        PromotionDetailsViewEvent.Close close = PromotionDetailsViewEvent.Close.INSTANCE;
        Function1 function1 = this.$onEvent;
        UiScope uiScope = this.$this_UiScope;
        switch (i) {
            case 0:
                if (!uiScope.$$delegate_1.isTransitionActive()) {
                    function1.invoke(close);
                }
                break;
            default:
                if (!uiScope.$$delegate_1.isTransitionActive()) {
                    function1.invoke(close);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
