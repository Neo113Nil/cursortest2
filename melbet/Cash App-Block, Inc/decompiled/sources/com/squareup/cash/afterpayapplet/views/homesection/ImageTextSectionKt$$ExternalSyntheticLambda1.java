package com.squareup.cash.afterpayapplet.views.homesection;

import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletHomeContentViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.Tap;
import com.squareup.cash.afterpayapplet.viewmodels.viewevents.AfterpayAppletHomeViewEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final /* synthetic */ class ImageTextSectionKt$$ExternalSyntheticLambda1 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ AfterpayAppletHomeContentViewModel.HomeSection.ButtonModel f$1;

    public /* synthetic */ ImageTextSectionKt$$ExternalSyntheticLambda1(Function1 function1, AfterpayAppletHomeContentViewModel.HomeSection.ButtonModel buttonModel, int i) {
        this.$r8$classId = i;
        this.f$0 = function1;
        this.f$1 = buttonModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        AfterpayAppletHomeContentViewModel.HomeSection.ButtonModel buttonModel = this.f$1;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                Tap tap = buttonModel.tapAction;
                function1.invoke(new AfterpayAppletHomeViewEvent.TapActionEvent(tap, tap.getAnalyticsTapEventsSpec()));
                break;
            case 1:
                function1.invoke(new AfterpayAppletHomeViewEvent.PaymentButtonTapped(buttonModel.tapAction));
                break;
            case 2:
                function1.invoke(new AfterpayAppletHomeViewEvent.PaymentButtonTapped(buttonModel.tapAction));
                break;
            case 3:
                Tap tap2 = buttonModel.tapAction;
                function1.invoke(new AfterpayAppletHomeViewEvent.TapActionEvent(tap2, tap2.getAnalyticsTapEventsSpec()));
                break;
            default:
                Tap tap3 = buttonModel.tapAction;
                function1.invoke(new AfterpayAppletHomeViewEvent.TapActionEvent(tap3, tap3.getAnalyticsTapEventsSpec()));
                break;
        }
        return Unit.INSTANCE;
    }
}
