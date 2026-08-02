package com.squareup.cash.clientrouting.validation;

import com.squareup.cash.clientroutes.AccountRequirement;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.clientrouting.validation.ValidatorResult;

/* loaded from: classes.dex */
public final class AccountRequirementValidator implements Validator {

    /* loaded from: classes6.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AccountRequirement.Value.values().length];
            try {
                AccountRequirement.Value value = AccountRequirement.Value.NONE;
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.squareup.cash.clientrouting.validation.Validator
    public final ValidatorResult validate(ClientRoute clientRoute, RoutingParams routingParams) {
        String accountIdentifier;
        clientRoute.getClass();
        routingParams.getClass();
        return (WhenMappings.$EnumSwitchMapping$0[clientRoute.getSpec().getAccountRequirement().getValue().ordinal()] == 1 && ((accountIdentifier = clientRoute.getAccountIdentifier()) == null || accountIdentifier.length() == 0)) ? new ValidatorResult.NotAllowed(ValidatorResult.NotAllowed.Reason.ACCOUNT_IDENTIFIER_NOT_SUPPLIED) : ValidatorResult.Allowed.INSTANCE;
    }
}
