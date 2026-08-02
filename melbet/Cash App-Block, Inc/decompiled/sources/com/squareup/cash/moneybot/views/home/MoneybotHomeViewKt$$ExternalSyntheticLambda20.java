package com.squareup.cash.moneybot.views.home;

import com.squareup.cash.moneybot.viewmodels.MoneybotHomeViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class MoneybotHomeViewKt$$ExternalSyntheticLambda20 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MoneybotHomeViewModel.WidgetCard f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ MoneybotHomeViewKt$$ExternalSyntheticLambda20(MoneybotHomeViewModel.WidgetCard widgetCard, Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$0 = widgetCard;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        Function1 function1 = this.f$1;
        MoneybotHomeViewModel.WidgetCard widgetCard = this.f$0;
        switch (i) {
            case 0:
                MoneybotHomeViewModel.WidgetCard.Action action = widgetCard.deleteAction;
                if (action != null) {
                    function1.invoke(action.event);
                }
                return Unit.INSTANCE;
            case 1:
                MoneybotHomeViewModel.WidgetCard.Action action2 = widgetCard.action;
                if (action2 != null) {
                    function1.invoke(action2.event);
                }
                return Unit.INSTANCE;
            default:
                MoneybotHomeViewModel.WidgetCard.Action action3 = widgetCard.deleteAction;
                if (action3 != null) {
                    function1.invoke(action3.event);
                }
                return Boolean.TRUE;
        }
    }
}
