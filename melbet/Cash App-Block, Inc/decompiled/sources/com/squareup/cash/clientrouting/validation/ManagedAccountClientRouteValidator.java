package com.squareup.cash.clientrouting.validation;

import app.cash.broadway.screen.Screen;
import com.squareup.cash.cdf.clientroute.ClientRouteManagedAccountRouteAttempt;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.clientrouting.validation.ValidatorResult;
import com.squareup.cash.family.profileselection.api.FamilyProfile;
import com.squareup.cash.family.profileselection.real.RealFamilyProfileManager;
import com.squareup.cash.integration.analytics.Analytics;

/* loaded from: classes.dex */
public final class ManagedAccountClientRouteValidator implements Validator {
    public final Analytics analytics;
    public final RealFamilyProfileManager familyProfileManager;

    public ManagedAccountClientRouteValidator(Analytics analytics, RealFamilyProfileManager realFamilyProfileManager) {
        this.analytics = analytics;
        this.familyProfileManager = realFamilyProfileManager;
    }

    @Override // com.squareup.cash.clientrouting.validation.Validator
    public final ValidatorResult validate(ClientRoute clientRoute, RoutingParams routingParams) {
        clientRoute.getClass();
        routingParams.getClass();
        if (this.familyProfileManager.familyProfile.$$delegate_0.getValue() instanceof FamilyProfile.ManagedAccount) {
            Screen origin = routingParams.getOrigin();
            String simpleName = origin != null ? origin.getClass().getSimpleName() : null;
            Boolean valueOf = Boolean.valueOf(routingParams.getDeepLinkMetadata() != null);
            String name = clientRoute.getSpec().getName();
            String pathFormat = clientRoute.getSpec().getPathFormat();
            ClientRouteManagedAccountRouteAttempt.ManagedAccountRouteOutcome managedAccountRouteOutcome = ClientRouteManagedAccountRouteAttempt.ManagedAccountRouteOutcome.ROUTED;
            this.analytics.track(new ClientRouteManagedAccountRouteAttempt(valueOf, simpleName, name, pathFormat), null);
        }
        return ValidatorResult.Allowed.INSTANCE;
    }
}
