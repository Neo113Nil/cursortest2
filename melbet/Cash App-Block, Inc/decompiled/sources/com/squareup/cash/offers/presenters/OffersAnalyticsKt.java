package com.squareup.cash.offers.presenters;

import android.graphics.PathMeasure;
import androidx.compose.ui.graphics.AndroidPathMeasure;
import app.cash.broadway.screen.Screen;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.cdf.offers.AppLocation;
import com.squareup.cash.globalsearch.screens.GlobalSearchScreen;
import com.squareup.cash.merchant.screens.MerchantScreen$MerchantProfileScreen;
import com.squareup.cash.multiplatform.bitcoin.parsers.BitcoinAddress;
import com.squareup.cash.multiplatform.bitcoin.parsers.BitcoinNetwork;
import com.squareup.cash.multiplatform.bitcoin.parsers.BitcoinPayment;
import com.squareup.cash.multiplatform.bitcoin.parsers.BitcoinPayments;
import com.squareup.cash.multiplatform.bitcoin.parsers.LightningInvoice;
import com.squareup.cash.multiplatform.bitcoin.parsers.LightningPrefixes;
import com.squareup.cash.offers.screens.OffersScreen$OffersFullscreenCollectionScreen;
import com.squareup.cash.offers.screens.OffersScreen$OffersHomeScreen;
import com.squareup.cash.shopping.screens.ShoppingWebScreen;
import com.squareup.cash.treehouse.android.broadway.TreehouseScreen;
import com.squareup.cash.wallet.screens.WalletHomeScreen;
import com.squareup.protos.cash.cryptosparky.api.deposits.GenerateLightningInvoice$Response;

/* loaded from: classes6.dex */
public abstract class OffersAnalyticsKt {
    public static final AndroidPathMeasure PathMeasure() {
        return new AndroidPathMeasure(new PathMeasure());
    }

    public static final AppLocation toAppLocation(Screen screen, String str) {
        screen.getClass();
        if (screen instanceof ShoppingWebScreen) {
            return AppLocation.Browser;
        }
        if (screen instanceof WalletHomeScreen) {
            return AppLocation.CardTab;
        }
        if (screen instanceof GlobalSearchScreen) {
            return str != null ? AppLocation.DiscoverSearch : AppLocation.Discover;
        }
        if (screen instanceof MerchantScreen$MerchantProfileScreen) {
            return AppLocation.MerchantProfile;
        }
        if ((screen instanceof OffersScreen$OffersHomeScreen) || (screen instanceof OffersScreen$OffersFullscreenCollectionScreen)) {
            return AppLocation.OffersTab;
        }
        if (screen instanceof TreehouseScreen) {
            return AppLocation.ActivityTab;
        }
        return null;
    }

    public static final BitcoinPayments toBitcoinInvoice(GenerateLightningInvoice$Response generateLightningInvoice$Response) {
        generateLightningInvoice$Response.getClass();
        String str = generateLightningInvoice$Response.deposit_address;
        String str2 = generateLightningInvoice$Response.payment_request;
        if (str != null) {
            String str3 = generateLightningInvoice$Response.unified_address;
            str3.getClass();
            str.getClass();
            return new BitcoinPayments.Bitcoin(new BitcoinPayment(str3, (BitcoinAddress) new BitcoinAddress.NativeSegwitAddress(str, BitcoinNetwork.MAINNET), false, (LightningInvoice) (str2 != null ? new LightningInvoice.Invoice(LightningPrefixes.BTC_MAINNET, str2) : null), (Long) null, 48));
        }
        if (str2 != null) {
            return new BitcoinPayments.Lightning(new LightningInvoice.Invoice(LightningPrefixes.BTC_MAINNET, str2));
        }
        a$$ExternalSyntheticBUOutline0.m$3("Expected an on-chain address or a lightning invoice");
        return null;
    }
}
