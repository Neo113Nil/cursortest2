package com.squareup.cash.banking.presenters;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.tracing.Trace;
import app.cash.broadway.presenter.molecule.MoleculeCallbackPresenter;
import app.cash.broadway.presenter.molecule.StableCoroutineScope;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import app.cash.broadway.screen.Screen;
import app.cash.passcode.flows.RealPasscodeFlowStarter;
import com.google.android.gms.internal.mlkit_vision_barcode.zzsc;
import com.squareup.cash.badging.db.BadgeQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.banking.backend.real.RealBankingOptionBadgeUpdater;
import com.squareup.cash.banking.screens.BalanceHomeScreen;
import com.squareup.cash.banking.screens.BankingDialogScreen;
import com.squareup.cash.banking.viewmodels.BankingSectionsViewModel;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.RealBlockersHelper;
import com.squareup.cash.data.blockers.RealBlockersHelper$Factory$Impl;
import com.squareup.cash.featureflags.AmplitudeExperiments$BitcoinStablecoinMvp;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.unicorn.BankingTab;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.InstanceFactory;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes5.dex */
public final class BankingSectionsPresenter implements MoleculeCallbackPresenter {
    public final Analytics analytics;
    public final RealBankingOptionBadgeUpdater bankingOptionBadgeUpdater;
    public final RealBlockersHelper blockersHelper;
    public final FeatureFlagManager featureFlagManager;
    public final BetterNavigator.ScreenNavigator navigator;
    public final RealRouter router;
    public final Screen screen;
    public final SyncValueReader syncValueReader;
    public final LinkedHashSet viewedRows;

    public BankingSectionsPresenter(Analytics analytics, SyncValueReader syncValueReader, FeatureFlagManager featureFlagManager, RealBlockersHelper$Factory$Impl realBlockersHelper$Factory$Impl, RealBankingOptionBadgeUpdater realBankingOptionBadgeUpdater, RealRouter$Factory$Impl realRouter$Factory$Impl, BalanceHomeScreen balanceHomeScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        balanceHomeScreen.getClass();
        this.analytics = analytics;
        this.syncValueReader = syncValueReader;
        this.featureFlagManager = featureFlagManager;
        this.bankingOptionBadgeUpdater = realBankingOptionBadgeUpdater;
        this.screen = balanceHomeScreen;
        this.navigator = screenNavigator;
        this.router = realRouter$Factory$Impl.create$1(screenNavigator);
        this.blockersHelper = realBlockersHelper$Factory$Impl.create(screenNavigator);
        this.viewedRows = new LinkedHashSet();
    }

    public static BankingDialogScreen.Dialog.Button toBankingButton(BankingTab.Dialog.Button button) {
        String str = button.text;
        str.getClass();
        BankingTab.Dialog.Button.Action_ action_ = button.Action;
        ClientScenario clientScenario = null;
        if (action_ != null) {
            BankingTab.Dialog.Button.Action_.ClientScenarioAction clientScenarioAction = action_ instanceof BankingTab.Dialog.Button.Action_.ClientScenarioAction ? (BankingTab.Dialog.Button.Action_.ClientScenarioAction) action_ : null;
            BankingTab.ClientScenarioAction value = clientScenarioAction != null ? clientScenarioAction.getValue() : null;
            if (value != null) {
                clientScenario = value.client_scenario;
            }
        }
        return new BankingDialogScreen.Dialog.Button(clientScenario, str);
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculeCallbackPresenter
    public final UiCallbackModel models(Composer composer) {
        Object obj;
        List<BankingTab.BankingTabSection> list;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-2074524403);
        StableCoroutineScope rememberStableCoroutineScope = zzsc.rememberStableCoroutineScope(gapComposer);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = this.syncValueReader.getSingleValue(AndroidSyncValueSpecs.BankingTab);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState collectAsState = Updater.collectAsState((StateFlow) rememberedValue, null, gapComposer, 1);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = Trace.valuesState(this.featureFlagManager, AmplitudeExperiments$BitcoinStablecoinMvp.INSTANCE);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        boolean enabled = ((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) Updater.collectAsState((StateFlow) rememberedValue2, null, gapComposer, 1).getValue()).enabled();
        BankingTab bankingTab = (BankingTab) collectAsState.getValue();
        if (bankingTab == null || (list = bankingTab.balance_home_sections) == null) {
            obj = BankingSectionsViewModel.Loading.INSTANCE;
        } else {
            List<BankingTab.BankingTabSection> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
            for (BankingTab.BankingTabSection bankingTabSection : list2) {
                List<BankingTab.Options> list3 = bankingTabSection.banking_options;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list3) {
                    BankingTab.BankingOption bankingOption = ((BankingTab.Options) obj2).banking_option;
                    if (!Intrinsics.areEqual(bankingOption != null ? bankingOption.id : null, "DEPOSIT_USDC") || enabled) {
                        arrayList2.add(obj2);
                    }
                }
                arrayList.add(BankingTab.BankingTabSection.copy$default(bankingTabSection, null, arrayList2, null, 5, null));
            }
            obj = new BankingSectionsViewModel.Loaded(arrayList);
        }
        boolean changed = gapComposer.changed(rememberStableCoroutineScope) | gapComposer.changed(this);
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (changed || rememberedValue3 == neverEqualPolicy) {
            rememberedValue3 = new BadgeQueries$$ExternalSyntheticLambda0(17, rememberStableCoroutineScope, this);
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        UiCallbackModel uiCallbackModel = new UiCallbackModel((Function1) rememberedValue3, obj);
        gapComposer.end(false);
        return uiCallbackModel;
    }

    /* loaded from: classes.dex */
    public final class MetroFactory {
        public final DoubleCheck analytics;
        public final Provider bankingOptionBadgeUpdater;
        public final Provider blockersHelperFactory;
        public final DoubleCheck featureFlagManager;
        public final Provider routerFactory;
        public final DoubleCheck syncValueReader;

        public MetroFactory(DoubleCheck doubleCheck, DoubleCheck doubleCheck2, RealPasscodeFlowStarter.MetroFactory metroFactory, DoubleCheck doubleCheck3, InstanceFactory instanceFactory, DoubleCheck doubleCheck4) {
            this.analytics = doubleCheck;
            this.syncValueReader = doubleCheck2;
            this.blockersHelperFactory = metroFactory;
            this.featureFlagManager = doubleCheck3;
            this.bankingOptionBadgeUpdater = instanceFactory;
            this.routerFactory = doubleCheck4;
        }

        public MetroFactory(DoubleCheck doubleCheck, DoubleCheck doubleCheck2, DoubleCheck doubleCheck3, InstanceFactory instanceFactory, IntentLauncher.MetroFactory metroFactory, InstanceFactory instanceFactory2) {
            this.analytics = doubleCheck;
            this.syncValueReader = doubleCheck2;
            this.featureFlagManager = doubleCheck3;
            this.blockersHelperFactory = instanceFactory;
            this.bankingOptionBadgeUpdater = metroFactory;
            this.routerFactory = instanceFactory2;
        }
    }
}
