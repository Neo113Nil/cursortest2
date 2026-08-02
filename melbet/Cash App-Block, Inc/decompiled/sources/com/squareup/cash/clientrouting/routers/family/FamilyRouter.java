package com.squareup.cash.clientrouting.routers.family;

import app.cash.broadway.navigation.Navigator;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.family.familyhub.backend.api.ControlType;
import com.squareup.cash.family.familyhub.screens.DependentControlScreen;
import com.squareup.cash.family.familyhub.screens.DependentControlsAndLimitsScreen;
import com.squareup.cash.family.familyhub.screens.DependentGeneralSavingsScreen;
import com.squareup.cash.family.familyhub.screens.FamilyHome;
import com.squareup.cash.family.familyhub.screens.FamilyPendingRequestsScreen;
import com.squareup.cash.family.familyhub.screens.SponsorResourcesScreen;
import com.squareup.cash.family.safetyhub.screens.SafetyHubScreens;
import com.squareup.cash.savings.backend.api.model.SavingsScreen;
import com.squareup.protos.cash.aegis.core.PendingRequestsParams;
import com.squareup.wire.ProtoAdapter;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class FamilyRouter {
    public final Navigator navigator;

    public FamilyRouter(Navigator navigator) {
        navigator.getClass();
        this.navigator = navigator;
    }

    public final void route(ClientRoute.ViewFamilyPendingRequests viewFamilyPendingRequests) {
        viewFamilyPendingRequests.getClass();
        ProtoAdapter protoAdapter = PendingRequestsParams.ADAPTER;
        ByteString.Companion companion = ByteString.Companion;
        ByteString decodeBase64 = ByteString.Companion.decodeBase64(viewFamilyPendingRequests.familyPendingRequestsParameters);
        decodeBase64.getClass();
        this.navigator.goTo(new FamilyPendingRequestsScreen((PendingRequestsParams) protoAdapter.decode(decodeBase64)));
    }

    public final void route(ClientRoute.ViewFamilyPendingRequestsWithoutParams viewFamilyPendingRequestsWithoutParams) {
        viewFamilyPendingRequestsWithoutParams.getClass();
        this.navigator.goTo(new FamilyPendingRequestsScreen(null));
    }

    public final void route(ClientRoute.ViewFamilyHome viewFamilyHome, RoutingParams routingParams) {
        viewFamilyHome.getClass();
        routingParams.getClass();
        this.navigator.goTo(new FamilyHome(null, null, routingParams.exitScreen, 3));
    }

    public final void route(ClientRoute.ViewFamilyHomeForNewDependent viewFamilyHomeForNewDependent, RoutingParams routingParams) {
        viewFamilyHomeForNewDependent.getClass();
        routingParams.getClass();
        this.navigator.goTo(new FamilyHome(null, viewFamilyHomeForNewDependent.customerToken, routingParams.exitScreen, 1));
    }

    public final void route(ClientRoute.ViewNotificationCategoryDetails viewNotificationCategoryDetails) {
        viewNotificationCategoryDetails.getClass();
        this.navigator.goTo(new DependentControlScreen.Toggle(ControlType.NOTIFICATIONS, viewNotificationCategoryDetails.categoryIdentifier));
    }

    public final void route(ClientRoute.ViewSponsorResources viewSponsorResources, RoutingParams routingParams) {
        viewSponsorResources.getClass();
        routingParams.getClass();
        this.navigator.goTo(SponsorResourcesScreen.INSTANCE);
    }

    public final void route(ClientRoute.ViewDependentSavingsGeneralFolder viewDependentSavingsGeneralFolder) {
        viewDependentSavingsGeneralFolder.getClass();
        this.navigator.goTo(new DependentGeneralSavingsScreen(viewDependentSavingsGeneralFolder.dependenttoken, SavingsScreen.ScreenType.GeneralSavings.INSTANCE));
    }

    public final void route(ClientRoute.ViewDependentSavingsGoal viewDependentSavingsGoal) {
        viewDependentSavingsGoal.getClass();
        this.navigator.goTo(new DependentGeneralSavingsScreen(viewDependentSavingsGoal.dependenttoken, new SavingsScreen.ScreenType.GoalDetail(viewDependentSavingsGoal.goaltoken)));
    }

    public final void route(ClientRoute.ViewDependentSavingsHome viewDependentSavingsHome) {
        viewDependentSavingsHome.getClass();
        this.navigator.goTo(new DependentGeneralSavingsScreen(viewDependentSavingsHome.dependenttoken, SavingsScreen.ScreenType.Home.INSTANCE));
    }

    public final void route(ClientRoute.ViewDependentControls viewDependentControls) {
        viewDependentControls.getClass();
        this.navigator.goTo(new DependentControlsAndLimitsScreen(viewDependentControls.customerToken, false));
    }

    public final void route(ClientRoute.ViewFamilySafetyEducationHub viewFamilySafetyEducationHub) {
        viewFamilySafetyEducationHub.getClass();
        this.navigator.goTo(SafetyHubScreens.SafetyHubScreen.INSTANCE);
    }
}
