package androidx.compose.ui.graphics;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import app.cash.broadway.screen.Screen;
import app.cash.history.screens.HistoryScreens;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.banking.views.BankingDialog$$ExternalSyntheticLambda1;
import com.squareup.cash.bitcoin.viewmodels.applet.autoinvest.BitcoinHomeAutoInvestWidgetViewModel;
import com.squareup.cash.borrow.views.BorrowHomeOverlayKt$BorrowHomeOverlay$1$1$3;
import com.squareup.cash.globalsearch.screens.GlobalSearchScreen;
import com.squareup.cash.investingcrypto.viewmodels.common.InvestingCryptoRecurringPurchaseTileViewModel;
import com.squareup.cash.merchant.screens.MerchantScreen$MerchantProfileScreen;
import com.squareup.cash.offers.screens.OffersScreen$OffersFullscreenCollectionScreen;
import com.squareup.cash.offers.screens.OffersScreen$OffersHomeScreen;
import com.squareup.cash.shopping.screens.ShoppingWebScreen;
import com.squareup.cash.treehouse.android.broadway.TreehouseScreen;
import com.squareup.cash.wallet.screens.WalletHomeScreen;
import com.squareup.protos.cash.cashsuggest.api.OfferSheetKey;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public abstract class PathOperation {
    public static final void BitcoinAutoInvestWidgetView(BitcoinHomeAutoInvestWidgetViewModel bitcoinHomeAutoInvestWidgetViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        bitcoinHomeAutoInvestWidgetViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(868298389);
        int i2 = (gapComposer.changed(bitcoinHomeAutoInvestWidgetViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changed(modifier) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            InvestingCryptoRecurringPurchaseTileViewModel investingCryptoRecurringPurchaseTileViewModel = bitcoinHomeAutoInvestWidgetViewModel.viewModel;
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new BorrowHomeOverlayKt$BorrowHomeOverlay$1$1$3(5, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            PointMode.BitcoinRecurringPurchaseTileView(investingCryptoRecurringPurchaseTileViewModel, (Function1) rememberedValue, modifier, gapComposer, i2 & 896);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BankingDialog$$ExternalSyntheticLambda1((Object) bitcoinHomeAutoInvestWidgetViewModel, function1, (Object) modifier, i, 26);
        }
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m706equalsimpl0(int i, int i2) {
        return i == i2;
    }

    public static final OfferSheetKey.PresentingContext toPresentingContext(Screen screen) {
        screen.getClass();
        if (screen instanceof ShoppingWebScreen) {
            return OfferSheetKey.PresentingContext.IN_APP_BROWSER;
        }
        if ((screen instanceof GlobalSearchScreen) || (screen instanceof HistoryScreens) || (screen instanceof MerchantScreen$MerchantProfileScreen) || (screen instanceof OffersScreen$OffersFullscreenCollectionScreen) || (screen instanceof OffersScreen$OffersHomeScreen) || (screen instanceof TreehouseScreen) || (screen instanceof WalletHomeScreen)) {
            return OfferSheetKey.PresentingContext.DEFAULT;
        }
        a$$ExternalSyntheticBUOutline0.m$3("unknown parent screen");
        return null;
    }
}
