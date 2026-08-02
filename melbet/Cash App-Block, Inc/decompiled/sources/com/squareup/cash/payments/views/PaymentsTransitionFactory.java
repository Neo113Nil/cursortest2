package com.squareup.cash.payments.views;

import app.cash.broadway.screen.Screen;
import app.cash.broadway.ui.TransitionFactory;
import com.squareup.cash.bitcoin.screens.MoveBitcoinScreen;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.db.StorageLinkQueries$$ExternalSyntheticLambda8;
import com.squareup.cash.payments.screens.PaymentScreens;
import com.squareup.cash.payments.screens.PaymentScreens$HomeScreens$PaymentPad;
import com.squareup.cash.profile.screens.ProfileScreens;

/* loaded from: classes.dex */
public final class PaymentsTransitionFactory implements TransitionFactory {
    public static final PaymentsTransitionFactory INSTANCE = new PaymentsTransitionFactory();

    @Override // app.cash.broadway.ui.TransitionFactory
    public final TransitionFactory.Transition createTransition(Screen screen, Screen screen2, boolean z, StorageLinkQueries$$ExternalSyntheticLambda8 storageLinkQueries$$ExternalSyntheticLambda8) {
        screen2.getClass();
        boolean z2 = screen2 instanceof PaymentScreens.QuickPay;
        TransitionFactory.StandardTransition.PushLeft pushLeft = TransitionFactory.StandardTransition.PushLeft.INSTANCE;
        if (!z2 || !(screen instanceof BlockersScreens)) {
            boolean z3 = screen2 instanceof PaymentScreens.MainPayment;
            TransitionFactory.StandardTransition.InFromBottom inFromBottom = TransitionFactory.StandardTransition.InFromBottom.INSTANCE;
            TransitionFactory.StandardTransition.PushRight pushRight = TransitionFactory.StandardTransition.PushRight.INSTANCE;
            if (!z3) {
                boolean z4 = screen instanceof PaymentScreens.MainPayment;
                TransitionFactory.StandardTransition.OutToBottom outToBottom = TransitionFactory.StandardTransition.OutToBottom.INSTANCE;
                if (z4) {
                    return screen2 instanceof ProfileScreens.ProfileScreen ? pushLeft : screen2 instanceof MoveBitcoinScreen ? pushRight : outToBottom;
                }
                if ((screen instanceof BlockersScreens.StatusResultFullScreen) && (screen2 instanceof PaymentScreens$HomeScreens$PaymentPad)) {
                    return TransitionFactory.StandardTransition.FadeOutThenIn.INSTANCE;
                }
                if ((screen instanceof PaymentScreens.NearbyPayRequest) && (screen2 instanceof PaymentScreens.NearbyPaymentKeypad)) {
                    return inFromBottom;
                }
                if ((screen instanceof PaymentScreens.NearbyPaymentKeypad) && (screen2 instanceof PaymentScreens.NearbyPayRequest)) {
                    return outToBottom;
                }
                return null;
            }
            if (screen instanceof ProfileScreens.ProfileScreen) {
                return pushRight;
            }
            if (!(screen instanceof MoveBitcoinScreen)) {
                return inFromBottom;
            }
        }
        return pushLeft;
    }
}
