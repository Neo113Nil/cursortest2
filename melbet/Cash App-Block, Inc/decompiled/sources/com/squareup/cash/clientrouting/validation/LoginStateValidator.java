package com.squareup.cash.clientrouting.validation;

import app.cash.molecule.PlatformKt;
import com.google.mlkit.common.internal.zza;
import com.squareup.cash.clientroutes.AuthenticationRequirement;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientrouting.UtilsKt;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.clientrouting.validation.ValidatorResult;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.session.backend.SessionState;
import timber.log.Timber;

/* loaded from: classes.dex */
public final class LoginStateValidator implements Validator {
    public final /* synthetic */ int $r8$classId = 1;
    public final SessionManager sessionManager;

    public LoginStateValidator(SessionManager sessionManager) {
        this.sessionManager = sessionManager;
    }

    @Override // com.squareup.cash.clientrouting.validation.Validator
    public final ValidatorResult validate(ClientRoute clientRoute, RoutingParams routingParams) {
        int i = this.$r8$classId;
        ValidatorResult.Allowed allowed = ValidatorResult.Allowed.INSTANCE;
        SessionManager sessionManager = this.sessionManager;
        clientRoute.getClass();
        routingParams.getClass();
        switch (i) {
            case 0:
                boolean hasOnboardedAccount = ValidationUtilsKt.isClientRouteAFlowOrFlowTypeRoute(clientRoute) ? PlatformKt.getCurrentSessionState(sessionManager) instanceof SessionState.Authenticated : PlatformKt.hasOnboardedAccount(sessionManager);
                if ((ValidationUtilsKt.isClientRouteAFlowOrFlowTypeRoute(clientRoute) ? AuthenticationRequirement.SIGNED_IN : clientRoute.getSpec().getRequiredAuthenticationState()) != AuthenticationRequirement.SIGNED_IN || hasOnboardedAccount) {
                    return allowed;
                }
                Timber.Forest.i(clientRoute + " has logged_in authentication but user is not authenticated.", new Object[0]);
                return new ValidatorResult.NotAllowed(ValidatorResult.NotAllowed.Reason.LOGGED_IN_ROUTE_ACCOUNT_NOT_AUTHENTICATED);
            default:
                return ((clientRoute instanceof ClientRoute.Flow) && UtilsKt.containsCashAppPayGrantDeepLink(routingParams) && !PlatformKt.hasOnboardedAccount(sessionManager)) ? new ValidatorResult.NotAllowed(ValidatorResult.NotAllowed.Reason.CASH_APP_PAY_ONBOARDING) : allowed;
        }
    }

    public LoginStateValidator(SessionManager sessionManager, zza zzaVar) {
        this.sessionManager = sessionManager;
    }
}
