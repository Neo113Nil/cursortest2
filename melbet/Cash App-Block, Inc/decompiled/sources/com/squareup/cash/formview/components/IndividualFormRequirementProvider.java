package com.squareup.cash.formview.components;

import com.squareup.cash.google.pay.RealGooglePayer$createWallet$$inlined$filter$1;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes6.dex */
public interface IndividualFormRequirementProvider extends FormRequirementProvider {
    Flow isRequirementFulfilled();

    @Override // com.squareup.cash.formview.components.FormRequirementProvider
    default Flow requirements() {
        return new RealGooglePayer$createWallet$$inlined$filter$1(isRequirementFulfilled(), 23);
    }
}
