package com.squareup.cash.banking.views;

import android.content.Context;
import app.cash.broadway.ui.Ui;
import com.squareup.cash.banking.viewmodels.ConfirmCashOutDialogViewEvent$TapButton;
import com.squareup.cash.banking.viewmodels.ConfirmCashOutDialogViewModel;
import com.squareup.cash.mooncake.components.AlertDialogView;
import com.squareup.cash.mooncake.screens.AlertDialogResult;
import com.squareup.cash.ui.OutsideTapCloses;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ConfirmCashOutDialog extends AlertDialogView implements OutsideTapCloses, Ui {
    public Ui.EventReceiver eventReceiver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfirmCashOutDialog(Context context) {
        super(context, null, false, 6);
        context.getClass();
    }

    @Override // app.cash.broadway.ui.Ui
    public void setEventReceiver(Ui.EventReceiver eventReceiver) {
        eventReceiver.getClass();
        this.eventReceiver = eventReceiver;
    }

    @Override // app.cash.broadway.ui.Ui
    public void setModel(ConfirmCashOutDialogViewModel confirmCashOutDialogViewModel) {
        confirmCashOutDialogViewModel.getClass();
        String str = confirmCashOutDialogViewModel.title;
        if (str != null) {
            setTitle(str);
        }
        setMessage(confirmCashOutDialogViewModel.message);
        final int i = 0;
        setNegativeButton(confirmCashOutDialogViewModel.secondaryButtonText, new Function0(this) { // from class: com.squareup.cash.banking.views.ConfirmCashOutDialog$$ExternalSyntheticLambda0
            public final /* synthetic */ ConfirmCashOutDialog f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ConfirmCashOutDialog confirmCashOutDialog = this.f$0;
                switch (i2) {
                    case 0:
                        Ui.EventReceiver eventReceiver = confirmCashOutDialog.eventReceiver;
                        if (eventReceiver != null) {
                            eventReceiver.sendEvent(new ConfirmCashOutDialogViewEvent$TapButton(AlertDialogResult.NEGATIVE));
                            return Unit.INSTANCE;
                        }
                        Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                        throw null;
                    default:
                        Ui.EventReceiver eventReceiver2 = confirmCashOutDialog.eventReceiver;
                        if (eventReceiver2 != null) {
                            eventReceiver2.sendEvent(new ConfirmCashOutDialogViewEvent$TapButton(AlertDialogResult.POSITIVE));
                            return Unit.INSTANCE;
                        }
                        Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                        throw null;
                }
            }
        });
        final int i2 = 1;
        setPositiveButton(confirmCashOutDialogViewModel.primaryButtonText, new Function0(this) { // from class: com.squareup.cash.banking.views.ConfirmCashOutDialog$$ExternalSyntheticLambda0
            public final /* synthetic */ ConfirmCashOutDialog f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ConfirmCashOutDialog confirmCashOutDialog = this.f$0;
                switch (i22) {
                    case 0:
                        Ui.EventReceiver eventReceiver = confirmCashOutDialog.eventReceiver;
                        if (eventReceiver != null) {
                            eventReceiver.sendEvent(new ConfirmCashOutDialogViewEvent$TapButton(AlertDialogResult.NEGATIVE));
                            return Unit.INSTANCE;
                        }
                        Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                        throw null;
                    default:
                        Ui.EventReceiver eventReceiver2 = confirmCashOutDialog.eventReceiver;
                        if (eventReceiver2 != null) {
                            eventReceiver2.sendEvent(new ConfirmCashOutDialogViewEvent$TapButton(AlertDialogResult.POSITIVE));
                            return Unit.INSTANCE;
                        }
                        Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                        throw null;
                }
            }
        });
    }
}
