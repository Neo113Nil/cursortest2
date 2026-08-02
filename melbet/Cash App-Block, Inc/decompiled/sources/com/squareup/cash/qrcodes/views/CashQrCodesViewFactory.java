package com.squareup.cash.qrcodes.views;

import android.content.Context;
import android.view.ViewGroup;
import app.cash.broadway.screen.Screen;
import app.cash.broadway.ui.ViewFactory;
import app.cash.broadway.ui.compose.ComposeUiView;
import com.squareup.cash.crypto.common.screens.CryptoCommonScreens;
import com.squareup.cash.crypto.common.views.BitcoinP2pConversionPercentageView;
import com.squareup.cash.crypto.common.views.CryptoCommonInsufficientFundsView;
import com.squareup.cash.qrcodes.screens.CashQrCodeScanner;
import com.squareup.cash.qrcodes.screens.CashQrShortcutsOnboardingSheet;
import com.squareup.cash.qrcodes.screens.CashtagQrScanScreen;
import com.squareup.cash.qrcodes.screens.QrCodeScreen;
import com.squareup.cash.qrcodes.screens.TeenQrCodeScreen;
import com.squareup.cash.shopping.views.ProductSearchView;
import com.squareup.cash.ui.util.RealCashVibrator;
import defpackage.Drop$$ExternalSyntheticBUOutline0;

/* loaded from: classes.dex */
public final class CashQrCodesViewFactory implements ViewFactory {
    public final /* synthetic */ int $r8$classId;
    public final RealCashVibrator cashVibrator;

    public /* synthetic */ CashQrCodesViewFactory(RealCashVibrator realCashVibrator, int i) {
        this.$r8$classId = i;
        this.cashVibrator = realCashVibrator;
    }

    @Override // app.cash.broadway.ui.ViewFactory
    public final ViewFactory.ScreenView createView(Screen screen, Context context, ViewGroup viewGroup) {
        ComposeUiView cashQrShortcutsOnboardingView;
        ComposeUiView productSearchView;
        int i = this.$r8$classId;
        RealCashVibrator realCashVibrator = this.cashVibrator;
        context.getClass();
        switch (i) {
            case 0:
                if (screen instanceof CashQrCodeScanner) {
                    cashQrShortcutsOnboardingView = new CashQrCameraXScannerView(context, realCashVibrator);
                } else if (screen instanceof CashtagQrScanScreen) {
                    cashQrShortcutsOnboardingView = new CashtagQrScanView(context);
                } else if (screen instanceof QrCodeScreen) {
                    cashQrShortcutsOnboardingView = new QrCodeProfileView(context);
                } else if (screen instanceof TeenQrCodeScreen) {
                    cashQrShortcutsOnboardingView = new QrCodeProfileView(context);
                } else {
                    if (!(screen instanceof CashQrShortcutsOnboardingSheet)) {
                        return null;
                    }
                    cashQrShortcutsOnboardingView = new CashQrShortcutsOnboardingView(context);
                }
                return new ViewFactory.ScreenView(cashQrShortcutsOnboardingView, cashQrShortcutsOnboardingView);
            default:
                if (!(screen instanceof CryptoCommonScreens)) {
                    return null;
                }
                CryptoCommonScreens cryptoCommonScreens = (CryptoCommonScreens) screen;
                if (cryptoCommonScreens instanceof CryptoCommonScreens.CryptoCommonInsufficientFunds) {
                    productSearchView = new CryptoCommonInsufficientFundsView(context);
                } else if (cryptoCommonScreens instanceof CryptoCommonScreens.BitcoinP2pConversionPercentageScreen) {
                    productSearchView = new BitcoinP2pConversionPercentageView(context);
                } else {
                    if (!(cryptoCommonScreens instanceof CryptoCommonScreens.BitcoinP2pConversionCustomPercentageScreen)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    productSearchView = new ProductSearchView(context, realCashVibrator);
                }
                return new ViewFactory.ScreenView(productSearchView, productSearchView);
        }
    }
}
