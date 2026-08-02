package com.squareup.cash.clientrouting.routers.bitcoin;

import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.screen.Screen;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.bitcoin.navigation.BitcoinInboundNavigator;
import com.squareup.cash.bitcoin.navigation.RealBitcoinInboundNavigator;
import com.squareup.cash.bitcoin.navigation.RealBitcoinInboundNavigator$Factory$Impl;
import com.squareup.cash.bitcoin.navigation.model.BitcoinPartnerAction;
import com.squareup.cash.bitcoin.screens.BitcoinDepositCopyScreen;
import com.squareup.cash.bitcoin.screens.BitcoinDepositsScreen;
import com.squareup.cash.bitcoin.screens.BitcoinHome;
import com.squareup.cash.bitcoin.screens.BitcoinMapScreen;
import com.squareup.cash.bitcoin.screens.BitcoinTransferScreen;
import com.squareup.cash.bitcoin.screens.MoveBitcoinScreen;
import com.squareup.cash.bitcoin.screens.WalletAddressOptionsSheet;
import com.squareup.cash.blockers.scenarioplan.models.ScenarioPlans;
import com.squareup.cash.blockers.scenarioplan.screens.ScenarioPlanScreens;
import com.squareup.cash.cdf.app.AppNavigateOpenSpace;
import com.squareup.cash.cdf.crypto.CryptoSendStart;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientrouting.RealClientRouteRouter$route$1;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.crypto.navigation.CryptoPayment;
import com.squareup.cash.crypto.navigation.CryptoPaymentSource;
import com.squareup.cash.crypto.primitives.CryptoPaymentOrigin;
import com.squareup.cash.crypto.scenarioplans.models.ConfirmBitcoinDepositIntentScenarioPlanInput;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.multiplatform.bitcoin.parsers.BitcoinPayments;
import com.squareup.cash.multiplatform.bitcoin.parsers.LightningInvoice;
import com.squareup.cash.multiplatform.bitcoin.parsers.LightningPrefixes;
import com.squareup.cash.screens.blockers.AmountSheetSavedState;
import com.squareup.protos.cash.bitcoin.BitcoinBuyClientRouteParams;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.wire.ProtoAdapter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.text.StringsKt__StringsJVMKt;
import okhttp3.HttpUrl;
import okio.ByteString;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class BitcoinRouter {
    public final Analytics analytics;
    public final RealBitcoinInboundNavigator bitcoinInboundNavigator;
    public final CoroutineContext computationContext;
    public final MoneyFormatter moneyFormatter;
    public final Navigator navigator;

    public BitcoinRouter(RealBitcoinInboundNavigator$Factory$Impl realBitcoinInboundNavigator$Factory$Impl, Analytics analytics, LocalizedMoneyFormatter.Factory factory, CoroutineContext coroutineContext, Navigator navigator) {
        navigator.getClass();
        this.analytics = analytics;
        this.computationContext = coroutineContext;
        this.navigator = navigator;
        this.moneyFormatter = factory.createNoSymbol();
        this.bitcoinInboundNavigator = realBitcoinInboundNavigator$Factory$Impl.create(navigator);
    }

    public final void navigateToBitcoinBuyScreen(Money money, String str, RoutingParams routingParams, boolean z) {
        RoutingParams.DeepLinkMetadata deepLinkMetadata = routingParams.deepLinkMetadata;
        RealBitcoinInboundNavigator realBitcoinInboundNavigator = this.bitcoinInboundNavigator;
        if (deepLinkMetadata != null || z) {
            BitcoinInboundNavigator.showBitcoinTab$default(realBitcoinInboundNavigator, deepLinkMetadata != null ? AppNavigateOpenSpace.Source.DEEP_LINK : AppNavigateOpenSpace.Source.CLIENT_ROUTE, 1);
        }
        BitcoinTransferScreen.SavedState savedState = money != null ? new BitcoinTransferScreen.SavedState(new AmountSheetSavedState.AmountKeypadState(StringsKt__StringsJVMKt.replace$default(this.moneyFormatter.format(money), ",", ""))) : null;
        Screen screen = routingParams.exitScreen;
        BitcoinInboundNavigator.showTransferBitcoin$default(realBitcoinInboundNavigator, true, null, savedState, screen == null ? new BitcoinHome(null, null, null, null, 15) : screen, routingParams.origin, str, 26);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void route(ClientRoute.InitiateBitcoinPartnerAction initiateBitcoinPartnerAction, RoutingParams routingParams) {
        BitcoinPartnerAction bitcoinPartnerAction;
        RoutingParams.DeepLinkMetadata deepLinkMetadata;
        String str;
        HttpUrl httpUrl;
        String str2;
        initiateBitcoinPartnerAction.getClass();
        routingParams.getClass();
        String str3 = initiateBitcoinPartnerAction.action;
        int hashCode = str3.hashCode();
        String str4 = null;
        if (hashCode != 97926) {
            if (hashCode != 3526482) {
                str2 = hashCode == 1280882667 ? "transfer" : "buy";
            } else if (str3.equals("sell")) {
                bitcoinPartnerAction = BitcoinPartnerAction.SELL;
                deepLinkMetadata = routingParams.deepLinkMetadata;
                if (deepLinkMetadata != null && (str = deepLinkMetadata.originalUrl) != null) {
                    try {
                        HttpUrl.Builder builder = new HttpUrl.Builder();
                        builder.parse$okhttp(null, str);
                        httpUrl = builder.build();
                    } catch (IllegalArgumentException unused) {
                        httpUrl = null;
                    }
                    if (httpUrl != null) {
                        str4 = httpUrl.queryParameter("partner");
                    }
                }
                if (bitcoinPartnerAction == null) {
                    Timber.Forest.w("Unsupported bitcoin partner action value: ".concat(str3), new Object[0]);
                    return;
                }
                String str5 = initiateBitcoinPartnerAction.token;
                RealBitcoinInboundNavigator realBitcoinInboundNavigator = this.bitcoinInboundNavigator;
                realBitcoinInboundNavigator.getClass();
                int ordinal = bitcoinPartnerAction.ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        realBitcoinInboundNavigator.navigator.goTo(new ScenarioPlanScreens.ScenarioPlanLoadingScreen(ScenarioPlans.CONFIRM_BITCOIN_DEPOSIT_INTENT, new ConfirmBitcoinDepositIntentScenarioPlanInput(str5, str4), new BitcoinHome(null, null, null, null, 15), ColorModel.Bitcoin.INSTANCE));
                        return;
                    } else {
                        if (ordinal == 2) {
                            return;
                        }
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                }
                return;
            }
            bitcoinPartnerAction = null;
            deepLinkMetadata = routingParams.deepLinkMetadata;
            if (deepLinkMetadata != null) {
                HttpUrl.Builder builder2 = new HttpUrl.Builder();
                builder2.parse$okhttp(null, str);
                httpUrl = builder2.build();
                if (httpUrl != null) {
                }
            }
            if (bitcoinPartnerAction == null) {
            }
        }
        str3.equals(str2);
        bitcoinPartnerAction = null;
        deepLinkMetadata = routingParams.deepLinkMetadata;
        if (deepLinkMetadata != null) {
        }
        if (bitcoinPartnerAction == null) {
        }
    }

    public final Object route$1(RealClientRouteRouter$route$1 realClientRouteRouter$route$1) {
        Object showAutoInvest = this.bitcoinInboundNavigator.showAutoInvest(realClientRouteRouter$route$1);
        return showAutoInvest == CoroutineSingletons.COROUTINE_SUSPENDED ? showAutoInvest : Unit.INSTANCE;
    }

    public final void route(ClientRoute.ViewBitcoin viewBitcoin) {
        viewBitcoin.getClass();
        BitcoinInboundNavigator.showBitcoinTab$default(this.bitcoinInboundNavigator, null, 3);
    }

    public final void route(ClientRoute.ViewSendBitcoin viewSendBitcoin) {
        viewSendBitcoin.getClass();
        this.analytics.track(new CryptoSendStart(CryptoSendStart.CryptoSendStartSource.DEEP_LINK), null);
        CryptoPaymentOrigin cryptoPaymentOrigin = CryptoPaymentOrigin.BITCOIN_TAB;
        RealBitcoinInboundNavigator realBitcoinInboundNavigator = this.bitcoinInboundNavigator;
        realBitcoinInboundNavigator.getClass();
        realBitcoinInboundNavigator.navigator.goTo(new MoveBitcoinScreen(cryptoPaymentOrigin));
    }

    public final void route(ClientRoute.ViewBitcoinInvoice viewBitcoinInvoice) {
        viewBitcoinInvoice.getClass();
        this.bitcoinInboundNavigator.viewBitcoinInvoice(new CryptoPayment.InvoiceIdPayment(viewBitcoinInvoice.invoiceId, null));
    }

    public final void route(ClientRoute.ViewBitcoinDeposit viewBitcoinDeposit) {
        Screen screen;
        viewBitcoinDeposit.getClass();
        this.navigator.goTo(new BitcoinHome(null, null, null, null, 15));
        RealBitcoinInboundNavigator realBitcoinInboundNavigator = this.bitcoinInboundNavigator;
        if (realBitcoinInboundNavigator.isLightningDepositEnabled()) {
            screen = new BitcoinDepositCopyScreen(null);
        } else {
            screen = WalletAddressOptionsSheet.INSTANCE;
        }
        realBitcoinInboundNavigator.navigator.goTo(screen);
    }

    public final void route(ClientRoute.ViewBitcoinLightningDeposit viewBitcoinLightningDeposit) {
        Screen screen;
        viewBitcoinLightningDeposit.getClass();
        CryptoPaymentOrigin cryptoPaymentOrigin = CryptoPaymentOrigin.BITCOIN_TAB;
        Money money = new Money((Long) 0L, CurrencyCode.BTC, 4);
        RealBitcoinInboundNavigator realBitcoinInboundNavigator = this.bitcoinInboundNavigator;
        realBitcoinInboundNavigator.getClass();
        if (realBitcoinInboundNavigator.isLightningDepositEnabled()) {
            screen = new BitcoinDepositsScreen(cryptoPaymentOrigin, money);
        } else {
            screen = WalletAddressOptionsSheet.INSTANCE;
        }
        realBitcoinInboundNavigator.navigator.goTo(screen);
    }

    public final void route(ClientRoute.InitiateBitcoinTransferDeprecated initiateBitcoinTransferDeprecated) {
        initiateBitcoinTransferDeprecated.getClass();
        this.analytics.track(new CryptoSendStart(CryptoSendStart.CryptoSendStartSource.DEEP_LINK), null);
        this.bitcoinInboundNavigator.viewBitcoinInvoice(new CryptoPayment.TokenPayment(initiateBitcoinTransferDeprecated.token, null));
    }

    public final void route(ClientRoute.PayLightningInvoice payLightningInvoice) {
        payLightningInvoice.getClass();
        this.bitcoinInboundNavigator.viewBitcoinInvoice(new CryptoPayment.InvoicePayment(new BitcoinPayments.Lightning(new LightningInvoice.Invoice(LightningPrefixes.BTC_MAINNET, payLightningInvoice.invoice)), CryptoPaymentSource.DEEP_LINK, (Money) null, 12));
    }

    public final void route(ClientRoute.ViewBitcoinBuy viewBitcoinBuy, RoutingParams routingParams) {
        viewBitcoinBuy.getClass();
        routingParams.getClass();
        navigateToBitcoinBuyScreen(null, null, routingParams, false);
    }

    public final Unit route(ClientRoute.ViewBitcoinBuyWithParams viewBitcoinBuyWithParams, RoutingParams routingParams) {
        ProtoAdapter protoAdapter = BitcoinBuyClientRouteParams.ADAPTER;
        ByteString.Companion companion = ByteString.Companion;
        ByteString decodeBase64 = ByteString.Companion.decodeBase64(viewBitcoinBuyWithParams.bitcoinBuyClientRouteEncodedParams);
        Money money = null;
        if (decodeBase64 != null) {
            BitcoinBuyClientRouteParams bitcoinBuyClientRouteParams = (BitcoinBuyClientRouteParams) protoAdapter.decode(decodeBase64);
            Money money2 = bitcoinBuyClientRouteParams.amount;
            if (money2 != null) {
                Long l = money2.amount;
                l.getClass();
                if (l.longValue() > 0) {
                    money = money2;
                }
            }
            navigateToBitcoinBuyScreen(money, bitcoinBuyClientRouteParams.instrument_token, routingParams, true);
            return Unit.INSTANCE;
        }
        a$$ExternalSyntheticBUOutline0.m$3("Failed to decode base64 bitcoin buy client route params");
        return null;
    }

    public final Object route(RealClientRouteRouter$route$1 realClientRouteRouter$route$1) {
        Object showBitcoinMap = this.bitcoinInboundNavigator.showBitcoinMap(BitcoinMapScreen.Source.CLIENT_ROUTE, realClientRouteRouter$route$1);
        return showBitcoinMap == CoroutineSingletons.COROUTINE_SUSPENDED ? showBitcoinMap : Unit.INSTANCE;
    }

    public final void route(ClientRoute.ViewBitcoinSell viewBitcoinSell, RoutingParams routingParams) {
        viewBitcoinSell.getClass();
        routingParams.getClass();
        RoutingParams.DeepLinkMetadata deepLinkMetadata = routingParams.deepLinkMetadata;
        RealBitcoinInboundNavigator realBitcoinInboundNavigator = this.bitcoinInboundNavigator;
        if (deepLinkMetadata != null) {
            BitcoinInboundNavigator.showBitcoinTab$default(realBitcoinInboundNavigator, AppNavigateOpenSpace.Source.DEEP_LINK, 1);
        }
        Screen screen = routingParams.exitScreen;
        BitcoinInboundNavigator.showTransferBitcoin$default(realBitcoinInboundNavigator, false, null, null, screen == null ? new BitcoinHome(null, null, null, null, 15) : screen, routingParams.origin, null, EnumC0170g.SDK_ASSET_ICON_CHECKMARK_GRAY_VALUE);
    }
}
