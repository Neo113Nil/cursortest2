package com.squareup.cash.afterpayapplet.views.homesection;

import com.squareup.cash.afterpayapplet.viewmodels.Tap;
import com.squareup.cash.afterpayapplet.viewmodels.viewevents.AfterpayAppletHomeViewEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final /* synthetic */ class RetroSectionKt$$ExternalSyntheticLambda5 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ Tap f$1;

    public /* synthetic */ RetroSectionKt$$ExternalSyntheticLambda5(Function1 function1, Tap tap, int i) {
        this.$r8$classId = i;
        this.f$0 = function1;
        this.f$1 = tap;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        Tap tap = this.f$1;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                function1.invoke(new AfterpayAppletHomeViewEvent.TapActionEvent(tap));
                break;
            case 1:
                function1.invoke(new AfterpayAppletHomeViewEvent.TapActionEvent(tap, tap.getAnalyticsTapEventsSpec()));
                break;
            case 2:
                function1.invoke(new AfterpayAppletHomeViewEvent.TapActionEvent(tap));
                break;
            case 3:
                function1.invoke(new AfterpayAppletHomeViewEvent.TapActionEvent(tap, tap.getAnalyticsTapEventsSpec()));
                break;
            case 4:
                function1.invoke(new AfterpayAppletHomeViewEvent.TapActionEvent(tap));
                break;
            case 5:
                function1.invoke(new AfterpayAppletHomeViewEvent.TapActionEvent(tap));
                break;
            case 6:
                function1.invoke(new AfterpayAppletHomeViewEvent.TapActionEvent(tap));
                break;
            case 7:
                function1.invoke(new AfterpayAppletHomeViewEvent.TapActionEvent(tap));
                break;
            case 8:
                function1.invoke(new AfterpayAppletHomeViewEvent.TapActionEvent(tap));
                break;
            case 9:
                function1.invoke(new AfterpayAppletHomeViewEvent.TapActionEvent(tap, tap.getAnalyticsTapEventsSpec()));
                break;
            case 10:
                function1.invoke(new AfterpayAppletHomeViewEvent.TapActionEvent(tap, tap.getAnalyticsTapEventsSpec()));
                break;
            default:
                function1.invoke(new AfterpayAppletHomeViewEvent.TapActionEvent(tap, tap.getAnalyticsTapEventsSpec()));
                break;
        }
        return Unit.INSTANCE;
    }
}
