package com.squareup.cash.card.onboarding;

import android.os.Build;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.local.db.LocalTabContentQueries;
import app.cash.local.views.wallet.TabContentViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.blockers.flowlistener.BlockerFlowListener;
import com.squareup.cash.blockers.views.PlaidLinkView;
import com.squareup.cash.card.onboarding.CardPreviewViewModel;
import com.squareup.cash.card.onboarding.screens.CardPreviewScreen;
import com.squareup.cash.cdf.cashcard.CashCardCustomizePreviewPerformance;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.RealBlockersHelper$skipBlocker$1;
import com.squareup.cash.data.db.AppConfigManager;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$DisableFilament;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.filament.RealFilamentSupportProvider;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.protos.franklin.api.CardCustomizationBlocker;
import com.squareup.protos.franklin.app.AppService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes6.dex */
public final class CardPreviewPresenter implements MoleculePresenter {
    public final Analytics analytics;
    public final AppConfigManager appConfig;
    public final AppService appService;
    public final CardPreviewScreen args;
    public final BlockerFlowListener blockerFlowAnalytics;
    public final BlockersDataNavigator blockersNavigator;
    public final LocalTabContentQueries cardStudioQueries;
    public final RealFilamentSupportProvider filamentSupportProvider;
    public boolean hasCustomization;
    public final CoroutineContext ioDispatcher;
    public final boolean isFilamentDisabled;
    public final BetterNavigator.ScreenNavigator navigator;
    public final RealProfileManager profileManager;
    public final AndroidStringManager stringManager;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CardCustomizationBlocker.CardOption.CashtagDisplay.values().length];
            try {
                iArr[CardCustomizationBlocker.CardOption.CashtagDisplay.ALWAYS_HIDDEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CardCustomizationBlocker.CardOption.CashtagDisplay.OPTIONAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CardCustomizationBlocker.CardOption.CashtagDisplay.ALWAYS_SHOW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public CardPreviewPresenter(CardPreviewScreen cardPreviewScreen, BetterNavigator.ScreenNavigator screenNavigator, CoroutineContext coroutineContext, RealProfileManager realProfileManager, AppConfigManager appConfigManager, AppService appService, Analytics analytics, BlockerFlowListener blockerFlowListener, AndroidStringManager androidStringManager, BlockersDataNavigator blockersDataNavigator, RealCardDetailsCreator realCardDetailsCreator, FeatureFlagManager featureFlagManager, RealFilamentSupportProvider realFilamentSupportProvider, CashAccountDatabaseImpl cashAccountDatabaseImpl) {
        cardPreviewScreen.getClass();
        this.args = cardPreviewScreen;
        this.navigator = screenNavigator;
        this.ioDispatcher = coroutineContext;
        this.profileManager = realProfileManager;
        this.appConfig = appConfigManager;
        this.appService = appService;
        this.analytics = analytics;
        this.blockerFlowAnalytics = blockerFlowListener;
        this.stringManager = androidStringManager;
        this.blockersNavigator = blockersDataNavigator;
        this.filamentSupportProvider = realFilamentSupportProvider;
        this.cardStudioQueries = cashAccountDatabaseImpl.cardStudioQueries;
        this.isFilamentDisabled = ((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$DisableFilament.INSTANCE)).enabled();
    }

    public static final void access$trackFpsMetadata(CardPreviewPresenter cardPreviewPresenter, String str, int i) {
        if (i > 0) {
            Analytics analytics = cardPreviewPresenter.analytics;
            String str2 = Build.MODEL;
            String str3 = (String) cardPreviewPresenter.filamentSupportProvider.renderer$delegate.getValue();
            if (str3 == null) {
                str3 = "Unknown";
            }
            analytics.track(new CashCardCustomizePreviewPerformance(Integer.valueOf(i), str3, str, cardPreviewPresenter.isFilamentDisabled ? "filament_disabled" : "filament_rx"), null);
        }
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(1659636273);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = Updater.mutableStateOf$default(CardPreviewViewModel.Loading.INSTANCE);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = Updater.derivedStateOf(new TabContentViewKt$$ExternalSyntheticLambda1(25, mutableState));
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        State state = (State) rememberedValue2;
        Unit unit = Unit.INSTANCE;
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue3 == neverEqualPolicy) {
            rememberedValue3 = new PlaidLinkView.AnonymousClass2(this, mutableState, (Continuation) null, 16);
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue3);
        Updater.LaunchedEffect(gapComposer, flow, new RealBlockersHelper$skipBlocker$1(flow, (Continuation) null, this, mutableState, state, 4));
        CardPreviewViewModel cardPreviewViewModel = (CardPreviewViewModel) mutableState.getValue();
        gapComposer.end(false);
        return cardPreviewViewModel;
    }
}
