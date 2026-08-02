package com.squareup.cash.blockers.views;

import android.content.Context;
import app.cash.broadway.ui.Ui;
import com.squareup.cash.R;
import com.squareup.cash.blockers.viewmodels.ConfirmExitOnboardingFlowViewEvent;
import com.squareup.cash.mooncake.components.AlertDialogView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ConfirmExitOnboardingFlowView extends AlertDialogView implements Ui {
    public Ui.EventReceiver eventReceiver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfirmExitOnboardingFlowView(Context context) {
        super(context, null, false, 6);
        context.getClass();
        final int i = 0;
        setTitle(R.string.blockers_confirm_exit_onboarding_flow_title);
        setMessage(R.string.blockers_confirm_exit_onboarding_flow_message);
        setPositiveButton(R.string.blockers_confirm_exit_onboarding_flow_continue, new Function0(this) { // from class: com.squareup.cash.blockers.views.ConfirmExitOnboardingFlowView$$ExternalSyntheticLambda0
            public final /* synthetic */ ConfirmExitOnboardingFlowView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ConfirmExitOnboardingFlowView confirmExitOnboardingFlowView = this.f$0;
                switch (i2) {
                    case 0:
                        Ui.EventReceiver eventReceiver = confirmExitOnboardingFlowView.eventReceiver;
                        if (eventReceiver != null) {
                            eventReceiver.sendEvent(ConfirmExitOnboardingFlowViewEvent.Continue.INSTANCE);
                            return Unit.INSTANCE;
                        }
                        Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                        throw null;
                    default:
                        Ui.EventReceiver eventReceiver2 = confirmExitOnboardingFlowView.eventReceiver;
                        if (eventReceiver2 != null) {
                            eventReceiver2.sendEvent(ConfirmExitOnboardingFlowViewEvent.ExitFlow.INSTANCE);
                            return Unit.INSTANCE;
                        }
                        Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                        throw null;
                }
            }
        });
        final int i2 = 1;
        setNegativeButton(R.string.blockers_confirm_exit_onboarding_flow_exit, new Function0(this) { // from class: com.squareup.cash.blockers.views.ConfirmExitOnboardingFlowView$$ExternalSyntheticLambda0
            public final /* synthetic */ ConfirmExitOnboardingFlowView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ConfirmExitOnboardingFlowView confirmExitOnboardingFlowView = this.f$0;
                switch (i22) {
                    case 0:
                        Ui.EventReceiver eventReceiver = confirmExitOnboardingFlowView.eventReceiver;
                        if (eventReceiver != null) {
                            eventReceiver.sendEvent(ConfirmExitOnboardingFlowViewEvent.Continue.INSTANCE);
                            return Unit.INSTANCE;
                        }
                        Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                        throw null;
                    default:
                        Ui.EventReceiver eventReceiver2 = confirmExitOnboardingFlowView.eventReceiver;
                        if (eventReceiver2 != null) {
                            eventReceiver2.sendEvent(ConfirmExitOnboardingFlowViewEvent.ExitFlow.INSTANCE);
                            return Unit.INSTANCE;
                        }
                        Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                        throw null;
                }
            }
        });
    }

    @Override // app.cash.broadway.ui.Ui
    public void setEventReceiver(Ui.EventReceiver eventReceiver) {
        eventReceiver.getClass();
        this.eventReceiver = eventReceiver;
    }

    @Override // app.cash.broadway.ui.Ui
    public void setModel(Unit unit) {
        unit.getClass();
    }
}
