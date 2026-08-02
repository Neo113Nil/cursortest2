package com.squareup.cash.profile.views;

import com.squareup.cash.profile.viewmodels.GenericProfileElementViewModel;
import com.squareup.cash.profile.viewmodels.GenericProfileElementsViewEvent;
import com.squareup.protos.cash.cashface.ui.GenericProfileElement;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes7.dex */
public final /* synthetic */ class GenericProfileElementsViewKt$$ExternalSyntheticLambda5 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ GenericProfileElementViewModel.ButtonWidget f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ GenericProfileElementsViewKt$$ExternalSyntheticLambda5(GenericProfileElementViewModel.ButtonWidget buttonWidget, Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$0 = buttonWidget;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        GenericProfileElementsViewEvent.ReportProfileClicked reportProfileClicked = GenericProfileElementsViewEvent.ReportProfileClicked.INSTANCE;
        Function1 function1 = this.f$1;
        GenericProfileElementViewModel.ButtonWidget buttonWidget = this.f$0;
        switch (i) {
            case 0:
                GenericProfileElement.ButtonElement.BlockAction blockAction = buttonWidget.block;
                if (blockAction != null) {
                    function1.invoke(new GenericProfileElementsViewEvent.BlockButtonClicked(blockAction));
                } else if (buttonWidget.report != null) {
                    function1.invoke(reportProfileClicked);
                }
                break;
            default:
                GenericProfileElement.ButtonElement.BlockAction blockAction2 = buttonWidget.block;
                if (blockAction2 != null) {
                    function1.invoke(new GenericProfileElementsViewEvent.BlockButtonClicked(blockAction2));
                } else if (buttonWidget.report != null) {
                    function1.invoke(reportProfileClicked);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
