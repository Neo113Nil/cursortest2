package com.squareup.cash.bitcoin.presenters.applet.stackingtools;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.draw.RotateKt;
import androidx.compose.ui.draw.ScaleKt;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.local.presenters.LocalAddBrandsPresenter$models$2$1;
import app.cash.paraphrase.FormattedResource;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.squareup.cash.aiedge.MLKitTitleGenerator$prepareModel$1;
import com.squareup.cash.bitcoin.capability.BitcoinCapability;
import com.squareup.cash.bitcoin.capability.RealBitcoinCapabilityProvider;
import com.squareup.cash.bitcoin.navigation.BitcoinInboundNavigator;
import com.squareup.cash.bitcoin.navigation.RealBitcoinInboundNavigator$Factory$Impl;
import com.squareup.cash.bitcoin.presenters.applet.widget.BitcoinHomeWidgetPresenter;
import com.squareup.cash.bitcoin.presenters.investing.RealBitcoinSponsoredStateRepo;
import com.squareup.cash.bitcoin.presenters.paidinbitcoin.PaidInBitcoinState;
import com.squareup.cash.bitcoin.presenters.paidinbitcoin.RealPaidInBitcoinStateManager;
import com.squareup.cash.bitcoin.presenters.paidinbitcoin.navigation.RealPaidInBitcoinNavigator;
import com.squareup.cash.bitcoin.presenters.paidinbitcoin.navigation.RealPaidInBitcoinNavigator$Factory$Impl;
import com.squareup.cash.bitcoin.screens.BitcoinHome;
import com.squareup.cash.bitcoin.screens.BitcoinStackingToolsInfoScreen;
import com.squareup.cash.bitcoin.viewmodels.applet.BitcoinHomeWidgetViewModel;
import com.squareup.cash.bitcoin.viewmodels.applet.stackingtools.BitcoinStackingToolsViewModel;
import com.squareup.cash.card.onboarding.CardModelView$getActiveHeat$lambda$1$$inlined$flatMapLatest$1;
import com.squareup.cash.card.onboarding.CardModelView$iconTexture$$inlined$map$1;
import com.squareup.cash.cdf.crypto.CryptoStackStart;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.RealSyncEntityReader;
import com.squareup.cash.common.moneyformatter.MoneyFormatterConfig;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.crypto.backend.autoinvest.CryptoAutoInvestRepo;
import com.squareup.cash.crypto.backend.autoinvest.RealCryptoAutoInvestRepo;
import com.squareup.cash.crypto.backend.autoinvest.RealCryptoAutoInvestRepo$special$$inlined$map$1;
import com.squareup.cash.crypto.backend.receiveasbitcoin.RealReceiveP2PAsBitcoinRepo;
import com.squareup.cash.crypto.backend.receiveasbitcoin.ReceiveP2PAsBitcoinState;
import com.squareup.cash.crypto.backend.roundups.BitcoinRoundUpsAvailability;
import com.squareup.cash.crypto.backend.roundups.BitcoinRoundUpsUsageStats;
import com.squareup.cash.crypto.backend.roundups.RealBitcoinRoundUpsRepo;
import com.squareup.cash.data.TemporaryStorage;
import com.squareup.cash.featureflags.AmplitudeExperiments$FpBitcoinGrowToolsManager;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$BitcoinReceiveP2pAsBitcoin;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.formview.components.FormCashtag$8$invokeSuspend$$inlined$map$1;
import com.squareup.cash.graphics.swampgl.components.Transform$special$$inlined$map$1;
import com.squareup.cash.growtools.presenters.manager.state.RealGrowToolsManagerViewAppearanceTracker;
import com.squareup.cash.growtools.screens.GrowToolsManagerScreen;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.investing.backend.api.AutoInvestPreference;
import com.squareup.cash.investing.backend.real.autoinvest.RealAutoInvestRepo$Factory$Impl;
import com.squareup.cash.money.presenters.MoneyTabPresenter$models$lambda$17$$inlined$map$1;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.resource.AndroidDateFormatManager;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.util.RealDrawerOpener$getDrawerScreen$$inlined$map$1;
import com.squareup.cash.wallet.data.IssuedCardManager;
import com.squareup.cash.wallet.data.RealIssuedCardManager;
import com.squareup.preferences.KeyValue;
import com.squareup.protos.common.Money;
import com.squareup.protos.repeatedly.common.RecurringSchedule;
import com.squareup.protos.repeatedly.common.ScheduledTransactionPreference;
import com.squareup.util.cash.Countries;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.time.Instant;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StartedWhileSubscribed;
import kotlinx.coroutines.flow.StateFlow;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class BitcoinStackingToolsPresenter implements BitcoinHomeWidgetPresenter {
    public final Analytics analytics;
    public final RealAutoInvestRepo$Factory$Impl autoInvestRepoFactory;
    public final RealBitcoinCapabilityProvider bitcoinCapabilityProvider;
    public final RealBitcoinInboundNavigator$Factory$Impl bitcoinInboundNavigatorFactory;
    public final RealBitcoinRoundUpsRepo bitcoinRoundUpsRepo;
    public final CryptoAutoInvestRepo cryptoAutoInvestRepo;
    public final AndroidDateFormatManager dateFormatManager;
    public final FeatureFlagManager featureFlagManager;
    public final RealGrowToolsManagerViewAppearanceTracker growToolsManagerViewAppearanceTracker;
    public final IssuedCardManager issuedCardManager;
    public final MoneyFormatter moneyFormatter;
    public final RealPaidInBitcoinNavigator$Factory$Impl paidInBitcoinNavigatorFactory;
    public final RealPaidInBitcoinStateManager paidInBitcoinStateManager;
    public final RealReceiveP2PAsBitcoinRepo receiveP2PAsBitcoinRepo;
    public final RealRouter$Factory$Impl routerFactory;
    public final KeyValue showBitcoinStackingToolsLearnMore;
    public final RealBitcoinSponsoredStateRepo sponsoredStateRepo;
    public final AndroidStringManager stringManager;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RecurringSchedule.Frequency.values().length];
            try {
                iArr[RecurringSchedule.Frequency.EVERY_WEEK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RecurringSchedule.Frequency.EVERY_TWO_WEEKS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RecurringSchedule.Frequency.EVERY_DAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[RecurringSchedule.Frequency.EVERY_MONTH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public BitcoinStackingToolsPresenter(AndroidStringManager androidStringManager, RealPaidInBitcoinStateManager realPaidInBitcoinStateManager, RealPaidInBitcoinNavigator$Factory$Impl realPaidInBitcoinNavigator$Factory$Impl, RealBitcoinInboundNavigator$Factory$Impl realBitcoinInboundNavigator$Factory$Impl, RealBitcoinCapabilityProvider realBitcoinCapabilityProvider, RealBitcoinSponsoredStateRepo realBitcoinSponsoredStateRepo, FeatureFlagManager featureFlagManager, CryptoAutoInvestRepo cryptoAutoInvestRepo, RealAutoInvestRepo$Factory$Impl realAutoInvestRepo$Factory$Impl, RealBitcoinRoundUpsRepo realBitcoinRoundUpsRepo, AndroidDateFormatManager androidDateFormatManager, RealRouter$Factory$Impl realRouter$Factory$Impl, Analytics analytics, RealGrowToolsManagerViewAppearanceTracker realGrowToolsManagerViewAppearanceTracker, IssuedCardManager issuedCardManager, RealReceiveP2PAsBitcoinRepo realReceiveP2PAsBitcoinRepo, KeyValue keyValue, LocalizedMoneyFormatter.Factory factory) {
        this.stringManager = androidStringManager;
        this.paidInBitcoinStateManager = realPaidInBitcoinStateManager;
        this.paidInBitcoinNavigatorFactory = realPaidInBitcoinNavigator$Factory$Impl;
        this.bitcoinInboundNavigatorFactory = realBitcoinInboundNavigator$Factory$Impl;
        this.bitcoinCapabilityProvider = realBitcoinCapabilityProvider;
        this.sponsoredStateRepo = realBitcoinSponsoredStateRepo;
        this.featureFlagManager = featureFlagManager;
        this.cryptoAutoInvestRepo = cryptoAutoInvestRepo;
        this.autoInvestRepoFactory = realAutoInvestRepo$Factory$Impl;
        this.bitcoinRoundUpsRepo = realBitcoinRoundUpsRepo;
        this.dateFormatManager = androidDateFormatManager;
        this.routerFactory = realRouter$Factory$Impl;
        this.analytics = analytics;
        this.growToolsManagerViewAppearanceTracker = realGrowToolsManagerViewAppearanceTracker;
        this.issuedCardManager = issuedCardManager;
        this.receiveP2PAsBitcoinRepo = realReceiveP2PAsBitcoinRepo;
        this.showBitcoinStackingToolsLearnMore = keyValue;
        this.moneyFormatter = factory.create(MoneyFormatterConfig.COMPACT);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$roundupsClick(BitcoinStackingToolsPresenter bitcoinStackingToolsPresenter, BetterNavigator.ScreenNavigator screenNavigator, RealRouter realRouter, BitcoinRoundUpsAvailability bitcoinRoundUpsAvailability, boolean z, ContinuationImpl continuationImpl) {
        BitcoinStackingToolsPresenter$roundupsClick$1 bitcoinStackingToolsPresenter$roundupsClick$1;
        Object obj;
        int i;
        if (continuationImpl instanceof BitcoinStackingToolsPresenter$roundupsClick$1) {
            bitcoinStackingToolsPresenter$roundupsClick$1 = (BitcoinStackingToolsPresenter$roundupsClick$1) continuationImpl;
            int i2 = bitcoinStackingToolsPresenter$roundupsClick$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                bitcoinStackingToolsPresenter$roundupsClick$1.label = i2 - PKIFailureInfo.systemUnavail;
                obj = bitcoinStackingToolsPresenter$roundupsClick$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bitcoinStackingToolsPresenter$roundupsClick$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    boolean z2 = bitcoinRoundUpsAvailability instanceof BitcoinRoundUpsAvailability.Available.Bitcoin;
                    ScaleKt.trackStackingToolStartEvent(bitcoinStackingToolsPresenter.analytics, BitcoinStackingToolsInfoScreen.Type.ROUND_UPS, CryptoStackStart.EntryPoint.APPLET, Boolean.valueOf(z2 && ((BitcoinRoundUpsAvailability.Available.Bitcoin) bitcoinRoundUpsAvailability).active));
                    if (!((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) bitcoinStackingToolsPresenter.featureFlagManager).currentValue(AmplitudeExperiments$FpBitcoinGrowToolsManager.INSTANCE)).enabled()) {
                        if (z2 || (bitcoinRoundUpsAvailability instanceof BitcoinRoundUpsAvailability.Available.Other)) {
                            ClientRoute.ViewInvestingRoundups viewInvestingRoundups = new ClientRoute.ViewInvestingRoundups();
                            RoutingParams routingParams = new RoutingParams(new BitcoinHome(null, null, null, null, 15), null, null, null, null, null, 510);
                            realRouter.getClass();
                            realRouter.clientRouteRouter.route(viewInvestingRoundups, routingParams);
                        } else {
                            if (!(bitcoinRoundUpsAvailability instanceof BitcoinRoundUpsAvailability.Unavailable)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            RotateKt.onboardBitcoinRoundUps(screenNavigator, z);
                        }
                        return Unit.INSTANCE;
                    }
                    RealGrowToolsManagerViewAppearanceTracker realGrowToolsManagerViewAppearanceTracker = bitcoinStackingToolsPresenter.growToolsManagerViewAppearanceTracker;
                    GrowToolsManagerScreen.Origin origin = GrowToolsManagerScreen.Origin.BITCOIN;
                    GrowToolsManagerScreen.InvestmentType investmentType = GrowToolsManagerScreen.InvestmentType.ROUND_UPS;
                    bitcoinStackingToolsPresenter$roundupsClick$1.L$0 = screenNavigator;
                    bitcoinStackingToolsPresenter$roundupsClick$1.L$1 = realRouter;
                    bitcoinStackingToolsPresenter$roundupsClick$1.L$2 = bitcoinRoundUpsAvailability;
                    bitcoinStackingToolsPresenter$roundupsClick$1.Z$0 = z;
                    bitcoinStackingToolsPresenter$roundupsClick$1.label = 1;
                    obj = realGrowToolsManagerViewAppearanceTracker.hasTracked(origin, investmentType, bitcoinStackingToolsPresenter$roundupsClick$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = bitcoinStackingToolsPresenter$roundupsClick$1.Z$0;
                    bitcoinRoundUpsAvailability = bitcoinStackingToolsPresenter$roundupsClick$1.L$2;
                    realRouter = bitcoinStackingToolsPresenter$roundupsClick$1.L$1;
                    screenNavigator = bitcoinStackingToolsPresenter$roundupsClick$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                if (!((Boolean) obj).booleanValue()) {
                    screenNavigator.goTo(new GrowToolsManagerScreen.ManageRoundUpsScreen(GrowToolsManagerScreen.Origin.BITCOIN));
                } else if (bitcoinRoundUpsAvailability instanceof BitcoinRoundUpsAvailability.Available.Bitcoin) {
                    ClientRoute.ViewInvestingRoundups viewInvestingRoundups2 = new ClientRoute.ViewInvestingRoundups();
                    RoutingParams routingParams2 = new RoutingParams(new BitcoinHome(null, null, null, null, 15), null, null, null, null, null, 510);
                    realRouter.getClass();
                    realRouter.clientRouteRouter.route(viewInvestingRoundups2, routingParams2);
                } else {
                    RotateKt.onboardBitcoinRoundUps(screenNavigator, z);
                }
                return Unit.INSTANCE;
            }
        }
        bitcoinStackingToolsPresenter$roundupsClick$1 = new BitcoinStackingToolsPresenter$roundupsClick$1(bitcoinStackingToolsPresenter, continuationImpl);
        obj = bitcoinStackingToolsPresenter$roundupsClick$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bitcoinStackingToolsPresenter$roundupsClick$1.label;
        if (i != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
        return Unit.INSTANCE;
    }

    @Override // com.squareup.cash.bitcoin.presenters.applet.widget.BitcoinHomeWidgetPresenter
    public final BitcoinHomeWidgetViewModel models(BetterNavigator.ScreenNavigator screenNavigator, Flow flow, GapComposer gapComposer, int i) {
        GapComposer gapComposer2;
        long j;
        Boolean bool;
        Boolean bool2;
        BitcoinStackingToolsViewModel.BitcoinStackingToolsItem bitcoinStackingToolsItem;
        BitcoinStackingToolsViewModel.BitcoinStackingToolsItem bitcoinStackingToolsItem2;
        BitcoinStackingToolsViewModel.BitcoinStackingToolsItem bitcoinStackingToolsItem3;
        MutableState mutableState;
        BitcoinStackingToolsViewModel.BitcoinStackingToolsItem bitcoinStackingToolsItem4;
        BitcoinStackingToolsViewModel.BitcoinStackingToolsItem bitcoinStackingToolsItem5;
        BitcoinStackingToolsViewModel.BitcoinStackingToolsItem bitcoinStackingToolsItem6;
        int i2;
        FormattedResource formattedResource;
        String str;
        int i3;
        AndroidStringManager androidStringManager = this.stringManager;
        Resources resources = androidStringManager.resources;
        gapComposer.startReplaceGroup(1697796254);
        Object rememberedValue = gapComposer.rememberedValue();
        Object obj = Composer.Companion.Empty;
        if (rememberedValue == obj) {
            rememberedValue = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        CoroutineScope coroutineScope = (CoroutineScope) rememberedValue;
        boolean changed = gapComposer.changed(screenNavigator);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (changed || rememberedValue2 == obj) {
            rememberedValue2 = this.routerFactory.create$1(screenNavigator);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        RealRouter realRouter = (RealRouter) rememberedValue2;
        boolean changed2 = gapComposer.changed(screenNavigator);
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (changed2 || rememberedValue3 == obj) {
            rememberedValue3 = this.paidInBitcoinNavigatorFactory.create(screenNavigator);
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        RealPaidInBitcoinNavigator realPaidInBitcoinNavigator = (RealPaidInBitcoinNavigator) rememberedValue3;
        boolean changed3 = gapComposer.changed(screenNavigator);
        Object rememberedValue4 = gapComposer.rememberedValue();
        if (changed3 || rememberedValue4 == obj) {
            rememberedValue4 = this.bitcoinInboundNavigatorFactory.create(screenNavigator);
            gapComposer.updateRememberedValue(rememberedValue4);
        }
        BitcoinInboundNavigator bitcoinInboundNavigator = (BitcoinInboundNavigator) rememberedValue4;
        Object rememberedValue5 = gapComposer.rememberedValue();
        if (rememberedValue5 == obj) {
            rememberedValue5 = this.sponsoredStateRepo.sponsorshipStateProvider.isSponsored();
            gapComposer.updateRememberedValue(rememberedValue5);
        }
        Boolean bool3 = Boolean.FALSE;
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue5, bool3, null, gapComposer, 48, 2);
        Object rememberedValue6 = gapComposer.rememberedValue();
        int i4 = 6;
        if (rememberedValue6 == obj) {
            rememberedValue6 = new CardModelView$iconTexture$$inlined$map$1(flow, i4);
            gapComposer.updateRememberedValue(rememberedValue6);
        }
        Flow flow2 = (Flow) rememberedValue6;
        Object rememberedValue7 = gapComposer.rememberedValue();
        if (rememberedValue7 == obj) {
            rememberedValue7 = this.showBitcoinStackingToolsLearnMore.observe();
            gapComposer.updateRememberedValue(rememberedValue7);
        }
        Boolean bool4 = Boolean.TRUE;
        MutableState collectAsState2 = Updater.collectAsState((Flow) rememberedValue7, bool4, null, gapComposer, 48, 2);
        MutableState rememberUpdatedState = Updater.rememberUpdatedState(this.paidInBitcoinStateManager.states(gapComposer), gapComposer);
        Object rememberedValue8 = gapComposer.rememberedValue();
        RealBitcoinRoundUpsRepo realBitcoinRoundUpsRepo = this.bitcoinRoundUpsRepo;
        if (rememberedValue8 == obj) {
            rememberedValue8 = realBitcoinRoundUpsRepo.bitcoinRoundUpsAvailability;
            gapComposer.updateRememberedValue(rememberedValue8);
        }
        int i5 = 1;
        MutableState collectAsState3 = Updater.collectAsState((StateFlow) rememberedValue8, null, gapComposer, 1);
        Object rememberedValue9 = gapComposer.rememberedValue();
        if (rememberedValue9 == obj) {
            rememberedValue9 = realBitcoinRoundUpsRepo.bitcoinRoundUpsUsageStats;
            gapComposer.updateRememberedValue(rememberedValue9);
        }
        MutableState collectAsState4 = Updater.collectAsState((StateFlow) rememberedValue9, null, gapComposer, 1);
        Object rememberedValue10 = gapComposer.rememberedValue();
        if (rememberedValue10 == obj) {
            RealCryptoAutoInvestRepo realCryptoAutoInvestRepo = (RealCryptoAutoInvestRepo) this.cryptoAutoInvestRepo;
            Object realCryptoAutoInvestRepo$special$$inlined$map$1 = new RealCryptoAutoInvestRepo$special$$inlined$map$1(realCryptoAutoInvestRepo.getPreferenceQuery(), realCryptoAutoInvestRepo, i5);
            gapComposer.updateRememberedValue(realCryptoAutoInvestRepo$special$$inlined$map$1);
            rememberedValue10 = realCryptoAutoInvestRepo$special$$inlined$map$1;
        }
        Continuation continuation = null;
        MutableState collectAsState5 = Updater.collectAsState((Flow) rememberedValue10, null, null, gapComposer, 48, 2);
        Object rememberedValue11 = gapComposer.rememberedValue();
        int i6 = 3;
        int i7 = 2;
        if (rememberedValue11 == obj) {
            coroutineScope.getClass();
            RealSyncEntityReader realSyncEntityReader = (RealSyncEntityReader) ((TemporaryStorage.MetroFactory) this.autoInvestRepoFactory.delegateFactory.adapter).invoke();
            ScheduledTransactionPreference.Type type2 = ScheduledTransactionPreference.Type.BTC_BUY;
            type2.getClass();
            FormCashtag$8$invokeSuspend$$inlined$map$1 formCashtag$8$invokeSuspend$$inlined$map$1 = new FormCashtag$8$invokeSuspend$$inlined$map$1(new Transform$special$$inlined$map$1(new RealDrawerOpener$getDrawerScreen$$inlined$map$1(FlowKt.transformLatest(realSyncEntityReader.getAllEntitiesFlow(AndroidSyncValueSpecs.RecurringPreferences), new CardModelView$getActiveHeat$lambda$1$$inlined$flatMapLatest$1(i6, continuation, i7)), i4), type2, 27), 15);
            j = 0;
            rememberedValue11 = FlowKt.stateIn(formCashtag$8$invokeSuspend$$inlined$map$1, coroutineScope, new StartedWhileSubscribed(0L, Long.MAX_VALUE), null);
            gapComposer2 = gapComposer;
            gapComposer2.updateRememberedValue(rememberedValue11);
        } else {
            gapComposer2 = gapComposer;
            j = 0;
        }
        MutableState collectAsState6 = Updater.collectAsState((StateFlow) rememberedValue11, null, gapComposer2, 1);
        Object rememberedValue12 = gapComposer2.rememberedValue();
        if (rememberedValue12 == obj) {
            Object moneyTabPresenter$models$lambda$17$$inlined$map$1 = new MoneyTabPresenter$models$lambda$17$$inlined$map$1(((RealIssuedCardManager) this.issuedCardManager).getIssuedCardOrNull(), i4);
            gapComposer2.updateRememberedValue(moneyTabPresenter$models$lambda$17$$inlined$map$1);
            rememberedValue12 = moneyTabPresenter$models$lambda$17$$inlined$map$1;
        }
        long j2 = j;
        GapComposer gapComposer3 = gapComposer2;
        MutableState collectAsState7 = Updater.collectAsState((Flow) rememberedValue12, bool3, null, gapComposer3, 48, 2);
        Object rememberedValue13 = gapComposer3.rememberedValue();
        if (rememberedValue13 == obj) {
            rememberedValue13 = this.receiveP2PAsBitcoinRepo.state;
            gapComposer3.updateRememberedValue(rememberedValue13);
        }
        MutableState collectAsState8 = Updater.collectAsState((Flow) rememberedValue13, ReceiveP2PAsBitcoinState.Inactive.INSTANCE, null, gapComposer3, 0, 2);
        Updater.LaunchedEffect(gapComposer, flow2, new LocalAddBrandsPresenter$models$2$1(flow2, (Continuation) null, this, screenNavigator, bitcoinInboundNavigator, collectAsState5, realPaidInBitcoinNavigator, rememberUpdatedState, collectAsState8, realRouter, collectAsState3, collectAsState7));
        ReceiveP2PAsBitcoinState receiveP2PAsBitcoinState = (ReceiveP2PAsBitcoinState) collectAsState8.getValue();
        if (!((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) this.featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$BitcoinReceiveP2pAsBitcoin.INSTANCE)).enabled()) {
            bool = bool4;
            bool2 = bool3;
            bitcoinStackingToolsItem2 = null;
        } else if (receiveP2PAsBitcoinState instanceof ReceiveP2PAsBitcoinState.Active) {
            String str2 = androidStringManager.get(R.string.bitcoin_presenters_stacking_receive_as_bitcoin_title);
            Object[] objArr = {Integer.valueOf(((ReceiveP2PAsBitcoinState.Active) receiveP2PAsBitcoinState).allocationPercentage)};
            resources.getClass();
            String format2 = new MessageFormat(resources.getString(R.string.bitcoin_presenters_stacking_receive_as_bitcoin_enabled_subtitle)).format(objArr);
            format2.getClass();
            bool = bool4;
            bitcoinStackingToolsItem2 = new BitcoinStackingToolsViewModel.BitcoinStackingToolsItem(bool, str2, format2);
            bool2 = bool3;
        } else {
            bool = bool4;
            if (receiveP2PAsBitcoinState instanceof ReceiveP2PAsBitcoinState.Paused) {
                bool2 = bool3;
                bitcoinStackingToolsItem = new BitcoinStackingToolsViewModel.BitcoinStackingToolsItem(bool2, androidStringManager.get(R.string.bitcoin_presenters_stacking_receive_as_bitcoin_title), androidStringManager.get(R.string.bitcoin_presenters_stacking_receive_as_bitcoin_paused_subtitle));
            } else {
                bool2 = bool3;
                if (!(receiveP2PAsBitcoinState instanceof ReceiveP2PAsBitcoinState.Inactive)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                bitcoinStackingToolsItem = new BitcoinStackingToolsViewModel.BitcoinStackingToolsItem(bool2, androidStringManager.get(R.string.bitcoin_presenters_stacking_receive_as_bitcoin_title), androidStringManager.get(R.string.bitcoin_presenters_stacking_receive_as_bitcoin_subtitle));
            }
            bitcoinStackingToolsItem2 = bitcoinStackingToolsItem;
        }
        boolean booleanValue = ((Boolean) collectAsState2.getValue()).booleanValue();
        BitcoinRoundUpsAvailability bitcoinRoundUpsAvailability = (BitcoinRoundUpsAvailability) collectAsState3.getValue();
        BitcoinRoundUpsUsageStats bitcoinRoundUpsUsageStats = (BitcoinRoundUpsUsageStats) collectAsState4.getValue();
        boolean z = bitcoinRoundUpsAvailability instanceof BitcoinRoundUpsAvailability.Available.Bitcoin;
        MoneyFormatter moneyFormatter = this.moneyFormatter;
        if (z && ((BitcoinRoundUpsAvailability.Available.Bitcoin) bitcoinRoundUpsAvailability).active) {
            String str3 = androidStringManager.get(R.string.bitcoin_presenters_stacking_round_ups_title);
            if (bitcoinRoundUpsUsageStats == null) {
                str = androidStringManager.get(R.string.bitcoin_presenters_stacking_round_ups_disabled_subtitle);
            } else {
                Money money = bitcoinRoundUpsUsageStats.amount;
                Long l = money.amount;
                if ((l != null ? l.longValue() : j2) <= j2 || (i3 = bitcoinRoundUpsUsageStats.numberOfExecutions) <= 0) {
                    str = androidStringManager.get(R.string.bitcoin_presenters_stacking_round_ups_disabled_subtitle);
                } else {
                    Integer valueOf = Integer.valueOf(i3);
                    String format3 = moneyFormatter.format(money);
                    format3.getClass();
                    resources.getClass();
                    str = new MessageFormat(resources.getString(R.string.bitcoin_presenters_stacking_round_ups_enabled_subtitle)).format(new Object[]{valueOf, format3});
                    str.getClass();
                }
            }
            bitcoinStackingToolsItem3 = new BitcoinStackingToolsViewModel.BitcoinStackingToolsItem(bool, str3, str);
        } else {
            bitcoinStackingToolsItem3 = new BitcoinStackingToolsViewModel.BitcoinStackingToolsItem(bool2, androidStringManager.get(R.string.bitcoin_presenters_stacking_round_ups_title), androidStringManager.get(R.string.bitcoin_presenters_stacking_round_ups_disabled_subtitle));
        }
        BitcoinStackingToolsViewModel.BitcoinStackingToolsItem bitcoinStackingToolsItem7 = bitcoinStackingToolsItem3;
        AutoInvestPreference autoInvestPreference = (AutoInvestPreference) collectAsState6.getValue();
        if (autoInvestPreference != null) {
            boolean z2 = autoInvestPreference.enabled;
            Money money2 = autoInvestPreference.amount;
            RecurringSchedule recurringSchedule = autoInvestPreference.recurringSchedule;
            Long l2 = autoInvestPreference.nextReloadAt;
            if (l2 != null) {
                j2 = l2.longValue();
            }
            Instant ofEpochMilli = Instant.ofEpochMilli(j2);
            AndroidDateFormatManager androidDateFormatManager = this.dateFormatManager;
            String format4 = androidDateFormatManager.getDateFormat("EEEE", androidDateFormatManager.clock.timeZone()).formatter.format(ofEpochMilli);
            Integer num = (Integer) CollectionsKt.getOrNull(0, recurringSchedule.days_of_period);
            String ordinal = AndroidStringManager.getOrdinal(num != null ? num.intValue() : 1);
            RecurringSchedule.Frequency frequency = recurringSchedule.frequency;
            frequency.getClass();
            int i8 = WhenMappings.$EnumSwitchMapping$0[frequency.ordinal()];
            if (i8 == 1) {
                i2 = R.string.bitcoin_presenters_stacking_auto_invest_weekly;
            } else if (i8 == 2) {
                i2 = R.string.bitcoin_presenters_stacking_auto_invest_biweekly;
            } else if (i8 == 3) {
                i2 = R.string.bitcoin_presenters_stacking_auto_invest_daily;
            } else {
                if (i8 != 4) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                i2 = R.string.bitcoin_presenters_stacking_auto_invest_monthly;
            }
            String str4 = androidStringManager.get(i2);
            Boolean valueOf2 = Boolean.valueOf(z2);
            String str5 = androidStringManager.get(R.string.bitcoin_presenters_stacking_auto_invest_title);
            RecurringSchedule.Frequency frequency2 = recurringSchedule.frequency;
            mutableState = rememberUpdatedState;
            if (frequency2 == RecurringSchedule.Frequency.EVERY_DAY || !z2) {
                String format5 = moneyFormatter.format(money2);
                format5.getClass();
                str4.getClass();
                formattedResource = new FormattedResource(R.string.bitcoin_presenters_stacking_auto_invest_daily_enabled_subtitle, new Object[]{format5, str4});
            } else if (frequency2 == RecurringSchedule.Frequency.EVERY_MONTH) {
                String format6 = moneyFormatter.format(money2);
                format6.getClass();
                str4.getClass();
                formattedResource = new FormattedResource(R.string.bitcoin_presenters_stacking_auto_invest_monthly_enabled_subtitle, new Object[]{format6, str4, ordinal});
            } else {
                String format7 = moneyFormatter.format(money2);
                format4.getClass();
                format7.getClass();
                str4.getClass();
                formattedResource = new FormattedResource(R.string.bitcoin_presenters_stacking_auto_invest_enabled_subtitle, new Object[]{format7, str4, format4});
            }
            bitcoinStackingToolsItem4 = new BitcoinStackingToolsViewModel.BitcoinStackingToolsItem(valueOf2, str5, Countries.getString(resources, formattedResource));
        } else {
            mutableState = rememberUpdatedState;
            bitcoinStackingToolsItem4 = new BitcoinStackingToolsViewModel.BitcoinStackingToolsItem(bool2, androidStringManager.get(R.string.bitcoin_presenters_stacking_auto_invest_title), androidStringManager.get(R.string.bitcoin_presenters_stacking_auto_invest_disabled_subtitle));
        }
        BitcoinStackingToolsViewModel.BitcoinStackingToolsItem bitcoinStackingToolsItem8 = bitcoinStackingToolsItem4;
        ((Boolean) collectAsState.getValue()).getClass();
        PaidInBitcoinState paidInBitcoinState = (PaidInBitcoinState) mutableState.getValue();
        Object rememberedValue14 = gapComposer.rememberedValue();
        if (rememberedValue14 == obj) {
            rememberedValue14 = Updater.mutableStateOf$default(Boolean.valueOf(this.bitcoinCapabilityProvider.isAvailable(BitcoinCapability.BITCOIN_PAYROLL)));
            gapComposer.updateRememberedValue(rememberedValue14);
        }
        if (((Boolean) ((MutableState) rememberedValue14).getValue()).booleanValue()) {
            if (paidInBitcoinState.paidInBitcoinEnabled) {
                String str6 = androidStringManager.get(R.string.bitcoin_presenters_stacking_pib_title);
                Object[] objArr2 = {Boxes$$ExternalSyntheticOutline1.m(paidInBitcoinState.selectedPercentage, "%")};
                resources.getClass();
                String format8 = new MessageFormat(resources.getString(R.string.bitcoin_presenters_stacking_pib_enabled_subtitle)).format(objArr2);
                format8.getClass();
                bitcoinStackingToolsItem5 = new BitcoinStackingToolsViewModel.BitcoinStackingToolsItem(bool, str6, format8);
            } else {
                bitcoinStackingToolsItem5 = new BitcoinStackingToolsViewModel.BitcoinStackingToolsItem(bool2, androidStringManager.get(R.string.bitcoin_presenters_stacking_pib_title), androidStringManager.get(R.string.bitcoin_presenters_stacking_pib_disabled_subtitle));
            }
            bitcoinStackingToolsItem6 = bitcoinStackingToolsItem5;
        } else {
            bitcoinStackingToolsItem6 = null;
        }
        MutableState rememberUpdatedState2 = Updater.rememberUpdatedState(new BitcoinStackingToolsViewModel(bitcoinStackingToolsItem2, bitcoinStackingToolsItem7, bitcoinStackingToolsItem8, bitcoinStackingToolsItem6, booleanValue), gapComposer);
        BitcoinStackingToolsViewModel bitcoinStackingToolsViewModel = (BitcoinStackingToolsViewModel) rememberUpdatedState2.getValue();
        boolean changed4 = gapComposer.changed(rememberUpdatedState2) | gapComposer.changedInstance(this);
        Object rememberedValue15 = gapComposer.rememberedValue();
        if (changed4 || rememberedValue15 == obj) {
            rememberedValue15 = new MLKitTitleGenerator$prepareModel$1(this, rememberUpdatedState2, null, 28);
            gapComposer.updateRememberedValue(rememberedValue15);
        }
        Updater.LaunchedEffect(gapComposer, bitcoinStackingToolsViewModel, (Function2) rememberedValue15);
        BitcoinStackingToolsViewModel bitcoinStackingToolsViewModel2 = (BitcoinStackingToolsViewModel) rememberUpdatedState2.getValue();
        gapComposer.end(false);
        return bitcoinStackingToolsViewModel2;
    }
}
