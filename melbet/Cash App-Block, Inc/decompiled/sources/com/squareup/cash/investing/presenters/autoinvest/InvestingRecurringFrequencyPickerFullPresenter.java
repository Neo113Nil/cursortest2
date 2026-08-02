package com.squareup.cash.investing.presenters.autoinvest;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.draganddrop.DragAndDrop_androidKt;
import androidx.room.util.DBUtil;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import com.squareup.cash.common.observabilitynaming.ObservabilityView;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.featureflags.AmplitudeExperiments$BitcoinEnableMonthlyAutoInvest;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.gps.db.GpsConfigQueries;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.investing.backend.real.analytics.RealInvestingAnalytics;
import com.squareup.cash.investing.components.InvestingHomeView$onScrollFlow$1;
import com.squareup.cash.investing.screen.keys.InvestingScreens;
import com.squareup.cash.investing.viewmodels.ordertype.autoinvest.InvestingRecurringFrequencyPickerViewModel;
import com.squareup.cash.invitations.InviteContactsPresenter$special$$inlined$map$1;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.protos.repeatedly.common.RecurringSchedule;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Pair;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes6.dex */
public final class InvestingRecurringFrequencyPickerFullPresenter implements MoleculePresenter {
    public final Analytics analytics;
    public final InvestingScreens.RecurringFrequencyPickerFullScreen args;
    public final boolean bitcoinMonthlyEnabled;
    public final RealInvestingAnalytics investingAnalytics;
    public final CoroutineContext ioDispatcher;
    public final MoneyFormatter moneyFormatter;
    public final BetterNavigator.ScreenNavigator navigator;
    public final RealObservabilityManager observabilityManager;
    public final GpsConfigQueries settingsQueries;
    public final AndroidStringManager stringManager;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RecurringSchedule.Frequency.values().length];
            try {
                iArr[RecurringSchedule.Frequency.EVERY_DAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RecurringSchedule.Frequency.EVERY_WEEK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RecurringSchedule.Frequency.EVERY_TWO_WEEKS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[RecurringSchedule.Frequency.EVERY_MONTH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public InvestingRecurringFrequencyPickerFullPresenter(CashAccountDatabaseImpl cashAccountDatabaseImpl, Analytics analytics, RealInvestingAnalytics realInvestingAnalytics, RealObservabilityManager realObservabilityManager, CoroutineContext coroutineContext, InvestingScreens.RecurringFrequencyPickerFullScreen recurringFrequencyPickerFullScreen, BetterNavigator.ScreenNavigator screenNavigator, AndroidStringManager androidStringManager, FeatureFlagManager featureFlagManager, LocalizedMoneyFormatter.Factory factory) {
        recurringFrequencyPickerFullScreen.getClass();
        this.analytics = analytics;
        this.investingAnalytics = realInvestingAnalytics;
        this.observabilityManager = realObservabilityManager;
        this.ioDispatcher = coroutineContext;
        this.args = recurringFrequencyPickerFullScreen;
        this.navigator = screenNavigator;
        this.stringManager = androidStringManager;
        this.moneyFormatter = factory.createRounded();
        this.settingsQueries = cashAccountDatabaseImpl.investingSettingsQueries;
        this.bitcoinMonthlyEnabled = ((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) featureFlagManager).peekCurrentValue(AmplitudeExperiments$BitcoinEnableMonthlyAutoInvest.INSTANCE)).enabled();
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        String str;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-1352992924);
        InvestingScreens.OrderTypeSelectionScreen.Type type2 = this.args.f1160type;
        Continuation continuation = null;
        if (Intrinsics.areEqual(type2, InvestingScreens.OrderTypeSelectionScreen.Type.Bitcoin.INSTANCE)) {
            ObservabilityView[] observabilityViewArr = ObservabilityView.$VALUES;
            str = "bitcoin_auto_invest_period_selector";
        } else {
            if (!(type2 instanceof InvestingScreens.OrderTypeSelectionScreen.Type.Equity)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            str = null;
        }
        if (str == null) {
            gapComposer.startReplaceGroup(1256024520);
            gapComposer.end(false);
        } else {
            gapComposer.startReplaceGroup(1256024521);
            DragAndDrop_androidKt.AddViewAttributes(this.observabilityManager, MapsKt__MapsJVMKt.mapOf(new Pair("type", str)), gapComposer, 0);
            gapComposer.end(false);
        }
        Updater.LaunchedEffect(gapComposer, flow, new InvestingHomeView$onScrollFlow$1(flow, continuation, this, 16));
        Object rememberedValue = gapComposer.rememberedValue();
        if (rememberedValue == Composer.Companion.Empty) {
            InviteContactsPresenter$special$$inlined$map$1 inviteContactsPresenter$special$$inlined$map$1 = new InviteContactsPresenter$special$$inlined$map$1(FlowKt.distinctUntilChanged(new InviteContactsPresenter$special$$inlined$map$1(DBUtil.mapToOneNotNull(DBUtil.toFlow(this.settingsQueries.select$2()), this.ioDispatcher), this, 5)), this, 6);
            gapComposer.updateRememberedValue(inviteContactsPresenter$special$$inlined$map$1);
            rememberedValue = inviteContactsPresenter$special$$inlined$map$1;
        }
        InvestingRecurringFrequencyPickerViewModel investingRecurringFrequencyPickerViewModel = (InvestingRecurringFrequencyPickerViewModel) Updater.collectAsState((Flow) rememberedValue, InvestingRecurringFrequencyPickerViewModel.Loading.INSTANCE, null, gapComposer, 0, 2).getValue();
        gapComposer.end(false);
        return investingRecurringFrequencyPickerViewModel;
    }
}
