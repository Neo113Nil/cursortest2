package com.squareup.cash.activity.presenters;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import app.cash.badging.backend.RealBadger2$scheduleBadgeClearingWork$$inlined$map$1;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.account.presenters.EditProfilePresenter$models$2$1;
import com.squareup.cash.activity.viewmodels.ActivityInviteItemViewModel;
import com.squareup.cash.common.moneyformatter.MoneyFormatterConfig;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.db.AppConfigManager;
import com.squareup.cash.data.db.RealAppConfigManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.resource.text.AndroidStringManager;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes5.dex */
public final class ActivityInviteItemPresenter implements MoleculePresenter {
    public final Analytics analytics;
    public final AppConfigManager appConfig;
    public final FlowStarter flowStarter;
    public final MoneyFormatter moneyFormatter;
    public final BetterNavigator.ScreenNavigator navigator;
    public final Screen screen;
    public final AndroidStringManager stringManager;

    public ActivityInviteItemPresenter(FlowStarter flowStarter, AppConfigManager appConfigManager, AndroidStringManager androidStringManager, Analytics analytics, LocalizedMoneyFormatter.Factory factory, BetterNavigator.ScreenNavigator screenNavigator, Screen screen) {
        screen.getClass();
        this.flowStarter = flowStarter;
        this.appConfig = appConfigManager;
        this.stringManager = androidStringManager;
        this.analytics = analytics;
        this.navigator = screenNavigator;
        this.screen = screen;
        this.moneyFormatter = factory.create(MoneyFormatterConfig.COMPACT);
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final ActivityInviteItemViewModel models(Flow flow, Composer composer, int i) {
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-870600341);
        Object rememberedValue = gapComposer.rememberedValue();
        if (rememberedValue == Composer.Companion.Empty) {
            RealBadger2$scheduleBadgeClearingWork$$inlined$map$1 realBadger2$scheduleBadgeClearingWork$$inlined$map$1 = new RealBadger2$scheduleBadgeClearingWork$$inlined$map$1(((RealAppConfigManager) this.appConfig).invitationConfig(), this, 14);
            gapComposer.updateRememberedValue(realBadger2$scheduleBadgeClearingWork$$inlined$map$1);
            rememberedValue = realBadger2$scheduleBadgeClearingWork$$inlined$map$1;
        }
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue, ActivityInviteItemViewModel.Loading.INSTANCE, null, gapComposer, 0, 2);
        Updater.LaunchedEffect(gapComposer, flow, new EditProfilePresenter$models$2$1(flow, (Continuation) null, this, 13));
        ActivityInviteItemViewModel activityInviteItemViewModel = (ActivityInviteItemViewModel) collectAsState.getValue();
        gapComposer.end(false);
        return activityInviteItemViewModel;
    }
}
