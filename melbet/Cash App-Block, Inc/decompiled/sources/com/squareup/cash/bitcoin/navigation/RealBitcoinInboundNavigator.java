package com.squareup.cash.bitcoin.navigation;

import app.cash.broadway.navigation.Navigator;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.tasks.zzr;
import com.squareup.cash.bitcoin.capability.RealBitcoinCapabilityProvider;
import com.squareup.cash.bitcoin.screens.BitcoinInvoiceEntryScreen;
import com.squareup.cash.bitcoin.screens.BitcoinMapOnboardingScreen;
import com.squareup.cash.bitcoin.screens.BitcoinMapScreen;
import com.squareup.cash.bitcoin.screens.BitcoinQrCodeScannerScreen;
import com.squareup.cash.bitcoin.screens.BitcoinStackingToolsInfoScreen;
import com.squareup.cash.cdf.crypto.CryptoSendOpenQrScanner;
import com.squareup.cash.crypto.backend.autoinvest.CryptoAutoInvest;
import com.squareup.cash.crypto.backend.autoinvest.CryptoAutoInvestRepo;
import com.squareup.cash.crypto.backend.autoinvest.RealCryptoAutoInvestRepo;
import com.squareup.cash.crypto.backend.autoinvest.RealCryptoAutoInvestRepo$special$$inlined$map$1;
import com.squareup.cash.crypto.navigation.CryptoPayment;
import com.squareup.cash.crypto.primitives.CryptoPaymentOrigin;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledUnassignedFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlag$MarketCapabilityMigrationFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$BitcoinLightningInvoiceDeposit;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$BitcoinLnDepositMcfMigration;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$LightningMcfMigrationLogging;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.growtools.presenters.manager.state.RealGrowToolsManagerViewAppearanceTracker;
import com.squareup.cash.growtools.screens.GrowToolsManagerScreen;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.marketcapabilities.MarketCapabilityAvailability;
import com.squareup.cash.marketcapabilities.MarketCapabilityName;
import com.squareup.cash.marketcapabilities.RealMarketCapabilitiesManager;
import com.squareup.cash.marketcapabilities.bitcoin.LnMcfMigrationError;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.preferences.KeyValue;
import com.squareup.protos.common.Money;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class RealBitcoinInboundNavigator implements BitcoinInboundNavigator {
    public final Analytics analytics;
    public final CryptoAutoInvestRepo cryptoAutoInvestRepo;
    public final FeatureFlagManager featureFlagManager;
    public final RealGrowToolsManagerViewAppearanceTracker growToolsManagerViewAppearanceTracker;
    public final KeyValue hasAcceptedBtcMapOnboardingScreen;
    public final RealMarketCapabilitiesManager marketCapabilitiesManager;
    public final Navigator navigator;

    public RealBitcoinInboundNavigator(Analytics analytics, FeatureFlagManager featureFlagManager, RealBitcoinCapabilityProvider realBitcoinCapabilityProvider, RealMarketCapabilitiesManager realMarketCapabilitiesManager, CryptoAutoInvestRepo cryptoAutoInvestRepo, RealGrowToolsManagerViewAppearanceTracker realGrowToolsManagerViewAppearanceTracker, KeyValue keyValue, Navigator navigator) {
        navigator.getClass();
        this.analytics = analytics;
        this.featureFlagManager = featureFlagManager;
        this.marketCapabilitiesManager = realMarketCapabilitiesManager;
        this.cryptoAutoInvestRepo = cryptoAutoInvestRepo;
        this.growToolsManagerViewAppearanceTracker = realGrowToolsManagerViewAppearanceTracker;
        this.hasAcceptedBtcMapOnboardingScreen = keyValue;
        this.navigator = navigator;
    }

    public final boolean isLightningDepositEnabled() {
        MarketCapabilityName marketCapabilityName = MarketCapabilityName.CRYPTO_BITCOIN_LIGHTNING_DEPOSIT;
        LaunchDarklyFeatureFlags$BitcoinLnDepositMcfMigration launchDarklyFeatureFlags$BitcoinLnDepositMcfMigration = LaunchDarklyFeatureFlags$BitcoinLnDepositMcfMigration.INSTANCE;
        RealFeatureFlagManager realFeatureFlagManager = (RealFeatureFlagManager) this.featureFlagManager;
        FeatureFlag$MarketCapabilityMigrationFeatureFlag$Options featureFlag$MarketCapabilityMigrationFeatureFlag$Options = (FeatureFlag$MarketCapabilityMigrationFeatureFlag$Options) realFeatureFlagManager.peekCurrentValue(launchDarklyFeatureFlags$BitcoinLnDepositMcfMigration);
        featureFlag$MarketCapabilityMigrationFeatureFlag$Options.getClass();
        boolean z = featureFlag$MarketCapabilityMigrationFeatureFlag$Options == FeatureFlag$MarketCapabilityMigrationFeatureFlag$Options.UseMarketCapability;
        boolean enabled = ((FeatureFlag$EnabledDisabledUnassignedFeatureFlag$Options) realFeatureFlagManager.peekCurrentValue(LaunchDarklyFeatureFlags$BitcoinLightningInvoiceDeposit.INSTANCE)).enabled();
        RealMarketCapabilitiesManager realMarketCapabilitiesManager = this.marketCapabilitiesManager;
        MarketCapabilityAvailability currentAvailability = realMarketCapabilitiesManager.currentAvailability(marketCapabilityName);
        zzr zzrVar = realMarketCapabilitiesManager.lnMcfMigrationLogger;
        boolean isAvailable = currentAvailability != null ? currentAvailability.isAvailable() : false;
        FeatureFlag$EnabledDisabledFeatureFlag$Options featureFlag$EnabledDisabledFeatureFlag$Options = (FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) ((FeatureFlagManager) zzrVar.zza)).peekCurrentValue(LaunchDarklyFeatureFlags$LightningMcfMigrationLogging.INSTANCE);
        featureFlag$EnabledDisabledFeatureFlag$Options.getClass();
        if (featureFlag$EnabledDisabledFeatureFlag$Options != FeatureFlag$EnabledDisabledFeatureFlag$Options.Disabled && isAvailable != enabled && !zzrVar.zzc) {
            zzrVar.zzc = true;
            ((ErrorReporter) zzrVar.zzb).report(new LnMcfMigrationError(isAvailable, enabled), ErrorReporter.DefaultSamplingStrategy.INSTANCE);
        }
        return (z && currentAvailability != null) ? currentAvailability.isAvailable() : enabled;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x004d, code lost:
    
        if (r9 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object showAutoInvest(ContinuationImpl continuationImpl) {
        RealBitcoinInboundNavigator$showAutoInvest$1 realBitcoinInboundNavigator$showAutoInvest$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        Object hasTracked;
        CryptoAutoInvest cryptoAutoInvest;
        String str;
        Navigator navigator;
        if (continuationImpl instanceof RealBitcoinInboundNavigator$showAutoInvest$1) {
            realBitcoinInboundNavigator$showAutoInvest$1 = (RealBitcoinInboundNavigator$showAutoInvest$1) continuationImpl;
            int i2 = realBitcoinInboundNavigator$showAutoInvest$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realBitcoinInboundNavigator$showAutoInvest$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realBitcoinInboundNavigator$showAutoInvest$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realBitcoinInboundNavigator$showAutoInvest$1.label;
                int i3 = 1;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealCryptoAutoInvestRepo realCryptoAutoInvestRepo = (RealCryptoAutoInvestRepo) this.cryptoAutoInvestRepo;
                    RealCryptoAutoInvestRepo$special$$inlined$map$1 realCryptoAutoInvestRepo$special$$inlined$map$1 = new RealCryptoAutoInvestRepo$special$$inlined$map$1(realCryptoAutoInvestRepo.getPreferenceQuery(), realCryptoAutoInvestRepo, i3);
                    realBitcoinInboundNavigator$showAutoInvest$1.label = 1;
                    obj = FlowKt.firstOrNull(realCryptoAutoInvestRepo$special$$inlined$map$1, realBitcoinInboundNavigator$showAutoInvest$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        cryptoAutoInvest = realBitcoinInboundNavigator$showAutoInvest$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        str = cryptoAutoInvest != null ? cryptoAutoInvest.recurringId : null;
                        navigator = this.navigator;
                        if (str == null || booleanValue) {
                            navigator.goTo(new GrowToolsManagerScreen.ManageAutoInvestScreen(GrowToolsManagerScreen.Origin.BITCOIN));
                        } else {
                            navigator.goTo(new BitcoinStackingToolsInfoScreen(BitcoinStackingToolsInfoScreen.Type.AUTO_INVEST));
                        }
                        return Unit.INSTANCE;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                CryptoAutoInvest cryptoAutoInvest2 = (CryptoAutoInvest) obj;
                GrowToolsManagerScreen.Origin origin = GrowToolsManagerScreen.Origin.BITCOIN;
                GrowToolsManagerScreen.InvestmentType investmentType = GrowToolsManagerScreen.InvestmentType.AUTO_INVEST;
                realBitcoinInboundNavigator$showAutoInvest$1.L$0 = cryptoAutoInvest2;
                realBitcoinInboundNavigator$showAutoInvest$1.label = 2;
                hasTracked = this.growToolsManagerViewAppearanceTracker.hasTracked(origin, investmentType, realBitcoinInboundNavigator$showAutoInvest$1);
                if (hasTracked != coroutineSingletons) {
                    cryptoAutoInvest = cryptoAutoInvest2;
                    obj = hasTracked;
                    boolean booleanValue2 = ((Boolean) obj).booleanValue();
                    if (cryptoAutoInvest != null) {
                    }
                    navigator = this.navigator;
                    if (str == null) {
                    }
                    navigator.goTo(new GrowToolsManagerScreen.ManageAutoInvestScreen(GrowToolsManagerScreen.Origin.BITCOIN));
                    return Unit.INSTANCE;
                }
                return coroutineSingletons;
            }
        }
        realBitcoinInboundNavigator$showAutoInvest$1 = new RealBitcoinInboundNavigator$showAutoInvest$1(this, continuationImpl);
        Object obj2 = realBitcoinInboundNavigator$showAutoInvest$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realBitcoinInboundNavigator$showAutoInvest$1.label;
        int i32 = 1;
        if (i != 0) {
        }
        CryptoAutoInvest cryptoAutoInvest22 = (CryptoAutoInvest) obj2;
        GrowToolsManagerScreen.Origin origin2 = GrowToolsManagerScreen.Origin.BITCOIN;
        GrowToolsManagerScreen.InvestmentType investmentType2 = GrowToolsManagerScreen.InvestmentType.AUTO_INVEST;
        realBitcoinInboundNavigator$showAutoInvest$1.L$0 = cryptoAutoInvest22;
        realBitcoinInboundNavigator$showAutoInvest$1.label = 2;
        hasTracked = this.growToolsManagerViewAppearanceTracker.hasTracked(origin2, investmentType2, realBitcoinInboundNavigator$showAutoInvest$1);
        if (hasTracked != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object showBitcoinMap(BitcoinMapScreen.Source source, ContinuationImpl continuationImpl) {
        RealBitcoinInboundNavigator$showBitcoinMap$1 realBitcoinInboundNavigator$showBitcoinMap$1;
        int i;
        boolean booleanValue;
        if (continuationImpl instanceof RealBitcoinInboundNavigator$showBitcoinMap$1) {
            realBitcoinInboundNavigator$showBitcoinMap$1 = (RealBitcoinInboundNavigator$showBitcoinMap$1) continuationImpl;
            int i2 = realBitcoinInboundNavigator$showBitcoinMap$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realBitcoinInboundNavigator$showBitcoinMap$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realBitcoinInboundNavigator$showBitcoinMap$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realBitcoinInboundNavigator$showBitcoinMap$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    realBitcoinInboundNavigator$showBitcoinMap$1.L$0 = source;
                    realBitcoinInboundNavigator$showBitcoinMap$1.label = 1;
                    obj = this.hasAcceptedBtcMapOnboardingScreen.get(realBitcoinInboundNavigator$showBitcoinMap$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    source = realBitcoinInboundNavigator$showBitcoinMap$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                booleanValue = ((Boolean) obj).booleanValue();
                Navigator navigator = this.navigator;
                if (booleanValue) {
                    navigator.goTo(new BitcoinMapOnboardingScreen(source));
                } else {
                    navigator.goTo(new BitcoinMapScreen(source));
                }
                return Unit.INSTANCE;
            }
        }
        realBitcoinInboundNavigator$showBitcoinMap$1 = new RealBitcoinInboundNavigator$showBitcoinMap$1(this, continuationImpl);
        Object obj2 = realBitcoinInboundNavigator$showBitcoinMap$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realBitcoinInboundNavigator$showBitcoinMap$1.label;
        if (i != 0) {
        }
        booleanValue = ((Boolean) obj2).booleanValue();
        Navigator navigator2 = this.navigator;
        if (booleanValue) {
        }
        return Unit.INSTANCE;
    }

    public final void showCryptoScanner(CryptoScannerSource cryptoScannerSource, CryptoPaymentOrigin cryptoPaymentOrigin, Money money) {
        CryptoSendOpenQrScanner.CryptoSendOpenQrScannerSource cryptoSendOpenQrScannerSource;
        cryptoPaymentOrigin.getClass();
        int ordinal = cryptoScannerSource.ordinal();
        if (ordinal == 0) {
            cryptoSendOpenQrScannerSource = CryptoSendOpenQrScanner.CryptoSendOpenQrScannerSource.CRYPTO_TAB_TOOLBAR_SCAN_QR_BUTTON;
        } else {
            if (ordinal != 1) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
            cryptoSendOpenQrScannerSource = CryptoSendOpenQrScanner.CryptoSendOpenQrScannerSource.CRYPTO_AMOUNT_ONLY_SCAN_QR_BUTTON;
        }
        this.analytics.track(new CryptoSendOpenQrScanner(cryptoSendOpenQrScannerSource), null);
        this.navigator.goTo(new BitcoinQrCodeScannerScreen(cryptoPaymentOrigin, money, cryptoScannerSource == CryptoScannerSource.BITCOIN_TAB));
    }

    public final void viewBitcoinInvoice(CryptoPayment cryptoPayment) {
        this.navigator.goTo(new BitcoinInvoiceEntryScreen(cryptoPayment));
    }
}
