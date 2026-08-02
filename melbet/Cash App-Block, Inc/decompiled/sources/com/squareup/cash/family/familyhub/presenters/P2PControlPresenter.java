package com.squareup.cash.family.familyhub.presenters;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import androidx.compose.runtime.GapComposer;
import com.google.android.gms.internal.mlkit_genai_prompt.zzki;
import com.squareup.cash.R;
import com.squareup.cash.cdf.sponsoredaccount.DependentControlType;
import com.squareup.cash.cdf.sponsoredaccount.SponsoredAccountManageToggleDependentControl;
import com.squareup.cash.cdf.sponsoredaccount.ToggleValue;
import com.squareup.cash.common.moneyformatter.MoneyFormatterConfig;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.db2.profile.ProfileQueries$$ExternalSyntheticLambda13;
import com.squareup.cash.family.familyhub.backend.api.ControlType;
import com.squareup.cash.family.familyhub.backend.api.DependentControlStatus;
import com.squareup.cash.family.familyhub.screens.ControlDisablingConfirmationScreen;
import com.squareup.cash.family.familyhub.screens.DependentControlScreen;
import com.squareup.cash.family.familyhub.screens.SetDependentCustomLimitScreen;
import com.squareup.cash.family.familyhub.viewmodels.DependentControlViewEvent;
import com.squareup.cash.family.familyhub.viewmodels.DependentControlViewEvent$ToggleEvent$LimitClicked;
import com.squareup.cash.family.familyhub.viewmodels.DependentControlViewEvent$ToggleEvent$ToggleChanged;
import com.squareup.cash.family.familyhub.viewmodels.DependentControlViewModel;
import com.squareup.cash.family.familyhub.viewmodels.DependentControlsLimitsViewModel;
import com.squareup.cash.family.familyhub.viewmodels.DependentControlsToggleViewModel;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$FamiliesSponsorDrivenP2pLimits;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.fidesmo.real.RealFidesmoClient$observeDeviceState$1;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.protos.common.Money;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes6.dex */
public final class P2PControlPresenter extends BaseDependentControlPresenter {
    public final FeatureFlagManager featureFlagManager;
    public final MoneyFormatter moneyFormatter;
    public final boolean shouldShowLimits;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P2PControlPresenter(BaseDependentControlDependencies baseDependentControlDependencies, FeatureFlagManager featureFlagManager, LocalizedMoneyFormatter.Factory factory, DependentControlScreen.Toggle toggle, BetterNavigator.ScreenNavigator screenNavigator, CoroutineScope coroutineScope) {
        super(baseDependentControlDependencies, toggle, screenNavigator, coroutineScope);
        toggle.getClass();
        this.featureFlagManager = featureFlagManager;
        this.moneyFormatter = factory.create(MoneyFormatterConfig.COMPACT);
        this.shouldShowLimits = ((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$FamiliesSponsorDrivenP2pLimits.INSTANCE)).enabled();
    }

    @Override // com.squareup.cash.family.familyhub.presenters.BaseDependentControlPresenter
    public final DependentControlViewModel createViewModel(String str, DependentControlStatus dependentControlStatus, GapComposer gapComposer) {
        DependentControlsLimitsViewModel dependentControlsLimitsViewModel;
        String str2;
        String str3;
        Money money;
        Money money2;
        str.getClass();
        dependentControlStatus.getClass();
        gapComposer.startReplaceGroup(807323557);
        AndroidStringManager androidStringManager = this.deps.stringManager;
        Resources resources = androidStringManager.resources;
        resources.getClass();
        String format2 = new MessageFormat(resources.getString(R.string.family_account_dependent_p2p_controls_screen_title)).format(new Object[]{str});
        format2.getClass();
        ControlType controlType = ControlType.P2P;
        String str4 = androidStringManager.get(R.string.family_account_dependent_payments_toggle_title);
        Resources resources2 = androidStringManager.resources;
        resources2.getClass();
        String format3 = new MessageFormat(resources2.getString(R.string.family_account_dependent_controls_payments_description)).format(new Object[]{str});
        format3.getClass();
        DependentControlsToggleViewModel dependentControlsToggleViewModel = new DependentControlsToggleViewModel(str4, format3, null, zzki.enabled(dependentControlStatus));
        if (this.shouldShowLimits) {
            DependentControlStatus.Loaded.LoadedP2PControl loadedP2PControl = dependentControlStatus instanceof DependentControlStatus.Loaded.LoadedP2PControl ? (DependentControlStatus.Loaded.LoadedP2PControl) dependentControlStatus : null;
            String str5 = androidStringManager.get(R.string.allow_list_toggle_row_send_limit_title);
            MoneyFormatter moneyFormatter = this.moneyFormatter;
            if (loadedP2PControl == null || (money2 = loadedP2PControl.remainingUsage) == null) {
                str2 = null;
            } else {
                String format4 = moneyFormatter.format(money2);
                format4.getClass();
                resources2.getClass();
                String format5 = new MessageFormat(resources2.getString(R.string.family_account_dependent_limits_subtitle)).format(new Object[]{format4});
                format5.getClass();
                str2 = format5;
            }
            if (loadedP2PControl == null || (money = loadedP2PControl.currentLimit) == null || (str3 = moneyFormatter.format(money)) == null) {
                str3 = androidStringManager.get(R.string.allow_list_toggle_row_send_limit_not_set);
            }
            dependentControlsLimitsViewModel = new DependentControlsLimitsViewModel(str5, str2, str3, (loadedP2PControl != null ? loadedP2PControl.currentLimit : null) == null, true);
        } else {
            dependentControlsLimitsViewModel = null;
        }
        boolean isLoading = zzki.isLoading(dependentControlStatus);
        resources2.getClass();
        String format6 = new MessageFormat(resources2.getString(R.string.family_account_dependent_payments_footer)).format(new Object[]{str});
        format6.getClass();
        DependentControlViewModel.Toggle toggle = new DependentControlViewModel.Toggle(format2, controlType, dependentControlsToggleViewModel, dependentControlsLimitsViewModel, isLoading, format6, null);
        gapComposer.end(false);
        return toggle;
    }

    @Override // com.squareup.cash.family.familyhub.presenters.BaseDependentControlPresenter
    public final ControlType getControlType() {
        return ControlType.P2P;
    }

    @Override // com.squareup.cash.family.familyhub.presenters.BaseDependentControlPresenter
    public final Object handleControlSpecificEvent(DependentControlViewEvent dependentControlViewEvent, String str, DependentControlStatus dependentControlStatus, RealFidesmoClient$observeDeviceState$1 realFidesmoClient$observeDeviceState$1) {
        boolean z = dependentControlViewEvent instanceof DependentControlViewEvent$ToggleEvent$ToggleChanged;
        BetterNavigator.ScreenNavigator screenNavigator = this.navigator;
        DependentControlScreen dependentControlScreen = this.args;
        if (z) {
            if (((DependentControlViewEvent$ToggleEvent$ToggleChanged) dependentControlViewEvent).enabled) {
                this.deps.analytics.track(new SponsoredAccountManageToggleDependentControl(DependentControlType.P2PTransactions, ToggleValue.Enabled, ((DependentControlScreen.Toggle) dependentControlScreen).dependentCustomerToken), null);
                Object dependentControlStatus2 = getControlStatusManager().setDependentControlStatus(true, realFidesmoClient$observeDeviceState$1);
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (dependentControlStatus2 != coroutineSingletons) {
                    dependentControlStatus2 = Unit.INSTANCE;
                }
                return dependentControlStatus2 == coroutineSingletons ? dependentControlStatus2 : Unit.INSTANCE;
            }
            screenNavigator.askQuestion(ControlDisablingConfirmationScreen.DisablingConfirmationQuestion.INSTANCE, new ProfileQueries$$ExternalSyntheticLambda13(28, this, str));
        } else if (dependentControlViewEvent instanceof DependentControlViewEvent$ToggleEvent$LimitClicked) {
            if (((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) this.featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$FamiliesSponsorDrivenP2pLimits.INSTANCE)).enabled()) {
                DependentControlStatus.Loaded.LoadedP2PControl loadedP2PControl = dependentControlStatus instanceof DependentControlStatus.Loaded.LoadedP2PControl ? (DependentControlStatus.Loaded.LoadedP2PControl) dependentControlStatus : null;
                if (loadedP2PControl != null) {
                    List list = loadedP2PControl.limitPresets;
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        Long l = ((Money) it.next()).amount;
                        if (l != null) {
                            arrayList.add(l);
                        }
                    }
                    String str2 = ((DependentControlScreen.Toggle) dependentControlScreen).dependentCustomerToken;
                    Money money = loadedP2PControl.currentLimit;
                    Long l2 = loadedP2PControl.maxLimit.amount;
                    screenNavigator.goTo(new SetDependentCustomLimitScreen(str2, new SetDependentCustomLimitScreen.LimitCategory.P2PSend(money, arrayList, l2 != null ? l2.longValue() : 250000L, str), ControlType.P2P));
                }
            }
        }
        return Unit.INSTANCE;
    }
}
