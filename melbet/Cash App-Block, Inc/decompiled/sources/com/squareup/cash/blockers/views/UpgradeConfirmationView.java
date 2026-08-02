package com.squareup.cash.blockers.views;

import android.content.Context;
import app.cash.broadway.ui.Ui;
import com.squareup.cash.R;
import com.squareup.cash.blockers.viewmodels.UpgradeConfirmationViewEvent;
import com.squareup.cash.mooncake.components.AlertDialogView;
import com.squareup.cash.ui.OutsideTapCloses;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class UpgradeConfirmationView extends AlertDialogView implements OutsideTapCloses, Ui {
    public Ui.EventReceiver eventReceiver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpgradeConfirmationView(Context context) {
        super(context, null, true, 2);
        context.getClass();
        final int i = 1;
        setMessage(R.string.blockers_upgrade_confirmation_message);
        final int i2 = 0;
        setNegativeButton(R.string.blockers_upgrade_confirmation_negative, new Function0(this) { // from class: com.squareup.cash.blockers.views.UpgradeConfirmationView$$ExternalSyntheticLambda0
            public final /* synthetic */ UpgradeConfirmationView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                UpgradeConfirmationView upgradeConfirmationView = this.f$0;
                switch (i3) {
                    case 0:
                        Ui.EventReceiver eventReceiver = upgradeConfirmationView.eventReceiver;
                        if (eventReceiver != null) {
                            eventReceiver.sendEvent(UpgradeConfirmationViewEvent.NegativeClick.INSTANCE);
                            return Unit.INSTANCE;
                        }
                        Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                        throw null;
                    default:
                        Ui.EventReceiver eventReceiver2 = upgradeConfirmationView.eventReceiver;
                        if (eventReceiver2 != null) {
                            eventReceiver2.sendEvent(UpgradeConfirmationViewEvent.PositiveClick.INSTANCE);
                            return Unit.INSTANCE;
                        }
                        Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                        throw null;
                }
            }
        });
        setPositiveButton(R.string.blockers_upgrade_confirmation_positive, new Function0(this) { // from class: com.squareup.cash.blockers.views.UpgradeConfirmationView$$ExternalSyntheticLambda0
            public final /* synthetic */ UpgradeConfirmationView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                UpgradeConfirmationView upgradeConfirmationView = this.f$0;
                switch (i3) {
                    case 0:
                        Ui.EventReceiver eventReceiver = upgradeConfirmationView.eventReceiver;
                        if (eventReceiver != null) {
                            eventReceiver.sendEvent(UpgradeConfirmationViewEvent.NegativeClick.INSTANCE);
                            return Unit.INSTANCE;
                        }
                        Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                        throw null;
                    default:
                        Ui.EventReceiver eventReceiver2 = upgradeConfirmationView.eventReceiver;
                        if (eventReceiver2 != null) {
                            eventReceiver2.sendEvent(UpgradeConfirmationViewEvent.PositiveClick.INSTANCE);
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
