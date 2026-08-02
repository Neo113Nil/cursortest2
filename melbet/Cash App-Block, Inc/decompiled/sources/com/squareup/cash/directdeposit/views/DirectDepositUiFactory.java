package com.squareup.cash.directdeposit.views;

import android.content.Context;
import android.view.ViewGroup;
import app.cash.broadway.screen.Screen;
import app.cash.broadway.ui.UiFactory;
import com.squareup.cash.banking.screens.DemandDepositDialogScreen;
import com.squareup.cash.directdeposit.screens.DirectDepositEditCompanyNameScreen;
import com.squareup.cash.directdeposit.screens.DirectDepositEditFullNameScreen;
import com.squareup.cash.directdeposit.screens.DirectDepositEditPaycheckAllocationScreen;
import com.squareup.cash.directdeposit.screens.DirectDepositEditPaycheckCurrencyAllocationScreen;
import com.squareup.cash.directdeposit.screens.DirectDepositEditPaycheckPercentageScreen;
import com.squareup.cash.directdeposit.screens.DirectDepositManualFormDetailsScreen;
import com.squareup.cash.directdeposit.screens.DirectDepositManualFormSubmissionScreen;
import com.squareup.cash.directdeposit.screens.DirectDepositSetupScreen;
import com.squareup.cash.directdeposit.screens.DirectDepositUpdateManualFormScreen;
import dev.zacsweers.metro.internal.Factory;

/* loaded from: classes.dex */
public final class DirectDepositUiFactory implements UiFactory {

    public final class MetroFactory implements Factory {
        public static final MetroFactory INSTANCE = new MetroFactory();

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new DirectDepositUiFactory();
        }
    }

    @Override // app.cash.broadway.ui.UiFactory
    public final UiFactory.ScreenUi createUi(Screen screen, Context context, ViewGroup viewGroup) {
        UiFactory.ComposeUi composeUi;
        context.getClass();
        if (screen instanceof DirectDepositEditFullNameScreen) {
            composeUi = new UiFactory.ComposeUi(DirectDepositDialogKt.lambda$1279182420);
        } else if (screen instanceof DirectDepositEditCompanyNameScreen) {
            composeUi = new UiFactory.ComposeUi(DirectDepositDialogKt.f374lambda$1574784323);
        } else if (screen instanceof DirectDepositManualFormDetailsScreen) {
            composeUi = new UiFactory.ComposeUi(DirectDepositDialogKt.f375lambda$221567950);
        } else if (screen instanceof DirectDepositEditPaycheckAllocationScreen) {
            composeUi = new UiFactory.ComposeUi(DirectDepositDialogKt.f378lambda$664146865);
        } else if (screen instanceof DirectDepositEditPaycheckCurrencyAllocationScreen) {
            composeUi = new UiFactory.ComposeUi(DirectDepositDialogKt.f379lambda$719376614);
        } else if (screen instanceof DirectDepositEditPaycheckPercentageScreen) {
            composeUi = new UiFactory.ComposeUi(DirectDepositDialogKt.f376lambda$434240711);
        } else if (screen instanceof DirectDepositManualFormSubmissionScreen) {
            composeUi = new UiFactory.ComposeUi(DirectDepositDialogKt.lambda$662175440);
        } else if (screen instanceof DirectDepositUpdateManualFormScreen) {
            composeUi = new UiFactory.ComposeUi(DirectDepositDialogKt.f380lambda$894536444);
        } else {
            if (screen instanceof DemandDepositDialogScreen) {
                return new UiFactory.ComposeUi(DirectDepositDialogKt.lambda$1388652942);
            }
            composeUi = null;
        }
        if (composeUi != null) {
            return composeUi;
        }
        if (screen instanceof DirectDepositSetupScreen) {
            return new UiFactory.ComposeUi(DirectDepositDialogKt.lambda$1143980412);
        }
        return null;
    }
}
