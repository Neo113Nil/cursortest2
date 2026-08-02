package com.squareup.cash.advertising.views;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import app.cash.broadway.screen.Screen;
import app.cash.broadway.ui.UiFactory;
import app.cash.broadway.ui.compose.ComposeUiView;
import app.cash.local.views.LocalViewFactory$$ExternalSyntheticLambda4;
import coil3.RealImageLoader;
import com.google.mlkit.vision.text.zzc;
import com.squareup.cash.account.components.AccountUiView;
import com.squareup.cash.account.components.AccountViewFactory$AccountSwitchingEmptyView;
import com.squareup.cash.account.components.ThemeSwitcherView;
import com.squareup.cash.account.components.accountswitcher.AccountsLoadingFailedView;
import com.squareup.cash.account.components.accountswitcher.AddAccountOptionsView;
import com.squareup.cash.account.components.business.BusinessInfoView;
import com.squareup.cash.account.screens.Account;
import com.squareup.cash.account.screens.AccountSwitcherScreen;
import com.squareup.cash.account.screens.AccountsLoadingFailedScreen;
import com.squareup.cash.account.screens.AddAccountScreen;
import com.squareup.cash.account.screens.BusinessInfoScreen;
import com.squareup.cash.account.screens.EditProfile;
import com.squareup.cash.account.screens.SwitchFullAccountLoadingScreen;
import com.squareup.cash.account.screens.ThemeSwitcherScreen;
import com.squareup.cash.advertising.screens.FullscreenAdScreen;
import com.squareup.cash.bitcoin.screens.BitcoinDependentWelcomeScreen;
import com.squareup.cash.bitcoin.screens.BitcoinDepositCopyScreen;
import com.squareup.cash.bitcoin.screens.BitcoinDepositNoteScreen;
import com.squareup.cash.bitcoin.screens.BitcoinDisplayCurrencyScreen;
import com.squareup.cash.bitcoin.screens.BitcoinHome;
import com.squareup.cash.bitcoin.screens.BitcoinInvoiceEntryScreen;
import com.squareup.cash.bitcoin.screens.BitcoinLimitsLoadingScreen;
import com.squareup.cash.bitcoin.screens.BitcoinPerformanceDetailsScreen;
import com.squareup.cash.bitcoin.screens.BitcoinSendReceiveBottomSheetScreen;
import com.squareup.cash.bitcoin.screens.BitcoinStackingToolsInfoScreen;
import com.squareup.cash.bitcoin.screens.BitcoinSymbolLearnMoreSheetScreen;
import com.squareup.cash.bitcoin.screens.BitcoinTransferScreen;
import com.squareup.cash.bitcoin.screens.PaidInBitcoinCardUpsellScreen;
import com.squareup.cash.bitcoin.screens.PaidInBitcoinLandingScreen;
import com.squareup.cash.bitcoin.screens.SatoshiLearnMoreSheetScreen;
import com.squareup.cash.bitcoin.screens.StablecoinDepositCopyScreen;
import com.squareup.cash.bitcoin.screens.WalletAddressOptionsSheet;
import com.squareup.cash.bitcoin.views.BitcoinDisplayCurrencyLearnMoreSymbolView;
import com.squareup.cash.bitcoin.views.BitcoinDisplayCurrencyLearnMoreView;
import com.squareup.cash.bitcoin.views.BitcoinDisplayCurrencyView;
import com.squareup.cash.bitcoin.views.BitcoinInvoiceEntryView;
import com.squareup.cash.bitcoin.views.applet.sendreceive.BitcoinSendReceiveBottomSheetView;
import com.squareup.cash.bitcoin.views.dependents.BitcoinDependentWelcomeScreenView;
import com.squareup.cash.bitcoin.views.deposits.BitcoinDepositNoteScreenView;
import com.squareup.cash.bitcoin.views.deposits.BitcoinDepositNoteScreenView$Factory$Impl;
import com.squareup.cash.bitcoin.views.deposits.copy.BitcoinAddressCopySheetView;
import com.squareup.cash.bitcoin.views.deposits.copy.BitcoinDepositCopySheetView;
import com.squareup.cash.bitcoin.views.limits.BitcoinLimitsLoadingView;
import com.squareup.cash.bitcoin.views.paidinbitcoin.PaidInBitcoinLandingView;
import com.squareup.cash.bitcoin.views.paidinbitcoin.PainInBitcoinUpsellView;
import com.squareup.cash.bitcoin.views.performance.details.BitcoinPerformanceDetailsView;
import com.squareup.cash.bitcoin.views.stablecoin.StablecoinDepositCopyView;
import com.squareup.cash.blockers.views.FileBlockerView;
import com.squareup.cash.bugreporting.screens.BugReportingScreen;
import com.squareup.cash.elementboundsregistry.core.ElementBoundsRegistry;
import com.squareup.cash.formview.components.FormElementViewBuilder$Factory$Impl;
import com.squareup.cash.merchant.views.SquareLoyaltyDetailsView;
import com.squareup.cash.money.views.MoneyUiFactory$$ExternalSyntheticLambda0;
import com.squareup.cash.p2pblocking.views.P2PListView;
import com.squareup.cash.ui.util.RealCashScreenBrightness;

/* loaded from: classes.dex */
public final class AdUiFactory implements UiFactory {
    public final /* synthetic */ int $r8$classId;
    public final Object activityEvents;
    public final RealImageLoader imageLoader;

    public AdUiFactory(BitcoinDepositNoteScreenView$Factory$Impl bitcoinDepositNoteScreenView$Factory$Impl, RealImageLoader realImageLoader) {
        this.$r8$classId = 2;
        this.activityEvents = bitcoinDepositNoteScreenView$Factory$Impl;
        this.imageLoader = realImageLoader;
    }

    @Override // app.cash.broadway.ui.UiFactory
    public final UiFactory.ScreenUi createUi(Screen screen, Context context, ViewGroup viewGroup) {
        ComposeUiView themeSwitcherView;
        ComposeUiView bitcoinLimitsLoadingView;
        int i = this.$r8$classId;
        Object obj = this.activityEvents;
        RealImageLoader realImageLoader = this.imageLoader;
        context.getClass();
        switch (i) {
            case 0:
                if (screen instanceof FullscreenAdScreen) {
                    return new UiFactory.ComposeUi(new ComposableLambdaImpl(new MoneyUiFactory$$ExternalSyntheticLambda0(this, 3), true, 9083073));
                }
                return null;
            case 1:
                if (screen instanceof Account) {
                    themeSwitcherView = new AccountUiView(context, realImageLoader, (ElementBoundsRegistry) obj);
                } else if (screen instanceof EditProfile) {
                    themeSwitcherView = new P2PListView(context, realImageLoader, 1);
                } else if (screen instanceof BusinessInfoScreen) {
                    themeSwitcherView = new BusinessInfoView(context);
                } else if (screen instanceof AccountSwitcherScreen) {
                    themeSwitcherView = new SquareLoyaltyDetailsView(context, realImageLoader, 1);
                } else if (screen instanceof AddAccountScreen) {
                    themeSwitcherView = new AddAccountOptionsView(context);
                } else if (screen instanceof SwitchFullAccountLoadingScreen) {
                    themeSwitcherView = new AccountViewFactory$AccountSwitchingEmptyView(context);
                } else if (screen instanceof AccountsLoadingFailedScreen) {
                    themeSwitcherView = new AccountsLoadingFailedView(context);
                } else {
                    if (!(screen instanceof ThemeSwitcherScreen)) {
                        return null;
                    }
                    themeSwitcherView = new ThemeSwitcherView(context);
                }
                return new UiFactory.ViewUi(themeSwitcherView, themeSwitcherView);
            case 2:
                if (screen instanceof PaidInBitcoinLandingScreen) {
                    bitcoinLimitsLoadingView = new PaidInBitcoinLandingView(context);
                } else if (screen instanceof BitcoinDisplayCurrencyScreen) {
                    bitcoinLimitsLoadingView = new BitcoinDisplayCurrencyView(context);
                } else if (screen instanceof BitcoinDepositNoteScreen) {
                    FileBlockerView.MetroFactory metroFactory = ((BitcoinDepositNoteScreenView$Factory$Impl) obj).delegateFactory;
                    Activity activity = (Activity) metroFactory.activityEvents.value;
                    RealCashScreenBrightness realCashScreenBrightness = (RealCashScreenBrightness) metroFactory.vibrator.invoke();
                    FormElementViewBuilder$Factory$Impl formElementViewBuilder$Factory$Impl = (FormElementViewBuilder$Factory$Impl) metroFactory.permissionManager.invoke();
                    activity.getClass();
                    realCashScreenBrightness.getClass();
                    formElementViewBuilder$Factory$Impl.getClass();
                    bitcoinLimitsLoadingView = new BitcoinDepositNoteScreenView(context, activity, realCashScreenBrightness, formElementViewBuilder$Factory$Impl);
                } else if (screen instanceof BitcoinDepositCopyScreen) {
                    bitcoinLimitsLoadingView = new BitcoinDepositCopySheetView(context);
                } else if (screen instanceof SatoshiLearnMoreSheetScreen) {
                    bitcoinLimitsLoadingView = new BitcoinDisplayCurrencyLearnMoreView(context);
                } else if (screen instanceof BitcoinSymbolLearnMoreSheetScreen) {
                    bitcoinLimitsLoadingView = new BitcoinDisplayCurrencyLearnMoreSymbolView(context);
                } else if (screen instanceof WalletAddressOptionsSheet) {
                    bitcoinLimitsLoadingView = new BitcoinAddressCopySheetView(context);
                } else if (screen instanceof BitcoinInvoiceEntryScreen) {
                    bitcoinLimitsLoadingView = new BitcoinInvoiceEntryView(context);
                } else if (screen instanceof BitcoinHome) {
                    bitcoinLimitsLoadingView = new AccountUiView(context, realImageLoader, new zzc(17));
                } else if (screen instanceof BitcoinSendReceiveBottomSheetScreen) {
                    bitcoinLimitsLoadingView = new BitcoinSendReceiveBottomSheetView(context);
                } else {
                    if (screen instanceof BitcoinTransferScreen) {
                        return new UiFactory.ComposeUi(new ComposableLambdaImpl(new LocalViewFactory$$ExternalSyntheticLambda4(16, this, screen), true, 1259275693));
                    }
                    if (screen instanceof PaidInBitcoinCardUpsellScreen) {
                        bitcoinLimitsLoadingView = new PainInBitcoinUpsellView(context);
                    } else if (screen instanceof BitcoinDependentWelcomeScreen) {
                        bitcoinLimitsLoadingView = new BitcoinDependentWelcomeScreenView(context);
                    } else if (screen instanceof BitcoinStackingToolsInfoScreen) {
                        bitcoinLimitsLoadingView = new P2PListView(realImageLoader, context, 6);
                    } else if (screen instanceof BitcoinPerformanceDetailsScreen) {
                        bitcoinLimitsLoadingView = new BitcoinPerformanceDetailsView(context);
                    } else if (screen instanceof StablecoinDepositCopyScreen) {
                        bitcoinLimitsLoadingView = new StablecoinDepositCopyView(context);
                    } else {
                        if (!(screen instanceof BitcoinLimitsLoadingScreen)) {
                            return null;
                        }
                        bitcoinLimitsLoadingView = new BitcoinLimitsLoadingView(context);
                    }
                }
                return new UiFactory.ViewUi(bitcoinLimitsLoadingView, bitcoinLimitsLoadingView);
            default:
                if (screen instanceof BugReportingScreen) {
                    return new UiFactory.ComposeUi(new ComposableLambdaImpl(new MoneyUiFactory$$ExternalSyntheticLambda0(this, 5), true, -792024557));
                }
                return null;
        }
    }

    public /* synthetic */ AdUiFactory(RealImageLoader realImageLoader, Object obj, int i) {
        this.$r8$classId = i;
        this.imageLoader = realImageLoader;
        this.activityEvents = obj;
    }
}
