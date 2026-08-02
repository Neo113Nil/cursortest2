package com.squareup.cash.overlays;

import com.squareup.cash.overlays.RealOverlayLayer;
import com.squareup.cash.payments.presenters.UtilsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.work.viewmodels.ClockInOverlayViewEvent;
import com.squareup.cash.work.viewmodels.CurrentTimeMillisProvider$Companion$$ExternalSyntheticLambda0;
import com.squareup.cash.work.views.clockin.ClockInOverlayMode;
import com.squareup.cash.work.views.clockin.ClockInOverlayState;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes8.dex */
public final /* synthetic */ class RealOverlayLayer$show$3 extends FunctionReferenceImpl implements Function0 {
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealOverlayLayer$show$3(RealOverlayLayer.LifecycleExitCallback lifecycleExitCallback) {
        super(0, 0, RealOverlayLayer.LifecycleExitCallback.class, lifecycleExitCallback, "invoke", "invoke()V");
        this.$r8$classId = 0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        ClockInOverlayViewEvent.ErrorDialogDismissed errorDialogDismissed = ClockInOverlayViewEvent.ErrorDialogDismissed.INSTANCE;
        switch (i) {
            case 0:
                RealOverlayLayer.LifecycleExitCallback lifecycleExitCallback = (RealOverlayLayer.LifecycleExitCallback) this.receiver;
                RealOverlayLayer realOverlayLayer = RealOverlayLayer.this;
                CollectionsKt__MutableCollectionsKt.removeAll(realOverlayLayer.current, new UtilsKt$$ExternalSyntheticLambda0(lifecycleExitCallback, 1));
                RealOverlayLayer.access$updateSiblingAccessibility(realOverlayLayer);
                break;
            case 2:
                ((ClockInOverlayState) this.receiver).endBreakDisabledDialogRemainingMinutes$delegate.setValue(null);
                break;
            case 3:
                ((ClockInOverlayState) this.receiver).endBreakDisabledDialogRemainingMinutes$delegate.setValue(null);
                break;
            case 4:
                ((ClockInOverlayState) this.receiver).onDisabledClockInDialogPrimaryClick();
                break;
            case 5:
                ((ClockInOverlayState) this.receiver).setDisabledClockInReason(null);
                break;
            case 6:
                ((ClockInOverlayState) this.receiver).setDisabledClockInReason(null);
                break;
            case 7:
                ((ClockInOverlayState) this.receiver).onDisabledClockInDialogPrimaryClick();
                break;
            case 8:
                ((ClockInOverlayState) this.receiver).setDisabledClockInReason(null);
                break;
            case 9:
                ((ClockInOverlayState) this.receiver).setDisabledClockInReason(null);
                break;
            case 10:
                ((ClockInOverlayState) this.receiver).onEvent.invoke(errorDialogDismissed);
                break;
            case 11:
                ((ClockInOverlayState) this.receiver).onEvent.invoke(errorDialogDismissed);
                break;
            case 12:
                ((ClockInOverlayState) this.receiver).dismissOverlayCallback.invoke();
                break;
            case 13:
                ClockInOverlayState clockInOverlayState = (ClockInOverlayState) this.receiver;
                clockInOverlayState.isClockingIn$delegate.setValue(Boolean.TRUE);
                clockInOverlayState.onEvent.invoke(ClockInOverlayViewEvent.ClockInClicked.INSTANCE);
                break;
            case 14:
                ((ClockInOverlayState) this.receiver).onEvent.invoke(ClockInOverlayViewEvent.OpenAppSettingsClicked.INSTANCE);
                break;
            case 15:
                ClockInOverlayState clockInOverlayState2 = (ClockInOverlayState) this.receiver;
                clockInOverlayState2.getClass();
                clockInOverlayState2.setOverlayMode(ClockInOverlayMode.BreakPicker);
                break;
            case 16:
                ClockInOverlayState clockInOverlayState3 = (ClockInOverlayState) this.receiver;
                clockInOverlayState3.getClass();
                clockInOverlayState3.setOverlayMode(ClockInOverlayMode.ClockOutConfirmation);
                break;
            case 17:
                ClockInOverlayState clockInOverlayState4 = (ClockInOverlayState) this.receiver;
                clockInOverlayState4.isEndingBreak$delegate.setValue(Boolean.TRUE);
                clockInOverlayState4.onEvent.invoke(ClockInOverlayViewEvent.EndBreakClicked.INSTANCE);
                break;
            case 18:
                ClockInOverlayState clockInOverlayState5 = (ClockInOverlayState) this.receiver;
                clockInOverlayState5.onEvent.invoke(ClockInOverlayViewEvent.LocationClicked.INSTANCE);
                clockInOverlayState5.setOverlayMode(ClockInOverlayMode.LocationPicker);
                break;
            case 19:
                ClockInOverlayState clockInOverlayState6 = (ClockInOverlayState) this.receiver;
                clockInOverlayState6.onEvent.invoke(ClockInOverlayViewEvent.JobClicked.INSTANCE);
                clockInOverlayState6.setOverlayMode(ClockInOverlayMode.JobPicker);
                break;
            case 20:
                ((ClockInOverlayState) this.receiver).onBackFromPicker();
                break;
            case 21:
                ((ClockInOverlayState) this.receiver).onBackFromPicker();
                break;
            case 22:
                ((ClockInOverlayState) this.receiver).onBackFromPicker();
                break;
            case 23:
                ((ClockInOverlayState) this.receiver).onBackFromPicker();
                break;
            case 24:
                ((ClockInOverlayState) this.receiver).onBackFromPicker();
                break;
            case 25:
                ((ClockInOverlayState) this.receiver).dismissOverlayCallback.invoke();
                break;
            case 26:
                ((ClockInOverlayState) this.receiver).dismissOverlayCallback.invoke();
                break;
        }
        return Long.valueOf(((CurrentTimeMillisProvider$Companion$$ExternalSyntheticLambda0) this.receiver).currentTimeMillis());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealOverlayLayer$show$3(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.$r8$classId = i3;
    }
}
