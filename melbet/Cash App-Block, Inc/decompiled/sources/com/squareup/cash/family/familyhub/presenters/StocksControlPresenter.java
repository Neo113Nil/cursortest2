package com.squareup.cash.family.familyhub.presenters;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import androidx.compose.runtime.GapComposer;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_genai_prompt.zzki;
import com.squareup.cash.R;
import com.squareup.cash.cdf.sponsoredaccount.DependentControlType;
import com.squareup.cash.cdf.sponsoredaccount.SponsoredAccountManageToggleDependentControl;
import com.squareup.cash.cdf.sponsoredaccount.ToggleValue;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.common.moneyformatter.MoneyFormatterConfig;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.cryptonauts.api.CryptoExchangeCustomerControl;
import com.squareup.cash.db2.profile.ProfileQueries$$ExternalSyntheticLambda13;
import com.squareup.cash.family.familyhub.backend.api.ControlType;
import com.squareup.cash.family.familyhub.backend.api.DependentControlStatus;
import com.squareup.cash.family.familyhub.backend.real.RealDependentControlStatusManager;
import com.squareup.cash.family.familyhub.screens.ControlDisablingConfirmationScreen;
import com.squareup.cash.family.familyhub.screens.DependentControlScreen;
import com.squareup.cash.family.familyhub.screens.SetDependentCustomLimitScreen;
import com.squareup.cash.family.familyhub.viewmodels.DependentControlViewEvent;
import com.squareup.cash.family.familyhub.viewmodels.DependentControlViewEvent$ToggleEvent$LimitClicked;
import com.squareup.cash.family.familyhub.viewmodels.DependentControlViewEvent$ToggleEvent$ToggleChanged;
import com.squareup.cash.family.familyhub.viewmodels.DependentControlViewModel;
import com.squareup.cash.family.familyhub.viewmodels.DependentControlsLimitsViewModel;
import com.squareup.cash.family.familyhub.viewmodels.DependentControlsToggleViewModel;
import com.squareup.cash.featureflags.FeatureFlag$LongFeatureFlag;
import com.squareup.cash.featureflags.FeatureFlag$StringFeatureFlag$Value;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$FamiliesBitcoinLimitPresets;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$FamiliesCryptoLimitMaxAmount;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$FamiliesInvestLimitMaxAmount;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$FamiliesStockLimitPresets;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.fidesmo.real.RealFidesmoClient$observeDeviceState$1;
import com.squareup.cash.graphics.backend.gl.GLSceneScope$$ExternalSyntheticLambda10;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.protos.cash.investcustomer.api.v1.CustomerLimit;
import com.squareup.protos.common.Money;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class StocksControlPresenter extends BaseDependentControlPresenter {
    public final /* synthetic */ int $r8$classId;
    public final FeatureFlagManager featureFlagManager;
    public final MoneyFormatter moneyFormatter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StocksControlPresenter(BaseDependentControlDependencies baseDependentControlDependencies, FeatureFlagManager featureFlagManager, LocalizedMoneyFormatter.Factory factory, DependentControlScreen.Toggle toggle, BetterNavigator.ScreenNavigator screenNavigator, CoroutineScope coroutineScope, int i) {
        super(baseDependentControlDependencies, toggle, screenNavigator, coroutineScope);
        this.$r8$classId = i;
        toggle.getClass();
        switch (i) {
            case 1:
                super(baseDependentControlDependencies, toggle, screenNavigator, coroutineScope);
                this.featureFlagManager = featureFlagManager;
                this.moneyFormatter = factory.create(MoneyFormatterConfig.COMPACT);
                break;
            default:
                this.featureFlagManager = featureFlagManager;
                this.moneyFormatter = factory.create(MoneyFormatterConfig.COMPACT);
                break;
        }
    }

    @Override // com.squareup.cash.family.familyhub.presenters.BaseDependentControlPresenter
    public final DependentControlViewModel createViewModel(String str, DependentControlStatus dependentControlStatus, GapComposer gapComposer) {
        Money money;
        String format2;
        Money money2;
        String format3;
        int i = this.$r8$classId;
        MoneyFormatter moneyFormatter = this.moneyFormatter;
        BaseDependentControlDependencies baseDependentControlDependencies = this.deps;
        switch (i) {
            case 0:
                str.getClass();
                dependentControlStatus.getClass();
                gapComposer.startReplaceGroup(1723878417);
                AndroidStringManager androidStringManager = baseDependentControlDependencies.stringManager;
                Resources resources = androidStringManager.resources;
                resources.getClass();
                String format4 = new MessageFormat(resources.getString(R.string.family_account_dependent_p2p_controls_screen_title)).format(new Object[]{str});
                format4.getClass();
                ControlType controlType = ControlType.STOCKS;
                String str2 = androidStringManager.get(R.string.family_account_dependent_stocks_balance);
                Resources resources2 = androidStringManager.resources;
                resources2.getClass();
                String format5 = new MessageFormat(resources2.getString(R.string.family_account_dependent_controls_stock_description)).format(new Object[]{str});
                format5.getClass();
                DependentControlsToggleViewModel dependentControlsToggleViewModel = new DependentControlsToggleViewModel(str2, format5, null, zzki.enabled(dependentControlStatus));
                DependentControlStatus.Loaded.LoadedStockControl loadedStockControl = dependentControlStatus instanceof DependentControlStatus.Loaded.LoadedStockControl ? (DependentControlStatus.Loaded.LoadedStockControl) dependentControlStatus : null;
                DependentControlsLimitsViewModel dependentControlsLimitsViewModel = new DependentControlsLimitsViewModel(androidStringManager.get(R.string.family_account_dependent_limits_title), null, (loadedStockControl == null || (money = loadedStockControl.limitAmount) == null || (format2 = moneyFormatter.format(money)) == null) ? "" : format2, false, loadedStockControl != null && loadedStockControl.isOnboarded && loadedStockControl.isMonthlyFrequency);
                boolean z = (dependentControlStatus instanceof DependentControlStatus.InitialLoading) || (dependentControlStatus instanceof DependentControlStatus.Updating);
                resources2.getClass();
                String format6 = new MessageFormat(resources2.getString(R.string.family_account_dependent_limits_footer)).format(new Object[]{str});
                format6.getClass();
                DependentControlViewModel.Toggle toggle = new DependentControlViewModel.Toggle(format4, controlType, dependentControlsToggleViewModel, dependentControlsLimitsViewModel, z, format6, null);
                gapComposer.end(false);
                return toggle;
            default:
                str.getClass();
                dependentControlStatus.getClass();
                gapComposer.startReplaceGroup(-399886299);
                AndroidStringManager androidStringManager2 = baseDependentControlDependencies.stringManager;
                Resources resources3 = androidStringManager2.resources;
                resources3.getClass();
                String format7 = new MessageFormat(resources3.getString(R.string.family_account_dependent_p2p_controls_screen_title)).format(new Object[]{str});
                format7.getClass();
                ControlType controlType2 = ControlType.BITCOIN;
                String str3 = androidStringManager2.get(R.string.family_account_dependent_bitcoin_balance);
                Resources resources4 = androidStringManager2.resources;
                resources4.getClass();
                String format8 = new MessageFormat(resources4.getString(R.string.family_account_dependent_controls_bitcoin_description)).format(new Object[]{str});
                format8.getClass();
                DependentControlsToggleViewModel dependentControlsToggleViewModel2 = new DependentControlsToggleViewModel(str3, format8, null, zzki.enabled(dependentControlStatus));
                DependentControlStatus.Loaded.LoadedBitcoinControl loadedBitcoinControl = dependentControlStatus instanceof DependentControlStatus.Loaded.LoadedBitcoinControl ? (DependentControlStatus.Loaded.LoadedBitcoinControl) dependentControlStatus : null;
                DependentControlsLimitsViewModel dependentControlsLimitsViewModel2 = new DependentControlsLimitsViewModel(androidStringManager2.get(R.string.family_account_dependent_limits_title), null, (loadedBitcoinControl == null || (money2 = loadedBitcoinControl.limitAmount) == null || (format3 = moneyFormatter.format(money2)) == null) ? "" : format3, false, loadedBitcoinControl != null && loadedBitcoinControl.isOnboarded && loadedBitcoinControl.isMonthlyFrequency);
                boolean z2 = (dependentControlStatus instanceof DependentControlStatus.InitialLoading) || (dependentControlStatus instanceof DependentControlStatus.Updating);
                resources4.getClass();
                String format9 = new MessageFormat(resources4.getString(R.string.family_account_dependent_limits_footer)).format(new Object[]{str});
                format9.getClass();
                DependentControlViewModel.Toggle toggle2 = new DependentControlViewModel.Toggle(format7, controlType2, dependentControlsToggleViewModel2, dependentControlsLimitsViewModel2, z2, format9, null);
                gapComposer.end(false);
                return toggle2;
        }
    }

    @Override // com.squareup.cash.family.familyhub.presenters.BaseDependentControlPresenter
    public final ControlType getControlType() {
        switch (this.$r8$classId) {
            case 0:
                return ControlType.STOCKS;
            default:
                return ControlType.BITCOIN;
        }
    }

    @Override // com.squareup.cash.family.familyhub.presenters.BaseDependentControlPresenter
    public final Object handleControlSpecificEvent(DependentControlViewEvent dependentControlViewEvent, String str, DependentControlStatus dependentControlStatus, RealFidesmoClient$observeDeviceState$1 realFidesmoClient$observeDeviceState$1) {
        int i = this.$r8$classId;
        DependentControlScreen dependentControlScreen = this.args;
        FeatureFlagManager featureFlagManager = this.featureFlagManager;
        ControlDisablingConfirmationScreen.DisablingConfirmationQuestion disablingConfirmationQuestion = ControlDisablingConfirmationScreen.DisablingConfirmationQuestion.INSTANCE;
        BetterNavigator.ScreenNavigator screenNavigator = this.navigator;
        int i2 = 1;
        switch (i) {
            case 0:
                if (dependentControlViewEvent instanceof DependentControlViewEvent$ToggleEvent$ToggleChanged) {
                    if (((DependentControlViewEvent$ToggleEvent$ToggleChanged) dependentControlViewEvent).enabled) {
                        Object handleEnableStocks = handleEnableStocks(realFidesmoClient$observeDeviceState$1);
                        if (handleEnableStocks != CoroutineSingletons.COROUTINE_SUSPENDED) {
                            break;
                        }
                    } else {
                        screenNavigator.askQuestion(disablingConfirmationQuestion, new GLSceneScope$$ExternalSyntheticLambda10(i2, this, str));
                    }
                } else if (dependentControlViewEvent instanceof DependentControlViewEvent$ToggleEvent$LimitClicked) {
                    DependentControlStatus.Loaded.LoadedStockControl loadedStockControl = dependentControlStatus instanceof DependentControlStatus.Loaded.LoadedStockControl ? (DependentControlStatus.Loaded.LoadedStockControl) dependentControlStatus : null;
                    if (loadedStockControl != null) {
                        RealFeatureFlagManager realFeatureFlagManager = (RealFeatureFlagManager) featureFlagManager;
                        List split$default = StringsKt.split$default(((FeatureFlag$StringFeatureFlag$Value) realFeatureFlagManager.peekCurrentValue(LaunchDarklyFeatureFlags$FamiliesStockLimitPresets.INSTANCE)).value, new char[]{','}, 6);
                        ArrayList arrayList = new ArrayList();
                        Iterator it = split$default.iterator();
                        while (it.hasNext()) {
                            Long longOrNull = StringsKt.toLongOrNull(StringsKt.trim((String) it.next()).toString());
                            if (longOrNull != null) {
                                arrayList.add(longOrNull);
                            }
                        }
                        boolean isEmpty = arrayList.isEmpty();
                        Collection collection = arrayList;
                        if (isEmpty) {
                            collection = CollectionsKt__CollectionsKt.listOf((Object[]) new Long[]{2500L, 5000L, 15000L, 30000L, 40000L});
                        }
                        long j = ((FeatureFlag$LongFeatureFlag.Value) realFeatureFlagManager.peekCurrentValue(LaunchDarklyFeatureFlags$FamiliesInvestLimitMaxAmount.INSTANCE)).value;
                        String str2 = ((DependentControlScreen.Toggle) dependentControlScreen).dependentCustomerToken;
                        CustomerLimit.Frequency frequency = loadedStockControl.limitFrequency;
                        frequency.getClass();
                        Money money = loadedStockControl.limitAmount;
                        money.getClass();
                        screenNavigator.goTo(new SetDependentCustomLimitScreen(str2, new SetDependentCustomLimitScreen.LimitCategory.BuyStock(frequency, money, (List) collection, j), ControlType.STOCKS));
                    }
                }
                break;
            default:
                if (dependentControlViewEvent instanceof DependentControlViewEvent$ToggleEvent$ToggleChanged) {
                    if (((DependentControlViewEvent$ToggleEvent$ToggleChanged) dependentControlViewEvent).enabled) {
                        Object handleEnableBitcoin = handleEnableBitcoin(realFidesmoClient$observeDeviceState$1);
                        if (handleEnableBitcoin != CoroutineSingletons.COROUTINE_SUSPENDED) {
                            break;
                        }
                    } else {
                        screenNavigator.askQuestion(disablingConfirmationQuestion, new ProfileQueries$$ExternalSyntheticLambda13(25, this, str));
                    }
                } else if (dependentControlViewEvent instanceof DependentControlViewEvent$ToggleEvent$LimitClicked) {
                    DependentControlStatus.Loaded.LoadedBitcoinControl loadedBitcoinControl = dependentControlStatus instanceof DependentControlStatus.Loaded.LoadedBitcoinControl ? (DependentControlStatus.Loaded.LoadedBitcoinControl) dependentControlStatus : null;
                    if (loadedBitcoinControl != null) {
                        RealFeatureFlagManager realFeatureFlagManager2 = (RealFeatureFlagManager) featureFlagManager;
                        List split$default2 = StringsKt.split$default(((FeatureFlag$StringFeatureFlag$Value) realFeatureFlagManager2.peekCurrentValue(LaunchDarklyFeatureFlags$FamiliesBitcoinLimitPresets.INSTANCE)).value, new char[]{','}, 6);
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it2 = split$default2.iterator();
                        while (it2.hasNext()) {
                            Long longOrNull2 = StringsKt.toLongOrNull(StringsKt.trim((String) it2.next()).toString());
                            if (longOrNull2 != null) {
                                arrayList2.add(longOrNull2);
                            }
                        }
                        boolean isEmpty2 = arrayList2.isEmpty();
                        Collection collection2 = arrayList2;
                        if (isEmpty2) {
                            collection2 = CollectionsKt__CollectionsKt.listOf((Object[]) new Long[]{2500L, 5000L, 15000L, 30000L, 40000L});
                        }
                        long j2 = ((FeatureFlag$LongFeatureFlag.Value) realFeatureFlagManager2.peekCurrentValue(LaunchDarklyFeatureFlags$FamiliesCryptoLimitMaxAmount.INSTANCE)).value;
                        String str3 = ((DependentControlScreen.Toggle) dependentControlScreen).dependentCustomerToken;
                        CryptoExchangeCustomerControl.CryptoExchangeLimit.Frequency frequency2 = loadedBitcoinControl.limitFrequency;
                        frequency2.getClass();
                        Money money2 = loadedBitcoinControl.limitAmount;
                        money2.getClass();
                        screenNavigator.goTo(new SetDependentCustomLimitScreen(str3, new SetDependentCustomLimitScreen.LimitCategory.BuyBitcoin(frequency2, money2, (List) collection2, j2), ControlType.BITCOIN));
                    }
                }
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ac, code lost:
    
        if (r14.setDependentControlStatus(true, r0) == r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ae, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0045, code lost:
    
        if (r15 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object handleEnableBitcoin(ContinuationImpl continuationImpl) {
        BitcoinControlPresenter$handleEnableBitcoin$1 bitcoinControlPresenter$handleEnableBitcoin$1;
        int i;
        DependentControlStatus dependentControlStatus;
        if (continuationImpl instanceof BitcoinControlPresenter$handleEnableBitcoin$1) {
            bitcoinControlPresenter$handleEnableBitcoin$1 = (BitcoinControlPresenter$handleEnableBitcoin$1) continuationImpl;
            int i2 = bitcoinControlPresenter$handleEnableBitcoin$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                bitcoinControlPresenter$handleEnableBitcoin$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = bitcoinControlPresenter$handleEnableBitcoin$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bitcoinControlPresenter$handleEnableBitcoin$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    SharedFlowImpl sharedFlowImpl = getControlStatusManager().dependentControlStatus;
                    bitcoinControlPresenter$handleEnableBitcoin$1.label = 1;
                    obj = FlowKt.first(sharedFlowImpl, bitcoinControlPresenter$handleEnableBitcoin$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                dependentControlStatus = (DependentControlStatus) obj;
                if (dependentControlStatus instanceof DependentControlStatus.Loaded.LoadedBitcoinControl) {
                    Timber.Forest.w("Unable to process dependent control status " + dependentControlStatus, new Object[0]);
                    return Unit.INSTANCE;
                }
                String str = ((DependentControlStatus.Loaded.LoadedBitcoinControl) dependentControlStatus).onboardingUrl;
                if (str != null) {
                    DependentControlScreen dependentControlScreen = this.args;
                    this.router.route(new RoutingParams(dependentControlScreen, null, dependentControlScreen, null, null, null, HttpStatusCode.BAD_GATEWAY_502), str);
                    getControlStatusManager().dependentControlsCache.cache.clear();
                } else {
                    this.deps.analytics.track(new SponsoredAccountManageToggleDependentControl(DependentControlType.BitcoinInvesting, ToggleValue.Enabled, ((DependentControlScreen.Toggle) this.args).dependentCustomerToken), null);
                    RealDependentControlStatusManager controlStatusManager = getControlStatusManager();
                    bitcoinControlPresenter$handleEnableBitcoin$1.label = 2;
                }
                return Unit.INSTANCE;
            }
        }
        bitcoinControlPresenter$handleEnableBitcoin$1 = new BitcoinControlPresenter$handleEnableBitcoin$1(this, continuationImpl);
        Object obj2 = bitcoinControlPresenter$handleEnableBitcoin$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bitcoinControlPresenter$handleEnableBitcoin$1.label;
        if (i != 0) {
        }
        dependentControlStatus = (DependentControlStatus) obj2;
        if (dependentControlStatus instanceof DependentControlStatus.Loaded.LoadedBitcoinControl) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0095, code lost:
    
        if (r14.setDependentControlStatus(true, r0) != r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0097, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0045, code lost:
    
        if (r15 == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object handleEnableStocks(ContinuationImpl continuationImpl) {
        StocksControlPresenter$handleEnableStocks$1 stocksControlPresenter$handleEnableStocks$1;
        int i;
        DependentControlStatus.Loaded.LoadedStockControl loadedStockControl;
        String str;
        if (continuationImpl instanceof StocksControlPresenter$handleEnableStocks$1) {
            stocksControlPresenter$handleEnableStocks$1 = (StocksControlPresenter$handleEnableStocks$1) continuationImpl;
            int i2 = stocksControlPresenter$handleEnableStocks$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                stocksControlPresenter$handleEnableStocks$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = stocksControlPresenter$handleEnableStocks$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = stocksControlPresenter$handleEnableStocks$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    SharedFlowImpl sharedFlowImpl = getControlStatusManager().dependentControlStatus;
                    stocksControlPresenter$handleEnableStocks$1.label = 1;
                    obj = FlowKt.first(sharedFlowImpl, stocksControlPresenter$handleEnableStocks$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                loadedStockControl = !(obj instanceof DependentControlStatus.Loaded.LoadedStockControl) ? (DependentControlStatus.Loaded.LoadedStockControl) obj : null;
                if (loadedStockControl != null || (str = loadedStockControl.onboardingUrl) == null) {
                    this.deps.analytics.track(new SponsoredAccountManageToggleDependentControl(DependentControlType.StockInvesting, ToggleValue.Enabled, ((DependentControlScreen.Toggle) this.args).dependentCustomerToken), null);
                    RealDependentControlStatusManager controlStatusManager = getControlStatusManager();
                    stocksControlPresenter$handleEnableStocks$1.label = 2;
                } else {
                    DependentControlScreen dependentControlScreen = this.args;
                    this.router.route(new RoutingParams(dependentControlScreen, null, dependentControlScreen, null, null, null, HttpStatusCode.BAD_GATEWAY_502), str);
                    getControlStatusManager().dependentControlsCache.cache.clear();
                }
                return Unit.INSTANCE;
            }
        }
        stocksControlPresenter$handleEnableStocks$1 = new StocksControlPresenter$handleEnableStocks$1(this, continuationImpl);
        Object obj2 = stocksControlPresenter$handleEnableStocks$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = stocksControlPresenter$handleEnableStocks$1.label;
        if (i != 0) {
        }
        if (!(obj2 instanceof DependentControlStatus.Loaded.LoadedStockControl)) {
        }
        if (loadedStockControl != null) {
        }
        this.deps.analytics.track(new SponsoredAccountManageToggleDependentControl(DependentControlType.StockInvesting, ToggleValue.Enabled, ((DependentControlScreen.Toggle) this.args).dependentCustomerToken), null);
        RealDependentControlStatusManager controlStatusManager2 = getControlStatusManager();
        stocksControlPresenter$handleEnableStocks$1.label = 2;
    }
}
