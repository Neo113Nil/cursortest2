package com.squareup.cash.history.views;

import android.view.ContextThemeWrapper;
import android.widget.LinearLayout;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.platform.ComposeView;
import app.cash.broadway.ui.Ui;
import com.squareup.cash.R;
import com.squareup.cash.history.viewmodels.PasscodeDialogViewEvent;
import com.squareup.cash.history.viewmodels.PasscodeDialogViewModel;
import com.squareup.cash.ui.OnBackListener;
import com.squareup.cash.ui.OutsideTapCloses;
import com.squareup.cash.ui.SecureScreen;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.cash.ui.widget.MaxWidthLinearLayout;

/* loaded from: classes6.dex */
public final class PaymentPasscodeDialogView extends MaxWidthLinearLayout implements SecureScreen, OnBackListener, OutsideTapCloses, Ui {
    public final ParcelableSnapshotMutableState currentModel$delegate;
    public Ui.EventReceiver eventReceiver;
    public final RealCashVibrator vibrator;

    public PaymentPasscodeDialogView(RealCashVibrator realCashVibrator, ContextThemeWrapper contextThemeWrapper) {
        super(contextThemeWrapper, null);
        this.vibrator = realCashVibrator;
        this.currentModel$delegate = Updater.mutableStateOf$default(null);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.maxWidth = getResources().getDimensionPixelSize(R.dimen.dialog_max_width);
        requestLayout();
        setOrientation(1);
        ComposeView composeView = new ComposeView(contextThemeWrapper, null, 0, 6, null);
        composeView.setContent(new ComposableLambdaImpl(new PaymentPasscodeDialogView$$ExternalSyntheticLambda0(this, 0), true, 2081922238));
        addView(composeView, new LinearLayout.LayoutParams(-1, -2));
    }

    @Override // com.squareup.cash.ui.OnBackListener
    public final boolean onBack() {
        Ui.EventReceiver eventReceiver = this.eventReceiver;
        if (eventReceiver == null) {
            return false;
        }
        eventReceiver.sendEvent(PasscodeDialogViewEvent.GoBack.INSTANCE);
        return true;
    }

    @Override // app.cash.broadway.ui.Ui
    public void setEventReceiver(Ui.EventReceiver eventReceiver) {
        eventReceiver.getClass();
        this.eventReceiver = eventReceiver;
    }

    @Override // app.cash.broadway.ui.Ui
    public void setModel(PasscodeDialogViewModel passcodeDialogViewModel) {
        passcodeDialogViewModel.getClass();
        this.currentModel$delegate.setValue(passcodeDialogViewModel);
    }
}
