package com.squareup.cash.account.presenters.accountswitcher;

import app.cash.broadway.screen.Screen;
import app.cash.local.presenters.pos.LocalPosCheckInPresenter;
import com.squareup.cash.account.screens.AddAccountScreen;
import com.squareup.cash.account.viewmodels.accountswitcher.AddAccountOptionsViewEvent$OptionClicked;
import com.squareup.cash.account.viewmodels.accountswitcher.AddAccountOptionsViewModel;
import com.squareup.cash.cdf.account.AccountSwitchAccountViewAddAccount;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.blockers.RealFlowStarter;
import com.squareup.cash.eligibility.backend.api.SettingVisibility;
import com.squareup.cash.eligibility.backend.real.RealSettingsEligibilityManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.payments.screens.PaymentScreens$HomeScreens$Home;
import com.squareup.protos.cash.cashbusinessaccounts.plasma.v1.C4BOnboardingFlowParameters;
import com.squareup.protos.cash.janus.api.CreateSecondaryPersonalAccountEntryPoint;
import com.squareup.protos.cash.plasma.flows.Flow$Type;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes5.dex */
public final class AddAccountOptionsPresenter$models$1$1$3 implements FlowCollector {
    public final /* synthetic */ String $flowToken;
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ LocalPosCheckInPresenter this$0;

    public AddAccountOptionsPresenter$models$1$1$3(LocalPosCheckInPresenter localPosCheckInPresenter, String str) {
        this.this$0 = localPosCheckInPresenter;
        this.$flowToken = str;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        LocalPosCheckInPresenter localPosCheckInPresenter = this.this$0;
        String str = this.$flowToken;
        switch (i) {
            case 0:
                Map map = (Map) obj;
                Analytics analytics = (Analytics) localPosCheckInPresenter.store;
                Object obj2 = map.get(AddAccountOptionsViewModel.Loaded.AccountOption.OptionType.Personal);
                SettingVisibility settingVisibility = SettingVisibility.VISIBLE;
                analytics.track(new AccountSwitchAccountViewAddAccount(str, Boolean.valueOf(obj2 == settingVisibility), Boolean.valueOf(map.get(AddAccountOptionsViewModel.Loaded.AccountOption.OptionType.Business) == settingVisibility), Boolean.valueOf(map.get(AddAccountOptionsViewModel.Loaded.AccountOption.OptionType.Link) == settingVisibility)), null);
                return Unit.INSTANCE;
            default:
                AddAccountScreen addAccountScreen = (AddAccountScreen) localPosCheckInPresenter.cameraPermissions;
                FlowStarter flowStarter = (FlowStarter) localPosCheckInPresenter.launcher;
                BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) localPosCheckInPresenter.navigator;
                RealSettingsEligibilityManager realSettingsEligibilityManager = (RealSettingsEligibilityManager) localPosCheckInPresenter.stringManager;
                AddAccountOptionsViewEvent$OptionClicked addAccountOptionsViewEvent$OptionClicked = (AddAccountOptionsViewEvent$OptionClicked) obj;
                if (addAccountOptionsViewEvent$OptionClicked == null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                int ordinal = addAccountOptionsViewEvent$OptionClicked.option.ordinal();
                if (ordinal == 0) {
                    realSettingsEligibilityManager.cachedSettingsResult = null;
                    screenNavigator.goTo(((RealFlowStarter) flowStarter).startPersonalAccountCreationFlow(str, addAccountScreen.exitScreen, CreateSecondaryPersonalAccountEntryPoint.ACCOUNT_SWITCHER));
                } else if (ordinal == 1) {
                    realSettingsEligibilityManager.cachedSettingsResult = null;
                    screenNavigator.goTo(((RealFlowStarter) flowStarter).startBusinessAccountCreationFlow(addAccountScreen.exitScreen, C4BOnboardingFlowParameters.EntryPoint.ENTRY_POINT_ACCOUNT_SWITCHER, str));
                } else {
                    if (ordinal != 2) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    realSettingsEligibilityManager.cachedSettingsResult = null;
                    Screen screen = addAccountScreen.exitScreen;
                    RealFlowStarter realFlowStarter = (RealFlowStarter) flowStarter;
                    Flow$Type flow$Type = Flow$Type.ACCOUNT_LINKING;
                    if (screen == null) {
                        screen = PaymentScreens$HomeScreens$Home.INSTANCE;
                    }
                    screenNavigator.goTo(FlowStarter.startPlasmaFlow$default(realFlowStarter, flow$Type, screen, null, null, 12));
                }
                return Unit.INSTANCE;
        }
    }

    public AddAccountOptionsPresenter$models$1$1$3(CoroutineScope coroutineScope, LocalPosCheckInPresenter localPosCheckInPresenter, String str) {
        this.this$0 = localPosCheckInPresenter;
        this.$flowToken = str;
    }
}
