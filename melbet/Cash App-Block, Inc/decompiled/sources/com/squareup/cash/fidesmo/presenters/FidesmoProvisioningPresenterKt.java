package com.squareup.cash.fidesmo.presenters;

import com.google.android.gms.internal.mlkit_vision_common.zzlr;
import com.squareup.protos.cash.taply.app.v1.Allowed;
import com.squareup.protos.cash.taply.app.v1.ProvisioningEligibility$Decision$Allowed;

/* loaded from: classes6.dex */
public abstract class FidesmoProvisioningPresenterKt {
    public static final Allowed access$getAllowed(zzlr zzlrVar) {
        ProvisioningEligibility$Decision$Allowed provisioningEligibility$Decision$Allowed = zzlrVar instanceof ProvisioningEligibility$Decision$Allowed ? (ProvisioningEligibility$Decision$Allowed) zzlrVar : null;
        if (provisioningEligibility$Decision$Allowed != null) {
            return provisioningEligibility$Decision$Allowed.value;
        }
        return null;
    }
}
