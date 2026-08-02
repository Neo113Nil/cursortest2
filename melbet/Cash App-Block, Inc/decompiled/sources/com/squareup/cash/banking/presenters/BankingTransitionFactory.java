package com.squareup.cash.banking.presenters;

import app.cash.broadway.screen.Screen;
import app.cash.broadway.ui.TransitionFactory;
import com.squareup.cash.banking.screens.RecurringDepositsFirstTimeUserScreen;
import com.squareup.cash.banking.screens.RecurringDepositsScreen;
import com.squareup.cash.db.StorageLinkQueries$$ExternalSyntheticLambda8;

/* loaded from: classes.dex */
public final class BankingTransitionFactory implements TransitionFactory {
    @Override // app.cash.broadway.ui.TransitionFactory
    public final TransitionFactory.Transition createTransition(Screen screen, Screen screen2, boolean z, StorageLinkQueries$$ExternalSyntheticLambda8 storageLinkQueries$$ExternalSyntheticLambda8) {
        screen2.getClass();
        if ((screen2 instanceof RecurringDepositsScreen) && (screen instanceof RecurringDepositsFirstTimeUserScreen)) {
            return TransitionFactory.StandardTransition.OutToLeft.INSTANCE;
        }
        return null;
    }
}
