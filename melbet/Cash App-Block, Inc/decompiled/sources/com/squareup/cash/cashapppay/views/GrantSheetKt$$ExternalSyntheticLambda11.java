package com.squareup.cash.cashapppay.views;

import com.squareup.cash.cashapppay.viewmodels.GrantViewEvent;
import com.squareup.cash.formview.viewevents.api.FormViewEvent;
import com.squareup.cash.prepurchasecashcard.viewmodels.PrepurchaseCardFAQViewEvent;
import com.squareup.protos.franklin.api.BlockerAction;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class GrantSheetKt$$ExternalSyntheticLambda11 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ BlockerAction f$1;

    public /* synthetic */ GrantSheetKt$$ExternalSyntheticLambda11(BlockerAction blockerAction, Function1 function1) {
        this.$r8$classId = 6;
        this.f$1 = blockerAction;
        this.f$0 = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        BlockerAction blockerAction = this.f$1;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                function1.invoke(new GrantViewEvent.BlockerActionEvent(blockerAction));
                break;
            case 1:
                function1.invoke(new GrantViewEvent.BlockerActionEvent(blockerAction));
                break;
            case 2:
                function1.invoke(new GrantViewEvent.BlockerActionEvent(blockerAction));
                break;
            case 3:
                function1.invoke(new GrantViewEvent.BlockerActionEvent(blockerAction));
                break;
            case 4:
                function1.invoke(new GrantViewEvent.BlockerActionEvent(blockerAction));
                break;
            case 5:
                function1.invoke(new GrantViewEvent.BlockerActionEvent(blockerAction));
                break;
            case 6:
                if (blockerAction != null) {
                    function1.invoke(new FormViewEvent.BlockerActionViewEvent.FormDetailRowClicked(blockerAction));
                }
                break;
            case 7:
                function1.invoke(new FormViewEvent.BlockerActionViewEvent.PaymentPlanScheduleInfoClicked(blockerAction));
                break;
            case 8:
                function1.invoke(new FormViewEvent.BlockerActionViewEvent.SectionHeaderClicked(blockerAction));
                break;
            case 9:
                function1.invoke(new FormViewEvent.BlockerActionViewEvent.TimelineCardListClicked(blockerAction));
                break;
            case 10:
                function1.invoke(new FormViewEvent.BlockerActionViewEvent.FormButtonClicked(blockerAction));
                break;
            default:
                function1.invoke(new PrepurchaseCardFAQViewEvent.PrimaryButtonClicked(blockerAction));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ GrantSheetKt$$ExternalSyntheticLambda11(Function1 function1, BlockerAction blockerAction, int i) {
        this.$r8$classId = i;
        this.f$0 = function1;
        this.f$1 = blockerAction;
    }
}
