package com.squareup.cash.growtools.presenters.manager.activity;

import app.cash.molecule.PlatformKt;
import com.squareup.cash.R;
import com.squareup.cash.activity.backend.loader.ActivitiesCache;
import com.squareup.cash.activity.backend.loader.ActivitiesManager;
import com.squareup.cash.activity.backend.loader.RealActivitiesCacheManager;
import com.squareup.cash.activity.presenters.ActivityEmbeddedPresenter$Companion;
import com.squareup.cash.activity.presenters.DefaultActivityItemEventHandler$Factory$Impl;
import com.squareup.cash.activity.presenters.RealActivityEmbeddedPresenter;
import com.squareup.cash.activity.presenters.RealActivityEmbeddedPresenter$Factory$Impl;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.family.profileselection.api.FamilyProfile;
import com.squareup.cash.growtools.screens.GrowToolsManagerScreen;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.maps.views.ClusterItemKt$$ExternalSyntheticLambda0;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.kotterknife.Lazy;
import com.squareup.protos.cash.activity.api.v1.ActivityClientService;
import com.squareup.protos.cash.activity.api.v1.ActivityScope;
import com.squareup.protos.cash.activity.api.v1.ActivityToken;
import com.squareup.protos.cash.activity.api.v1.ActivityTokenType;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.NotImplementedError;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.KotlinGenericDeclarationKt;
import papa.InputEventTrigger;

/* loaded from: classes6.dex */
public final class RealGrowToolsActivityPresenterFactory {
    public final RealActivitiesCacheManager activitiesCacheManager;
    public final RealActivityEmbeddedPresenter$Factory$Impl activityEmbeddedPresenterFactory;
    public final DefaultActivityItemEventHandler$Factory$Impl defaultActivityItemEventHandlerFactory;
    public final GrowToolsActivityItemEventDecorator$Factory$Impl growToolsActivityItemEventDecoratorFactory;
    public final GrowToolsActivitySearchRequestHandler$Factory$Impl growToolsActivityRequestHandlerFactory;
    public final SessionManager sessionManager;
    public final AndroidStringManager stringManager;

    public RealGrowToolsActivityPresenterFactory(SessionManager sessionManager, GrowToolsActivitySearchRequestHandler$Factory$Impl growToolsActivitySearchRequestHandler$Factory$Impl, RealActivitiesCacheManager realActivitiesCacheManager, GrowToolsActivityItemEventDecorator$Factory$Impl growToolsActivityItemEventDecorator$Factory$Impl, DefaultActivityItemEventHandler$Factory$Impl defaultActivityItemEventHandler$Factory$Impl, AndroidStringManager androidStringManager, RealActivityEmbeddedPresenter$Factory$Impl realActivityEmbeddedPresenter$Factory$Impl) {
        this.sessionManager = sessionManager;
        this.growToolsActivityRequestHandlerFactory = growToolsActivitySearchRequestHandler$Factory$Impl;
        this.activitiesCacheManager = realActivitiesCacheManager;
        this.growToolsActivityItemEventDecoratorFactory = growToolsActivityItemEventDecorator$Factory$Impl;
        this.defaultActivityItemEventHandlerFactory = defaultActivityItemEventHandler$Factory$Impl;
        this.stringManager = androidStringManager;
        this.activityEmbeddedPresenterFactory = realActivityEmbeddedPresenter$Factory$Impl;
    }

    public final RealActivityEmbeddedPresenter create(GrowToolsManagerScreen growToolsManagerScreen, BetterNavigator.ScreenNavigator screenNavigator, FamilyProfile familyProfile) {
        String str;
        growToolsManagerScreen.getClass();
        ListBuilder activityClassifiers = KotlinGenericDeclarationKt.getActivityClassifiers(growToolsManagerScreen);
        boolean z = growToolsManagerScreen instanceof GrowToolsManagerScreen.ManageAutoInvestScreen;
        AndroidStringManager androidStringManager = this.stringManager;
        if (z) {
            if (GrowToolsProductClassifierUtilsKt$WhenMappings.$EnumSwitchMapping$0[((GrowToolsManagerScreen.ManageAutoInvestScreen) growToolsManagerScreen).origin.ordinal()] != 1) {
                throw new NotImplementedError("An operation is not implemented: Not supported yet");
            }
            str = androidStringManager.get(R.string.grow_tools_auto_invest_bitcoin_empty_activity);
        } else if (growToolsManagerScreen instanceof GrowToolsManagerScreen.ManageDirectDepositScreen) {
            if (GrowToolsProductClassifierUtilsKt$WhenMappings.$EnumSwitchMapping$0[((GrowToolsManagerScreen.ManageDirectDepositScreen) growToolsManagerScreen).origin.ordinal()] != 1) {
                throw new NotImplementedError("An operation is not implemented: Not supported yet");
            }
            str = androidStringManager.get(R.string.grow_tools_direct_deposit_bitcoin_empty_activity);
        } else if (growToolsManagerScreen instanceof GrowToolsManagerScreen.ManageRoundUpsScreen) {
            if (GrowToolsProductClassifierUtilsKt$WhenMappings.$EnumSwitchMapping$0[((GrowToolsManagerScreen.ManageRoundUpsScreen) growToolsManagerScreen).origin.ordinal()] == 1) {
                str = androidStringManager.get(R.string.grow_tools_roundups_bitcoin_empty_activity);
            } else if (familyProfile == null || familyProfile.equals(FamilyProfile.Standard.INSTANCE)) {
                str = androidStringManager.get(R.string.grow_tools_roundups_empty_activity);
            } else {
                if (!(familyProfile instanceof FamilyProfile.ManagedAccount)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                str = androidStringManager.get(R.string.grow_tools_roundups_empty_activity_managed_account);
            }
        } else if (growToolsManagerScreen instanceof GrowToolsManagerScreen.ManageReceiveP2PAsBitcoinScreen) {
            str = androidStringManager.get(R.string.grow_tools_receive_p2p_as_bitcoin_empty_activity);
        } else {
            if (!(growToolsManagerScreen instanceof GrowToolsManagerScreen.ManageBitcoinAutoWithdrawScreen)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            str = androidStringManager.get(R.string.grow_tools_bitcoin_auto_withdraw_empty_activity);
        }
        String str2 = str;
        ActivityToken activityToken = new ActivityToken(ActivityTokenType.CUSTOMER_TOKEN, PlatformKt.activeAccountToken(this.sessionManager), (String) null, 12);
        ActivityScope activityScope = ActivityScope.GROW_TOOLS;
        activityClassifiers.getClass();
        ActivityClientService activityClientService = (ActivityClientService) this.growToolsActivityRequestHandlerFactory.delegateFactory.sandboxer.invoke();
        activityClientService.getClass();
        ActivitiesManager.ActivityContext activityContext = new ActivitiesManager.ActivityContext(activityToken, activityScope, new GrowToolsActivitySearchRequestHandler(activityClientService, activityClassifiers), 8);
        ActivitiesCache take$default = RealActivitiesCacheManager.take$default(this.activitiesCacheManager, activityClassifiers);
        Analytics analytics = (Analytics) this.growToolsActivityItemEventDecoratorFactory.delegateFactory.staticImageLoader.invoke();
        analytics.getClass();
        return this.activityEmbeddedPresenterFactory.create(screenNavigator, ActivityEmbeddedPresenter$Companion.EmbeddedRecentsConfiguration$default(activityContext, take$default, growToolsManagerScreen, new ClusterItemKt$$ExternalSyntheticLambda0(8), 0, str2, null, InputEventTrigger.Companion.decoratedWith(this.defaultActivityItemEventHandlerFactory, new Lazy(analytics, growToolsManagerScreen)), null, null, 7528));
    }
}
