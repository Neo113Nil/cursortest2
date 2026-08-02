package com.squareup.cash.growtools.presenters.manager.autoinvest;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.squareup.cash.activity.presenters.RealActivityEmbeddedPresenter;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.ToastKt$Toast$7$1;
import com.squareup.cash.card.onboarding.CardModelView$getActiveHeat$lambda$1$$inlined$flatMapLatest$1;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.RealSyncEntityReader;
import com.squareup.cash.common.moneyformatter.MoneyFormatterConfig;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.crypto.backend.autoinvest.CryptoAutoInvest;
import com.squareup.cash.crypto.backend.autoinvest.CryptoAutoInvestRepo;
import com.squareup.cash.crypto.backend.autoinvest.RealCryptoAutoInvestRepo;
import com.squareup.cash.crypto.backend.autoinvest.RealCryptoAutoInvestRepo$special$$inlined$map$1;
import com.squareup.cash.data.TemporaryStorage;
import com.squareup.cash.featureflags.AmplitudeExperiments$BitcoinEnableMonthlyAutoInvest;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.formview.components.FormCashtag$8$invokeSuspend$$inlined$map$1;
import com.squareup.cash.graphics.swampgl.components.Transform$special$$inlined$map$1;
import com.squareup.cash.growtools.presenters.manager.GrowToolsManagerDelegate;
import com.squareup.cash.growtools.presenters.manager.activity.RealGrowToolsActivityPresenterFactory;
import com.squareup.cash.growtools.presenters.manager.state.GrowToolsManagerState;
import com.squareup.cash.growtools.presenters.manager.state.OriginSpecificData;
import com.squareup.cash.growtools.screens.GrowToolsManagerScreen;
import com.squareup.cash.growtools.viewmodels.manager.GrowToolsManagerViewModel;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.investing.backend.api.AutoInvestPreference;
import com.squareup.cash.investing.backend.real.autoinvest.RealAutoInvestRepo$Factory$Impl;
import com.squareup.cash.investing.screen.keys.InvestingScreens;
import com.squareup.cash.moneybot.presenters.MoneybotChatPresenter$models$6$1;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.resource.AndroidDateFormatManager;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.util.RealDrawerOpener$getDrawerScreen$$inlined$map$1;
import com.squareup.protos.common.Money;
import com.squareup.protos.repeatedly.common.RecurringSchedule;
import com.squareup.protos.repeatedly.common.ScheduledTransactionPreference;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.time.Instant;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClasses;
import kotlin.reflect.full.KClassifiers;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StartedWhileSubscribed;
import kotlinx.coroutines.flow.StateFlow;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import squareup.cash.scheduledreloader.api.external.v1.ScheduledReloaderAppService;

/* loaded from: classes6.dex */
public final class GrowToolsAutoInvestManager implements GrowToolsManagerDelegate {
    public final RealActivityEmbeddedPresenter activityPresenter;
    public final CoroutineScope activityScope;
    public final Analytics analytics;
    public final GrowToolsManagerScreen.ManageAutoInvestScreen args;
    public final RealAutoInvestRepo$Factory$Impl autoInvestRepoFactory;
    public final ScheduledTransactionPreference.Type autoInvestType;
    public final CryptoAutoInvestRepo cryptoAutoInvestRepo;
    public final AndroidDateFormatManager dateFormatManager;
    public final FeatureFlagManager featureFlagManager;
    public final MoneyFormatter moneyFormatter;
    public final BetterNavigator.ScreenNavigator navigator;
    public final ScheduledReloaderAppService scheduledReloaderAppService;
    public final AndroidStringManager stringManager;

    public final class AutoInvestTarget implements OriginSpecificData.TargetData {
        public final String altDescription;
        public final GrowToolsManagerViewModel.Loaded.Header.Target target;

        public AutoInvestTarget(GrowToolsManagerViewModel.Loaded.Header.Target target, String str) {
            str.getClass();
            this.target = target;
            this.altDescription = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AutoInvestTarget)) {
                return false;
            }
            AutoInvestTarget autoInvestTarget = (AutoInvestTarget) obj;
            return this.target.equals(autoInvestTarget.target) && Intrinsics.areEqual(this.altDescription, autoInvestTarget.altDescription);
        }

        @Override // com.squareup.cash.growtools.presenters.manager.state.OriginSpecificData.TargetData
        public final String getAltDescription() {
            return this.altDescription;
        }

        @Override // com.squareup.cash.growtools.presenters.manager.state.OriginSpecificData.TargetData
        public final GrowToolsManagerViewModel.Loaded.Header.Target getTarget() {
            return this.target;
        }

        public final int hashCode() {
            return this.altDescription.hashCode() + (this.target.hashCode() * 31);
        }

        public final String toString() {
            return "AutoInvestTarget(target=" + this.target + ", altDescription=" + this.altDescription + ")";
        }
    }

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

    public GrowToolsAutoInvestManager(AndroidStringManager androidStringManager, RealGrowToolsActivityPresenterFactory realGrowToolsActivityPresenterFactory, CryptoAutoInvestRepo cryptoAutoInvestRepo, RealAutoInvestRepo$Factory$Impl realAutoInvestRepo$Factory$Impl, AndroidDateFormatManager androidDateFormatManager, ScheduledReloaderAppService scheduledReloaderAppService, Analytics analytics, CoroutineScope coroutineScope, FeatureFlagManager featureFlagManager, LocalizedMoneyFormatter.Factory factory, GrowToolsManagerScreen.ManageAutoInvestScreen manageAutoInvestScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        manageAutoInvestScreen.getClass();
        this.stringManager = androidStringManager;
        this.cryptoAutoInvestRepo = cryptoAutoInvestRepo;
        this.autoInvestRepoFactory = realAutoInvestRepo$Factory$Impl;
        this.dateFormatManager = androidDateFormatManager;
        this.scheduledReloaderAppService = scheduledReloaderAppService;
        this.analytics = analytics;
        this.activityScope = coroutineScope;
        this.featureFlagManager = featureFlagManager;
        this.args = manageAutoInvestScreen;
        this.navigator = screenNavigator;
        this.activityPresenter = realGrowToolsActivityPresenterFactory.create(manageAutoInvestScreen, screenNavigator, null);
        this.moneyFormatter = factory.create(MoneyFormatterConfig.COMPACT);
        this.autoInvestType = ScheduledTransactionPreference.Type.BTC_BUY;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$navigateToAutoInvestSheet(GrowToolsAutoInvestManager growToolsAutoInvestManager, BetterNavigator.ScreenNavigator screenNavigator, ContinuationImpl continuationImpl) {
        GrowToolsAutoInvestManager$navigateToAutoInvestSheet$1 growToolsAutoInvestManager$navigateToAutoInvestSheet$1;
        int i;
        CryptoAutoInvest cryptoAutoInvest;
        if (continuationImpl instanceof GrowToolsAutoInvestManager$navigateToAutoInvestSheet$1) {
            growToolsAutoInvestManager$navigateToAutoInvestSheet$1 = (GrowToolsAutoInvestManager$navigateToAutoInvestSheet$1) continuationImpl;
            int i2 = growToolsAutoInvestManager$navigateToAutoInvestSheet$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                growToolsAutoInvestManager$navigateToAutoInvestSheet$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = growToolsAutoInvestManager$navigateToAutoInvestSheet$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = growToolsAutoInvestManager$navigateToAutoInvestSheet$1.label;
                int i3 = 1;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealCryptoAutoInvestRepo realCryptoAutoInvestRepo = (RealCryptoAutoInvestRepo) growToolsAutoInvestManager.cryptoAutoInvestRepo;
                    RealCryptoAutoInvestRepo$special$$inlined$map$1 realCryptoAutoInvestRepo$special$$inlined$map$1 = new RealCryptoAutoInvestRepo$special$$inlined$map$1(realCryptoAutoInvestRepo.getPreferenceQuery(), realCryptoAutoInvestRepo, i3);
                    growToolsAutoInvestManager$navigateToAutoInvestSheet$1.L$0 = screenNavigator;
                    growToolsAutoInvestManager$navigateToAutoInvestSheet$1.label = 1;
                    obj = FlowKt.first(realCryptoAutoInvestRepo$special$$inlined$map$1, growToolsAutoInvestManager$navigateToAutoInvestSheet$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    screenNavigator = growToolsAutoInvestManager$navigateToAutoInvestSheet$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                cryptoAutoInvest = (CryptoAutoInvest) obj;
                if (cryptoAutoInvest == null) {
                    screenNavigator.goTo(new InvestingScreens.RecurringPurchaseReceipt(cryptoAutoInvest.recurringId, ColorModel.Bitcoin.INSTANCE, InvestingScreens.RecurringPurchaseReceipt.Type.Bitcoin.INSTANCE));
                    return Unit.INSTANCE;
                }
                a$$ExternalSyntheticBUOutline0.m$3("Expected to have bitcoin auto invest at this point");
                return null;
            }
        }
        growToolsAutoInvestManager$navigateToAutoInvestSheet$1 = new GrowToolsAutoInvestManager$navigateToAutoInvestSheet$1(growToolsAutoInvestManager, continuationImpl);
        Object obj2 = growToolsAutoInvestManager$navigateToAutoInvestSheet$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = growToolsAutoInvestManager$navigateToAutoInvestSheet$1.label;
        int i32 = 1;
        if (i != 0) {
        }
        cryptoAutoInvest = (CryptoAutoInvest) obj2;
        if (cryptoAutoInvest == null) {
        }
    }

    public final String description(AutoInvestPreference autoInvestPreference) {
        String format2 = autoInvestPreference == null ? "0" : this.moneyFormatter.format(autoInvestPreference.amount);
        String frequency = frequency(autoInvestPreference);
        format2.getClass();
        frequency.getClass();
        Resources resources = this.stringManager.resources;
        resources.getClass();
        String format3 = new MessageFormat(resources.getString(R.string.grow_tools_auto_invest_target_text)).format(new Object[]{format2, frequency});
        format3.getClass();
        return format3;
    }

    public final String frequency(AutoInvestPreference autoInvestPreference) {
        RecurringSchedule.Frequency frequency;
        int i;
        if (autoInvestPreference == null || (frequency = autoInvestPreference.recurringSchedule.frequency) == null) {
            return "";
        }
        int i2 = WhenMappings.$EnumSwitchMapping$0[frequency.ordinal()];
        if (i2 == 1) {
            i = R.string.grow_tools_auto_invest_weekly;
        } else if (i2 == 2) {
            i = R.string.grow_tools_auto_invest_biweekly;
        } else if (i2 == 3) {
            i = R.string.grow_tools_auto_invest_daily;
        } else {
            if (i2 != 4) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            i = R.string.grow_tools_auto_invest_monthly;
        }
        return this.stringManager.get(i);
    }

    public final String getBitcoinTargetDescription(boolean z, AutoInvestPreference autoInvestPreference) {
        Integer num;
        AndroidStringManager androidStringManager = this.stringManager;
        Resources resources = androidStringManager.resources;
        if (autoInvestPreference == null) {
            return androidStringManager.get(R.string.grow_tools_auto_invest_bitcoin_target_description_off);
        }
        Money money = autoInvestPreference.amount;
        Long l = autoInvestPreference.nextReloadAt;
        RecurringSchedule recurringSchedule = autoInvestPreference.recurringSchedule;
        if (!z) {
            return description(autoInvestPreference);
        }
        RecurringSchedule.Frequency frequency = recurringSchedule.frequency;
        if (frequency == RecurringSchedule.Frequency.EVERY_DAY || l == null) {
            return description(autoInvestPreference);
        }
        RecurringSchedule.Frequency frequency2 = RecurringSchedule.Frequency.EVERY_MONTH;
        MoneyFormatter moneyFormatter = this.moneyFormatter;
        if (frequency == frequency2) {
            String format2 = moneyFormatter.format(money);
            String frequency3 = frequency(autoInvestPreference);
            List<Integer> list = recurringSchedule.days_of_period;
            String ordinal = AndroidStringManager.getOrdinal((list == null || (num = (Integer) CollectionsKt.getOrNull(0, list)) == null) ? 1 : num.intValue());
            format2.getClass();
            frequency3.getClass();
            resources.getClass();
            String format3 = new MessageFormat(resources.getString(R.string.grow_tools_auto_invest_target_text_date)).format(new Object[]{format2, frequency3, ordinal});
            format3.getClass();
            return format3;
        }
        String format4 = moneyFormatter.format(money);
        String frequency4 = frequency(autoInvestPreference);
        Instant ofEpochMilli = Instant.ofEpochMilli(l.longValue());
        AndroidDateFormatManager androidDateFormatManager = this.dateFormatManager;
        String format5 = androidDateFormatManager.getDateFormat("EEEE", androidDateFormatManager.clock.timeZone()).formatter.format(ofEpochMilli);
        format5.getClass();
        format4.getClass();
        frequency4.getClass();
        resources.getClass();
        String format6 = new MessageFormat(resources.getString(R.string.grow_tools_auto_invest_target_text_weekday)).format(new Object[]{format4, frequency4, format5});
        format6.getClass();
        return format6;
    }

    @Override // com.squareup.cash.growtools.presenters.manager.GrowToolsManagerDelegate
    public final GrowToolsManagerViewModel models(Flow flow, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-982257565);
        GrowToolsManagerState rememberManagerState = KClasses.rememberManagerState(gapComposer);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        CoroutineScope coroutineScope = (CoroutineScope) rememberedValue;
        Object rememberedValue2 = gapComposer.rememberedValue();
        Continuation continuation = null;
        if (rememberedValue2 == neverEqualPolicy) {
            coroutineScope.getClass();
            RealSyncEntityReader realSyncEntityReader = (RealSyncEntityReader) ((TemporaryStorage.MetroFactory) this.autoInvestRepoFactory.delegateFactory.adapter).invoke();
            ScheduledTransactionPreference.Type type2 = this.autoInvestType;
            type2.getClass();
            rememberedValue2 = FlowKt.stateIn(new FormCashtag$8$invokeSuspend$$inlined$map$1(new Transform$special$$inlined$map$1(new RealDrawerOpener$getDrawerScreen$$inlined$map$1(FlowKt.transformLatest(realSyncEntityReader.getAllEntitiesFlow(AndroidSyncValueSpecs.RecurringPreferences), new CardModelView$getActiveHeat$lambda$1$$inlined$flatMapLatest$1(3, continuation, 2)), 6), type2, 27), 15), coroutineScope, new StartedWhileSubscribed(0L, Long.MAX_VALUE), null);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState collectAsState = Updater.collectAsState((StateFlow) rememberedValue2, null, gapComposer, 1);
        AutoInvestPreference autoInvestPreference = (AutoInvestPreference) collectAsState.getValue();
        boolean z = autoInvestPreference != null && autoInvestPreference.enabled;
        AndroidStringManager androidStringManager = this.stringManager;
        String str = androidStringManager.get(R.string.grow_tools_bitcoin);
        Resources resources = androidStringManager.resources;
        GrowToolsManagerViewModel.Loaded.Header.Target target = new GrowToolsManagerViewModel.Loaded.Header.Target(str, getBitcoinTargetDescription(z, autoInvestPreference), KClassifiers.bitcoinAvatar(), Icons.RecurringAutomatic16, androidStringManager.get(R.string.grow_tools_change));
        String str2 = androidStringManager.get(R.string.grow_tools_auto_invest_bitcoin_title);
        String str3 = androidStringManager.get(((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) this.featureFlagManager).peekCurrentValue(AmplitudeExperiments$BitcoinEnableMonthlyAutoInvest.INSTANCE)).enabled() ? R.string.grow_tools_auto_invest_bitcoin_toggle_text_with_monthly : R.string.grow_tools_auto_invest_bitcoin_toggle_text);
        AutoInvestTarget autoInvestTarget = new AutoInvestTarget(target, getBitcoinTargetDescription(!z, autoInvestPreference));
        String frequency = frequency(autoInvestPreference);
        frequency.getClass();
        resources.getClass();
        String format2 = new MessageFormat(resources.getString(R.string.grow_tools_auto_invest_bitcoin_toggle_off_dialog_message)).format(new Object[]{frequency});
        format2.getClass();
        String frequency2 = frequency(autoInvestPreference);
        frequency2.getClass();
        String format3 = new MessageFormat(resources.getString(R.string.grow_tools_auto_invest_bitcoin_toggle_off_dialog_confirm_button)).format(new Object[]{frequency2});
        format3.getClass();
        MutableState rememberUpdatedState = Updater.rememberUpdatedState(new OriginSpecificData(str2, str3, z, autoInvestTarget, format2, format3), gapComposer);
        Boolean valueOf = Boolean.valueOf(((OriginSpecificData) rememberUpdatedState.getValue()).enabled);
        boolean changed = gapComposer.changed(rememberManagerState);
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (changed || rememberedValue3 == neverEqualPolicy) {
            i2 = 0;
            rememberedValue3 = new GrowToolsAutoInvestManager$models$1$1(rememberManagerState, null, 0);
            gapComposer.updateRememberedValue(rememberedValue3);
        } else {
            i2 = 0;
        }
        Updater.LaunchedEffect(gapComposer, valueOf, (Function2) rememberedValue3);
        MutableState rememberUpdatedState2 = Updater.rememberUpdatedState(this.activityPresenter.models(gapComposer, i2), gapComposer);
        OriginSpecificData originSpecificData = (OriginSpecificData) rememberUpdatedState.getValue();
        boolean changed2 = gapComposer.changed(rememberUpdatedState2);
        Object rememberedValue4 = gapComposer.rememberedValue();
        if (changed2 || rememberedValue4 == neverEqualPolicy) {
            rememberedValue4 = new ToastKt$Toast$7$1(rememberUpdatedState2, null, 9);
            gapComposer.updateRememberedValue(rememberedValue4);
        }
        Updater.LaunchedEffect(gapComposer, originSpecificData, (Function2) rememberedValue4);
        Updater.LaunchedEffect(gapComposer, flow, new MoneybotChatPresenter$models$6$1(flow, (Continuation) null, (Object) this, (Object) rememberManagerState, rememberUpdatedState, collectAsState, 3));
        GrowToolsManagerViewModel.Loaded buildModel = ((OriginSpecificData) rememberUpdatedState.getValue()).buildModel(rememberManagerState, (UiCallbackModel) rememberUpdatedState2.getValue(), androidStringManager);
        gapComposer.end(false);
        return buildModel;
    }
}
